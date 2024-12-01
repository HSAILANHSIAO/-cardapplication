<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>卡片申請</h3>
<s:form action="../AddCardApplicationController" method="post" theme="simple">
卡號:<s:textfield name="number"/><br>
姓名:<s:textfield name="name"/><br>
生日:<s:textfield name="birthday"/><br>
性別:<s:textfield name="gender"/><br>
身分證:<s:textfield name="indentitycard"/><br>
地址:<s:textfield name="address"/><br>
手機:<s:textfield name="phone"/><br>
時間:<s:textfield name="time"/><br>
分行:<s:textfield name="bank"/><br>
<s:submit value="ok"/>

</s:form>
</body>
</html>