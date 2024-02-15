
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
    <title>Email Application - Vuexy - Bootstrap HTML admin template</title>
    <link rel="apple-touch-icon" href="/iris/resources//images/ico/apple-icon-120.html">
    <link rel="shortcut icon" type="image/x-icon" href="https://pixinvent.com/demo/vuexy-html-bootstrap-admin-template/app-assets/images/ico/favicon.ico">
    <link href="https://fonts.googleapis.com/css2?family=Montserrat:ital,wght@0,300;0,400;0,500;0,600;1,400;1,500;1,600" rel="stylesheet">

    <!-- BEGIN: Vendor CSS-->
    <link rel="stylesheet" type="text/css" href="/iris/resources//vendors/css/vendors.min.css">
    <link rel="stylesheet" type="text/css" href="/iris/resources//vendors/css/editors/quill/katex.min.css">
    <link rel="stylesheet" type="text/css" href="/iris/resources//vendors/css/editors/quill/monokai-sublime.min.css">
    <link rel="stylesheet" type="text/css" href="/iris/resources//vendors/css/editors/quill/quill.snow.css">
    <link rel="stylesheet" type="text/css" href="/iris/resources//vendors/css/extensions/toastr.min.css">
    <link rel="stylesheet" type="text/css" href="/iris/resources//vendors/css/forms/select/select2.min.css">
    <link rel="preconnect" href="https://fonts.gstatic.com/">
    <link rel="stylesheet" type="text/css" href="https://fonts.googleapis.com/css2?family=Inconsolata&amp;family=Roboto+Slab&amp;family=Slabo+27px&amp;family=Sofia&amp;family=Ubuntu+Mono&amp;display=swap">
    <!-- END: Vendor CSS-->

    <!-- BEGIN: Theme CSS-->
    <link rel="stylesheet" type="text/css" href="/iris/resources//css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="/iris/resources//css/bootstrap-extended.min.css">
    <link rel="stylesheet" type="text/css" href="/iris/resources//css/colors.min.css">
    <link rel="stylesheet" type="text/css" href="/iris/resources//css/components.min.css">
    <link rel="stylesheet" type="text/css" href="/iris/resources//css/themes/dark-layout.min.css">
    <link rel="stylesheet" type="text/css" href="/iris/resources//css/themes/bordered-layout.min.css">
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

.horizontal-layout.navbar-floating:not(.blank-page) .app-content {
    padding: calc(0rem + 2.45rem* 2 + 1.3rem) 2rem 0;
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
      <div class="content-area-wrapper container-xxl p-0">
        <div class="sidebar-left">
          <div class="sidebar">
          <div class="sidebar-content email-app-sidebar" id="menuDiv">
  <div class="email-app-menu">
    <div class="form-group-compose text-center compose-btn">
      <a
        type="button"
        class="compose-email btn btn-primary w-20"
        data-bs-backdrop="false"
        data-bs-toggle="modal"
        data-bs-target="#compose-mail" onclick="strinkMenu();"
      >
        <span id="changeIcon"><i data-feather='align-justify'></i></span>
      </a>
    </div>
    <div class="sidebar-menu-list">
      <div class="list-group list-group-messages">
        <a href="<%=request.getContextPath() %>/home" class="list-group-item list-group-item-action active">
         <i data-feather='home'></i>
          <span class="align-middle menu-hide">Home</span>
        </a>
      </div>
      <!-- <hr /> -->
    </div>
  </div>
</div>

          </div>
        </div>
        <div class="content-right">
          <div class="content-wrapper container-xxl p-0">
            <div class="content-header row">
            </div>
            <div class="content-body"><div class="body-content-overlay"></div>
<!-- Email list Area -->
<div class="email-app-list">
  <!-- Email search starts -->
  <!-- Email search ends -->

  <!-- Email actions starts -->
  <!-- Email actions ends -->

  <!-- Email list starts -->
  <div class="email-user-list">
    <ul class="email-media-list">

    </ul>
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


    <!-- BEGIN: Vendor JS-->
    <script src="/iris/resources//vendors/js/vendors.min.js"></script>
    <!-- BEGIN Vendor JS-->

    <!-- BEGIN: Page Vendor JS-->
    <script src="/iris/resources//vendors/js/ui/jquery.sticky.js"></script>
    <script src="/iris/resources//vendors/js/editors/quill/katex.min.js"></script>
    <script src="/iris/resources//vendors/js/editors/quill/highlight.min.js"></script>
    <script src="/iris/resources//vendors/js/editors/quill/quill.min.js"></script>
    <script src="/iris/resources//vendors/js/extensions/toastr.min.js"></script>
    <script src="/iris/resources//vendors/js/forms/select/select2.full.min.js"></script>
    <!-- END: Page Vendor JS-->

    <!-- BEGIN: Theme JS-->
    <script src="/iris/resources//js/core/app-menu.min.js"></script>
    <script src="/iris/resources//js/core/app.min.js"></script>
    <script src="/iris/resources//js/scripts/customizer.min.js"></script>
    <!-- END: Theme JS-->

    <!-- BEGIN: Page JS-->
    <script src="/iris/resources//js/scripts/pages/app-email.min.js"></script>
    <!-- END: Page JS-->

    <script>
	 $(window).on('load',  function(){
    	
        if (feather) {
          feather.replace({ width: 14, height: 14 });
        }
      })
       document.getElementById("currentYear").innerHTML = new Date().getFullYear();

	 function strinkMenu(){
		 var menuWidth = $("#menuDiv").width();
		 if(menuWidth == '260'){
			 $('#menuDiv').animate({
			        width: "6rem" // New width you want to animate to
			    }, 1000);
			var selectElement = "<i data-feather='align-right'></i>"
				 $('#changeIcon i').attr("data-feather", "align-justify");.
		 }else{
			 $('#menuDiv').animate({
			        width: "260px" // New width you want to animate to
			    }, 1000);
			 var selectElement = "<i data-feather='align-left'></i>"
				 $('#changeIcon i').attr("data-feather", "align-left");
		 }
		 
		 

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
  <!-- END: Body-->

<!-- Mirrored from pixinvent.com/demo/vuexy-html-bootstrap-admin-template/html/ltr/horizontal-menu-template/app-email.html by HTTrack Website Copier/3.x [XR&CO'2014], Sun, 07 Aug 2022 05:35:41 GMT -->
</html>