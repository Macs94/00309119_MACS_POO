CREATE TABLE ESTUDIANTE(
	Carnet VARCHAR(8) PRIMARY KEY,
	Nombres VARCHAR(50) NOT NULL,
	Apellidos VARCHAR(50) NOT NULL,
	Edad INT NOT NULL
);

CREATE TABLE MATERIA(
	idMateria SERIAL PRIMARY KEY,
	Nombre VARCHAR(50) NOT NULL
);

CREATE TABLE INSCRIPCION(
	idInscripcion SERIAL PRIMARY KEY,
	Carnet VARCHAR(8) NOT NULL,
	idMateria INT NOT NULL
);

ALTER TABLE INSCRIPCION
ADD CONSTRAINT fk_inscripcion_materia
FOREIGN KEY (idMateria) REFERENCES MATERIA(idMateria);

ALTER TABLE INSCRIPCION
ADD CONSTRAINT fk_inscripcion_estudiante
FOREIGN KEY (Carnet) REFERENCES ESTUDIANTE(Carnet);

INSERT INTO MATERIA(Nombre) VALUES
('Programación Orientada a Objetos'),('Bases de datos'),
('Calculo II'),('Física I'),('Optativa Técnica II'),('Optativa Técnica III'),
('Optativa Técnica I'),('Optativa Humanistica I'),('Optativa Humanistica II'),
('Optativa Humanistica III');

SELECT * FROM ESTUDIANTE