<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding = "UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<html class="loaded light-layout" lang="en" data-textdirection="ltr" style="--vh: 3.54px;"><!-- BEGIN: Head--><!-- Mirrored from pixinvent.com/demo/vuexy-html-bootstrap-admin-template/html/ltr/vertical-menu-template/table-datatable-basic.html by HTTrack Website Copier/3.x [XR&CO'2014], Sun, 07 Aug 2022 05:42:05 GMT --><head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width,initial-scale=1.0,collect-scalable=0,minimal-ui">
    <meta name="description" content="Vuexy admin is super flexible, powerful, clean &amp; modern responsive bootstrap 4 admin template with unlimited possibilities.">
    <meta name="keywords" content="admin template, Vuexy admin template, dashboard template, flat admin template, responsive admin template, web app">
    <meta name="author" content="PIXINVENT">
    <title>Data Management</title>
    <link rel="apple-touch-icon" href="/iris/resources//images/ico/apple-icon-120.html">
    <link rel="shortcut icon" type="image/x-icon" href="/iris/resources/images/logo/logo.png">
    <link href="https://fonts.googleapis.com/css2?family=Montserrat:ital,wght@0,300;0,400;0,500;0,600;1,400;1,500;1,600" rel="stylesheet">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/flatpickr/dist/flatpickr.min.css">

    <!-- BEGIN: Vendor CSS-->
     <link rel="stylesheet" type="text/css" href="/iris/resources/vendors/css/vendors.min.css">
    <link rel="stylesheet" type="text/css" href="/iris/resources/vendors/css/forms/select/select2.min.css">
    <link rel="stylesheet" type="text/css" href="/iris/resources//vendors/css/tables/datatable/dataTables.bootstrap5.min.css">
    <link rel="stylesheet" type="text/css" href="/iris/resources//vendors/css/tables/datatable/responsive.bootstrap5.min.css">
    <link rel="stylesheet" type="text/css" href="/iris/resources//vendors/css/tables/datatable/buttons.bootstrap5.min.css">
    <link rel="stylesheet" type="text/css" href="/iris/resources//vendors/css/tables/datatable/rowGroup.bootstrap5.min.css">
    <link rel="stylesheet" type="text/css" href="/iris/resources//vendors/css/pickers/flatpickr/flatpickr.min.css">
    <!-- END: Vendor CSS-->
  <link rel="stylesheet" type="text/css" href="/iris/resources/css/plugins/forms/form-validation.css">
    <!-- BEGIN: Theme CSS-->
    <link rel="stylesheet" type="text/css" href="/iris/resources//css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="/iris/resources//css/bootstrap-extended.min.css">
    <link rel="stylesheet" type="text/css" href="/iris/resources//css/colors.min.css">
    <link rel="stylesheet" type="text/css" href="/iris/resources//css/components.min.css">
    <link rel="stylesheet" type="text/css" href="/iris/resources//css/themes/dark-layout.min.css">
    <link rel="stylesheet" type="text/css" href="/iris/resources//css/themes/bordered-layout.min.css">
    <link rel="stylesheet" type="text/css" href="/iris/resources//css/themes/semi-dark-layout.min.css">

    <!-- BEGIN: Page CSS-->
    <link rel="stylesheet" type="text/css" href="/iris/resources//css/core/menu/menu-types/vertical-menu.min.css">
    <!-- END: Page CSS-->
  <link rel="stylesheet" type="text/css" href="/iris/resources/css/plugins/forms/pickers/form-flat-pickr.min.css">
    <link rel="stylesheet" type="text/css" href="/iris/resources/css/plugins/forms/pickers/form-pickadate.min.css">
    <!-- END: Page CSS-->
    <!-- BEGIN: Custom CSS-->
    <link rel="stylesheet" type="text/css" href="/iris/resources//assets/css/style.css">
    <!-- END: Custom CSS-->
<style>
td{
font-size: 1rem!important;
}
.startRange,.inRange,.endRange{
    background: #da0d14 !important;
    color: white !important;
}
.flatpickr-calendar .flatpickr-day.inRange, .flatpickr-calendar .flatpickr-day.inRange:hover {
    background: #da0d14 !important;
    border-color: #da0d14 !important;
    box-shadow: -5px 0 0 #da0d14, 5px 0 0 #da0d14;
}
#datatable-collect_filter{
	display:none !important;
}
</style>
  </head>
  <!-- END: Head-->

  <!-- BEGIN: Body-->
  <body class="pace-done vertical-layout vertical-menu-modern navbar-floating footer-static menu-expanded" data-open="click" data-menu="vertical-menu-modern" data-col="" style=""><div class="pace pace-inactive"><div class="pace-progress" data-progress-text="100%" data-progress="99" style="transform: translate3d(100%, 0px, 0px);">
  <div class="pace-progress-inner"></div>
</div>
<div class="pace-activity"></div></div>

    <!-- BEGIN: Header-->
    <jsp:include page="../views/layout/header.jsp"></jsp:include>
    <!-- END: Header-->


    <!-- BEGIN: Main Menu-->
     <jsp:include page="../views/layout/menu.jsp"></jsp:include>
    <!-- END: Main Menu-->

    <!-- BEGIN: Content-->
    <div class="app-content content ">
      <div class="content-overlay"></div>
      <div class="header-navbar-shadow"></div>
      <div class="content-wrapper container-xxl p-0">
   
        <div class="content-body"><div class="row">
</div>

<!--/ Basic table -->

<!-- Complex Headers -->
<div class="content-header row">
          <div class="content-header-left col-md-9 col-12 mb-2">
            <div class="row breadcrumbs-top">
              <div class="col-12">
                <h2 class="content-header-title float-start mb-0">Data Management</h2>
                <div class="breadcrumb-wrapper">
                  <ol class="breadcrumb">
                    <li class="breadcrumb-item"><a href="/iris/iris-settings"><i data-feather='settings'></i> Masters</a>
                    </li>
                    <li class="breadcrumb-item"><a>Data Management</a>
                    </li>
                   
                  </ol>
                </div>
              </div>
            </div>
          </div>
          <div class="content-header-right text-md-end col-md-3 col-12 d-md-block d-none">
            <div class="mb-1 breadcrumb-right">
              
            </div>
          </div>
        </div>
<section id="complex-header-datatable">
          <div class="content-wrapper container-xxl p-0">
         <!--    <div class="content-header row">
									            <div class="sidebar-toggle d-block d-lg-none ms-1">
											      <svg xmlns="http://www.w3.org/2000/svg" width="14" height="14" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-menu font-medium-5"><line x1="3" y1="12" x2="21" y2="12"></line><line x1="3" y1="6" x2="21" y2="6"></line><line x1="3" y1="18" x2="21" y2="18"></line></svg>
											    </div>
            </div> -->
            <div class="content-body"><div class="body-content-overlay"></div>
            
            
           <div class="card-body" id="filterDiv">
          <div class="row">
          
        <div class="col-xl-2 col-md-6 col-12" style="
    padding-right: calc(var(--bs-gutter-x) * 0);" >
           <div class="mb-1">
              <label class="form-label" for="select2-basic">SBU</label>
              <div class="position-relative" ><select class="searchable form-select " id="sbuID" onchange="onFiltersChnage();" data-select2-id="select2-basic1" tabindex="1" aria-hidden="true">
               
              </select>
              </div></div>
            </div> 
            <div class="col-xl-2 col-md-6 col-12" style="
    padding-right: calc(var(--bs-gutter-x) * 0);
