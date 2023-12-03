package demoStoreApp

import io.gatling.core.Predef._
import io.gatling.http.Predef._


class SimulationDemoStoreChatGPT extends Simulation{

  val httpConf = http.baseUrl("https://demostore.gatling.io")

  val homePage = scenario("eCommerce DemoStore")
    .exec(http("Home Page")
      .get("/")
    .check(status.is(200)))

    .pause(1)
  val loginScenario = scenario("Login Scenario")
    .exec(http("LoadLoginPage")
      .get("/login")
      .check(css("input[name=_csrf]", "value").saveAs("csrfToken")))

    .exec(http("PerformLogin")
      .post("/login")
      .formParam("username", "admin")
      .formParam("password", "admin")
      .formParam("_csrf", "${csrfToken}")
      .check(status.is(200))
      .check(substring("Hi, admin").exists))

  val categoriesAll = scenario("Categories")
    .exec(http("Categories All")
      .get("/category/all")
      .check(status.is(200)))

  val logoutScenario = scenario("Logout Scenario")
    .exec(http("Logout")
      .get("/logout")
      .check(status.is(500)))

  val combinedScenario = scenario("Combined Scenario")
    .exec(homePage)
    .pause(1)
    .exec(loginScenario)
    .pause(1)
    .exec(categoriesAll)
    .pause(1)
    //.exec(logoutScenario)

  setUp(
    combinedScenario.inject(atOnceUsers(1))
  ).protocols(httpConf)

}
