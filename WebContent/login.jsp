<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
   <title>用户登录</title>
	<link rel="stylesheet" type="text/css" href="css/frame.css">
</head>
<SCRIPT LANGUAGE="javaScript">
 function Login()
{ 
  if(document.idFrmMain.username.value==""){
		 window.alert("请输入用户名!");
	    return true;
	}
 
  else if(document.idFrmMain.password.value=="" ){
		 window.alert("请输入密码!");
		return true;
	}
	document.forms[0].action="user?action=login";
	document.forms[0].submit();
	return true;
}
 </SCRIPT>
 
<body>
<form id="login" METHOD="POST"  ACTION=""  ONSUBMIT="return login()">
    <h1>Log In</h1>
    <fieldset id="inputs">
        <input type="text" name="username" />
        <input  type="password" name="password" />
    </fieldset>
    <fieldset id="actions">
        <input type="button" onClick="javascript:Login()"  value="登 录" id="submit" />
         <a href="">QQ快捷登录</a>
    </fieldset>
    </form>
    <a href="http://www.mycodes.net" id="back">Back to article...</a>




<!-- BSA AdPacks code -->

<script src="http://code.jquery.com/jquery-1.6.3.min.js"></script>

<script>

(function(){

  var bsa = document.createElement('script');

     bsa.async = true;

     bsa.src = 'http://www.mycodes.net';

  (document.getElementsByTagName('head')[0]||document.getElementsByTagName('body')[0]).appendChild(bsa);

})();

</script>



<div style="clear:both"></div>
<br><br>
<div style="text-align:center">

<br><br>

</div>
</body>
</html>
  
