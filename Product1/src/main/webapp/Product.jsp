<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Items Page</title>
    <!-- Include Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <script>
        function validateForm() {
            var name = document.getElementById("name").value;
            var type = document.getElementById("type").value;
            var price = document.getElementById("price").value;
            var brand = document.getElementById("brand").value;
            var quantity = document.getElementById("quantity").value;
            var description = document.getElementById("description").value;

            // Validate name
            if (name.length < 3 || name.length > 20) {
                alert("Name should be between 3 and 20 characters.");
                return false;
            }

            // Validate type (dropdown)
            if (type === "") {
                alert("Please select a product type.");
                return false;
            }

            // Validate price
            if (!isValidPrice(price)) {
                alert("Please enter a valid price.");
                return false;
            }

            // Validate brand
            if (!isValidBrand(brand)) {
                alert("Please enter a valid brand.");
                return false;
            }

            // Validate quantity
            if (quantity < 1 || quantity > 50) {
                alert("Quantity should be between 1 and 50.");
                return false;
            }

            // Validate description
            if (description.length < 30) {
                alert("Description should contain a minimum of 30 letters.");
                return false;
            }

            return true;
        }

        function isValidPrice(price) {
            return !isNaN(price) && parseFloat(price) >= 0;
        }

        function isValidBrand(brand) {
            return brand.length >= 3 && brand.length <= 50;
        }
    </script>
</head>
<body>
<div class="container">
    <form action="Attach" method="post" class="design" onsubmit="return validateForm();">
        <div>
            <span style="color:red;">${error}</span>
        </div>
        <div class="form-group">
            <label for="name">Product Name:</label>
            <input type="text" class="form-control" id="name" placeholder="Name" name="name">
        </div>
        <div class="form-group">
            <label for="type">Type: </label>
            <select class="form-control" id="type" name="type">
                <option value="">Select</option>
                <option value="Grocery">Grocery</option>
                <option value="Snacks">Snacks</option>
                <option value="Electronic">Electronic</option>
                <option value="Dress">Dress</option>
                <option value="Shoe">Shoes</option>
            </select>
        </div>
        <div class="form-group">
            <label for="price">Price:</label>
            <input type="text" class="form-control" id="price" placeholder="Price" name="price">
        </div>
        <div class="form-group">
            <label for="brand">Brand:</label>
            <input type="text" class="form-control" id="brand" placeholder="Brand" name="brand">
        </div>
        <div class="form-group">
            <label for="quantity">Quantity:</label>
             <input type="number" class="form-control" id="quantity" placeholder="quantity" name="quantity">
        </div>
        <div class="form-group">
            <label for="description">Description:</label>
            <textarea class="form-control" id="description" placeholder="Description" name="description"></textarea>
        </div>
        <br><br>
        <button type="submit" class="btn btn-primary">Submit</button>
    </form>
</div>
<!-- Include Bootstrap JS and jQuery (Optional) -->
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
