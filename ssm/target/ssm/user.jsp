<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
         <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
         "http://www.w3.org/TR/html4/loose.dtd"> <html>
         <head>
             <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
             <title>主页</title>
         </head>
         <body> <a href="account/findAllAccount">访问查询账户</a> <hr/>
            <form action="account/saveAccount" method="post">
                账户名称：<input type="text" name="name"/><br/>
                账户金额：<input type="text" name="money"><br/>
                <input type="submit" value="保存"/>
            </form>
         </body>
         </html>