<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Address Page</title>
</head>
<body>
  
    <h2>Address Form:</h2>
    <form method="post" action="lastPage.jsp">
        <label for="no">No:</label>
        <input type="text" id="no" name="no" required><br><br>
        
        <label for="state">State:</label>
        <input type="text" id="state" name="state" required><br><br>
        
        <label for="street">Street:</label>
        <input type="text" id="street" name="street" required><br><br>
        
        <label for="country">Country:</label>
        <input type="text" id="country" name="country" required><br><br>
        
        <label for="city">City:</label>
        <input type="text" id="city" name="city" required><br><br>
        
        <input type="submit" value="Send">
    </form>
</body>
</html>
