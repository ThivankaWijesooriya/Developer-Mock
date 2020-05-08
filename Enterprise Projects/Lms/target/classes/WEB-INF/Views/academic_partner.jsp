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
     
      background: #d0f21c94;
     }
     
     </style>

</head>



<body>

<div class="content_bar">

	<div class="vihayas_datatable">



		<div class="fr_left_buttons">

			<div class="ui primary button addpartnerbtnnn">Add Partner
			</div>


		</div>

		<div class="fr_right_buttons">
			<div class="ui action input">
				<input type="text" placeholder="Search " id="searchkey" value=""> <select
					class="ui compact selection dropdown searchoption">


					<option value="Partner_Name">Partner Name</option>
					<option value="Country">Country</option>

				</select>
				<div type="submit" class="ui button" id="searchtrigger">Search</div>
			</div>
		</div>

		<div class="sr_left_buttons"></div>

		<div class="sr_right_buttons"></div>
		<div class="data_table Apartners">
		
		 <table class="ui single line table" id="tblpartnerdetails"></table>

		</div>
	</div>



	<!-- Start of models -->

	<div class="ui modal addpartner">

		<div class="header">Create Academic Partner</div>

		<div class="scrolling content">


			<form class="ui form">

				<div class="two fields">
					<div class="field" style="border: 0;">
						<label>Upload Image</label> <br />
						<div class="ui transparent input">

							<input type='file' class="inimg" onchange="readURL(this);" />
						</div>

					</div>
					<div class="field">
						<img id="blah" src="http://placehold.it/180" alt="your image" />
					</div>
				</div>


				<div class="field">
					<label>Awarding Partner Name</label> <input type="text"
						name="AcademicPartnerName" placeholder="" id="AcademicPartnerName"
						value="">
				</div>



				<label> <strong>Global Office Address </strong></label>

				<div class="two fields">
					<div class="field">

						<input type="text" name="FirstStreet" placeholder="1st Street"
							id="FirstStreet">
					</div>
					<div class="field">

						<input type="text" name="SecondStreet" placeholder="2nd Street"
							id="SecondStreet">
					</div>
				</div>

				<div class="two fields">
					<div class="field">
						<input type="text" name="Town" placeholder="Town" id="Town">
					</div>
					<div class="field">
						<input type="text" name="PostalCode" placeholder="Postal code"
							id="PostalCode">
					</div>
				</div>

				<div class="field">
					<label>Country</label>
