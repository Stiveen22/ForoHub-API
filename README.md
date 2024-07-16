# ForoHub API

API RESTful desarrollada en Spring Boot para la gestión de tópicos académicos.

## Tecnologías Utilizadas
- Java 11
- Spring Boot
- Spring Data JPA
- MySQL
- Hibernate
- Flyway

## Configuración del Proyecto
### Requisitos Previos
- JDK 11 o superior
- MySQL 8.x
- Maven

### Configuración de la Base de Datos
Asegúrate de tener una base de datos MySQL creada y configurada. Puedes encontrar las instrucciones detalladas en `src/main/resources/application.properties`.

### Ejecución del Proyecto
1. Clona este repositorio.
2. Importa el proyecto en tu IDE como un proyecto Maven.
3. Configura tu base de datos en `application.properties`.
4. Ejecuta la aplicación desde tu IDE o usando Maven: `mvn spring-boot:run`.

## Endpoints Disponibles
- `POST /topicos`: Crea un nuevo tópico.
- `GET /topicos`: Obtiene todos los tópicos.
- `GET /topicos/{id}`: Obtiene un tópico específico por ID.
- `PUT /topicos/{id}`: Actualiza un tópico existente.
- `DELETE /topicos/{id}`: Elimina un tópico existente por ID.

## Contribución
Si quieres contribuir a este proyecto, por favor sigue los siguientes pasos:
1. Haz un fork del repositorio.
2. Crea una rama (`git checkout -b feature/Contribucion`).
3. Realiza tus cambios y haz commit de ellos (`git commit -am 'Añade función de contribución'`).
4. Haz push de tu rama (`git push origin feature/Contribucion`).
5. Abre un Pull Request.

## Licencia
Este proyecto está licenciado bajo la Licencia MIT. Consulta el archivo LICENSE para más detalles.
