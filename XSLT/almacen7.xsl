<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
	<xsl:template match="/">
		<html lang="es">
			<head>
				<title>almacén</title>
			</head>
			<body>
				<h1>Articulos del almacén</h1>
				<ul>
					<xsl:for-each select="almacen/producto">
							<xsl:choose>
								<xsl:when test="marca = 'ACCESA'"><li class="verde"><xsl:value-of select="nombre"/></li></xsl:when>
								<xsl:otherwise><li ><xsl:value-of select="nombre"/></li></xsl:otherwise>
							</xsl:choose>
					</xsl:for-each>
				</ul>		
			</body> 
			<footer>David Blanco Álvarez</footer>
		</html>
	</xsl:template>
</xsl:stylesheet>
