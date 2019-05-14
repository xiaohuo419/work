$(function(){

	//为adduser添加点击事件 #id div .class
	$("#addUser").click(function(){
		var nameVal = $("#name").val();
		var ageVal = $("#age").val();
		var sexVal = $("#sex").val();
		var url = "http://localhost:8091/addUser";
		//测试$.post("请求地址","请求参数",回调函数,返回值类型)
		$.post(url,{name:nameVal,age:ageVal,sex:sexVal},
				function(data){
			if(data.status==200){
				alert(data.msg);
			}else{
				alert(data.msg);
			}
		},"json");
	});
})