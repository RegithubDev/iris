<!DOCTYPE html>
<html class="loading" lang="en" data-textdirection="ltr">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width,initial-scale=1.0,user-scalable=0,minimal-ui">
    <meta name="description" content="Vuexy admin is super flexible, powerful, clean &amp; modern responsive bootstrap 4 admin template with unlimited possibilities.">
    <meta name="keywords" content="admin template, Vuexy admin template, dashboard template, flat admin template, responsive admin template, web app">
    <meta name="author" content="PIXINVENT">
    <title>Login Page - IRIS </title>
    <link rel="apple-touch-icon" href="/iris/resources/images/logo/logo.png">
    <link rel="shortcut icon" type="image/x-icon" href="/iris/resources/images/logo/logo.png">
    <link href="https://fonts.googleapis.com/css2?family=Montserrat:ital,wght@0,300;0,400;0,500;0,600;1,400;1,500;1,600" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="/iris/resources/vendors/css/vendors.min.css">
    <link rel="stylesheet" type="text/css" href="/iris/resources/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="/iris/resources/css/bootstrap-extended.min.css">
    <link rel="stylesheet" type="text/css" href="/iris/resources/css/colors.min.css">
    <link rel="stylesheet" type="text/css" href="/iris/resources/css/components.min.css">
    <link rel="stylesheet" type="text/css" href="/iris/resources/css/themes/dark-layout.min.css">
    <link rel="stylesheet" type="text/css" href="/iris/resources/css/themes/bordered-layout.min.css">
    <link rel="stylesheet" type="text/css" href="/iris/resources/css/themes/semi-dark-layout.min.css">
    <link rel="stylesheet" type="text/css" href="/iris/resources/css/core/menu/menu-types/horizontal-menu.min.css">
    <link rel="stylesheet" type="text/css" href="/iris/resources/css/plugins/forms/form-validation.css">
    <link rel="stylesheet" type="text/css" href="/iris/resources/css/pages/authentication.css">
    <link rel="stylesheet" type="text/css" href="/iris/resources//css/style.css">
<style>

@media screen and (max-width: 601px)  {
    .logo {
       width: 19rem!important;
       margin-left: 4rem!important;
    }

}
@media screen and (min-width: 601px) and (max-width: 1024px) {
    .logo {
       width: 8rem!important;
    }

}
input:-webkit-autofill, input:-webkit-autofill:hover, input:-webkit-autofill:focus, input:-webkit-autofill:active {
    animation: input_background_autofill 0s forwards;
    -webkit-text-fill-color: black !important;
}

.img-fluid-1{
	max-width: 56%;
    height: auto;
}
</style>
  </head>
  <!-- END: Head-->

  <!-- BEGIN: Body-->
  <body class="horizontal-layout horizontal-menu blank-page navbar-floating footer-static  " data-open="hover" data-menu="horizontal-menu" data-col="blank-page">
    <!-- BEGIN: Content-->
    <div class="app-content content ">
      <div class="content-overlay"></div>
      <div class="header-navbar-shadow"></div>
      <div class="content-wrapper">
        <div class="content-header row">
        </div>
        <div class="content-body">
          <div class="auth-wrapper auth-cover">
            <div class="auth-inner row m-0">
              <!-- Brand logo--><a class="brand-logo " href="#">
         			<img src="/iris/resources/images/logo/logo.png" class="logo" style="
    width: 8rem;
">
                </a>
              <!-- /Brand logo-->
              <!-- Left Text-->
              <div class="d-none d-lg-flex col-lg-7 align-items-center p-5" style="
    background-color: white;
">
                <div class="w-100 d-lg-flex align-items-center justify-content-center px-5"><img class="img-fluid-1" src="/iris/resources/images/banner/newbanner.png" alt="Login V2"/></div>
              </div>
              <!-- /Left Text-->
              <!-- Login-->
              <div class="d-flex col-lg-5 align-items-center auth-bg px-2 p-lg-8" >
                <div class=" card p-4 col-12 col-sm-8 col-md-6 col-lg-8 px-xl-2 mx-auto">
                  <h1 class="bold re-text fw-bolder">Sign In</h1>
                  <p class="card-text mb-2">Please sign-in to your account and start the adventure</p>
                  <form class="auth-login-form mt-2" id="loginForm" name="loginForm" action="<%=request.getContextPath() %>/login" method="POST">
                    <div class="mb-1">
                      <label class="form-label" for="emp_name">User Name</label>
                      <input class="form-control" id="emp_name" type="text" name="emp_name" placeholder="Emp Code/Emp Name" aria-describedby="emp_name" autofocus="" tabindex="1"/>
                    </div>
                    <div class="mb-1">
                      <div class="d-flex justify-content-between">
                        <label class="form-label" for="login-password">Password</label><a href="<%=request.getContextPath() %>/forgot-user"><small>Forgot Password?</small></a>
                      </div>
                      <div class="input-group input-group-merge form-password-toggle">
                        <input class="form-control form-control-merge" id="password" type="password" name="password" placeholder="********" aria-describedby="login-password" tabindex="2"/><span class="input-group-text cursor-pointer"><i data-feather="eye"></i></span>
                      </div>
                    </div>
                    <div class="mb-1">
                      <div class="form-check">
                        <input class="form-check-input" id="remember-me" type="checkbox" tabindex="3"/>
                        <label class="form-check-label" for="remember-me"> Remember Me</label>
                      </div>
                    </div>
                    <div class="text-center">
                     <a onclick="login();" class="btn  w-50 re-text-bg" tabindex="4">Sign in</a>
                    </div>
                   
                  </form>
<%--               <p class="text-center mt-2"><span>New on our platform?</span><a href="<%=request.getContextPath() %>/create-new"><span>&nbsp;Create an account</span></a></p>
 --%>                </div>
              </div>
              <!-- /Login-->
            </div>
          </div>
        </div>
      </div>
    </div>
    <!-- END: Content-->


    <!-- BEGIN: Vendor JS-->
    <script src="/iris/resources/vendors/js/vendors.min.js"></script>
    <!-- BEGIN Vendor JS-->

    <!-- BEGIN: Page Vendor JS-->
    <script src="/iris/resources/vendors/js/ui/jquery.sticky.js"></script>
    <script src="/iris/resources/vendors/js/forms/validation/jquery.validate.min.js"></script>
    <!-- END: Page Vendor JS-->

    <!-- BEGIN: Theme JS-->
    <script src="/iris/resources/js/core/app-menu.min.js"></script>
    <script src="/iris/resources/js/core/app.min.js"></script>
    <!-- END: Theme JS-->

    <!-- BEGIN: Page JS-->
    <script src="/iris/resources/js/scripts/pages/auth-login.js"></script>
    <!-- END: Page JS-->

    <script>
      $(window).on('load',  function(){
        if (feather) {
          feather.replace({ width: 14, height: 14 });
        }
      })
      
      function login(){
		  var emp_name = $('#emp_name').val();
		  var password = $('#password').val();
		  if(emp_name != '' && password != ''){
			  $('#loginForm').submit();
		  }
      }
    </script>
  </body>
  <!-- END: Body-->

<!-- Mirrored from pixinvent.com/demo/vuexy-html-bootstrap-admin-template/html/ltr/horizontal-menu-template/auth-login-cover.html by HTTrack Website Copier/3.x [XR&CO'2014], Sun, 07 Aug 2022 05:36:01 GMT -->
</html>