<%--
  Created by IntelliJ IDEA.
  User: wicker
  Date: 2017/6/23
  Time: 14:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>首页</title>
    <script type="text/javascript" src="js/jquery-3.2.1.js"></script>
    <script type="text/javascript" src="js/index.js"></script>
  </head>
  <body>
  <div><input type="button" onclick="doLogin()" value="doLogin"/></div>
  <div><input type="button" onclick="doAdd()" value="doAdd"/></div>
  <div>
    <form action="/springException/loginManage/pageChange.do" method="get">
      ajax是异步请求，所以不能在控制台实现跳转，可以通过页面直接请求实现页面跳转，如： <input type="submit" value="跳转"/>
    </form>
  </div>
  </body>
</html>
