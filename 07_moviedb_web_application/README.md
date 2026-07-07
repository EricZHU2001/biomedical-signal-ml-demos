# MovieDB Web Application

MovieDB is a Java Spring MVC web application for browsing and analysing movie rating data. The application combines a MySQL-backed data layer, server-side controllers, JSP views, and JavaScript visualisations.

## What This Project Shows

- Java Spring MVC backend structure
- MySQL schema setup and CSV data import
- Data-backed search, ranking, and report endpoints
- JSP, Bootstrap, jQuery, and Chart.js interface components
- Local Tomcat WAR deployment and environment debugging

## Local Deployment

The application expects a MySQL database named `moviedb` and an application user:

```sql
CREATE USER IF NOT EXISTS 'moviedb_app'@'127.0.0.1' IDENTIFIED BY 'moviedb_local';
GRANT ALL PRIVILEGES ON moviedb.* TO 'moviedb_app'@'127.0.0.1';
FLUSH PRIVILEGES;
```

Import the schema and CSV data from the `sql/` and `csv/` folders, then build and deploy the WAR to Tomcat.

After Tomcat starts, open:

```text
http://localhost:8080/moviedb/homepage.html
```

## Notes

This repository is maintained as a sanitized portfolio version of a database-backed web application. The focus is on demonstrating practical backend, database, deployment, and interface-building skills.



