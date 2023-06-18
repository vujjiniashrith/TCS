
<%
   Student student = (Student)session.getAttribute("current-student");
   if(student==null){
        session.setAttribute("message","You are not logged in!! login first");
        response.sendRedirect("login.jsp");
        return;
    }

%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>TCS home</title>
        <%@include file="components/common_css_js.jsp" %>

    
  <script src='https://cdn.jsdelivr.net/npm/fullcalendar@6.1.6/index.global.min.js'></script>


<script src='/docs/dist/demo-to-codepen.js'></script>


  
<script>

  document.addEventListener('DOMContentLoaded', function() {
    var calendarEl = document.getElementById('calendar');

    var calendar = new FullCalendar.Calendar(calendarEl, {
      initialView: 'dayGridMonth',
      initialDate: '2023-04-07',
      headerToolbar: {
        left: 'prev,next today',
        center: 'title',
        right: 'dayGridMonth,timeGridWeek,timeGridDay'
      },
      events: [
        {
          title: 'All Day Event',
          start: '2023-04-01'
        },
        {
          title: 'Long Event',
          start: '2023-04-07',
          end: '2023-04-10'
        },
        {
          groupId: '999',
          title: 'Repeating Event',
          start: '2023-04-09T16:00:00'
        },
        {
          groupId: '999',
          title: 'Repeating Event',
          start: '2023-04-16T16:00:00'
        },
        {
          title: 'Conference',
          start: '2023-04-11',
          end: '2023-04-13'
        },
        {
          title: 'Meeting',
          start: '2023-04-12T10:30:00',
          end: '2023-04-12T12:30:00'
        },
        {
          title: 'Lunch',
          start: '2023-04-12T12:00:00'
        },
        {
          title: 'Meeting',
          start: '2023-04-12T14:30:00'
        },
        {
          title: 'Birthday Party',
          start: '2023-04-13T07:00:00'
        },
        {
          title: 'OOPS',
          url: 'http://google.com/',
          start: '2023-04-28'
        }
      ]
    });

    calendar.render();
  });
  
  
  
  </script>

        
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
        <form action="AddEvent" method ="post">
               
                    <div class="container text-right mt-4 ">
                        <button type="submit" class="btn btn-primary custom-bg">Add Event</button>
                        <button type="reset" class="btn btn-primary custom-bg">Delete Event</button>
                        
                    </div>
                    
                    
                    
                </form>

        <div class="container text-center">
            <div class ="row">
                <div class ="col-md-12 offset-md-0">
                    <div class ="card mt-3">
                        
                       
                        
                        <div class ="card-body">
                           
                            <div id='calendar'></div>
                            
                        
                             
                        
                    </div>
                    
                </div>
            </div>
        </div>
        
    </body>
    
    
</html>
