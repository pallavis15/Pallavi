<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Items Page</title>
    <style>
        .design {
            background-color: blue;
            text-align: center;
            margin: 0 auto;
            width: 300px;
            padding: 20px;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.2);
        }

        .design label {
            display: block; /* Labels as block elements */
            color: white;
            text-align: left;
            margin-top: 10px;
        }

        .design input,
        .design select {
            width: 100%; /* Make input and select elements span the container */
            padding: 5px;
            margin-top: 5px;
        }
    </style>
</head>
<body>
<form action="Pallavi" method="post" class="design">
    <div>
        <span style="color:red;">${error}</span>
    </div>
    <div>
        <label for="name">Name</label>
        <input type="text" id="name" placeholder="Name" name="name" >
    </div>
    <div>
        <label for="type">Type</label>
        <select id="type" name="type">
            <option value="">Select</option>
            <option value="Grocery">Grocery</option>
            <option value="Snacks">Snacks</option>
            <option value="Electronic">Electronic</option>
        </select>
    </div>
    <div>
        <label for="price">Price</label>
        <input type="text" id="price" placeholder="Price" name="price" >
    </div>
    <div>
        <label for="brand">Brand</label>
        <input type="text" id="brand" placeholder="Brand" name="brand" >
    </div>
    <div>
        <label for="quantity">Quantity</label>
        <select id="quantity" name="quantity">
            <option value="">Select</option>
            <option value="1">1</option>
            <option value="2">2</option>
            <option value="3">3</option>
        </select>
    </div>
    <div>
        <label for="description">Description</label>
        <input type="text" id="description" placeholder="Description" name="description">
    </div>
    <br><br>
    <input type="submit" value="Submit">
</form>
</body>
</html>
