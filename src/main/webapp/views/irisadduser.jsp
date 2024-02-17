<html lang="en">
<head>
<meta charset="utf-8">
<link rel="icon" href="/logo.png">
<meta name="viewport" content="width=device-width,initial-scale=1">
<meta name="theme-color" content="#000000">
<meta name="description"
	content="Resustainability is a one-stop solution provider to its clients for all its environmental issues including water pollution, waste water treatment and contamination.">
<link rel="apple-touch-icon" href="/logo.png">
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin="">
<link
	href="https://fonts.googleapis.com/css2?family=Open+Sans:ital,wght@0,300;0,400;0,500;0,600;0,700;0,800;1,300&amp;display=swap"
	rel="stylesheet">

<title>Add User</title>
<script src="/iris/resources/js/jQuery-v.3.5.min.js"  ></script>

 <!-- BEGIN: Vendor CSS-->
         <link rel="shortcut icon" type="image/x-icon" href="/iris/resources/images/logo/logo.png">
	<link href="https://fonts.googleapis.com/css2?family=Montserrat:ital,wght@0,300;0,400;0,500;0,600;1,400;1,500;1,600" rel="stylesheet">
    <!-- BEGIN: Vendor CSS-->
     <link rel="stylesheet" type="text/css" href="/iris/resources/vendors/css/vendors.min.css">
    <link rel="stylesheet" type="text/css" href="/iris/resources/vendors/css/forms/select/select2.min.css">
    <link rel="stylesheet" type="text/css" href="/iris/resources/vendors/css/pickers/flatpickr/flatpickr.min.css">
    <!-- END: Vendor CSS-->

    <!-- BEGIN: Theme CSS-->
    <link rel="stylesheet" type="text/css" href="/iris/resources/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="/iris/resources/css/bootstrap-extended.min.css">
    <link rel="stylesheet" type="text/css" href="/iris/resources/css/colors.min.css">
    <link rel="stylesheet" type="text/css" href="/iris/resources/css/components.min.css">
    <link rel="stylesheet" type="text/css" href="/iris/resources/css/themes/dark-layout.min.css">
    <link rel="stylesheet" type="text/css" href="/iris/resources/css/themes/bordered-layout.min.css">
    <link rel="stylesheet" type="text/css" href="/iris/resources/css/themes/semi-dark-layout.min.css">

    <!-- BEGIN: Page CSS-->
    <link rel="stylesheet" type="text/css" href="/iris/resources/css/core/menu/menu-types/horizontal-menu.min.css">
    <link rel="stylesheet" type="text/css" href="/iris/resources/css/plugins/forms/form-validation.css">
    <link rel="stylesheet" type="text/css" href="/iris/resources/css/plugins/forms/pickers/form-flat-pickr.min.css">
    <!-- END: Page CSS-->

    <!-- BEGIN: Custom CSS-->
    <link rel="stylesheet" type="text/css" href="/iris/resources/css/style.css">




    <!-- BEGIN: Vendor CSS-->
      <link rel="apple-touch-icon" href="/iris/resources/images/ico/apple-icon-120.html">
	<link href="https://fonts.googleapis.com/css2?family=Montserrat:ital,wght@0,300;0,400;0,500;0,600;1,400;1,500;1,600" rel="stylesheet">
    <!-- BEGIN: Vendor CSS-->
     <link rel="stylesheet" type="text/css" href="/iris/resources/vendors/css/vendors.min.css">
    <link rel="stylesheet" type="text/css" href="/iris/resources/vendors/css/forms/select/select2.min.css">
    <link rel="stylesheet" type="text/css" href="/iris/resources/vendors/css/pickers/flatpickr/flatpickr.min.css">
    <!-- END: Vendor CSS-->

    <!-- BEGIN: Theme CSS-->
    <link rel="stylesheet" type="text/css" href="/iris/resources/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="/iris/resources/css/bootstrap-extended.min.css">
    <link rel="stylesheet" type="text/css" href="/iris/resources/css/colors.min.css">
    <link rel="stylesheet" type="text/css" href="/iris/resources/css/components.min.css">
    <link rel="stylesheet" type="text/css" href="/iris/resources/css/themes/dark-layout.min.css">
    <link rel="stylesheet" type="text/css" href="/iris/resources/css/themes/bordered-layout.min.css">
    <link rel="stylesheet" type="text/css" href="/iris/resources/css/themes/semi-dark-layout.min.css">

    <!-- BEGIN: Page CSS-->
    <link rel="stylesheet" type="text/css" href="/iris/resources/css/core/menu/menu-types/horizontal-menu.min.css">
    <link rel="stylesheet" type="text/css" href="/iris/resources/css/plugins/forms/form-validation.css">
    <link rel="stylesheet" type="text/css" href="/iris/resources/css/plugins/forms/pickers/form-flat-pickr.min.css">
    <!-- END: Page CSS-->

    <!-- BEGIN: Custom CSS-->
    <link rel="stylesheet" type="text/css" href="/iris/resources/css/style.css">
