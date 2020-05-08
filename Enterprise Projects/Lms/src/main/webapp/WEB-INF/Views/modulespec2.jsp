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



    <div class="ui grid">


        <div class="row">

            <div class="one wide column"></div>

            <div class="fourteen wide column"> </div>


            <div class="one wide column"></div>

        </div>

        <div class="row">

            <div class="one wide column"></div>

            <div class="fourteen wide column">

<div class="ui styled fluid accordion">

  <div class="active title">
    <i class="dropdown icon"></i>
    Module Specification
  </div>
  <div class="active content">
  
                          <form class="ui form">
                          
                          <div class="two fields">
                    <div class="field" style="border: 0;">
                        <label>Upload Image</label> <br/>
                        <div class="ui transparent input">

                            <input type='file' class="inimg" onchange="readURL(this);" />
                        </div>

                    </div>
                    <div class="field">
                        <img id="blah" src="http://placehold.it/180" alt="your image" />
                    </div>
                </div>


 <div class="two fields">
                    <div class="field">

                        <label for="">Module Name</label>
                        <input type="text" name="" placeholder="" id="ModuleName" value="">
                    </div>
                    <div class="field">

                        <label for="">Module Code</label>
                        <input type="text" name="" placeholder="" id="ModuleCode">
                    </div>
                </div>


 <div class="two fields">
                    <div class="field">
                        <label for="">Total Learning Hours</label>

                        <input type="text" name="" placeholder="" id="LearningHours" value="">
                    </div>
                    <div class="field">
                        <label for="">Total Credits</label>
                        <input type="text" name="" placeholder="" id="TotalCredits">
                    </div>
                </div>
                
                 <div class="two fields">
                    <div class="field">
                        <label for="">Module Version</label>

                        <input type="text" name="" placeholder="" id="moduleversion" value="">
                    </div>

                </div>



                        </form>
    
  </div>
  <div class="title">
    <i class="dropdown icon"></i>
    Module Overview
  </div>
  <div class="content">
                             <form action="" class="ui form">

<div class="field">

<label>Overview</label>
                    <textarea id="Overview" value=""></textarea>
                </div>


                <div class="field">

                <label>Summary of the Learning Outcomes</label>
                    <textarea rows="2" id="SummaryLearning"></textarea>
                </div>
                        </form>
 
  </div>
  
  <div class="title">
    <i class="dropdown icon"></i>
    Syllabus Units
    
  </div>
  <div class="content">
                            <form class="ui form">

                 <div>
                 
                
                 
                 <div class="field">
                        <label for="">Unit Code</label>
                        <div class="ui action input">
                                                <div class="ui loading fluid single search selection dropdown MultiUnit">
  <input type="hidden" name="country" value="kp">
  <i class="dropdown icon"></i>
  <input class="search">
  <div class="default text">Search...</div>
  <div class="menu" id="unitmenu">
    <div class="item">Choice 1</div>
    
  </div>
</div>
                            <div class="ui icon button" style="background-color: #e74c3c;" id="addunittbl">
    <i class="fa fa-plus" aria-hidden="true" style="color: white;"></i>
  </div>
                        </div>

                    </div>
                 
               
                 
                 <div class="field">

                 <table class="ui very basic table" id="tblunits"></table>
                    <!-- <table class="ui celled table">
                        <thead>
                            <tr>
                                <th style="background-color: #827f7f;color: white;">UNIT CODE</th>
                                <th style="background-color: #827f7f;color: white;white-space: nowrap;">UNIT NAME</th>
                                <th style="background-color: #827f7f;color: white;white-space: nowrap;">VERSION</th>
                                <th style="background-color: #827f7f;color: white;white-space: nowrap;">WEIGHTING(%)</th>
                                <th style="background-color: #827f7f;color: white;white-space: nowrap;">SPECIFICATION</th>
                                
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td></td>
                                <td></td>
                                <td></td>
                                <td></td>
                                <td></td>
                                
                            </tr>


                        </tbody>

                    </table>
 -->

                </div>
                 
                 
                       <div class="field">

                <label>Reading List</label>
                    <textarea rows="2" id="ReadingList" value=""></textarea>
                </div>
                 
                 
                 </div>


                        </form>
    
    
  </div>
  
    <div class="title">
    <i class="dropdown icon"></i>
    Teaching Pattern
  </div>
  <div class="content">
    
                            <form class="ui form">
                        
                        <div class="field"> 
                        <div class="ui primary button addteachingpatternbtn" >
  Add Teaching Pattern
