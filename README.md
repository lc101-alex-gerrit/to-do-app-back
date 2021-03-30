# REST API Demo Back End

## Part 1

- Create a new schema in MySQL and setup a user account for the schema
- Download starter project from start.spring.io with
  - `group: io.github.lc101-alex-gerrit`
  - Sprint Boot DevTools
  - Spring Web
  - Spring Data JPA
  - MySQL Driver
  - Validation
- Initialize local git repo for the project and make initial commit
- Add to `.gitignore`
    ```
    ### System Files ###
    .DS_Store
    Thumbs.db
    ```
- Configure database connection
  - `application.properties`
    ```
    #########################################
    ### Database Configuration Properties ###

    # Database connection settings
    spring.datasource.url=jdbc:mysql://${APP_DB_HOST}:${APP_DB_PORT}/${APP_DB_NAME}?serverTimezone=UTC
    spring.datasource.username=${APP_DB_USER}
    spring.datasource.password=${APP_DB_PASS}

    # Specify the type of database
    spring.jpa.database = MYSQL
    spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.MySQL8Dialect

    # Automatic table management options (none, update, create, create-drop)
    spring.jpa.hibernate.ddl-auto = update

    # Show sql query in log
    spring.jpa.show-sql = false

    ########################################
    ### General Configuration Properties ###

    # Include stacktrace in server error response
    server.error.include-stacktrace = never
    ```
  - Set Environmental Variables
    ```
    APP_DB_HOST=localhost;APP_DB_PORT=3306;APP_DB_NAME=to-do-app;APP_DB_USER=to-do-app;APP_DB_PASS=dem0Day1
    ```
- Create `Task` entity and infrastructure
  - new package `task`
  - new Java class `Task`
    - `id`
    - `title`
    - `description`
  - new Java interface `TaskRepository`
  - new Java class `TaskController`
    - `@GetMapping` to `getTaskById()`
      ```
      INSERT INTO task (id, title, description) VALUES (1,"First Task","Very important do not forget to do this!");
      ```
    - `@PostMapping` to `addNewTask()`

## Part 2

- add endpoint to get all tasks

## Part 3

- add edit/update feature
- add delete feature
