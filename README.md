# CitaSalud Automation

Proyecto de automatización de pruebas para el sistema CitaSalud PQRS usando Serenity BDD y el patrón Screenplay.

## Estructura del Proyecto

```
citasalud-automation/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── co/edu/udea/certificacion/citasalud/
│   │           ├── exceptions/      # Excepciones personalizadas
│   │           ├── integrations/    # Integraciones con APIs o servicios externos
│   │           ├── interactions/    # Interacciones personalizadas de Screenplay
│   │           ├── models/          # Modelos de datos
│   │           ├── questions/       # Questions para verificaciones
│   │           ├── tasks/           # Tasks de alto nivel
│   │           ├── userinterfaces/  # Page Objects (localizadores)
│   │           └── utils/           # Utilidades
│   └── test/
│       ├── java/
│       │   └── co/edu/udea/certificacion/citasalud/
│       │       ├── runners/         # Runners de Cucumber
│       │       └── stepdefinitions/ # Step Definitions
│       └── resources/
│           ├── features/            # Archivos .feature de Gherkin
│           └── serenity.conf        # Configuración de Serenity
├── build.gradle
├── serenity.properties
└── settings.gradle
```

## Patrón Screenplay

Este proyecto utiliza el patrón Screenplay que organiza el código en:
- **Actors**: Los usuarios que interactúan con el sistema
- **Abilities**: Habilidades que tienen los actores (ej: navegar en web)
- **Tasks**: Tareas de alto nivel que un actor puede realizar
- **Interactions**: Interacciones de bajo nivel con la UI
- **Questions**: Consultas sobre el estado del sistema
- **User Interfaces**: Definición de los elementos de la UI

## Requisitos

- Java 17+
- Gradle 7.x+

## Ejecución

```bash
# Ejecutar las pruebas
gradlew clean test

# Generar reporte de Serenity
gradlew aggregate
```

## URL de la Aplicación

https://citasalud-pqrs-flow.vercel.app/

