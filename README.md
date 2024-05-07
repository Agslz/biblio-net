## Biblio Net

Bilbio Net es una aplicación completa que permite a los usuarios gestionar sus colecciones de libros y participar en una comunidad de entusiastas de los libros. Ofrece características como registro de usuario, validación de correo electrónico segura, gestión de libros (incluyendo creación, actualización, compartición y archivado), préstamo de libros con verificación de disponibilidad, funcionalidad de devolución de libros y aprobación de devoluciones de libros. La aplicación garantiza la seguridad utilizando tokens JWT y sigue las mejores prácticas en el diseño de API REST. El backend está construido con Spring Boot 3 y Spring Security 6, mientras que el frontend está desarrollado utilizando Angular con Bootstrap para el estilo.

## Características

- **Registro de Usuario:** Los usuarios pueden registrarse para obtener una nueva cuenta.
- **Validación de Correo Electrónico:** Las cuentas se activan mediante códigos de validación de correo electrónico seguros.
- **Autenticación de Usuario:** Los usuarios existentes pueden iniciar sesión en sus cuentas de forma segura.
- **Gestión de Libros:** Los usuarios pueden crear, actualizar, compartir y archivar sus libros.
- **Préstamo de Libros:** Implementa comprobaciones necesarias para determinar si un libro se puede prestar.
- **Devolución de Libros:** Los usuarios pueden devolver libros prestados.
- **Aprobación de Devolución de Libros:** Funcionalidad para aprobar devoluciones de libros.

## Imagenes del proyecto

#### Diagrama de clases

![image](https://github.com/Agslz/book-social-network/assets/83142033/36824e68-a550-4557-bee8-e3db97cfcb43)

#### Diagrama Spring security 

![image](https://github.com/Agslz/book-social-network/assets/83142033/2338f7bd-b734-4fe7-9abb-a86f696440d2)

#### Diagrama Backend pipeline

![image](https://github.com/Agslz/book-social-network/assets/83142033/f0d446d6-d88a-4110-a362-fe594e6b6c38)

### Diagrama Keycloak security

![imagen](https://github.com/Agslz/biblio-net/assets/83142033/aa781be3-3658-4ee6-80ee-643185c010b4)


## Tecnologías Utilizadas

### Backend (biblio-net)

- Spring Boot 3
- Spring Security 6
- Autenticación con Tokens JWT
- Spring Data JPA
- JSR-303 y Validación de Spring
- Documentación con OpenAPI y Swagger UI
- Docker
- GitHub Actions
- Keycloak

### Frontend (biblio-net-ui)

- Angular
- Arquitectura Basada en Componentes
- Carga Perezosa (Lazy Loading)
- Guardia de Autenticación
- Generador de OpenAPI para Angular
- Bootstrap

## Utilizar proyecto

Para comenzar con el proyecto BiblioNet, sigue las instrucciones de configuración en los directorios respectivos:

- [Instrucciones de Configuración del Backend](https://github.com/Agslz/book-social-network/blob/main/book-network/README.md)
- [Instrucciones de Configuración del Frontend](https://github.com/Agslz/book-social-network/blob/main/book-network-ui/README.md)

## Licencia

Este proyecto está licenciado bajo la [Licencia Apache 2.0](LICENSE). Consulta el archivo LICENSE para más detalles.

## Agradecimientos

Agradecimientos especiales a [Ali BouAli](https://www.youtube.com/@BoualiAli) por su inspiración y enseñanzas en la realización de este proyecto.

Puedes encontrar más información sobre Ali BouAli en sus perfiles de redes sociales:
- [YouTube](https://www.youtube.com/@BoualiAli)
- [LinkedIn](https://www.linkedin.com/in/bouali-ali-33026072/)

