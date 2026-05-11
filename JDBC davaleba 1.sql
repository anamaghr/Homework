CREATE DATABASE  school;
CREATE TABLE subjects(
id SERIAL PRIMARY KEY ,
subject_name TEXT NOT NULL
);
CREATE TABLE students (
id SERIAL PRIMARY KEY,
first_name TEXT NOT NULL,
last_name TEXT  NOT NULL,
grade INTEGER
);
CREATE TABLE teachers (
id SERIAL PRIMARY KEY,
first_name TEXT NOT NULL,
last_name TEXT NOT NULL,
subject_id INT REFERENCES subjects(id),
salary INTEGER
);