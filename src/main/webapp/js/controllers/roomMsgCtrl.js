angular.module('roomMsg',[]).controller('roomMsgCtrl', function ($scope, roomMsgs) {
  $scope.roomMsgs = roomMsgs.data;
  // $scope.selectedType = '单人房';
  $scope.types = ['单人房','双人房'];
  $scope.change = function() {
  	 //array用来临时存储筛选后的数据
  	 var array = [];
     for(var i = 0; i <= roomMsgs.data.length - 1; i++) {
       if($scope.selectedType == roomMsgs.data[i].type) {
         array.push(roomMsgs.data[i]);
     	}
     }
      $scope.roomMsgs = array;
  }
  // $scope.change();
});