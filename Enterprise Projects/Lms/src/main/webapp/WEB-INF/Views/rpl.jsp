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

            <div class="ui primary button addpartnerbtn">
  Add RPL
</div>


        </div>

        <div class="fr_right_buttons">
            <div class="ui action input">
                <input type="text" placeholder="Search " id="searchkey" value="">
                <select class="ui compact selection dropdown searchoption">
   
    <option selected="" >Partner name</option>
    <option>Acronym</option>
     <option >Agreement Name</option>
   
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
        
         <table class="ui single line table" id="tblRPL"></table>



        </div>
    </div>



    <!-- Start of models -->

    <div class="ui modal addrpl">

        <div class="header">Recognized Prior Learning (Register RPL Partner)</div>

        <div class="scrolling content">


            <form class="ui form">

                
                <div class="field" >
                    
                    <input type="file" name="" placeholder="" id="" value="" style="background-color: darkviolet;" >
                    
                </div>
                
                <br/>   <br/> 
                
                 <div class="field">
                    <label for="">RPL Partner name (in Full)</label>
                    <input type="text" name="" placeholder="" id="RplName" value="">
                    
                </div>

                <div class="two fields">
                    <div class="field">
                        <label>Acronym or initial to RPL</label>
                        <input type="text" name="" placeholder="" id="InitialRpl" value="">
                    </div>
                    <div class="field">
                        <label>RPL Code</label>
                        <input type="text" name="" placeholder="" id="RplCode">
                    </div>
                </div>
                
                <label> <b>Global Headquarters</b></label> <br/> <br/>
                 <div class="two fields">
                    <div class="field">
                        
                        <input type="text" name="" placeholder="1st Street" id="FirstStreet" value="">
                    </div>
                    <div class="field">
                       
                        <input type="text" name="" placeholder="2nd Street" id="SecondStreet" value="">
                    </div>
                </div>
                
                 <div class="two fields">
                    <div class="field">
                        
                        <input type="text" name="" placeholder="Town" id="Town" value="">
                    </div>
                    <div class="field">
                        
                        <input type="text" name="" placeholder="Postal Code" id="PostalCode" Value="">
                    </div>
                </div>
                
                <div class="two fields">
                    <div class="field">
                        
                        <input type="text" name="" placeholder="District" id="District" value="">
                    </div>
                    <div class="field">
                        
                        <input type="text" name="" placeholder="Province" id="Province" value="">
                    </div>
                </div>

                <div class="field">
                   
                   <div class="ui fluid search selection dropdown country" >
                   
  <input type="hidden" name="country">
  <i class="dropdown icon"></i>
  <div class="default text"  id="coun0"> Country</div>
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
                        
                        <input type="text" name="" placeholder="Telephone" id="Telephone" value="">
                    </div>
                    <div class="field">
                        
                        <input type="email" name="" placeholder="Email" id="Email" value="">
                    </div>
                </div>
                
                
                 <div class="field">
                        
                        <input type="text" name="" placeholder="Website" id="Website" value="">
                    </div>
                    
                     <label for=""><b>Regional or Local Office Details</b></label> <br/> <br/>
                     <div class="two fields">
                    <div class="field">
                        
                        <input type="text" name="" placeholder="1st Street" id="RfirstStreet" value="">
                    </div>
                    <div class="field">
                       
                        <input type="text" name="" placeholder="2nd Street" id="RsecondSreet" value="">
                    </div>
                </div>
                
                 <div class="two fields">
                    <div class="field">
                        
                        <input type="text" name="" placeholder="Town" id="Rtown" value="">
                    </div>
                    <div class="field">
                        
                        <input type="text" name="" placeholder="Postal Code" id="RpostalCode" value="">
                    </div>
                </div>
                
                <div class="two fields">
                    <div class="field">
                        
                        <input type="text" name="" placeholder="District" id="Rdistrict" value="">
                    </div>
                    <div class="field">
                        
                        <input type="text" name="" placeholder="Province" id="Rprovince" value="">
                    </div>
                </div>
                
                
                 
                
                       <div class="field">
                    
                   <div class="ui fluid search selection dropdown Rcountry">
  <input type="hidden" name="country">
  <i class="dropdown icon"></i>
  <div class="default text" id="coun1">Country</div>
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
                        
                        <input type="text" name="" placeholder="Telephone" id="Rtelephone" value="">
                    </div>
                    <div class="field">
                        
                        <input type="email" name="" placeholder="Email" id="Remail" value="">
                    </div>
                </div>
                
                
                 <div class="field">
                        
                        <input type="text" name="" placeholder="Website" id="Rwebsite" value="">
                    </div>
                   
    <label> <b>Is This Recognition of Prior Learning (RPL) a Formal Agreement ?</b></label>
    <div class="inline fields">
    <div class="field">
     <br/>
      <div class="ui radio checkbox">
        <input type="radio" name="frequency" checked="checked" id="checktest1" value="">
        <label>Yes</label>
      </div>
    </div>
    <div class="field">
     <br/>
      <div class="ui radio checkbox">
        <input type="radio" name="frequency" id="checktest2" value="">
        <label>No</label>
      </div>
    </div>
    
	</div>
               
               
                <label><b>If Yes This Agreement Signed Directly by us (The Institute) and the RPL Partner ?</b></label>
    <div class="inline fields">
    <div class="field">
     <br/>
      <div class="ui radio checkbox">
        <input type="radio" name="frequency" checked="checked" id="checktest3" value="">
        <label>Yes</label>
      </div>
    </div>
    <div class="field">
     <br/>
      <div class="ui radio checkbox">
        <input type="radio" name="frequency" id="checktest4" value="">
        <label>No</label>
      </div>
    </div>
    
	</div>

 
