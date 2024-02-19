<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<!--
Template Name: Vuexy - Vuejs, HTML & Laravel Admin Dashboard Template
Author: PixInvent
Website: http://www.pixinvent.com/
Contact: hello@pixinvent.com
Follow: www.twitter.com/pixinvents
Like: www.facebook.com/pixinvents
Purchase: https://1.envato.market/vuexy_admin
Renew Support: https://1.envato.market/vuexy_admin
License: You must have a valid license purchased only from themeforest(the above link) in order to legally use the theme for your project.

-->
<html class="loading" lang="en" data-textdirection="ltr">
  <!-- BEGIN: Head-->
  
<!-- Mirrored from pixinvent.com/demo/vuexy-html-bootstrap-admin-template/html/ltr/horizontal-menu-template/app-email.html by HTTrack Website Copier/3.x [XR&CO'2014], Sun, 07 Aug 2022 05:35:38 GMT -->
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width,initial-scale=1.0,user-scalable=0,minimal-ui">
    <meta name="description" content="Vuexy admin is super flexible, powerful, clean &amp; modern responsive bootstrap 4 admin template with unlimited possibilities.">
    <meta name="keywords" content="admin template, Vuexy admin template, dashboard template, flat admin template, responsive admin template, web app">
    <meta name="author" content="PIXINVENT">
    <title>User Management</title>
     <link rel="apple-touch-icon" href="/iris/resources/images/logo/logo.png">
    <link rel="shortcut icon" type="image/x-icon" href="/iris/resources/images/logo/logo.png">
    <link href="https://fonts.googleapis.com/css2?family=Montserrat:ital,wght@0,300;0,400;0,500;0,600;1,400;1,500;1,600" rel="stylesheet">

    <!-- BEGIN: Vendor CSS-->
      <link rel="stylesheet" type="text/css" href="/iris/resources/vendors/css/vendors.min.css">
    <link rel="stylesheet" type="text/css" href="/iris/resources/vendors/css/tables/datatable/dataTables.bootstrap5.min.css">
    <link rel="stylesheet" type="text/css" href="/iris/resources/vendors/css/tables/datatable/responsive.bootstrap5.min.css">
    <link rel="stylesheet" type="text/css" href="/iris/resources/vendors/css/tables/datatable/buttons.bootstrap5.min.css">
    <link rel="stylesheet" type="text/css" href="/iris/resources/vendors/css/tables/datatable/rowGroup.bootstrap5.min.css">
    <link rel="stylesheet" type="text/css" href="/iris/resources/vendors/css/pickers/pickadate/pickadate.css">
    <link rel="stylesheet" type="text/css" href="/iris/resources/vendors/css/pickers/flatpickr/flatpickr.min.css">
        <link rel="stylesheet" type="text/css" href="/iris/resources/vendors/css/extensions/toastr.min.css">
    <link rel="stylesheet" type="text/css" href="/iris/resources/css/plugins/extensions/ext-component-toastr.min.css">
    <!-- END: Vendor CSS-->
 <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css">
	  <link rel="stylesheet" href="<c:url value="/resources/css/font-awesome-v.4.7.css" />">
    <!-- BEGIN: Theme CSS-->
     <link rel="stylesheet" type="text/css" href="<c:url value="/resources/vendors/css/extensions/sweetalert2.min.css"/>">
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/plugins/extensions/ext-component-sweet-alerts.min.css"/>">
    
    <link rel="stylesheet" type="text/css" href="/iris/resources/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="/iris/resources/css/bootstrap-extended.min.css">
    <link rel="stylesheet" type="text/css" href="/iris/resources/css/colors.min.css">
    <link rel="stylesheet" type="text/css" href="/iris/resources/css/components.min.css">
    <link rel="stylesheet" type="text/css" href="/iris/resources/css/themes/dark-layout.min.css">
    <link rel="stylesheet" type="text/css" href="/iris/resources/css/themes/bordered-layout.min.css">
    <link rel="stylesheet" type="text/css" href="/iris/resources/css/themes/semi-dark-layout.min.css">
   <link rel="stylesheet" type="text/css" href="/iris/resources/vendors/css/forms/select/select2.min.css">
    <!-- BEGIN: Page CSS-->
    <link rel="stylesheet" type="text/css" href="/iris/resources/css/core/menu/menu-types/horizontal-menu.min.css">
        <link rel="stylesheet" type="text/css" href="/iris/resources/css/plugins/forms/pickers/form-flat-pickr.min.css">
    <link rel="stylesheet" type="text/css" href="/iris/resources/css/plugins/forms/pickers/form-pickadate.min.css">
    <!-- END: Page CSS-->

    <!-- BEGIN: Custom CSS-->

    <link rel="stylesheet" type="text/css" href="/iris/resources//css/themes/semi-dark-layout.min.css">

    <!-- BEGIN: Page CSS-->
    <link rel="stylesheet" type="text/css" href="/iris/resources//css/core/menu/menu-types/horizontal-menu.min.css">
    <link rel="stylesheet" type="text/css" href="/iris/resources//css/plugins/forms/form-quill-editor.min.css">
    <link rel="stylesheet" type="text/css" href="/iris/resources//css/plugins/extensions/ext-component-toastr.min.css">
    <link rel="stylesheet" type="text/css" href="/iris/resources//css/pages/app-email.min.css">
    <!-- END: Page CSS-->

    <!-- BEGIN: Custom CSS-->
    <link rel="stylesheet" type="text/css" href="/iris/resources/css/style.css">
    <!-- END: Custom CSS-->
<style>
.badge i, .badge svg {
    height: 28px!important;
    width: 28px;
    font-size: 12px;
    stroke-width: 3;
    vertical-align: top;
    color: black;
}
.select2-container--default .select2-selection--single {
    background-color: #fff;
    border: 1px solid #000!important;
    border-radius: 4px;
}
.list-group-item {
    position: relative;
    display: block;
    padding: 0.75rem 1.25rem;
    color: #000000;
    background-color: #FFF;
    border: 1px solid rgba(34,41,47,.125);
}
.form-check {
    padding-left: 0.785rem !important;
}
.mdl-grid{
	display: flex !important;
    padding: 4px;
    justify-content: space-between;
    height: 4.5rem;
} 
.dt-table{
height: 100%;
}
.modal-content {
 width: 85% !important;
}
.modal {
    width: 100% !important;
}
.required{
	color:red;
}
.right-btns .fa{
         	position:relative;
         	top:-35px;
         	right: 32px !important;
         }
         .right-btns .fa+.fa{
         	right: 18px !important;
         }
         
.my-error-class {
 	 color:red;
}
.my-valid-class {
 	 color:green;
}
.select2-container--default .select2-selection--single .select2-selection__arrow b {
     left: -25% !important;
    margin-top: 1p% !important;
}
body {
    font-family: var(--bs-body-font-family) !important;
}
.dark-layout h1, .dark-layout h2, .dark-layout h3, .dark-layout h4, .dark-layout h5, .dark-layout h6, .dark-layout span  {
    color: #D0D2D6;
}
.select2-container--classic .select2-selection--single .select2-selection__arrow b, .select2-container--default .select2-selection--single .select2-selection__arrow b {
    background-image: url(data:image/svg+xml,%3Csvg xmlns=\'http://www.w3.org/2000/svg\' viewBox=\'0 0 24 24\' fill=\'none\' stroke=\'%23d8d6de\' stroke-width=\'2\' stroke-linecap=\'round\' stroke-linejoin=\'round\' class=\'feather feather-chevron-down\'%3E%3Cpolyline points=\'6 9 12 15 18 9\'%3E%3C/polyline%3E%3C/svg%3E);
    background-size: 18px 14px,18px 14px !important;
    background-repeat: no-repeat !important;
    height: 1rem !important;
    padding-right: 1.5rem !important;
    margin-left: 0 !important;
    margin-top: 0 !important;
    left: -8px !important;
    border-style: none !important;
}
.select-wrapper{
display : none;
}
/* td {
    border: 1px solid #000;
} */

tr td:last-child {
    width: 1%;
    white-space: nowrap;
}
.page-loader{
		    background: #332e2ec2!important;
		    position: fixed;
		    width: 100%;
		    height: 100%;
		    top: 0;
		    left: 0;
		    z-index: 1000;
		}
::placeholder { /* Chrome, Firefox, Opera, Safari 10.1+ */
  color: black;
  opacity: 1; /* Firefox */
}
.menu-hide{
	display:none;
}
.show-icon{
	display:block;
}
.horizontal-layout.navbar-floating:not(.blank-page) .app-content {
      padding: calc(0rem + 1.57rem* 2 + 1.3rem) 0rem 0;
}
</style>
  </head>
  <!-- END: Head-->

  <!-- BEGIN: Body-->
  <body class="horizontal-layout horizontal-menu content-left-sidebar navbar-floating footer-static  " data-open="hover" data-menu="horizontal-menu" data-col="content-left-sidebar">

    <!-- BEGIN: Header-->
    <jsp:include page="../views/layout/header.jsp"></jsp:include>
    <!-- END: Header-->


    <!-- BEGIN: Main Menu-->
    <div class="horizontal-menu-wrapper">
    </div>
    <!-- END: Main Menu-->

    <!-- BEGIN: Content-->
    <div class="app-content content email-application">
      <div class="content-overlay"></div>
     <!--  <div class="header-navbar-shadow"></div> -->
      <div class="content-area-wrapper container-xxl p-0" style="
    height: 100%;
">
        <div class="sidebar-left">
          <div class="sidebar">
          <div class="sidebar-content email-app-sidebar" id="menuDiv">
  <div class="email-app-menu shadow-right">
  <div class="pricing-badge text-end p-2">
                <a
        type="button"
        class=" badge rounded-pill badge-light-primary"
        data-bs-backdrop="false"
        data-bs-toggle="modal"
        data-bs-target="#compose-mail" onclick="strinkMenu();"
      >
        <i data-feather='chevrons-left' class="menuList"></i>
        <i data-feather='align-justify' class="menu-hide showIcon"></i>
        
      </a>
              </div>
  
    <div class="sidebar-menu-list">
      <div class="list-group list-group-messages ">
        <a href="<%=request.getContextPath() %>/home" class="list-group-item list-group-item-action active bghover p-1  ">
        <svg class="MuiSvgIcon-root MuiSvgIcon-fontSizeMedium svglogo  css-vubbuv" focusable="false" aria-hidden="true" viewBox="0 0 24 24" data-testid="HomeOutlinedIcon"><path d="m12 5.69 5 4.5V18h-2v-6H9v6H7v-7.81l5-4.5M12 3 2 12h3v8h6v-6h2v6h6v-8h3L12 3z"></path></svg>
          <span class="align-middle menuList ">Home</span>
        </a>
         <a href="<%=request.getContextPath() %>/home" class="list-group-item list-group-item-action  bghover p-1  ">
        <svg class="MuiSvgIcon-root MuiSvgIcon-fontSizeMedium svglogo  css-vubbuv" focusable="false" aria-hidden="true" viewBox="0 0 24 24" data-testid="LocationOnOutlinedIcon"><path d="M12 2C8.13 2 5 5.13 5 9c0 5.25 7 13 7 13s7-7.75 7-13c0-3.87-3.13-7-7-7zM7 9c0-2.76 2.24-5 5-5s5 2.24 5 5c0 2.88-2.88 7.19-5 9.88C9.92 16.21 7 11.85 7 9z"></path><circle cx="12" cy="9" r="2.5"></circle></svg>
          <span class="align-middle menuList ">Site Management</span>
        </a>
         <a href="<%=request.getContextPath() %>/iris-usermanagement" class="list-group-item list-group-item-action  bghover p-1  ">
       <svg class="MuiSvgIcon-root MuiSvgIcon-fontSizeMedium svglogo css-vubbuv" focusable="false" aria-hidden="true" viewBox="0 0 24 24" data-testid="SupervisorAccountOutlinedIcon"><path d="M9 12c1.93 0 3.5-1.57 3.5-3.5S10.93 5 9 5 5.5 6.57 5.5 8.5 7.07 12 9 12zm0-5c.83 0 1.5.67 1.5 1.5S9.83 10 9 10s-1.5-.67-1.5-1.5S8.17 7 9 7zm.05 10H4.77c.99-.5 2.7-1 4.23-1 .11 0 .23.01.34.01.34-.73.93-1.33 1.64-1.81-.73-.13-1.42-.2-1.98-.2-2.34 0-7 1.17-7 3.5V19h7v-1.5c0-.17.02-.34.05-.5zm7.45-2.5c-1.84 0-5.5 1.01-5.5 3V19h11v-1.5c0-1.99-3.66-3-5.5-3zm1.21-1.82c.76-.43 1.29-1.24 1.29-2.18C19 9.12 17.88 8 16.5 8S14 9.12 14 10.5c0 .94.53 1.75 1.29 2.18.36.2.77.32 1.21.32s.85-.12 1.21-.32z"></path></svg>
          <span class="align-middle menuList ">User Management</span>
        </a>
         <a href="<%=request.getContextPath() %>/home" class="list-group-item list-group-item-action  bghover p-1  ">
     <svg class="MuiSvgIcon-root MuiSvgIcon-fontSizeMedium svglogo css-vubbuv" focusable="false" aria-hidden="true" viewBox="0 0 24 24" data-testid="InsertChartOutlinedOutlinedIcon"><path d="M9 17H7v-7h2v7zm4 0h-2V7h2v10zm4 0h-2v-4h2v4zm2 2H5V5h14v14zm0-16H5c-1.1 0-2 .9-2 2v14c0 1.1.9 2 2 2h14c1.1 0 2-.9 2-2V5c0-1.1-.9-2-2-2z"></path></svg>
          <span class="align-middle menuList ">Data Management</span>
        </a>
         <a href="<%=request.getContextPath() %>/home" class="list-group-item list-group-item-action  bghover p-1  ">
         <svg class="MuiSvgIcon-root MuiSvgIcon-fontSizeMedium svglogo css-vubbuv" focusable="false" aria-hidden="true" viewBox="0 0 24 24" data-testid="VisibilityOutlinedIcon"><path d="M12 6c3.79 0 7.17 2.13 8.82 5.5C19.17 14.87 15.79 17 12 17s-7.17-2.13-8.82-5.5C4.83 8.13 8.21 6 12 6m0-2C7 4 2.73 7.11 1 11.5 2.73 15.89 7 19 12 19s9.27-3.11 11-7.5C21.27 7.11 17 4 12 4zm0 5c1.38 0 2.5 1.12 2.5 2.5S13.38 14 12 14s-2.5-1.12-2.5-2.5S10.62 9 12 9m0-2c-2.48 0-4.5 2.02-4.5 4.5S9.52 16 12 16s4.5-2.02 4.5-4.5S14.48 7 12 7z"></path></svg>
          <span class="align-middle menuList ">Product Catalogue</span>
        </a>
         <a href="<%=request.getContextPath() %>/home" class="list-group-item list-group-item-action  bghover p-1  ">
        <svg class="MuiSvgIcon-root MuiSvgIcon-fontSizeMedium svglogo css-vubbuv" focusable="false" aria-hidden="true" viewBox="0 0 24 24" data-testid="DesignServicesOutlinedIcon"><path d="M20.97 7.27c.39-.39.39-1.02 0-1.41l-2.83-2.83a.9959.9959 0 0 0-1.41 0l-4.49 4.49-3.89-3.89c-.78-.78-2.05-.78-2.83 0l-1.9 1.9c-.78.78-.78 2.05 0 2.83l3.89 3.89L3 16.76V21h4.24l4.52-4.52 3.89 3.89c.95.95 2.23.6 2.83 0l1.9-1.9c.78-.78.78-2.05 0-2.83l-3.89-3.89 4.48-4.48zM5.04 6.94l1.89-1.9L8.2 6.31 7.02 7.5l1.41 1.41 1.19-1.19 1.2 1.2-1.9 1.9-3.88-3.88zm11.23 7.44-1.19 1.19 1.41 1.41 1.19-1.19 1.27 1.27-1.9 1.9-3.89-3.89 1.9-1.9 1.21 1.21zM6.41 19H5v-1.41l9.61-9.61 1.3 1.3.11.11L6.41 19zm9.61-12.44 1.41-1.41 1.41 1.41-1.41 1.41-1.41-1.41z"></path></svg>
          <span class="align-middle menuList ">Management Dashboard</span>
        </a>
      
         <a href="<%=request.getContextPath() %>/home" class="list-group-item list-group-item-action bghover p-1 ">
        <svg class="MuiSvgIcon-root MuiSvgIcon-fontSizeMedium svglogo css-vubbuv" focusable="false" aria-hidden="true" viewBox="0 0 24 24" data-testid="HelpOutlineOutlinedIcon"><path d="M11 18h2v-2h-2v2zm1-16C6.48 2 2 6.48 2 12s4.48 10 10 10 10-4.48 10-10S17.52 2 12 2zm0 18c-4.41 0-8-3.59-8-8s3.59-8 8-8 8 3.59 8 8-3.59 8-8 8zm0-14c-2.21 0-4 1.79-4 4h2c0-1.1.9-2 2-2s2 .9 2 2c0 2-3 1.75-3 5h2c0-2.25 3-2.5 3-5 0-2.21-1.79-4-4-4z"></path></svg>
          <span class="align-middle menuList ">Help Center</span>
        </a>
         <a href="<%=request.getContextPath() %>/home" class="list-group-item list-group-item-action  bghover p-1  ">
         <svg class="MuiSvgIcon-root MuiSvgIcon-fontSizeMedium svglogo css-vubbuv" focusable="false" aria-hidden="true" viewBox="0 0 24 24" data-testid="NotificationsNoneOutlinedIcon"><path d="M12 22c1.1 0 2-.9 2-2h-4c0 1.1.9 2 2 2zm6-6v-5c0-3.07-1.63-5.64-4.5-6.32V4c0-.83-.67-1.5-1.5-1.5s-1.5.67-1.5 1.5v.68C7.64 5.36 6 7.92 6 11v5l-2 2v1h16v-1l-2-2zm-2 1H8v-6c0-2.48 1.51-4.5 4-4.5s4 2.02 4 4.5v6z"></path></svg>
          <span class="align-middle menuList ">Reminder</span>
        </a>
        
      </div>
   
    </div>
  </div>
</div>

          </div>
        </div>
        <div class="content-right">
          <div class="content-wrapper container-xxl p-0">
            <div class="content-header row">
									            <div class="sidebar-toggle d-block d-lg-none ms-1">
											      <svg xmlns="http://www.w3.org/2000/svg" width="14" height="14" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-menu font-medium-5"><line x1="3" y1="12" x2="21" y2="12"></line><line x1="3" y1="6" x2="21" y2="6"></line><line x1="3" y1="18" x2="21" y2="18"></line></svg>
											    </div>
            </div>
            <div class="content-body"><div class="body-content-overlay"></div>
            
            
           <div class="card-body" id="filterDiv">
          <div class="row">
          
          <div class="col-xl-2 col-md-6 col-12" style="
    padding-right: calc(var(--bs-gutter-x) * 0);
" >
           <div class="mb-1">
              <label class="form-label" for="select2-basic">Department</label>
              <div class="position-relative" ><select class="select2 form-select select2-hidden-accessible" id="Department" data-select2-id="select2-basic1" tabindex="1" aria-hidden="true">
                <option value="" >Select Department</option>
                <option value="HI" >Hawaii</option>
                <option value="CA" >California</option>
              </select>
              </div></div>
            </div>
            <div class="col-xl-2 col-md-6 col-12" style="
    padding-right: calc(var(--bs-gutter-x) * 0);
">
             <div class="mb-1">
              <label class="form-label" for="select2-basic">Site</label>
              <div class="position-relative" ><select class="select2 form-select select2-hidden-accessible" id="Site" data-select2-id="select2-basic0" tabindex="-1" aria-hidden="true">
               <option value="" >Select Site</option>
                <option value="LA" >Louisiana</option>
                <option value="MN" >Minnesota</option>
              </select></div>
            </div>
            </div>
             <div class="col-xl-2 col-md-6 col-12" style="
    padding-right: calc(var(--bs-gutter-x) * 0);
">
             <div class="mb-1">
              <label class="form-label" for="select2-basic">Role</label>
              <div class="position-relative" ><select class="select2 form-select select2-hidden-accessible" id="role" data-select2-id="select2-basic" tabindex="0" aria-hidden="true">
               <option value="" >Select Role</option>
                <option value="LA" >Louisiana</option>
                <option value="MN" >Minnesota</option>
              </select></div>
            </div>
            </div>
            <div class="re-text col-xl-4 col-md-3 col-3">
             <div class="demo-inline-spacing">
            <a type="button" class="btn btn-gradient-danger re-text-bg">Filter <i data-feather='search'></i></a>
           <a type="button" href="<%=request.getContextPath() %>/iris-usermanagement" class="btn btn-gradient-danger re-text-bg">Refresh <i data-feather='refresh-ccw'></i></a> 
          
          </div>
            </div>
             <div class="re-text col-xl-2 col-md-3 col-3 mt-2">
               <a type="button" class="btn btn-gradient-danger re-text-bg">Export <i data-feather='download-cloud'></i>  </a>
             </div>
          </div>
        </div> 
            <br>
<div class="col-12 p-2" id="bigDiv">

      <div class="card">
								<div >
									<div class="card-header border-bottom p-1">
										<div class="head-label">
											<h6 class="mb-0"><svg class="MuiSvgIcon-root MuiSvgIcon-fontSizeMedium svglogo css-vubbuv" focusable="false" aria-hidden="true" viewBox="0 0 24 24" data-testid="SupervisorAccountOutlinedIcon"><path d="M9 12c1.93 0 3.5-1.57 3.5-3.5S10.93 5 9 5 5.5 6.57 5.5 8.5 7.07 12 9 12zm0-5c.83 0 1.5.67 1.5 1.5S9.83 10 9 10s-1.5-.67-1.5-1.5S8.17 7 9 7zm.05 10H4.77c.99-.5 2.7-1 4.23-1 .11 0 .23.01.34.01.34-.73.93-1.33 1.64-1.81-.73-.13-1.42-.2-1.98-.2-2.34 0-7 1.17-7 3.5V19h7v-1.5c0-.17.02-.34.05-.5zm7.45-2.5c-1.84 0-5.5 1.01-5.5 3V19h11v-1.5c0-1.99-3.66-3-5.5-3zm1.21-1.82c.76-.43 1.29-1.24 1.29-2.18C19 9.12 17.88 8 16.5 8S14 9.12 14 10.5c0 .94.53 1.75 1.29 2.18.36.2.77.32 1.21.32s.85-.12 1.21-.32z"></path></svg> Users</h6>
										</div>
										<div>
											<div class="dt-buttons d-inline-flex">
												  <a href="<%=request.getContextPath() %>/iris-adduser" type="button" class="btn btn-gradient-danger re-text-bg">Add New User</a>
												  <a type="button" class="btn btn-gradient-danger re-text-bg">Add New Role</a>
											</div>
										</div>
									</div>
									 <table id="datatable-user" class="invoice-list-table table">
								            <thead>
								              <tr>
								                <th >#</th>
												<th >Actions</th>
												<th >Name</th>
												<th >Email</th>
												<th >Mobile</th>
												<th >Department</th>
												<th >Categories</th>
												<th >Roles</th>
												<th >Site Name</th>
			              </tr>
			            </thead>
			          </table>
								</div>
							</div>
    </div>


            </div>
          </div>
        </div>
      </div>
    </div>
    <!-- END: Content-->


    <!-- BEGIN: Customizer-->
    <!-- End: Customizer-->

    <!-- Buynow Button-->
    <div class="sidenav-overlay"></div>
    <div class="drag-target"></div>

    <!-- BEGIN: Footer-->
   <footer class="footer footer-static footer-light">
      <p class="clearfix mb-0"><span class="float-md-start d-block d-md-inline-block mt-25">COPYRIGHT  &copy;  <span id="currentYear"></span> ,| Powered by<a class="ms-25" href="https://ramkyenviroengineers.com/" target="_blank">Re Sustainability Limited</a><span class="d-none d-sm-inline-block"> . All Rights Reserved.</span></span></p>
    </footer>
    <button class="btn btn-primary btn-icon scroll-top" type="button"><i data-feather="arrow-up"></i></button>
    <!-- END: Footer-->
    <script src="<c:url value="/resources/js/jQuery-v.3.5.min.js"  />"></script>
    <script src="/iris/resources/vendors/js/vendors.min.js"></script>
    <!-- BEGIN Vendor JS-->

    <!-- BEGIN: Page Vendor JS-->
    <script src="/iris/resources/vendors/js/ui/jquery.sticky.js"></script>
    <script src="/iris/resources/vendors/js/forms/select/select2.full.min.js"></script>
    <script src="/iris/resources/vendors/js/charts/apexcharts.min.js"></script>
    <script src="/iris/resources/vendors/js/extensions/toastr.min.js"></script>
    <script src="/iris/resources/vendors/js/extensions/moment.min.js"></script>
    <script src="/iris/resources/vendors/js/tables/datatable/jquery.dataTables.min.js"></script>
    <script src="/iris/resources/vendors/js/tables/datatable/datatables.buttons.min.js"></script>
    <script src="/iris/resources/vendors/js/tables/datatable/dataTables.bootstrap5.min.js"></script>
    <script src="/iris/resources/vendors/js/tables/datatable/dataTables.responsive.min.js"></script>
    <script src="/iris/resources/vendors/js/tables/datatable/responsive.bootstrap5.js"></script>
    <!-- END: Page Vendor JS-->
 <script src="/iris/resources/js/materialize-v.1.0.min.js "  ></script>
    <script src="/iris/resources/js/jquery-validation-1.19.1.min.js"  ></script>
    <script src="/iris/resources/js/jquery.dataTables-v.1.10.min.js"  ></script>
     <script src="/iris/resources/js/datetime-moment-v1.10.12.js"  ></script>
         <script src="/iris/resources/js/dataTables.material.min.js"  ></script>
      <script src="/iris/resources/js/moment-v2.8.4.min.js"  ></script>
    <!-- BEGIN: Theme JS-->
    <script src="/iris/resources/js/core/app-menu.min.js"></script>
    <script src="/iris/resources/js/core/app.min.js"></script>
    <script src="/iris/resources/js/scripts/customizer.min.js"></script>
     <script src="/iris/resources/js/scripts/forms/form-select2.min.js"></script>
    <!-- END: Theme JS-->
   <script src="/iris/resources/js/scripts/pages/modal-add-new-cc.min.js"></script>
    <script src="/iris/resources/js/scripts/pages/page-pricing.min.js"></script>
    <script src="/iris/resources/js/scripts/pages/modal-add-new-address.min.js"></script>
    <script src="/iris/resources/js/scripts/pages/modal-create-app.min.js"></script>
    <script src="/iris/resources/js/scripts/pages/modal-two-factor-auth.min.js"></script>
    <script src="/iris/resources/js/scripts/pages/modal-edit-user.min.js"></script>
    <script src="/iris/resources/js/scripts/pages/modal-share-project.min.js"></script>
    <!-- BEGIN: Page JS-->
     <script src="/iris/resources/js/scripts/pages/dashboard-analytics.min.js"></script>
    <script src="/iris/resources/js/scripts/pages/app-invoice-list.min.js"></script>
    
        <script src="/iris/resources/vendors/js/pickers/pickadate/picker.js"></script>
    <script src="/iris/resources/vendors/js/pickers/pickadate/picker.date.js"></script>
    <script src="/iris/resources/vendors/js/pickers/pickadate/picker.time.js"></script>
    <script src="/iris/resources/vendors/js/pickers/pickadate/legacy.js"></script>
    <script src="/iris/resources/vendors/js/pickers/flatpickr/flatpickr.min.js"></script>
     <script src="/iris/resources/js/scripts/forms/pickers/form-pickers.min.js"></script>
     <script src="/iris/resources/js/scripts/extensions/ext-component-blockui.js"></script>
      <script src="/iris/resources/js/scripts/pages/dashboard-ecommerce.min.js"></script>
        <script src="/iris/resources/js/scripts/components/components-popovers.min.js"></script>
    <!-- END: Page JS-->

    <script>
    $(document).ready(function () {
  	 // $('select:not(.searchable)').formSelect();
      //  $('.searchable').select2();
        getUserList();
      
     
  });
	 $(window).on('load',  function(){
        if (feather) {
          feather.replace({ width: 14, height: 14 });
        }
      })
       document.getElementById("currentYear").innerHTML = new Date().getFullYear();

	 function strinkMenu(){ 
		 var menuWidth = $("#menuDiv").width();
		 if(menuWidth == '260'){
			 $(".menuList").fadeIn("slow", function() {
		            $(this).addClass("menu-hide");
		        });
			 $(".showIcon").removeClass('menu-hide');
			 $('#menuDiv').animate({
			        width: "6rem" // New width you want to animate to
			    }, 200); 
			 $('#bigDiv').animate({
			        width: "90rem" // New width you want to animate to
			    }, 200); ''
			 $('#filterDiv').animate({
			        width: "97rem" // New width you want to animate to
			    }, 200); ''
			    
			 
		 }else{
			 $(".showIcon").addClass('menu-hide');
			 $(".menuList").removeClass('menu-hide');
			 $('#menuDiv').animate({
			        width: "260px" // New width you want to animate to
			    }, 200);
			 $('#bigDiv').animate({
			        width: "78rem" // New width you want to animate to
			    }, 200); ''
			 $('#filterDiv').animate({
			        width: "82rem" // New width you want to animate to
			    }, 200); ''
		 }
		 
		
	}
	 
	 function getUserList() {
	 		//getDesignationFilterList('');
	 		var designation = $("#designation_filter").val();
	 		
	 	   	table = $('#datatable-user').DataTable();
	 		table.destroy();
	 		var i = 1;
	 		$.fn.dataTable.moment('DD-MMM-YYYY');
	 		var rowLen = 0;
	 		var myParams =  "designation="
	 				+ designation ;

	 		/***************************************************************************************************/

	 		$("#datatable-user")
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
	 							var cou = $('#datatable-user tbody tr:visible').length
	 							 $('#count').text(cou);
	 							},
	 							//"sDom": 'l<"toolbar">frtip',
	 							"initComplete" : function() {
	 								$('.dataTables_filter input[type="search"] ')
	 										.attr('placeholder', 'Search')
	 										.css({
	 											'width' : '350px ',
	 											'display' : 'inline-block'
	 										});

	 								var input = $('.dataTables_filter input ')
	 										.unbind()
	 										.bind('keyup',function(e){
	 										    if (e.which == 0){
	 										    	self.search(input.val());
	 										    }
	 										}), self = this.api(), $searchButton = $(
	 										'<i class="fa fa-search" title="Go" >')
	 								//.text('Go')
	 								.click(function() {
	 									self.search(input.val()).draw();
	 								}), $clearButton = $(
	 										'<i class="fa fa-close" title="Reset">')
	 								//.text('X')
	 								.click(function() {
	 									input.val('');
	 									$searchButton.click();
	 								})
	 								$('.dataTables_filter').append(
	 										'<div class="right-btns"></div>');
	 								$('.dataTables_filter div').append(
	 										$searchButton, $clearButton);
	 								rowLen = $('#datatable-user tbody tr:visible').length
	 							
	 								/* var input = $('.dataTables_filter input').unbind(),
	 								self = this.api(),
	 								$searchButton = $('<i class="fa fa-search">')
	 								           //.text('Go')
	 								           .click(function() {			   	                    	 
	 								              self.search(input.val()).draw();
	 								           })			   	        
	 								  $('.dataTables_filter label').append($searchButton); */
	 							}
	 							,
	 							columnDefs : [ {
	 								"targets" : 'no-sort',
	 								"orderable" : false,
	 							},{targets:[2,3,4],
	 			                       className: 'hideCOl td-align-right'},{ targets: [0], className: 'no-sort'  }
	 			                       ,{ targets: [1], className: 'td-align-center'  }
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
	 							"sAjaxSource" : "	<%=request.getContextPath()%>/ajax/get-users-iris?"+myParams,
	 		        "aoColumns": [
	 		        	 { "mData": function(data,type,row){
	                         if($.trim(data.user_name) == ''){ return '-'; }else{ return i++ ; }
	  		            } },
							{ "mData": function(data,type,row){
	 		         		
	 		         		var user_data = "'"+data.user_id+"','"+data.user_name+"','"+data.designation+"','"+data.email+"','"+data.mobile_number+"'";
	 	                    var actions = '<a href="javascript:void(0);"  onclick="getUser('+user_data+');" class="btn waves-effect waves-light bg-m t-c mob-btn" ><i class="fa fa-pencil"></i></a>'
	 	                    +'<a onclick="deleteUser('+user_data+');" class="btn waves-effect waves-light bg-s t-c "><i class="fa fa-trash"></i></a>';
	 	                    
	 		            	return actions;
	 		            } },
	 		            { "mData": function(data,type,row){
	                         if($.trim(data.user_name) == ''){ return '-'; }else{ return data.user_name ; }
	  		            } },
	  		         	{ "mData": function(data,type,row){
	                         if($.trim(data.email_id) == ''){ return '-'; }else{ return data.email_id ; }
	  		            } },
	  		       
	 		            { "mData": function(data,type,row){ 
	 		            	if($.trim(data.mobile_number) == ''){ return '-'; }else{ return data.mobile_number; }
	 		            } },
	 		         	{ "mData": function(data,type,row){
	 		            	if($.trim(data.sbu) == ''){ return '-'; }else{ return data.sbu; }
	 		            } },
	 		            { "mData": function(data,type,row){
	 		            	if($.trim(data.categories) == ''){ return '-'; }else{ return data.categories; } 
	 		            } },
	 		           { "mData": function(data,type,row){
	 		            	if($.trim(data.roles) == ''){ return '-'; }else{ return data.roles; } 
	 		            } },
	 		           { "mData": function(data,type,row){
	 		            	if($.trim(data.site_name) == ''){ return '-'; }else{ return data.site_name; } 
	 		            } }
	 		        ]
	 		    });
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
    </script>
     <script async>
        var link = document.createElement( 'link' );
        link.href = 'https://cdnjs.cloudflare.com/ajax/libs/highlight.js/9.12.0/styles/atelier-cave-light.min.css';
        link.rel = 'stylesheet';document.getElementsByTagName( 'head' )[0].appendChild( link );
      </script>
      <script src="https://cdnjs.cloudflare.com/ajax/libs/highlight.js/9.12.0/highlight.min.js"></script>
      <script async>hljs.initHighlightingOnLoad();</script>
   
  </body>


<!-- Mirrored from pixinvent.com/demo/vuexy-html-bootstrap-admin-template/html/ltr/horizontal-menu-template/app-email.html by HTTrack Website Copier/3.x [XR&CO'2014], Sun, 07 Aug 2022 05:35:41 GMT -->
</html>