">
             <div class="mb-1">
              <label class="form-label" for="select2-basic">Procress</label>
              <div class="position-relative" ><select   class="searchable form-select " id="department_code" data-select2-id="select2-basic0" tabindex="-1" aria-hidden="true">
               
              </select></div>
            </div>
            </div>
             <div class="col-xl-2 col-md-6 col-12" style="padding-right: calc(var(--bs-gutter-x) * 0);">
             <div class="mb-1">
              <label class="form-label" for="select2-basic">Sites</label>
              <div class="position-relative" ><select  class="searchable form-select " id="site_nameID" data-select2-id="select2-basic" tabindex="0" aria-hidden="true">
               <option value="" >All</option>
               
              </select></div>
            </div>
            </div>
            <div class="col-xl-3 col-md-6 col-12" style="padding-right: calc(var(--bs-gutter-x) * 0);">
             <div class="mb-1">
              <div class="position-relative" >
             <div class="col-md-12 mb-1">
          <label class="form-label" for="fp-range">Date Range</label>
          <input type="text" id="fp-range"  class="form-control flatpickr-range flatpickr-input" name="date" placeholder="YYYY-MM-DD to YYYY-MM-DD" >
        </div></div>
            </div>
            </div>
            <div class="re-text col-xl-3 col-md-3 col-6">
             <div class="demo-inline-spacing">
            <a type="button" class="btn btn-gradient-danger re-text-bg" onclick="getUserList();"><i data-feather='search'></i> </a>
           <a  onclick="clearFilters();" id="clearFilterBtn"  class="btn btn-gradient-danger re-text-bg "> <i data-feather='refresh-ccw'></i></a> 
          </div>
            </div>
            <!--  <div class="re-text col-xl-2 col-md-3 col-12 mt-2 text-end">
               <a type="button" class="btn btn-gradient-danger re-text-bg" data-bs-toggle="tooltip" data-bs-placement="top" title="" data-bs-original-title="Export to Excel">Export <img src="/iris/resources/images/icons/Excel.png" class="logo" style="width: 2rem;">  </a>
             </div> -->
          </div>
        </div> 
        <div class="toast-container position-fixed top-0 end-0 p-2" style="z-index: 15">
  

 
</div>
            <br>
<div class="col-12" id="bigDiv">

      <div class="card" style="border: 1px solid black;padding: 4px;">
								<div >
									<div class="card-header border-bottom p-1">
										<div class="head-label">
											<h6 class=""> Data Management</h6>
										</div>
										<div>
					 </div>
					</div>
					 <table id="datatable-collect" class="invoice-list-table table">
				            <thead>
				              <tr>
				               <th>S.No</th><th >Action</th><th>Waste Type</th><th>Quantity</th><th>Quantity Measure</th><th>Date</th>
				               <th>Site Name</th><th>Comments</th>
             				</tr>
			            </thead>
			          </table>
					</div>
				</div>
    		</div>
            </div>
          </div>
	</section>
	 
    </div>
  </div>