<div class="field">
    <label>If Yes , Please Specify</label>
    <input type="text" name="" placeholder="Agreement Name" id="AgreementName" value="">
  </div>
          
          <div class="field">
    
    <input type="text" name="" placeholder="RPL Agreement Code" id="AgreementCode" value="">
  </div>
          
          
           
          
           
           
             <div class="two fields">
                    <div class="field">
                        <label for="">RPL Validity From</label>
                        <input type="date" name="" placeholder="" id="Rplvalid" value="">
                    </div>
                    <div class="field">
                        <label for="">Expire Date</label>
                        <input type="date" name="" placeholder="" id="Rplexpiry" value="">
                    </div>
                </div> 

  <div class="field"   >
      <br/> <label>If a Reminder Required</label>
      
       
        <div class="ui checkbox Rreminder" style="background-color: darkviolet;padding: 5px;padding-right: 15px;">
  <input type="checkbox" name="example"  value="">
  <label style="color: white;"> <b>Before Month</b></label>
</div>
      </div>
           
           
           <label for=""> <b> Authorized Signatory on Agreement (From Our Institute)</b></label> <br/> <br/>
            <div class="two fields">
                    <div class="field">
                        
                        <input type="text" name="" placeholder="Name" id="Agname" value="">
                    </div>
                    <div class="field">
                        
                        <input type="text" name="" placeholder="Designation" id="Adesignation" value="">
                    </div>
                </div> 
                
                
                 <div class="two fields">
                    <div class="field">
                        
                        <input type="text" name="" placeholder="Email" id="Aemail" value="">
                    </div>
                    <div class="field">
                        
                        <input type="text" name="" placeholder="Telephone" id="Atelephone" value="">
                    </div>
                </div>
                
                 <div class="field">
                        
                        <input type="text" name="" placeholder="Location" id="Alocation" value="">
                    </div> 
                    <br/>
                    
                    <div class="field" >
                        <label for="">Upload Evidence of Agreement</label>
                        <input type="file" name="" placeholder="Upload File" style="background-color: blueviolet;">
                    </div> 
                    
                    <label><b>If Yes, is The Agreement Signed by Third Party ? </b></label>
    <div class="inline fields">
    <div class="field">
     <br/>
      <div class="ui radio checkbox">
        <input type="radio" name="frequency" checked="checked" id="Tcheck1" value="">
        <label>Yes</label>
      </div>
    </div>
    <div class="field">
     <br/>
      <div class="ui radio checkbox">
        <input type="radio" name="frequency" id="Tcheck2" value="">
        <label>No</label>
      </div>
    </div>
    
	</div>
          
          <label for=""> <b>If Yes , Please Specify</b></label> <br/> <br/>
          <div class="field">
                        
                        <input type="text" name="" placeholder="Agreement Name" id="TagreementName" value="">
                    </div>
                    <div class="field">
                        
                        <input type="text" name="" placeholder="RPL Agreement Code" id="Trplcode" value="">
                    </div>
                    <div class="field">
                        
                        <input type="text" name="" placeholder="Who is this Agreement Signed By?" id="Tsignedby" value="">
                    </div>
                    <div class="field">
                        
                        <input type="text" name="" placeholder="Relationship to Us?" id="Trelationship">
                    </div>
           
           
                   <div class="two fields">
                    <div class="field">
                        <label for="">Validity Date From</label>
                        <input type="date" name="" placeholder="" id="Tvaliddate" value="">
                    </div>
                    <div class="field">
                        <label for="">Expire Date</label>
                        <input type="date" name="" placeholder="" id="Texpiry" value="">
                    </div>
                </div> 

  <div class="field"   >
      <br/>  <label>If a Reminder Required</label>
      
       
        <div class="ui checkbox Treminder" style="background-color: darkviolet;padding: 5px;padding-right: 15px;">
  <input type="checkbox" name="example"  value="">
  <label style="color: white;"> <b>Before Month</b></label>
</div>
      </div>
           <div class="field">
    <label>Special Note / Conditions</label>
    <textarea rows="2" id="Tnotes" value=""></textarea>
  </div>
           
           
            <div class="field">
            <label for="">Third Party Details</label>
    
    <input type="text" name="" placeholder="Name of the Organization" id="Torgname" value="">
  </div>
           
           <label for=""><b>Address</b></label> <br/> <br/>
            <div class="two fields">
                    <div class="field">
                        
                        <input type="text" name="" placeholder="1st Street" id="Tfirststreet" value="">
                    </div>
                    <div class="field">
                       
                        <input type="text" name="" placeholder="2nd Street" id="Tsecondstreet" value="">
                    </div>
                </div>
                
                 <div class="two fields">
                    <div class="field">
                        
                        <input type="text" name="" placeholder="Town" id="Ttown" value="">
                    </div>
                    <div class="field">
                        
                        <input type="text" name="" placeholder="Postal Code" id="Tpostalcode" value="">
                    </div>
                </div>
                
                <div class="two fields">
                    <div class="field">
                        
                        <input type="text" name="" placeholder="District" id="Tdistrict" value="">
                    </div>
                    <div class="field">
                        
                        <input type="text" name="" placeholder="Province" id="Tprovince" value="">
                    </div>
                </div>
                
                
                      <div class="field">
                   
                   <div class="ui fluid search selection dropdown Tcountry" >
                    
  <input type="hidden" name="country">
  <i class="dropdown icon"></i>
  <div class="default text" id="coun2">Country </div>
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
                        
                        <input type="text" name="" placeholder="Telephone" id="Ttelephone" value="">
                    </div>
                    <div class="field">
                        
                        <input type="email" name="" placeholder="Email" id="Temail" value="">
                    </div>
                </div>
                
                
                 <div class="field">
                        
                        <input type="text" name="" placeholder="Website" id="Twebsite" value="">
                    </div>
                    
                    
                     <div class="field">
                        
                        <input type="text" name="" placeholder="Key Contact Person Name" id="Tkeycontactname" value="">
                    </div>
                    
                    
                     <div class="two fields">
                    <div class="field">
                        
                        <input type="text" name="" placeholder="Telephone" id="Tkeytel" value="">
                    </div>
                    <div class="field">
                        
                        <input type="email" name="" placeholder="Email" id="Tkeyemail" value="">
                    </div>
                </div>
                
                <br/> 
            
                <div class="field" style="text-align: center;">

                    <div class="ui primary button " id="save">
  Save
