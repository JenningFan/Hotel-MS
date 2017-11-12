angular.module('customerMsg',[]).controller('customerMsgCtrl', function ($scope, customerMsgs) {
  $scope.customerMsgs = customerMsgs.data;
});
