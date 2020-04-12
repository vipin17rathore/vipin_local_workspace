/*var mod1 = angular.module("myMod1",[]);

mod1.controller("myController1",function($scope){
	var employee={
			FirstName :"Vipin",
			LastName  :"Rathore",
			Age		  :"25",
			Flag      :"Images/sample.jpg"
	};
	$scope.employee = employee;
});

var mod2 = angular.module("myMod2",[]);

mod2.controller("myController2",function($scope){
	$scope.message = "Hello Angular";
});


var mod3 = angular.module("myMod3",[]);

mod3.controller("myController3",function($scope){
	var employee = {
			firstName : "Vipin",
			lastName  : "Rathore",
			age		  : "25"
	};
	$scope.employee = employee;
});
 */
/*var modRepeat = angular.module("myModRepeat",[]);

modRepeat.controller("myControllerRepeat",function($scope){
	var employees = [
	                 { firstName : "Vipin", lastName : "Rathore", age : "25"},
	                 { firstName : "Rahul", lastName : "Kohli", age : "24"},
	                 { firstName : "Abihshek", lastName : "Hatwar", age : "25"}
	                 ];
	$scope.employees = employees;
});
*/
var modRepeat2 = angular.module("myRepeat",[]);

modRepeat2.controller("myyControllerRepeat2",function($scope){
	
	var employees = [
	                 { firstName : "Vipin", lastName : "Rathore", age : "25"},
	                 { firstName : "Rahul", lastName : "Kohli", age : "24"},
	                 { firstName : "Abihshek", lastName : "Hatwar", age : "25"}
	                 ];
	$scope.employees = employees;
	
	/*var country = [
	               {name: "UK",
	            	   cities:[{name:"london",
	            		   name:"manchaster",
	            		   name:"birmingham"}]},

	               {name: "India",
	            			   cities:[{name:"Indore",
	            				   name:"bhopal",
	            				   name:"mumbai"}]},
	            				   
	            	{name: "Austrila",
    					 	  cities:[{name:"sidni",
    							  	   name:"parth",
    							  	   name:"sidni"}]}
	            		   ];
	$scope.country = country;
*/});

var modClickEvent = angular.module("moduleClickEvent",[]);
modClickEvent.controller("controllerClickEvent",function($scope){
	var language = [
	               {name:"C++",likes:"0",dislikes:"0"},
	               {name:"Java",likes:"0",dislikes:"0"},
	               {name:"Spring",likes:"0",dislikes:"0"},
	               {name:"Hibernate",likes:"0",dislikes:"0"}
	                ]
	$scope.language = language;
	
	$scope.incrementLikes = function(lan){
		lan.likes++;
	}
	$scope.incrementDislikes = function(lan){
		lan.dislikes++;
	}
});

var modFilter = angular.module("moduleFilter",[]);
modFilter.controller("controllerClickEvent",function($scope){
	var language = [
	               {name:"C++",likes:"0",dislikes:"0"},
	               {name:"Java",likes:"0",dislikes:"0"},
	               {name:"Spring",likes:"0",dislikes:"0"},
	               {name:"Hibernate",likes:"0",dislikes:"0"}
	                ]
	$scope.language = language;
	
	$scope.incrementLikes = function(lan){
		lan.likes++;
	}
	$scope.incrementDislikes = function(lan){
		lan.dislikes++;
	}
});

