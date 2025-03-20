# Hibernate and Spring Data JPA

## Description
The **Hibernate and Spring Data JPA** project is designed to demonstrate the integration of Hibernate ORM with Spring Data JPA. It includes various entity relationships, repository usage, and database operations using MySQL.

## Features
- **Entity Mapping**: Implements One-to-One, One-to-Many, and Many-to-Many relationships.
- **Spring Data JPA Repositories**: Simplifies database interactions.
- **CRUD Operations**: Provides API endpoints for creating, reading, updating, and deleting records.
- **Database Integration**: Uses **MySQL** as the database.

## Tech Stack
- **Backend**: Spring Boot, Hibernate, Spring Data JPA
- **Database**: MySQL
- **Build Tool**: Maven
- **IDE**: IntelliJ IDEA
- **Version Control**: GitHub

## Project Structure
```
Hibernate_And_Spring_Data_JPA/
│── src/
│   ├── main/java/com/example/hibernate/
│   │   ├── entity/        # Entity classes
│   │   ├── repository/    # Repository interfaces
│   │   ├── service/       # Business logic layer
│   │   ├── controller/    # REST API controllers
│   ├── main/resources/
│   │   ├── application.properties  # Database configurations
│── pom.xml  # Maven dependencies
│── README.md  # Project documentation
```

## Installation & Setup
1. **Clone the repository:**
   ```sh
   git clone https://github.com/VaishnaviRSawant/Hibernate_And_Spring_Data_JPA.git
   ```
2. **Navigate to the project directory:**
   ```sh
   cd Hibernate_And_Spring_Data_JPA
   ```
3. **Configure the database in `application.properties`:**
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/hibernate_db
   spring.datasource.username=root
   spring.datasource.password=your_password
   spring.jpa.hibernate.ddl-auto=update
   ```
4. **Run the application:**
   ```sh
   mvn spring-boot:run
   ```

## API Endpoints
| Endpoint | Method | Description |
|----------|--------|-------------|
| `/entities` | GET | Get all entities |
| `/entities/{id}` | GET | Get an entity by ID |
| `/entities` | POST | Add a new entity |
| `/entities/{id}` | PUT | Update an entity |
| `/entities/{id}` | DELETE | Delete an entity |

## Contributions
Feel free to contribute by creating issues or submitting pull requests!

## License
This project is **MIT Licensed**.

## Author
[Vaishnavi R Sawant](https://github.com/VaishnaviRSawant)

