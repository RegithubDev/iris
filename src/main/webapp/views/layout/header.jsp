<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html class="loading" lang="en" data-textdirection="ltr">
<head>
<meta charset="UTF-8">
<meta name="google-signin-client_id" content="46521935412-0pl18k3a2mq7fs8nrl1853qcie9h5fjb.apps.googleusercontent.com">
<title>Header</title>
<style type="text/css">
.horizontal-menu .header-navbar.navbar-brand-center .navbar-header {
    left: calc(3% - 56px) !important;
    }
    .card-img {
    max-width: 70% !important;
    margin-left: 15%;
    margin-top: 0% !important;
}
/* .horizontal-menu .header-navbar {
    background: #FFF !important;
    z-index: 999!important;
    line-height: 1;
    min-height: auto;
} */
</style>
</head>
<body>
<div class="Header_headerContainer__BvTtA"><div class="Header_profile__b4ZQi"><span class="Header_profileimg__rIISa"><img src="/static/media/avatar.a6143582309785dca610.png" alt="avatar"></span><p class="Header_name__DWqCl">Admin</p><svg class="MuiSvgIcon-root MuiSvgIcon-fontSkomkplpkp;'lp[lp[izeMedium Header_ArrowDown__8OzU5 css-vubbuv" focusable="false" aria-hidden="true" viewBox="0 0 24 24" data-testid="KeyboardArrowDownIcon"><path d="M7.41 8.59 12 13.17l4.59-4.58L18 10l-6 6-6-6 1.41-1.41z"></path></svg></div></div>
	<form action="<%=request.getContextPath() %>/logout" name="logoutForm" id="logoutForm" method="post">
		<input type="hidden" name="email" id="email"/>
	</form>

</body>
</html>