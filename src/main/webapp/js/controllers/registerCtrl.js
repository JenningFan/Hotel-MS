angular.module('register',[]).controller('registerCtrl',function($scope, $http, $location) {
  $scope.user;
  $scope.password;
  $scope.jobNum;
  $scope.register = function() {
  	var data = {"user": $scope.user,"password": $scope.password,"jobNum": $scope.jobNum};
  	$http.post('login/register.do', data).success(function(res) {
  	  if(res.success){
        alert("注册成功");
  	  	window.location.href = "login.html";
  	  }else {
  	    alert("工号不存在或者账号已被注册");	
  	  }     
  	})
  }
})