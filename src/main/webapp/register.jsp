

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>New User</title>
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
        <div class ="container-fluid">
            <div class ="row mt-5">
            <div class="col-md-4 offset-md-4">
                <div class="card px-2">
                    <%@include file="components/message.jsp" %>
                    <div class="card-body">
                     <h3 class ="text-center my-3">Register here</h3> 
                <form action="RegistrationServlet" method ="post">
                    
                    <div class="form-group">
                        <label for="name">User Name</label>
                        <input name= "user_name" type="text" class="form-control" id="name" aria-describedby="emailHelp" placeholder="Enter full name">
                    </div>
                    <div class="form-group">
                        <label for="email">Email</label>
                        <input name="user_email" type="email" class="form-control" id="email" aria-describedby="emailHelp" placeholder="Enter BITS email">
                    </div>
                      <div class="form-group">
                        <label for="exampleFormControlSelect1">Select Role</label>
                            <select name ="user_role"class="form-control" id="exampleFormControlSelect1">
                            <option>Student</option>
                            <option>Professor</option>
                            

                        </select>
                    </div>
                    
                    <div class="form-group">
                        <label for="phone">Phone No</label>
                        <input name= "user_phone" type="number" class="form-control" id="phone" aria-describedby="emailHelp" placeholder="Enter here">
                    </div>
                    <div class="form-group">
                        <label for="branch">Branch</label>
                        <input name="user_branch" type="text" class="form-control" id="branch" aria-describedby="emailHelp" placeholder="Enter here">
                    </div>
                    <div class="form-group">
                        <label for="password">Password</label>
                        <input name = "user_password" type="password" class="form-control" id="password" aria-describedby="emailHelp" placeholder="Enter here">
                    </div>
                    
                    <div class="container text-center ">
                        <button type="submit" class="btn btn-primary custom-bg">Register</button>
                        <button type="reset" class="btn btn-primary custom-bg">Reset</button>
                        
                    </div>
                    
                    
                    
                </form>
                
                    </div>
                </div>
                
            </div>
        </div>
        </div>
    </body>
</html>
