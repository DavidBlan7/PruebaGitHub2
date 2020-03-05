<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
	<xsl:template match="/">
		<html lang="es">
			<head>
				<title>almacén</title>
			</head>
			<body>
				<h1>Articulos del almacén</h1>
				<table >
					<caption>Productos que no son proskit</caption>
					<tr>
						<th>nombre</th>
						<th>marca</th>
						<th>precio</th>
					</tr>
					<xsl:for-each select="almacen/producto[marca!='PROSKIT']">
					<xsl:sort select = "precio" order="descending" data-type="number"/>
						<tr>
							<td><xsl:value-of select="nombre"/></td>
							<td><xsl:value-of select="marca"/></td>
							<td><xsl:value-of select="precio"/></td>
						</tr>
					</xsl:for-each>
				</table>
			</body> 
			<footer>David Blanco Álvarez</footer>
		</html>
	</xsl:template>
</xsl:stylesheet>
