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
                        <i class="dropdown icon"></i> Unit Specification
                    </div>
                    <div class="active content">


                        <form class="ui form">


                            <div class="two fields">


                                <div class="field">
                                    <label>Unit Name</label>
                                    <input type="text" name="UnitName" placeholder="Unit Name" id="UnitName">
                                </div>

                                <div class="field">
                                    <label>Unit Code</label>
                                    <input type="text" name="Unit Code" placeholder="Unit Code" id="UnitCode">
                                </div>

                            </div>


                            <div class="two fields">


                                <div class="field">
                                    <label>Version</label>
                                    <input type="text" name="Version" placeholder="Version" id="Version">
                                </div>

                                <div class="field">
                                    <label>Weighting (%)</label>
                                    <input type="text" name="Weighting(%)" placeholder="Weighting (%)" id="Weighting">
                                </div>


                            </div>


                            <div class="field">
                                <label>Overview</label>
                                <input type="text" name="Overview" placeholder="Overview" id="UnitOverview">
                            </div>


                        </form>

                    </div>


                </div>


            </div>

            <div class="one wide column"></div>


        </div>


    </div>



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
                        <i class="dropdown icon"></i> Learning Outcomes
                    </div>
                    <div class="active content">


                        <form action="" class="ui form">

                            <div class="two fields">


                                <div class="field">
                                    <div>
                                        <div class="ui primary button addLearningoutBtn" > Add Learning Outcome </div>
                                    </div>
                                </div>

                                <div class="field" style="text-align: right;padding-right: 10px;">
                                    <div class="ui teal buttons ">
                                        <div class="ui button addusers">Modify</div>
                                        <div class="ui floating dropdown icon button">
                                            <i class="dropdown icon"></i>

                                            <div class="menu">
                                                <div class="item"><i class="remove user icon"></i> Deactivate</div>
                                                <div class="item"><i class="delete icon"></i> Remove </div>
                                                <div class="item"><i class="ban icon"></i> Suspend </div>

                                                <div class="item changegroup"><i class="ban icon"></i> Change Group </div>
                                            </div>


                                        </div>
                                    </div>
                                </div>

                            </div>
                        </form>


<!--                         <table class="ui single line table">
                            <thead>
                                <tr>
                                    <th></th>
                                    <th>LEARNING OUTCOME</th>
                                    <th>LEAD</th>
                                    
                                    <th>Assesment Criteria </th>
                                    <th>References</th>
                                    <th>Action</th>
                                </tr>
                            </thead>
                            <tbody>
                                <tr>
                                    <td>
                                        <div class="ui checkbox">
                                            <input type="checkbox" name="example">
                                            <label></label>
                                        </div>
                                    </td>
                                    <td></td>
                                    <td></td>
                                    <td></td>
                                    <td></td>
                                    
                                    
                                    <td>
                                        <div class="field" style="text-align: right;">
                                            <div class="ui teal buttons ">
                                                <div class="ui button addusers">Add user</div>
                                                <div class="ui floating dropdown icon button">
                                                    <i class="dropdown icon"></i>

                                                    <div class="menu">
                                                        <div class="item"><i class="remove user icon"></i> Deactivate</div>
                                                        <div class="item"><i class="delete icon"></i> Remove </div>
                                                        <div class="item"><i class="ban icon"></i> Suspend </div>

                                                        <div class="item changegroup"><i class="ban icon"></i> Change Group </div>
                                                    </div>


                                                </div>
                                            </div>
                                        </div>
                                    </td>
                                </tr>


                            </tbody>
                        </table> -->


                       <table class="ui very basic table" id="tbllearningoutcomes"></table>



                    </div>


                </div>


            </div>

            <div class="one wide column"></div>


        </div>


    </div>



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
                        <i class="dropdown icon"></i> Others
                    </div>
                    <div class="active content">


                        <form class="ui form">

                 
                            <div class="two fields">

                               
                                <div class="field">
                                   
                                     <label>Add Relative Units</label>
                                     <div class="ui action input">
                                        <input type="text" placeholder="Relative Units" id="RelativeUnits" value="">
                                        <div class="ui icon button" style="background-color: #e74c3c;" id="addRelativeUnitsBtn">
                                            <i class="fa fa-plus" aria-hidden="true" style="color: white;"></i>
                                        </div>
                                    </div>
                                    <br/> <br/>
                                     <table class="ui very basic table" id="tblrelatedunit"></table>
                                </div>

                                <div class="field">
                                     <div class="field">
                                        <label>Reading List</label>
                                        <textarea name="" id="reading" rowspan="3" value=""></textarea>
                                    </div>
                                </div>
                                     

                            </div>
                            
                                <button class="ui primary button" id="addunittoDB">
  Save
