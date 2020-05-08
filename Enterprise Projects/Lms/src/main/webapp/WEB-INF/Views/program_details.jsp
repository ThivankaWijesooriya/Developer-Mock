
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>

    <link href="<c:url value="/resources/css/styles.css" />" rel="stylesheet">
    <link href="<c:url value="/resources/css/semantic.css" />" rel="stylesheet">
    <link href="<c:url value="/resources/css/jquery.dataTables.css" />" rel="stylesheet">
    <link href="<c:url value="/resources/css/font-awesome.css" />" rel="stylesheet">
    <script src="<c:url value="/resources/js/jquery.js" />"></script>
    <script src="<c:url value="/resources/js/scripts.js" />"></script>
    <script src="<c:url value="/resources/js/semantic.js" />"></script>
     <script src="<c:url value="/resources/js/jquery.dataTables.js" />"></script>

<style>

body{

  background:#5c08fb69;

}

</style>




</head>

<body>

<div class="content_bar">

	    <div class="vihayas_datatable">



        <div class="fr_left_buttons">

            <button class="ui primary button addpartnerbtn">
  Add Programs
</button>


        </div>

        <div class="fr_right_buttons">
            <div class="ui action input">
                <input type="text" placeholder="Search " id="searchkey" value="">
                <select class="ui compact selection dropdown searchoption">
   
    <option selected="" value="Partner_Code">ProgramName</option>
    <option value="Partner_Name">Specialization</option>
     <option value="Country">SpecialComments</option>
   
  </select>
                <div type="submit" class="ui button" id="searchtrigger">Search</div>
            </div>
        </div>

        <div class="sr_left_buttons">





        </div>

        <div class="sr_right_buttons">
            <div class="ui teal buttons">
                <div class="ui button modifypartbtn" >Modify </div>
                <div class="ui floating dropdown icon button">
                    <i class="dropdown icon"></i>
                    <div class="menu">

                        <div class="item"><i class="delete icon"></i> View</div>

                    </div>
                </div>
            </div>
        </div>
        <div class="data_table">
        
        <table class="ui single line table" id="tblprogramDetails"></table>

<!--             <table class="ui celled table transition visible" style="display: block !important;">
                <thead>
                    <tr>
                        <th></th>
                        <th>Program Name</th>
                        <th>Field of Specialization</th>
                        <th>Date of Accreditation</th>
                        <th>Special Comments</th>
                        <th width="10.9%">Action</th>
                    </tr>
                </thead>
                <tbody id="tblprogramdetails">
                    <tr>


                        <td>

                            <div class="ui checkbox">
                                <input type="checkbox" name="example">
                                <label></label>
                            </div>

                        </td>

                        <td id="uniname"></td>

                        <td></td>


                        <td></td>

                        <td> </td>

                        <td style="padding-left: 19px;padding-right: 19px;">

                            <div class="ui teal buttons fluid">
                                <div class="ui button modifypartbtn">Modify </div>
                                <div class="ui floating dropdown icon button">
                                    <i class="dropdown icon"></i>

                                    <div class="menu modifydiv">
                                        <div class="item modifyinner" ><i class="remove user icon"></i> View </div>

                                    </div>


                                </div>
                            </div>


                        </td>


                    </tr>


                </tbody>

            </table> -->

        </div>
    </div>



    <!-- Start of models -->

<div class="ui modal addprogram">

        <div class="header">Program Details</div>

        <div class="scrolling content">


            <form class="ui form">


                <div class="two fields">
                    <div class="field">
                        <label>Program Name</label>
                        <input type="text" name="" placeholder="" id="ProgramName" value="">
                    </div>
                    <div class="field">
                        <label>Program Code</label>
                        <input type="text" name="" placeholder="" id="ProgramCode" value="">
                    </div>
                </div>

                <div class="field">
                    <label>Field of Specialization</label>
                    <div class="ui selection dropdown field">
                        <input type="hidden" name="">
                        <i class="dropdown icon"></i>
                        <div class="default text" id="idfield">Select field</div>
                        <div class="menu">
                            <div class="item" data-value="1">Finance</div>
                            <div class="item" data-value="0">IT</div>
                        </div>
                    </div>
                </div>

               <div class="two fields">
                <div class="field">
                    <label>Academic Partner</label>
                    
                  <!--  <div class="ui loading selection dropdown">
  Search Partner... <i class="dropdown icon"></i>
  <div class="menu">
    <div class="item">University of London</div>
    <div class="item">University of Toronto</div>
    <div class="item">University of Colombo</div>
  </div>
