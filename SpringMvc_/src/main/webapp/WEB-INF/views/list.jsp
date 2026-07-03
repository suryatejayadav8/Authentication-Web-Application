<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ include file="_header.jsp" %>

<div class="page-header">
    <div>
        <h1>All Employees</h1>
        <div class="subtitle">${totalCount} record<c:if test="${totalCount != 1}">s</c:if> in the database</div>
    </div>
    <a class="btn btn-primary" href="${pageContext.request.contextPath}/employees/new">+ Add Employee</a>
</div>

<div class="card">
    <c:choose>
        <c:when test="${empty employees}">
            <div class="empty-state">
                No employees found. Click <strong>“Add Employee”</strong> to create the first record.
            </div>
        </c:when>
        <c:otherwise>
            <table class="emp-table">
                <thead>
                    <tr>
                        <th>Employee Id</th>
                        <th>Name</th>
                        <th>Department</th>
                        <th>Actions</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="emp" items="${employees}">
                        <tr>
                            <td data-label="Employee Id"><span class="emp-id">${emp.empId}</span></td>
                            <td data-label="Name">${emp.empName}</td>
                            <td data-label="Department">${emp.dept}</td>
                            <td data-label="Actions">
                                <div class="actions-cell">
                                    <a class="btn btn-outline btn-sm"
                                       href="${pageContext.request.contextPath}/employees/view/${emp.empId}">View</a>
                                    <a class="btn btn-outline btn-sm"
                                       href="${pageContext.request.contextPath}/employees/edit/${emp.empId}">Edit</a>
                                    <a class="btn btn-danger btn-sm"
                                       href="${pageContext.request.contextPath}/employees/delete/${emp.empId}"
                                       onclick="return confirm('Delete employee ${emp.empId}? This cannot be undone.');">Delete</a>
                                </div>
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </c:otherwise>
    </c:choose>
</div>

<%@ include file="_footer.jsp" %>
