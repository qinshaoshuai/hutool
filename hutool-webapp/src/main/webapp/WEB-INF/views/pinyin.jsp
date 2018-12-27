<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <title>拼音工具类首页</title>
</head>
<body>
<h1 align="center">拼音工具类首页</h1>
<div align="center">
    <form action="<%=path%>/pinyin/tranceWordsToPinyin" method="post">
        <input type="text" name="wordStr" value=""><br/><br/>
        <input type="submit" value="查询">&nbsp;&nbsp;<input type="reset" value="重来"><br/><br/>
        <input type="text" value="${pinyin}">
    </form>
</div>
</body>

</html>
