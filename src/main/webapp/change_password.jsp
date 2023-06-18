<%-- 
    Document   : change_password
    Created on : 02-May-2023, 7:21:21 AM
    Author     : Rohith Rao
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <%@include file="components/common_css_js.jsp" %>
    </head>
    <body>
        
        <%@include file ="components/navbar.jsp" %>
        <style>
            body{
                background-image:url('img/light1.avif');
                background-repeat: no-repeat;
                background-attachment: fixed;
                background-size: 100% 100%;
            }
        </style>
        
        <div class="container">
            <div class ="row">
                <div class ="col-md-6 offset-md-3">
                    <div class ="card mt-3">
                        
                        
                        
                        <div class ="card-body">
                            <%@ include file ="components/message.jsp"%>
                            <form action ="loginServlet" method ="post">
                                <div class="form-group">
                                <label for="exampleInputEmail1">Enter new password</label>
                                <input name = "password" type="password" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Password">
                                
                                </div>
                                <div class="form-group">
                                <label for="exampleInputPassword1">Re-enter new password</label>
                                <input name ="password" type="password" class="form-control" id="exampleInputPassword1" placeholder="Password">
                                  <div class ="container text-center mt-3">
                                    
                                    <button type="reset" class="btn btn-primary custom-bg border-0">Change Password</button>
                                    <!--<button type="reset" class="btn btn-primary custom-bg border-0"> Reset </button>-->
                                </div>
                                
                            </form>
                            
                        
                             
                        
                    </div>
                    
                </div>
            </div>
        </div>
    </body>
</html>
