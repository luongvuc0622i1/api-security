INSERT INTO role (name) VALUES ('ROLE_ADMIN'), ('ROLE_USER');

INSERT INTO employee (email, username, password, role_id) VALUES ('admin@gmail.com', 'admin', '$2a$10$LkVpFhUABWzp9hMI6bX2HeR0eslhyJ5Ep/LxGq67pGTUOJPsQu/o6', 1);
-- username: admin
-- password: 123456