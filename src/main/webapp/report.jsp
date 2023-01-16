<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>Lista de exames, SOC</title>
<style>
table, td, th {border: 1px solid black;}
table {border-collapse: collapse;width: 100%;}
th {height: 30px;}
.button-update {background-color: #008CBA;color: white;}
.button-delete {background-color: red;color: white;}
</style>
</head>
<body>
	<h2>Struts 2 usando JDBC, apresentação de conhecimentos em torno desta arquitetura !</h2>
	<h2>LISTA DE EXAMES !</h2>
	
	<div style="margin-top: 40px;">
		<s:if test="noData==true">
			<table>
				<thead>
					<tr style="background-color: #E0E0E1;">
						<th>cd exame</th>
						<th>Nome</th>
						<th>Detalhe</th>
						<!-- <th>ativo</th>
						
						<th>Detalhe adicional</th> -->
					</tr>
				</thead>
				<s:iterator value="beanList">
					<tr>
						<td><s:property value="cdExame" /></td>
						<td><s:property value="nmExame" /></td>
						<td><s:property value="nmExame" /></td>
						
<%-- 						<td>
							<a href="updatedetails.action?submitType=updatedata&uemail=<s:property value="nmExame"/>">
								<button class="button-update">Update</button>
							</a>
						</td>
 --%>					</tr>
				</s:iterator>
			</table>
		</s:if>
		<s:else>
			<div style="color: red;"> ---------</div>
		</s:else>
		
		<a href="usuario"><button  type="button">RETORNAR</button></a>
	</div>
</body>
</html>