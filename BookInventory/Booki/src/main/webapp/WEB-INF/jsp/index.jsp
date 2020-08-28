<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <ul class="nav navbar-nav">
      <li class="active"><a href="/">Home</a></li>
      <li><a href="/">All Book</a></li>
      <li><a href="newBook">New Book</a></li>
      
    </ul>
  </div>
</nav>
  
<div class="container">
	<c:choose>
		<c:when test="${mode == 'BOOK_VIEW'}">
		
			<table class="table table-hover">
    			<thead>
      				<tr>
        				<th>Book Name</th>
        				<th>Author</th>
        				<th>Publish Date</th>
        				<th>Edit</th>
      				</tr>
    			</thead>
    			<tbody>
    
    				<c:forEach var="book" items="${books}">
    					<tr>
    						
    						<td>${book.bookName}</td>
    						<td>${book.author}</td>
    						<td>${book.publishDate}</td>
    						<td><a href="updateBook?id=${book.id }">Edit</a></td>
    					</tr>
    				</c:forEach>
    			</tbody>
  			</table>
		
		
		</c:when>
		
		<c:when test="${mode == 'BOOK_EDIT'|| mode == 'BOOK_NEW' }">
			<form  action="save" method="POST">
			
  				<div class="form-group">
  					<input type="hidden" class="form-control" value="${book.id}" id="id" name="id">
    				<label for="bookName">Book Name</label>
    				<input type="text" class="form-control" value="${book.bookName}" id="bookName" name="bookName">
  				</div>
  				<div class="form-group">
   			 		<label for="author">Author:</label>
   				 	<input type="text" class="form-control" value="${book.author}" id="author" name="author">
  				</div>
  				<div class="form-group">
   			 		<label for="publishDate">Publish Date:</label>
   				 	<input type="date" class="form-control" value="${book.publishDate}" id="publishDate" name="publish">
  				</div>
  				
  			
  				<button type="submit" class="btn btn-default">Submit</button>
			</form>
		
		</c:when>
		
		
	</c:choose>
   
</div>

</body>
</html>
