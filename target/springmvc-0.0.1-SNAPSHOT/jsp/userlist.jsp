<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<body>
	<h2>Spring MVC and List Example</h2>

	<c:if test="${not empty user}">

		<ul>
			<c:forEach var="u" items="${user}">
				<li>${u}</li>
			</c:forEach>
		</ul>

	</c:if>
</body>
</html>