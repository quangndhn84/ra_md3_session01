<%--
  Created by IntelliJ IDEA.
  User: This MC
  Date: 21/06/2024
  Time: 8:10 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product</title>
</head>
<body>
<%--Về đường dẫn gốc/CalculateProduct--%>
<form action="<%=request.getContextPath()%>/CalculateProduct" method="post">
    <label for="productName">Product Name</label>
    <input type="text" id="productName" name="productName"/><br>
    <label for="description">Description</label>
    <input type="text" id="description" name="description"/><br>
    <label for="price">Price</label>
    <input type="number" id="price" name="price"/><br>
    <label for="discountPercent">Discount Percent</label>
    <input type="number" id="discountPercent" name="discountPercent"/><br>
    <input type="submit" value="Calculate Discount"/>
</form>
</body>
</html>
