<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<table  border='1' cellspacing='0'>
    <tr>
        <td>id</td>
        <td>name</td>
        <td>sex</td>
    </tr>
    <tr>
        <td>${user.id}</td>
        <td>${user.name}</td>
        <td>${user.sex}</td>
    </tr>
</table>