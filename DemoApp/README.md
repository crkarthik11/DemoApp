
# DemoApp

Spring Boot DemoApp makes it easy to create stand-alone, production-grade Spring-based Applications that you can run. We take an opinionated view of the Spring platform and third-party libraries, so that you can get started with minimum fuss. Most Spring Boot applications need very little Spring configuration.

## 1. How to start
```
$ git clone https://github.com/crkarthik11/DemoApp.git
$ cd demoApp
$ mvnw spring-boot:run
$ curl -v localhost:8080
```

## Entities to create

### Book
 - String name
 - String  isbn_number
 - String  author
 - String category


### Admin
 - String name
 - String  username
 - String  password
 
### Student
 - String name
 - String department
 - String  username
 - String  password
 - String gender
 - String IdNumber

## APIs 

### Admin controller
 - List of admins - Must return 5 admin objects
 - Api to return single admin object
### Student controller
 - List of students - Must return 5 students objects
 - Api to return single student object

### Book controller
  - List of books -  Must return 5 books
  -  Api to return single book object

 