<div class="ui fluid search selection dropdown country">
  <input type="hidden" name="country">
  <i class="dropdown icon"></i>
  <div class="default text" id="trigcountry"></div>
  <div class="menu">
  <div class="item" data-value="af"><i class="af flag"></i>Afghanistan</div>
  <div class="item" data-value="ax"><i class="ax flag"></i>Aland Islands</div>
  <div class="item" data-value="al"><i class="al flag"></i>Albania</div>
  <div class="item" data-value="dz"><i class="dz flag"></i>Algeria</div>
  <div class="item" data-value="as"><i class="as flag"></i>American Samoa</div>
  <div class="item" data-value="ad"><i class="ad flag"></i>Andorra</div>
  <div class="item" data-value="ao"><i class="ao flag"></i>Angola</div>
  <div class="item" data-value="ai"><i class="ai flag"></i>Anguilla</div>
  <div class="item" data-value="ag"><i class="ag flag"></i>Antigua</div>
  <div class="item" data-value="ar"><i class="ar flag"></i>Argentina</div>
  <div class="item" data-value="am"><i class="am flag"></i>Armenia</div>
  <div class="item" data-value="aw"><i class="aw flag"></i>Aruba</div>
  <div class="item" data-value="au"><i class="au flag"></i>Australia</div>
  <div class="item" data-value="at"><i class="at flag"></i>Austria</div>
  <div class="item" data-value="az"><i class="az flag"></i>Azerbaijan</div>
  <div class="item" data-value="bs"><i class="bs flag"></i>Bahamas</div>
  <div class="item" data-value="bh"><i class="bh flag"></i>Bahrain</div>
  <div class="item" data-value="bd"><i class="bd flag"></i>Bangladesh</div>
  <div class="item" data-value="bb"><i class="bb flag"></i>Barbados</div>
  <div class="item" data-value="by"><i class="by flag"></i>Belarus</div>
  <div class="item" data-value="be"><i class="be flag"></i>Belgium</div>
  <div class="item" data-value="bz"><i class="bz flag"></i>Belize</div>
  <div class="item" data-value="bj"><i class="bj flag"></i>Benin</div>
  <div class="item" data-value="bm"><i class="bm flag"></i>Bermuda</div>
  <div class="item" data-value="bt"><i class="bt flag"></i>Bhutan</div>
  <div class="item" data-value="bo"><i class="bo flag"></i>Bolivia</div>
  <div class="item" data-value="ba"><i class="ba flag"></i>Bosnia</div>
  <div class="item" data-value="bw"><i class="bw flag"></i>Botswana</div>
  <div class="item" data-value="bv"><i class="bv flag"></i>Bouvet Island</div>
  <div class="item" data-value="br"><i class="br flag"></i>Brazil</div>
  <div class="item" data-value="vg"><i class="vg flag"></i>British Virgin Islands</div>
  <div class="item" data-value="bn"><i class="bn flag"></i>Brunei</div>
  <div class="item" data-value="bg"><i class="bg flag"></i>Bulgaria</div>
  <div class="item" data-value="bf"><i class="bf flag"></i>Burkina Faso</div>
  <div class="item" data-value="mm"><i class="mm flag"></i>Burma</div>
  <div class="item" data-value="bi"><i class="bi flag"></i>Burundi</div>
  <div class="item" data-value="tc"><i class="tc flag"></i>Caicos Islands</div>
  <div class="item" data-value="kh"><i class="kh flag"></i>Cambodia</div>
  <div class="item" data-value="cm"><i class="cm flag"></i>Cameroon</div>
  <div class="item" data-value="ca"><i class="ca flag"></i>Canada</div>
  <div class="item" data-value="cv"><i class="cv flag"></i>Cape Verde</div>
  <div class="item" data-value="ky"><i class="ky flag"></i>Cayman Islands</div>
  <div class="item" data-value="cf"><i class="cf flag"></i>Central African Republic</div>
  <div class="item" data-value="td"><i class="td flag"></i>Chad</div>
  <div class="item" data-value="cl"><i class="cl flag"></i>Chile</div>
  <div class="item" data-value="cn"><i class="cn flag"></i>China</div>
  <div class="item" data-value="cx"><i class="cx flag"></i>Christmas Island</div>
  <div class="item" data-value="cc"><i class="cc flag"></i>Cocos Islands</div>
  <div class="item" data-value="co"><i class="co flag"></i>Colombia</div>
  <div class="item" data-value="km"><i class="km flag"></i>Comoros</div>
  <div class="item" data-value="cg"><i class="cg flag"></i>Congo Brazzaville</div>
  <div class="item" data-value="cd"><i class="cd flag"></i>Congo</div>
  <div class="item" data-value="ck"><i class="ck flag"></i>Cook Islands</div>
  <div class="item" data-value="cr"><i class="cr flag"></i>Costa Rica</div>
  <div class="item" data-value="ci"><i class="ci flag"></i>Cote Divoire</div>
  <div class="item" data-value="hr"><i class="hr flag"></i>Croatia</div>
  <div class="item" data-value="cu"><i class="cu flag"></i>Cuba</div>
  <div class="item" data-value="cy"><i class="cy flag"></i>Cyprus</div>
  <div class="item" data-value="cz"><i class="cz flag"></i>Czech Republic</div>
  <div class="item" data-value="dk"><i class="dk flag"></i>Denmark</div>
  <div class="item" data-value="dj"><i class="dj flag"></i>Djibouti</div>
  <div class="item" data-value="dm"><i class="dm flag"></i>Dominica</div>
  <div class="item" data-value="do"><i class="do flag"></i>Dominican Republic</div>
  <div class="item" data-value="ec"><i class="ec flag"></i>Ecuador</div>
  <div class="item" data-value="eg"><i class="eg flag"></i>Egypt</div>
  <div class="item" data-value="sv"><i class="sv flag"></i>El Salvador</div>
  <div class="item" data-value="gb"><i class="gb flag"></i>England</div>
  <div class="item" data-value="gq"><i class="gq flag"></i>Equatorial Guinea</div>
  <div class="item" data-value="er"><i class="er flag"></i>Eritrea</div>
  <div class="item" data-value="ee"><i class="ee flag"></i>Estonia</div>
  <div class="item" data-value="et"><i class="et flag"></i>Ethiopia</div>
  <div class="item" data-value="eu"><i class="eu flag"></i>European Union</div>
  <div class="item" data-value="fk"><i class="fk flag"></i>Falkland Islands</div>
  <div class="item" data-value="fo"><i class="fo flag"></i>Faroe Islands</div>
  <div class="item" data-value="fj"><i class="fj flag"></i>Fiji</div>
  <div class="item" data-value="fi"><i class="fi flag"></i>Finland</div>
  <div class="item" data-value="fr"><i class="fr flag"></i>France</div>
  <div class="item" data-value="gf"><i class="gf flag"></i>French Guiana</div>
  <div class="item" data-value="pf"><i class="pf flag"></i>French Polynesia</div>
  <div class="item" data-value="tf"><i class="tf flag"></i>French Territories</div>
  <div class="item" data-value="ga"><i class="ga flag"></i>Gabon</div>
  <div class="item" data-value="gm"><i class="gm flag"></i>Gambia</div>
  <div class="item" data-value="ge"><i class="ge flag"></i>Georgia</div>
  <div class="item" data-value="de"><i class="de flag"></i>Germany</div>
  <div class="item" data-value="gh"><i class="gh flag"></i>Ghana</div>
  <div class="item" data-value="gi"><i class="gi flag"></i>Gibraltar</div>
  <div class="item" data-value="gr"><i class="gr flag"></i>Greece</div>
  <div class="item" data-value="gl"><i class="gl flag"></i>Greenland</div>
  <div class="item" data-value="gd"><i class="gd flag"></i>Grenada</div>
  <div class="item" data-value="gp"><i class="gp flag"></i>Guadeloupe</div>
  <div class="item" data-value="gu"><i class="gu flag"></i>Guam</div>
  <div class="item" data-value="gt"><i class="gt flag"></i>Guatemala</div>
  <div class="item" data-value="gw"><i class="gw flag"></i>Guinea-Bissau</div>
  <div class="item" data-value="gn"><i class="gn flag"></i>Guinea</div>
  <div class="item" data-value="gy"><i class="gy flag"></i>Guyana</div>
  <div class="item" data-value="ht"><i class="ht flag"></i>Haiti</div>
  <div class="item" data-value="hm"><i class="hm flag"></i>Heard Island</div>
  <div class="item" data-value="hn"><i class="hn flag"></i>Honduras</div>
  <div class="item" data-value="hk"><i class="hk flag"></i>Hong Kong</div>
  <div class="item" data-value="hu"><i class="hu flag"></i>Hungary</div>
  <div class="item" data-value="is"><i class="is flag"></i>Iceland</div>
  <div class="item" data-value="in"><i class="in flag"></i>India</div>
  <div class="item" data-value="io"><i class="io flag"></i>Indian Ocean Territory</div>
  <div class="item" data-value="id"><i class="id flag"></i>Indonesia</div>
  <div class="item" data-value="ir"><i class="ir flag"></i>Iran</div>
  <div class="item" data-value="iq"><i class="iq flag"></i>Iraq</div>
  <div class="item" data-value="ie"><i class="ie flag"></i>Ireland</div>
  <div class="item" data-value="il"><i class="il flag"></i>Israel</div>
  <div class="item" data-value="it"><i class="it flag"></i>Italy</div>
  <div class="item" data-value="jm"><i class="jm flag"></i>Jamaica</div>
  <div class="item" data-value="jp"><i class="jp flag"></i>Japan</div>
  <div class="item" data-value="jo"><i class="jo flag"></i>Jordan</div>
  <div class="item" data-value="kz"><i class="kz flag"></i>Kazakhstan</div>
  <div class="item" data-value="ke"><i class="ke flag"></i>Kenya</div>
  <div class="item" data-value="ki"><i class="ki flag"></i>Kiribati</div>
  <div class="item" data-value="kw"><i class="kw flag"></i>Kuwait</div>
  <div class="item" data-value="kg"><i class="kg flag"></i>Kyrgyzstan</div>
  <div class="item" data-value="la"><i class="la flag"></i>Laos</div>
  <div class="item" data-value="lv"><i class="lv flag"></i>Latvia</div>
  <div class="item" data-value="lb"><i class="lb flag"></i>Lebanon</div>
  <div class="item" data-value="ls"><i class="ls flag"></i>Lesotho</div>
  <div class="item" data-value="lr"><i class="lr flag"></i>Liberia</div>
  <div class="item" data-value="ly"><i class="ly flag"></i>Libya</div>
  <div class="item" data-value="li"><i class="li flag"></i>Liechtenstein</div>
  <div class="item" data-value="lt"><i class="lt flag"></i>Lithuania</div>
  <div class="item" data-value="lu"><i class="lu flag"></i>Luxembourg</div>
  <div class="item" data-value="mo"><i class="mo flag"></i>Macau</div>
  <div class="item" data-value="mk"><i class="mk flag"></i>Macedonia</div>
  <div class="item" data-value="mg"><i class="mg flag"></i>Madagascar</div>
  <div class="item" data-value="mw"><i class="mw flag"></i>Malawi</div>
  <div class="item" data-value="my"><i class="my flag"></i>Malaysia</div>
  <div class="item" data-value="mv"><i class="mv flag"></i>Maldives</div>
  <div class="item" data-value="ml"><i class="ml flag"></i>Mali</div>
  <div class="item" data-value="mt"><i class="mt flag"></i>Malta</div>
  <div class="item" data-value="mh"><i class="mh flag"></i>Marshall Islands</div>
  <div class="item" data-value="mq"><i class="mq flag"></i>Martinique</div>
  <div class="item" data-value="mr"><i class="mr flag"></i>Mauritania</div>
  <div class="item" data-value="mu"><i class="mu flag"></i>Mauritius</div>
  <div class="item" data-value="yt"><i class="yt flag"></i>Mayotte</div>
  <div class="item" data-value="mx"><i class="mx flag"></i>Mexico</div>
  <div class="item" data-value="fm"><i class="fm flag"></i>Micronesia</div>
  <div class="item" data-value="md"><i class="md flag"></i>Moldova</div>
  <div class="item" data-value="mc"><i class="mc flag"></i>Monaco</div>
  <div class="item" data-value="mn"><i class="mn flag"></i>Mongolia</div>
  <div class="item" data-value="me"><i class="me flag"></i>Montenegro</div>
  <div class="item" data-value="ms"><i class="ms flag"></i>Montserrat</div>
  <div class="item" data-value="ma"><i class="ma flag"></i>Morocco</div>
  <div class="item" data-value="mz"><i class="mz flag"></i>Mozambique</div>
  <div class="item" data-value="na"><i class="na flag"></i>Namibia</div>
  <div class="item" data-value="nr"><i class="nr flag"></i>Nauru</div>
  <div class="item" data-value="np"><i class="np flag"></i>Nepal</div>
  <div class="item" data-value="an"><i class="an flag"></i>Netherlands Antilles</div>
  <div class="item" data-value="nl"><i class="nl flag"></i>Netherlands</div>
  <div class="item" data-value="nc"><i class="nc flag"></i>New Caledonia</div>
  <div class="item" data-value="pg"><i class="pg flag"></i>New Guinea</div>
  <div class="item" data-value="nz"><i class="nz flag"></i>New Zealand</div>
  <div class="item" data-value="ni"><i class="ni flag"></i>Nicaragua</div>
  <div class="item" data-value="ne"><i class="ne flag"></i>Niger</div>
  <div class="item" data-value="ng"><i class="ng flag"></i>Nigeria</div>
  <div class="item" data-value="nu"><i class="nu flag"></i>Niue</div>
  <div class="item" data-value="nf"><i class="nf flag"></i>Norfolk Island</div>
  <div class="item" data-value="kp"><i class="kp flag"></i>North Korea</div>
  <div class="item" data-value="mp"><i class="mp flag"></i>Northern Mariana Islands</div>
  <div class="item" data-value="no"><i class="no flag"></i>Norway</div>
  <div class="item" data-value="om"><i class="om flag"></i>Oman</div>
  <div class="item" data-value="pk"><i class="pk flag"></i>Pakistan</div>
  <div class="item" data-value="pw"><i class="pw flag"></i>Palau</div>
  <div class="item" data-value="ps"><i class="ps flag"></i>Palestine</div>
  <div class="item" data-value="pa"><i class="pa flag"></i>Panama</div>
  <div class="item" data-value="py"><i class="py flag"></i>Paraguay</div>
  <div class="item" data-value="pe"><i class="pe flag"></i>Peru</div>
  <div class="item" data-value="ph"><i class="ph flag"></i>Philippines</div>
  <div class="item" data-value="pn"><i class="pn flag"></i>Pitcairn Islands</div>
  <div class="item" data-value="pl"><i class="pl flag"></i>Poland</div>
  <div class="item" data-value="pt"><i class="pt flag"></i>Portugal</div>
  <div class="item" data-value="pr"><i class="pr flag"></i>Puerto Rico</div>
  <div class="item" data-value="qa"><i class="qa flag"></i>Qatar</div>
  <div class="item" data-value="re"><i class="re flag"></i>Reunion</div>
  <div class="item" data-value="ro"><i class="ro flag"></i>Romania</div>
  <div class="item" data-value="ru"><i class="ru flag"></i>Russia</div>
  <div class="item" data-value="rw"><i class="rw flag"></i>Rwanda</div>
  <div class="item" data-value="sh"><i class="sh flag"></i>Saint Helena</div>
  <div class="item" data-value="kn"><i class="kn flag"></i>Saint Kitts and Nevis</div>
  <div class="item" data-value="lc"><i class="lc flag"></i>Saint Lucia</div>
  <div class="item" data-value="pm"><i class="pm flag"></i>Saint Pierre</div>
  <div class="item" data-value="vc"><i class="vc flag"></i>Saint Vincent</div>
  <div class="item" data-value="ws"><i class="ws flag"></i>Samoa</div>
  <div class="item" data-value="sm"><i class="sm flag"></i>San Marino</div>
  <div class="item" data-value="gs"><i class="gs flag"></i>Sandwich Islands</div>
  <div class="item" data-value="st"><i class="st flag"></i>Sao Tome</div>
  <div class="item" data-value="sa"><i class="sa flag"></i>Saudi Arabia</div>
  <div class="item" data-value="sn"><i class="sn flag"></i>Senegal</div>
  <div class="item" data-value="cs"><i class="cs flag"></i>Serbia</div>
  <div class="item" data-value="rs"><i class="rs flag"></i>Serbia</div>
  <div class="item" data-value="sc"><i class="sc flag"></i>Seychelles</div>
  <div class="item" data-value="sl"><i class="sl flag"></i>Sierra Leone</div>
  <div class="item" data-value="sg"><i class="sg flag"></i>Singapore</div>
  <div class="item" data-value="sk"><i class="sk flag"></i>Slovakia</div>
  <div class="item" data-value="si"><i class="si flag"></i>Slovenia</div>
  <div class="item" data-value="sb"><i class="sb flag"></i>Solomon Islands</div>
  <div class="item" data-value="so"><i class="so flag"></i>Somalia</div>
  <div class="item" data-value="za"><i class="za flag"></i>South Africa</div>
  <div class="item" data-value="kr"><i class="kr flag"></i>South Korea</div>
  <div class="item" data-value="es"><i class="es flag"></i>Spain</div>
  <div class="item" data-value="lk"><i class="lk flag"></i>Sri Lanka</div>
  <div class="item" data-value="sd"><i class="sd flag"></i>Sudan</div>
  <div class="item" data-value="sr"><i class="sr flag"></i>Suriname</div>
  <div class="item" data-value="sj"><i class="sj flag"></i>Svalbard</div>
  <div class="item" data-value="sz"><i class="sz flag"></i>Swaziland</div>
  <div class="item" data-value="se"><i class="se flag"></i>Sweden</div>
  <div class="item" data-value="ch"><i class="ch flag"></i>Switzerland</div>
  <div class="item" data-value="sy"><i class="sy flag"></i>Syria</div>
  <div class="item" data-value="tw"><i class="tw flag"></i>Taiwan</div>
  <div class="item" data-value="tj"><i class="tj flag"></i>Tajikistan</div>
  <div class="item" data-value="tz"><i class="tz flag"></i>Tanzania</div>
  <div class="item" data-value="th"><i class="th flag"></i>Thailand</div>
  <div class="item" data-value="tl"><i class="tl flag"></i>Timorleste</div>
  <div class="item" data-value="tg"><i class="tg flag"></i>Togo</div>
  <div class="item" data-value="tk"><i class="tk flag"></i>Tokelau</div>
  <div class="item" data-value="to"><i class="to flag"></i>Tonga</div>
  <div class="item" data-value="tt"><i class="tt flag"></i>Trinidad</div>
  <div class="item" data-value="tn"><i class="tn flag"></i>Tunisia</div>
  <div class="item" data-value="tr"><i class="tr flag"></i>Turkey</div>
  <div class="item" data-value="tm"><i class="tm flag"></i>Turkmenistan</div>
  <div class="item" data-value="tv"><i class="tv flag"></i>Tuvalu</div>
  <div class="item" data-value="ug"><i class="ug flag"></i>Uganda</div>
  <div class="item" data-value="ua"><i class="ua flag"></i>Ukraine</div>
  <div class="item" data-value="ae"><i class="ae flag"></i>United Arab Emirates</div>
  <div class="item" data-value="us"><i class="us flag"></i>United States</div>
  <div class="item" data-value="uy"><i class="uy flag"></i>Uruguay</div>
  <div class="item" data-value="um"><i class="um flag"></i>Us Minor Islands</div>
  <div class="item" data-value="vi"><i class="vi flag"></i>Us Virgin Islands</div>
  <div class="item" data-value="uz"><i class="uz flag"></i>Uzbekistan</div>
  <div class="item" data-value="vu"><i class="vu flag"></i>Vanuatu</div>
  <div class="item" data-value="va"><i class="va flag"></i>Vatican City</div>
  <div class="item" data-value="ve"><i class="ve flag"></i>Venezuela</div>
  <div class="item" data-value="vn"><i class="vn flag"></i>Vietnam</div>
  <div class="item" data-value="wf"><i class="wf flag"></i>Wallis and Futuna</div>
  <div class="item" data-value="eh"><i class="eh flag"></i>Western Sahara</div>
  <div class="item" data-value="ye"><i class="ye flag"></i>Yemen</div>
  <div class="item" data-value="zm"><i class="zm flag"></i>Zambia</div>
  <div class="item" data-value="zw"><i class="zw flag"></i>Zimbabwe</div>
