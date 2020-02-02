# Foobar

Foobar is a Python library for dealing with word pluralization.

## Installation

Use the package manager [pip](https://pip.pypa.io/en/stable/) to install foobar.

```bash
pip install foobar
```

# ESPECIFICACION TDA
## MONEDA

Cabecera: moneda, transferencia, transferenciaForm, reporte
Descripción: valores compuestos por cadenas y/o números enteros
Operaciones: 
	moneda(nombre:cadena,cantidad:entero):

	```bash
	requerimientos: cantidad>0
	efecto: creación de objeto moneda con los atributos especificados
	```
	transferencia(usuario,monedaNombre:cadena, cantidad:entero):

	```bash
	efecto: acreditación de cantidad de moneda especificada en usuario en conjunto con su descuento del monedero 	
	```
	transferenciaForm(usuario,destinatario,moneda:cadena,cantidad):
	
		```bash
		efecto: acreditación de cantidad de moneda especificada en usuario en conjunto con su descuento en cuenta del portador
			```
	reporte():
	
	```bash
		efecto: despliegue de detalle de disposición de monedas de cada acreedor de las mismas
	```

## DUEÑO

Cabecera: duenio
Descripción: valores compuestos por cadenas y/o números enteros
Operaciones: 
	duenio(usuario:cadena): 
	
	```bash
		efecto: creación de objeto dueño con los atributos especificados
	```
