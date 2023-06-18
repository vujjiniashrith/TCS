<%
    
Student student2 = (Student)session.getAttribute("current-student");

%>

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
                        
                        <div class="card-header custom-bg text-white">
                            <h5>Add Event</h5>
                            
                        </div>
                        
                        <div class ="card-body">
                            <%@ include file ="components/message.jsp"%>
                            <form action ="SaveEvent" method ="post">
                                <div class="form-group">
                                <label for="exampleInputEmail1">Title</label>
                                <input name = "title" type="name" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter Title">
                                
                                </div>
                                <div class="form-group">
                                <label for="exampleInputEmail1">Start Date</label>
                                <input name = "start_date" type="date" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter Start Date">
                                
                                </div>
                                <div class="form-group">
                                <label for="exampleInputPassword1">End Date</label>
                                <input name ="end_date" type="date" class="form-control" id="exampleInputPassword1" placeholder="Enter End Date">
                                </div>
                                
                                <div class="form-group">
                                <label for="exampleInputPassword1">Request to</label>
                                <input name ="prof_mail" type="email" class="form-control" id="exampleInputPassword1" placeholder="Enter professor email id">
                                </div>
                               
                                <div class ="container text-center mt-3">
                                    
                                    <button type="submit" class="btn btn-primary custom-bg border-0">Submit</button>
                                    <button type="reset" class="btn btn-primary custom-bg border-0"> Reset </button>
                                </div>
                                
                            </form>
                            
                        
                             
                        
                    </div>
                    
                </div>
            </div>
        </div>
    </body>
</html>
