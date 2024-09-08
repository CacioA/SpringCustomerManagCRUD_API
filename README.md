# Customer Management  

This project was developed using Java, SpringBoot, Hibernate, JPA, Thymeleaf, MySQL.

It has full CRUD functionality and the data can be accessed either through the GUI or through an API which returns objects as JSON through Jackson. 


## To run:

#### Create the container
`docker run --name mysql-container -e MYSQL_ROOT_PASSWORD=rootpassword -e MYSQL_DATABASE=mydatabase -e MYSQL_USER=myuser -e MYSQL_PASSWORD=mypassword -p 3306:3306 -d mysql:latest`

#### Connect to the container and db

`docker exec -it mysql-container mysql -u myuser -p`

#### Create the customer table
```sql
CREATE TABLE customer (
id INT AUTO_INCREMENT PRIMARY KEY,
first_name VARCHAR(255),
last_name VARCHAR(255),
email VARCHAR(255)
);
```

#### Create the manager table
```sql
CREATE TABLE manager (
email VARCHAR(255) PRIMARY KEY,
first_name VARCHAR(255),
last_name VARCHAR(255),
password VARCHAR(255)
);
```

#### Create a customer

`http://localhost:8080/CrudApi/customers/createCustomer`

#### Go to menu for more info
`http://localhost:8080/CrudApi/v1/menu`