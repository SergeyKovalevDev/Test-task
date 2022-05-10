DROP TABLE employee;

CREATE TABLE employee (
	id serial PRIMARY KEY,
	position varchar(50),
	firstname varchar(200),
	surname varchar(200),
	patronymic varchar(200),
	dateOfEmployment date,
	description TEXT
);