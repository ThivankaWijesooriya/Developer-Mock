<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Document</title>

    <style>
        .grid {

            display: grid;
            grid-template-columns: 40% auto 40%;
            margin-top: 15%;
           
        }
        
        
        .ui.form .two.fields>.field, .ui.form .two.fields>.fields{
            
            width: 50px;
        }
     
        .error{
           color:red;
        }
        
   
    </style>
    <link href="<c:url value="/resources/css/semantic.min.css" />" rel="stylesheet">
    
</head>

<body>

    <div class="grid">

        <div class="leftblock"></div>
        <div class="mainblock">

            <form:form class="ui form" action="${pageContext.request.contextPath}/Form/Submit" method="POST" modelAttribute="user">
                <div class="field">
                    <label>Enter ID &nbsp; <span style="color:blue;">(Numerics Only)</span></label>
                    <form:input type="text" id="checker" placeholder="" path="customerId"/>
                    <form:errors path="customerId" cssClass="error"/>
                    
                </div>

                
                
                 <div class="field">
                    <label >${IDmsg}</label>
                    <input type="text" id="generated_ID" placeholder="" value="${msg}"/> 
                    
                </div> 
                
                <label style="color:green;" > ${finalmsg}</label>
               
                <div class="two fields" style="margin-top: 20px;">
                
                   <div class="field">
                       
                        
						 <input type="submit" value="Submit" id="actionbtn" class="ui primary button fluid"/>

  
                   </div>
                   
                      <div class="field">
                       
                        <div class="ui red button fluid"> Clear </div> 

  
                   </div>
                   
                   
                </div>
                
            </form:form>

        </div>

        <div class="rightblock"></div>


    </div>


   <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
   <script src="<c:url value="/resources/js/semantic.min.js" />">  </script>
    
    <script>
       
    
    

        $(document).ready(function() {
           
             $('.ui.dropdown').dropdown();


             $("#checker").on("keypress keyup blur",function (event) {    
                 $(this).val($(this).val().replace(/[^\d].+/, ""));
                  if ((event.which < 48 || event.which > 57)) {
                      event.preventDefault();
                  }
              });


        });
    </script>

</body>
</html>