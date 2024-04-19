# Book Social Network - Backend

## Visión general

El backend del proyecto Book Social Network es responsable de manejar todas las operaciones del lado del servidor,
incluida la autenticación de usuarios, la gestión de libros y los puntos finales de la API. Esta sección proporciona una
visión general de la arquitectura del backend, las tecnologías utilizadas y las instrucciones de configuración.

## Tecnologías Utilizadas

- **Spring Boot 3:** Un potente framework para construir aplicaciones basadas en Java.
- **Spring Security 6:** Proporciona mecanismos de autenticación y autorización para asegurar la aplicación.
- **Autenticación con Tokens JWT:** Garantiza la comunicación segura entre el cliente y el servidor.
- **Spring Data JPA:** Simplifica el acceso a datos y la persistencia utilizando la Java Persistence API.
- **JSR-303 y Validación de Spring:** Permite la validación de objetos basada en anotaciones.
- **Documentación con OpenAPI y Swagger UI:** Genera documentación para los puntos finales de la API.
- **Docker:** Facilita la contenerización de la aplicación backend para el despliegue.

## Instrucciones de Configuración

Para configurar el backend del proyecto Book Social Network, sigue estos pasos:

1. Clona el repositorio:

``git clone https://github.com/Agslz/book-social-network.git``

2. Correr el archivo docker-compose.yml

``docker-compose up -d``

3. Ir hacia el directorio de book-social-network

``cd book-social-network``

4. Instalas las dependencias (asumiendo que tienes maven instalado)

``mvn clean install``

5. Ejecuta la aplicación, pero primero reemplaza ``x.x.x`` con la versión actual del archivo pom.xml.

`` java -jar target/book-network-api-x.x.x.jar``

6. Ingresa a al documentación de la API utilizando Swagger UI

Abre el navegador y dirigete hacia ``http://localhost:8088/swagger-ui/index.html``








