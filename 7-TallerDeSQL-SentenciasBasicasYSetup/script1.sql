-- 1.	Crear las tablas requeridas con las relaciones necesarias

CREATE SCHEMA IF NOT EXISTS taller_SQL DEFAULT CHARACTER SET utf8 ;
USE taller_SQL ;



-- -----------------------------------------------------
-- Tabla proveedor
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS proveedor (
  prov_id INT NOT NULL AUTO_INCREMENT,
  prov_nombre VARCHAR(45) NOT NULL,
  prov_fecha_borrado TIMESTAMP NULL DEFAULT NULL,
  PRIMARY KEY (prov_id))
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Tabla producto
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS producto (
  prod_id INT NOT NULL AUTO_INCREMENT,
  prod_nombre VARCHAR(45) NOT NULL,
  prod_precio DECIMAL(5,0) NOT NULL,
  prod_fecha_borrado TIMESTAMP NULL DEFAULT NULL,
  prod_proveedor_prov_id INT NOT NULL,
  PRIMARY KEY (prod_id, prod_proveedor_prov_id),
  INDEX fk_producto_proveedor1_idx (prod_proveedor_prov_id ASC) VISIBLE,
  CONSTRAINT fk_producto_proveedor1
    FOREIGN KEY (prod_proveedor_prov_id)
    REFERENCES proveedor (prov_id)
    ON DELETE RESTRICT
    ON UPDATE RESTRICT)
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Tabla cliente
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS cliente (
  clie_id INT NOT NULL AUTO_INCREMENT,
  clie_tipo_dni VARCHAR(5) NOT NULL,
  clie_dni VARCHAR(10) NOT NULL,
  clie_fecha_borrado TIMESTAMP NULL DEFAULT NULL,
  PRIMARY KEY (clie_id))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Tabla producto_cliente
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS producto_cliente (
  prod_cli_id INT NOT NULL AUTO_INCREMENT,
  prod_cli_id_prod INT NOT NULL,
  prod_cli_id_clie INT NOT NULL,
  prod_cli_producto_prod_id INT NOT NULL,
  prod_cli_cliente_clie_id INT NOT NULL,
  prod_cli_fecha_borrado TIMESTAMP NULL DEFAULT NULL,
  PRIMARY KEY (prod_cli_id),
  INDEX fk_prod_clien_producto1_idx (prod_cli_producto_prod_id ASC) VISIBLE,
  INDEX fk_prod_clien_cliente1_idx (prod_cli_cliente_clie_id ASC) VISIBLE,
  CONSTRAINT fk_prod_clien_cliente1
    FOREIGN KEY (prod_cli_cliente_clie_id)
    REFERENCES cliente (clie_id)
    ON DELETE RESTRICT
    ON UPDATE RESTRICT,
  CONSTRAINT fk_prod_clien_producto1
    FOREIGN KEY (prod_cli_producto_prod_id)
    REFERENCES producto (prod_id)
    ON DELETE RESTRICT
    ON UPDATE RESTRICT)
ENGINE = InnoDB;


-- 2.	Llenar las tablas con información previa para poder manipular la base de datos a nivel de datos.
INSERT INTO proveedor(prov_nombre)
values ("Compumundo Hiper Mega Red");
INSERT INTO proveedor(prov_nombre)
values ("Proveedor 2");
INSERT INTO proveedor(prov_nombre)
values ("Proveedor 3");
INSERT INTO proveedor(prov_nombre)
values ("Proveedor 4");
INSERT INTO proveedor(prov_nombre)
values ("Multinsumos");

INSERT INTO producto(prod_nombre, prod_precio, prod_proveedor_prov_id)
values ("Teclado", 150, 1);
INSERT INTO producto(prod_nombre, prod_precio, prod_proveedor_prov_id)
values ("Maus", 120, 2);
INSERT INTO producto(prod_nombre, prod_precio, prod_proveedor_prov_id)
values ("Web-cam", 280, 1);
INSERT INTO producto(prod_nombre, prod_precio, prod_proveedor_prov_id)
values ("Auricularess", 330, 3);
INSERT INTO producto(prod_nombre, prod_precio, prod_proveedor_prov_id)
values ("Pad", 60, 5);

INSERT INTO cliente(clie_tipo_dni, clie_dni)
values ("DNI", "34252967");
INSERT INTO cliente(clie_tipo_dni, clie_dni)
values ("LE", "5964565");
INSERT INTO cliente(clie_tipo_dni, clie_dni)
values ("DNI", "30296874");

INSERT INTO producto_cliente(prod_cli_id_prod, prod_cli_id_clie, prod_cli_producto_prod_id, prod_cli_cliente_clie_id)
values (1, 1, 1, 1);
INSERT INTO producto_cliente(prod_cli_id_prod, prod_cli_id_clie, prod_cli_producto_prod_id, prod_cli_cliente_clie_id)
values (1, 2, 1, 2);
INSERT INTO producto_cliente(prod_cli_id_prod, prod_cli_id_clie, prod_cli_producto_prod_id, prod_cli_cliente_clie_id)
values (2, 2, 2, 2);
INSERT INTO producto_cliente(prod_cli_id_prod, prod_cli_id_clie, prod_cli_producto_prod_id, prod_cli_cliente_clie_id)
values (2, 3, 2, 3);
INSERT INTO producto_cliente(prod_cli_id_prod, prod_cli_id_clie, prod_cli_producto_prod_id, prod_cli_cliente_clie_id)
values (3, 3, 3, 3);
INSERT INTO producto_cliente(prod_cli_id_prod, prod_cli_id_clie, prod_cli_producto_prod_id, prod_cli_cliente_clie_id)
values (1, 3, 1, 3);
INSERT INTO producto_cliente(prod_cli_id_prod, prod_cli_id_clie, prod_cli_producto_prod_id, prod_cli_cliente_clie_id)
values (4, 3, 4, 3);
INSERT INTO producto_cliente(prod_cli_id_prod, prod_cli_id_clie, prod_cli_producto_prod_id, prod_cli_cliente_clie_id)
values (5, 3, 5, 3);


-- 3.	Realizar dos borrados lógicos y dos borrados físicos de ventas realizadas.

DELETE FROM producto_cliente
WHERE prod_cli_id = 7;
DELETE FROM producto_cliente
WHERE prod_cli_id = 8;
UPDATE producto_cliente
SET  prod_cli_fecha_borrado = now()
WHERE prod_cli_id = 5;
UPDATE producto_cliente
SET  prod_cli_fecha_borrado = now()
WHERE prod_cli_id = 6;


-- 4.	Modificar tres productos en su nombre y proveedor que los provee.

UPDATE producto, proveedor
SET prod_nombre = 'Mouse', prov_nombre = 'Periféricos y asociados'
WHERE prod_id = 2 and prov_id = prod_proveedor_prov_id;
UPDATE producto, proveedor
SET prod_nombre = 'Webcam', prov_nombre = 'Pc, Internet y más'
WHERE prod_id = 3 and prov_id = prod_proveedor_prov_id;
UPDATE producto, proveedor
SET prod_nombre = 'Auriculares', prov_nombre = 'Artículos informáticos'
WHERE prod_id = 4 and prov_id = prod_proveedor_prov_id;