</button>
<button class="ui button">
  Discard
</button>
                            

                        </form>

                    </div>


                </div>


            </div>

            <div class="one wide column"></div>


        </div>


    </div>


    <div class="ui modal learningOutcomemodal" id="openLearningoutcomesModal">

        <div class="header">

            Add Learning Outcomes
        </div>


        <div class="content">

            <form action="" class="ui form">


                <div class="two fields">


                    <div class="field">
                        <label>Learning Outcome ID</label>
                        <input type="text" name="LearningOutcomeID" placeholder="Learning Outcome ID" id="Learning_Outcome_Code">
                    </div>

                    <div class="field">
                        <label>Learning Outcome Name</label>
                        <input type="text" name="LearningOutcomeName" placeholder="Learning Outcome Name" id="LearningOutcomeName">
                    </div>

                </div>

                <h3 class="ui dividing header">Add Leads</h3>

                <div class="field">
                    <label>Lead Name</label>
                    <input type="text" name="LeadName" placeholder="Lead Name" id="Lead">
                </div>

                <div class=" two fields">
                    <div class="field">
                     <label>Component</label>
                        <div class="ui action input">
                       
                            <input type="text" placeholder="Components" id="Components" value="">
                            <div class="ui icon button" style="background-color: #e74c3c;" id="addComponentsBtn">
                                <i class="fa fa-plus" aria-hidden="true" style="color: white;"></i>
                            </div>
                        </div>
                    </div>
                    <div class="field">
                     <label>Indicative Syllabus Content</label>
                       <div class="ui action input">
                     
							<input type="text" placeholder="Indicative Syllabus Content"
								id="Indicative_Syllabus_Content" value="">
							<div class="ui icon button" style="background-color: #e74c3c;" id="addIndicativeBtn">
								<i class="fa fa-plus" aria-hidden="true" style="color: white;"></i>
							</div>
						</div>
                    </div>

                </div>
                
                <div class=" two fields">
                    <div class="field">
                      <table class="ui very basic table" id="tblcomponents"></table>
                    </div>
                    <div class="field">
                    
                    <table class="ui very basic table" id="tblIndicativeContent"></table>
                     
                    </div>

                </div>
                
                
                <div class="two fields">

                    <div class="field">

                        <label for="">References</label>
                        <input type="file" name="" placeholder="" id="References" value="">
                    </div>

                    <div class="field" style="text-align: right;">
                    
                    <br/> 

                        <div class="ui primary button" id="addtoLead"> Add to Leads </div>
                    </div>


                </div>
                
                <div class="field">
                    
                <table class="ui single line table" id="leadtbl">
              
                </table>
                    
                </div>
                <br/>
                  <div class="field">
                    
               <h3 class="ui dividing header">  Learning Outcome Based Assessment Criteria</h3>	
                    
                </div>
                
                <div>
                    
                    <div class="ui action input fluid">
  <input type="text" placeholder="" id="gradeInput">
  <select class="ui compact selection dropdown gradeDropdown" >
    <option value="Fail">Fail</option>
    <option selected="" value="Unclassified">Unclassified</option>
    <option value="Distinction">Distinction</option>
    <option value="Merit">Merit</option>
    <option value="Pass">Pass</option>
  </select>
  <div type="submit" class="ui button" id="addAssessmentBtn">Add Assessment Criteria</div>
