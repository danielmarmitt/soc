<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>soc</title>
<style type="text/css">
.button-register {background-color: green;color: white;}
.button-report {background-color: #000000;color: white;margin-left: 30%;}
</style>
</head>
<body>
	<h2>Struts 2 usando JDBC, apresentação de conhecimentos em torno desta arquitetura !</h2>
	
	
	<s:form action="usuario.action" method="post">
		<s:textfield label="login" name="nmlogin" />
		<s:textfield label="Senha" name="dssenha" />
		<s:submit cssClass="button-register" value="Incluir novo usuário" />
	</s:form>
	<s:if test="ctr>0">
		<span style="color: green;"><s:property value="msg" /></span>
	</s:if>
	<s:else>
		<span style="color: red;"><s:property value="msg" /></span>
	</s:else>
	<a href="relatorio"><button class="button-report" type="button">Lista de exames</button></a>
</body>
</html>