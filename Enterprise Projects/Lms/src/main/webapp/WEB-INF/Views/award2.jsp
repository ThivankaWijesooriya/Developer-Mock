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

  background:#6435c9;

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
   Award
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
                        <label for="">Awarding Name</label>

<input type="text" id="Mainawardingname" value="">
                    </div>
                    <div class="field">
                        <label for="">Awarding Code</label>
                        <input type="text" id="Mainawardingcode" value="">

                    </div>
                </div>
                
                
                                <div class="two fields">
                    <div class="field">
                        <label for="">Length of Award</label>

                        <select class="ui dropdown awardLength">
  
  <option value="1">1</option>
  <option value="0">2</option>
</select>
                    </div>
                    <div class="field">
                        <label for="">Cluster</label>
                        <select class="ui dropdown cluster">
  <option value="">Maths</option>
  <option value="1">Commerce</option>
  <option value="2">Art</option>
  <option value="3">IT</option>
  <option value="0">Science</option>
</select>
                    </div>
                </div>
                
                
                 <div class="two fields">
                    <div class="field">
                        <label for="">Curriculum Approved Date</label>
                        <input type="date" name="" placeholder="" value="" id="Aapprovedate">

                    </div>


          


                    <div class="field">
                        <label for="">Version</label>
                        <input type="date" name="" placeholder="" value="" id="Aversion">


                    </div>

                </div>


<div class="two fields">
                    <div class="field">
                        <label for="">Semester(s)</label>

                        <select class="ui dropdown Semester">
  <option value="">Count</option>
  <option value="1">1</option>
  <option value="0">2</option>
  <option value="2">3</option>
  <option value="3">4</option>
  <option value="4">5</option>
  <option value="5">6</option>
</select>
                    </div>

                </div>
                
     <!-- UNDONE -->           
                                <div class="two fields">
                    <div class="field">
                        <label for="">Is This Program Credit Rated or Accredited</label>


                        <div class="inline field">


                            <div class="field">
                                <div class="ui radio checkbox">
                                    <input type="radio" name="frequency" checked="checked">
                                    <label>Yes</label>
                                </div>
                            </div>
                            <div class="field">
                                <div class="ui radio checkbox">
                                    <input type="radio" name="frequency">
                                    <label>No</label>
                                </div>
                            </div>
                        </div>

                    </div>


                    <div class="field">
                        <label for="">If Yes, Total Number of Credits for the Award</label>
                        <input type="text" name="" placeholder="" id="Atotalcredits" value="">


                    </div>

                </div>
                
                       <div class="field">
                        <div class="ui primary button addqualiBtn" >
  Add Qualification Framework
</div>


                    </div>
                



                        </form>
    
  </div>
  
   <div class="title">
    <i class="dropdown icon"></i>
    Modules
  </div>
  <div class="content">
  
  <div class="ui form">
  
  
  <div class="two fields"> 
  
                           <div class="field">
                        <label for="">Module Code</label>
                        <div class="ui action input">
                                                <div class="ui loading fluid single search selection dropdown Modulecode">
  <input type="hidden" name="country" value="kp">
  <i class="dropdown icon"></i>
  <input class="search">
  <div class="default text">Search...</div>
  <div class="menu" id="modulemenu">
    <div class="item">Choice 1</div>
    
  </div>
</div>
                            <div class="ui icon button" style="background-color: #e74c3c;" id="addmoduleBTN">
    <i class="fa fa-plus" aria-hidden="true" style="color: white;"></i>
  </div>
                        </div>

                    </div>
                    
                    
                    <div class="field">
                    <label></label> <br>
                    
                    <div class="ui primary button fluid" id="createModuleBTN">
  Create Modules
</div>
                    
                    
                    </div>
  
  
  
  </div>
  
  <div class="field">
  
  <div class="ui toggle checkbox">
  <input type="checkbox" name="public">
  <label> <font style="color:blue;"><b> Mandatory </b></font> </label>
</div>
  
  </div>
  
  <div class="field">
  
  <br/> <br/>
  
<table class="ui very basic table" id="tbladdmodule"></table>
  
  
  </div>

  
  </div>
  

 </div>
  
  <div class="title">
    <i class="dropdown icon"></i>
    Entry Requirement
  </div>
  <div class="content">
                             <form action="" class="ui form">
                             
                             



<div class="field">
                             <div class="ui primary button EntryaddqualiBtn" >
 Add Qualification Framework
</div>

</div>

<div class="field">



<table class="ui very basic table" id="Mtblframework1"></table>
                

</div>

<div class="field">

<div class="ui primary button workexBTN" >
  Add Work Experience
</div>


</div>
<div class="field">


<table class="ui very basic table" id="MworkexpTbl"></table>



</div>

<div>
<label>Special Comment on Entry Requirement</label>
<textarea rowspan="3" cols="" id="Ecomments" value=""></textarea>

</div>

                        </form>
 
  </div>
  
  <div class="title">
    <i class="dropdown icon"></i>
    Recognition of Prior Learning (RPL)
    
  </div>
  <div class="content">
                            <form class="ui form">


                 
                 <div class="two fields"> 
                 
                 
                 <div class="field">
                 <div class="ui primary button addrplBTN">
  Add RPL
