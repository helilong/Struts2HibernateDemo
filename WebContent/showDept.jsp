<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>

<table align="center" border="1" cellspacing="0" width="500px">
 
    <tr>

        <td>部门密码</td>
        <td>部门名称</td>
        <td>修改操作</td>
        <td>删除操作</td>
    </tr>
 
    <s:iterator value="deptList" var="u">
        <tr>
            <td>${u.deptId}</td>
            <td>${u.deptName}</td>

  			<td><a href="#">修改</a></td>
            <td><a href="#">删除</a></td>

        </tr>
    </s:iterator>
</table>

</body>
</html>