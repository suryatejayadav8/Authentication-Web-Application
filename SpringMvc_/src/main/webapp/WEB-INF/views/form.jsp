<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ include file="_header.jsp" %>

<div class="page-header">
    <div>
        <h1>${formTitle}</h1>
        <div class="subtitle">
            <c:choose>
                <c:when test="${isEdit}">Update the details below and save.</c:when>
                <c:otherwise>Fill in the details to create a new employee record.</c:otherwise>
            </c:choose>
        </div>
    </div>
</div>

<div class="form-card">
    <form:form modelAttribute="employee" action="${pageContext.request.contextPath}/employees/save" method="post">

        <div class="form-group">
            <label for="empId">Employee Id</label>
            <form:input path="empId" id="empId" readonly="${isEdit}" required="true" placeholder="e.g. E101"/>
            <c:if test="${isEdit}">
                <div class="hint">Employee Id cannot be changed once created.</div>
            </c:if>
        </div>

        <div class="form-group">
            <label for="empName">Employee Name</label>
            <form:input path="empName" id="empName" required="true" placeholder="e.g. Vamsi Krishna"/>
        </div>

        <div class="form-group">
            <label for="dept">Department</label>
            <form:input path="dept" id="dept" required="true" placeholder="e.g. Training & Development"/>
        </div>

        <div class="form-actions">
            <button type="submit" class="btn btn-primary">
                <c:choose>
                    <c:when test="${isEdit}">Save Changes</c:when>
                    <c:otherwise>Add Employee</c:otherwise>
                </c:choose>
            </button>
            <a class="btn btn-outline" href="${pageContext.request.contextPath}/employees">Cancel</a>
        </div>

    </form:form>
</div>

<%@ include file="_footer.jsp" %>
