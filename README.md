# spring-boot-todo
Simple todo app in Spring Boot using Thymeleaf and MySQL database.

#Dockerfile for MySQL
FROM mysql
LABEL AUTHOR="Hiten Pratap Singh <hiten@techcret.com>"
ENV MYSQL_ROOT_PASSWORD=Test-123
ENV MYSQL_DATABASE=spring_todo_mvc
EXPOSE 3308
RUN usermod -u 1000 mysql
RUN mkdir -p /var/run/mysqld
RUN chmod -R 777 /var/run/mysqld
RUN sed -i -e"s/^bind-address\s*=\s*127.0.0.1/bind-address = 0.0.0.0/" /etc/mysql/my.cnf