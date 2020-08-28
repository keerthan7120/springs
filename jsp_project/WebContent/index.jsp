<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%@ include file="Header.jsp" %>
   <form action="login" method="get">
    <div class="col">
      <input type="text"  placeholder="uname" name="uname">
    </div>
    <div class="col">
      <input type="password"  placeholder="password" name="password">
    </div>
          <button type="button" class="btn btn-outline-primary" align="center">Primary</button>
</form>
		
<%@ include file="Footer.jsp" %>

</html>
