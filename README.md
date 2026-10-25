# Small Business Tracker

A university coursework project developed independently in 2024. This Spring Boot web application provides a simple product inventory workflow, with multilingual pages and an embedded demonstration database.

## Features

- Add, view, edit and delete products
- Maintain product names, prices, dates, descriptions and categories
- Validate form input with Bean Validation
- Switch interface text among English, Turkish and German
- Store sample records in an in-memory H2 database

## Technology

Java 17, Spring Boot 2.7.18, Spring MVC, Thymeleaf, Spring Data JPA, H2, Maven, Bootstrap.

## Run locally

**Prerequisites:** JDK 17 and internet access for the first Maven dependency download. The included Maven Wrapper can download the configured Maven distribution.

```bash
# macOS/Linux
./mvnw spring-boot:run
# Windows PowerShell
.\mvnw.cmd spring-boot:run
```

Visit **http://localhost:8080/products**. Data is recreated when the application restarts. The H2 console is disabled by default. The sample records are in `src/main/resources/data.sql`.

Run the tests with `./mvnw test` (or `.\mvnw.cmd test` on Windows).

## Project structure

- `src/main/java/.../controller` — product HTTP requests
- `src/main/java/.../model` — JPA product entity
- `src/main/java/.../repository` — Spring Data repository
- `src/main/resources/templates` — Thymeleaf pages
- `src/main/resources/messages*.properties` — translations

## Background and limitations

This repository restores and tidies the **original 2024 coursework source**, rather than claiming to be a production-grade system. It is a server-rendered local demo, not a deployed service. The original design uses an H2 in-memory database and a basic UI; it has no authentication or authorization and is **not appropriate for public deployment** without additional work. No automated UI/end-to-end test coverage is claimed.

## Repository preparation changes

For a clearer public educational repository, the following small changes were made after the original coursework:

- Removed committed build outputs and IDE metadata
- Replaced a hard-coded sample database password with H2's standard local demo configuration
- Disabled H2 console by default
- Aligned schema creation and seed-data initialization settings
- Corrected the edit form submission route and assigned the edited record ID explicitly
- Changed product deletion from an HTTP GET link to a POST form
- Corrected the stylesheet link

These changes are documented to distinguish the published version from the original submission.
