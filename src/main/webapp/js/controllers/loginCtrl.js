angular.module('login',[]).controller('loginCtrl',function($scope, $http, $location) {
  $scope.user;
  $scope.password;
  $scope.login = function() {
  	var data = {user: $scope.user,password: $scope.password};
//  	$http.post('login/signin.do', data).success(function(res) {
//  	  if(res.success){
//  	  	window.location.href = "index.html#/main";
//  	  }else {
//  	    alert("密码或者账号错误");	
//  	  }     
//  	})
  	$http({
  		method: 'POST',
  		url: 'login/signin.do',
  		data: {
  			"user": $scope.user,
  			"password": $scope.password
  		},
//  		headers: {'Content-Type': 'application/json;charset=UTF-8'}
  	}).success(function(res) {
  		if(res.success) {
  			window.location.href = "index.html#/main";
  		} else {
  			alert("账号或者密码错误");
  		}
  	})
  }
})
