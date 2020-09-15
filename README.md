
## Technologies used

Spring Boot, Hibernate, Thymeleaf, PostgreSql

## Data

Tables creating automatically.
You can run data.sql for inserting data to tables.

## URL

 With this url you can see info about subscriber:
 http://localhost:8080/api/v1/search/994773456789/3     --> '994773456789'-is a telephone and '3'- is a operator id.
 
 When you insert wrong telephone or operator id program redirect you to this url and you can add to database new subscriber:
 http://localhost:8080/api/v1/add_subscriber





