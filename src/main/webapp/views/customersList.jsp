<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">>

<head>

</head>

<body>

<h1>View Test</h1>

<div id="container">



        <table class="table table-bordered table-striped">
            <thead class="thead-dark">
            <tr>
                <th> First Name </th>
                <th> Last Name </th>
                <th> Email </th>
                <th> Action </th>

            </tr>
            </thead>
            <c:forEach var="tempCustomer" items="${customers}">

                <c:url var="updateLink" value="/customer/showFormForUpdate">
                    <c:param name="customerId" value="${tempCustomer.id }"/>
                </c:url>

                <c:url var="deleteLink" value="/customers/delete">
                    <c:param name="customerId" value="${tempCustomer.id }"/>
                </c:url>

                <tr>
                    <td> ${tempCustomer.firstName} </td>
                    <td> ${tempCustomer.lastName} </td>
                    <td> ${tempCustomer.email} </td>

                    <td> <a href="${updateLink}">Update</a>
                        |
                        <a href="${deleteLink}"
                           onclick="if (!(confirm('Are you sure you want to delete the user?')))return false">Delete</a>
                    </td>

                </tr>

            </c:forEach>

        </table>



</div>
</body>
</html>