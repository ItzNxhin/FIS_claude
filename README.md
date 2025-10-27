# FIS Claude - Hello World Projects

Este repositorio contiene proyectos de ejemplo "Hello World" en diferentes lenguajes de programación.

## Contenido

- [Proyecto Python](#proyecto-python)
- [Proyecto Java Maven](#proyecto-java-maven)

---

## Proyecto Python

Un script simple de Python que imprime "Hello World".

### Estructura
```
hello_world.py
```

### Requisitos
- Python 3.x

### Ejecución
```bash
python hello_world.py
```

### Salida esperada
```
Hello World
```

---

## Proyecto Java Maven

Un proyecto Maven completo con una aplicación Java que imprime "Hello World".

### Estructura del Proyecto
```
.
├── pom.xml
└── src/
    ├── main/
    │   └── java/
    │       └── com/
    │           └── example/
    │               └── HelloWorld.java
    └── test/
        └── java/
```

### Requisitos
- Java 11 o superior
- Maven 3.x (opcional para compilación)

### Configuración del Proyecto

El proyecto está configurado con:
- **GroupId**: com.example
- **ArtifactId**: hello-world
- **Versión**: 1.0-SNAPSHOT
- **Java Version**: 11

### Ejecución

#### Opción 1: Con Maven
```bash
# Compilar y ejecutar
mvn clean compile exec:java

# Solo compilar
mvn clean compile
```

#### Opción 2: Con javac (sin Maven)
```bash
# Compilar
javac src/main/java/com/example/HelloWorld.java

# Ejecutar
java -cp src/main/java com.example.HelloWorld
```

### Salida esperada
```
Hello World
```

---

## Autor

Este repositorio fue creado con la asistencia de Claude Code.

## Licencia

Este proyecto es de código abierto y está disponible para uso educativo.
