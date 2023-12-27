# Gatling DemoStore Performance Testing

Este proyecto demuestra cómo realizar pruebas de rendimiento en la aplicación DemoStore utilizando Gatling y Chat-GPT. El script de prueba está escrito en Scala, utiliza Maven para la gestión de dependencias.

## Video Presentación
[![Video de Demostración](https://img.youtube.com/vi/tAoYVhh0Zbw/0.jpg)](https://www.youtube.com/watch?v=tAoYVhh0Zbw)


## Requisitos

Asegúrate de tener instalados los siguientes elementos antes de ejecutar las pruebas:

- Java: 
  - https://www.oracle.com/java/technologies/downloads/
- Maven: 
  - https://maven.apache.org/download.cgi
- Git: 
  - https://git-scm.com/downloads
- Proyecto Base: 
  - https://github.com/gatling/gatling-maven-plugin-demo-scala

## Configuración del Script

El script de simulación se encuentra en `src/main/java/demoStoreApp/SimulationDemoStoreChatGPT.java`. Puedes ajustar los parámetros según tus necesidades.

### Escenarios

- **HomePage:** Accede a la página principal de la tienda en línea.

- **LoginScenario:** Simula el inicio de sesión de un usuario con credenciales específicas.
  - User: admin
  - Pass: admin

- **CategoriesScenario:** Carga la página de categorías de productos.

- **LogoutScenario:** Simula el cierre de sesión y verifica que el usuario no esté activo.

- **CombinedScenario:** Ejecuta una secuencia combinada de los escenarios anteriores.

## Ejecución de las Pruebas

Para ejecutar las pruebas, utiliza el siguiente comando Maven:

```bash
 mvn gatling:test -Dgatling.simulationClass=demoStoreApp.SimulationDemoStoreChatGPT
```
## Chat-GPT 

- Prompt Chat-GPT / Gatling: https://chat.openai.com/share/e61d7847-92c7-4c5a-9ebc-55c9e9e86fe8

**Firma:** Rodrigo Campos Tapia [@DonTester]

**Sígueme en mis redes sociales:**

[<img src="https://simpleicons.org/icons/instagram.svg" alt="Instagram" width="24"/>](https://www.instagram.com/dontester_/) **Instagram** &nbsp; &nbsp;
[<img src="https://simpleicons.org/icons/twitter.svg" alt="Twitter" width="24"/>](https://twitter.com/DonTester_) **Twitter** &nbsp; &nbsp;
[<img src="https://simpleicons.org/icons/linkedin.svg" alt="LinkedIn" width="24"/>](https://www.linkedin.com/in/rcampostapia) **LinkedIn** &nbsp; &nbsp;
[<img src="https://simpleicons.org/icons/github.svg" alt="GitHub" width="24"/>](https://github.com/rcampos09) **GitHub** &nbsp; &nbsp;
[<img src="https://simpleicons.org/icons/youtube.svg" alt="YouTube" width="24"/>](https://www.youtube.com/@dontester) **YouTube** &nbsp; &nbsp;
[<img src="https://simpleicons.org/icons/medium.svg" alt="Medium" width="24"/>](https://medium.com/@rcampos.tapia) **Medium**
