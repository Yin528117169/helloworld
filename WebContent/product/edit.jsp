<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8" isELIgnored="false"%>

<%@ taglib prefix="s" uri="/struts-tags"%>

<html>
<body>
    <form>
        <table>
            <tr>
                <td>name:</td>	
                <td><input type="text" name="product.name"></td>
            </tr>
            <tr>
                <td>price:</td>	
                <td><input type="text" name="product.price"></td>
            </tr>
            <tr colspan="2" align="center" >
                <input type="hidden" name="product.id" value="${product.id }">
                <input type="submit" value="submit">
            </tr>
        </table>
    </form>
</body>
</html>