</div>
    <div class="sidenav-overlay" style="touch-action: pan-y; user-select: none; -webkit-user-drag: none; -webkit-tap-highlight-color: rgba(0, 0, 0, 0);"></div>
    <div class="drag-target" style="touch-action: pan-y; user-select: none; -webkit-user-drag: none; -webkit-tap-highlight-color: rgba(0, 0, 0, 0);"></div>

    <!-- BEGIN: Footer-->
    <footer class="footer footer-static footer-light">
      <p class="clearfix mb-0"><span class="float-md-start d-block d-md-inline-block mt-25">COPYRIGHT  &copy;  <span id="currentYear"></span> ,| Powered by<a class="ms-25" href="https://ramkyenviroengineers.com/" target="_blank">Re Sustainability Limited</a><span class="d-none d-sm-inline-block"> . All Rights Reserved.</span></span></p>
    </footer>
    <button class="btn btn-primary btn-icon scroll-top waves-effect waves-float waves-light" type="button"><svg xmlns="http://www.w3.org/2000/svg" width="14" height="14" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-arrow-up"><line x1="12" y1="19" x2="12" y2="5"></line><polyline points="5 12 12 5 19 12"></polyline></svg></button>
   
   
     <script src="/iris/resources/vendors/js/vendors.min.js"></script>
     <script src="/iris/resources/vendors/js/forms/select/select2.full.min.js"></script>
  
     <script src="/iris/resources/js/scripts/forms/form-validation.js"></script>
    <!-- BEGIN Vendor JS--> 
    <script src="/iris/resources/vendors/js/forms/validation/jquery.validate.min.js"></script> 
    <script src="https://cdn.jsdelivr.net/npm/flatpickr"></script>
    <!-- BEGIN: Page Vendor JS-->
    <script src="/iris/resources//vendors/js/tables/datatable/jquery.dataTables.min.js"></script>
    <script src="/iris/resources//vendors/js/tables/datatable/dataTables.bootstrap5.min.js"></script>
    <script src="/iris/resources//vendors/js/tables/datatable/dataTables.responsive.min.js"></script>
    <script src="/iris/resources//vendors/js/tables/datatable/responsive.bootstrap5.min.js"></script>
    <script src="/iris/resources//vendors/js/tables/datatable/datatables.checkboxes.min.js"></script>
    <script src="/iris/resources//vendors/js/tables/datatable/datatables.buttons.min.js"></script>
    <script src="/iris/resources//vendors/js/tables/datatable/jszip.min.js"></script>
    <script src="/iris/resources//vendors/js/tables/datatable/pdfmake.min.js"></script>
    <script src="/iris/resources//vendors/js/tables/datatable/vfs_fonts.js"></script>
    <script src="/iris/resources//vendors/js/tables/datatable/buttons.html5.min.js"></script>
    <script src="/iris/resources//vendors/js/tables/datatable/buttons.print.min.js"></script>
    <script src="/iris/resources//vendors/js/tables/datatable/dataTables.rowGroup.min.js"></script>
    <script src="/iris/resources//vendors/js/pickers/flatpickr/flatpickr.min.js"></script>
    <!-- END: Page Vendor JS-->
      <script src="/iris/resources/js2/dataTables.material.min.js"  ></script>
          <script src="/iris/resources/js2/jquery.dataTables-v.1.10.min.js"  ></script>
              <script src="/iris/resources/vendors/js/extensions/moment.min.js"></script>
    <script src="/iris/resources/vendors/js/tables/datatable/jquery.dataTables.min.js"></script>
    <script src="/iris/resources/vendors/js/tables/datatable/datatables.buttons.min.js"></script>
    <script src="/iris/resources/vendors/js/tables/datatable/dataTables.bootstrap5.min.js"></script>
    <script src="/iris/resources/vendors/js/tables/datatable/dataTables.responsive.min.js"></script>
    <script src="/iris/resources/vendors/js/tables/datatable/responsive.bootstrap5.js"></script>
    <!-- BEGIN: Theme JS-->
     <script src="/iris/resources/js/scripts/components/components-bs-toast.min.js"></script>
    <script src="/iris/resources//js/core/app-menu.min.js"></script>
    <script src="/iris/resources//js/core/app.min.js"></script>
    <script src="/iris/resources//js/scripts/customizer.min.js"></script>
    <!-- END: Theme JS-->
     <script src="/iris/resources/js2/datetime-moment-v1.10.12.js"  ></script>
    <!-- BEGIN: Page JS-->
    <script src="/iris/resources//js/scripts/tables/table-datatables-basic.min.js"></script>
    <!-- END: Page JS-->
    <script src="/iris/resources/vendors/js/pickers/pickadate/picker.js"></script>
    <script src="/iris/resources/vendors/js/pickers/pickadate/picker.date.js"></script>
    <script src="/iris/resources/vendors/js/pickers/pickadate/picker.time.js"></script>
    <script src="/iris/resources/vendors/js/pickers/pickadate/legacy.js"></script>
    <script src="/iris/resources/vendors/js/pickers/flatpickr/flatpickr.min.js"></script>
        <script src="/iris/resources/js/scripts/forms/pickers/form-pickers.min.js"></script>
         <form id="getUser" class="row gy-1 pt-75" action="<%=request.getContextPath() %>/get-user-details" method="post" class="form-horizontal" role="form" >
         	  <input type="hidden" id="idVal" name="id"  />
         </form>
    <script>
 $(window).on('load',  function(){
    	
        if (feather) {
          feather.replace({ width: 14, height: 14 });
        }
      })
       document.getElementById("currentYear").innerHTML = new Date().getFullYear();
 $(document).ready(function () {
  	 // $('select:not(.searchable)').formSelect();
       $('.searchable').select2();
        getUserList();
        $('#clearFilterBtn').tooltip({
            trigger: 'manual' // Set the trigger to 'manual'
          });
 
  });
 document.addEventListener('DOMContentLoaded', function() {
     // Your Flatpickr initialization code here
     var today = new Date();
            var startOfMonth = new Date(today.getFullYear(), today.getMonth(), 1);

            flatpickr("#fp-range", {
                mode: "range",
                dateFormat: "Y-m-d",
                defaultDate: [startOfMonth, today],
                maxDate: today // Disable future dates
     });
 });
 function clearFilters(){
		window.location.href= "<%=request.getContextPath()%>/iris-datamanagement";
}

 function onFiltersChnage(){
	    getProcessFilterList('');
		getSitesFilterList('');
 }
 
 
 function getSBUFilterList() {
		var sbu_code = $("#sbuID").val();
		var site = $("#site_nameID").val();
		var department_code = $("#department_code").val();
		var date = $("#fp-range").val();
       if ($.trim(sbu_code) == "") {
       	$("#sbuID option:not(:first)").remove();
       	var myParams = { sbu_code: sbu_code, site: site, department_code : department_code, date : date };
           $.ajax({
               url: "<%=request.getContextPath()%>/ajax/getSBUFilterListForDM",
               data: myParams, cache: false,async: false,
               success: function (data) {
                   if (data.length > 0) {
                       $.each(data, function (i, val) {
                            $("#sbuID").append('<option value="' + val.sbu_code + '">' + $.trim(val.sbu_code) +'</option>');
                       });
                   }
               },error: function (jqXHR, exception) {
   	   			      $(".page-loader").hide();
      	          	  getErrorMessage(jqXHR, exception);
      	     	  }
           });
       }
   }
 sbu = "";
 function getProcessFilterList() {
	 var sbu_code = $("#sbuID").val();
	 var department_code = $("#department_code").val();
	 var site = $("#site_nameID").val();
	 if(sbu_code != sbu){
			department_code = "";
		}
	    sbu = sbu_code;
	    
		var date = $("#fp-range").val();
	   if ($.trim(department_code) == "") {
       	$("#department_code option").remove();
     	var myParams = {sbu_code: sbu_code };
           $.ajax({
               url: "<%=request.getContextPath()%>/ajax/getDeptFilterListForDM",
               data: myParams, cache: false,async: false,
               success: function (data) {
                   if (data.length > 0) {
                       $.each(data, function (i, val) {
                            $("#department_code").append('<option value="' + val.department_code + '">' + $.trim(val.department_name) +'</option>');
                       });
                   }
               },error: function (jqXHR, exception) {
   	   			      $(".page-loader").hide();
      	          	  getErrorMessage(jqXHR, exception);
      	     	  }
           });
		  }
   }
 
 function getSitesFilterList() {
	 var sbu_code = $("#sbuID").val();
		var site = $("#site_nameID").val();
		var department_code = $("#department_code").val();
		var date = $("#fp-range").val();
       	$("#site_nameID option:not(:first)").remove();
       	var myParams = {sbu_code: sbu_code };
           $.ajax({
               url: "<%=request.getContextPath()%>/ajax/getSiteFilterListForDM",
               data: myParams, cache: false,async: false,
               success: function (data) {
                   if (data.length > 0) {
                       $.each(data, function (i, val) {
                            $("#site_nameID").append('<option value="' + val.id + '">' + $.trim(val.site_name) +'</option>');
                       });
                   }
               },error: function (jqXHR, exception) {
   	   			      $(".page-loader").hide();
      	          	  getErrorMessage(jqXHR, exception);
      	     	  }
           });
   }
 
 function getUserList() {
		getSBUFilterList('');
		getProcessFilterList('');
		getSitesFilterList('');
		var sbu_code = $("#sbuID").val();
		var site = $("#site_nameID").val();
		var department_code = $("#department_code").val();
		var date = $("#fp-range").val();
 	   	table = $('#datatable-collect').DataTable();
		table.destroy();
		
		var i = 1;
		$.fn.dataTable.moment('DD-MMM-YYYY');
		var rowLen = 0;
		var myParams =   "site="+ site+ "&department_code="+ department_code+ "&sbu_code="+ sbu_code +"&date="+ date ;

		/***************************************************************************************************/
				$('#datatable-collect tbody').empty();

		if((sbu_code == 'BMW' || sbu_code == 'IWM' || sbu_code == 'MSW') &&  department_code.trim() == 'CNT'){

			var headerContent = "<thead><tr><th>S.No</th><th >Action</th><th>Waste Type</th><th>Quantity</th><th>Quantity Measure</th><th>Date</th><th>Site Name</th><th>Comments</th></tr></thead>";
			$('#datatable-collect thead').remove();
		    $('#datatable-collect').append(headerContent);
		    $("#datatable-collect")
			.DataTable(
					{
						"bProcessing" : true,
						"bServerSide" : true,
						"sort" : "position",
						//bStateSave variable you can use to save state on client cookies: set value "true" 
						"bStateSave" : false,
						 stateSave: true,
						 "fnStateSave": function (oSettings, oData) {
						 	localStorage.setItem('MRVCDataTables', JSON.stringify(oData));
						},
						 "fnStateLoad": function (oSettings) {
							return JSON.parse(localStorage.getItem('MRVCDataTables'));
						 },
						//Default: Page display length
						"iDisplayLength" : 10,
						"iData" : {
							"start" : 52
						},
						//We will use below variable to track page number on server side(For more information visit: http://legacy.datatables.net/usage/options#iDisplayStart)
						"iDisplayStart" : 0,
						"fnDrawCallback" : function() {
							//Get page numer on client. Please note: number start from 0 So
							//for the first page you will see 0 second page 1 third page 2...
							//Un-comment below alert to see page number
							//alert("Current page number: "+this.fnPagingInfo().iPage);
						},
						//"sDom": 'l<"toolbar">frtip',
						"initComplete" : function() {
						
						}
						,
						columnDefs : [ {
							"targets" : '',
							"orderable" : false,
						}
		                ],
						"sScrollX" : "100%",
						"sScrollXInner" : "100%",
						"ordering":false,
						"bScrollCollapse" : true,
						"language" : {
							"info" : "_START_ - _END_ of _TOTAL_",
							paginate : {
								next : '<i class="fa fa-angle-right"></i>', 
								previous : '<i class="fa fa-angle-left"></i>'  
							}
						},
						
						"bDestroy" : true,
						"sAjaxSource" : "	<%=request.getContextPath()%>/ajax/get-data-management-iris?"+myParams,
	        "aoColumns": [
	        	 { "mData": function(data,type,row){
                  if($.trim(data.sbu_code) == ''){ return '-'; }else{ return i++ ; }
	            } },
					{ "mData": function(data,type,row){
						var collect_data = "'"+data.id+"','"+data.sbu_code+"','"+data.quantity+"','"+data.date+"','"+data.comments+"'";
	                    var actions = /* ' <div class=""><ul class="nav navbar-nav bookmark-icons">'
		                +'<li class="nav-item d-none d-lg-block"><a class="nav-link" a href="javascript:void(0);"  onclick="getUser('+user_data+');" data-bs-toggle="tooltip" data-bs-placement="bottom" title="" data-bs-original-title="Email" aria-label="Email"><svg xmlns="http://www.w3.org/2000/svg" width="14" height="14" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-edit-2 font-medium-3 me-50"><path d="M17 3a2.828 2.828 0 1 1 4 4L7.5 20.5 2 22l1.5-5.5L17 3z"></path></svg><path d="M18 2h-3a5 5 0 0 0-5 5v3H7v4h3v8h4v-8h3l1-4h-4V7a1 1 0 0 1 1-1h3z"></path></svg></a></li>'
		                +'<li class="nav-item d-none d-lg-block"><a class="nav-link" onclick="deleteUser('+user_data+');" data-bs-toggle="tooltip" data-bs-placement="bottom" title="" data-bs-original-title="Chat" aria-label="Chat"><svg xmlns="http://www.w3.org/2000/svg" width="14" height="14" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-trash font-medium-3 me-50"><polyline points="3 6 5 6 21 6"></polyline><path d="M19 6v14a2 2 0 0 1-2 2H7a2 2 0 0 1-2-2V6m3 0V4a2 2 0 0 1 2-2h4a2 2 0 0 1 2 2v2"></path></svg><path d="M18 2h-3a5 5 0 0 0-5 5v3H7v4h3v8h4v-8h3l1-4h-4V7a1 1 0 0 1 1-1h3z"></path></svg></a></li>'
		                +' </ul></div>' */
		                '<div class="btn-group" role="group" aria-label="Basic example">'
		                +' <a href="javascript:void(0);"  onclick="getUser('+collect_data+');" class="btn bghover re-text btn-outline-primary waves-effect"><svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-edit"><path d="M11 4H4a2 2 0 0 0-2 2v14a2 2 0 0 0 2 2h14a2 2 0 0 0 2-2v-7"></path><path d="M18.5 2.5a2.121 2.121 0 0 1 3 3L12 15l-4 1 1-4 9.5-9.5z"></path></svg></a>'
            
/* 			                +' <a onclick="deleteUser('+user_data+');" class="btn bghover re-text btn-outline-primary waves-effect"><svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-trash-2"><polyline points="3 6 5 6 21 6"></polyline><path d="M19 6v14a2 2 0 0 1-2 2H7a2 2 0 0 1-2-2V6m3 0V4a2 2 0 0 1 2-2h4a2 2 0 0 1 2 2v2"></path><line x1="10" y1="11" x2="10" y2="17"></line><line x1="14" y1="11" x2="14" y2="17"></line></svg></a>'
*/             
		                +'</div>'
	            	return actions;
	            } },
	            { "mData": function(data,type,row){
                  if($.trim(data.sbu_code) == ''){ return '-'; }else{ return data.sbu_code ; }
	            } },
	         	{ "mData": function(data,type,row){
                  if($.trim(data.quantity) == ''){ return '-'; }else{ return data.quantity ; }
	            } },
	       
	            { "mData": function(data,type,row){ 
	            	if($.trim(data.quantity_measure) == ''){ return '-'; }else{ return data.quantity_measure; }
	            } },
	         
	            { "mData": function(data,type,row){
	            	if($.trim(data.date) == ''){ return '-'; }else{ return data.date; } 
	            } }, 
	            { "mData": function(data,type,row){
	            	if($.trim(data.site_name) == ''){ return '-'; }else{ return data.site_name; } 
	            } },
	        	{ "mData": function(data,type,row){
	            	if($.trim(data.comments) == ''){ return '-'; }else{ return data.comments; }
	            } }
	        ]
	    });
	     }else if(sbu_code == 'BMW' &&  department_code.trim() == 'process'){
				var headerContent = "<thead><tr ><th>S.No</th><th >Action</th><th>Total Waste</th><th>Total Incineration</th><th>Total Autoclave</th><th>Quantity Measure Waste</th><th>Quantity Measure Incineration</th><th>Quantity Measure Autoclave</th><th>Date</th><th>Site Name</th><th>Comments</th></tr></thead>";
				$('#datatable-collect thead').remove();
			    $('#datatable-collect').append(headerContent);
			    $("#datatable-collect")
				.DataTable(
						{
							"bProcessing" : true,
							"bServerSide" : true,
							"sort" : "position",
							//bStateSave variable you can use to save state on client cookies: set value "true" 
							"bStateSave" : false,
							 stateSave: true,
							 "fnStateSave": function (oSettings, oData) {
							 	localStorage.setItem('MRVCDataTables', JSON.stringify(oData));
							},
							 "fnStateLoad": function (oSettings) {
								return JSON.parse(localStorage.getItem('MRVCDataTables'));
							 },
							//Default: Page display length
							"iDisplayLength" : 10,
							"iData" : {
								"start" : 52
							},
							//We will use below variable to track page number on server side(For more information visit: http://legacy.datatables.net/usage/options#iDisplayStart)
							"iDisplayStart" : 0,
							"fnDrawCallback" : function() {
								//Get page numer on client. Please note: number start from 0 So
								//for the first page you will see 0 second page 1 third page 2...
								//Un-comment below alert to see page number
								//alert("Current page number: "+this.fnPagingInfo().iPage);
							},
							//"sDom": 'l<"toolbar">frtip',
							"initComplete" : function() {
							
							}
							,
							columnDefs : [ {
								"targets" : '',
								"orderable" : false,
							}
			                ],
							"sScrollX" : "100%",
							"sScrollXInner" : "100%",
							"ordering":false,
							"bScrollCollapse" : true,
							"language" : {
								"info" : "_START_ - _END_ of _TOTAL_",
								paginate : {
									next : '<i class="fa fa-angle-right"></i>', 
									previous : '<i class="fa fa-angle-left"></i>'  
								}
							},
							
							"bDestroy" : true,
							"sAjaxSource" : "	<%=request.getContextPath()%>/ajax/get-data-management-iris?"+myParams,
		        "aoColumns": [
		        	 { "mData": function(data,type,row){
                      if($.trim(data.sbu_code) == ''){ return '-'; }else{ return i++ ; }
		            } },
						{ "mData": function(data,type,row){
							var collect_data = "'"+data.id+"','"+data.sbu_code+"','"+data.quantity+"','"+data.date+"','"+data.comments+"'";
		                    var actions = /* ' <div class=""><ul class="nav navbar-nav bookmark-icons">'
			                +'<li class="nav-item d-none d-lg-block"><a class="nav-link" a href="javascript:void(0);"  onclick="getUser('+user_data+');" data-bs-toggle="tooltip" data-bs-placement="bottom" title="" data-bs-original-title="Email" aria-label="Email"><svg xmlns="http://www.w3.org/2000/svg" width="14" height="14" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-edit-2 font-medium-3 me-50"><path d="M17 3a2.828 2.828 0 1 1 4 4L7.5 20.5 2 22l1.5-5.5L17 3z"></path></svg><path d="M18 2h-3a5 5 0 0 0-5 5v3H7v4h3v8h4v-8h3l1-4h-4V7a1 1 0 0 1 1-1h3z"></path></svg></a></li>'
			                +'<li class="nav-item d-none d-lg-block"><a class="nav-link" onclick="deleteUser('+user_data+');" data-bs-toggle="tooltip" data-bs-placement="bottom" title="" data-bs-original-title="Chat" aria-label="Chat"><svg xmlns="http://www.w3.org/2000/svg" width="14" height="14" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-trash font-medium-3 me-50"><polyline points="3 6 5 6 21 6"></polyline><path d="M19 6v14a2 2 0 0 1-2 2H7a2 2 0 0 1-2-2V6m3 0V4a2 2 0 0 1 2-2h4a2 2 0 0 1 2 2v2"></path></svg><path d="M18 2h-3a5 5 0 0 0-5 5v3H7v4h3v8h4v-8h3l1-4h-4V7a1 1 0 0 1 1-1h3z"></path></svg></a></li>'
			                +' </ul></div>' */
			                '<div class="btn-group" role="group" aria-label="Basic example">'
			                +' <a href="javascript:void(0);"  onclick="getUser('+collect_data+');" class="btn bghover re-text btn-outline-primary waves-effect"><svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-edit"><path d="M11 4H4a2 2 0 0 0-2 2v14a2 2 0 0 0 2 2h14a2 2 0 0 0 2-2v-7"></path><path d="M18.5 2.5a2.121 2.121 0 0 1 3 3L12 15l-4 1 1-4 9.5-9.5z"></path></svg></a>'
                
/* 			                +' <a onclick="deleteUser('+user_data+');" class="btn bghover re-text btn-outline-primary waves-effect"><svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-trash-2"><polyline points="3 6 5 6 21 6"></polyline><path d="M19 6v14a2 2 0 0 1-2 2H7a2 2 0 0 1-2-2V6m3 0V4a2 2 0 0 1 2-2h4a2 2 0 0 1 2 2v2"></path><line x1="10" y1="11" x2="10" y2="17"></line><line x1="14" y1="11" x2="14" y2="17"></line></svg></a>'
 */             
			                +'</div>'
		            	return actions;
		            } },
		            { "mData": function(data,type,row){
                      if($.trim(data.total_waste) == ''){ return '-'; }else{ return data.total_waste ; }
		            } },
		         	{ "mData": function(data,type,row){
                      if($.trim(data.total_incieration) == ''){ return '-'; }else{ return data.total_incieration ; }
		            } },
		       
		            { "mData": function(data,type,row){ 
		            	if($.trim(data.total_autoclave) == ''){ return '-'; }else{ return data.total_autoclave; }
		            } },
		         
		            { "mData": function(data,type,row){
		            	if($.trim(data.quantity_measure_waste) == ''){ return '-'; }else{ return data.quantity_measure_waste; } 
		            } }, 
		            { "mData": function(data,type,row){
		            	if($.trim(data.quantity_measure_incieration) == ''){ return '-'; }else{ return data.quantity_measure_incieration; } 
		            } },
		        	{ "mData": function(data,type,row){
		            	if($.trim(data.quantity_measure_autoclave) == ''){ return '-'; }else{ return data.quantity_measure_autoclave; }
		            } },
		            { "mData": function(data,type,row){
                      if($.trim(data.date) == ''){ return '-'; }else{ return data.date ; }
		            } },
		         	{ "mData": function(data,type,row){
                      if($.trim(data.site_name) == ''){ return '-'; }else{ return data.site_name ; }
		            } },
		       
		            { "mData": function(data,type,row){ 
		            	if($.trim(data.comments) == ''){ return '-'; }else{ return data.comments; }
		            } }
		        ]
		    });
		 }else if(sbu_code == 'BMW' &&  department_code.trim() == 'Dist'){
				var headerContent = "<thead><tr ><th>S.No</th><th >Action</th><th>Total Materials</th><th>Total Recyclable</th><th>Total Plastics</th><th>Total Bags</th><th>Total Glass</th><th>Total Cardboard</th><th>Quantity Measure Materials</th><th>Quantity Measure Recyclables</th><th>Quantity Measure Plastics</th><th>Quantity Measure Bags</th><th>Quantity Measure Glass</th><th>Quantity Measure Cardboard</th><th>Date</th><th>Site Name</th><th>Comments</th></tr></thead>";
				$('#datatable-collect thead').remove();
			    $('#datatable-collect').append(headerContent);
			    $("#datatable-collect")
				.DataTable(
						{
							"bProcessing" : true,
							"bServerSide" : true,
							"sort" : "position",
							//bStateSave variable you can use to save state on client cookies: set value "true" 
							"bStateSave" : false,
							 stateSave: true,
							 "fnStateSave": function (oSettings, oData) {
							 	localStorage.setItem('MRVCDataTables', JSON.stringify(oData));
							},
							 "fnStateLoad": function (oSettings) {
								return JSON.parse(localStorage.getItem('MRVCDataTables'));
							 },
							//Default: Page display length
							"iDisplayLength" : 10,
							"iData" : {
								"start" : 52
							},
							//We will use below variable to track page number on server side(For more information visit: http://legacy.datatables.net/usage/options#iDisplayStart)
							"iDisplayStart" : 0,
							"fnDrawCallback" : function() {
								//Get page numer on client. Please note: number start from 0 So
								//for the first page you will see 0 second page 1 third page 2...
								//Un-comment below alert to see page number
								//alert("Current page number: "+this.fnPagingInfo().iPage);
							},
							//"sDom": 'l<"toolbar">frtip',
							"initComplete" : function() {
							
							}
							,
							columnDefs : [ {
								"targets" : '',
								"orderable" : false,
							}
			                ],
							"sScrollX" : "100%",
							"sScrollXInner" : "100%",
							"ordering":false,
							"bScrollCollapse" : true,
							"language" : {
								"info" : "_START_ - _END_ of _TOTAL_",
								paginate : {
									next : '<i class="fa fa-angle-right"></i>', 
									previous : '<i class="fa fa-angle-left"></i>'  
								}
							},
							
							"bDestroy" : true,
							"sAjaxSource" : "	<%=request.getContextPath()%>/ajax/get-data-management-iris?"+myParams,
		        "aoColumns": [
		        	 { "mData": function(data,type,row){
                      if($.trim(data.sbu_code) == ''){ return '-'; }else{ return i++ ; }
		            } },
						{ "mData": function(data,type,row){
							var collect_data = "'"+data.id+"','"+data.sbu_code+"','"+data.quantity+"','"+data.date+"','"+data.comments+"'";
		                    var actions = /* ' <div class=""><ul class="nav navbar-nav bookmark-icons">'
			                +'<li class="nav-item d-none d-lg-block"><a class="nav-link" a href="javascript:void(0);"  onclick="getUser('+user_data+');" data-bs-toggle="tooltip" data-bs-placement="bottom" title="" data-bs-original-title="Email" aria-label="Email"><svg xmlns="http://www.w3.org/2000/svg" width="14" height="14" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-edit-2 font-medium-3 me-50"><path d="M17 3a2.828 2.828 0 1 1 4 4L7.5 20.5 2 22l1.5-5.5L17 3z"></path></svg><path d="M18 2h-3a5 5 0 0 0-5 5v3H7v4h3v8h4v-8h3l1-4h-4V7a1 1 0 0 1 1-1h3z"></path></svg></a></li>'
			                +'<li class="nav-item d-none d-lg-block"><a class="nav-link" onclick="deleteUser('+user_data+');" data-bs-toggle="tooltip" data-bs-placement="bottom" title="" data-bs-original-title="Chat" aria-label="Chat"><svg xmlns="http://www.w3.org/2000/svg" width="14" height="14" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-trash font-medium-3 me-50"><polyline points="3 6 5 6 21 6"></polyline><path d="M19 6v14a2 2 0 0 1-2 2H7a2 2 0 0 1-2-2V6m3 0V4a2 2 0 0 1 2-2h4a2 2 0 0 1 2 2v2"></path></svg><path d="M18 2h-3a5 5 0 0 0-5 5v3H7v4h3v8h4v-8h3l1-4h-4V7a1 1 0 0 1 1-1h3z"></path></svg></a></li>'
			                +' </ul></div>' */
			                '<div class="btn-group" role="group" aria-label="Basic example">'
			                +' <a href="javascript:void(0);"  onclick="getUser('+collect_data+');" class="btn bghover re-text btn-outline-primary waves-effect"><svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-edit"><path d="M11 4H4a2 2 0 0 0-2 2v14a2 2 0 0 0 2 2h14a2 2 0 0 0 2-2v-7"></path><path d="M18.5 2.5a2.121 2.121 0 0 1 3 3L12 15l-4 1 1-4 9.5-9.5z"></path></svg></a>'
                
/* 			                +' <a onclick="deleteUser('+user_data+');" class="btn bghover re-text btn-outline-primary waves-effect"><svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-trash-2"><polyline points="3 6 5 6 21 6"></polyline><path d="M19 6v14a2 2 0 0 1-2 2H7a2 2 0 0 1-2-2V6m3 0V4a2 2 0 0 1 2-2h4a2 2 0 0 1 2 2v2"></path><line x1="10" y1="11" x2="10" y2="17"></line><line x1="14" y1="11" x2="14" y2="17"></line></svg></a>'
 */             
			                +'</div>'
		            	return actions;
		            } },
		            { "mData": function(data,type,row){
                      if($.trim(data.total_materials) == ''){ return '-'; }else{ return data.total_materials ; }
		            } },
		         	{ "mData": function(data,type,row){
                      if($.trim(data.total_recylable) == ''){ return '-'; }else{ return data.total_recylable ; }
		            } },
		            { "mData": function(data,type,row){
	                      if($.trim(data.quality_measure_plastics) == ''){ return '-'; }else{ return data.quality_measure_plastics ; }
			        } },
		       
		            { "mData": function(data,type,row){ 
		            	if($.trim(data.total_bags) == ''){ return '-'; }else{ return data.total_bags; }
		            } },
		         
		            { "mData": function(data,type,row){
		            	if($.trim(data.total_glass) == ''){ return '-'; }else{ return data.total_glass; } 
		            } }, 
		            { "mData": function(data,type,row){
		            	if($.trim(data.total_cardboard) == ''){ return '-'; }else{ return data.total_cardboard; } 
		            } },
		        	{ "mData": function(data,type,row){
		            	if($.trim(data.quality_measure_materials) == ''){ return '-'; }else{ return data.quality_measure_materials; }
		            } },
		            { "mData": function(data,type,row){
                      if($.trim(data.quality_measure_recylable) == ''){ return '-'; }else{ return data.quality_measure_recylable ; }
		            } },
		         	{ "mData": function(data,type,row){
                      if($.trim(data.quality_measure_plastics) == ''){ return '-'; }else{ return data.quality_measure_plastics ; }
		            } },
		       
		            { "mData": function(data,type,row){ 
		            	if($.trim(data.quality_measure_bags) == ''){ return '-'; }else{ return data.quality_measure_bags; }
		            } }, 
		            { "mData": function(data,type,row){
		            	if($.trim(data.quality_measure_glass) == ''){ return '-'; }else{ return data.quality_measure_glass; } 
		            } },
		        	{ "mData": function(data,type,row){
		            	if($.trim(data.quality_measure_cardboard) == ''){ return '-'; }else{ return data.quality_measure_cardboard; }
		            } },
		            { "mData": function(data,type,row){
                      if($.trim(data.date) == ''){ return '-'; }else{ return data.date ; }
		            } },
		         	{ "mData": function(data,type,row){
                      if($.trim(data.site_name) == ''){ return '-'; }else{ return data.site_name ; }
		            } },
		            { "mData": function(data,type,row){
	                      if($.trim(data.comments) == ''){ return '-'; }else{ return data.comments ; }
			        } }
		        ]
		    });
		 }else if(sbu_code == 'IWM' &&  department_code.trim() == 'Disp'){
				var headerContent = "<thead><tr ><th>S.No</th><th >Action</th><th>Disposal Total Waste</th><th>Disposal Dlf</th><th>Disposal Lat</th><th>Disposal Incineration</th><th>Disposal Afrf</th><th>Disposal Total Waste Measure</th><th>Disposal Dlf Measure</th><th>Disposal Lat Measure</th><th>Disposal Incineration Measure</th><th>Disposal Afrf Measure</th><th>Date</th><th>Site Name</th><th>Comments</th></tr></thead>";
				$('#datatable-collect thead').remove();
			    $('#datatable-collect').append(headerContent);
			    $("#datatable-collect")
				.DataTable(
						{
							"bProcessing" : true,
							"bServerSide" : true,
							"sort" : "position",
							//bStateSave variable you can use to save state on client cookies: set value "true" 
							"bStateSave" : false,
							 stateSave: true,
							 "fnStateSave": function (oSettings, oData) {
							 	localStorage.setItem('MRVCDataTables', JSON.stringify(oData));
							},
							 "fnStateLoad": function (oSettings) {
								return JSON.parse(localStorage.getItem('MRVCDataTables'));
							 },
							//Default: Page display length
							"iDisplayLength" : 10,
							"iData" : {
								"start" : 52
							},
							//We will use below variable to track page number on server side(For more information visit: http://legacy.datatables.net/usage/options#iDisplayStart)
							"iDisplayStart" : 0,
							"fnDrawCallback" : function() {
								//Get page numer on client. Please note: number start from 0 So
								//for the first page you will see 0 second page 1 third page 2...
								//Un-comment below alert to see page number
								//alert("Current page number: "+this.fnPagingInfo().iPage);
							},
							//"sDom": 'l<"toolbar">frtip',
							"initComplete" : function() {
							
							}
							,
							columnDefs : [ {
								"targets" : '',
								"orderable" : false,
							}
			                ],
							"sScrollX" : "100%",
							"sScrollXInner" : "100%",
							"ordering":false,
							"bScrollCollapse" : true,
							"language" : {
								"info" : "_START_ - _END_ of _TOTAL_",
								paginate : {
									next : '<i class="fa fa-angle-right"></i>', 
									previous : '<i class="fa fa-angle-left"></i>'  
								}
							},
							
							"bDestroy" : true,
							"sAjaxSource" : "	<%=request.getContextPath()%>/ajax/get-data-management-iris?"+myParams,
		        "aoColumns": [
		        	 { "mData": function(data,type,row){
                      if($.trim(data.sbu_code) == ''){ return '-'; }else{ return i++ ; }
		            } },
						{ "mData": function(data,type,row){
							var collect_data = "'"+data.id+"','"+data.sbu_code+"','"+data.quantity+"','"+data.date+"','"+data.comments+"'";
		                    var actions = /* ' <div class=""><ul class="nav navbar-nav bookmark-icons">'
			                +'<li class="nav-item d-none d-lg-block"><a class="nav-link" a href="javascript:void(0);"  onclick="getUser('+user_data+');" data-bs-toggle="tooltip" data-bs-placement="bottom" title="" data-bs-original-title="Email" aria-label="Email"><svg xmlns="http://www.w3.org/2000/svg" width="14" height="14" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-edit-2 font-medium-3 me-50"><path d="M17 3a2.828 2.828 0 1 1 4 4L7.5 20.5 2 22l1.5-5.5L17 3z"></path></svg><path d="M18 2h-3a5 5 0 0 0-5 5v3H7v4h3v8h4v-8h3l1-4h-4V7a1 1 0 0 1 1-1h3z"></path></svg></a></li>'
			                +'<li class="nav-item d-none d-lg-block"><a class="nav-link" onclick="deleteUser('+user_data+');" data-bs-toggle="tooltip" data-bs-placement="bottom" title="" data-bs-original-title="Chat" aria-label="Chat"><svg xmlns="http://www.w3.org/2000/svg" width="14" height="14" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-trash font-medium-3 me-50"><polyline points="3 6 5 6 21 6"></polyline><path d="M19 6v14a2 2 0 0 1-2 2H7a2 2 0 0 1-2-2V6m3 0V4a2 2 0 0 1 2-2h4a2 2 0 0 1 2 2v2"></path></svg><path d="M18 2h-3a5 5 0 0 0-5 5v3H7v4h3v8h4v-8h3l1-4h-4V7a1 1 0 0 1 1-1h3z"></path></svg></a></li>'
			                +' </ul></div>' */
			                '<div class="btn-group" role="group" aria-label="Basic example">'
			                +' <a href="javascript:void(0);"  onclick="getUser('+collect_data+');" class="btn bghover re-text btn-outline-primary waves-effect"><svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-edit"><path d="M11 4H4a2 2 0 0 0-2 2v14a2 2 0 0 0 2 2h14a2 2 0 0 0 2-2v-7"></path><path d="M18.5 2.5a2.121 2.121 0 0 1 3 3L12 15l-4 1 1-4 9.5-9.5z"></path></svg></a>'
                
/* 			                +' <a onclick="deleteUser('+user_data+');" class="btn bghover re-text btn-outline-primary waves-effect"><svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-trash-2"><polyline points="3 6 5 6 21 6"></polyline><path d="M19 6v14a2 2 0 0 1-2 2H7a2 2 0 0 1-2-2V6m3 0V4a2 2 0 0 1 2-2h4a2 2 0 0 1 2 2v2"></path><line x1="10" y1="11" x2="10" y2="17"></line><line x1="14" y1="11" x2="14" y2="17"></line></svg></a>'
 */             
			                +'</div>'
		            	return actions;
		            } },
		            { "mData": function(data,type,row){
                      if($.trim(data.disposal_total_waste) == ''){ return '-'; }else{ return data.disposal_total_waste ; }
		            } },
		         	{ "mData": function(data,type,row){
                      if($.trim(data.disposal_dlf) == ''){ return '-'; }else{ return data.disposal_dlf ; }
		            } },
		            { "mData": function(data,type,row){
	                      if($.trim(data.disposal_lat) == ''){ return '-'; }else{ return data.disposal_lat ; }
			        } },
			        { "mData": function(data,type,row){
	                      if($.trim(data.disposal_afrf) == ''){ return '-'; }else{ return data.disposal_afrf ; }
			        } },
		            { "mData": function(data,type,row){ 
		            	if($.trim(data.disposal_incineration) == ''){ return '-'; }else{ return data.disposal_incineration; }
		            } },
		         
		            { "mData": function(data,type,row){
		            	if($.trim(data.disposal_total_waste_measure) == ''){ return '-'; }else{ return data.disposal_total_waste_measure; } 
		            } }, 
		            { "mData": function(data,type,row){
		            	if($.trim(data.disposal_dlf_measure) == ''){ return '-'; }else{ return data.disposal_dlf_measure; } 
		            } },
		        	{ "mData": function(data,type,row){
		            	if($.trim(data.disposal_lat_measure) == ''){ return '-'; }else{ return data.disposal_lat_measure; }
		            } },
		            { "mData": function(data,type,row){
                      if($.trim(data.disposal_incineration_measure) == ''){ return '-'; }else{ return data.disposal_incineration_measure ; }
		            } },
		            { "mData": function(data,type,row){
	                      if($.trim(data.disposal_afrf_measure) == ''){ return '-'; }else{ return data.disposal_afrf_measure ; }
			            } },
			            
		         	{ "mData": function(data,type,row){
                      if($.trim(data.date) == ''){ return '-'; }else{ return data.date ; }
		            } },
		       
		            { "mData": function(data,type,row){ 
		            	if($.trim(data.site_name) == ''){ return '-'; }else{ return data.site_name; }
		            } }, 
		            { "mData": function(data,type,row){
		            	if($.trim(data.comments) == ''){ return '-'; }else{ return data.comments; } 
		            } }
		        ]
		    });
		 }else if(sbu_code == 'IWM' &&  department_code.trim() == 'Los'){
				var headerContent = "<thead><tr ><th>S.No</th><th >Action</th><th>Stock Total Waste</th><th>Stock Dlf</th><th>Stock Lat</th><th>Stock Incineration</th><th>Stock Afrf</th><th>Stock Total Waste Measure</th><th>Stock Dlf Measure</th><th>Stock Lat Measure</th><th>Stock Incineration Measure</th><th>Stock Afrf Measure</th><th>Date</th><th>Site Name</th><th>Comments</th></tr></thead>";
				$('#datatable-collect thead').remove();
			    $('#datatable-collect').append(headerContent);
			    $("#datatable-collect")
				.DataTable(
						{
							"bProcessing" : true,
							"bServerSide" : true,
							"sort" : "position",
							//bStateSave variable you can use to save state on client cookies: set value "true" 
							"bStateSave" : false,
							 stateSave: true,
							 "fnStateSave": function (oSettings, oData) {
							 	localStorage.setItem('MRVCDataTables', JSON.stringify(oData));
							},
							 "fnStateLoad": function (oSettings) {
								return JSON.parse(localStorage.getItem('MRVCDataTables'));
							 },
							//Default: Page display length
							"iDisplayLength" : 10,
							"iData" : {
								"start" : 52
							},
							//We will use below variable to track page number on server side(For more information visit: http://legacy.datatables.net/usage/options#iDisplayStart)
							"iDisplayStart" : 0,
							"fnDrawCallback" : function() {
								//Get page numer on client. Please note: number start from 0 So
								//for the first page you will see 0 second page 1 third page 2...
								//Un-comment below alert to see page number
								//alert("Current page number: "+this.fnPagingInfo().iPage);
							},
							//"sDom": 'l<"toolbar">frtip',
							"initComplete" : function() {
							
							}
							,
							columnDefs : [ {
								"targets" : '',
								"orderable" : false,
							}
			                ],
							"sScrollX" : "100%",
							"sScrollXInner" : "100%",
							"ordering":false,
							"bScrollCollapse" : true,
							"language" : {
								"info" : "_START_ - _END_ of _TOTAL_",
								paginate : {
									next : '<i class="fa fa-angle-right"></i>', 
									previous : '<i class="fa fa-angle-left"></i>'  
								}
							},
							
							"bDestroy" : true,
							"sAjaxSource" : "	<%=request.getContextPath()%>/ajax/get-data-management-iris?"+myParams,
		        "aoColumns": [
		        	 { "mData": function(data,type,row){
                      if($.trim(data.sbu_code) == ''){ return '-'; }else{ return i++ ; }
		            } },
						{ "mData": function(data,type,row){
							var collect_data = "'"+data.id+"','"+data.sbu_code+"','"+data.quantity+"','"+data.date+"','"+data.comments+"'";
		                    var actions = /* ' <div class=""><ul class="nav navbar-nav bookmark-icons">'
			                +'<li class="nav-item d-none d-lg-block"><a class="nav-link" a href="javascript:void(0);"  onclick="getUser('+user_data+');" data-bs-toggle="tooltip" data-bs-placement="bottom" title="" data-bs-original-title="Email" aria-label="Email"><svg xmlns="http://www.w3.org/2000/svg" width="14" height="14" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-edit-2 font-medium-3 me-50"><path d="M17 3a2.828 2.828 0 1 1 4 4L7.5 20.5 2 22l1.5-5.5L17 3z"></path></svg><path d="M18 2h-3a5 5 0 0 0-5 5v3H7v4h3v8h4v-8h3l1-4h-4V7a1 1 0 0 1 1-1h3z"></path></svg></a></li>'
			                +'<li class="nav-item d-none d-lg-block"><a class="nav-link" onclick="deleteUser('+user_data+');" data-bs-toggle="tooltip" data-bs-placement="bottom" title="" data-bs-original-title="Chat" aria-label="Chat"><svg xmlns="http://www.w3.org/2000/svg" width="14" height="14" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-trash font-medium-3 me-50"><polyline points="3 6 5 6 21 6"></polyline><path d="M19 6v14a2 2 0 0 1-2 2H7a2 2 0 0 1-2-2V6m3 0V4a2 2 0 0 1 2-2h4a2 2 0 0 1 2 2v2"></path></svg><path d="M18 2h-3a5 5 0 0 0-5 5v3H7v4h3v8h4v-8h3l1-4h-4V7a1 1 0 0 1 1-1h3z"></path></svg></a></li>'
			                +' </ul></div>' */
			                '<div class="btn-group" role="group" aria-label="Basic example">'
			                +' <a href="javascript:void(0);"  onclick="getUser('+collect_data+');" class="btn bghover re-text btn-outline-primary waves-effect"><svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-edit"><path d="M11 4H4a2 2 0 0 0-2 2v14a2 2 0 0 0 2 2h14a2 2 0 0 0 2-2v-7"></path><path d="M18.5 2.5a2.121 2.121 0 0 1 3 3L12 15l-4 1 1-4 9.5-9.5z"></path></svg></a>'
                
/* 			                +' <a onclick="deleteUser('+user_data+');" class="btn bghover re-text btn-outline-primary waves-effect"><svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-trash-2"><polyline points="3 6 5 6 21 6"></polyline><path d="M19 6v14a2 2 0 0 1-2 2H7a2 2 0 0 1-2-2V6m3 0V4a2 2 0 0 1 2-2h4a2 2 0 0 1 2 2v2"></path><line x1="10" y1="11" x2="10" y2="17"></line><line x1="14" y1="11" x2="14" y2="17"></line></svg></a>'
 */             
			                +'</div>'
		            	return actions;
		            } },
		            { "mData": function(data,type,row){
                      if($.trim(data.stock_total_waste) == ''){ return '-'; }else{ return data.stock_total_waste ; }
		            } },
		         	{ "mData": function(data,type,row){
                      if($.trim(data.stock_dlf) == ''){ return '-'; }else{ return data.stock_dlf ; }
		            } },
		            { "mData": function(data,type,row){
	                      if($.trim(data.stock_lat) == ''){ return '-'; }else{ return data.stock_lat ; }
			        } },
			        { "mData": function(data,type,row){
	                      if($.trim(data.stock_incineration) == ''){ return '-'; }else{ return data.stock_incineration ; }
			        } },
		            { "mData": function(data,type,row){ 
		            	if($.trim(data.stock_afrf) == ''){ return '-'; }else{ return data.stock_afrf; }
		            } },
		         
		            { "mData": function(data,type,row){
		            	if($.trim(data.stock_total_waste_measure) == ''){ return '-'; }else{ return data.stock_total_waste_measure; } 
		            } }, 
		            { "mData": function(data,type,row){
		            	if($.trim(data.stock_dlf_measure) == ''){ return '-'; }else{ return data.stock_dlf_measure; } 
		            } },
		        	{ "mData": function(data,type,row){
		            	if($.trim(data.stock_lat_measure) == ''){ return '-'; }else{ return data.stock_lat_measure; }
		            } },
		            { "mData": function(data,type,row){
                      if($.trim(data.stock_incineration_measure) == ''){ return '-'; }else{ return data.stock_incineration_measure ; }
		            } },
		            { "mData": function(data,type,row){
	                      if($.trim(data.stock_afrf_measure) == ''){ return '-'; }else{ return data.stock_afrf_measure ; }
			            } },
			            
		         	{ "mData": function(data,type,row){
                      if($.trim(data.date) == ''){ return '-'; }else{ return data.date ; }
		            } },
		       
		            { "mData": function(data,type,row){ 
		            	if($.trim(data.site_name) == ''){ return '-'; }else{ return data.site_name; }
		            } }, 
		            { "mData": function(data,type,row){
		            	if($.trim(data.comments) == ''){ return '-'; }else{ return data.comments; } 
		            } }
		        ]
		    });
		 }else if(sbu_code == 'MSW' &&  department_code.trim() == 'process'){
				var headerContent = "<thead><tr ><th>S.No</th><th >Action</th><th>Total Waste</th><th>Total Rdf</th><th>Total Compost</th><th>Total Inerts</th><th>Total Recyclables</th><th>Quantity Measure Waste</th><th>Quantity Measure Rdf</th><th>Quantity Measure Compost</th><th>Quantity Measure Inerts</th><th>Quantity Measure Recyclables</th><th>Date</th><th>Site Name</th><th>Comments</th></tr></thead>";
				$('#datatable-collect thead').remove();
			    $('#datatable-collect').append(headerContent);
			    $("#datatable-collect")
				.DataTable(
						{
							"bProcessing" : true,
							"bServerSide" : true,
							"sort" : "position",
							//bStateSave variable you can use to save state on client cookies: set value "true" 
							"bStateSave" : false,
							 stateSave: true,
							 "fnStateSave": function (oSettings, oData) {
							 	localStorage.setItem('MRVCDataTables', JSON.stringify(oData));
							},
							 "fnStateLoad": function (oSettings) {
								return JSON.parse(localStorage.getItem('MRVCDataTables'));
							 },
							//Default: Page display length
							"iDisplayLength" : 10,
							"iData" : {
								"start" : 52
							},
							//We will use below variable to track page number on server side(For more information visit: http://legacy.datatables.net/usage/options#iDisplayStart)
							"iDisplayStart" : 0,
							"fnDrawCallback" : function() {
								//Get page numer on client. Please note: number start from 0 So
								//for the first page you will see 0 second page 1 third page 2...
								//Un-comment below alert to see page number
								//alert("Current page number: "+this.fnPagingInfo().iPage);
							},
							//"sDom": 'l<"toolbar">frtip',
							"initComplete" : function() {
							
							}
							,
							columnDefs : [ {
								"targets" : '',
								"orderable" : false,
							}
			                ],
							"sScrollX" : "100%",
							"sScrollXInner" : "100%",
							"ordering":false,
							"bScrollCollapse" : true,
							"language" : {
								"info" : "_START_ - _END_ of _TOTAL_",
								paginate : {
									next : '<i class="fa fa-angle-right"></i>', 
									previous : '<i class="fa fa-angle-left"></i>'  
								}
							},
							
							"bDestroy" : true,
							"sAjaxSource" : "	<%=request.getContextPath()%>/ajax/get-data-management-iris?"+myParams,
		        "aoColumns": [
		        	 { "mData": function(data,type,row){
                      if($.trim(data.sbu_code) == ''){ return '-'; }else{ return i++ ; }
		            } },
						{ "mData": function(data,type,row){
							var collect_data = "'"+data.id+"','"+data.sbu_code+"','"+data.quantity+"','"+data.date+"','"+data.comments+"'";
		                    var actions = /* ' <div class=""><ul class="nav navbar-nav bookmark-icons">'
			                +'<li class="nav-item d-none d-lg-block"><a class="nav-link" a href="javascript:void(0);"  onclick="getUser('+user_data+');" data-bs-toggle="tooltip" data-bs-placement="bottom" title="" data-bs-original-title="Email" aria-label="Email"><svg xmlns="http://www.w3.org/2000/svg" width="14" height="14" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-edit-2 font-medium-3 me-50"><path d="M17 3a2.828 2.828 0 1 1 4 4L7.5 20.5 2 22l1.5-5.5L17 3z"></path></svg><path d="M18 2h-3a5 5 0 0 0-5 5v3H7v4h3v8h4v-8h3l1-4h-4V7a1 1 0 0 1 1-1h3z"></path></svg></a></li>'
			                +'<li class="nav-item d-none d-lg-block"><a class="nav-link" onclick="deleteUser('+user_data+');" data-bs-toggle="tooltip" data-bs-placement="bottom" title="" data-bs-original-title="Chat" aria-label="Chat"><svg xmlns="http://www.w3.org/2000/svg" width="14" height="14" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-trash font-medium-3 me-50"><polyline points="3 6 5 6 21 6"></polyline><path d="M19 6v14a2 2 0 0 1-2 2H7a2 2 0 0 1-2-2V6m3 0V4a2 2 0 0 1 2-2h4a2 2 0 0 1 2 2v2"></path></svg><path d="M18 2h-3a5 5 0 0 0-5 5v3H7v4h3v8h4v-8h3l1-4h-4V7a1 1 0 0 1 1-1h3z"></path></svg></a></li>'
			                +' </ul></div>' */
			                '<div class="btn-group" role="group" aria-label="Basic example">'
			                +' <a href="javascript:void(0);"  onclick="getUser('+collect_data+');" class="btn bghover re-text btn-outline-primary waves-effect"><svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-edit"><path d="M11 4H4a2 2 0 0 0-2 2v14a2 2 0 0 0 2 2h14a2 2 0 0 0 2-2v-7"></path><path d="M18.5 2.5a2.121 2.121 0 0 1 3 3L12 15l-4 1 1-4 9.5-9.5z"></path></svg></a>'
                
/* 			                +' <a onclick="deleteUser('+user_data+');" class="btn bghover re-text btn-outline-primary waves-effect"><svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-trash-2"><polyline points="3 6 5 6 21 6"></polyline><path d="M19 6v14a2 2 0 0 1-2 2H7a2 2 0 0 1-2-2V6m3 0V4a2 2 0 0 1 2-2h4a2 2 0 0 1 2 2v2"></path><line x1="10" y1="11" x2="10" y2="17"></line><line x1="14" y1="11" x2="14" y2="17"></line></svg></a>'
 */             
			                +'</div>'
		            	return actions;
		            } },
		            { "mData": function(data,type,row){
                      if($.trim(data.total_waste) == ''){ return '-'; }else{ return data.total_waste ; }
		            } },
		         	{ "mData": function(data,type,row){
                      if($.trim(data.total_rdf) == ''){ return '-'; }else{ return data.total_rdf ; }
		            } },
		            { "mData": function(data,type,row){
	                      if($.trim(data.total_compost) == ''){ return '-'; }else{ return data.total_compost ; }
			        } },
			        { "mData": function(data,type,row){
	                      if($.trim(data.total_inerts) == ''){ return '-'; }else{ return data.total_inerts ; }
			        } },
		            { "mData": function(data,type,row){ 
		            	if($.trim(data.total_recylables) == ''){ return '-'; }else{ return data.total_recylables; }
		            } },
		         
		            { "mData": function(data,type,row){
		            	if($.trim(data.quantity_measure_waste) == ''){ return '-'; }else{ return data.quantity_measure_waste; } 
		            } }, 
		            { "mData": function(data,type,row){
		            	if($.trim(data.quantity_measure_rdf) == ''){ return '-'; }else{ return data.quantity_measure_rdf; } 
		            } },
		        	{ "mData": function(data,type,row){
		            	if($.trim(data.quantity_measure_compost) == ''){ return '-'; }else{ return data.quantity_measure_compost; }
		            } },
		            { "mData": function(data,type,row){
                      if($.trim(data.quantity_measure_inerts) == ''){ return '-'; }else{ return data.quantity_measure_inerts ; }
		            } },
		            { "mData": function(data,type,row){
	                      if($.trim(data.quantity_measure_recylabels) == ''){ return '-'; }else{ return data.quantity_measure_recylabels ; }
			        } },
		         	{ "mData": function(data,type,row){
                      if($.trim(data.date) == ''){ return '-'; }else{ return data.date ; }
		            } },
		       
		            { "mData": function(data,type,row){ 
		            	if($.trim(data.site_name) == ''){ return '-'; }else{ return data.site_name; }
		            } }, 
		            { "mData": function(data,type,row){
		            	if($.trim(data.comments) == ''){ return '-'; }else{ return data.comments; } 
		            } }
		        ]
		    });
		 }else{
			 var headerContent = '<thead><tr ><th class="text-center">No Data Available! </th></tr></thead>';
				$('#datatable-collect thead').remove();
			    $('#datatable-collect').append(headerContent);
		 }
		 
		 
		 
		
}

