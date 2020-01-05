<%@ page language="java" pageEncoding="UTF-8"%>
<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="false"%>
<html>
<head>
<title>Ticket Page</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="stylesheet" type="text/css"
	href="resources/theme/css/style.css">
</head>
<body>
	<h1>Add a Ticket</h1>

	<c:url var="addAction" value="/ticket/add"></c:url>

	<form:form action="${addAction}" commandName="ticket">
		<table>
			<c:if test="${!empty ticket.idTicket}">
				<tr>
					<td><form:label path="idTicket">
							<spring:message text="ID" />
						</form:label></td>
					<td><form:input path="idTicket" readonly="true" size="200"
							disabled="true" /> <form:hidden path="idTicket" /></td>
				</tr>
			</c:if>
			<tr>
				<td><form:label path="idScheduleTrain">
						<spring:message text="Lịch Trình" />
					</form:label></td>
				<td><form:select path="idScheduleTrain">
						<form:options items="${listScheduleTrains}"
							itemValue="idScheduleTrain" itemLabel="idScheduleTrain" />
					</form:select></td>
				<td><form:errors path="idScheduleTrain" /></td>
			</tr>

			<tr>
				<td><form:label path="idCustomer">
						<spring:message text="Khach Hang" />
					</form:label></td>
				<td><form:select path="idCustomer">
						<form:options items="${listCustomers}"
							itemValue="idCustomer" itemLabel="nameCustomer" />
					</form:select></td>
				<td><form:errors path="idCustomer" /></td>
			</tr>
			
			<tr>
				<td><form:label path="idSlot">
						<spring:message text="Vị Trí Ngồi" />
					</form:label></td>
				<td><form:input path="idSlot" /></td>
				<td><form:errors path="idSlot" /></td>
			</tr>
			<tr>
				<td colspan="2"><c:if test="${!empty ticket.idTicket}">
						<input type="submit"
							value="<spring:message text="Edit Ticket"/>" />
					</c:if> <c:if test="${empty ticket.idTicket}">
						<input type="submit"
							value="<spring:message text="Add Ticket"/>" />
					</c:if></td>
			</tr>
		</table>
	</form:form>
	<br>
	<h3> List</h3>
	<c:if test="${!empty listTickets}">
		<table class="tg">
			<tr>
				<th width="80">ID</th>
				<th width="150">Lịch Trình</th>
				<th width="150">Khách Hàng</th>
				<th width="150">Vị Trí Ngồi</th>
				<th width="60">Edit</th>
				<th width="60">Delete</th>
			</tr>
			<c:forEach items="${listTickets}" var="ticket">
				<tr>
					<td>${ticket.idTicket}</td>
					<td>${ticket.idScheduleTrain}</td>
					<td>${ticket.idCustomer}</td>
					<td>${ticket.idSlot}</td>
					<td><a
						href="<c:url value='ticket/edit/${ticket.idTicket}' />">Edit</a></td>
					<td><a
						href="<c:url value='ticket/remove/${ticket.idTicket}' />"
						onclick="return confirm('Do you want delete this record ?')">Delete</a></td>
				</tr>
			</c:forEach>
		</table>
	</c:if>
</body>
</html>
