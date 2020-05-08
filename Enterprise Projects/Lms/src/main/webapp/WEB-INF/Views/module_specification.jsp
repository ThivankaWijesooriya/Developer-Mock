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

            <button class="ui primary button addmodule">
  Add Module
</button>


        </div>

        <div class="fr_right_buttons">
            <div class="ui action input">
                <input type="text" placeholder="Search " id="searchkey" value="">
                <select class="ui compact selection dropdown searchoption">
   
    <option selected="" value="Partner_Code">Partner Code</option>
    <option value="Partner_Name">Partner Name</option>
     <option value="Country">Country</option>
   
  </select>
                <div type="submit" class="ui button" id="searchtrigger">Search</div>
            </div>
        </div>

        <div class="sr_left_buttons">





        </div>

        <div class="sr_right_buttons">
            <div class="ui teal buttons">
                <div class="ui button" onclick="modifypartner();">Modify </div>
                <div class="ui floating dropdown icon button">
                    <i class="dropdown icon"></i>
                    <div class="menu">

                        <div class="item"><i class="delete icon"></i> View</div>

                    </div>
                </div>
            </div>
        </div>
        <div class="data_table">

          <table class="ui very basic table" id="tblmoduledetails"></table>

        </div>
    </div>



    <!-- Start of models -->




    <!-- End of models -->

    <script>
  
        
        

			
			
			$(document).ready(function(){
			    $(".addmodule").click(function(){
			    	location.href="${pageContext.request.contextPath}/ap/module_specification22";
			    	
			    });
			    
			    
			    $('#tblmoduledetails').DataTable({
					
					"paging" : false,
					"ordering" : false,
					"info" : false,
					"search" : false,

					columns : [  {
						title : ""
						}, 
						{
							title : "Module Name"
						}, 
						{
						title : "Module Overview"
						},
						{
							title : "Version"
						},
						
						{
							title : "Total credits"
						},
						
						{
							title : "Action"
						}
			
						
						]
				});
				
				$('#tblmoduledetails_filter').hide();
			    
			    var module = JSON.parse('${module}');
			    
			    
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
				multiaction += "				<div class=\"ui button modifymodule\" >Modify<\/div>";
				multiaction += "				<div class=\"ui floating dropdown icon button\">";
				multiaction += "					<i class=\"dropdown icon\"><\/i>";
				multiaction += "					<div class=\"menu\">";
				multiaction += "";
				multiaction += "						<div class=\"item viewmodule\">";
				multiaction += "							<i class=\"delete icon\"><\/i> View";
				multiaction += "						<\/div>";
				multiaction += "					";
				multiaction += "						<div class=\"item approvemodule\">";
				multiaction += "							<i class=\"delete icon\"><\/i> Approve";
				multiaction += "						<\/div>";
				multiaction += "						<div class=\"item declinemodule\">";
				multiaction += "							<i class=\"delete icon\"><\/i> Decline";
				multiaction += "						<\/div>";
				multiaction += "						<div class=\"item suspendmodule\">";
				multiaction += "							<i class=\"delete icon\"><\/i> Suspend";
				multiaction += "						<\/div>";
				multiaction += "						<div class=\"item deactivatemodule\">";
				multiaction += "							<i class=\"delete icon\"><\/i> Deactivate";
				multiaction += "						<\/div>";
				multiaction += "						";
				multiaction += "";
				multiaction += "					<\/div>";
				multiaction += "				<\/div>";
				multiaction += "			<\/div>";
			    
			    
			    
				$.each(module, function(key, value) {

					
					
				$('#tblmoduledetails').DataTable().row.add([ checkbox,value.ModuleName,value.ModuleOverview.Overview,value.Version,value.TotalCredits,multiaction
				]).draw();
					


				});
			    
			   // $('#tblmoduledetails').DataTable().row.add([ Component,"<i class=\"fa fa-times\" aria-hidden=\"true\"><\/i>" ]).draw();
			   
			   
			    $("#searchtrigger").click(function(){
				   
                      
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

