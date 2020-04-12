<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<title>Its My Family</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

	<div class="container">
		<h2 align="center" style="color:blue;">PAPA Birthday Special</h2>
		<div id="myCarousel" class="carousel slide" data-ride="carousel">
			<!-- Indicators -->

			<ol class="carousel-indicators">
				<% String[] myArray= {"img3-min.jpg","img4-min.jpg","img5-min.jpg",
							          "img6-min.jpg","img7-min.jpg","img8-min.jpg","img9-min.jpg","img10-min.jpg","img12-min.jpg"}; 
		for(int j=1;j<myArray.length-2;j++){					
		%>

				<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
				<li data-target="#myCarousel" data-slide-to="<%=j%>"></li>
				<%} %>
			</ol>

			<!-- Wrapper for slides -->
			<div class="carousel-inner">
				<div class="item active">
					<img src="https://s3.amazonaws.com/img-coll/img2-min.jpg" style="width: 100%; height: 500px; align: center">
				</div>
				<%
   			 for (int i=0;i<myArray.length;i++){
    %>
				<div class="item">
					<img src="<%="https://s3.amazonaws.com/img-coll/"+myArray[i]%>"
						style="width: 100%; height: 500px; align: center">
				</div>
				<%} %>
				
				<!-- Left and right controls -->
				<a class="left carousel-control" href="#myCarousel"
					data-slide="prev"> <span
					class="glyphicon glyphicon-chevron-left"></span> <span
					class="sr-only">Previous</span>
				</a> <a class="right carousel-control" href="#myCarousel"
					data-slide="next"> <span
					class="glyphicon glyphicon-chevron-right"></span> <span
					class="sr-only">Next</span>
				</a>
			</div>
		</div>
</body>
</html>