</div> -->
               
               <div class="ui selection dropdown academicdropdown">
  <input type="hidden" name="gender">
  <i class="dropdown icon"></i>
  <div class="default text" id="idpartner">Select Academic Partner</div>
  <div class="menu" id="targetpartner">
    <div class="item" >University of London</div>
    <div class="item" >University of Toronto</div>
    <div class="item">University of Colombo</div>
  </div>
</div>     
                    
 
                </div>
                
                <div class="field">
                  <br/>
                   <label></label>
                    <div class="ui primary button" id="addmaintbl">
  Add
</div>

                    
                </div>
                </div>

<br/>
                <div class="field">
                
                <table class="ui very basic table" id="tblmain"></table>
                    

<!--                     <table class="ui selectable celled table">
  <thead>
    <tr>
      <th>NAME</th>
      <th>ACCREDITED DATE</th>
      <th>STATUS</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td></td>
      <td></td>
      <td></td>
    </tr>
   
   
   
    
    
  </tbody>
</table> -->



                </div>




                <div class="two fields">
                   
                    <div class="field">
                       <label>Date of Accreditation</label>
                        <input type="date" name="" placeholder="" id="Date_Of_Accreditation" value="">
                    </div>
                    <div class="field">
                       <label>Until</label>
                        <input type="date" name="" placeholder="" id="Until" value="">
                    </div>
                </div>

       
               <div class="two fields">        
 <div class="field">
                    <label>Total Duration of Programme</label>
                    <div class="ui selection dropdown duration">
                        <input type="hidden" name="">
                        <i class="dropdown icon"></i>
                        <div class="default text" id="idprogram"></div>
                        <div class="menu">
                            <div class="item" data-value="1">Month</div>
                            <div class="item" data-value="0">1</div>
                             <div class="item" data-value="0">2</div>
                              <div class="item" data-value="0">3</div>
                        </div>
                    </div>
                </div>
                
                <div class="field">
                    <label>Entry Requirement</label>
                    
                    <select class="ui dropdown requirements" id="targetqual">
  <option>Scottish Qualification Authority</option>
  <option>Other</option>
 
</select>
                    
                    
                  <!--    <div class="ui selection dropdown requirements">
                        <input type="hidden" name="">
                        <i class="dropdown icon"></i>
                        <div class="default text" id="identryqualification"></div>
                        <div class="menu" id="targetqual">
                            
                        </div>
                    </div> -->
                  
                </div>
                </div>





                <div class="two fields">
                    <div class="field">
                    
                    <label>Level</label>
                    
<select class="ui dropdown framework" id="targetlev">
  
 
</select>
                    
                    </div>
                    <div class="field" >
                        <br>
                       <div class="ui primary button" id="addqualbtn">
  Add
</div>
                    </div>
                </div>

    <br/>           
               
                <div class="field">
                
                <table class="ui very basic table" id="tblqualification"></table>
<!--                                        <table class="ui selectable celled table">
  <thead>
    <tr>
      <th>QUALIFICATION FRAMEWORK</th>
      <th>QUALIFICATION FRAMEWORK LEVEL</th>
      
    </tr>
  </thead>
  <tbody>
    <tr>
      <td></td>
      <td></td>
      
    </tr>
   
   
   
    
    
  </tbody>
</table> -->


                       
                    </div>
                    
                    
                    
                     <div class="field">
                       


                       <label>Special Comments on Entry Requirements</label>
    <textarea rows="2" id="SpecialComments" value=""></textarea>
                    </div>
                    
                     <div class="field">
                       


                       <label>Other Extraordinary Exemptions</label>
    <textarea rows="2" id="OtherExemptions" value=""></textarea>
                    </div>
               
               
                <div class="two fields">
                    <div class="field">
                        <label>Add Award</label>
                        <div class="ui loading fluid single search selection dropdown awarddrop">
  <input type="hidden" name="" value="kp">
  <div class="default text">Search...</div>
  <i class="dropdown icon"></i>
  <input class="search">
  
  <div class="menu" id="triggeraward">
   
  </div>
</div>
                    </div>


                    <div class="field">
                       <br/>
                        <label for=""></label>
                        <div class="ui primary button" id="add">
  Add
</div>
                       
                    </div>
                </div>

     <br/>          
<div class="field">
    
     <table class="ui very basic table" id="tblawardprogram"></table>
<!--               <table class="ui selectable celled table">
  <thead>
    <tr>
      <th>AWARD CODE</th>
      <th>AWARD NAME</th>
      <th>LEVEL</th>
      <th>DURATION</th>
      <th>DETAILS</th>
      
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>Deakin-0047</td>
      <td>Deakin Foundation Engineering</td>
       <td>null</td>
       <td>0</td>
        <td> <a class="ui red label">
    Delete
   
  </a> </td>
      
    </tr>
   
   
   
    
    
  </tbody>