<style>
nav {
    background-color: rgb(255 255 255 / 85%)!important;
}
</style>
</head>
<body >
<!-- BEGIN: Header-->
    <jsp:include page="../views/layout/header.jsp"></jsp:include>
    <!-- END: Header-->
<div class="col-12">
      <div class="card">
        <div class="card-header">
          <h4 class="card-title">Add New User</h4>
        </div>
       <div class="card-body">
          <form id="jquery-val-form" action="<%=request.getContextPath() %>/add-user-iris" method="post" novalidate="novalidate">
          
          <div class="row">
            <div class="mb-1 col-md-6">
             <label class="form-label" for="basic-default-name">Name</label>
              <input type="text" class="form-control" id="basic-default-name" name="user_name" placeholder="Name">
            </div>
            <div class="mb-1 col-md-6">
               <label class="form-label" for="basic-default-email">Email</label>
              <input type="text" id="basic-default-email" name="email_id" class="form-control" placeholder="RE@email.com">
            
            </div>
          </div>
     <!--        <div class="row">
            <div class="mb-1 col-md-6">
             <label class="form-label" for="basic-default-password">Password</label>
              <input type="password" id="basic-default-password" name="password" class="form-control" placeholder="*******">
           
            </div>
            <div class="mb-1 col-md-6">
                <label class="form-label" for="confirm-password">Confirm Password</label>
              <input type="password" id="confirm-password" name="confirm-password" class="form-control" placeholder="*********">
            
            </div>
          </div> -->
          
           <div class="row">
            <div class="mb-1 col-md-6">
            <label class="form-label" for="select-country">Select SBU</label>
              <div class="position-relative"><select class="form-select select2 select2-hidden-accessible" id="select-department" name="sbu" data-select2-id="select-department" tabindex="1" aria-hidden="true">
                <option value="" data-select2-id="1">Select </option>
                <option value="usa">USA</option>
                <option value="uk">UK</option>
                <option value="france">France</option>
                <option value="australia">Australia</option>
                <option value="spain">Spain</option>
              </select>
              </div>
            </div>
            <div class="mb-1 col-md-6">
             <label class="form-label" for="select-country">Select Category</label>
              <div class="position-relative">
              <select class="form-select select2 select2-hidden-accessible" id="Select-Category" name="categories" data-select2-id="Select-Category" tabindex="2" aria-hidden="true">
                <option value="" data-select2-id="2">Select </option>
                <option value="usa">USA</option>
                <option value="uk">UK</option>
                <option value="france">France</option>
                <option value="australia">Australia</option>
                <option value="spain">Spain</option>
              </select>
              </div>
            </div>
          </div>
           <div class="row">
            <div class="mb-1 col-md-6">
            <label class="form-label" for="select-country">Select Role</label>
              <div class="position-relative"><select class="form-select select2 select2-hidden-accessible" id="select-role" name="roles" data-select2-id="select-role" tabindex="3" aria-hidden="true">
                <option value="" data-select2-id="1">Select </option>
                <option value="usa">USA</option>
                <option value="uk">UK</option>
                <option value="france">France</option>
                <option value="australia">Australia</option>
                <option value="spain">Spain</option>
              </select>
              </div>
            </div>
            <div class="mb-1 col-md-6">
             <label class="form-label" for="select-country">Select City</label>
              <div class="position-relative">
              <select class="form-select select2 select2-hidden-accessible" id="Select-City" name="city" data-select2-id="Select-City" tabindex="4" aria-hidden="true">
                <option value="" data-select2-id="2">Select </option>
                <option value="usa">USA</option>
                <option value="uk">UK</option>
                <option value="france">France</option>
                <option value="australia">Australia</option>
                <option value="spain">Spain</option>
              </select>
              </div>
            </div>
          </div>
             <div class="row">
            <div class="mb-1 col-md-6">
            <label class="form-label" for="select-country">Site Name</label>
              <div class="position-relative"><select class="form-select select2 select2-hidden-accessible" id="select-site" name="site_name" data-select2-id="select-site" tabindex="5" aria-hidden="true">
                <option value="" data-select2-id="1">Select </option>
                <option value="usa">USA</option>
                <option value="uk">UK</option>
                <option value="france">France</option>
                <option value="australia">Australia</option>
                <option value="spain">Spain</option>
              </select>
              </div>
            </div>
            <div class="mb-1 col-md-6">
            <label class="form-label" for="basic-number">Mobile Number</label>
              <input type="password" id="basic-number" name="mobile_number" class="form-control" placeholder="999-999-9999">
            
            </div>
          </div>
           
           <div class="row">
      <div class="col-12 text-center mt-4">
        		<button type="submit" class="btn  waves-effect waves-float waves-light re-text-bg" name="submit" value="Submit">Submit</button>
                <a href="<%=request.getContextPath() %>/iris-usermanagement" class="btn btn-outline-secondary waves-effect">Back</a>
      </div>
    </div>
    
          </form>
        </div>
      </div>
    </div>

   <!-- BEGIN: Vendor JS-->
    <script src="/iris/resources/vendors/js/vendors.min.js"></script>
    <!-- BEGIN Vendor JS-->

    <!-- BEGIN: Page Vendor JS-->
  <script src="/iris/resources/vendors/js/vendors.min.js"></script>
    <!-- BEGIN Vendor JS-->

    <!-- BEGIN: Page Vendor JS-->
    <script src="/iris/resources/vendors/js/ui/jquery.sticky.js"></script>
    <script src="/iris/resources/vendors/js/forms/select/select2.full.min.js"></script>
    <script src="/iris/resources/vendors/js/forms/validation/jquery.validate.min.js"></script>
    <script src="/iris/resources/vendors/js/pickers/flatpickr/flatpickr.min.js"></script>
    <!-- END: Page Vendor JS-->

    <!-- BEGIN: Theme JS-->
    <script src="/iris/resources/js/core/app-menu.min.js"></script>
    <script src="/iris/resources/js/core/app.min.js"></script>
    <script src="/iris/resources/js/scripts/customizer.min.js"></script>
    <!-- END: Theme JS-->

    <!-- BEGIN: Page JS-->
    <script src="/iris/resources/js/scripts/forms/form-validation.js"></script>
    <!-- END: Page JS-->
    <!-- END: Page JS-->
    
       <!-- BEGIN: Vendor JS-->
    <script src="/iris/resources/vendors/js/vendors.min.js"></script>
    <!-- BEGIN Vendor JS-->

    <!-- BEGIN: Page Vendor JS-->
  <script src="/iris/resources/vendors/js/vendors.min.js"></script>
    <!-- BEGIN Vendor JS-->

    <!-- BEGIN: Page Vendor JS-->
    <script src="/iris/resources/vendors/js/ui/jquery.sticky.js"></script>
    <script src="/iris/resources/vendors/js/forms/select/select2.full.min.js"></script>
    <script src="/iris/resources/vendors/js/forms/validation/jquery.validate.min.js"></script>
    <script src="/iris/resources/vendors/js/pickers/flatpickr/flatpickr.min.js"></script>
    <!-- END: Page Vendor JS-->

    <!-- BEGIN: Theme JS-->
    <script src="/iris/resources/js/core/app-menu.min.js"></script>
    <script src="/iris/resources/js/core/app.min.js"></script>
    <script src="/iris/resources/js/scripts/customizer.min.js"></script>
    <!-- END: Theme JS-->

    <!-- BEGIN: Page JS-->
    <script src="/iris/resources/js/scripts/forms/form-validation.js"></script>
    <!-- END: Page JS-->
    <!-- END: Page JS-->
</body>
</html>