</div>   
                
                </div>
                
                
                <div class="field">
                <br/> <br/>
                
                <table class="ui very basic table" id="tblassessment"></table>
                
                </div>



                <div class="ui primary button" id="saveunitbtn">
                    Save
                </div>
                <div class="ui button">
                    Discard
                </div>


            </form>

        </div>


    </div>




	<script>
	
	
	
	
	var tempmodifyid;
	var learningName;
	var Lead;
	var Ref;
	var Leadarray = [];
	var Assessment_Criteria =[];
	var RelativeUnitList = [];
	var LearningOutcome = [];
	var Components = [];
	var Indicative_Syllabus_Content = [];
	
	
	var Assessmentdisplay= [];
	var tempfail=[];
    var temppass=[];
    var temppun=[];
    var tempmerit=[];
    var tempdis=[];
	
	
	
	
	
	 $('.dropdown')
     .dropdown({
         // you can use any ui transition
         transition: 'drop'
     });


 $('.ui.accordion').accordion();

 //alert(localStorage.getItem("modifyid"));

 $(document).ready(function() {
     $(".addLearningoutBtn").click(function() {
         $('.ui.modal.learningOutcomemodal').modal('show');
     });
     
       
     
		$('#tblcomponents').DataTable({
			
			"paging" : false,
			"ordering" : false,
			"info" : false,
			"search" : false,

			columns : [ {
				title : "ComponentName"
			}, {
				title : "Action"
			} ]
		});
		
		
		$('#tblcomponents_filter').hide();
		
		$('#tblIndicativeContent').DataTable({
			
			"paging" : false,
			"ordering" : false,
			"info" : false,
			"search" : false,

			columns : [ {
				title : "Indicative Syllabus Content"
			}, {
				title : "Action"
			} ]
		});
		
		$('#tblIndicativeContent_filter').hide();
		
		
		
		
        $('#leadtbl').DataTable({
			
			"paging" : false,
			"ordering" : false,
			"info" : false,
			"search" : false,

			columns : [  {
				title : "LEAD"
				}, 
				{
				title : "COMPONENTS"
				},
				{
				title : "INDICATIVE SYLLABUS CONTENT"
				},
				{
				  title : "REFERENCE"
				}
				]
		});
		
		$('#leadtbl_filter').hide();
		
		
		
        $('#tblassessment').DataTable({
			
			"paging" : false,
			"ordering" : true,
			"info" : false,
			"search" : false,

			columns : [  {
				title : "Grades" 
				}, 
				{
				title : "Assessment Criteria"
				}
	
				
				]
		});
		
		$('#tblassessment_filter').hide();
		
		
		 $('#tblrelatedunit').DataTable({
				
				"paging" : false,
				"ordering" : false,
				"info" : false,
				"search" : false,

				columns : [  {
					title : "Relative Units"
					}, 
					{
					title : "Action"
					}
		
					
					]
			});
			
			$('#tblrelatedunit_filter').hide();
			
			
			
			
           $('#tbllearningoutcomes').DataTable({
				
				"paging" : false,
				"ordering" : false,
				"info" : false,
				"search" : false,

				columns : [  {
					title : "LEARNING OUTCOME"
					}, 
					{
					title : "LEAD"
					},
					{
						title : "Assesment Criteria"
					},
					
					{
						title : "Action"
					}
					
		
					
					]
			});
			
			$('#tbllearningoutcomes_filter').hide();
			
			
			
		     
		     if(localStorage.getItem("modifyid")!=null){
		    	 
		    	 tempmodifyid =localStorage.getItem("modifyid");
		    	 
		    	 var Unit = JSON.parse('${Unit}');

		    	// alert(Unit[""+tempmodifyid+""].UnitName);
		    	
		    	 var un= Unit[""+tempmodifyid+""].UnitName;  
		    	 var rl=Unit[""+tempmodifyid+""].ReadingList;
		    	 var uo=Unit[""+tempmodifyid+""].UnitOverview;
		    	 var uv=Unit[""+tempmodifyid+""].Version;
		    	 var uw=Unit[""+tempmodifyid+""].Weighting;
		    	 var LeadN=Unit[""+tempmodifyid+""].LearningOutcome.Lead.LeadName;
		    	 
		    	
		    	   //$(".Tcountry").text(TPAC);		   
				   $("#UnitName").val(un);
				   $("#UnitCode").val(tempmodifyid);
				   $("#Version").val(uv);
				   $("#Weighting").val(uw);
				   $("#UnitOverview").val(uo);
				   $("#reading").val(rl); 
				   $("#Lead").val(LeadN); 
				   
				   
		    	
		    	 $.each(Unit, function(key, value){
		    		 
		    		 if(key==tempmodifyid){
		    			 
		    			 var LON=value.LearningOutcome.LearningOutcomeName;
		    			 $("#LearningOutcomeName").val(LON);
		    			
		    			var loc =value.LearningOutcome.LearningOutcomeCode;
		    			$("#Learning_Outcome_Code").val(loc);
		    			 
		    			 
		    			 $.each(value, function(key2, value2){
		    				 
		    				if(key2=="RelativeUnits"){
		    					
		    					//console.log(key2);
		    					
		    					 $.each(value2, function(key6, value6){
		    						// console.log(value6);
		    						 
		    						 $('#tblrelatedunit').DataTable().row.add([ value6,"<i class=\"fa fa-times\" aria-hidden=\"true\"><\/i>" ]).draw();
		    						 
		    					 });
		    					

		    				}
		    				 
		    				 if(key2=="LearningOutcome"){
		    					 

		    					 

		    					 $.each(value2, function(key7, value7){
		    						 
		    						
		    						if(key7=="Lead") {
		    							
		    							$.each(value7, function(key8, value8){
		    								
		    								if(key8=="Components"){
		    									
		    									$.each(value8, function(key9, value9){
		    										
		    										Components.push(value9);
		    										$('#tblcomponents').DataTable().row.add([ value9,"<i class=\"fa fa-times\" aria-hidden=\"true\"><\/i>" ]).draw();
		    										
		    										
		    									});
		    									
		    								}
		    								
		    								if(key8=="Indicative Syllabus Content")	{
		    									
                                                 $.each(value8, function(key10, value10){
		    										
                                                	 Indicative_Syllabus_Content.push(value10);
                                                	 $('#tblIndicativeContent').DataTable().row.add([ value10,"<i class=\"fa fa-times\" aria-hidden=\"true\"><\/i>" ]).draw();
		    										
		    										
		    									});
		    									
		    								}
		    								
		    								
		    							});
		    							
		    						}
		    						
		    						
		    						 
		    						 
		    					 });
		    					 
		    					 $.each(value2, function(key3, value3){
		    	    				 
		    						 if(key3=="Assessment Criteria"){
		    							 
		    							 //console.log("dsfsdf"+value3);
		    							 
		    							 $.each(value3, function(key4, value4){
		    								 
		    								 
		    								// console.log(key4);
		    						 		 if(key4=="Fail"){
		    									 
		    									 //console.log(value4);
		    									 
		    									 $.each(value4, function(key12, value12){
		    										 
		    										 //console.log(key12);
		    										  tempfail.push(value12);  
		    										 $('#tblassessment').DataTable().row.add([ key4,value12 ]).draw();
		    										 
		    									 });
		    						 			
		    									 
		    								 } 
		    								 
		                                     if(key4=="Distinction"){
		    									 
		    									// console.log(value4);
		    									$.each(value4, function(key13, value13){
		    										
		    										 tempdis.push(value13);
		    										$('#tblassessment').DataTable().row.add([ key4,value13]).draw();
		    									});
		    									
		                                    	 
		    									 
		    								 }
		                                    
		                                    if(key4=="Unclassified"){
		   									 
		   									 //console.log(value4);
		   									 
                                                   $.each(value4, function(key14, value14){
		    										
                                                	   temppun.push(value14);  
		    										$('#tblassessment').DataTable().row.add([ key4,value14]).draw();
		    									});
		   									 
		   								 }
		                                     
		                                    if(key4=="Merit"){
		   									 
		                                    	 $.each(value4, function(key15, value15){
			    										
		                                    		 tempmerit.push(value15);
			    										$('#tblassessment').DataTable().row.add([ key4,value15]).draw();
			    									});
		   									 
		   								 } 
		                                    
		                                     if(key4=="Pass"){
		      									 
		                                    	 $.each(value4, function(key16, value16){
		                                    		 
		                                    		 temppass.push(value16);
			    										
			    										$('#tblassessment').DataTable().row.add([ key4,value16]).draw();
			    									});
		      									 
		      								 } 
		                                
		    								 
		    								 
		    							 });
		    							 

		    							 
		    						 }
		    						 

		    	    				 
		    	    				 
		    	    			 });
		    					 
		    					 
		    				 }
		    				 
		    			
		    				 
		    				 
		    			 });
		    					 
		    					 
		    			 
		    		 }
		    		
		    		 
		    	 });
		    	 
		    	 
		    	 var index;
		    	 var tempcomp="";
		    	 var tempISC="";
				 
				 for (index = 0; index < Components.length; ++index) {
					    
					 
					 tempcomp+=Components[index]+"<br\/>";
					 
					}
				 
				
				 
				 for (index = 0; index < Indicative_Syllabus_Content.length; ++index) {
					    
					 tempISC+=Indicative_Syllabus_Content[index]+"<br\/>";
					 
					}
			    
				
				Lead = $("#Lead").val(); 
				
				Ref ="Link";  // Please capture from id
				
	
				 
				Leadarray.push(Lead);
				Leadarray.push(Components);
				Leadarray.push(Indicative_Syllabus_Content);
				Leadarray.push(Ref); 
				
				
			 
			 var t = $('#leadtbl').DataTable();
				 t.row.add( [
					 Lead,
					 tempcomp,
					 tempISC,
					 Ref
			        ] ).draw( false );
				  
		    	 
		    	 var fa="";
		    	 var pa="";
		    	 var unclass="";
		    	 var meri="";
		    	 var dist="";
		    	 var Compo="";
		    	 var Ics="";
		    	 
					
				    for (index = 0; index < tempfail.length; ++index) {
					    
						 fa+=tempfail[index]+"<br\/>";
						}
				    
				    for (index = 0; index < temppass.length; ++index) {
					    
						 pa+=temppass[index]+"<br\/>"; 
						}
				    
				    for (index = 0; index < temppun.length; ++index) {
					    
						 unclass+=temppun[index]+"<br\/>"; 
						}
				    
				    for (index = 0; index < tempmerit.length; ++index) {
					    
						 meri+=tempmerit[index]+"<br\/>"; 
						}
				    
				    for (index = 0; index < tempdis.length; ++index) {
					    
						 dist+=tempdis[index]+"<br\/>"; 
						}
				 
				 
				 for (index = 0; index < Components.length; ++index) {
					    
					 Compo+="<br\/>"+Components[index];
					}
				 
				 
				 for (index = 0; index < Indicative_Syllabus_Content.length; ++index) {
					    
					 Ics+="<br\/>"+Indicative_Syllabus_Content[index]+"<br\/>";
					} 
				 
				
				 learningName = $("#LearningOutcomeName").val();   // Main Learning Name
				 

				 
			 
			  var t = $('#tbllearningoutcomes').DataTable();
				 t.row.add( [
					 learningName,
					 Lead,   // Lead+""+Compo+""+Ics
					 "<p>Fail :<\/p>"+fa+"<br\/>"+"<p>Pass :<\/p>"+pa+"<br\/>"+"<p>Unclassified :<\/p>"+unclass+"<br\/>"+"<p>Merit :<\/p>"+meri+"<br\/>"+"<p>Distinction :<\/p>"+dist,                             //Assessment
					 Ref
					 
			        ] ).draw( false );  
				 
				 LearningOutcome.push(learningName);
				 LearningOutcome.push(Leadarray);
				 LearningOutcome.push(Assessment_Criteria);
				 	 
				 
				 
				 
				 
				 
		  
		     }
		     else{
		    	 
		    	 console.log("Modify failed");
		     }
		     
		     
		   
			
			
 
 });
 
 
    // var Components = [];
	

	$("#addComponentsBtn").click(function() {

		Component = $("#Components").val();
		
		$('#tblcomponents').DataTable().row.add([ Component,"<i class=\"fa fa-times\" aria-hidden=\"true\"><\/i>" ]).draw();
		
		Components.push(Component);
		console.log(Components);
	});
	
	
	// var Indicative_Syllabus_Content = [];
	
	$("#addIndicativeBtn").click(function(){
	    
		Indicativecontent =$("#Indicative_Syllabus_Content").val();
		
		$('#tblIndicativeContent').DataTable().row.add([ Indicativecontent,"<i class=\"fa fa-times\" aria-hidden=\"true\"><\/i>" ]).draw();
		
		Indicative_Syllabus_Content.push(Indicativecontent);
		//console.log(Indicative_Syllabus_Content);
	});
	

	// var Leadarray = []; // MainLeads
	
	
	 var ComponentsString="";
	 var ISCString="";
	
	
	 $("#addtoLead").click(function(){
		 
		
		 var index;
		 
		 for (index = 0; index < Components.length; ++index) {
			    
			    //ComponentsString+=Components[index]+"<br\/>";
			  ComponentsString+=Components[index]+"<br\/>";
			  console.log(ComponentsString);
			}
		 
		
		 
		 for (index = 0; index < Indicative_Syllabus_Content.length; ++index) {
			    
			 ISCString+=Indicative_Syllabus_Content[index]+"<br\/>";
			 console.log(ISCString);
			}
	    
		
		Lead = $("#Lead").val(); 
		
		Ref ="Link";  // Please capture from id
		
	
		/* var i;
		for (i = 0; i < Components.length; ++i) {
		    // do something with `substr[i]`
		    window.alert(Components[i]);
		} */
		 
		Leadarray.push(Lead);
		Leadarray.push(Components);
		Leadarray.push(Indicative_Syllabus_Content);
		Leadarray.push(Ref);
		
		//console.log(Leadarray);
	 
	 var t = $('#leadtbl').DataTable();
		 t.row.add( [
			 Lead,
			 ComponentsString,
			 ISCString,
			 Ref
	        ] ).draw( false );
		 
		 
		/*  while (Components.length > 0) {
			 Components.pop();
			}
		 
		 while (Indicative_Syllabus_Content.length > 0) {
			 Indicative_Syllabus_Content.pop();
			} */
		 

	
	}); 
	 
	 

	
