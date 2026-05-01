CREATE TABLE students (
id SERIAL PRIMARY KEY,
first_name TEXT NOT NULL,
last_name TEXT NOT NULL,
dob DATE NOT NULL,
enrollment_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
grade INTEGER CHECK (grade >= 1 AND grade <= 12),
email TEXT UNIQUE
);
INSERT INTO students (first_name, last_name, dob, grade, email)
VALUES
('fff', 'df','2010-06-07',6, 'fffdf@gmail.com'),
('wedd', 'dd','2009-09-01', 8,'wedddd@gmail.com'),
('kjhb', 'gfg','2010-10-13',5, 'kjhbgfg@gmail.com'),
('data', 'sdcjh','2008-03-07',7, 'datasdcjh@gmail.com'),
('ghvgv', 'dc','2011-12-30',3, 'ghvgvdc@gmail.com');
UPDATE students
SET grade = grade + 1
WHERE grade = 6;
DELETE FROM students
WHERE first_name = 'data';