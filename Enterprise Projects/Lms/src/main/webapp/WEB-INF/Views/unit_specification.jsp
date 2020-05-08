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

			<div class="ui primary button " id="openunitodal">Add Units</div>



		</div>

		<div class="fr_right_buttons">
			<div class="ui action input">
				<input type="text" placeholder="Search "> <select
					class="ui compact selection dropdown">

					<option selected="" value="Partner_Code">Partner Code</option>
					<option value="Partner_Name">Partner Name</option>
					<option value="Country">Country</option>

				</select>
				<div type="submit" class="ui button">Search</div>
			</div>
		</div>

		<div class="sr_left_buttons"></div>

		<div class="sr_right_buttons">
			<div class="ui teal buttons">
				<div class="ui button approveunit" >Approve</div>
				<div class="ui floating dropdown icon button">
					<i class="dropdown icon"></i>
					<div class="menu">

					
						<div class="item declineunit">
							<i class="delete icon"></i> Decline
						</div>
						<div class="item suspendunit">
							<i class="delete icon"></i> Suspend
						</div>
						<div class="item deactivateunit">
							<i class="delete icon"></i> Deactivate
						</div>
						

					</div>
				</div>
			</div>
		</div>
		<div class="data_table">

        <table class="ui single line table" id="tblUnitdetails"></table>

		</div>
	</div>



	<!-- Start of models -->

	


	<!-- End of models -->





	<script>
		
	
	var idcapture;
	var modifyid;
	var action;

		$(document).ready(function() {
			$('#openunitodal').click(function() {
				localStorage.clear();
				location.href="${pageContext.request.contextPath}/ap/unit_specification22"
			});

 
			
			
			$('#tblUnitdetails').DataTable({
				
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
						title : "UnitName"
					},
					{
						title : "UnitOverview"
					},
					
					{
						title : "LearningOutcomeName"
					},
					
					{
						title : "LeadName"
					},
					{
						title : "Action"
					}
		
					
					]
		    

		    
			});
			
			$('#tblUnitdetails_filter').hide();
			
			
			
			
			var Unit = JSON.parse('${Unit}');
			$.each(Unit, function(key, value) {

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
	multiaction += "				<div class=\"ui button modifyunit\" >Modify<\/div>";
	multiaction += "				<div class=\"ui floating dropdown icon button\">";
	multiaction += "					<i class=\"dropdown icon\"><\/i>";
	multiaction += "					<div class=\"menu\">";
	multiaction += "";
	multiaction += "						<div class=\"item viewunits\">";
	multiaction += "							<i class=\"delete icon\"><\/i> View";
	multiaction += "						<\/div>";
	multiaction += "					";
	multiaction += "						<div class=\"item approveunit\">";
	multiaction += "							<i class=\"delete icon\"><\/i> Approve";
	multiaction += "						<\/div>";
	multiaction += "						<div class=\"item declineunit\">";
	multiaction += "							<i class=\"delete icon\"><\/i> Decline";
	multiaction += "						<\/div>";
	multiaction += "						<div class=\"item suspendunit\">";
	multiaction += "							<i class=\"delete icon\"><\/i> Suspend";
	multiaction += "						<\/div>";
	multiaction += "						<div class=\"item deactivateunit\">";
	multiaction += "							<i class=\"delete icon\"><\/i> Deactivate";
	multiaction += "						<\/div>";
	multiaction += "						";
	multiaction += "";
	multiaction += "					<\/div>";
	multiaction += "				<\/div>";
	multiaction += "			<\/div>";


					
				$('#tblUnitdetails').DataTable().row.add([checkbox,key,value.UnitName,value.UnitOverview,value.LearningOutcome.LearningOutcomeName,value.LearningOutcome.Lead.LeadName,multiaction]).draw();
				
					


				});
			
			$(".modifyunit").click(function(){
				
				  action ="Update";
			    
			       var table = $('#tblUnitdetails').DataTable();
					 
					$('#tblUnitdetails tbody').on( 'click', 'tr', function () {
					     modifyid= ( table.row( this ).data()[1] );
					    			    
					  localStorage.setItem("modifyid", ""+modifyid+"");
					  window.location.href = "<%=session.getAttribute("serverRoot")%>/ap/unit_specification22";
			    
			    
			});
					
					
					
			});
			
			$(".viewunits").click(function () {
		        
   
		         var table = $('#tblUnitdetails').DataTable();
				 
				$('#tblUnitdetails tbody').on( 'click', 'tr', function () {
				    idcapture= ( table.row( this ).data()[1] );
				   
				   
               
				    
				} );  
					
				
				
		    });	
			
			
			
 
           
           $('.dropdown').dropdown({
   			// you can use any ui transition
   			transition : 'drop'
   		});
           
		});
		
		
		
	</script>

</div>




</body>

</html>

