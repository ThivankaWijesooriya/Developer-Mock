$(document).ready(function(){
	
	
    var adminstat = sessionStorage.getItem("state");

        
    if(adminstat==="in"){
    	
    	$('#drop1').addClass(""+adminstat+"");
    	
    }
    
    else{
    	
    	$('#drop1').removeClass(""+adminstat+"");
    }
    
	
   $("#adminPanel").click(function(){
	   
	   
	   
	   var classstate = $('#drop1').attr("class");
	   
	   
	   if(classstate=="collapse"){
		   
		   sessionStorage.setItem("state","in");
	   }
	   
       
	   else{
		   
		   sessionStorage.setItem("state","Not in");
	   }
    	
    	   	
    });
   
   
   
   
   
   var requeststat = sessionStorage.getItem("reqstate");

   
   if(requeststat==="in"){
   	
   	$('#drop2').addClass(""+requeststat+"");
   	
   }
   
   else{
   	
   	$('#drop2').removeClass(""+requeststat+"");
   }
   
	
  $("#requestPanel").click(function(){
	   
	 
	  
	   var classstate = $('#drop2').attr("class");
	   
	   
	   if(classstate=="collapse"){
		   
		   sessionStorage.setItem("reqstate","in");
	   }
	   
      
	   else{
		   
		   sessionStorage.setItem("reqstate","Not in");
	   }
   	
   	   	
   });
  
  
  
  
  var appauthstat = sessionStorage.getItem("AppAuthstate");

  
  if(appauthstat==="in"){
  	
  	$('#drop3').addClass(""+appauthstat+"");
  	
  }
  
  else{
  	
  	$('#drop3').removeClass(""+appauthstat+"");
  }
  
	
 $("#appauthPanel").click(function(){
	   
	  
	   
	   var classstate = $('#drop3').attr("class");
	   
	   
	   if(classstate=="collapse"){
		   
		   sessionStorage.setItem("AppAuthstate","in");
	   }
	   
     
	   else{
		   
		   sessionStorage.setItem("AppAuthstate","Not in");
	   }
  	
  	   	
  });
  

 
/*ADDING ACTIVE CLASS */ 
 
 if(sessionStorage.getItem("actstatus")==="active"){
	 
	 $('#empitem').addClass("active");
 }
 
 if(sessionStorage.getItem("deptactstatus")==="active"){
	 
	 $('#deptitem').addClass("active");
 }
 
 if(sessionStorage.getItem("desigactstatus")==="active"){
	 
	 $('#desigitem').addClass("active");
 }
 
 
if(sessionStorage.getItem("emptypestatus")==="active"){
	 
	 $('#emptypeitem').addClass("active");
 }


if(sessionStorage.getItem("umgtstatus")==="active"){
	 
	 $('#umgtitem').addClass("active");
}

if(sessionStorage.getItem("floatstatus")==="active"){
	 
	$('#floatitem').addClass("active");
}


if(sessionStorage.getItem("ioustatus")==="active"){
	 
	 $('#iouitem').addClass("active");
}

if(sessionStorage.getItem("voustatus")==="active"){
	 
	$('#vouitem').addClass("active");
}

if(sessionStorage.getItem("returnstatus")==="active"){
	 
	 $('#returnitem').addClass("active");
}

if(sessionStorage.getItem("appstatus")==="active"){
	 
	$('#appitem').addClass("active");
}

if(sessionStorage.getItem("authstatus")==="active"){
	 
	$('#authitem').addClass("active");
}


if(sessionStorage.getItem("passstatus")==="active"){
	 
	$('#passitem').addClass("active");
}



 
 $( "#empitem" ).on( "click", function() {
	  
	   $('#empitem').addClass("active");
	   sessionStorage.setItem("actstatus","active");
	   sessionStorage.removeItem("deptactstatus");
	   sessionStorage.removeItem("desigactstatus");
	   sessionStorage.removeItem("emptypestatus");
	   sessionStorage.removeItem("umgtstatus");
	   sessionStorage.removeItem("floatstatus");
	   sessionStorage.removeItem("ioustatus");
	   sessionStorage.removeItem("voustatus");
	   sessionStorage.removeItem("returnstatus");
	   sessionStorage.removeItem("appstatus");
	   sessionStorage.removeItem("authstatus");
	   sessionStorage.removeItem("passstatus");
 });
 
 
 $( "#deptitem" ).on( "click", function() {
	  
	   $('#deptitem').addClass("active");
	   sessionStorage.setItem("deptactstatus","active");
	   sessionStorage.removeItem("actstatus");
	   sessionStorage.removeItem("desigactstatus");
	   sessionStorage.removeItem("emptypestatus");
	   sessionStorage.removeItem("umgtstatus");
	   sessionStorage.removeItem("floatstatus");
	   sessionStorage.removeItem("ioustatus");
	   sessionStorage.removeItem("voustatus");
	   sessionStorage.removeItem("returnstatus");
	   sessionStorage.removeItem("appstatus");
	   sessionStorage.removeItem("authstatus");
	   sessionStorage.removeItem("passstatus");
	   
});
 
 
 $( "#desigitem" ).on( "click", function() {
	  
	   $('#desigitem').addClass("active");
	   sessionStorage.setItem("desigactstatus","active");
	   sessionStorage.removeItem("actstatus");
	   sessionStorage.removeItem("deptactstatus");
	   sessionStorage.removeItem("emptypestatus");
	   sessionStorage.removeItem("umgtstatus");
	   sessionStorage.removeItem("floatstatus");
	   sessionStorage.removeItem("ioustatus");
	   sessionStorage.removeItem("voustatus");
	   sessionStorage.removeItem("returnstatus");
	   sessionStorage.removeItem("appstatus");
	   sessionStorage.removeItem("authstatus");
	   sessionStorage.removeItem("passstatus");
	   
});
 
 
 $( "#emptypeitem" ).on( "click", function() {
	  
	   $('#emptypeitem').addClass("active");
	   sessionStorage.setItem("emptypestatus","active");
	   sessionStorage.removeItem("deptactstatus");
	   sessionStorage.removeItem("desigactstatus");
	   sessionStorage.removeItem("actstatus");
	   sessionStorage.removeItem("umgtstatus");
	   sessionStorage.removeItem("floatstatus");
	   sessionStorage.removeItem("ioustatus");
	   sessionStorage.removeItem("voustatus");
	   sessionStorage.removeItem("returnstatus");
	   sessionStorage.removeItem("appstatus");
	   sessionStorage.removeItem("authstatus");
	   sessionStorage.removeItem("passstatus");
	   
});
 
 
 $( "#umgtitem" ).on( "click", function() {
	  
	   $('#umgtitem').addClass("active");
	   sessionStorage.setItem("umgtstatus","active");
	   sessionStorage.removeItem("deptactstatus");
	   sessionStorage.removeItem("desigactstatus");
	   sessionStorage.removeItem("actstatus");
	   sessionStorage.removeItem("emptypestatus");
	   sessionStorage.removeItem("floatstatus");	  
	   sessionStorage.removeItem("ioustatus");
	   sessionStorage.removeItem("voustatus");
	   sessionStorage.removeItem("returnstatus");
	   sessionStorage.removeItem("appstatus");
	   sessionStorage.removeItem("authstatus");
	   sessionStorage.removeItem("passstatus");
	   
}); 
 
 $( "#floatitem" ).on( "click", function() {
	  
	   $('#floatitem').addClass("active");
	   sessionStorage.setItem("floatstatus","active");
	   sessionStorage.removeItem("deptactstatus");
	   sessionStorage.removeItem("desigactstatus");
	   sessionStorage.removeItem("actstatus");
	   sessionStorage.removeItem("emptypestatus");
	   sessionStorage.removeItem("umgtstatus");
	   sessionStorage.removeItem("ioustatus");
	   sessionStorage.removeItem("voustatus");
	   sessionStorage.removeItem("returnstatus");
	   sessionStorage.removeItem("appstatus");
	   sessionStorage.removeItem("authstatus");
	   sessionStorage.removeItem("passstatus");
	   
});
 
 
 $( "#iouitem" ).on( "click", function() {
	  
	   $('#iouitem').addClass("active");
	   sessionStorage.setItem("ioustatus","active");
	   sessionStorage.removeItem("deptactstatus");
	   sessionStorage.removeItem("desigactstatus");
	   sessionStorage.removeItem("actstatus");
	   sessionStorage.removeItem("emptypestatus");
	   sessionStorage.removeItem("umgtstatus");
	   sessionStorage.removeItem("floatstatus");
	   sessionStorage.removeItem("voustatus");
	   sessionStorage.removeItem("returnstatus");
	   sessionStorage.removeItem("appstatus");
	   sessionStorage.removeItem("authstatus");
	   sessionStorage.removeItem("passstatus");
	   
	   
}); 
 
 
 $( "#vouitem" ).on( "click", function() {
	  
	   $('#vouitem').addClass("active");
	   sessionStorage.setItem("voustatus","active");
	   sessionStorage.removeItem("deptactstatus");
	   sessionStorage.removeItem("desigactstatus");
	   sessionStorage.removeItem("actstatus");
	   sessionStorage.removeItem("emptypestatus");
	   sessionStorage.removeItem("umgtstatus");
	   sessionStorage.removeItem("floatstatus");
	   sessionStorage.removeItem("ioustatus");
	   sessionStorage.removeItem("returnstatus");
	   sessionStorage.removeItem("appstatus");
	   sessionStorage.removeItem("authstatus");
	   sessionStorage.removeItem("passstatus");
	   
	   
});
 

 $( "#returnitem" ).on( "click", function() {
	  
	   $('#returnitem').addClass("active");
	   sessionStorage.setItem("returnstatus","active");
	   sessionStorage.removeItem("deptactstatus");
	   sessionStorage.removeItem("desigactstatus");
	   sessionStorage.removeItem("actstatus");
	   sessionStorage.removeItem("emptypestatus");
	   sessionStorage.removeItem("umgtstatus");
	   sessionStorage.removeItem("floatstatus");
	   sessionStorage.removeItem("ioustatus");
	   sessionStorage.removeItem("voustatus");
	   sessionStorage.removeItem("appstatus");
	   sessionStorage.removeItem("authstatus");
	   sessionStorage.removeItem("passstatus");
	   
	   
}); 
 
 
 $( "#appitem" ).on( "click", function() {
	  
	   $('#appitem').addClass("active");
	   sessionStorage.setItem("appstatus","active");
	   sessionStorage.removeItem("deptactstatus");
	   sessionStorage.removeItem("desigactstatus");
	   sessionStorage.removeItem("actstatus");
	   sessionStorage.removeItem("emptypestatus");
	   sessionStorage.removeItem("umgtstatus");
	   sessionStorage.removeItem("floatstatus");
	   sessionStorage.removeItem("ioustatus");
	   sessionStorage.removeItem("voustatus");
	   sessionStorage.removeItem("returnstatus");
	   sessionStorage.removeItem("authstatus");
	   sessionStorage.removeItem("passstatus");
	   
	   
}); 
 
 
 $( "#authitem" ).on( "click", function() {
	  
	   $('#authitem').addClass("active");
	   sessionStorage.setItem("authstatus","active");
	   sessionStorage.removeItem("deptactstatus");
	   sessionStorage.removeItem("desigactstatus");
	   sessionStorage.removeItem("actstatus");
	   sessionStorage.removeItem("emptypestatus");
	   sessionStorage.removeItem("umgtstatus");
	   sessionStorage.removeItem("floatstatus");
	   sessionStorage.removeItem("ioustatus");
	   sessionStorage.removeItem("voustatus");
	   sessionStorage.removeItem("returnstatus");
	   sessionStorage.removeItem("appstatus");
	   sessionStorage.removeItem("passstatus");
	   
	   
}); 
 
 
 $( "#passitem" ).on( "click", function() {
	  
	   $('#passitem').addClass("active");
	   sessionStorage.setItem("passstatus","active");
	   sessionStorage.removeItem("deptactstatus");
	   sessionStorage.removeItem("desigactstatus");
	   sessionStorage.removeItem("actstatus");
	   sessionStorage.removeItem("emptypestatus");
	   sessionStorage.removeItem("umgtstatus");
	   sessionStorage.removeItem("floatstatus");
	   sessionStorage.removeItem("ioustatus");
	   sessionStorage.removeItem("voustatus");
	   sessionStorage.removeItem("returnstatus");
	   sessionStorage.removeItem("appstatus");
	   sessionStorage.removeItem("authstatus");
	   
	   
}); 
 
 
 $( "#sessionClear" ).on( "click", function() {
	  
 
	 sessionStorage.clear(); 
	   
});  
    
    
});