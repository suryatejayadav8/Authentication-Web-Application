<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ include file="_header.jsp" %>

<div class="page-header">
    <div>
        <h1>Employee Details</h1>
        <div class="subtitle">Read-only view of the selected record</div>
    </div>
</div>

<div class="form-card">
    <ul class="detail-list">
        <li>
            <span class="label">Employee Id</span>
            <span class="value">${employee.empId}</span>
        </li>
        <li>
            <span class="label">Name</span>
            <span class="value">${employee.empName}</span>
        </li>
        <li>
            <span class="label">Department</span>
            <span class="value">${employee.dept}</span>
        </li>
    </ul>

    <div class="form-actions">
        <a class="btn btn-primary" href="${pageContext.request.contextPath}/employees/edit/${employee.empId}">Edit</a>
        <a class="btn btn-outline" href="${pageContext.request.contextPath}/employees">Back to List</a>
    </div>
</div>

<%@ include file="_footer.jsp" %>