/* 	var Assessmentdisplay= [];
	var tempfail=[];
    var temppass=[];
    var temppun=[];
    var tempmerit=[];
    var tempdis=[]; */
	
	 $("#addAssessmentBtn").click(function(){
		 
		
	           var jobject={};
	             
	           var criteria = $('.selection.dropdown.gradeDropdown').dropdown('get text');
	           
	           //criteriaList.push(criteria);
	           
	           var grade= $("#gradeInput").val();
	           
	           var temp = criteria.concat(":"+grade);
	          

	           
	           if(criteria==="Fail"){
	        	   
	        	   tempfail.push(grade);  
	           }
	           else if(criteria==="Pass"){
	        	   
	        	   temppass.push(grade);
	        	   
	           }  
	           
              else if(criteria==="Unclassified"){
	        	   
            	  temppun.push(grade);
	        	   
	           }  
	           
              else if(criteria==="Merit"){
	        	   
            	  tempmerit.push(grade);
	        	   
	           }  
	           
              else if(criteria==="Distinction"){
	        	   
            	  tempdis.push(grade);
	        	   
	           } 
	          
	          
	           
	          // Assessmentdisplay.push(temp);
	           
	           
          
	           jobject[criteria]= grade;
	           //gradeList.push(grade);
	           Assessment_Criteria.push(jobject)
	           var t = $('#tblassessment').DataTable();
	  		 t.row.add( [
	  			criteria,
	  			grade
	  	        ] ).draw( false );
		       
		  // console.log(Assessment_Criteria);
	  		 
		});
	 
	
	// var RelativeUnitList = [];  // Main RealtiveUnits
		
		$("#addRelativeUnitsBtn").click(function(){
		    
			var relativeunit =$("#RelativeUnits").val();
			
			$('#tblrelatedunit').DataTable().row.add([ relativeunit,"<i class=\"fa fa-times\" aria-hidden=\"true\"><\/i>" ]).draw();
			
			RelativeUnitList.push(relativeunit);
			//console.log(RelativeUnitList);
		});
		
		
		
		
	
		var Assessment="";
		var Comp="";
		var Ic=""; 
		var p=""; // pass
		var f=""; // fail
		var un=""; // unclassified
		var mer="";//merit
		var dis="";//distinction
		
		
	 $("#saveunitbtn").click(function(){
			 
		 
			/*  for (index = 0; index < Assessmentdisplay.length; ++index) {
				    
				 Assessment+=Assessmentdisplay[index];
				} */
				
				
				
			    for (index = 0; index < tempfail.length; ++index) {
				    
					 f+=tempfail[index]+"<br\/>";
					}
			    
			    for (index = 0; index < temppass.length; ++index) {
				    
					 p+=temppass[index]+"<br\/>"; 
					}
			    
			    for (index = 0; index < temppun.length; ++index) {
				    
					 un+=temppun[index]+"<br\/>"; 
					}
			    
			    for (index = 0; index < tempmerit.length; ++index) {
				    
					 mer+=tempmerit[index]+"<br\/>"; 
					}
			    
			    for (index = 0; index < tempdis.length; ++index) {
				    
					 dis+=tempdis[index]+"<br\/>"; 
					}
			 
			 
			 for (index = 0; index < Components.length; ++index) {
				    
				 Comp+="<br\/>"+Components[index];
				}
			 
			 
			 for (index = 0; index < Indicative_Syllabus_Content.length; ++index) {
				    
				 Ic+="<br\/>"+Indicative_Syllabus_Content[index]+"<br\/>";
				} 
			 
			
			 learningName = $("#LearningOutcomeName").val();   // Main Learning Name
			 

			 
		 
		  var t = $('#tbllearningoutcomes').DataTable();
			 t.row.add( [
				 learningName,
				 Lead,   // Lead+""+Comp+""+Ic
				 "<p>Fail :<\/p>"+f+"<br\/>"+"<p>Pass :<\/p>"+p+"<br\/>"+"<p>Unclassified :<\/p>"+un+"<br\/>"+"<p>Merit :<\/p>"+mer+"<br\/>"+"<p>Distinction :<\/p>"+dis,                             //Assessment
				 Ref
				 
		        ] ).draw( false );  
			 
			 LearningOutcome.push(learningName);
			 LearningOutcome.push(Leadarray);
			 LearningOutcome.push(Assessment_Criteria);
			 

 
			 $('.ui.modal.learningOutcomemodal').modal('hide');
 
		
		}); 
		
	 
		
	 $("#addunittoDB").click(function(){
		 
		 
		    var UnitName=$("#UnitName").val();
			var UnitCode=$("#UnitCode").val();
			var Version=$("#Version").val();
			var Weighting=$("#Weighting").val();
			var UnitOverview=$("#UnitOverview").val();
			var ReadingList=$("#reading").val(); 
			var LOcode=$("#Learning_Outcome_Code").val();
		    
				
				
				var data = {

						"UnitName" : UnitName,
						"Version" : Version,
						"Weighting" : Weighting,
						"UnitOverview" : UnitOverview,
						"ReadingList" : ReadingList,
						"RelativeUnits" : RelativeUnitList,

						"LearningOutcome" : {

							"LearningOutcomeName" : learningName,
							"LearningOutcomeCode":LOcode,
							"Lead" : {
								
								"LeadName":Lead,
								"Components":Components,
								"Indicative Syllabus Content":Indicative_Syllabus_Content,
								"References":Ref
							},
							
							"Assessment Criteria" : {
								
								"Pass":temppass,
								"Fail":tempfail,
								"Merit":tempmerit,
								"Distinction":tempdis,
								"Unclassified":temppun
								
							}
							

						}

					},
					

				data = JSON.stringify(data);

				
				console.log(data);
				
				
 
				    $
						.ajax({
							type : "POST",
							accept : "text/html",
							//contentType: "application/json; charset=utf-8",
							dataType : "html",
							url : "${pageContext.request.contextPath}/ap/unit_specification/add",
							data : ({
								"data" : data,

							})
							<%-- success: function(response) {
							window.location.href = "<%=session.getAttribute("serverRoot")%>/ap/unit_specification";
                } --%>
						});   
 
				    
				    
		 
		});
		

		
	</script>

</div>


</body>

</html>