</table> -->
    
    
</div>

     <br/>           
                <div class="field">

                    <div class="ui primary button" id="addprogramdb">
  Save
</div>
                    <div class="ui button">
  Discard
</div>

                </div>

            </form>



        </div>


    </div>
    

    <!-- End of models -->





   

    <script>
        

       
       
        
        
        var modifyid;
        var MainAcademicArray=[];
        var mainqualiarray=[];
        var Mainawardarr=[];
        var AN; //partnername
		var AD;//Accre date
		var AS;//status
        
        $(document).ready(function() {
            $(".addpartnerbtn").click(function() {
                $('.ui.modal.addprogram').modal('show');
                
           
           });
            
            
            $(".modifypartbtn").click(function(){
            	$('.ui.modal.addprogram').modal('show');
            });
            
            
            
            
           var xx = JSON.parse('${Academic}');
            
		 	var plist="";
			
			$.each(xx, function(key2, value2) {
				 //console.log(value1.AwardName);
				  		
				  		 plist = plist
						+ ("<div class=\"item\">"+value2.AcademicPartnerName+"<\/div>"); 

			});
			$("#targetpartner").empty().append(
					plist); 
			
			
            var awardprograms = JSON.parse('${awardprogram}');
            
			var awardlist="";
			/* console.log(obj); */
			$.each(awardprograms, function(key1, value1) {
				 //console.log(value1.AwardName);
				  		
				  		 awardlist = awardlist
						+ ("<div class=\"item\">"+value1.AwardName+"<\/div>"); 

			});
			$("#triggeraward").empty().append(
					awardlist);
			
			
			var QualificationF = JSON.parse('${Qualiframe}');
			var quallist="";
			/* console.log(obj); */
			$.each(QualificationF, function(key7, value7) {
				 //console.log(key1);
				  		/* console.log(value1.Name);  */
				  		quallist = quallist
						+ ("<option>"+key7+"<\/option>");              

			});
			$("#targetqual").empty().append(
					quallist);
			
			$(".requirements").change(function() {
				 
				  
				  var selectqual = $('.requirements').dropdown('get text');
				  
				 /*  var object123=QualificationFrame[selectqual]; */
					var changelist="";
					
					$.each(QualificationF, function(key8, value8) {
						// console.log(key1);
						  		/* console.log(value1.Name);  */
						  		
				 		  		
				 $.each(value8, function(key9, value9) {
						 
						  		if(key8==selectqual){
						  			
						  			changelist = changelist
									+ ("<option>"+QualificationF[""+selectqual+""][""+key9+""].Level+"<\/option>");
						  			
						  			
						  			
						  		} 
						  		
						  		

					});		
						  		
						  		

					});
					$("#targetlev").empty().append(
							changelist);
				  
				});
			

 
            
      $('#tblawardprogram').DataTable({
    			
    			"paging" : false,
    			"ordering" : false,
    			"info" : false,
    			"search" : false,

    			columns : [  {
    				title : "AWARD CODE"
    				}, 
    				{
    				title : "AWARD NAME"
    				},
    				{
    				title : "DURATION"
    				}
    				
    				]
    		}); 
    		
    		
    		$('#tblawardprogram_filter').hide();  
    		
    		
            
            $('#tblmain').DataTable({
    			
    			"paging" : false,
    			"ordering" : false,
    			"info" : false,
    			"search" : false,

    			columns : [  {
    				title : "NAME"
    				}, 
    				{
    				title : "ACCREDITED DATE"
    				},
    				{
    				title : "STATUS"
    				}
    				
    				]
    		}); 
    		
    		
    		$('#tblmain_filter').hide();  
    		
    		
           $('#tblqualification').DataTable({
    			
    			"paging" : false,
    			"ordering" : false,
    			"info" : false,
    			"search" : false,

    			columns : [  {
    				title : "QUALIFICATION FRAMEWORK"
    				}, 
    				{
    				title : "QUALIFICATION FRAMEWORK LEVEL"
    				}
    				
    				
    				]
    		}); 
    		
    		
    		$('#tblqualification_filter').hide(); 
    		
    		
    		
$('#tblprogramDetails').DataTable({
				
				"paging" : false,
				"ordering" : false,
				"info" : false,
				"search" : false,
				

				columns : [  {
					title : ""
					}, 
					{
					title : "keys"
					},
					
					{
						title : "Program Name"
					},
					{
						title : "Field of Specialization"
					},
					
					{
						title : "Date of Accreditation"
					},
					
					{
						title : "Special Comments"
					},
					{
						title : "Action"
					}
		
					
					]
		    

		    
			});
			
			$('#tblprogramDetails_filter').hide();
			
			console.log('${ProgramDetails}');
			var ProgramDetails = JSON.parse('${ProgramDetails}');
			
			$.each(ProgramDetails, function(key, value) {

				//console.log(key);
					
					
					var checkbox="";
	checkbox += "<td>";
	checkbox += "";
	checkbox += "							<div class=\"ui checkbox\">";
	checkbox += "								<input type=\"checkbox\" name=\"example\"> <label><\/label>";
	checkbox += "							<\/div>";
	checkbox += "";
	checkbox += "						<\/td>";


	
	
	var multiaction="";
	multiaction += "<div class=\"ui teal buttons\">";
	multiaction += "				<div class=\"ui button modifyprogram\" >Modify<\/div>";
	multiaction += "				<div class=\"ui floating dropdown icon button\">";
	multiaction += "					<i class=\"dropdown icon\"><\/i>";
	multiaction += "					<div class=\"menu\">";
	multiaction += "";
	multiaction += "						<div class=\"item viewprogram\">";
	multiaction += "							<i class=\"delete icon\"><\/i> View";
	multiaction += "						<\/div>";
	multiaction += "					";
	multiaction += "						<div class=\"item approveprogram\">";
	multiaction += "							<i class=\"delete icon\"><\/i> Approve";
	multiaction += "						<\/div>";
	multiaction += "						<div class=\"item declineprogram\">";
	multiaction += "							<i class=\"delete icon\"><\/i> Decline";
	multiaction += "						<\/div>";
	multiaction += "						<div class=\"item suspendprogram\">";
	multiaction += "							<i class=\"delete icon\"><\/i> Suspend";
	multiaction += "						<\/div>";
	multiaction += "						<div class=\"item deactivateprogram\">";
	multiaction += "							<i class=\"delete icon\"><\/i> Deactivate";
	multiaction += "						<\/div>";
	multiaction += "						";
	multiaction += "";
	multiaction += "					<\/div>";
	multiaction += "				<\/div>";
	multiaction += "			<\/div>";



					
				$('#tblprogramDetails').DataTable().row.add([checkbox,key,value.ProgramName,value.Field_Of_Specialization,value.Date_Of_Accreditation,value.SpecialComments,multiaction]).draw();
				
					


				});
			
			
			$(".modifyprogram").click(function(){
				
				 $('.ui.modal.addprogram').modal('show');
			    
			       var table = $('#tblprogramDetails').DataTable();
					 
					$('#tblprogramDetails tbody').on( 'click', 'tr', function () {
					     modifyid= ( table.row( this ).data()[1] );
					    //tempid =idcapture;
					    
					   
					   action = "Update";
					   
					   $('#ProgramName').attr("disabled", false); 
					   $('#ProgramCode').attr("disabled", false); 
					   $('#Date_Of_Accreditation').attr("disabled", false); 
					   $('#SpecialComments').attr("disabled", false); 
					   $('#OtherExemptions').attr("disabled", false); 
					  
					  
					   $('#Until').attr("disabled", false); 
					   $('.field').removeClass('disabled');
					   $('.academicdropdown').removeClass('disabled');
					   $('.duration').removeClass('disabled');
					   $('.requirements').removeClass('disabled');   
					   $('.framework').removeClass('disabled');
					   $('.awarddrop').removeClass('disabled');
					   
					   
					   
					    var tbl = $('#tblmain').DataTable();
					    
					    tbl.clear().draw();
					    
					    var tbl2 = $('#tblqualification').DataTable();
					    
					    tbl2.clear().draw();    
					    
					    var tbl3 = $('#tblawardprogram').DataTable();
					    
					    tbl3.clear().draw();
	    
	    
					  
					   
					   var programDetailsSET = JSON.parse('${ProgramDetails}');
					   
					   var da= programDetailsSET[""+modifyid+""].Date_Of_Accreditation;
					   var fs= programDetailsSET[""+modifyid+""].Field_Of_Specialization;				
					   var oe= programDetailsSET[""+modifyid+""].OtherExemptions;
					   var pn= programDetailsSET[""+modifyid+""].ProgramName;
					   var sc= programDetailsSET[""+modifyid+""].SpecialComments;
					   var td= programDetailsSET[""+modifyid+""].Total_Duration_Of_Programme;
					   var un= programDetailsSET[""+modifyid+""].Until;
					   
					   
					   
					   
					   $.each(programDetailsSET, function(key5, value5){
						   
						   
						   
						   if(key5==modifyid){
							   
							  // console.log(value5);
								   $.each(value5, function(key6, value6){
									   
								      // console.log(value6);
								      
								      
								      if(key6=="Award"){
								    	  
								    	  $.each(value6, function(key12, value12){
								    		  
								    		 //console.log(key12) ;
								    		 
								    		 var acode= value12.AwardCode;
								    		  var aname=value12.AwardName;
								    		  var dur=value12.Duration;
								    		  
								    		  
									        	var Award={
									        			
										        		
									        			"AwardCode":acode,
									        			"AwardName":aname,
									        			"Duration":dur
									        			
									        		
									        			
									        	}
									        	
									        	Mainawardarr.push(Award);
									        	
									        	
									        	$('#tblawardprogram').DataTable().row.add([ acode,aname,dur ]).draw();
								    		  
								    		  
								    	  });
								    	  
								      }
								      
								      if(key6=="QualificationFrameWork"){
								    	  
	                                       $.each(value6, function(key9, value9){
								    		   
								    		   //console.log(value9);
								    		    $.each(value9, function(key10, value10){
								    		    	var lvl= value10.Level;
								    		    	
								    		    	var qualificationframe={
										    				
								    		    			[key10]:{
								    		    				
								    		    				"Level":lvl
								    		    			}	
								    		    				
								    		    		}
								    		    		
								    		    		mainqualiarray.push(qualificationframe);
								    		    	    //console.log(mainqualiarray);
								    		    		
								    		    		$('#tblqualification').DataTable().row.add([ key10,lvl ]).draw(); 
								    		    	
								    		    	
								    		    });
								    		
								    		   
								    		   
								    		   
								    	   });
								    	  	  
								    	  
								      }
								       if(key6=="AcademicPartner"){
								    	   
								    	   $.each(value6, function(key7, value7){
								    		   
								    		   AN=value7.AcademicPartnerName;
								    		   AD=value7.AccreditedDate;
								    		   AS=value7.Status;
								    		   
								    			var AcademicPartner={
										        		
									        			"AcademicPartnerName":AN,
									        			"Status":AS,
									        			"AccreditedDate":AD
									        		
									        	}
									        	
									        	
									        	MainAcademicArray.push(AcademicPartner);
								    			
								    			$('#tblmain').DataTable().row.add([ AN,AD,AS ]).draw(); 
								    		   
								    		   
								    		   
								    	   });
								    	   
								       }
									   
								   }); 
								   
							   
							   
						   }
						   
					   });
			    
					   $("#ProgramName").val(pn);				   
					   $("#ProgramCode").val(modifyid);
					   $("#idfield").text(fs).addClass("text"); 
					   $("#OtherExemptions").val(oe);
					   $("#Date_Of_Accreditation").val(da);
					   $("#SpecialComments").val(sc);
					   $("#idprogram").text(td);
					   $("#Until").val(un);
					   
					   
			    
			});
					
			});
			
			
			
						
			
			$(".viewprogram").click(function () {
		        $('.ui.modal.addprogram').modal('show');
		        
		        
		         var table = $('#tblprogramDetails').DataTable();
				 
				$('#tblprogramDetails tbody').on( 'click', 'tr', function () {
				    var idcapture= ( table.row( this ).data()[1] );
				    //tempid =idcapture;
				    
				    
				    var tbl = $('#tblmain').DataTable();
 
				    tbl.clear().draw();
				    
				    var tbl2 = $('#tblqualification').DataTable();
				    
				    tbl2.clear().draw();    
				    
				    var tbl3 = $('#tblawardprogram').DataTable();
				    
				    tbl3.clear().draw();
    
    
				  
				   
				   var programDetailsSET = JSON.parse('${ProgramDetails}');
				   
				   var da= programDetailsSET[""+idcapture+""].Date_Of_Accreditation;
				   var fs= programDetailsSET[""+idcapture+""].Field_Of_Specialization;				
				   var oe= programDetailsSET[""+idcapture+""].OtherExemptions;
				   var pn= programDetailsSET[""+idcapture+""].ProgramName;
				   var sc= programDetailsSET[""+idcapture+""].SpecialComments;
				   var td= programDetailsSET[""+idcapture+""].Total_Duration_Of_Programme;
				   var un= programDetailsSET[""+idcapture+""].Until;
				   
				   
				   
				   
				   $.each(programDetailsSET, function(key5, value5){
					   
					   
					   
					   if(key5==idcapture){
						   
						  // console.log(value5);
							   $.each(value5, function(key6, value6){
								   
							      // console.log(value6);
							      
							      
							      if(key6=="Award"){
							    	  
							    	  $.each(value6, function(key12, value12){
							    		  
							    		 //console.log(key12) ;
							    		 
							    		 var acode= value12.AwardCode;
							    		  var aname=value12.AwardName;
							    		  var dur=value12.Duration;
							    		  
							    		  
								        	var Award={
								        			
									        		
								        			"AwardCode":acode,
								        			"AwardName":aname,
								        			"Duration":dur
								        			
								        		
								        			
								        	}
								        	
								        	Mainawardarr.push(Award);
								        	
								        	
								        	$('#tblawardprogram').DataTable().row.add([ acode,aname,dur ]).draw();
							    		  
							    		  
							    	  });
							    	  
							      }
							      
							      if(key6=="QualificationFrameWork"){
							    	  
                                       $.each(value6, function(key9, value9){
							    		   
							    		   //console.log(value9);
							    		    $.each(value9, function(key10, value10){
							    		    	var lvl= value10.Level;
							    		    	
							    		    	var qualificationframe={
									    				
							    		    			[key10]:{
							    		    				
							    		    				"Level":lvl
							    		    			}	
							    		    				
							    		    		}
							    		    		
							    		    		mainqualiarray.push(qualificationframe);
							    		    	    //console.log(mainqualiarray);
							    		    		
							    		    		$('#tblqualification').DataTable().row.add([ key10,lvl ]).draw(); 
							    		    	
							    		    	
							    		    });
							    		
							    		   
							    		   
							    		   
							    	   });
							    	  	  
							    	  
							      }
							       if(key6=="AcademicPartner"){
							    	   
							    	   $.each(value6, function(key7, value7){
							    		   
							    		   AN=value7.AcademicPartnerName;
							    		   AD=value7.AccreditedDate;
							    		   AS=value7.Status;
							    		   
							    			var AcademicPartner={
									        		
								        			"AcademicPartnerName":AN,
								        			"Status":AS,
								        			"AccreditedDate":AD
								        		
								        	}
								        	
								        	
								        	MainAcademicArray.push(AcademicPartner);
							    			
							    			$('#tblmain').DataTable().row.add([ AN,AD,AS ]).draw(); 
							    		   
							    		   
							    		   
							    	   });
							    	   
							       }
								   
							   }); 
							   
						   
						   
					   }
					   
				   });
				   
				  
				  	
		        	
		    		
		    		
 
				   
				   
				  
				   $("#ProgramName").val(pn);				   
				   $("#ProgramCode").val(idcapture);
				   $("#idfield").text(fs).addClass("text"); 
				   $("#OtherExemptions").val(oe);
				   $("#Date_Of_Accreditation").val(da);
				   $("#SpecialComments").val(sc);
				   $("#idprogram").text(td);
				   $("#Until").val(un);
				  
				  
				   
				   
				   $('#ProgramName').attr("disabled", true); 
				   $('#ProgramCode').attr("disabled", true); 
				   $('#Date_Of_Accreditation').attr("disabled", true); 
				   $('#SpecialComments').attr("disabled", true); 
				   $('#OtherExemptions').attr("disabled", true); 
				  
				  
				   $('#Until').attr("disabled", true); 
				   $('.field').addClass('disabled');
				   $('.academicdropdown').addClass('disabled');
				   $('.duration').addClass('disabled');
				   $('.requirements').addClass('disabled');   
				   $('.framework').addClass('disabled');
				   $('.awarddrop').addClass('disabled');
				   
				   
				  
				 
				   
				   
				   /* $('.CurrentStatus').dropdown('get text'); */
				   
				    
				} );  
					
				
		    });
			
			
			var DateofAcredit;
			var Status;
	        
		        $("#addmaintbl").click(function(){
		        	
		        	var selectpartner = $('.selection.dropdown.academicdropdown').dropdown('get text');
		        	

		        	 var APL = JSON.parse('${Academic}');
		        	 $.each(APL, function(key4, value4){
		        		 
		        		 if(value4.AcademicPartnerName==selectpartner){
		        			 
		        			 //console.log(key4);
		        			DateofAcredit= APL[""+key4+""].Date_Of_Accreditation;
		        			Status= APL[""+key4+""].Status;
		        			 
		        		 }
		        		 
		        	 });
		        	
		    		
		        	
		        	
		        	
		        	
		        	var AcademicPartner={
		        		
		        			"AcademicPartnerName":selectpartner,
		        			"Status":Status,
		        			"AccreditedDate":DateofAcredit
		        		
		        	}
		        	
		        	
		        	MainAcademicArray.push(AcademicPartner);
		        	
		    		
		    		$('#tblmain').DataTable().row.add([ selectpartner,DateofAcredit,Status ]).draw(); 
		            
		        });
			
		        
		        
		       
		        $("#addqualbtn").click(function(){
		        	
		        	var tempEntry = $('.selection.dropdown.requirements').dropdown('get text');
		    		var tempQualification = $('.selection.dropdown.framework').dropdown('get text');
		    		
		    		
		    		var qualificationframe={
		    				
		    			[tempEntry]:{
		    				
		    				"Level":tempQualification
		    			}	
		    				
		    		}
		    		
		    		mainqualiarray.push(qualificationframe);
		    		
		    		$('#tblqualification').DataTable().row.add([ tempEntry,tempQualification ]).draw(); 
		              
		        });
		        
		        
		       
		        $("#add").click(function(){
		            
		        	var AwardName=$('.selection.dropdown.awarddrop').dropdown('get text');;
		        	
		        	
		        	
		        	 var awarddetails = JSON.parse('${awardprogram}');
		        	
		        	 $.each(awarddetails, function(key10, value10){
		        		 
		        		 if(value10.AwardName==AwardName){
		        			 
		        			 AwardCode=key10;
		        			 Duration=value10.Semester+" Semesters";
		        			 
		        		 }
		        		 
		        	 });
		        	 
		        	
		        	
		        	
		        	
	        	
		        	
		        	var Award={
		        			
		        		
		        			"AwardCode":AwardCode,
		        			"AwardName":AwardName,
		        			"Duration":Duration
		        			
		        		
		        			
		        	}
		        	
		        	Mainawardarr.push(Award);
		        	
		        	
		        	$('#tblawardprogram').DataTable().row.add([ AwardCode,AwardName,Duration ]).draw(); 
		        });
		        
		        
				$('#addprogramdb')
				.click(
						function() {
							var ProgramName = $("#ProgramName").val();
									
						
						
						  var Field_Of_Specialization = $('.selection.dropdown.field').dropdown('get text');
							
						
							var Date_Of_Accreditation = $("#Date_Of_Accreditation").val();
							
							var Until = $("#Until").val();
							
							var Total_Duration_Of_Programme = $('.selection.dropdown.duration').dropdown('get text');
							var Entry_Requirement = $('.selection.dropdown.requirements').dropdown('get text');
							var QualificationFramework = $('.selection.dropdown.framework').dropdown('get text');
							
							
							var SpecialComments = $("#SpecialComments").val();
							
							var OtherExemptions = $("#OtherExemptions").val();
							
							
							var data = {
								"ProgramName" : ProgramName,
								"Field_Of_Specialization" : Field_Of_Specialization,
								"AcademicPartner" :MainAcademicArray,
								"Date_Of_Accreditation" : Date_Of_Accreditation,
								"Until" : Until,
								"Total_Duration_Of_Programme" : Total_Duration_Of_Programme,
								"QualificationFrameWork" : mainqualiarray,
								"SpecialComments" : SpecialComments,
								"OtherExemptions" : OtherExemptions,
								"Award" : Mainawardarr
								
						

							};
							data = JSON.stringify(data);
							console.log("test");
							console.log(data);

							$.ajax({
										type : "POST",
										accept : "text/html",
										//contentType: "application/json; charset=utf-8",
										dataType : "html",
										url : "${pageContext.request.contextPath}/ap/program_details/add",
										data : ({
											"data" : data
											
										})
									});
							
							location.reload();

						});
			
				$("#searchtrigger").click(function(){
					   
					var option= $('.searchoption').dropdown('get text');
					
					if(option=="Specialization"){
						
						option= "Field_Of_Specialization";
					}
					
					var key =$("#searchkey").val().trim();
					 var ProgramDetailssearch = JSON.parse('${ProgramDetails}');
					 
					 $.each(ProgramDetailssearch, function(key5, value5){
						 
						 if(value5[""+option+""]==key){
							 
							 var newkey=key5;
							 var pn=value5.ProgramName;
							 var spl=value5.Field_Of_Specialization;
							 var sc=value5.SpecialComments;
							 
							 var tbl = $('#tblprogramDetails').DataTable();
							 
							 tbl.clear().draw();
							 
								var checkbox="";
								checkbox += "<td>";
								checkbox += "";
								checkbox += "							<div class=\"ui checkbox\">";
								checkbox += "								<input type=\"checkbox\" name=\"example\"> <label><\/label>";
								checkbox += "							<\/div>";
								checkbox += "";
								checkbox += "						<\/td>";



								var multiaction="";
								multiaction += "<div class=\"ui teal buttons\">";
								multiaction += "				<div class=\"ui button modifyprogram\" >Modify<\/div>";
								multiaction += "				<div class=\"ui floating dropdown icon button\">";
								multiaction += "					<i class=\"dropdown icon\"><\/i>";
								multiaction += "					<div class=\"menu\">";
								multiaction += "";
								multiaction += "						<div class=\"item viewprogram\">";
								multiaction += "							<i class=\"delete icon\"><\/i> View";
								multiaction += "						<\/div>";
								multiaction += "					";
								multiaction += "						<div class=\"item approveprogram\">";
								multiaction += "							<i class=\"delete icon\"><\/i> Approve";
								multiaction += "						<\/div>";
								multiaction += "						<div class=\"item declineprogram\">";
								multiaction += "							<i class=\"delete icon\"><\/i> Decline";
								multiaction += "						<\/div>";
								multiaction += "						<div class=\"item suspendprogram\">";
								multiaction += "							<i class=\"delete icon\"><\/i> Suspend";
								multiaction += "						<\/div>";
								multiaction += "						<div class=\"item deactivateprogram\">";
								multiaction += "							<i class=\"delete icon\"><\/i> Deactivate";
								multiaction += "						<\/div>";
								multiaction += "						";
								multiaction += "";
								multiaction += "					<\/div>";
								multiaction += "				<\/div>";
								multiaction += "			<\/div>";
							 
							 
								$('#tblprogramDetails').DataTable().row.add([checkbox,key5,pn,spl,value5.Date_Of_Accreditation,sc,multiaction]).draw();
							 
						 }
						 
						 $( "#searchkey" ).keyup(function() {
							 
							 var keycheck =$("#searchkey").val().trim().length;
							 
	                         var tbl2 = $('#tblprogramDetails').DataTable();
							 
	                         tbl2.clear().draw();
	                         
							  if(keycheck==0){
								  
									 var ProgramDetailschk = JSON.parse('${ProgramDetails}');
										
										$.each(ProgramDetailschk, function(key8, value8) {

										//console.log(key);
											
											
											var checkbox="";
							checkbox += "<td>";
							checkbox += "";
							checkbox += "							<div class=\"ui checkbox\">";
							checkbox += "								<input type=\"checkbox\" name=\"example\"> <label><\/label>";
							checkbox += "							<\/div>";
							checkbox += "";
							checkbox += "						<\/td>";



							var multiaction="";
							multiaction += "<div class=\"ui teal buttons\">";
							multiaction += "				<div class=\"ui button modifyprogram\" >Modify<\/div>";
							multiaction += "				<div class=\"ui floating dropdown icon button\">";
							multiaction += "					<i class=\"dropdown icon\"><\/i>";
							multiaction += "					<div class=\"menu\">";
							multiaction += "";
							multiaction += "						<div class=\"item viewprogram\">";
							multiaction += "							<i class=\"delete icon\"><\/i> View";
							multiaction += "						<\/div>";
							multiaction += "					";
							multiaction += "						<div class=\"item approveprogram\">";
							multiaction += "							<i class=\"delete icon\"><\/i> Approve";
							multiaction += "						<\/div>";
							multiaction += "						<div class=\"item declineprogram\">";
							multiaction += "							<i class=\"delete icon\"><\/i> Decline";
							multiaction += "						<\/div>";
							multiaction += "						<div class=\"item suspendprogram\">";
							multiaction += "							<i class=\"delete icon\"><\/i> Suspend";
							multiaction += "						<\/div>";
							multiaction += "						<div class=\"item deactivateprogram\">";
							multiaction += "							<i class=\"delete icon\"><\/i> Deactivate";
							multiaction += "						<\/div>";
							multiaction += "						";
							multiaction += "";
							multiaction += "					<\/div>";
							multiaction += "				<\/div>";
							multiaction += "			<\/div>";

											
							$('#tblprogramDetails').DataTable().row.add([checkbox,key8,value8.ProgramName,value8.Field_Of_Specialization,value8.Date_Of_Accreditation,value8.SpecialComments,multiaction]).draw();
										
											


										});
								  
								  
								  
								  
								  
								  
								  
							  }
							});
						 
						 
						 
					 });
					 
	                
	            });
				
				
				
				
				
				
            
			$('.dropdown')
            .dropdown({
                // you can use any ui transition
                transition: 'drop'
            });
            
        });
        
        
    
    </script>

</div>



</body>

</html>


