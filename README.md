# spring-boot-flyway

Flyway is a database migration tool.

It has supported spring boot bean configuration and command line.

* if you want to implement Flyway in a production database and project , don't forget to put this line in your configuration as it's mentioned in application.properties -> `spring.flyway.baseline-on-migrate=true` and don't forget to test it in a develop environment .

All Flyway migration files are in this path -> `src/main/resources/db/migration`


This project implements following cases from Flyway :

1- create table (`V1__math.sql`)

2- alter table in new version of migration (`V2__alter_math.sql`)

3- create stored procedure, funtion and event (`R__sp_get_all_plus.sql`, `R__fn_plus.sql`, `R__e_reset_math.sql`)


More information and documention about Flyway is in following link -> https://flywaydb.org/documentation
