<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<link
	href="https://cdn.datatables.net/1.10.19/css/jquery.dataTables.min.css" />
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" />
	
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<script
		src="https://cdn.datatables.net/1.10.19/js/jquery.dataTables.min.js"></script>
	<script src="//cdn.datatables.net/plug-ins/1.10.19/api/sum().js"></script>	

<script src="https://cdn.datatables.net/buttons/1.2.2/js/dataTables.buttons.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jszip/2.5.0/jszip.min.js"></script>
<script src="https://cdn.rawgit.com/bpampuch/pdfmake/0.1.18/build/pdfmake.min.js"></script>
<script src="https://cdn.rawgit.com/bpampuch/pdfmake/0.1.18/build/vfs_fonts.js"></script>
        
<script src="https://cdn.datatables.net/buttons/1.2.2/js/buttons.html5.min.js"></script>	

</head>
<body>


	<table id="test">

		<tfoot align="right">
		<tr><th></th><th></th><th></th><th></th><th></th><th></th></tr>
		<!-- <tr><th></th><th></th><th></th><th></th><th>Unsettled</th><th></th></tr>
		<tr><th></th><th></th><th></th><th></th><th>Float</th><th>2000</th></tr> -->
	   </tfoot>
		
		
		
	</table>




	<script type="text/javascript">
	
		var strVar="";
		strVar += "&nbsp;";

		
		var obj = JSON.parse('${catlist}');

		var Total = 0;

		var table = $('#test').DataTable({

			"paging" : false,
			"ordering" : false,
			"info" : false,
			"search" : false,
			columns : [

			{
				title : "Item"
			},
			
			{
				title : "Column2"
			},
			
			{
				title : "Column3"
			},
			
			{
				title : "Column4"
			},
			
			{
				title : "Column5"
			},

			{
				title : "Price"
			}

			],
			
			dom: 'Bfrtip',
			buttons: [
			        
				{ extend: 'pdfHtml5', footer: true, exportOptions: { stripNewlines: false } },
				{ extend: 'excelHtml5', footer: true, exportOptions: { stripNewlines: false } }
			        
			      
			],

			fixedHeader : {
				header : true,
				footer : true
			},
			
			 drawCallback: function () {
					
			      var api = this.api();
			      
			      var sum = api.column( 5 ).data().sum();

			      $( api.column(4).footer() ).html('Total'+'\n'+'Float');
			      $( api.column(5).footer() ).html( sum+'\n'+'1000');
			      
			      var length = api.page.info().recordsTotal;
			      console.log(length);
			      
			      
			 } 
	        
	        


		});

		$('#test_filter').hide();

		$.each(obj, function(key, value) {

			Total = Total + value.price;
			$('#test').DataTable().row.add([ value.itemname, "blah","blah","blah","blah",value.price ]).draw();
					

		});
		

		$(".buttons-excel").on('click',function(){

			console.log("excel");
		});
		
		$(".buttons-pdf").on('click',function(){

			console.log("pdf");
		});

		
	</script>


</body>
</html>