#ESPECIFICACION TDA
##MONEDA

Cabecera: moneda, transferencia, transferenciaForm, reporte
Descripción: valores compuestos por cadenas y/o números enteros
Operaciones: 
	moneda(nombre:cadena,cantidad:entero): 
		requerimientos: cantidad>0
		efecto: creación de objeto moneda con los atributos especificados
	transferencia(usuario,monedaNombre:cadena, cantidad:entero)
		efecto: acreditación de cantidad de moneda especificada en usuario en conjunto con su descuento del monedero 		              								transferenciaForm(usuario,destinatario,moneda:cadena,cantidad):
		efecto: acreditación de cantidad de moneda especificada en usuario en conjunto con su descuento en cuenta del portador
	reporte():
		efecto: despliegue de detalle de disposición de monedas de cada acreedor de las mismas

##DUEÑO

Cabecera: duenio
Descripción: valores compuestos por cadenas y/o números enteros
Operaciones: 
	duenio(usuario:cadena): 
		efecto: creación de objeto dueño con los atributos especificados