</div>
                 
                 </div>
                 
                                  <div class="field" style="text-align:right;margin-right:10px;">
                 
                 
                 <div class="ui teal buttons">
  <div class="ui button">Save</div>
  <div class="ui floating dropdown icon button">
    <i class="dropdown icon"></i>
    <div class="menu">
      <div class="item"><i class="edit icon"></i> Edit Post</div>
      <div class="item"><i class="delete icon"></i> Remove Post</div>
      <div class="item"><i class="hide icon"></i> Hide Post</div>
    </div>
  </div>
</div>
                 
                 </div>
                 
                 
                 
                 
                 </div>
                 

                 
                 <div class="field">
                
                 
                 <table class="ui very basic table" id="tblmainawardfinal"></table>
<!--                                                      <table class="ui single line table">
                    <thead>
                        <tr>
                             <th></th>
                             <th>RPL name</th>
                             <th>Award name</th>
                             <th>RPL modules</th>
                             <th>Exemption</th>
                            
                             
                             

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
                            <td style="text-align:right;">
                            
                                             <div class="ui teal buttons" >
  <div class="ui button">Save</div>
  <div class="ui floating dropdown icon button">
    <i class="dropdown icon"></i>
    <div class="menu">
      <div class="item"><i class="edit icon"></i> Edit Post</div>
      <div class="item"><i class="delete icon"></i> Remove Post</div>
      <div class="item"><i class="hide icon"></i> Hide Post</div>
    </div>
  </div>
</div>
                            
                            
                            </td>
                            
                           
                            

                        </tr>

                    </tbody>
                </table> -->
                 
                 
                 
                 </div>
                 
                 
                 


                        </form>
    
    
  </div>
  

  
  
</div>

<br> <br>
<div class="ui primary button" id="addAwardDB">
  Save
</div>
<div class="ui button">
  Discard
</div> 

            </div>

            <div class="one wide column"></div>


        </div>


    </div>




    <div class="ui modal addQualificationframework" >

        <div class="header">

            Add Qualification Framework
        </div>


        <div class="content">

            <form action="" class="ui form">

                              <div class="two fields">
                    <div class="field">
                        <label for="">Qualification Framework</label>

                        <select class="ui dropdown Qframe" id="targetqframe">
  <option>Scottish Qualification Authority</option>
  <option>Other</option>
</select>
                    </div>
                    <div class="field">
                        <label for="">Level of Accreditatior</label>
                        <div class="ui action input">
                            <select class="ui dropdown level" id="targetaccredit">
  <option>SQLevel1</option>
  <option>SQLevel2</option>
  <option>SQLevel3</option>
</select>
                            
                        </div>

                    </div>
                </div>
                
                
                <div class="two fields">
                
                 <div class="field">
                 
                 <div class="ui primary button" id="addtbl1">
  Add
</div>
                 
                 </div>
                
                </div>
                
   <table class="ui very basic table" id="tblframework1"></table>


            </form>

        </div>


    </div>
    
    
        <div class="ui modal EntryaddQualificationframework" >

        <div class="header">

            Add Qualification Framework
        </div>


        <div class="content">

            <form action="" class="ui form">

                              <div class="two fields">
                    <div class="field">
                        <label for="">Qualification Framework</label>

                        <select class="ui dropdown EnQframe" id="targetframe2">
  <option>Scottish Qualification Authority</option>
  <option>Other</option>
</select>
                    </div>
                    <div class="field">
                        <label for="">Level of Accreditatior</label>
                        <div class="ui action input">
                            <select class="ui dropdown Enlevel" id="targetlevel2">
  <option>SQLevel1</option>
  <option>SQLevel2</option>
  <option>SQLevel3</option>
</select>
                            
                        </div>

                    </div>
                </div>
                
                
                <div class="two fields">
                
                 <div class="field">
                 
                 <div class="ui primary button" id="addEntryQualBTN">
  Add
</div>
                 
                 </div>
                
                </div>
                
<table class="ui very basic table" id="tblframework2"></table>


            </form>

        </div>


    </div>
    
    
        <div class="ui modal addRPL modaltop" >

        <div class="header">

            Add RPL
        </div>


        <div class="scrolling content">
        
        
        								<div class="ui styled fluid accordion">
  <div class="title">
    <i class="dropdown icon"></i>
    RPL details
  </div>
  <div class=" content">
  
              <form action="" class="ui form">
            
                    <div class="field">

                        
                                        
                        <label for="">Recognized Awarding Partner</label>
                        <div class="ui action input">
                                                <div class="ui loading fluid single search selection dropdown RAwardPartner">
  <input type="hidden" name="country" value="kp">
  <i class="dropdown icon"></i>
  <input class="search">
  <div class="default text">Search...</div>
  <div class="menu" id="rplpartnerlist">
    <div class="item">Choice 1</div>
    
  </div>
</div>
                           
                        </div>

                    
                    </div>

                <div class="two fields">

                    <div class="field">

                        <label for="">Name of Award</label>
                        <input type="text" name="" placeholder="" id="awardName" value="">
                    </div>


                    <div class="field">
                        <label for="">RPL Award Code</label>

                        <input type="text" name="" placeholder="" id="awardCode" value="">
                    </div>
                </div>

                <div class="two fields">
                    <div class="field">
                        <label for="">Qualification Framework</label>

                        <select class="ui dropdown RQframe" id="targetframe3">
  <option>Scottish Qualification Authority</option>
  <option>Other</option>
</select>
                    </div>
 <div class="field">
                        <label for="">Level of Accreditation</label>
                        <select class="ui dropdown Rlevel" id="targetlevel3">
  <option>SQLevel1</option>
  <option>SQLevel2</option>
  <option>SQLevel3</option>
  
</select>
                    </div>
                </div>



                <div class="two fields">
                                        <div class="field">
                        <label for="">Is this a formal articulation ?</label>


                        <div class="inline field">


                            <div class="field">
                                <div class="ui radio checkbox">
                                    <input type="radio" name="frequency" checked="checked">
                                    <label>Yes</label>
                                </div>
                            </div>
                            <div class="field">
                                <div class="ui radio checkbox">
                                    <input type="radio" name="frequency">
                                    <label>No</label>
                                </div>
                            </div>
                        </div>

                    </div>
                    <div class="field" >
                    <div class="field"><b>&nbsp;If Yes</b></div> 

                   <div class="field">
                       
                       <input type="file">
                   </div>
                   
                    </div>
                </div>

<div class="two fields">
   <div class="field">
      <label for="">Date of Accreditation</label>
      <input type="date" id="Raccreditdate" value="">
       
   </div> 
   
    <div class="field">
       <label for="">Expire Date</label>
       <input type="date" id="Rexpirydate" value="">
        
    </div> 
    
    
    
</div>


<div class="two fields">
   <div class="field">
     
       
   </div> 
   
          <div class="field"   >
      <br/> <label style="text-decoration: underline;">Contract Reminder</label>
      
       
        <div class="ui checkbox">
  <input type="checkbox" name="example">
  <label > <b>Before Month</b></label>
</div>
      </div>

    
    
    
</div>

<div class="two fields">

<div class="field">
<label>Curriculum Code</label>
<input type="text" value="" id="Rcurricode" value="">


</div>

<div class="field">

<label>Version</label>
<input type="text" value="" id="Rversion" value="">

</div>

</div>

<div class="field">

<div class="ui selection dropdown specialization">
  <input type="hidden" name="gender">
  <i class="dropdown icon"></i>
  <div class="default text">Specialization</div>
  <div class="menu">
    <div class="item" data-value="1">Law</div>
    <div class="item" data-value="0">Economics</div>
  </div>
</div>

</div>


            </form>
  
    
  
  
  </div>
  <div class="title">
    <i class="dropdown icon"></i>
    Module Details
  </div>
  <div class="content">
  
  
  <div class="ui form">
  
  <div class="two fields">

<div class="field">
<label>Module Name</label>
<input type="text" value="" id="moduleName">


</div>

<div class="field">

<label>Module Code</label>
<input type="text" value="" id="Mcode" value="">

</div>



</div>


<div class="two fields">

<div class="field">
<label>Syllabus Code</label>
<input type="text" value="" id="Syllabuscode">


</div>

<div class="field">

<label>Credit</label>
<input type="text" value="" id="credit">

</div>

</div>


<div class="two fields">

<div class="field">
<label>Learning Hours</label>
<input type="text" value="" id="LearningHours">


</div>

<div class="field">

<label>Grade</label>
<select class="ui dropdown dGrade">
  <option>A</option>
  <option>B</option>
  <option>C</option>
 <option>D</option>
 <option>W</option>
 <option>S</option>
 
</select>

</div>

</div>

<div class="two fields">

<div class="field">
<label>Qualification Framework</label>
<select class="ui dropdown RRqualififrame" id="targetframe4">
  <option>Scottish Qualification Authority</option>
  <option>Other</option>
 
</select>


</div>

<div class="field">

<label>Level of Accreditation</label>
<select class="ui dropdown RRaccredit" id="targetlevel4">
  <option>SQLevel1</option>
  <option>SQLevel2</option>
  <option>SQLevel3</option>
</select>

</div>

</div>

<div class="field">

<label>Version</label>
<input type="text" value="" id="Mversion">

</div>

<div class="ui primary button" id="Addmodule">
  Add
</div>

<div class="field">

<br> 

<div class="field">



<table class="ui very basic table" id="tblmoduledetailtbl"></table>


</div>


</div>

   </div>
  

  </div>
  
  
  
  <div class="title">
    <i class="dropdown icon"></i>
    Current Exemptions
  </div>
  <div class="content">
  
  <div class="ui form"> 
  
                     <div class="field">
                        <label for="">Module Code</label>
                        <div class="ui action input">
                                                <div class="ui loading fluid single search selection dropdown CurrentModulecode">
  <input type="hidden" name="country" value="kp">
  <i class="dropdown icon"></i>
  <input class="search">
  <div class="default text">Search...</div>
  <div class="menu" id="currentmodule">
    <div class="item">Choice 1</div>
    
  </div>
</div>
                            <div class="ui icon button" style="background-color: #e74c3c;" id="addcurrentmoduleBTN">
    <i class="fa fa-plus" aria-hidden="true" style="color: white;"></i>
  </div>
                        </div>

                    </div>
                    
                    <table class="ui very basic table" id="tblcurrentexcep"></table>
                                    <!-- <table class="ui single line table">
                    <thead>
                        <tr>
                             <th>MODULES</th>
                             <th>VERSION</th>
                             <th>SPECIAL NOTES</th>
                             <th>ATTACHED EVIDENCE</th>
                             
                             

                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                           
                            

                        </tr>

                    </tbody>
                </table> -->
                
                
                <div class="field">
                
                <div class="ui primary button" id="saveRPL">
  Save RPL
</div>
                
                </div>
  
  
  </div>

  
    

 </div>
 

 

 
</div>
        



        </div>


    </div>
    
    
        <div class="ui modal addExperiance" >

        <div class="header">

            Add Work Experience
        </div>


        <div class="content">

            <form action="" class="ui form">

                              <div class="two fields">
                    <div class="field">
                        <label for="">Number of Years Work Experience</label>

                        <select class="ui dropdown EXwork">
  <option value="">Years</option>
  <option value="1">1</option>
  <option value="0">2</option>
</select>
                    </div>
                    <div class="field">
                        <label for="">Level of Seniority</label>
                        <select class="ui dropdown EXsenior">
  <option value="">N/A</option>
  <option value="1">1</option>
  <option value="2">2</option>
  <option value="3">3</option>
  <option value="0">4</option>
</select>
                    </div>
                </div>
                
                
                                <div class="two fields">
                    <div class="field">
                        <label for="">Industry</label>

                        <select class="ui dropdown EXindustry">
  <option value="">Software Engineering</option>
  <option value="1">Hardware Engineering</option>
  <option value="0">Software Engineering</option>
</select>
                    </div>
                    <div class="field">
                        <label for="">Remark</label>
                        <div class="ui action input">
                            <input type="text" id="EXremarks" value="">

                            
                        </div>

                    </div>
                </div>
                
                <div class="two fields">
                <div class="field">
                
                <div class="ui primary button" id="Addexperiance">
  Add
</div>
                
                
                </div>
                
                
                </div>


            </form>

        </div>


    </div>
    
    







	<script>
	

	
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
	 
	 
     var awardCode;
	 var RQframe;
	 var Rlevel;	
	 var Raccreditdate;
	 var Rexpirydate;
	 var Rcurricode;
	 var Rversion;
	 var specialization;
	 var link="linktostorage";
		 
	 
	 var moduleName;
	 var Mcode;
	 var Mversion;
	 var Syllabuscode;
	 var credit;
	 var LearningHours;
	 var dGrade;
	 var RRqualififrame;
	 var RRaccredit;
 
 var modulearray=[];
 
 var Qfdata;
 var Equl;
 var rplqual;
 var Eqularray=[];
 var levelarray1=[];
 var moduledetailframeworkarray=[];
 var moduledetailfinalarray=[];
 var rpldetailqualificationarray=[];
 var currentdetailfinalarray=[];
 var Syllabusunitarr =[];
 var finalmodulearray=[];
 
 var EXwork;
 var EXsenior;
 var EXindustry;
 var EXremarks;
 var Ecomments;
 var Status="";
 var Modulecode;
 
 var un="";
 var moduleARR=[];
 var fmoduleversion;
 var unitarr="";
 
 var CurrentModulecode;
 var exceplist=[];
 var version;
 var SpecialNotes;
 var AttachedEvidence;
 
 var RAwardPartner;
 var awardName;
 var Description1;
 var Description2;
 
 
 var QualificationFrame = JSON.parse('${QF}');   

	 $(document).ready(function() {
	     $(".addqualiBtn").click(function() {
	    	 
	         $('.ui.modal.addQualificationframework').modal('show');
	         

				//alert(QualificationFrame['ScottishQualification']);
				
				//
				
				var list="";
				/* console.log(obj); */
				$.each(QualificationFrame, function(key1, value1) {
					 //console.log(key1);
					  		/* console.log(value1.Name);  */
					  		list = list
							+ ("<option>"+key1+"<\/option>");

				});
				$("#targetqframe").empty().append(
						list);
				
				$( ".Qframe" ).change(function() {
					 
					  
					  var selectqual = $('.Qframe').dropdown('get text');
					  
					 /*  var object123=QualificationFrame[selectqual]; */
						var changelist="";
						
						$.each(QualificationFrame, function(key1, value1) {
							 console.log(key1);
							  		/* console.log(value1.Name);  */
							  		
					 		  		
					 $.each(value1, function(key2, value2) {
							 
							  		if(key1==selectqual){
							  			
							  			changelist = changelist
										+ ("<option>"+QualificationFrame[""+selectqual+""][""+key2+""].Level+"<\/option>");
							  			
							  			
							  			Description1 =QualificationFrame[""+selectqual+""][""+key2+""].Description;
							  			
							  		} 
							  		
							  		

						});		
							  		
							  		/* changelist = changelist
									+ ("<option>"+value1[0].Level+"<\/option>"); */

						});
						$("#targetaccredit").empty().append(
								changelist);
					  
					});
				
				
				 $( ".level" ).change(function() {
					 var selectlevel3 = $('.level').dropdown('get text');
					
					 
					 $.each(QualificationFrame, function(key7, value7){
						 
						 $.each(value7, function(key8, value8){
							 
							 
							 if(value8.Level==selectlevel3){
								 
								 Description1=value8.Description;
								// console.log(value6.Description);
							 }
							 
							 
				
							 
						 });
						 
					 });
					 
					 
					 
	  			});
				
				
	         

	    }) 
	    
	    
       //  DATA TABLE DEFINITION START 	    
	    $('#tblframework1').DataTable({
			
			"paging" : false,
			"ordering" : false,
			"info" : false,
			"search" : false,

			columns : [ {
				title : "Qualification Framework"
			}, {
				title : "Level Of Accredittation"
			}, 
			
			{
				title : "Description"
			} 
					
			
			]
		});
		
		
		$('#tblframework1_filter').hide();
		
		
		
		
      $('#tblframework2').DataTable({
			
			"paging" : false,
			"ordering" : false,
			"info" : false,
			"search" : false,

			columns : [ {
				title : "Qualification Framework"
			}, {
				title : "Level Of Accredittation"
			}, 
			
			{
				title : "Description"
			} 
					
			
			]
		});
		
		
		$('#tblframework2_filter').hide();
		
		
      $('#Mtblframework1').DataTable({
			
			"paging" : false,
			"ordering" : false,
			"info" : false,
			"search" : false,

			columns : [ {
				title : "Qualification Framework"
			}, {
				title : "Level Of Accredittation"
			}, 
			
			{
				title : "Description"
			} 
					
			
			]
		});
		
		
		$('#Mtblframework1_filter').hide();
		
        $('#MworkexpTbl').DataTable({
			
			"paging" : false,
			"ordering" : false,
			"info" : false,
			"search" : false,

			columns : [ {
				title : "Number Of Years Work Experience"
			}, {
				title : "Level Of Seniority"
			}, 
			
			{
				title : "Industry"
			}, 
			
			{
				title : "Remarks"
			} 
					
			
			]
		});
		
		
		$('#MworkexpTbl_filter').hide();
		
		
$('#tblmoduledetailtbl').DataTable({
			
			"paging" : false,
			"ordering" : false,
			"info" : false,
			"search" : false,

			columns : [ {
				title : "Module Name"
			}, {
				title : "Module Code"
			}, 
			
			{
				title : "Module Version"
			}, 
			
			{
				title : "Syllabus Code"
			}, 
			{
				title : "Credits"
			},
			{
				title : "Accreditation Level"
			},
			
			{
				title : "Learning Hours"
			},
			{
				title : "Grade"
			},
			
			{
				title : "Attach Evidence"
			}
					
			
			]
		});
		
		
		$('#tblmoduledetailtbl_filter').hide();
		
		
        $('#tblcurrentexcep').DataTable({
			
			"paging" : false,
			"ordering" : false,
			"info" : false,
			"search" : false,

			columns : [ {
				title : "Modules"
			}, {
				title : "Version"
			}, 
			
			{
				title : "Special Notes"
			}, 
			
			{
				title : "Attached Evidence"
			} 
					
			
			]
		});
		
		
		$('#tblcurrentexcep_filter').hide();
		
		
		
	$('#tbladdmodule').DataTable({
			
			"paging" : false,
			"ordering" : false,
			"info" : false,
			"search" : false,

			columns : [ {
				title : "Module"
			}, {
				title : "Version"
			}, 
			 
			
			{
				title : "Credit"
			}, 
			
			{
				title : "Learning Hours"
			},
			{
				title : "Syllabus"
			},
			{
				title : "Status"
			}
			
			
					
			
			]
		});
		
		
		$('#tbladdmodule_filter').hide();
		
		
		
$('#tblmainawardfinal').DataTable({
			
			"paging" : false,
			"ordering" : false,
			"info" : false,
			"search" : false,

			columns : [ {
				title : "RPL name"
			}, {
				title : "Award name"
			}, 
			
			{
				title : "RPL modules"
			}, 
			
			{
				title : "Exemption"
			}, 
			
			{
				title : "Action"
			}
			

			
					
			
			]
		});
		
		
		$('#tblmainawardfinal_filter').hide();
		
	    
	//  DATA TABLE DEFINITION END 	
	
				
				

				
				
	                 var Qframe;
					 var level;
					 
					 
	
		    $("#addtbl1").click(function() {
		    	
		    	Qframe = $('.Qframe').dropdown('get text');
		    	level = $('.level').dropdown('get text');
		    	
		    	
		    		    	
		    	
		    //	levelarray1.push(level);
		    	
		    	
		    	Qfdata ={
		    			
		    			[Qframe]:{
							
							"Levels": level,
							"Description":Description1
							
						} 	
		    			
		    	}
		    	
		    	levelarray1.push(Qfdata);
		    	
	    	 
		    $('#tblframework1').DataTable().row.add([ Qframe,level,Description1]).draw();
		    

	    })
	    
	    
	    	    $(".EntryaddqualiBtn").click(function() {
	    	 
	         $('.ui.modal.EntryaddQualificationframework').modal('show');
	         
	         
				var list="";
				/* console.log(obj); */
				$.each(QualificationFrame, function(key1, value1) {
					 //console.log(key1);
					  		/* console.log(value1.Name);  */
					  		list = list
							+ ("<option>"+key1+"<\/option>");

				});
				$("#targetframe2").empty().append(
						list);
				
				$(".EnQframe").change(function() {
					 
					  
					  var selectqual = $('.EnQframe').dropdown('get text');
					  
					 /*  var object123=QualificationFrame[selectqual]; */
						var changelist="";
						
						$.each(QualificationFrame, function(key1, value1) {
							// console.log(key1);
							  		/* console.log(value1.Name);  */
							  		
					 		  		
					 $.each(value1, function(key2, value2) {
							 
							  		if(key1==selectqual){
							  			
							  			changelist = changelist
										+ ("<option>"+QualificationFrame[""+selectqual+""][""+key2+""].Level+"<\/option>");
							  			
							  			
							  			
							  		} 
							  		
							  		

						});		
							  		
							  		

						});
						$("#targetlevel2").empty().append(
								changelist);
					  
					});
				
				
				 $( ".Enlevel" ).change(function() {
					 var selectlevel = $('.Enlevel').dropdown('get text');
					
					 
					 $.each(QualificationFrame, function(key5, value5){
						 
						 $.each(value5, function(key6, value6){
							 
							 
							 if(value6.Level==selectlevel){
								 
								 Description2=value6.Description;
								// console.log(value6.Description);
							 }
							 
							 
				
							 
						 });
						 
					 });
					 
					 
					 
	  			}); 
	         
	         


	    })
	    
	    
	    var EnQframe;
		var ENlevel;
		
		
		
	    $("#addEntryQualBTN").click(function() {
		    	
	    	EnQframe = $('.EnQframe').dropdown('get text');
	    	ENlevel = $('.Enlevel').dropdown('get text');
	    	
	    	//Eqularray.push(ENlevel);
	    	Equl ={
	    			
	    			[EnQframe]:{
						
						"Levels": ENlevel,
						"Description":Description2
						
					}
	    			
	    	}
	    	
	    	Eqularray.push(Equl);
	    	//console.log(Eqularray);
	    	 
	    	console.log(Description2);
	    	
		    $('#tblframework2').DataTable().row.add([ EnQframe,ENlevel,Description2]).draw();
		    $('#Mtblframework1').DataTable().row.add([ EnQframe,ENlevel,Description2]).draw();
		    

	    })
	    
	    
	    $("#addworkEXBTN").click(function() {
		    	
	    	EnQframe = $('.EnQframe').dropdown('get text');
	    	ENlevel = $('.Enlevel').dropdown('get text');
	    	 
		    $('#tblframework2').DataTable().row.add([ EnQframe,ENlevel,Description2]).draw();
		    $('#Mtblframework1').DataTable().row.add([ EnQframe,ENlevel,Description2]).draw();
		    

	    })
	    
	    
	                
					 
	    $("#Addexperiance").click(function() {
		    	
	    	EXwork = $('.EXwork').dropdown('get text');
	         EXsenior = $('.EXsenior').dropdown('get text');
	         EXindustry = $('.EXindustry').dropdown('get text');
	         EXremarks = $("#EXremarks").val();
	         
	         
	         
	    	 
		    $('#MworkexpTbl').DataTable().row.add([ EXwork,EXsenior,EXindustry,EXremarks]).draw();
		    
		    

	    })
    
	    
				 
		
				 
	    $("#Addmodule").click(function() {
	    	
	    	// RAwardPartner = $('.RAwardPartner').dropdown('get text');
	    	 
			 
	
			moduleName = $("#moduleName").val();
			Mcode = $("#Mcode").val();
			Mversion = $("#Mversion").val();
			 Syllabuscode = $("#Syllabuscode").val();
			credit = $("#credit").val();
			RRaccredit = $('.RRaccredit').dropdown('get text');
		    LearningHours = $("#LearningHours").val();
		    dGrade = $('.dGrade').dropdown('get text');
		    RRqualififrame = $('.RRqualififrame').dropdown('get text');
		    
		    

		    
		    modulearray.push(moduleName);
		    
		    var moduledetailset ={
		    		
            [RRqualififrame]:{
						
						"Levels": RRaccredit
						
					}
		    		
		    		
		    }
		    
		    
			moduledetailframeworkarray.push(moduledetailset); 
		   // console.log(moduledetailframeworkarray);
		    
		    
		    var moduledetailfinal={
		    		
		    		"ModuleName":moduleName,
					"Version":Mversion,
					"SyllabusCode":Syllabuscode,
					"Credit":credit,
					"LearningHours":LearningHours,
					"Grade":dGrade,
					"QualificationFramework":moduledetailframeworkarray
		    		
		    }
		    
		    moduledetailfinalarray.push(moduledetailfinal);
		   // console.log(moduledetailfinalarray);
	    	 
		    $('#tblmoduledetailtbl').DataTable().row.add([ moduleName,Mcode,Mversion,Syllabuscode,credit,RRaccredit,LearningHours,dGrade,link]).draw();
		    
		  

	    })
	    
 
	    
	                
					 
	    $(".workexBTN").click(function() {
	         $('.ui.modal.addExperiance').modal('show');
	           

	    })  
	    
	    $(".addrplBTN").click(function() {
	         $('.ui.modal.addRPL').modal('show');
	         
	         /* */
	         
	         
	         	var list="";
				
				$.each(QualificationFrame, function(key1, value1) {
					 //console.log(key1);
					  		/* console.log(value1.Name);  */
					  		list = list
							+ ("<option>"+key1+"<\/option>");

				});
				$("#targetframe3").empty().append(
						list);
				
				$(".RQframe").change(function() {
					 
					  
					  var selectqual = $('.RQframe').dropdown('get text');
					  
					 /*  var object123=QualificationFrame[selectqual]; */
						var changelist="";
						
						$.each(QualificationFrame, function(key1, value1) {
							// console.log(key1);
							  		/* console.log(value1.Name);  */
							  		
					 		  		
					 $.each(value1, function(key2, value2) {
							 
							  		if(key1==selectqual){
							  			
							  			changelist = changelist
										+ ("<option>"+QualificationFrame[""+selectqual+""][""+key2+""].Level+"<\/option>");
							  			
							  		} 
							  		
							  		

						});		
							  		
							  		/* changelist = changelist
									+ ("<option>"+value1[0].Level+"<\/option>"); */

						});
						$("#targetlevel3").empty().append(
								changelist);
					  
					});
	         
	         
	         
	         
	         /* */
	         
	         
	          /* */
	         
	         
	         	var list22="";
				
				$.each(QualificationFrame, function(key1, value1) {
					 //console.log(key1);
					  		/* console.log(value1.Name);  */
					  		list22 = list22
							+ ("<option>"+key1+"<\/option>");

				});
				$("#targetframe4").empty().append(
						list22);
				
				$(".RRqualififrame").change(function() {
					 
					  
					  var selectqual22 = $('.RRqualififrame').dropdown('get text');
					  
					 /*  var object123=QualificationFrame[selectqual]; */
						var changelist22="";
						
						$.each(QualificationFrame, function(key1, value1) {
							// console.log(key1);
							  		/* console.log(value1.Name);  */
							  		
					 		  		
					 $.each(value1, function(key2, value2) {
							 
							  		if(key1==selectqual22){
							  			
							  			changelist22 = changelist22
										+ ("<option>"+QualificationFrame[""+selectqual22+""][""+key2+""].Level+"<\/option>");
							  			
							  		} 
							  		
							  		

						});		
							  		
							  		/* changelist = changelist
									+ ("<option>"+value1[0].Level+"<\/option>"); */

						});
						$("#targetlevel4").empty().append(
								changelist22);
					  
					});
	         
	         
	         
	         
	         /* */
	         
	         var Lmodulelist="";
	         
	         for (index = 0; index < moduleARR.length; ++index) {
				    
				 
				 Lmodulelist = Lmodulelist
					+ ("<div class=\"item\">"+moduleARR[index]+"<\/div>");
				 
				 
				 
				}
	         
	         $("#currentmodule").empty().append(
	        		 Lmodulelist); 
	         
	         
	         
	         
				var rplpartner = JSON.parse('${rpl}');                         
				//console.log(unitslist);
				var partnerlist="";
				/* console.log(obj); */
				$.each(rplpartner, function(key1, value1) {
					 //console.log(key1);
					  		/* console.log(value1.Name);  */
					  		partnerlist = partnerlist
							+ ("<div class=\"item\">"+value1.RplName+"<\/div>");

				});
				$("#rplpartnerlist").empty().append(
						partnerlist);
	         
	         

	    })
	    
	    
	    
	    $("#createModuleBTN").click(function(){
	    	window.open('${pageContext.request.contextPath}/ap/module_specification22', '_blank');
	    	
	    });
	     
	     
	     
	     
			var module = JSON.parse('${module}');                         
			//console.log(unitslist);
			var modulelist="";
			/* console.log(obj); */
			$.each(module, function(key1, value1) {
				 console.log(key1);
				  		/* console.log(value1.Name);  */
				  		modulelist = modulelist
						+ ("<div class=\"item\">"+key1+"<\/div>");

			});
			$("#modulemenu").empty().append(
					modulelist);  	 
			
			/* End of ducument read */
			
			
			 
			 $( ".ui.toggle" ).change(function() {
				 
				 
				    checked = $('.ui.toggle input').is(':checked');
				    //console.log(checked);
				    if (checked === true) {
				        Status = "Mandatory";
				    }
				    else {
				    	Status = "Optional";
				    }
				 
				 
				});
			
			
			 
			 $("#addmoduleBTN").click(function(){
				 
				 Syllabusunitarr=[];
				 
				 var moduleselect = JSON.parse('${module}');  
				   
				 Modulecode = $('.Modulecode').dropdown('get text');
				 moduleARR.push(Modulecode);
				 
				var moduleName = moduleselect[""+[Modulecode]+""].ModuleName;
				fmoduleversion = moduleselect[""+[Modulecode]+""].Version;
				
				 //moduleversion = moduleselect[""+[Modulecode]+""].ModuleName;
				 //Level = moduleselect[""+[Modulecode]+""].ModuleName;
				var Credits = moduleselect[""+[Modulecode]+""].TotalCredits;
				var Tlearninghours = moduleselect[""+[Modulecode]+""].LearningHours;
				
				 

				 
				
				 
				 var test = moduleselect[""+[Modulecode]+""].SyllabusUnits.Units;
				//console.log(test);
				 
				 
				 $.each(test, function(key2, value2) {
					 //console.log(key2);
					  		  
					  		
					  		unitarr = value2.UnitName;
					  		 		  		  		
					  		Syllabusunitarr.push(unitarr);	
					  		console.log(Syllabusunitarr);
					  		
					  		$('#tbladdmodule').DataTable().row.add([ moduleName,fmoduleversion,Credits,Tlearninghours,unitarr,Status]).draw();
				});
				 
				// console.log(Status);
				
				
				
				 /* for (index = 0; index < Syllabusunitarr.length; index++) {
					    
					 un+=Syllabusunitarr[index]+"<br\/>";
					 
					} */
				 
				 

				
		//Reuested to comment		 
				 
		/* 		 var moduleset ={
						 
						 "ModuleCode":Modulecode,
						  
							"Version":fmoduleversion,
							"Level":fmodulelevel,
							"Credit":Credits,
							"LearningHours":Tlearninghours,
							"Syllabus":Syllabusunitarr,
							
							  
						 
						 
						 
				 }
				 
				 finalmodulearray.push(moduleset); */
				 
				 
				 var moduleset ={
						 
						 [Modulecode]:{
							 
							 "Module":moduleName,
							 "Status":Status
						 }
						 
				 }
				 
				 finalmodulearray.push(moduleset);
				 console.log(finalmodulearray);
				 
				
				
				 
				});
			 
 
			 
			 $("#addcurrentmoduleBTN").click(function(){
				    
				 var currentExcept = JSON.parse('${module}');
				 CurrentModulecode = $('.CurrentModulecode').dropdown('get text');
				 
				 var moduleName = currentExcept[""+[CurrentModulecode]+""].ModuleName;
				 exceplist.push(moduleName);
				 
				 /* *******************STATIC ENTRY *********************************************** */
				 
				version =currentExcept[""+[CurrentModulecode]+""].Version;
				 
				Ecomments = $("#Ecomments").val();
				SpecialNotes = Ecomments;
				AttachedEvidence ="statAttachedEvidence";
				 
				 
				 var currentdetailset ={
						 
						              "Module":CurrentModulecode,
							          "Version":version,
								      "SpecialNotes":SpecialNotes,
									  "AttachedEvidence":AttachedEvidence
						 
						 
				 }
				 
				 
				 currentdetailfinalarray.push(currentdetailset);
				 
				 /* *******************STATIC ENTRY *********************************************** */
				 
				 $('#tblcurrentexcep').DataTable().row.add([ moduleName,version,SpecialNotes,AttachedEvidence]).draw();
				 
				});
					 
			 
			 $("#saveRPL").click(function(){
				 
				 RQframe = $('.RQframe').dropdown('get text');
				 Rlevel = $('.Rlevel').dropdown('get text');
				 specialization = $('.specialization').dropdown('get text');
				 
				
			      awardCode = $("#awardCode").val();
				  Raccreditdate = $("#Raccreditdate").val();
				  Rexpirydate = $("#Rexpirydate").val();
				 Rcurricode = $("#Rcurricode").val();
				 Rversion = $("#Rversion").val();
				    
				 RAwardPartner = $('.RAwardPartner').dropdown('get text');
				 awardName = $("#awardName").val();
				 var ex=""; // Excempted modules
				 var exM=""; // RPL modules
				 
				 
				 for (index = 0; index < exceplist.length; ++index) {
					    
					 ex+=exceplist[index]+"<br\/>";
					 
					}
				 
				 for (index = 0; index < modulearray.length; ++index) {
					    
					 exM+=modulearray[index]+"<br\/>";
					 
					}
				 
				 	 
				 
				 rplqual={
						 
						 [RQframe]:{
								
								"Levels": Rlevel
								
							} 
						 
						 
				 }
				 
				 rpldetailqualificationarray.push(rplqual);
					
				   
				 $('#tblmainawardfinal').DataTable().row.add([ RAwardPartner,awardName,exM,ex,"blank"]).draw();
				 
				});
			 
				$('#addAwardDB')
				.click(
						function() {
							
							var awname = $("#Mainawardingname").val();
							var awcode = $("#Mainawardingcode").val();
							var Aversion = $("#Aversion").val();
							
							 var awardLength = $('.awardLength').dropdown('get text');
							 var cluster = $('.cluster').dropdown('get text');
							 var Semester = $('.Semester').dropdown('get text');
							 

							 var approvedate = $("#Aapprovedate").val();
							 var Aversion = $("#Aversion").val();
							 var Atotalcredits = $("#Atotalcredits").val();
							 
							 
			
				             
							
							var data = {
								"AwardName":awname,
								"AwardCode":awcode,
								"LengthofAward" : awardLength,
								"Cluster" : cluster,
								"Curriculum_Approved_Date" : approvedate,
								"Version" : Aversion,
								"Semester" : Semester,
								"Total_Number_of_Credits" : Atotalcredits,
								"QualificationFramework":levelarray1,
								"Entry_Requirement" : {
									
									"QualificationFramework":Eqularray,
									
									
									"Experience" : {
										
										 "workyears":EXwork,
										"Seniority":EXsenior,
										"Industry":EXindustry,
										"Remarks":EXremarks,
										"Comments": Ecomments
											
										
									}
									
								},
			
								"RPL" : {
									
									"RPLdetails":{
										
		 								"RPLpartner":RAwardPartner,
										"AwardName":awardName,
										"AwardCode":awardCode,
										"QualificationFramework":rpldetailqualificationarray,
										"DateofAccredation":Raccreditdate,
										"ExpireDate":Rexpirydate,
										//"Reminder",
										"CurriculumCode":Rcurricode,
										"Version":Rversion,
										"Specialization":specialization 
										
									},
									
									"Moduledetails":moduledetailfinalarray,
										

									
									"CurrentExceptions":currentdetailfinalarray
										
			
								},
								
								"Modules":finalmodulearray
								
								
						

							};
							data = JSON.stringify(data);
							console.log("test");
							console.log(data);

							$.ajax({
										type : "POST",
										accept : "text/html",
										//contentType: "application/json; charset=utf-8",
										dataType : "html",
										url : "${pageContext.request.contextPath}/ap/award22/add",
										data : ({
											"data" : data
											
										})
									});
							
							location.reload();

						});
			 
			
	    
	    });
	 

	


		
	</script>

</div>



</body>

</html>

