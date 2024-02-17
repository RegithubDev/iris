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
          <li class="nav-item me-auto"><a class=" nav-item" href="index-2.html"><span class="">
              		<img src="/iris/resources/images/logo/logo.png" class="logo" style="
    width: 10rem;
"></span>
              </a></li>
          <li class="nav-item nav-toggle"><a class="nav-link modern-nav-toggle pe-0" data-bs-toggle="collapse">
          <svg xmlns="http://www.w3.org/2000/svg" width="14" height="14" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-x d-block d-xl-none text-primary toggle-icon font-medium-4"><line x1="18" y1="6" x2="6" y2="18"></line><line x1="6" y1="6" x2="18" y2="18"></line></svg>
          <svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-disc d-none d-xl-block collapse-toggle-icon primary font-medium-4"><circle cx="12" cy="12" r="10"></circle><circle cx="12" cy="12" r="3"></circle></svg></a></li>
        </ul>
      </div>
      <div class="shadow-bottom" style="display: none;"></div>
      <div class="main-menu-content ps" style="height: 291.625px;margin-top: 4rem;">
        <ul class="navigation navigation-main" id="main-menu-navigation" data-menu="menu-navigation">


				<li class=" nav-item bghover"><a class="d-flex align-items-center"
					href="app-email.html"><svg xmlns="http://www.w3.org/2000/svg"
							width="14" height="14" viewBox="0 0 24 24" fill="none"
							stroke="currentColor" stroke-width="2" stroke-linecap="round"
							stroke-linejoin="round" class="feather feather-mail">
							<path
								d="M4 4h16c1.1 0 2 .9 2 2v12c0 1.1-.9 2-2 2H4c-1.1 0-2-.9-2-2V6c0-1.1.9-2 2-2z"></path>
							<polyline points="22,6 12,13 2,6"></polyline></svg><span
						class="menu-title text-truncate" data-i18n="Email">Emaefeil</span></a></li>
				<li class=" nav-item bghover"><a class="d-flex align-items-center"
					href="app-chat.html"><svg xmlns="http://www.w3.org/2000/svg"
							width="14" height="14" viewBox="0 0 24 24" fill="none"
							stroke="currentColor" stroke-width="2" stroke-linecap="round"
							stroke-linejoin="round" class="feather feather-message-square">
							<path
								d="M21 15a2 2 0 0 1-2 2H7l-4 4V5a2 2 0 0 1 2-2h14a2 2 0 0 1 2 2z"></path></svg><span
						class="menu-title text-truncate" data-i18n="Chat">Chat</span></a></li>
				<li class=" nav-item bghover"><a class="d-flex align-items-center"
					href="app-todo.html"><svg xmlns="http://www.w3.org/2000/svg"
							width="14" height="14" viewBox="0 0 24 24" fill="none"
							stroke="currentColor" stroke-width="2" stroke-linecap="round"
							stroke-linejoin="round" class="feather feather-check-square">
							<polyline points="9 11 12 14 22 4"></polyline>
							<path
								d="M21 12v7a2 2 0 0 1-2 2H5a2 2 0 0 1-2-2V5a2 2 0 0 1 2-2h11"></path></svg><span
						class="menu-title text-truncate" data-i18n="Todo">Todo</span></a></li>
				<li class=" nav-item bghover"><a class="d-flex align-items-center"
					href="app-calendar.html"><svg
							xmlns="http://www.w3.org/2000/svg" width="14" height="14"
							viewBox="0 0 24 24" fill="none" stroke="currentColor"
							stroke-width="2" stroke-linecap="round" stroke-linejoin="round"
							class="feather feather-calendar">
							<rect x="3" y="4" width="18" height="18" rx="2" ry="2"></rect>
							<line x1="16" y1="2" x2="16" y2="6"></line>
							<line x1="8" y1="2" x2="8" y2="6"></line>
							<line x1="3" y1="10" x2="21" y2="10"></line></svg><span
						class="menu-title text-truncate" data-i18n="Calendar">Calendar</span></a>
				</li>
				<li class=" nav-item bghover"><a class="d-flex align-items-center"
					href="app-kanban.html"><svg xmlns="http://www.w3.org/2000/svg"
							width="14" height="14" viewBox="0 0 24 24" fill="none"
							stroke="currentColor" stroke-width="2" stroke-linecap="round"
							stroke-linejoin="round" class="feather feather-grid">
							<rect x="3" y="3" width="7" height="7"></rect>
							<rect x="14" y="3" width="7" height="7"></rect>
							<rect x="14" y="14" width="7" height="7"></rect>
							<rect x="3" y="14" width="7" height="7"></rect></svg><span
						class="menu-title text-truncate" data-i18n="Kanban">Kanban</span></a>
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