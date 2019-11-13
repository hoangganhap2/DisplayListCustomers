<%--
  Created by IntelliJ IDEA.
  User: cctcr
  Date: 13/11/2019
  Time: 2:20 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Danh sách khách hàng</title>
    <style>
        table,tr,td {
            border: 1px solid dimgray;
        }
    </style>
</head>
<body>
<table>
    <tr>
        <td>Tên</td>
        <td>Tuổi</td>
        <td>Địa chỉ</td>
        <td>Ảnh</td>
    </tr>

    <c:forEach items="${customers}" var="customer">
        <tr>
            <td>${customer.getName()}</td>
            <td>${customer.getAge()}</td>
            <td>${customer.getAddress()}</td>
            <td>
                <img src="${customer.getImages()}" height="100" width="100"/>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
