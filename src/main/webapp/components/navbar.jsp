<%@page import="com.mycompany.entities.Student"%>
<%
    //Student student1 
    Student student1 = (Student)session.getAttribute("current-student");



%>



<nav class="navbar navbar-expand-lg navbar-dark bg-light custom-bg">
    <div class ="container">
        <a class="navbar-brand" href="index.jsp">TCS</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link" href="index.jsp">Home <span class="sr-only">(current)</span></a>
      </li>
      
      <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
          Professors
        </a>
        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
          <a class="dropdown-item" href="#">Action</a>
          <a class="dropdown-item" href="#">Another action</a>
          <div class="dropdown-divider"></div>
          <a class="dropdown-item" href="#">Something else here</a>
        </div>
      </li>
      
    </ul>
      <ul class="navbar-nav ml-auto">
          <%
             if(student1 == null) {
           %>
             <li class="nav-item active">
            <a class="nav-link" href="login.jsp">Login</a>
          </li>
          <li class="nav-item active">
            <a class="nav-link" href="register.jsp">Register</a>
          </li>
          <%
              }else{
                    
            
          %>
          
          <li class="nav-item active">
            <a class="nav-link" href="normal.jsp"><%=student1.getStudentName()%></a>
          </li>
          <li class="nav-item active">
            <a class="nav-link" href="logoutServlet">Logout</a>
          </li>
           <li class="nav-item active">
            <a class="nav-link" href="change_password.jsp">Change Password</a>
          </li>
            <%
              }
                    
            
          %>  

          
          
          
      </ul>

  </div>
    </div>
</nav>