</div>
 </div>
				</div>






				<div class="two fields">
					<div class="field">
						<label>General Telephone</label> <input type="text"
							name="GeneralTelephone" placeholder="" id="GeneralTelephone">
					</div>
					<div class="field">
						<label>Email</label> <input type="text" name="Email"
							placeholder="" id="Email">
					</div>
				</div>

				<div class="two fields">
					<div class="field">
						<label>Date of Accreditation</label> <input type="date"
							name="Date_Of_Accreditation" id="Date_Of_Accreditation">
					</div>
					<div class="field">
						<label>Until</label> <input type="date" name="Until" id="Until">
					</div>
				</div>
				<div class="two fields">
					<div class="field">
						<label>Current Status</label>
						<div class="ui selection dropdown CurrentStatus">
							<input type="hidden" name="CurrentStatus" id="CurrentStatus">
							<i class="dropdown icon"></i>
							<div class="default text" id="trigcurrent"></div>
							<div class="menu">
								<div class="item" data-value="1">Activate</div>
								<div class="item" data-value="0">Dactivate</div>
							</div>
						</div>
					</div>


					<div class="field">
						<label>Contract Reminder</label>


						<div class="ui checkbox reminder"
							style="background-color: darkviolet; padding: 5px; padding-right: 15px; margin-top: 5px;">
							<input type="checkbox" name="Reminder" id="Reminder"> <label
								style="color: white;"> <b>Before Month</b></label>
						</div>
					</div>
				</div>

				<div class="field">

					<label>Partner Description</label>
					<textarea name="PartnerDescription" id="PartnerDescription"></textarea>


				</div>

				<div class="field">

					<label>Special Notes</label>
					<textarea rows="2" name="SpecialNotes" id="SpecialNotes"></textarea>




				</div>


				<div class="field">

					<h3 style="text-decoration: underline;">Contact Details</h3>





				</div>
				
								<div class="two fields">
					<div class="field">
						<div class="ui fluid toggle checkbox displayuser">
  <input type="checkbox" name="public" id="displaycheck">
  <label>Display to Users</label>
