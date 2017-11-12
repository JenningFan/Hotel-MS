 angular.module('ui.bootstrap.demo',['ngAnimate', 'ui.bootstrap'])
 .controller('ModalDemoCtrl', function ($scope, $http, $uibModal,messages) {
  // var $ctrl = this;
  // $ctrl.items = ['item1', 'item2', 'item3']; 
  // $scope.messages = [
  //   {name: 'peter',roomNum: 100,deposit: 200,dt: '2017-4-29',phoneNum: 123},
  //   {name: 'kate',roomNum: 100,deposit: 200,dt: '2017-4-29',phoneNum: 123},
  //   {name: 'nick',roomNum: 100,deposit: 200,dt: '2017-4-29',phoneNum: 222}
  // ];
	 
	 
  //messages是从resolve中的属性注入到controller里面的，包含请求后台的数据的一个object
  $scope.messages = messages.data;
  console.log(messages);
  //对日期格式处理
  for(var i = 0; i < $scope.messages.length; i++) {
	  $scope.messages[i].date = $scope.messages[i].date.slice(0, 10);
  }
  $scope.animationsEnabled = true;
  $scope.open = function (index) {
    var modalInstance = $uibModal.open({
      animation: $scope.animationsEnabled,
      ariaLabelledBy: 'modal-title',
      ariaDescribedBy: 'modal-body',
      templateUrl: 'myModalContent.html',
      controller: 'ModalInstanceCtrl',
      /**
       * 该方法可以返回一个对象，该对象保存在items变量里面，作用是可以将需要传递的
       * 数据注入到模态弹出框的controller的作用域里面，实现$scope之间的数据传递。
       */       
      resolve: {
        items: function() {
          return $scope.messages[index];
        }
      }
    });
}
  $scope.open2 = function(index) {
     var modalInstance = $uibModal.open({
      animation: $scope.animationsEnabled,
      ariaLabelledBy: 'modal-title',
      ariaDescribedBy: 'modal-body',
      templateUrl: 'myModalContent2.html',
      controller: 'ModalInstanceCtrl2',
      // size: size,
      resolve: {
        items: function() {
          return $scope.messages[index];
        }
      }
    });
  }
  $scope.exit = function (index) {
    var modalInstance = $uibModal.open({
      animation: $scope.animationsEnabled,
      // ariaLabelledBy: 'modal-title',
      // ariaDescribedBy: 'modal-body',
      templateUrl: 'myModalContent3.html',
      controller: 'ModalInstanceCtrl3',
      // size: size,
      resolve: {
        items: function() {
          return $scope.messages[index];
        }
      }
    });
}
  //请求已经入住的客户的信息,$http返回的是一个promise对象
  $scope.load = function() {
    // var p = $http.get('http://127.0.0.1:8080/msg.json');
    var promise = $http({
       method: 'GET',
       url : 'http://127.0.0.1:8080/msg.json'
    });
    console.log(promise);
    promise.success(function(res) {
      console.dir(res);
      $scope.messages = res;     
    })
  }

});
// Please note that $uibModalInstance represents a modal window (instance) dependency.
// It is not the same as the $uibModal service used above.

angular.module('ui.bootstrap.demo').controller('ModalInstanceCtrl', function ($scope, $http, $uibModalInstance, items) {
  //接收resolve中返回的items，保存在ModalInstanceCtrl的$scope内
  $scope.items = items;
  //传送给后端的数据
  $scope.data = {
    oldRoom:  $scope.items.roomNum,
    newRoom:  "",
    name:     $scope.items.name
  };
  $scope.ok = function () {
    $http.post('checkOut/changeRoom.do', $scope.data).success(function(res) {
//      myService.setRoomNum($scope.data.newRoom);
      alert("换房成功");
    });
    $uibModalInstance.close();
  };
  $scope.cancel = function () {
    $uibModalInstance.dismiss('cancel');
  };
});

angular.module('ui.bootstrap.demo').controller('ModalInstanceCtrl2', function ($scope, $http, $uibModalInstance, items) {
  $scope.items = items;
  $scope.selectedGrade = 5;
  $scope.grades = [5,4,3,2,1];
  $scope.data = {
    grade:         $scope.selectedGrade,
    roomNum:       $scope.items.roomNum,
    name:          $scope.items.name,
    date:          $scope.items.date
  };
  $scope.ok = function () {
	console.dir($scope.data);
    $http.post('checkOut/evaluate.do', $scope.data).success(function(res) {
      alert("评价成功");
    });
    $uibModalInstance.close();
  };
  $scope.cancel = function () {
    $uibModalInstance.dismiss('cancel');
  };
});

angular.module('ui.bootstrap.demo').controller('ModalInstanceCtrl3', function ($scope, $http, $uibModalInstance, items) {
  $scope.items = items;
  $scope.ok = function () {
    $http.post('checkOut/exit.do', $scope.items).success(function(res) {
      alert("退房成功");
    });
    $uibModalInstance.close();
  };
  $scope.cancel = function () {
    $uibModalInstance.dismiss('cancel');
  };
});

//angular.module('ui.bootstrap.demo',[]).service('myService', function() {
//	this.roomNum = "";
//	this.index = "";
//	this.getroomNum = function() {
//		return roomNum;
//	}
//	this.setroomNum = function(roomNum) {
//		this.roomNum = roomNum;
//	}
//})


// Please note that the close and dismiss bindings are from $uibModalInstance.

// angular.module('ui.bootstrap.demo').component('modalComponent', {
//   templateUrl: 'myModalContent.html',
//   bindings: {
//     resolve: '<',
//     close: '&',
//     dismiss: '&'
//   },
//   controller: function () {
//     var $ctrl = this;

//     $ctrl.$onInit = function () {
//       $ctrl.items = $ctrl.resolve.items;
//       $ctrl.selected = {
//         item: $ctrl.items[0]
//       };
//     };

//     $ctrl.ok = function () {
//       $ctrl.close();
//     };

//     $ctrl.cancel = function () {
//       $ctrl.dismiss({$value: 'cancel'});
//     };
//   }
// });