</div>
                        
                        </div>
                        

                 <div class="field">
                 
                 <table class="ui very basic table" id="tblteachingpattern"></table>
                 
<!--                  <table class="ui single line table">
  <thead>
    <tr>
      <th>UNIT CODE</th>
      <th>UNIT NAME</th>
      <th>TEACHING TYPE</th>
      <th>CONTACT HOURS</th>
      <th>SELF STUDY HOURS</th>
       <th>PLACEMENT HOURS</th>
        <th>TOTAL LEARNING HOURS</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td></td>
      <td></td>
      <td></td>
      <td>No</td>
      <td>No</td>
      <td>No</td>
      <td>No</td>
      
    </tr>
   

  </tbody>
</table> -->
                 
                 
                 
                 </div>


                        </form>
    
  </div>
  
  
  <div class="title">
    <i class="dropdown icon"></i>
    Assessment Pattern
  </div>
  <div class="content">
    
                            <form class="ui form">
                        
                                                <div class="field"> 
                        <div class="ui primary button assessbtn" >
  Add Assessment Pattern
</div>
                        
                        </div>

               <table class="ui very basic table" id="tblassessmentpattern"></table>
                                 <!-- <table class="ui single line table">
                    <thead>
                        <tr>
                            <th>UNIT CODE</th>
                            <th>ASSESSMENT TYPE</th>
                            <th>WEIGHTING</th>
                            <th>MINIMUM QUALIFIED MARK</th>
                            <th>ASSESSMENT SAMPLE</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td>John Lilki</td>
                            <td>September 14, 2013</td>
                            <td>jhlilk22@yahoo.com</td>
                            <td>No</td>
                            <td>No</td>
                        </tr>


                    </tbody>
                </table> -->

                       <div class="field">
                    <label for="">Assessment Criteria</label>

                    <textarea name="" id="AssessmentCriteria" rowspan="3" value=""></textarea>

                </div>

                <div class="field">
                    <label for="">Feedback on Assessment</label>
                    <textarea name="" id="FeedBack" rowspan="3" value=""></textarea>

                </div>


                <div class="field">

                    <label for="">Assessment Regulations</label>

                    <textarea name="" id="AssessmentRegulation" rowspan="3" value=""></textarea>

                </div>     
                                
                       

                        </form>
    
  
  </div>
  
   
  
</div>

<br> <br>
<button class="ui primary button" id="savemodule">
  Save
</button>
<button class="ui button">
  Discard
</button> 

            </div>

            <div class="one wide column"></div>


        </div>


    </div>




    <div class="ui modal addteachingpattern" >

        <div class="header">

            Add Teaching Patterns
        </div>


        <div class="content">

            <form action="" class="ui form">

<div class="field">
<label>Unit ID</label>
<select class="ui dropdown Tselectunit" id="tselectID">
  
</select>
                </div>



                <div class="two fields">


                                       <div class="field">

                        <label for="">Unit Name</label>
                        <input type="text" name="" placeholder="" id="UnitName" value="">
                    </div>


                    <div class="field">
                        <label for="">Teaching Type</label>

                        <input type="text" name="" placeholder="" id="TeachingType" value="">
                    </div>

                </div>
                
                                <div class="two fields">

                    <div class="field">

                        <label for=" "> Contact Hours</label>

                        <input type="number" name="" placeholder="" id="ContactHours" value="">
                    </div>


                    <div class="field">

                        <label for=""> Self Study Hours</label>

                        <input type="text" name="" placeholder="" id="SelfStudyHour" value="">
                    </div>
                </div>
                
                
                                <div class="two fields">
                    <div class="field">

                        <label for="">Placement Hours</label>

                        <input type="number" name="" placeholder="" id="PlacementHour" value="">
                    </div>
                    <div class="field" style="text-align: right;">

                        <label for=""></label> <br/>
                        <div class="ui green button" id="addteach">
  Add 
