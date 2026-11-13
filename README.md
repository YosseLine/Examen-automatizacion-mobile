# QAInnovationLab — Appium Android Java (Cucumber)

Automation Team / Con fines educativos — automatización mobile Android con
**Appium + Java + Cucumber**.


---
## Links
### Link video: https://drive.google.com/file/d/1E8Lk8Jaqpg2UcdkKTcrxsGUryUKm7UVr/view?usp=sharing
### Link reporte de pruebas: https://drive.google.com/file/d/1e1rHmPIRdfAUHMGlqxiETlTAfNZ_9pb3/view?usp=sharing
---

## Arquitectura del proyecto

```
src/main/java/com/nttdata/
├── screens/
│   ├── AppConfigScreen.java       → UNICA clase que levanta/cierra la app (cualquier app)
│   └── SauceLabsLoginScreen.java  → Solo interaccion con la pantalla de login de Sauce Labs
├── steps/
│   ├── AppConfigSteps.java        → Caso de uso generico: iniciar / cerrar / screenshot
│   └── SauceLabsLoginSteps.java   → Caso de uso: escribir usuario, clave, click login, validar
└── support/
    └── ScreenshotAttacher.java    → Utilidad para adjuntar evidencias a Cucumber

src/test/java/com/nttdata/
├── stepsdefinitions/
│   ├── AppConfigStepsDefs.java    → Step GENERICO: "ingreso al aplicativo" / "cierro el aplicativo"
│   └── SauceLabsStepDefs.java     → Steps especificos del login (usuario, clave, LOGIN, validar)
├── hooks/Hooks.java                → @Before / @After globales (logs + screenshot final)
└── runners/CucumberTestSuite.java → Runner JUnit + Cucumber

src/test/resources/
├── config/
│   ├── saucelabs.properties               → Capabilities de la app Sauce Labs
│   └── plantilla-nueva-app.properties.example → Plantilla para agregar una app nueva
└── features/
    └── SauceLabs.feature
---

## Requisitos

- Java 21
- Maven
- Appium Server corriendo en `http://127.0.0.1:4723/`
- Un emulador/dispositivo Android disponible (revisa `udid` en
  `saucelabs.properties`)



