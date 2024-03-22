INSERT INTO clientes (nombre, apellido, email, create_at) VALUES ('Juan', 'Pérez', 'juan@example.com', '2024-03-13');
INSERT INTO clientes (nombre, apellido, email, create_at) VALUES ('María', 'López', 'maria@example.com', '2023-05-25');
INSERT INTO clientes (nombre, apellido, email, create_at) VALUES ('Carlos', 'González', 'carlos@example.com', '2022-07-18');
INSERT INTO clientes (nombre, apellido, email, create_at) VALUES ('Laura', 'Martínez', 'laura@example.com', '2021-11-30');
INSERT INTO clientes (nombre, apellido, email, create_at) VALUES ('Pedro', 'Sánchez', 'pedro@example.com', '2020-09-10');
INSERT INTO clientes (nombre, apellido, email, create_at) VALUES ('Ana', 'Díaz', 'ana@example.com', '2019-08-05');
INSERT INTO clientes (nombre, apellido, email, create_at) VALUES ('Miguel', 'Rodríguez', 'miguel@example.com', '2018-04-22');
INSERT INTO clientes (nombre, apellido, email, create_at) VALUES ('Sofía', 'García', 'sofia@example.com', '2017-02-14');
INSERT INTO clientes (nombre, apellido, email, create_at) VALUES ('Elena', 'Hernández', 'elena@example.com', '2016-10-07');
INSERT INTO clientes (nombre, apellido, email, create_at) VALUES ('Javier', 'Gómez', 'javier@example.com', '2015-12-01');

/* Populate tabla productos */
INSERT INTO productos (nombre, precio, create_at) VALUES('Panasonic Pantalla LCD', 259990, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES('Sony Camara digital DSC-W320B', 123490, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES('Apple iPod shuffle', 1499990, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES('Sony Notebook Z110', 37990, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES('Hewlett Packard Multifuncional F2280', 69990, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES('Bianchi Bicicleta Aro 26', 69990, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES('Mica Comoda 5 Cajones', 299990, NOW());


/* Creamos algunas facturas */
INSERT INTO facturas (descripcion, observacion, cliente_id, create_at) VALUES('Factura equipos de oficina', null, 1, NOW());

INSERT INTO item_factura (cantidad, facturas_id, productos_id) VALUES(1, 1, 1);
INSERT INTO item_factura (cantidad, facturas_id, productos_id) VALUES(2, 1, 4);
INSERT INTO item_factura (cantidad, facturas_id, productos_id) VALUES(1, 1, 5);
INSERT INTO item_factura (cantidad, facturas_id, productos_id) VALUES(1, 1, 7);

INSERT INTO facturas (descripcion, observacion, cliente_id, create_at) VALUES('Factura Bicicleta', 'Alguna nota importante!', 2, NOW());
INSERT INTO item_factura (cantidad, facturas_id, productos_id) VALUES(3, 2, 6);



-- Insertar datos en la tabla users
INSERT INTO users (email, pwd) VALUES ('account@debuggeandoieas.com', 'to_be_encoded');
INSERT INTO users (email, pwd) VALUES ('cards@debuggeandoieas.com', 'to_be_encoded');
INSERT INTO users (email, pwd) VALUES ('loans@debuggeandoieas.com', 'to_be_encoded');
INSERT INTO users (email, pwd) VALUES ('balance@debuggeandoieas.com', 'to_be_encoded');

--Insertar datos en las tabla de roles
INSERT INTO roles (role_name, description, id_user) VALUES ('ROLE_ADMIN', 'admin role', 1);      
INSERT INTO roles (role_name, description, id_user) VALUES ('ROLE_ADMIN', 'admin role', 2); 
INSERT INTO roles (role_name, description, id_user) VALUES ('ROLE_USER', 'user role', 3); 
INSERT INTO roles (role_name, description, id_user) VALUES ('ROLE_USER', 'user role', 4); 