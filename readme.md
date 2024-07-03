# Configuration Spring boot, MySql & Maven

Depuis [Spring.io](https://start.spring.io/) créer un projet Spring.

Choisir comme dépendances : 

- MySQL Driver
- Spring Web
- Spring Data JPA



## Application.properties

````
spring.datasource.url=jdbc:mysql://localhost:3306/sprig-boot-schema
spring.datasource.username=root
spring.datasource.password=
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.datasource.schema=classpath:schema.sql
spring.datasource.data=classpath:data.sql

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect