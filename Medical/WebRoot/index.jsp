<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  <script type="text/javascript" src="jquery.js"></script>
  <script type="text/javascript">
  		function postMvc(cfg){
  			var server = cfg.service
  			   ,method = cfg.method
  			   ,params = cfg.params
  			   ,success= cfg.success || function(){}
  			   ,failure= cfg.fail    || function(){};
  			$.post("controller/extcore",{
					server : server,
					method : method,
					params : JSON.stringify(params)
				}, function(data) {
					if (data["code"] == "success") {
						success.call(this, data["result"],data["user"]);
					} else {
						var failResult = data["result"] || {cause:"",msg:"服务器异常!"};
						failure.call(this, failResult.msg,failResult.cause);
						alert(failResult.msg);
					}
				});
  		}
  		postMvc({
  			service:"commodityService",
  			method: "queryLt",
  			params:[{}],
  			success:function(res){
  				console.log(res);
  			}
  		});
  </script>
  
  <script type="text/javascript">
  </script>
  <body>
   
  </body>
</html>
