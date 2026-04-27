CREATE DATABASE School;
CREATE TABLE Teachers(
id BEGINT,
first_name TEXT,
last_name TEXT,
hire_date DATE,
email TEXT
);
INSERT INTO Teachers (id,first_name, last_name,hire_date,email) VALUES
(1, 'fff', 'df','2019-06-07', 'fffdf@gmail.com'),
(2, 'wedd', 'dd','2009-09-01', 'wedddd@gmail.com'),
(3, 'kjhb', 'gfg','2010-10-13', 'kjhbgfg@gmail.com'),
(4, 'kjh', 'sdcjh','2005-03-07', 'kjhsdcjh@gmail.com'),
(5, 'ghvgv', 'dc','2011-12-30', 'ghvgvdc@gmail.com');
SELECT *
From Teachers
WHERE hire_date > '2009-12-31';
ALTER TABLE Teachers
ADD COLUMN department TEXT;
ALTER TABLE Teachers
RENAME COLUMN email TO contact_email;
SELECT first_name, contact_email
FROM Teachers
WHERE hire_date NOT BETWEEN '2015-01-01' AND '2018-12-31';

