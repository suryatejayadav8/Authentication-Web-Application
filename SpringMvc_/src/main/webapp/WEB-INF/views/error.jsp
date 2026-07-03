<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="_header.jsp" %>

<div class="page-header">
    <div>
        <h1>${empty errorTitle ? "Error" : errorTitle}</h1>
        <div class="subtitle">${empty errorMessage ? "Something went wrong." : errorMessage}</div>
    </div>
</div>

<div class="card">
    <div class="form-actions">
        <a class="btn btn-primary" href="${pageContext.request.contextPath}/employees">Back to Employee List</a>
    </div>
</div>

<%@ include file="_footer.jsp" %>
