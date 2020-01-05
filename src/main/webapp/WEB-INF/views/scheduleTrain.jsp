<%@ page language="java" pageEncoding="UTF-8"%>
<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="false"%>
<html>
<head>
<title>ScheduleTrain Page</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="stylesheet" type="text/css"
	href="resources/theme/css/style.css">
</head>
<body>
	<h1>Add a ScheduleTrain</h1>

	<c:url var="addAction" value="/scheduleTrain/add"></c:url>

	<form:form action="${addAction}" commandName="scheduleTrain">
		<table>
			<c:if test="${!empty scheduleTrain.idScheduleTrain}">
				<tr>
					<td><form:label path="idScheduleTrain">
							<spring:message text="ID" />
						</form:label></td>
					<td><form:input path="idScheduleTrain" readonly="true" size="200"
							disabled="true" /> <form:hidden path="idScheduleTrain" /></td>
				</tr>
			</c:if>
			<tr>
				<td><form:label path="destinationPoint">
						<spring:message text="Destination" />
					</form:label></td>
				<td><form:input path="destinationPoint" /></td>
				<td><form:errors path="destinationPoint" /></td>
			</tr>

			<tr>
				<td><form:label path="idTrain">
						<spring:message text="Train ID" />
					</form:label></td>
				<td><form:input path="idTrain" /></td>
				<td><form:errors path="idTrain" /></td>
			</tr>
			
			<tr>
				<td><form:label path="timeTravel">
						<spring:message text="Time Travel" />
					</form:label></td>
				<td><form:input path="timeTravel" /></td>
				<td><form:errors path="timeTravel" /></td>
			</tr>
			<tr>
				<td><form:label path="price">
						<spring:message text="PRICE" />
					</form:label></td>
				<td><form:input path="price" /></td>
				<td><form:errors path="price" /></td>
			</tr>
			<tr>
				<td><form:label path="slot">
						<spring:message text="SLOT" />
					</form:label></td>
				<td><form:input path="slot" /></td>
				<td><form:errors path="slot" /></td>
			</tr>

			<tr>
				<td colspan="2"><c:if test="${!empty scheduleTrain.idScheduleTrain}">
						<input type="submit"
							value="<spring:message text="Edit ScheduleTrain"/>" />
					</c:if> <c:if test="${empty scheduleTrain.idScheduleTrain}">
						<input type="submit"
							value="<spring:message text="Add ScheduleTrain"/>" />
					</c:if></td>
			</tr>
		</table>
	</form:form>
	<br>
	<h3>Categories List</h3>
	<c:if test="${!empty listScheduleTrains}">
		<table class="tg">
			<tr>
				<th width="80">ID</th>
				<th width="150">Destination</th>
				<th width="150">Train ID</th>
				<th width="150">Time Travel</th>
				<th width="150">PRICE</th>
				<th width="150">Slot</th>
				<th width="60">Edit</th>
				<th width="60">Delete</th>
			</tr>
			<c:forEach items="${listScheduleTrains}" var="scheduleTrain">
				<tr>
					<td>${scheduleTrain.idScheduleTrain}</td>
					<td>${scheduleTrain.destinationPoint}</td>
					<td>${scheduleTrain.idTrain}</td>
					<td>${scheduleTrain.timeTravel}</td>
					<td>${scheduleTrain.price}</td>
					<td>${scheduleTrain.slot}</td>
					<td><a
						href="<c:url value='scheduleTrain/edit/${scheduleTrain.idScheduleTrain}' />">Edit</a></td>
					<td><a
						href="<c:url value='scheduleTrain/remove/${scheduleTrain.idScheduleTrain}' />"
						onclick="return confirm('Do you want delete this record ?')">Delete</a></td>
				</tr>
			</c:forEach>
		</table>
	</c:if>
</body>
</html>
