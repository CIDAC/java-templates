# Spring Boot Web

This documentation helps you to set up a Spring Boot Web Application.

## 1. Setting up Development Environment

### 1.1 Creating a project from a template

Choose a different directory from this template project and execute the following command:

```sh
lazybones create --with-git <template name> <template version> <target directory>
```

So if you wanted to create a new project based on spring-boot-web template in a new 'myspringbootwebapp' directory you would run:

```sh
lazybones create --with-git spring-boot-web 0.6 yourspringbootwebapp
```

Note: Do not use the **lazybones create command** passing names with the character "-". So, names like my-spring-boot-web-app **are not alowed**.

> **Note:**
In the application creation process you will need to choose the Platform as a Service that you need to use.
>

### 1.2 Building the application & Docker image

```sh
cd yourspringbootwebapp
gradle build
```

### 1.3 Development commands and tips

If you want tips asnd more information about the development enviroment take a look at this [link]
(https://github.com/CIDAC/java-templates/blob/master/templates/spring-boot-web/doc/DEVELOPMENT.md)

## 2. Running the application

### 2.1 Running the application in development environment containers

To run the development environment containers run:

```sh
docker-compose up --build app
```

To stop the containers run:

```sh
docker-compose down
```

**What happens:**

1. Starts Postgresql and waits up to 15 seconds for it to finish ([using wait-for-it](https://github.com/vishnubob/wait-for-it))
2. Starts Spring boot application which populates database with some test data

#### 2.1.2 Testing the Application

> Navigate to <http://localhost:8080> and you should see:

```json
[{"id":1,"name":"A"},{"id":2,"name":"B"},{"id":3,"name":"C"}]
```

> Navigate to <http://localhost:5050> and you should see the Pgadmin home page. To connect to the database you need to pass your IP address for the Host.

### 2.2 Running the application in test environment container

To run the test environment container run:

```sh
docker-compose up --build test
```

To stop the container run:

```sh
docker-compose down
```