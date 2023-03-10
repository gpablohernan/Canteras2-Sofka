-- 1.	Consulta SQL donde pueda obtener los productos vendidos digitando tipo de documento y número de documento.
SELECT prod.prod_nombre as Producto FROM cliente clie, producto prod, producto_cliente prod_cli
WHERE clie.clie_tipo_dni = "DNI" and clie.clie_dni = "34252967" and clie.clie_id=prod_cli.prod_cli_id_clie and prod.prod_id=prod_cli.prod_cli_id_prod;

-- 2.	Consultar productos por medio del nombre, el cual debe mostrar quien o quienes han sido sus proveedores.
 SELECT prov.prov_nombre as NombreProveedor FROM proveedor prov, producto prod
 WHERE prod.prod_nombre = "Mouse" and prov.prov_id=prod.prod_proveedor_prov_id ;


-- 3.	[PLUS no obligatorio] Crear una consulta que me permita ver qué producto ha sido el más vendido y en qué cantidades de mayor a menor.
SELECT prod.prod_nombre as Nombre_de_producto, COUNT(prod_cli.prod_cli_id_prod) as Cantidad_vendida FROM producto prod, producto_cliente prod_cli
WHERE prod_cli.prod_cli_fecha_borrado is null and prod.prod_id=prod_cli.prod_cli_id_clie 
GROUP BY prod_cli.prod_cli_id_prod
ORDER BY COUNT(prod_cli.prod_cli_id_prod) DESC;
