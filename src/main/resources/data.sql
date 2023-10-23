-- CREATE DATABASE nextg-register-service;

CREATE TABLE role (
                                 id INT AUTO_INCREMENT PRIMARY KEY,
                                 name VARCHAR(255) NOT NULL
);

CREATE TABLE employee (
                          id INT AUTO_INCREMENT PRIMARY KEY,
                          last_name VARCHAR(255),
                          first_name VARCHAR(255),
                          username VARCHAR(255),
                          password VARCHAR(255),
                          email VARCHAR(255),
                          phone VARCHAR(20),
                          status INT,
                          role_id INT,
                          FOREIGN KEY (role_id) REFERENCES role(id)
);


INSERT INTO role (name) VALUES ('ROLE_ADMIN'), ('ROLE_USER');

INSERT INTO employee (email, username, password, role_id) VALUES ('admin@gmail.com', 'admin', '$2a$10$LkVpFhUABWzp9hMI6bX2HeR0eslhyJ5Ep/LxGq67pGTUOJPsQu/o6', 1);
-- username: admin
-- password: 123456