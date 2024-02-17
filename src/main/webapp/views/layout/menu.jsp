<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>menu</title>
<style>


div.main-menu-content {
  position: -webkit-sticky;
  position: sticky;
 
}
.horizontal-menu .header-navbar.navbar-horizontal ul#main-menu-navigation>li.active>a {
    background: #da0d14!important;
    box-shadow: 0 0 6px 1px rgb(240 103 103 / 60%)
    color: #FFF;
    border-radius: 4px;
}
</style>
</head>
<body>
		<div class="main-menu menu-fixed menu-accordion menu-shadow expanded menu-light" data-scroll-to-active="true" style="touch-action: none; user-select: none; -webkit-user-drag: none; -webkit-tap-highlight-color: rgba(0, 0, 0, 0);">
      <div class="navbar-header expanded">
        <ul class="nav navbar-nav flex-row">
          <li class="nav-item me-auto"><a class="navbar-brand" href="index-2.html"><span class="brand-logo">
                <svg viewBox="0 0 139 95" version="1.1" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" height="24">
                  <defs>
                    <linearGradient id="linearGradient-1" x1="100%" y1="10.5120544%" x2="50%" y2="89.4879456%">
                      <stop stop-color="#000000" offset="0%"></stop>
                      <stop stop-color="#FFFFFF" offset="100%"></stop>
                    </linearGradient>
                    <linearGradient id="linearGradient-2" x1="64.0437835%" y1="46.3276743%" x2="37.373316%" y2="100%">
                      <stop stop-color="#EEEEEE" stop-opacity="0" offset="0%"></stop>
                      <stop stop-color="#FFFFFF" offset="100%"></stop>
                    </linearGradient>
                  </defs>
                  <g id="Page-1" stroke="none" stroke-width="1" fill="none" fill-rule="evenodd">
                    <g id="Artboard" transform="translate(-400.000000, -178.000000)">
                      <g id="Group" transform="translate(400.000000, 178.000000)">
                        <path class="text-primary" id="Path" d="M-5.68434189e-14,2.84217094e-14 L39.1816085,2.84217094e-14 L69.3453773,32.2519224 L101.428699,2.84217094e-14 L138.784583,2.84217094e-14 L138.784199,29.8015838 C137.958931,37.3510206 135.784352,42.5567762 132.260463,45.4188507 C128.736573,48.2809251 112.33867,64.5239941 83.0667527,94.1480575 L56.2750821,94.1480575 L6.71554594,44.4188507 C2.46876683,39.9813776 0.345377275,35.1089553 0.345377275,29.8015838 C0.345377275,24.4942122 0.230251516,14.560351 -5.68434189e-14,2.84217094e-14 Z" style="fill:currentColor"></path>
                        <path id="Path1" d="M69.3453773,32.2519224 L101.428699,1.42108547e-14 L138.784583,1.42108547e-14 L138.784199,29.8015838 C137.958931,37.3510206 135.784352,42.5567762 132.260463,45.4188507 C128.736573,48.2809251 112.33867,64.5239941 83.0667527,94.1480575 L56.2750821,94.1480575 L32.8435758,70.5039241 L69.3453773,32.2519224 Z" fill="url(#linearGradient-1)" opacity="0.2"></path>
                        <polygon id="Path-2" fill="#000000" opacity="0.049999997" points="69.3922914 32.4202615 32.8435758 70.5039241 54.0490008 16.1851325"></polygon>
                        <polygon id="Path-21" fill="#000000" opacity="0.099999994" points="69.3922914 32.4202615 32.8435758 70.5039241 58.3683556 20.7402338"></polygon>
                        <polygon id="Path-3" fill="url(#linearGradient-2)" opacity="0.099999994" points="101.428699 0 83.0667527 94.1480575 130.378721 47.0740288"></polygon>
                      </g>
                    </g>
                  </g>
                </svg></span>
              <h2 class="brand-text">Vuexy</h2></a></li>
          <li class="nav-item nav-toggle"><a class="nav-link modern-nav-toggle pe-0" data-bs-toggle="collapse"><svg xmlns="http://www.w3.org/2000/svg" width="14" height="14" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-x d-block d-xl-none text-primary toggle-icon font-medium-4"><line x1="18" y1="6" x2="6" y2="18"></line><line x1="6" y1="6" x2="18" y2="18"></line></svg><svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-disc d-none d-xl-block collapse-toggle-icon primary font-medium-4"><circle cx="12" cy="12" r="10"></circle><circle cx="12" cy="12" r="3"></circle></svg></a></li>
        </ul>
      </div>
      <div class="shadow-bottom" style="display: none;"></div>
      <div class="main-menu-content ps" style="height: 291.625px;">
        <ul class="navigation navigation-main" id="main-menu-navigation" data-menu="menu-navigation">
          
          
          <li class=" nav-item"><a class="d-flex align-items-center" href="app-email.html"><svg xmlns="http://www.w3.org/2000/svg" width="14" height="14" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-mail"><path d="M4 4h16c1.1 0 2 .9 2 2v12c0 1.1-.9 2-2 2H4c-1.1 0-2-.9-2-2V6c0-1.1.9-2 2-2z"></path><polyline points="22,6 12,13 2,6"></polyline></svg><span class="menu-title text-truncate" data-i18n="Email">Email</span></a>
          </li>
          <li class=" nav-item"><a class="d-flex align-items-center" href="app-chat.html"><svg xmlns="http://www.w3.org/2000/svg" width="14" height="14" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-message-square"><path d="M21 15a2 2 0 0 1-2 2H7l-4 4V5a2 2 0 0 1 2-2h14a2 2 0 0 1 2 2z"></path></svg><span class="menu-title text-truncate" data-i18n="Chat">Chat</span></a>
          </li>
          <li class=" nav-item"><a class="d-flex align-items-center" href="app-todo.html"><svg xmlns="http://www.w3.org/2000/svg" width="14" height="14" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-check-square"><polyline points="9 11 12 14 22 4"></polyline><path d="M21 12v7a2 2 0 0 1-2 2H5a2 2 0 0 1-2-2V5a2 2 0 0 1 2-2h11"></path></svg><span class="menu-title text-truncate" data-i18n="Todo">Todo</span></a>
          </li>
          <li class=" nav-item"><a class="d-flex align-items-center" href="app-calendar.html"><svg xmlns="http://www.w3.org/2000/svg" width="14" height="14" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-calendar"><rect x="3" y="4" width="18" height="18" rx="2" ry="2"></rect><line x1="16" y1="2" x2="16" y2="6"></line><line x1="8" y1="2" x2="8" y2="6"></line><line x1="3" y1="10" x2="21" y2="10"></line></svg><span class="menu-title text-truncate" data-i18n="Calendar">Calendar</span></a>
          </li>
          <li class=" nav-item"><a class="d-flex align-items-center" href="app-kanban.html"><svg xmlns="http://www.w3.org/2000/svg" width="14" height="14" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-grid"><rect x="3" y="3" width="7" height="7"></rect><rect x="14" y="3" width="7" height="7"></rect><rect x="14" y="14" width="7" height="7"></rect><rect x="3" y="14" width="7" height="7"></rect></svg><span class="menu-title text-truncate" data-i18n="Kanban">Kanban</span></a>
          </li>
        </ul>
      <div class="ps__rail-x" style="left: 0px; bottom: 0px;"><div class="ps__thumb-x" tabindex="0" style="left: 0px; width: 0px;"></div></div><div class="ps__rail-y" style="top: 0px; height: 292px; right: 0px;"><div class="ps__thumb-y" tabindex="0" style="top: 0px; height: 0px;"></div></div></div>
    </div>
        <script>
        var option = window.localStorage.getItem("selectedOption");
        var child_option = window.localStorage.getItem("selectedOptionChild");
        $( document ).ready(function() {
        	
        	var url = $(location).attr('href');
        	//var url = 	$("#"+option).attr('url')
        		if(option != 'undefined' && option != null){
            		$('li.active').removeClass('active');
            		if(url.indexOf('/irm-report') != -1){
           			 $('#reports').addClass('active');
		           		}else if(url.indexOf('/irm') != -1 || url.indexOf('/update-irm-form') != -1){
		           			$('#irm').addClass('active');
		           		}else if(url.indexOf('/home') != -1){
		           			$('#home').addClass('active');
		           			$('#homeChild0 li.active').removeClass('active');
		           		    $('#homeChild0').addClass('active');
		           		}else if(url.indexOf('/dash-sd') != -1){
		           			$('#home').addClass('active');
		           			$('#homeChild1 li.active').removeClass('active');
		           		    $('#homeChild1').addClass('active');
		           		}else if(url.indexOf('/help') != -1){
		           			$('#help').addClass('active');
		           		}else if(option.indexOf('masters') != -1 || option == 'irm'){
		           			$('#masters').addClass('active');
		           			$('#'+option+'li.active').removeClass('active');
		       	            $('#'+child_option).addClass('active');
		           		}else{
		           			$('#home').addClass('active');
		           		}
       	          /*  if(option == 'masters'){
       	        	$('#'+option+'li.active').removeClass('active');
       	            $('#'+child_option).addClass('active');
       	           } */
            	}else{
            		$('li.active').removeClass('active');
            		if(url.indexOf('/irm-report') != -1){
              			 $('#reports').addClass('active');
   		           		}else if(url.indexOf('/irm') != -1 || url.indexOf('/update-irm-form') != -1){
   		           			$('#irm').addClass('active');
   		           		}else if(url.indexOf('/home') != -1){
   		           			$('#home').addClass('active');
	   		           		$('#homeChild0 li.active').removeClass('active');
	   		           		$('#homeChild0').addClass('active');
   		           		}else if(url.indexOf('/dash-sd') != -1){
		           			$('#home').addClass('active');
		           			$('#homeChild1 li.active').removeClass('active');
		           		    $('#homeChild1').addClass('active');
		           		}else if(url.indexOf('/help') != -1){
   		           			$('#help').addClass('active');
   		           		}else if(option.indexOf('masters') != -1){
   		           			$('#masters').addClass('active');
   		           			$('#'+option+'li.active').removeClass('active');
   		       	            $('#'+child_option).addClass('active');
   		           		}else{
   		           			$('#home').addClass('active');
   		           		}
            	}
  	        <%--  window.location.href= "<%=request.getContextPath()%>"+"/"+url;  --%>
        	
        });
        $('#menu ul li ').on('click', function(){
            $('li.active').removeClass('active');
            $(this).addClass('active');
            
            window.localStorage.setItem("selectedOption", $(this).attr('id'));
        }); 
        function exFunction(id) {  window.localStorage.setItem("selectedOptionChild", id);  }
        </script>
</body>
</html>