</div>
                    <div class="ui button ">
  Discard
</div>

                </div>

            </form>



        </div>


    </div>


    <!-- End of models -->





  

    <script>
       
    var idcapture;
    var modifyid;
    var action;

       // $('.ui.modal.addrpl').modal('show');
        
        $(document).ready(function() {
            $(".addpartnerbtn").click(function() {
                $('.ui.modal.addrpl').modal('show');
                
                action = "add";
                
            });
        
            var Reminder="";
        
		$('#save')
		.click(
				function() {
					var RplName = $("#RplName").val();
							
					var InitialRpl = $("#InitialRpl").val();
					var FirstStreet = $("#FirstStreet").val();
					var SecondStreet = $("#SecondStreet").val();
					var Town = $("#Town").val();
					
					var PostalCode = $("#PostalCode").val();
					var District = $("#District").val(); 
					var Province = $("#Province").val();
					var country  = $('.selection.dropdown.country').dropdown('get text');
					var Telephone = $("#Telephone").val();			
					var Email = $("#Email").val();
					var Website = $("#Website").val();
					
					var RfirstStreet = $("#RfirstStreet").val();
							
					var RsecondSreet = $("#RsecondSreet").val();
					var Rtown = $("#Rtown").val();
					var RpostalCode = $("#RpostalCode").val();
					var Rdistrict = $("#Rdistrict").val();
					var Rprovince = $("#Rprovince").val();
					var Rcountry  = $('.selection.dropdown.Rcountry').dropdown('get text');
					var Rtelephone = $("#Rtelephone").val();
					var Remail = $("#Remail").val();
					var Rwebsite = $("#Rwebsite").val();
					var AgreementName = $("#AgreementName").val();
					var AgreementCode = $("#AgreementCode").val();
					var Rplvalid = $("#Rplvalid").val();
					var Rplexpiry = $("#Rplexpiry").val();
					
					
/* 					 $('.ui.checkbox.Rreminder').checkbox({
						 
						
						 
						  onChecked: function () { 
							  Reminder="Yes";
							  alert(Reminder);
						  
						  
						  },
						  onUnchecked: function () { 
							  
							  Reminder="No"; 
							  alert(Reminder);
						  
						  }
						  
						  
						});
					
					console.log(Reminder); */
					
/* 					$('.ui.checkbox.Rreminder').click(function() {
					    checked = $('.ui.checkbox.Rreminder').is(':checked');
					    console.log(checked);
					    if (checked === true) {
					       alert("success");
					    }
					    else {
					    	 alert("fail");
					    }
					}); */
					
					
					var Agname = $("#Agname").val();
					var Adesignation = $("#Adesignation").val();
					var Aemail = $("#Aemail").val();
					var Atelephone = $("#Atelephone").val();
					var Alocation = $("#Alocation").val();
					
					
					var TagreementName = $("#TagreementName").val();
					var Trplcode = $("#Trplcode").val();
					var Tsignedby = $("#Tsignedby").val();
					var Trelationship = $("#Trelationship").val();
					var Tvaliddate = $("#Tvaliddate").val();
					var Texpiry = $("#Texpiry").val();
					var Treminder = "";
					
					/* $('.ui.checkbox.Treminder').checkbox({
						  onChecked: function () { 
							  
							  Treminder="Yes"; 
						  
						  
						  },
						  onUnchecked: function () { 
							  
							  Treminder="No"; 
						  
						  
						  }
						}); */
					
					
					 
					var Tnotes = $("#Tnotes").val();
					var Torgname = $("#Torgname").val();
					var Tfirststreet = $("#Tfirststreet").val();
					var Tsecondstreet = $("#Tsecondstreet").val();
					var Ttown = $("#Ttown").val();
					var Tpostalcode = $("#Tpostalcode").val();
					var Tdistrict = $("#Tdistrict").val();
					var Tprovince = $("#Tprovince").val();
					var Tcountry  = $('.selection.dropdown.Tcountry').dropdown('get text');
					var Ttelephone = $("#Ttelephone").val();
					var Temail = $("#Temail").val();
					var Twebsite = $("#Twebsite").val();
					var Tkeycontactname = $("#Tkeycontactname").val();
					var Tkeytel = $("#Tkeytel").val();
					var TkeyEmail = $("#Tkeyemail").val();
					
					
		
					var data = {
						"RplName" : RplName,
						"initial_to_RPL" : InitialRpl,						
						"Global_Headquarters" : {
							
							"FirstStreet":FirstStreet,
							"SecondStreet":SecondStreet,
							"Town":Town,
							"PostalCode":PostalCode,
							"District":District,
							"Province":Province,
							"Country":country,
							"Telephone":Telephone,
							"Email":Email,
							"Website":Website
							
					
						},
						"Regional_Details" : {
							
							"FirstStreet":RfirstStreet,
							"SecondStreet":RsecondSreet,
							"Town":Rtown,
							"PostalCode":RpostalCode,
							"District":Rdistrict,
							"Province":Rprovince,
							"Country":Rcountry,
							"Telephone":Rtelephone,
							"Email":Remail,
							"Website":Rwebsite
							
							
						},
						
						"Agreement_Name" : AgreementName,
						"Rpl_Agreement_Code":AgreementCode,
						"RPL_Validity_From" : Rplvalid,
						"Expire_Date" : Rplexpiry,
						//"Reminder" : Rreminder,	
						"Authorized_Signatory":{
							
							"Name":Agname,
							"Designation":Adesignation,
							"Email":Aemail,
							"Telephone":Atelephone,
							"Location":Alocation
							
						},
						"Third_Party":{
							
							"AgreementName":TagreementName,
							"RPL_Agreement_code":Trplcode,
							"Signed_by":Tsignedby,
							"Relationship_to_us":Trelationship,
							"Validity_Date_From":Tvaliddate,
							"Expire_Date":Texpiry,
							//"Reminder":Treminder,
							"Special_Note":Tnotes,
							"Name_of_Organization":Torgname,
							"Address":{
								
								"FirstStreet":Tfirststreet,
								"SecondStreet":Tsecondstreet,
								"Town":Ttown,
								"PostalCode":Tpostalcode,
								"District":Tdistrict,
								"Province":Tprovince,
								"Country":Tcountry
							},
							"Telephone":Ttelephone,
							"Email":Temail,
							"Website":Twebsite,
							"Keycontact":Tkeycontactname,
							"Keycontact_tel":Tkeytel,
							"Keycontact_Email":TkeyEmail
							
							
							
						}
				

					};
					data = JSON.stringify(data);
					console.log("test");
					console.log(data);

		 			  $
						.ajax({
							type : "POST",
							accept : "text/html",
							//contentType: "application/json; charset=utf-8",
							dataType : "html",
							url : "${pageContext.request.contextPath}/ap/rpl/"+action+"",
							data : ({
								"data" : data,"key":modifyid

							}),
							  success: function(){
								  location.reload(true);
							}
							
		
						});    

		 			  
		 			 //location.reload(true);
		 			 
		});
		
	
		
		
		
		$('#tblRPL').DataTable({
			
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
					title : "RPL Partner name"
				},
				{
					title : "Acronym"
				},
				
				{
					title : "Agreement Code"
				},
				
				{
					title : "Agreement Name"
				},
				{
					title : "Action"
				}
	
				
				]
	    

	    
		});
		
		$('#tblRPL_filter').hide();
		
		console.log('${ProgramDetails}');
		var RPL = JSON.parse('${RPL}');
		
		$.each(RPL, function(key, value) {

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
multiaction += "				<div class=\"ui button modifyrpl\" >Modify<\/div>";
multiaction += "				<div class=\"ui floating dropdown icon button\">";
multiaction += "					<i class=\"dropdown icon\"><\/i>";
multiaction += "					<div class=\"menu\">";
multiaction += "";
multiaction += "						<div class=\"item viewrpl\">";
multiaction += "							<i class=\"delete icon\"><\/i> View";
multiaction += "						<\/div>";
multiaction += "					";
multiaction += "						<div class=\"item Approverpl\">";
multiaction += "							<i class=\"delete icon\"><\/i> Approve";
multiaction += "						<\/div>";
multiaction += "						<div class=\"item Declinerpl\">";
multiaction += "							<i class=\"delete icon\"><\/i> Decline";
multiaction += "						<\/div>";
multiaction += "						<div class=\"item suspendrpl\">";
multiaction += "							<i class=\"delete icon\"><\/i> Suspend";
multiaction += "						<\/div>";
multiaction += "						<div class=\"item deactivaterpl\">";
multiaction += "							<i class=\"delete icon\"><\/i> Deactivate";
multiaction += "						<\/div>";
multiaction += "						";
multiaction += "";
multiaction += "					<\/div>";
multiaction += "				<\/div>";
multiaction += "			<\/div>";



				
			$('#tblRPL').DataTable().row.add([checkbox,key,value.RplName,value.initial_to_RPL,value.Rpl_Agreement_Code,value.Agreement_Name,multiaction]).draw();
			
				


			});
		
		
		$(".modifyrpl").click(function(){
			
			  action ="Update";
		    
		       var table = $('#tblRPL').DataTable();
				 
				$('#tblRPL tbody').on( 'click', 'tr', function () {
				     modifyid= ( table.row( this ).data()[1] );
				    			    
				   
				   action = "Update";
				   
				   var rplset = JSON.parse('${RPL}');
				   
				   var TPAN= rplset[""+modifyid+""].Third_Party.AgreementName;
				   var TPE= rplset[""+modifyid+""].Third_Party.Email;
				   var TPED= rplset[""+modifyid+""].Third_Party.Expire_Date;
				   var TPK= rplset[""+modifyid+""].Third_Party.Keycontact;
				   var TPKT= rplset[""+modifyid+""].Third_Party.Keycontact_tel;
				   var TPON= rplset[""+modifyid+""].Third_Party.Name_of_Organization;
				   var TPAC= rplset[""+modifyid+""].Third_Party.RPL_Agreement_code;
				   var TPRU= rplset[""+modifyid+""].Third_Party.Relationship_to_us;
				   var TPSB= rplset[""+modifyid+""].Third_Party.Signed_by;
				   var TPSN= rplset[""+modifyid+""].Third_Party.Special_Note;
				   var TPT= rplset[""+modifyid+""].Third_Party.Telephone;
				   var TPV= rplset[""+modifyid+""].Third_Party.Validity_Date_From;
				   var TPW= rplset[""+modifyid+""].Third_Party.Website;
				   var TPKE= rplset[""+modifyid+""].Third_Party.Keycontact_Email;
				  
				   $("#TagreementName").val(TPAN);		   
				   $("#Temail").val(TPE);
				   $("#Texpiry").val(TPED);
				   $("#Tkeycontactname").val(TPK);
				   $("#Tkeytel").val(TPKT);
				   $("#Torgname").val(TPON);
				   $("#Trplcode").val(TPAC);
				   $("#Trelationship").val(TPRU);		   
				   $("#Tsignedby").val(TPSB);
				   $("#Tnotes").val(TPSN);
				   $("#Ttelephone").val(TPT);
				   $("#Tvaliddate").val(TPV);
				   $("#Twebsite").val(TPW);
				   $("#Tkeyemail").val(TPKE);
				   
				   
				   var TPAC= rplset[""+modifyid+""].Third_Party.Address.Country;
				   var TPAD= rplset[""+modifyid+""].Third_Party.Address.District;
				   var TPAFS= rplset[""+modifyid+""].Third_Party.Address.FirstStreet;
				   var TPAPC= rplset[""+modifyid+""].Third_Party.Address.PostalCode;
				   var TPAP= rplset[""+modifyid+""].Third_Party.Address.Province;
				   var TPASS= rplset[""+modifyid+""].Third_Party.Address.SecondStreet;
				   var TPAT= rplset[""+modifyid+""].Third_Party.Address.Town; 
				   
				   $("#coun2").text(TPAC);		   
				   $("#Tdistrict").val(TPAD);
				   $("#Tfirststreet").val(TPAFS);
				   $("#Tpostalcode").val(TPAPC);
				   $("#Tprovince").val(TPAP);
				   $("#Tsecondstreet").val(TPASS);
				   $("#Ttown").val(TPAT);
				   
				   
				   var an= rplset[""+modifyid+""].Agreement_Name;
				   var ed= rplset[""+modifyid+""].Expire_Date;
				   var rv= rplset[""+modifyid+""].RPL_Validity_From;
				   var rn= rplset[""+modifyid+""].RplName;
				   var rc= rplset[""+modifyid+""].Rpl_Agreement_Code;
				 
				   var ir= rplset[""+modifyid+""].initial_to_RPL; 
				   
				   
				  
				   $("#AgreementName").val(an);		   
				   $("#Rplexpiry").val(ed);
				   $("#Rplvalid").val(rv);
				   $("#RplName").val(rn);
				   $("#AgreementCode").val(rc);
				  
				   $("#InitialRpl").val(ir);
				   $("#RplCode").val(idcapture);
				   
				   var AD= rplset[""+modifyid+""].Authorized_Signatory.Designation;
				   var AE= rplset[""+modifyid+""].Authorized_Signatory.Email;
				   var AL= rplset[""+modifyid+""].Authorized_Signatory.Location;
				   var AN= rplset[""+modifyid+""].Authorized_Signatory.Name;
				   var AT= rplset[""+modifyid+""].Authorized_Signatory.Telephone;



				   $("#Adesignation").val(AD);
				   $("#Aemail").val(AE);
				   $("#Alocation").val(AL);
				   $("#Agname").val(AN);
				   $("#Atelephone").val(AT);
				   
				   
			 	   var gc= rplset[""+modifyid+""].Global_Headquarters.Country;
				   var gd= rplset[""+modifyid+""].Global_Headquarters.District;
				   var ge= rplset[""+modifyid+""].Global_Headquarters.Email;
				   var gfs= rplset[""+modifyid+""].Global_Headquarters.FirstStreet;
				   var gpc= rplset[""+modifyid+""].Global_Headquarters.PostalCode;
				   var gp= rplset[""+modifyid+""].Global_Headquarters.Province;
				   var gss= rplset[""+modifyid+""].Global_Headquarters.SecondStreet;
				   var gt= rplset[""+modifyid+""].Global_Headquarters.Telephone;
				   var gtn= rplset[""+modifyid+""].Global_Headquarters.Town;
				   var gw= rplset[""+modifyid+""].Global_Headquarters.Website;	   
				   
				   
				   $("#coun0").text(gc);
				   $("#District").val(gd);
				   $("#Email").val(ge);
				   $("#FirstStreet").val(gfs);
				   $("#PostalCode").val(gpc);
				   $("#Province").val(gp);
				   $("#SecondStreet").val(gss);
				   $("#Telephone").val(gt);
				   $("#Town").val(gtn);
				   $("#Website").val(gw);
				   
	               var rc= rplset[""+modifyid+""].Regional_Details.Country;
				   var rd= rplset[""+modifyid+""].Regional_Details.District;
				   var re= rplset[""+modifyid+""].Regional_Details.Email;
				   var rfs= rplset[""+modifyid+""].Regional_Details.FirstStreet;
				   var rpc= rplset[""+modifyid+""].Regional_Details.PostalCode;
				   var rp= rplset[""+modifyid+""].Regional_Details.Province;
				   var rss= rplset[""+modifyid+""].Regional_Details.SecondStreet;
				   var rt= rplset[""+modifyid+""].Regional_Details.Telephone;
				   var rtn= rplset[""+modifyid+""].Regional_Details.Town;
				   var rw= rplset[""+modifyid+""].Regional_Details.Website;
				   
				   
				   $("#coun1").text(gc);
				   $("#Rdistrict").val(gd);
				   $("#Remail").val(ge);
				   $("#RfirstStreet").val(gfs);
				   $("#RpostalCode").val(gpc);
				   $("#Rprovince").val(gp);
				   $("#RsecondSreet").val(gss);
				   $("#Rtelephone").val(gt);
				   $("#Rtown").val(gtn);
				   $("#Rwebsite").val(gw);
				   
		    
		    
		    
		});
				
				$('.ui.modal.addrpl').modal('show');
				
		});
		
		
		
		
		$(".viewrpl").click(function () {
	        
	        
	        
	         var table = $('#tblRPL').DataTable();
			 
			$('#tblRPL tbody').on( 'click', 'tr', function () {
			    idcapture= ( table.row( this ).data()[1] );
			    //tempid =idcapture;
			   console.log(idcapture);
			   
			   var rplset = JSON.parse('${RPL}');
			   
   
			   
			   var TPAN= rplset[""+idcapture+""].Third_Party.AgreementName;
			   var TPE= rplset[""+idcapture+""].Third_Party.Email;
			   var TPED= rplset[""+idcapture+""].Third_Party.Expire_Date;
			   var TPK= rplset[""+idcapture+""].Third_Party.Keycontact;
			   var TPKT= rplset[""+idcapture+""].Third_Party.Keycontact_tel;
			   var TPON= rplset[""+idcapture+""].Third_Party.Name_of_Organization;
			   var TPAC= rplset[""+idcapture+""].Third_Party.RPL_Agreement_code;
			   var TPRU= rplset[""+idcapture+""].Third_Party.Relationship_to_us;
			   var TPSB= rplset[""+idcapture+""].Third_Party.Signed_by;
			   var TPSN= rplset[""+idcapture+""].Third_Party.Special_Note;
			   var TPT= rplset[""+idcapture+""].Third_Party.Telephone;
			   var TPV= rplset[""+idcapture+""].Third_Party.Validity_Date_From;
			   var TPW= rplset[""+idcapture+""].Third_Party.Website;
			   var TPKE= rplset[""+idcapture+""].Third_Party.Keycontact_Email;
			  
			   $("#TagreementName").val(TPAN);		   
			   $("#Temail").val(TPE);
			   $("#Texpiry").val(TPED);
			   $("#Tkeycontactname").val(TPK);
			   $("#Tkeytel").val(TPKT);
			   $("#Torgname").val(TPON);
			   $("#Trplcode").val(TPAC);
			   $("#Trelationship").val(TPRU);		   
			   $("#Tsignedby").val(TPSB);
			   $("#Tnotes").val(TPSN);
			   $("#Ttelephone").val(TPT);
			   $("#Tvaliddate").val(TPV);
			   $("#Twebsite").val(TPW);
			   $("#Tkeyemail").val(TPKE);
			   
			   
			   $("#TagreementName").attr("disabled", true); 	   
			   $("#Temail").attr("disabled", true); 
			   $("#Texpiry").attr("disabled", true); 
			   $("#Tkeycontactname").attr("disabled", true); 
			   $("#Tkeytel").attr("disabled", true); 
			   $("#Torgname").attr("disabled", true); 
			   $("#Trplcode").attr("disabled", true); 
			   $("#Trelationship").attr("disabled", true); 		   
			   $("#Tsignedby").attr("disabled", true); 
			   $("#Tnotes").attr("disabled", true); 
			   $("#Ttelephone").attr("disabled", true); 
			   $("#Tvaliddate").attr("disabled", true); 
			   $("#Twebsite").attr("disabled", true); 
			   $("#Tkeyemail").attr("disabled", true); 
			   
			   
			   var TPAC= rplset[""+idcapture+""].Third_Party.Address.Country;
			   var TPAD= rplset[""+idcapture+""].Third_Party.Address.District;
			   var TPAFS= rplset[""+idcapture+""].Third_Party.Address.FirstStreet;
			   var TPAPC= rplset[""+idcapture+""].Third_Party.Address.PostalCode;
			   var TPAP= rplset[""+idcapture+""].Third_Party.Address.Province;
			   var TPASS= rplset[""+idcapture+""].Third_Party.Address.SecondStreet;
			   var TPAT= rplset[""+idcapture+""].Third_Party.Address.Town; 
			   
			   $("#coun2").text(TPAC);		   
			   $("#Tdistrict").val(TPAD);
			   $("#Tfirststreet").val(TPAFS);
			   $("#Tpostalcode").val(TPAPC);
			   $("#Tprovince").val(TPAP);
			   $("#Tsecondstreet").val(TPASS);
			   $("#Ttown").val(TPAT);
			   
			   $(".Tcountry").addClass('disabled');	   
			   $("#Tdistrict").attr("disabled", true); 	
			   $("#Tfirststreet").attr("disabled", true); 	
			   $("#Tpostalcode").attr("disabled", true); 	
			   $("#Tprovince").attr("disabled", true); 	
			   $("#Tsecondstreet").attr("disabled", true); 	
			   $("#Ttown").attr("disabled", true); 	
			   
			   
			   
			   
// ************************************************************************************************* 
			   
			   var an= rplset[""+idcapture+""].Agreement_Name;
			   var ed= rplset[""+idcapture+""].Expire_Date;
			   var rv= rplset[""+idcapture+""].RPL_Validity_From;
			   var rn= rplset[""+idcapture+""].RplName;
			   var rc= rplset[""+idcapture+""].Rpl_Agreement_Code;
			 
			   var ir= rplset[""+idcapture+""].initial_to_RPL; 
			   
			   
			  
			   $("#AgreementName").val(an);		   
			   $("#Rplexpiry").val(ed);
			   $("#Rplvalid").val(rv);
			   $("#RplName").val(rn);
			   $("#AgreementCode").val(rc);
			  
			   $("#InitialRpl").val(ir);
			   $("#RplCode").val(idcapture);
			   
			   
			   $("#AgreementName").attr("disabled", true); 	   
			   $("#Rplexpiry").attr("disabled", true); 
			   $("#Rplvalid").attr("disabled", true); 
			   $("#RplName").attr("disabled", true); 
			   $("#AgreementCode").attr("disabled", true); 	  
			   $("#InitialRpl").attr("disabled", true); 
			   $("#RplCode").attr("disabled", true); 
			  
			   
			   
			   
			   
// ************************************************************************************************* 	
               var AD= rplset[""+idcapture+""].Authorized_Signatory.Designation;
			   var AE= rplset[""+idcapture+""].Authorized_Signatory.Email;
			   var AL= rplset[""+idcapture+""].Authorized_Signatory.Location;
			   var AN= rplset[""+idcapture+""].Authorized_Signatory.Name;
			   var AT= rplset[""+idcapture+""].Authorized_Signatory.Telephone;



			   $("#Adesignation").val(AD);
			   $("#Aemail").val(AE);
			   $("#Alocation").val(AL);
			   $("#Agname").val(AN);
			   $("#Atelephone").val(AT);
			   
			   
			   $('#Adesignation').attr("disabled", true); 
			   $('#Aemail').attr("disabled", true); 
			   $('#Alocation').attr("disabled", true); 
			   $('#Agname').attr("disabled", true); 
			   $('#Atelephone').attr("disabled", true);
			  

// ************************************************************************************************* 	

		 	   var gc= rplset[""+idcapture+""].Global_Headquarters.Country;
			   var gd= rplset[""+idcapture+""].Global_Headquarters.District;
			   var ge= rplset[""+idcapture+""].Global_Headquarters.Email;
			   var gfs= rplset[""+idcapture+""].Global_Headquarters.FirstStreet;
			   var gpc= rplset[""+idcapture+""].Global_Headquarters.PostalCode;
			   var gp= rplset[""+idcapture+""].Global_Headquarters.Province;
			   var gss= rplset[""+idcapture+""].Global_Headquarters.SecondStreet;
			   var gt= rplset[""+idcapture+""].Global_Headquarters.Telephone;
			   var gtn= rplset[""+idcapture+""].Global_Headquarters.Town;
			   var gw= rplset[""+idcapture+""].Global_Headquarters.Website;	   
			   
			   
			   $("#coun0").text(gc);
			   $("#District").val(gd);
			   $("#Email").val(ge);
			   $("#FirstStreet").val(gfs);
			   $("#PostalCode").val(gpc);
			   $("#Province").val(gp);
			   $("#SecondStreet").val(gss);
			   $("#Telephone").val(gt);
			   $("#Town").val(gtn);
			   $("#Website").val(gw);
			   
			   
			   $(".country").addClass('disabled');
			   $("#District").attr("disabled", true); 
			   $("#Email").attr("disabled", true); 
			   $("#FirstStreet").attr("disabled", true); 
			   $("#PostalCode").attr("disabled", true); 
			   $("#Province").attr("disabled", true); 
			   $("#SecondStreet").attr("disabled", true); 
			   $("#Telephone").attr("disabled", true); 
			   $("#Town").attr("disabled", true); 
			   $("#Website").attr("disabled", true); 
			   
			   
// ************************************************************************************************* 

               var rc= rplset[""+idcapture+""].Regional_Details.Country;
			   var rd= rplset[""+idcapture+""].Regional_Details.District;
			   var re= rplset[""+idcapture+""].Regional_Details.Email;
			   var rfs= rplset[""+idcapture+""].Regional_Details.FirstStreet;
			   var rpc= rplset[""+idcapture+""].Regional_Details.PostalCode;
			   var rp= rplset[""+idcapture+""].Regional_Details.Province;
			   var rss= rplset[""+idcapture+""].Regional_Details.SecondStreet;
			   var rt= rplset[""+idcapture+""].Regional_Details.Telephone;
			   var rtn= rplset[""+idcapture+""].Regional_Details.Town;
			   var rw= rplset[""+idcapture+""].Regional_Details.Website;
			   
			   
			   $("#coun1").text(gc);
			   $("#Rdistrict").val(gd);
			   $("#Remail").val(ge);
			   $("#RfirstStreet").val(gfs);
			   $("#RpostalCode").val(gpc);
			   $("#Rprovince").val(gp);
			   $("#RsecondSreet").val(gss);
			   $("#Rtelephone").val(gt);
			   $("#Rtown").val(gtn);
			   $("#Rwebsite").val(gw);
			   
			   
			   $(".Rcountry").addClass('disabled');
			   $("#Rdistrict").attr("disabled", true); 
			   $("#Remail").attr("disabled", true); 
			   $("#RfirstStreet").attr("disabled", true); 
			   $("#RpostalCode").attr("disabled", true); 
			   $("#Rprovince").attr("disabled", true); 
			   $("#RsecondSreet").attr("disabled", true); 
			   $("#Rtelephone").attr("disabled", true); 
			   $("#Rtown").attr("disabled", true); 
			   $("#Rwebsite").attr("disabled", true); 
			   
			   
// ************************************************************************************************* 			   
			   	
			   
			    
			} );  
				
			$('.ui.modal.addrpl').modal('show');
			
	    });		
		
		
		$("#searchtrigger").click(function(){
			   
			var option= $('.searchoption').dropdown('get text');
			
			if(option=="Partner name"){
				
				option= "RplName";
			}
			
           if(option=="Acronym"){
				
				option= "initial_to_RPL";
			}
           
           if(option=="Agreement Name"){
				
				option= "Agreement_Name";
			}
			
			var key =$("#searchkey").val().trim();
			var RPLsearch = JSON.parse('${RPL}');
			 
			 $.each(RPLsearch, function(key5, value5){
				 
				 if(value5[""+option+""]==key){
					 
					 var newkey=key5;
					 var rplname=value5.RplName;  //RPL Partner name
					 var rplacr=value5.initial_to_RPL; //Acronym
					 var Agreename=value5.Agreement_Name; //Agreement Name   
					 var Agc=value5.Rpl_Agreement_Code;
					 
					 var tbl = $('#tblRPL').DataTable();
					 
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
						multiaction += "				<div class=\"ui button modifyrpl\" >Modify<\/div>";
						multiaction += "				<div class=\"ui floating dropdown icon button\">";
						multiaction += "					<i class=\"dropdown icon\"><\/i>";
						multiaction += "					<div class=\"menu\">";
						multiaction += "";
						multiaction += "						<div class=\"item viewrpl\">";
						multiaction += "							<i class=\"delete icon\"><\/i> View";
						multiaction += "						<\/div>";
						multiaction += "					";
						multiaction += "						<div class=\"item Approverpl\">";
						multiaction += "							<i class=\"delete icon\"><\/i> Approve";
						multiaction += "						<\/div>";
						multiaction += "						<div class=\"item Declinerpl\">";
						multiaction += "							<i class=\"delete icon\"><\/i> Decline";
						multiaction += "						<\/div>";
						multiaction += "						<div class=\"item suspendrpl\">";
						multiaction += "							<i class=\"delete icon\"><\/i> Suspend";
						multiaction += "						<\/div>";
						multiaction += "						<div class=\"item deactivaterpl\">";
						multiaction += "							<i class=\"delete icon\"><\/i> Deactivate";
						multiaction += "						<\/div>";
						multiaction += "						";
						multiaction += "";
						multiaction += "					<\/div>";
						multiaction += "				<\/div>";
						multiaction += "			<\/div>";
					 
					 
						$('#tblRPL').DataTable().row.add([checkbox,key5,rplname,rplacr,Agc,Agreename,multiaction]).draw();
					 
				 }
				 
				 $( "#searchkey" ).keyup(function() {
					 
					 var keycheck =$("#searchkey").val().trim().length;
					 
                     var tbl2 = $('#tblRPL').DataTable();
					 
                     tbl2.clear().draw();
                     
					  if(keycheck==0){
						  
						  var RPLcheck = JSON.parse('${RPL}');
								
								$.each(RPLcheck, function(key8, value8) {

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
					multiaction += "				<div class=\"ui button modifyrpl\" >Modify<\/div>";
					multiaction += "				<div class=\"ui floating dropdown icon button\">";
					multiaction += "					<i class=\"dropdown icon\"><\/i>";
					multiaction += "					<div class=\"menu\">";
					multiaction += "";
					multiaction += "						<div class=\"item viewrpl\">";
					multiaction += "							<i class=\"delete icon\"><\/i> View";
					multiaction += "						<\/div>";
					multiaction += "					";
					multiaction += "						<div class=\"item Approverpl\">";
					multiaction += "							<i class=\"delete icon\"><\/i> Approve";
					multiaction += "						<\/div>";
					multiaction += "						<div class=\"item Declinerpl\">";
					multiaction += "							<i class=\"delete icon\"><\/i> Decline";
					multiaction += "						<\/div>";
					multiaction += "						<div class=\"item suspendrpl\">";
					multiaction += "							<i class=\"delete icon\"><\/i> Suspend";
					multiaction += "						<\/div>";
					multiaction += "						<div class=\"item deactivaterpl\">";
					multiaction += "							<i class=\"delete icon\"><\/i> Deactivate";
					multiaction += "						<\/div>";
					multiaction += "						";
					multiaction += "";
					multiaction += "					<\/div>";
					multiaction += "				<\/div>";
					multiaction += "			<\/div>";

									
					$('#tblRPL').DataTable().row.add([checkbox,key8,value8.RplName,value8.initial_to_RPL,value8.Rpl_Agreement_Code,value8.Agreement_Name,multiaction]).draw();
								
									


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