</div>
                    </div>
                </div>

                
                <div>
                    
   
                
                </div>


            </form>

        </div>


    </div>
    
    
        <div class="ui modal addassessmentmodal" >

        <div class="header">

            Add Assessment Pattern
        </div>


        <div class="content">

            <form action="" class="ui form">

                <div class="field">

                    <label for="">Unit Code</label>
                    <select class="ui dropdown Aselectunit" id="AselectID">
 
</select>


                </div>





                <div class="two fields">
                    <div class="field">

                        <label for="">Assessment Type</label>
                        <input type="text" placeholder="" value="" id="AssessmentType" value="">

                    </div>
                    <div class="field">

                        <div class="field">

                            <label for="">Weighting</label>
                            <input type="text" name="" placeholder="" id="Weighting" value="">
                        </div>
                    </div>


                </div>


                <div class="two fields">
                    <div class="field">

                        <label for="">Minimum Qualified Mark</label>
                        <input type="text" placeholder="" value="" id="MinimumMark" value="">

                    </div>
                    <div class="field">

                        <div class="field">

                            <label for="">Assignment Sample</label>
                            <input type="file" name="" placeholder="" id="AssignmentFile" value="" style="background-color: #27ae60;">
                        </div>
                    </div>


                </div>
                
                                <div class="two fields">
                    <div class="field">

                        <div class="ui primary button" id="AddassessmenTbtn">
  Add
