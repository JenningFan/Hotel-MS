angular.module('order',[]).controller('orderCtrl', function ($scope, orders) {
  $scope.orders = orders.data;
  for(var i = 0; i < $scope.orders.length; i++) {
	  $scope.orders[i].date = $scope.orders[i].date.slice(0, 10);
  }
});