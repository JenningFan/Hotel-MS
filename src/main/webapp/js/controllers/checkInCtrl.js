angular.module('datePicker',['ui.bootstrap','ngAnimate']).controller('DatepickerPopupDemoCtrl', function ($scope, $http) {
  $scope.today = function() {
    $scope.dt = new Date();
  };
  $scope.today();

  $scope.clear = function() {
    $scope.dt = null;
  };

  $scope.inlineOptions = {
    customClass: getDayClass,
    minDate: new Date(),
    showWeeks: true
  };

  $scope.dateOptions = {
    // dateDisabled: disabled,
    formatYear: 'yy',
    maxDate: new Date(2020, 5, 22),
    minDate: new Date(),
    startingDay: 1
  };

  // Disable weekend selection
  function disabled(data) {
    var date = data.date,
      mode = data.mode;
    return mode === 'day' && (date.getDay() === 0 || date.getDay() === 6);
  }

  $scope.toggleMin = function() {
    $scope.inlineOptions.minDate = $scope.inlineOptions.minDate ? null : new Date();
    $scope.dateOptions.minDate = $scope.inlineOptions.minDate;
  };

  $scope.toggleMin();

  $scope.open1 = function() {
    $scope.popup1.opened = true;
  };

  $scope.open2 = function() {
    $scope.popup2.opened = true;
  };

  $scope.setDate = function(year, month, day) {
    $scope.dt = new Date(year, month, day);
  };

  $scope.formats = ['dd-MMMM-yyyy', 'yyyy/MM/dd', 'dd.MM.yyyy', 'shortDate'];
  $scope.format = $scope.formats[0];
  $scope.altInputFormats = ['M!/d!/yyyy'];

  $scope.popup1 = {
    opened: false
  };

  $scope.popup2 = {
    opened: false
  };

  var tomorrow = new Date();
  tomorrow.setDate(tomorrow.getDate() + 1);
  var afterTomorrow = new Date();
  afterTomorrow.setDate(tomorrow.getDate() + 1);
  $scope.events = [
    {
      date: tomorrow,
      status: 'full'
    },
    {
      date: afterTomorrow,
      status: 'partially'
    }
  ];

  function getDayClass(data) {
    var date = data.date,
      mode = data.mode;
    if (mode === 'day') {
      var dayToCheck = new Date(date).setHours(0,0,0,0);

      for (var i = 0; i < $scope.events.length; i++) {
        var currentDay = new Date($scope.events[i].date).setHours(0,0,0,0);

        if (dayToCheck === currentDay) {
          return $scope.events[i].status;
        }
      }
    }

    return '';
  }
  
  $scope.msg = {
	name: "",
	roomNum: "",
	phoneNum: "",
	sex: "女",	
	type: "单人房",
	idNum: "",
	charge: "",
	deposit: "",
	date: ""
  };


//   $scope.name;
//   $scope.roomNum;
//   $scope.phoneNum;
//   $scope.charge;
//   $scope.deposit;
//   $scope.idNum;
   $scope.sexes = ['男','女'];
//   //默认选中男性
//   $scope.selectedSex = '男';
//   
   $scope.types = ['单人房','双人房'];
//   //默认选中单人房
//   $scope.selectedType = '单人房';

   //要发送给后台的入住登记信息
   $scope.message = {
     "name":     $scope.msg.name,
     "roomNum":  $scope.roomNum,
     "phoneNum": $scope.phoneNum,
     "sex":      $scope.selectedSex,
     "type":     $scope.selectedType,
     "idNum":    $scope.idNum,
     "charge":   $scope.charge,
     "deposit":  $scope.deposit,
     "date":     $scope.dt
   }

   $scope.checkIn = function() {
	 console.dir($scope.msg);
	 console.dir($scope.message);
     $http.post('checkin/check.do', $scope.msg).success(function(res) {
            alert('信息提交成功');
        }); 
   }



});