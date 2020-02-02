{\rtf1\ansi\ansicpg1252\cocoartf1504\cocoasubrtf820
{\fonttbl\f0\fnil\fcharset0 HelveticaNeue;}
{\colortbl;\red255\green255\blue255;\red53\green53\blue53;}
{\*\expandedcolortbl;;\cssrgb\c27059\c27059\c27059;}
\margl1440\margr1440\vieww18800\viewh8400\viewkind0
\deftab560
\pard\pardeftab560\slleading20\partightenfactor0

\f0\fs24 \cf2 MONEDA\
\
Cabecera: moneda, transferencia, transferenciaForm, reporte\
Descripci\'f3n: valores compuestos por cadenas y/o n\'fameros enteros\
Operaciones: \
	moneda(nombre:cadena,cantidad:entero): \
		requerimientos: cantidad>0\
		efecto: creaci\'f3n de objeto moneda con los atributos especificados\
	transferencia(usuario,monedaNombre:cadena, cantidad:entero)\
		efecto: acreditaci\'f3n de cantidad de moneda especificada en usuario en conjunto con su descuento del monedero 		              								transferenciaForm(usuario,destinatario,moneda:cadena,cantidad):\
		efecto: \cf2 acreditaci\'f3n de cantidad de moneda especificada en usuario en conjunto con su descuento en cuenta del portador\cf2 \
	reporte():\
		efecto: despliegue de detalle de disposici\'f3n de monedas de cada acreedor de las mismas\
\pard\pardeftab560\slleading20\pardirnatural\partightenfactor0
\cf2 \
\pard\pardeftab560\slleading20\partightenfactor0
\cf2 DUE\'d1O\
\pard\pardeftab560\slleading20\pardirnatural\partightenfactor0
\cf2 \
\pard\pardeftab560\slleading20\partightenfactor0
\cf2 Cabecera: duenio\
Descripci\'f3n: \cf2 valores compuestos por cadenas y/o n\'fameros enteros\cf2 \
Operaciones: \
	duenio(usuario:cadena): \cf2 \
		efecto: creaci\'f3n de objeto due\'f1o con los atributos especificados\cf2 \
}