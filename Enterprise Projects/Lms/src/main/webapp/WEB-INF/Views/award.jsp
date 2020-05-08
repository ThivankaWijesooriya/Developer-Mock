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
     
      background: #0867fb66;
     }

</style>
     



</head>

<body>

<div class="content_bar">

	   <div class="vihayas_datatable">



        <div class="fr_left_buttons">

            <button class="ui primary button addaward">
  Add Award
</button>


        </div>

        <div class="fr_right_buttons">
            <div class="ui action input">
                <input type="text" placeholder="Search ">
                <select class="ui compact selection dropdown">
   
    <option selected="" value="Partner_Code">Partner Code</option>
    <option value="Partner_Name">Partner Name</option>
     <option value="Country">Country</option>
   
  </select>
                <div type="submit" class="ui button">Search</div>
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

          <table class="ui single line table" id="tblawarddetails"></table>
          <!--      ui very basic table-->

        </div>
    </div>



    <!-- Start of models -->




    <!-- End of models -->

    <script>
        

        
        

			
			
			$(document).ready(function(){
			    $(".addaward").click(function(){

			    	location.href="${pageContext.request.contextPath}/ap/award22";
			    	
			    });
			    
			    
			    $('#tblawarddetails').DataTable({
					
					"paging" : false,
					"ordering" : false,
					"info" : false,
					"search" : false,
					

					columns : [  {
						title : "Length Of Award"
						}, 
						{
						title : "Cluster"
						},
						{
							title : "Curriculum Approved Date"
						},
						
						{
							title : "Total Number Of Credits"
						},
						
						{
							title : "Action"
						}
			
						
						]
				});
				
				$('#tblawarddetails_filter').hide();
			    
			    var award = JSON.parse('${awardv}');
			    
			    var strVar="";
			    strVar += "	                            <div class=\"ui teal buttons fluid\">";
			    strVar += "                                <div class=\"ui button modifyaward\" >Modify <\/div>";
			    strVar += "                                <div class=\"ui floating dropdown icon button\">";
			    strVar += "                                    <i class=\"dropdown icon\"><\/i>";
			    strVar += "";
			    strVar += "                                    <div class=\"menu\">";
			    strVar += "                                        <div class=\"item viewaward\" ><i class=\"remove user icon\"><\/i> View <\/div>";
			    strVar += "";
			    strVar += "";
			    strVar += "";
			    strVar += "";
			    strVar += "                                    <\/div>";
			    strVar += "";
			    strVar += "";
			    strVar += "                                <\/div>";
			    strVar += "                            <\/div>";
			    
				$.each(award, function(key, value) {

					//cosnole.log(value.Cluster);
					
				$('#tblawarddetails').DataTable().row.add([value.LengthofAward,value.Cluster,value.Curriculum_Approved_Date,value.Total_Number_of_Credits,strVar]).draw();
				
					


				});
			    
			   // $('#tblmoduledetails').DataTable().row.add([ Component,"<i class=\"fa fa-times\" aria-hidden=\"true\"><\/i>" ]).draw();
			    
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
