# EduManager

**EduManager** is a full-stack application designed to manage educational resources, including students, teachers, courses, and departments. This application is built using **Spring Boot** for the back-end and can be integrated with a front-end like **React** for a complete user experience.

---

## Features
- Manage students, teachers, courses, and departments.
- RESTful APIs for CRUD operations.
- Flexible and scalable architecture.

---

## Technologies Used

### Back-End
- **Spring Boot**
- **JPA/Hibernate** for database interaction
- **Maven** for project management

---

## Installation

### Prerequisites
- Java 17 or above
- Maven

### Steps
1. Clone the repository:
   ```bash
   git clone https://github.com/your-repo/edu-manager.git
   ```

2. Navigate to the project directory:
   ```bash
   cd edu-manager
   ```

3. Build the project:
   ```bash
   mvn clean install
   ```

4. Run the application:
   ```bash
   mvn spring-boot:run
   ```

5. Access the application:
   - API Documentation: `http://localhost:8080`

---

## API Endpoints

### Student Endpoints
- **GET /students**: Retrieve all students.
- **GET /students/{id}**: Retrieve a student by ID.
- **POST /students**: Create a new student.
- **PUT /students/{id}**: Update an existing student.
- **DELETE /students/{id}**: Delete a student.

### Teacher Endpoints
- **GET /teachers**: Retrieve all teachers.
- **GET /teachers/{id}**: Retrieve a teacher by ID.
- **POST /teachers**: Create a new teacher.
- **PUT /teachers/{id}**: Update an existing teacher.
- **DELETE /teachers/{id}**: Delete a teacher.

### Course Endpoints
- **GET /courses**: Retrieve all courses.
- **GET /courses/{id}**: Retrieve a course by ID.
- **POST /courses**: Create a new course.
- **PUT /courses/{id}**: Update an existing course.
- **DELETE /courses/{id}**: Delete a course.

### Department Endpoints
- **GET /departments**: Retrieve all departments.
- **GET /departments/{id}**: Retrieve a department by ID.
- **POST /departments**: Create a new department.
- **PUT /departments/{id}**: Update an existing department.
- **DELETE /departments/{id}**: Delete a department.

---

## Directory Structure
```
edu-manager/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── lk/mrt/cse/student/
│   │   │       ├── controller/
│   │   │       ├── entity/
│   │   │       ├── repository/
│   │   │       └── service/
│   │   └── resources/
│   │       ├── application.properties
│   │       └── data.sql
│   └── test/
├── pom.xml
└── README.md
```

---

## Future Enhancements
- Integrate a React front-end.
- Add authentication and authorization using Spring Security.
- Enhance the database with additional relationships and constraints.
- Implement reporting features.

---

## License
This project is licensed under the MIT License.

---

## Contact
For any queries or issues, please contact me at isharauditha5@gmail.com.