function getErrorMessage(jqXHR, exception) {
	    var msg = '';
	    if (jqXHR.status === 0) {
	        msg = 'Not connect.\n Verify Network.';
	    } else if (jqXHR.status == 404) {
	        msg = 'Requested page not found. [404]';
	    } else if (jqXHR.status == 500) {
	        msg = 'Internal Server Error [500].';
	    } else if (exception === 'parsererror') {
	        msg = 'Requested JSON parse failed.';
	    } else if (exception === 'timeout') {
	        msg = 'Time out error.';
	    } else if (exception === 'abort') {
	        msg = 'Ajax request aborted.';
	    } else {
	        msg = 'Uncaught Error.\n' + jqXHR.responseText;
	    }
	    console.log(msg);
}
		
		function getUser(id,name,sbu_code,email_id,mobile_number){
			$('#idVal').val(id);
			document.getElementById("getUser").submit();	
		}
    </script>
     <script async>
        var link = document.createElement( 'link' );
        link.href = 'https://cdnjs.cloudflare.com/ajax/libs/highlight.js/9.12.0/styles/atelier-cave-light.min.css';
        link.rel = 'stylesheet';document.getElementsByTagName( 'head' )[0].appendChild( link );
      </script>
      <script src="https://cdnjs.cloudflare.com/ajax/libs/highlight.js/9.12.0/highlight.min.js"></script>
      <script async>hljs.initHighlightingOnLoad();</script>
  
  


 </html>