</div>

                    </div>
                    <div class="field">

                    
                    </div>


                </div>


                
                <div>
                    
   
                
                </div>


            </form>

        </div>


    </div>






	<script>
	
	var tempunit =[];
	var Mainunitarray =[];
	var unitName="";
	var version="";
	var weighting="";
	var unitarray;
	var Tselectunit; 
	var UnitName;
	 var Aselectunit;
	 var Weighting;
	 var addarray =[];
	 
		 // var ModuleName = $("#ModuleName").val();
		
	 /* 			var ModuleCode = $("#ModuleCode").val();  
	 			
	 			var TotalCredits = $("#TotalCredits").val();
	 			var Overview = $("#Overview").val();
	 			var SummaryLearning = $("#SummaryLearning").val();
	 			
	 			var ReadingList = $("#ReadingList").val();
	 			var AssessmentCriteria = $("#AssessmentCriteria").val();
	 			var FeedBack = $("#FeedBack").val();
	 			var AssessmentRegulation = $("#AssessmentRegulation").val(); */
	 			//var Tselectunit;  
	 			//var UnitName;
	 			var TeachingType;
	 			var ContactHours;
	 			var SelfStudyHour;
	 			var PlacementHour; 
	 			var LearningHours;
	 			//var Aselectunit;
	 			var AssessmentType;
	 			//var Weighting;
	 			var MinimumMark;
	 			var AssignmentFile; //AssignmentFile = $("#AssignmentFile").val();
	 			var teacharr =[];
	 	
	 	
	 	
	 	
	
	 $('.dropdown')
     .dropdown({
         // you can use any ui transition
         transition: 'drop'
     });


 $('.ui.accordion').accordion(); 
 
 function readURL(input) {
		if (input.files && input.files[0]) {
			var reader = new FileReader();

			reader.onload = function(e) {
				$('#blah').attr('src', e.target.result);
			};

			reader.readAsDataURL(input.files[0]);
		}
	}
 

 $(document).ready(function(){
	
	 
	 $('#tblunits').DataTable({
			
			"paging" : false,
			"ordering" : false,
			"info" : false,
			"search" : false,

			columns : [ {
				title : "UNIT CODE"
			}, {
				title : "UNIT NAME"
			}, 
			
			{
				title : "VERSION"
			}, 
			
			{
				title : "WEIGHTING(%)"
			} 
			
			]
		});
		
		
		$('#tblunits_filter').hide();
		
		
	$('#tblteachingpattern').DataTable({
			
			"paging" : false,
			"ordering" : false,
			"info" : false,
			"search" : false,

			columns : [ {
				title : "UNIT CODE"
			}, {
				title : "UNIT NAME"
			}, 
			
			{
				title : "TEACHING TYPE"
			}, 
			
			{
				title : "CONTACT HOURS"
			}, 
			
			{
				title : "SELF STUDY HOURS"
			},
			
			{
				title : "PLACEMENT HOURS"
			}, 
			
			{
				title : "TOTAL LEARNING HOURS"
			}
					
			
			]
		});
		
		
		$('#tblteachingpattern_filter').hide();
		
		
	$('#tblassessmentpattern').DataTable({
			
			"paging" : false,
			"ordering" : false,
			"info" : false,
			"search" : false,

			columns : [ {
				title : "UNIT CODE"
			}, {
				title : "ASSESSMENT TYPE"
			}, 
			
			{
				title : "WEIGHTING"
			}, 
			
			{
				title : "MINIMUM QUALIFIED MARK"
			}, 
			
			{
				title : "ASSESSMENT SAMPLE"
			} 
					
			
			]
		});
		
		
		$('#tblassessmentpattern_filter').hide();
	 
	 
		
		var unitslist = JSON.parse('${unitv}');
		//console.log(unitslist);
		var unitcombo="";
		/* console.log(obj); */
		$.each(unitslist, function(key1, value1) {
			 console.log(key1);
			  		/* console.log(value1.Name);  */
			  		unitcombo = unitcombo
					+ ("<div class=\"item\">"+key1+"<\/div>");

		});
		$("#unitmenu").empty().append(
				unitcombo); 
	 
	
		 $("#addunittbl").click(function(){
			 
			 var listunit = JSON.parse('${unitv}');
			   
			 var MultiUnit="";
			 MultiUnit = $('.selection.dropdown.MultiUnit').dropdown('get text');
			 tempunit.push(MultiUnit);
				
				unitName = listunit[""+[MultiUnit]+""].Unitname;
				version= listunit[""+[MultiUnit]+""].version;
				weighting= listunit[""+[MultiUnit]+""].weighting;
				

			     unitarray={
					
						
							"UnitCode":MultiUnit,
							"UnitName":unitName,
							"Version":version,
							"Weighting":weighting
								
							
						
					
					
				};
				
				//console.log(unitarray);
						
				Mainunitarray.push(unitarray);
				//console.log(Mainunitarray);
			
				 $('#tblunits').DataTable().row.add([ MultiUnit,unitName,version,weighting]).draw();
					 
			 
			});
		
		
	     $(".addteachingpatternbtn").click(function() {
	         $('.ui.modal.addteachingpattern').modal('show');
	         
	           	
	         
	         var selectedunit="";
	         
	         for (index = 0; index < tempunit.length; ++index) {
	 			    
	 			 
	        	 selectedunit = selectedunit
	 				+ ("<option>" + tempunit[index] + "</option>");
	 			 
	 			 
	 			 
	 			}
	         
	         $("#tselectID").empty().append(
	        		 selectedunit);  
	         
    	
	         
	    	
	    	$( ".Tselectunit" ).change(function() {
	    		  
	    		Tselectunit = $('.Tselectunit').dropdown('get text');
	    		//UnitName = teachlist[""+[Tselectunit]+""].Unitname;
	    		
	    		var teachlist = JSON.parse('${unitv}');
		    	
	    		$("#UnitName").val(""+teachlist[""+[Tselectunit]+""].Unitname+"");
	    		
	    		});
      
	    });
	     
	     
	     $(".assessbtn").click(function() {
	         $('.ui.modal.addassessmentmodal').modal('show');
	         
	         
	         
	         
             var selectedunit="";
	         
	         for (index = 0; index < tempunit.length; ++index) {
	 			    
	 			 
	        	 selectedunit = selectedunit
	 				+ ("<option>" + tempunit[index] + "</option>");
	 			 
	 			 
	 			 
	 			}
	         
	         $("#AselectID").empty().append(
	        		 selectedunit);  
	         
	
		         
		    	
		    	$( ".Aselectunit" ).change(function() {
		    		  
		    		Aselectunit = $('.Aselectunit').dropdown('get text');
		    		//UnitName = teachlist[""+[Tselectunit]+""].Unitname;
		    		
		    		var asesslist = JSON.parse('${unitv}');
			    	
		    		$("#Weighting").val(""+asesslist[""+[Aselectunit]+""].weighting+"");
		    		
		    		}); 
    
	         
	    }); 
 
 

	$("#addteach").click(function(){
		Tselectunit = $('.Tselectunit').dropdown('get text');
		UnitName = $("#UnitName").val();
		TeachingType = $("#TeachingType").val();
		ContactHours = $("#ContactHours").val();
		SelfStudyHour = $("#SelfStudyHour").val();
		PlacementHour = $("#PlacementHour").val();
		TotalLearningHours = $("#LearningHours").val();
		
		var teachobject={
				
				
					"UnitCode":Tselectunit,
					"UnitName":UnitName,
					"TeachingType":TeachingType,
					"ContactHours":ContactHours,
					"SelfStudyHour":SelfStudyHour,
					"PlacementHour":PlacementHour,
				    "TotalLearningHours":TotalLearningHours
				
				
		}
		
		teacharr.push(teachobject);
		
		$('#tblteachingpattern').DataTable().row.add([ Tselectunit,UnitName,TeachingType,ContactHours,SelfStudyHour,PlacementHour,TotalLearningHours ]).draw();
	});
	
	
	
	$("#AddassessmenTbtn").click(function(){
		 Aselectunit = $('.Aselectunit').dropdown('get text');
		 AssessmentType = $("#AssessmentType").val();   
		 Weighting = $("#Weighting").val();
		 MinimumMark = $("#MinimumMark").val();
		 AssignmentFile = "link";
		 
		 
		 var assessobject ={
				 
				
						"UnitCode":Aselectunit,
						"AssessmentType":AssessmentType,
						"Weighting":Weighting,
						"MinimumMark":MinimumMark
						//"AssignmentFile":AssignmentFile	
						
					
		 }
		 
		 addarray.push(assessobject);
		
		$('#tblassessmentpattern').DataTable().row.add([ Aselectunit,AssessmentType,Weighting,MinimumMark,AssignmentFile ]).draw();
	});
	
	
	
	$('#savemodule').click(function() {
		
		var ModuleName = $("#ModuleName").val();
		var ModuleCode = $("#ModuleCode").val(); 
		var Moduleversion = $("#moduleversion").val(); 
		
		
		var TotalCredits = $("#TotalCredits").val();
		var Overview = $("#Overview").val();
		var SummaryLearning = $("#SummaryLearning").val();
		
		var ReadingList = $("#ReadingList").val();
		var AssessmentCriteria = $("#AssessmentCriteria").val();
		var FeedBack = $("#FeedBack").val();
		var AssessmentRegulation = $("#AssessmentRegulation").val();
		 

		var data = {

				"ModuleName" : ModuleName,
				"LearningHours" : LearningHours,
				"TotalCredits" : TotalCredits,
				"Version":Moduleversion,
				"ModuleOverview" : {

					"Overview" : Overview,
					"SummaryLearning":SummaryLearning
					
				},
				"SyllabusUnits":{
					
					"Units":Mainunitarray,
					"ReadingList":ReadingList
					
					
				},
				
				"TeachingPatterns":teacharr,
	
				
				"AssessmentPattern":addarray


			},
	        	
	        	

	    			data = JSON.stringify(data);
				console.log(data);
	    			$.ajax({
	    				type : "POST",
	    				accept : "text/html",
	    				//contentType: "application/json; charset=utf-8",
	    				dataType : "html",
	    				url : "${pageContext.request.contextPath}/ap/module_specification/add",
	    				data : ({
	    					"data" : data
	    					
	    				}),
	    				success: function(){
							  location.reload(true);
						}

	    			});
	    			
	    			
	        	
	        }); 
	     
	     
	     
	 
	});
    

	 
	
	        
	        
	
		
	</script>

</div>



</body>

</html>


