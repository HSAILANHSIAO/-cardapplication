<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@taglib prefix="s" uri="/struts-tags" %>   

    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>信用卡資料登入</h3>
<s:form action="LoginController" method="post" theme="simple">
卡號:<s:textfield name="number"/><br>
身分證:<s:textfield name="indentitycard"/><br>
<s:submit value="ok"/>


</s:form>
</body>
</html>