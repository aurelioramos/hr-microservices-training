<h1 align="center" style="font-weight: bold;">Java Microservices Training with Spring</h1>

<p align="center">
 <a href="#tech">Technologies</a> • 
 <a href="#started">Getting Started</a> •   
 <a href="#references">References</a>
</p>

<p align="center">
    <b>Hands-on project for learning microservices with Spring Boot and Spring Cloud</b>    
</p>

This repository contains a hands-on training project for building microservices using Spring Boot, Spring Cloud, and related tools in a distributed system architecture.
It was developed based on the Udemy course [Microsserviços Java com Spring Boot e Spring Cloud](https://www.udemy.com/course/microsservicos-java-spring-cloud/) by [Nelio Alves](https://github.com/acenelio/).

The project contains some microservices concepts, including:
- ✅ Service discovery with **Eureka**
- 🔁 Routing and load balancing with **Spring Cloud Gateway**
- ⚙️ Centralized configuration using **Spring Cloud Config**
- 🔗 Inter-service communication with **OpenFeign**
- 💥 Fault tolerance with **Resilience4j**
- 🔐 Authentication and authorization with **OAuth2** and **JWT**
- 📦 Containerization with **Docker**

<h2 id="technologies">💻 Technologies</h2>

- [Spring Boot 3.4.x](https://docs.spring.io/spring-boot/)
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa)
- [H2 database](https://www.h2database.com/html/main.html)
- [Spring Cloud OpenFeign](https://spring.io/projects/spring-cloud-openfeign#overview)
- [Spring Cloud LoadBalancer](https://docs.spring.io/spring-cloud-commons/reference/spring-cloud-commons/common-abstractions.html)
- [Service Registration and Discovery](https://spring.io/guides/gs/service-registration-and-discovery)
- [Spring Cloud Circuit Breaker](https://spring.io/projects/spring-cloud-circuitbreaker)
- [Spring Cloud Gateway](https://spring.io/projects/spring-cloud-gateway)
- [Spring Cloud Config](https://docs.spring.io/spring-cloud-config/docs/current/reference/html/)
- [Spring Boot Actuator](https://docs.spring.io/spring-boot/docs/2.5.6/reference/html/actuator.html)
- [Spring Security](https://spring.io/projects/spring-security)
- [OAuth](https://oauth.net/)
- [JSON Web Token (JWT)](https://jwt.io/)
- [Docker](https://www.docker.com/)

<h2 id="started">🚀 Getting started</h2>

<h3>Prerequisites</h3>

- [Java 21](https://www.azul.com/downloads/?package=jdk#zulu)
- [Git](https://git-scm.com/downloads)
- [Docker](https://www.docker.com/) (optional, for containerization)

<h3>Running the services</h3>

Navigate into the desired project folder and run the service with:

```bash
java -jar target/my-project.jar --server.port=8083
```
Or use your IDE to run the Spring Boot main class.

<h2 id="references">📖 References</h2>

* [Nelio Alves - Curso Microsserviços Java com Spring Boot e Spring Cloud](https://github.com/acenelio/ms-course)
* [📝 How to create a Pull Request](https://www.atlassian.com/br/git/tutorials/making-a-pull-request)
* [💾 Commit pattern](https://gist.github.com/joshbuchea/6f47e86d2510bce28f8e7f42ae84c716)
* [12 factor](https://12factor.net/pt_br/)
* [Spring database initialization](https://docs.spring.io/spring-boot/how-to/data-initialization.html)
* [Spring Quick Guide on Loading Initial Data with Spring Boot](https://www.baeldung.com/spring-boot-data-sql-and-schema-sql) 
* [Resilience4j Circuit Breaker](https://resilience4j.readme.io/docs/circuitbreaker)
* [Building a Spring API Gateway with Eureka for Microservices](https://medium.com/@dinesharney/building-a-spring-api-gateway-with-eureka-for-microservices-695ed220d73b) 
* [Quick Intro to Spring Cloud Configuration](https://www.baeldung.com/spring-cloud-configuration)
* [Spring Boot Actuator](https://www.baeldung.com/spring-boot-actuators)
* [JPA Query Methods](https://docs.spring.io/spring-data/jpa/reference/jpa/query-methods.html)