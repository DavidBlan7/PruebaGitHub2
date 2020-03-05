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
					<caption>Todos los productos</caption>
					<tr>
						<th>nombre</th>
						<th>marca</th>
						<th>precio</th>
						<th>stock</th>
						<th>notas</th>
					</tr>
					<xsl:for-each select="almacen/producto">
					<xsl:sort select = "cantidad" order="ascending" data-type="number"/>
						<tr>
							<td><xsl:value-of select="nombre"/></td>
							<td><xsl:value-of select="marca"/></td>
							<td><xsl:value-of select="precio"/></td>
							<td><xsl:value-of select="cantidad"/></td>
							<td>
							<xsl:choose>
								<xsl:when test="ganancia &gt;15"><span class="verde">"Posible oferta"</span></xsl:when>
								<xsl:otherwise><span class="rojo">"Precio ajustado"</span></xsl:otherwise>
							</xsl:choose>
							</td>
						</tr>
					</xsl:for-each>
				</table>
			</body> 
			<footer>David Blanco Álvarez</footer>
		</html>
	</xsl:template>
</xsl:stylesheet>
