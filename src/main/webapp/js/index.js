function doLogin() {
    $.ajax({
        type : "get",  //提交方式
        url : "/springException/loginManage/doLogin.do",//路径
        data : {},//数据，这里使用的是Json格式进行传输
        success: function (data) {
            var obj = JSON.parse(data);
            alert(obj);
        },
        error: function(XMLHttpRequest, textStatus, errorThrown) {
            alert(textStatus);
        }
    });
}


function doAdd() {
    $.ajax({
        type : "get",  //提交方式
        url : "/springException/loginManage/doAdd.do",//路径
        data : {},//数据，这里使用的是Json格式进行传输
        success: function (data) {
            var obj = JSON.parse(data);
            alert(obj);
        },
        error: function(XMLHttpRequest, textStatus, errorThrown) {
            alert(textStatus);
        }
    });
}