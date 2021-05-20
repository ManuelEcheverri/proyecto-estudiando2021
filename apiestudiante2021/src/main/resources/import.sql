INSERT INTO tipodocumento (idTipoDocumento, nombreDocumento) values (1,'Cédula')
INSERT INTO tipodocumento (idTipoDocumento, nombreDocumento) values (2,'Tarjeta identidad')
INSERT INTO tipodocumento (idTipoDocumento, nombreDocumento) values (3,'Cédula extrangería')


INSERT INTO institucioneducativa (idinstitucioneducativa , nombreinstitucioneducativa ) values (1,'UCO')
INSERT INTO institucioneducativa (idinstitucioneducativa , nombreinstitucioneducativa ) values (2,'UdeA')

INSERT INTO usuario (id_usuario,nombre_usuario, password, enabled ) values (1,'manuel','$2a$10$CYQRCmOA1cgBOKPwyEe4JOEl2khjI332pT7qMWiDV80QYRfFqCrPW', true)
INSERT INTO usuario (id_usuario,nombre_usuario, password, enabled ) values (2,'anonimo','$2a$10$o.Cfjp2uIv3cPHkPU4JMTuugPoVSBAiZgWavJDqA4sCa0VrsbNrei', true)
INSERT INTO roles (id_rol,nombre_rol) values (1,'ROLE_ADMIN')
INSERT INTO roles (id_rol,nombre_rol) values (2,'ROLE_CONSULTA')
INSERT INTO users_authorities (id_usuario, id_rol ) values (1,1)
INSERT INTO users_authorities (id_usuario, id_rol ) values (2,2)
