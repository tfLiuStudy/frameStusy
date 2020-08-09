<?jsp version="1.0" encoding="UTF-8"?>
<a href="${pageContext.request.contextPath}/sayHello">SpringMVC 入门案例</a> <br/>
<a href="sayHello">SpringMVC 入门案例</a>
<form method="post" action="${pageContext.request.contextPath}/testParam">
    用户ID<input type="text" name="id"><br/>
    用户名<input type="text" name="name"><br/>
        <input type="submit" value="保存">
</form>