</div>
						
					</div>
					<div class="field">
						
						<div class="ui toggle checkbox pcontacts">
  <input type="checkbox" name="public" id="contactcheck">
  <label>Primary Contacts</label>
</div>
						
					</div>
				</div>

				<div class="two fields">
					<div class="field">
						<label>Name</label> <input type="text" name="ContactName"
							id="ContactName">
					</div>
					<div class="field">
						<label>Designation</label> <input type="text"
							name="ContactDesignation" id="ContactDesignation">
					</div>
				</div>

				<div class="two fields">
					<div class="field">
						<label>Division</label> <input type="text" name="Division"
							id="Division">
					</div>
					<div class="field">
						
					</div>
				</div>

				<div class="two fields">
					<div class="field">
						<label>Email</label> <input type="text" name="ContactEmail"
							id="ContactEmail">
					</div>
					<div class="field">
						
						<label>Telephone</label> <input type="text" name="Telephone"
							id="Telephone">
						
					</div>
				</div>
				




				<div class="field" id="btntrigger">
				
				

					  <div class="ui primary button save" type="submit">    <!-- id="save" -->
						Save</div> 
					<div class="ui button">Discard</div> 

				</div>

			</form>



		</div>


	</div>


	<!-- End of models -->




	<script>
		
	
	var tempid;
	var modifyid;
	var action;
	var temppreference;
	var du="No";// display to user
	var co="No"; //contacts only

		function readURL(input) {
			if (input.files && input.files[0]) {
				var reader = new FileReader();

				reader.onload = function(e) {
					$('#blah').attr('src', e.target.result);
				};

				reader.readAsDataURL(input.files[0]);
			}
		}


		
		
		$(document).ready(function() {
			
		   $('#tblpartnerdetails').DataTable({
				
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
						title : "Awarding Partner Name"
					},
					{
						title : "Country"
					},
					
					{
						title : "Email"
					},
					
					{
						title : "Action"
					}
		
					
					]
		    

		    
			});
			
			$('#tblpartnerdetails_filter').hide();
			
	 /* 		var table = $('#tblpartnerdetails').DataTable();
			 
			$('#tblpartnerdetails tbody').on( 'click', 'tr', function () {
			    console.log( table.row( this ).data()[1] );
			} );  */
			
			
			/*  var table = $('#tblpartnerdetails').DataTable();
			 
			 $('#tblpartnerdetails tbody').on( 'click', 'td', function () {
			    alert( table.cell(this).data() ); 
			    viewpartner
			    
			} );  
			
			 */

			//***********************************************************
			console.log('${AcademicPartners}');
			 var AcademicPartners = JSON.parse('${AcademicPartners}');
			
			$.each(AcademicPartners, function(key, value) {

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
multiaction += "		            <div class=\"ui teal buttons\">";
multiaction += "                <div class=\"ui button modifypartner\">Modify <\/div>";
multiaction += "                <div class=\"ui floating dropdown icon button\">";
multiaction += "                    <i class=\"dropdown icon\"><\/i>";
multiaction += "                    <div class=\"menu\">";
multiaction += "";
multiaction += "                        <div class=\"item viewpartner\"><i class=\"delete icon\"><\/i> View<\/div>";
multiaction += "						 <div class=\"item Approvepartner\"><i class=\"delete icon\"><\/i> Approve<\/div>";
multiaction += "						  <div class=\"item Declinepartner\"><i class=\"delete icon\"><\/i> Decline<\/div>";
multiaction += "";
multiaction += "                    <\/div>";
multiaction += "                <\/div>";
multiaction += "            <\/div>";
multiaction += "					";

				
			$('#tblpartnerdetails').DataTable().row.add([checkbox,key,value.AcademicPartnerName,value.Country,value.Email,multiaction]).draw();
			
				


			});
	
	
			 var ContractReminder="";
			 $( ".ui.checkbox.reminder" ).change(function() {
				 
				 
				    checked = $('#Reminder').is(':checked');
				    //console.log(checked);
				    if (checked === true) {
				    	ContractReminder = "Yes";
				        //console.log(Status);
				    }
				    else {
				    	ContractReminder = "No";
				    	// console.log(Status);
				    }
				 
				 
				});
			 
			 
			
			 $( ".ui.toggle.displayuser" ).change(function() {
				 
				 
				    checked = $('#displaycheck').is(':checked');
				    //console.log(checked);
				    if (checked === true) {
				        du = "Yes";
				       // console.log(du);
				    }
				    else {
				    	du = "No";
				    	//console.log(du);
				    }
				 
				 
				});
			 
			 
			 $( ".ui.toggle.pcontacts" ).change(function() {
				 
				 
				    checked = $('#contactcheck').is(':checked');
				    //console.log(checked);
				    if (checked === true) {
				        co = "Yes";
				        //console.log(co);
				    }
				    else {
				    	co = "No";
				    	//console.log(co);
				    }
				 
				 
				});
			
			
			
			$(".modifypartner").click(function(){
				
				 $('.ui.modal.addpartner').modal('show');
			    
			       var table = $('#tblpartnerdetails').DataTable();
					 
					$('#tblpartnerdetails tbody').on( 'click', 'tr', function () {
					     modifyid= ( table.row( this ).data()[1] );
					    //tempid =idcapture;
					    
					   
					   action = "Update";
					   
					   
					   $('#AcademicPartnerName').attr("disabled", false); 
					   $('#FirstStreet').attr("disabled", false); 
					   $('#SecondStreet').attr("disabled", false); 
					   $('#Town').attr("disabled", false); 
					   $('#PostalCode').attr("disabled", false); 
					   $('#GeneralTelephone').attr("disabled", false); 
					   $('#Email').attr("disabled", true); 
					   $('#Date_Of_Accreditation').attr("disabled", false); 
					   $('#Until').attr("disabled", false); 
					   $('.CurrentStatus').removeClass('disabled');
					   $('.country').removeClass('disabled');
					   $('.reminder').removeClass('disabled');
					   
					   $('#PartnerDescription').attr("disabled", false); 
					   $('#SpecialNotes').attr("disabled", false); 
					   $('#ContactName').attr("disabled", false); 
					   $('#ContactDesignation').attr("disabled", false); 
					   $('#Division').attr("disabled", false); 
					   $('#ContactEmail').attr("disabled", false); 
					   $("#Telephone").attr("disabled", false); 
					   
					   var AcademicPartners = JSON.parse('${AcademicPartners}');
					   
					   var n= AcademicPartners[""+modifyid+""].AcademicPartnerName;
					   var cd= AcademicPartners[""+modifyid+""].ContactDesignation;
					   var ce= AcademicPartners[""+modifyid+""].ContactEmail;
					   var cn= AcademicPartners[""+modifyid+""].ContactName;
					   var co= AcademicPartners[""+modifyid+""].Country;
					   var cs= AcademicPartners[""+modifyid+""].CurrentStatus;
					   var da= AcademicPartners[""+modifyid+""].Date_Of_Accreditation;
					   var div= AcademicPartners[""+modifyid+""].Division;
					   var em= AcademicPartners[""+modifyid+""].Email;
					   var fs= AcademicPartners[""+modifyid+""].FirstStreet;
					   var gt= AcademicPartners[""+modifyid+""].GeneralTelephone;
					   var pd= AcademicPartners[""+modifyid+""].PartnerDescription;
					   var pc= AcademicPartners[""+modifyid+""].PostalCode;
					   var ss= AcademicPartners[""+modifyid+""].SecondStreet;
					   var sn= AcademicPartners[""+modifyid+""].SpecialNotes;
					   var tn= AcademicPartners[""+modifyid+""].Town;
					   var unti= AcademicPartners[""+modifyid+""].Until;
					  
					   $("#AcademicPartnerName").val(n);
					   $("#FirstStreet").val(fs);
					   $("#SecondStreet").val(ss);
					   $("#Town").val(tn);
					   $("#PostalCode").val(pc);
					   $("#GeneralTelephone").val(gt);
					   $("#Email").val(em);
					   $("#Date_Of_Accreditation").val(da);
					   $("#Until").val(unti);
					   $("#trigcurrent").text(cs);
					   $("#PartnerDescription").val(pd);
					   $("#SpecialNotes").val(sn);
					   $("#ContactName").val(cn);
					   $("#ContactDesignation").val(cd);
					   $("#Division").val(div);
					   $("#ContactEmail").val(ce);
					   $("#trigcountry").text(co);
					   
		    
			    
			});
					
			});
			
			
			
			$(".addpartnerbtnnn").click(function(){
				$('.ui.modal.addpartner').modal('show');
				  
				  action = "add";
			});
			
			 var strVar="";
			$(".viewpartner").click(function () {
		        $('.ui.modal.addpartner').modal('show');
		        
		        
		         var table = $('#tblpartnerdetails').DataTable();
				 
				$('#tblpartnerdetails tbody').on( 'click', 'tr', function () {
				    var idcapture= ( table.row( this ).data()[1] );
				    //tempid =idcapture;
				  // console.log(idcapture);
				   
				   var AcademicPartners = JSON.parse('${AcademicPartners}');
				   
				   var n= AcademicPartners[""+idcapture+""].AcademicPartnerName;
				   var cd= AcademicPartners[""+idcapture+""].ContactDesignation;
				   var ce= AcademicPartners[""+idcapture+""].ContactEmail;
				   var cn= AcademicPartners[""+idcapture+""].ContactName;
				   var co= AcademicPartners[""+idcapture+""].Country;
				   var cs= AcademicPartners[""+idcapture+""].CurrentStatus;
				   var da= AcademicPartners[""+idcapture+""].Date_Of_Accreditation;
				   var div= AcademicPartners[""+idcapture+""].Division;
				   var em= AcademicPartners[""+idcapture+""].Email;
				   var fs= AcademicPartners[""+idcapture+""].FirstStreet;
				   var gt= AcademicPartners[""+idcapture+""].GeneralTelephone;
				   var pd= AcademicPartners[""+idcapture+""].PartnerDescription;
				   var pc= AcademicPartners[""+idcapture+""].PostalCode;
				   var ss= AcademicPartners[""+idcapture+""].SecondStreet;
				   var sn= AcademicPartners[""+idcapture+""].SpecialNotes;
				   var tn= AcademicPartners[""+idcapture+""].Town;
				   var unti= AcademicPartners[""+idcapture+""].Until;
				   var teldetail = AcademicPartners[""+idcapture+""].Telephone;
				 
				  

				   $("#AcademicPartnerName").val(n);
				   $("#FirstStreet").val(fs);
				   $("#SecondStreet").val(ss);
				   $("#Town").val(tn);
				   $("#PostalCode").val(pc);
				   $("#GeneralTelephone").val(gt);
				   $("#Email").val(em);
				   $("#Date_Of_Accreditation").val(da);
				   $("#Until").val(unti);
				   $("#trigcurrent").text(cs);
				   $("#PartnerDescription").val(pd);
				   $("#SpecialNotes").val(sn);
				   $("#ContactName").val(cn);
				   $("#ContactDesignation").val(cd);
				   $("#Division").val(div);
				   $("#ContactEmail").val(ce);
				   $("#trigcountry").text(co);
				   $("#Telephone").val(teldetail);
				  
				   
				  
				   
				   $('#AcademicPartnerName').attr("disabled", true); 
				   $('#FirstStreet').attr("disabled", true); 
				   $('#SecondStreet').attr("disabled", true); 
				   $('#Town').attr("disabled", true); 
				   $('#PostalCode').attr("disabled", true); 
				   $('#GeneralTelephone').attr("disabled", true); 
				   $('#Email').attr("disabled", true); 
				   $('#Date_Of_Accreditation').attr("disabled", true); 
				   $('#Until').attr("disabled", true); 
				   $('.CurrentStatus').addClass('disabled');
				   $('.country').addClass('disabled');
				   $('.reminder').addClass('disabled');
				   
				   $('#PartnerDescription').attr("disabled", true); 
				   $('#SpecialNotes').attr("disabled", true); 
				   $('#ContactName').attr("disabled", true); 
				   $('#ContactDesignation').attr("disabled", true); 
				   $('#Division').attr("disabled", true); 
				   $('#ContactEmail').attr("disabled", true); 
				   $("#Telephone").attr("disabled", true); 
				  
				   
				    
				} );  
					
				
		    });
			
			
			$('.save')
			.click(
					function() {
						
						
						
						
						var AcademicPartnerName = $("#AcademicPartnerName")
								.val();
						var FirstStreet = $("#FirstStreet").val();
						var SecondStreet = $("#SecondStreet").val();
						var Town = $("#Town").val();
						var PostalCode = $("#PostalCode").val();
						
						 var Country = $('.selection.dropdown.country').dropdown('get text');
						   	
						var GeneralTelephone = $("#GeneralTelephone").val();
						var Email = $("#Email").val();
						var Date_Of_Accreditation = $(
								"#Date_Of_Accreditation").val();
						var Until = $("#Until").val();
						
						 var CurrentStatus = $('.CurrentStatus').dropdown('get text');
																		
						var PartnerDescription = $("#PartnerDescription")
								.val();
						var SpecialNotes = $("#SpecialNotes").val();
						var ContactName = $("#ContactName").val();
						var ContactDesignation = $("#ContactDesignation")
								.val();
						var Division = $("#Division").val();
						var ContactEmail = $("#ContactEmail").val();  
						var Telephonedetails = $("#Telephone").val();
						var Preference ;

						

						var data = {
							"AcademicPartnerName" : AcademicPartnerName,
							"FirstStreet" : FirstStreet,
							"SecondStreet" : SecondStreet,
							"Town" : Town,
							"PostalCode" : PostalCode,
							"Country" : Country,
							"GeneralTelephone" : GeneralTelephone,
							"Email" : Email,
							"Date_Of_Accreditation" : Date_Of_Accreditation,
							"Until" : Until,
							"CurrentStatus" : CurrentStatus,
							"Reminder" : ContractReminder,	
							"PartnerDescription" : PartnerDescription,
							"SpecialNotes" : SpecialNotes,
							"ContactName" : ContactName,
							"ContactDesignation" : ContactDesignation,
							"Division" : Division,
							"ContactEmail" : ContactEmail,
							"Telephone":Telephonedetails,
						    "Preference" : {
						    	
						    	"DisplayToUser":du,
						    	"PrimaryContacts":co
						    	
						    }

						};
						data = JSON.stringify(data);
						
						console.log(data);

	 					$
								.ajax({
									type : "POST",
									accept : "text/html",
									//contentType: "application/json; charset=utf-8",
									dataType : "html",
									url : "${pageContext.request.contextPath}/ap/academic_partner/"+action+"",
									data : ({
										"data" : data ,"key":modifyid

									}),
									  success: function(){
										  location.reload(true);
									}
									
								});
						
						
						location.reload();

					});
		
		
			$("#searchtrigger").click(function(){
				   
				var option= $('.searchoption').dropdown('get text');
				
				if(option=="Partner Name"){
					
					option= "AcademicPartnerName";
				}
				
				var key =$("#searchkey").val().trim();
				 var AcademicPartnersSearch = JSON.parse('${AcademicPartners}');
				 
				 $.each(AcademicPartnersSearch, function(key5, value5){
					 
					 if(value5[""+option+""]==key){
						 
						 var newkey=key5;
						 var ap=value5.AcademicPartnerName;
						 var coun=value5.Country;
						 var mail=value5.Email;
						 
						 var tbl = $('#tblpartnerdetails').DataTable();
						 
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
							multiaction += "		            <div class=\"ui teal buttons\">";
							multiaction += "                <div class=\"ui button modifypartner\">Modify <\/div>";
							multiaction += "                <div class=\"ui floating dropdown icon button\">";
							multiaction += "                    <i class=\"dropdown icon\"><\/i>";
							multiaction += "                    <div class=\"menu\">";
							multiaction += "";
							multiaction += "                        <div class=\"item viewpartner\"><i class=\"delete icon\"><\/i> View<\/div>";
							multiaction += "						 <div class=\"item Approvepartner\"><i class=\"delete icon\"><\/i> Approve<\/div>";
							multiaction += "						  <div class=\"item Declinepartner\"><i class=\"delete icon\"><\/i> Decline<\/div>";
							multiaction += "";
							multiaction += "                    <\/div>";
							multiaction += "                <\/div>";
							multiaction += "            <\/div>";
							multiaction += "					";
						 
						 
						 $('#tblpartnerdetails').DataTable().row.add([checkbox,newkey,ap,coun,mail,multiaction]).draw();
						 
					 }
					 
					 $( "#searchkey" ).keyup(function() {
						 
						 var keycheck =$("#searchkey").val().trim().length;
						 
                         var tbl2 = $('#tblpartnerdetails').DataTable();
						 
                         tbl2.clear().draw();
                         
						  if(keycheck==0){
							  
								 var AcademicPartnersEmpty = JSON.parse('${AcademicPartners}');
									
									$.each(AcademicPartnersEmpty, function(key8, value8) {

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
						multiaction += "		            <div class=\"ui teal buttons\">";
						multiaction += "                <div class=\"ui button modifypartner\">Modify <\/div>";
						multiaction += "                <div class=\"ui floating dropdown icon button\">";
						multiaction += "                    <i class=\"dropdown icon\"><\/i>";
						multiaction += "                    <div class=\"menu\">";
						multiaction += "";
						multiaction += "                        <div class=\"item viewpartner\"><i class=\"delete icon\"><\/i> View<\/div>";
						multiaction += "						 <div class=\"item Approvepartner\"><i class=\"delete icon\"><\/i> Approve<\/div>";
						multiaction += "						  <div class=\"item Declinepartner\"><i class=\"delete icon\"><\/i> Decline<\/div>";
						multiaction += "";
						multiaction += "                    <\/div>";
						multiaction += "                <\/div>";
						multiaction += "            <\/div>";
						multiaction += "					";

										
									$('#tblpartnerdetails').DataTable().row.add([checkbox,key8,value8.AcademicPartnerName,value8.Country,value8.Email,multiaction]).draw();
									
										


									});
							  
							  
							  
							  
							  
							  
							  
						  }
						});
					 
					 
					 
				 });
				 
                
            });
			
			
			
			
			
			
			$('.dropdown').dropdown({
				// you can use any ui transition
				transition : 'drop'
			});
			
			
			//End of ready function
			
		});
			
	
		


		

		
		
	</script>

</div>




</body>

</html>