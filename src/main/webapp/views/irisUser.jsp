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
<style>
* {
	font-family: 'Open Sans', sans-serif;
	box-sizing: border-box;
	margin: 0
}
</style>
<link rel="manifest" href="/manifest.json">
<title>Dashboard</title>
	<script src="/iris/resources/js/jQuery-v.3.5.min.js"  ></script>
<link href="/iris/resources/css1/main.css" rel="stylesheet">
<style data-emotion="css" data-s=""></style>
<style id="apexcharts-css">
.apexcharts-canvas {
	position: relative;
	user-select: none;
	/* cannot give overflow: hidden as it will crop tooltips which overflow outside chart area */
}

/* scrollbar is not visible by default for legend, hence forcing the visibility */
.apexcharts-canvas ::-webkit-scrollbar {
	-webkit-appearance: none;
	width: 6px;
}

.apexcharts-canvas ::-webkit-scrollbar-thumb {
	border-radius: 4px;
	background-color: rgba(0, 0, 0, .5);
	box-shadow: 0 0 1px rgba(255, 255, 255, .5);
	-webkit-box-shadow: 0 0 1px rgba(255, 255, 255, .5);
}

.apexcharts-inner {
	position: relative;
}

.apexcharts-text tspan {
	font-family: inherit;
}

.legend-mouseover-inactive {
	transition: 0.15s ease all;
	opacity: 0.20;
}

.apexcharts-series-collapsed {
	opacity: 0;
}

.apexcharts-tooltip {
	border-radius: 5px;
	box-shadow: 2px 2px 6px -4px #999;
	cursor: default;
	font-size: 14px;
	left: 62px;
	opacity: 0;
	pointer-events: none;
	position: absolute;
	top: 20px;
	display: flex;
	flex-direction: column;
	overflow: hidden;
	white-space: nowrap;
	z-index: 12;
	transition: 0.15s ease all;
}

.apexcharts-tooltip.apexcharts-active {
	opacity: 1;
	transition: 0.15s ease all;
}

.apexcharts-tooltip.apexcharts-theme-light {
	border: 1px solid #e3e3e3;
	background: rgba(255, 255, 255, 0.96);
}

.apexcharts-tooltip.apexcharts-theme-dark {
	color: #fff;
	background: rgba(30, 30, 30, 0.8);
}

.apexcharts-tooltip * {
	font-family: inherit;
}

.apexcharts-tooltip-title {
	padding: 6px;
	font-size: 15px;
	margin-bottom: 4px;
}

.apexcharts-tooltip.apexcharts-theme-light .apexcharts-tooltip-title {
	background: #ECEFF1;
	border-bottom: 1px solid #ddd;
}

.apexcharts-tooltip.apexcharts-theme-dark .apexcharts-tooltip-title {
	background: rgba(0, 0, 0, 0.7);
	border-bottom: 1px solid #333;
}

.apexcharts-tooltip-text-y-value, .apexcharts-tooltip-text-goals-value,
	.apexcharts-tooltip-text-z-value {
	display: inline-block;
	font-weight: 600;
	margin-left: 5px;
}

.apexcharts-tooltip-title:empty, .apexcharts-tooltip-text-y-label:empty,
	.apexcharts-tooltip-text-y-value:empty,
	.apexcharts-tooltip-text-goals-label:empty,
	.apexcharts-tooltip-text-goals-value:empty,
	.apexcharts-tooltip-text-z-value:empty {
	display: none;
}

.apexcharts-tooltip-text-y-value, .apexcharts-tooltip-text-goals-value,
	.apexcharts-tooltip-text-z-value {
	font-weight: 600;
}

.apexcharts-tooltip-text-goals-label,
	.apexcharts-tooltip-text-goals-value {
	padding: 6px 0 5px;
}

.apexcharts-tooltip-goals-group, .apexcharts-tooltip-text-goals-label,
	.apexcharts-tooltip-text-goals-value {
	display: flex;
}

.apexcharts-tooltip-text-goals-label:not(:empty),
	.apexcharts-tooltip-text-goals-value:not(:empty) {
	margin-top: -6px;
}

.apexcharts-tooltip-marker {
	width: 12px;
	height: 12px;
	position: relative;
	top: 0px;
	margin-right: 10px;
	border-radius: 50%;
}

.apexcharts-tooltip-series-group {
	padding: 0 10px;
	display: none;
	text-align: left;
	justify-content: left;
	align-items: center;
}

.apexcharts-tooltip-series-group.apexcharts-active .apexcharts-tooltip-marker
	{
	opacity: 1;
}

.apexcharts-tooltip-series-group.apexcharts-active,
	.apexcharts-tooltip-series-group:last-child {
	padding-bottom: 4px;
}

.apexcharts-tooltip-series-group-hidden {
	opacity: 0;
	height: 0;
	line-height: 0;
	padding: 0 !important;
}

.apexcharts-tooltip-y-group {
	padding: 6px 0 5px;
}

.apexcharts-tooltip-box, .apexcharts-custom-tooltip {
	padding: 4px 8px;
}

.apexcharts-tooltip-boxPlot {
	display: flex;
	flex-direction: column-reverse;
}

.apexcharts-tooltip-box>div {
	margin: 4px 0;
}

.apexcharts-tooltip-box span.value {
	font-weight: bold;
}

.apexcharts-tooltip-rangebar {
	padding: 5px 8px;
}

.apexcharts-tooltip-rangebar .category {
	font-weight: 600;
	color: #777;
}

.apexcharts-tooltip-rangebar .series-name {
	font-weight: bold;
	display: block;
	margin-bottom: 5px;
}

.apexcharts-xaxistooltip {
	opacity: 0;
	padding: 9px 10px;
	pointer-events: none;
	color: #373d3f;
	font-size: 13px;
	text-align: center;
	border-radius: 2px;
	position: absolute;
	z-index: 10;
	background: #ECEFF1;
	border: 1px solid #90A4AE;
	transition: 0.15s ease all;
}

.apexcharts-xaxistooltip.apexcharts-theme-dark {
	background: rgba(0, 0, 0, 0.7);
	border: 1px solid rgba(0, 0, 0, 0.5);
	color: #fff;
}

.apexcharts-xaxistooltip:after, .apexcharts-xaxistooltip:before {
	left: 50%;
	border: solid transparent;
	content: " ";
	height: 0;
	width: 0;
	position: absolute;
	pointer-events: none;
}

.apexcharts-xaxistooltip:after {
	border-color: rgba(236, 239, 241, 0);
	border-width: 6px;
	margin-left: -6px;
}

.apexcharts-xaxistooltip:before {
	border-color: rgba(144, 164, 174, 0);
	border-width: 7px;
	margin-left: -7px;
}

.apexcharts-xaxistooltip-bottom:after, .apexcharts-xaxistooltip-bottom:before
	{
	bottom: 100%;
}

.apexcharts-xaxistooltip-top:after, .apexcharts-xaxistooltip-top:before
	{
	top: 100%;
}

.apexcharts-xaxistooltip-bottom:after {
	border-bottom-color: #ECEFF1;
}

.apexcharts-xaxistooltip-bottom:before {
	border-bottom-color: #90A4AE;
}

.apexcharts-xaxistooltip-bottom.apexcharts-theme-dark:after {
	border-bottom-color: rgba(0, 0, 0, 0.5);
}

.apexcharts-xaxistooltip-bottom.apexcharts-theme-dark:before {
	border-bottom-color: rgba(0, 0, 0, 0.5);
}

.apexcharts-xaxistooltip-top:after {
	border-top-color: #ECEFF1
}

.apexcharts-xaxistooltip-top:before {
	border-top-color: #90A4AE;
}

.apexcharts-xaxistooltip-top.apexcharts-theme-dark:after {
	border-top-color: rgba(0, 0, 0, 0.5);
}

.apexcharts-xaxistooltip-top.apexcharts-theme-dark:before {
	border-top-color: rgba(0, 0, 0, 0.5);
}

.apexcharts-xaxistooltip.apexcharts-active {
	opacity: 1;
	transition: 0.15s ease all;
}

.apexcharts-yaxistooltip {
	opacity: 0;
	padding: 4px 10px;
	pointer-events: none;
	color: #373d3f;
	font-size: 13px;
	text-align: center;
	border-radius: 2px;
	position: absolute;
	z-index: 10;
	background: #ECEFF1;
	border: 1px solid #90A4AE;
}

.apexcharts-yaxistooltip.apexcharts-theme-dark {
	background: rgba(0, 0, 0, 0.7);
	border: 1px solid rgba(0, 0, 0, 0.5);
	color: #fff;
}

.apexcharts-yaxistooltip:after, .apexcharts-yaxistooltip:before {
	top: 50%;
	border: solid transparent;
	content: " ";
	height: 0;
	width: 0;
	position: absolute;
	pointer-events: none;
}

.apexcharts-yaxistooltip:after {
	border-color: rgba(236, 239, 241, 0);
	border-width: 6px;
	margin-top: -6px;
}

.apexcharts-yaxistooltip:before {
	border-color: rgba(144, 164, 174, 0);
	border-width: 7px;
	margin-top: -7px;
}

.apexcharts-yaxistooltip-left:after, .apexcharts-yaxistooltip-left:before
	{
	left: 100%;
}

.apexcharts-yaxistooltip-right:after, .apexcharts-yaxistooltip-right:before
	{
	right: 100%;
}

.apexcharts-yaxistooltip-left:after {
	border-left-color: #ECEFF1;
}

.apexcharts-yaxistooltip-left:before {
	border-left-color: #90A4AE;
}

.apexcharts-yaxistooltip-left.apexcharts-theme-dark:after {
	border-left-color: rgba(0, 0, 0, 0.5);
}

.apexcharts-yaxistooltip-left.apexcharts-theme-dark:before {
	border-left-color: rgba(0, 0, 0, 0.5);
}

.apexcharts-yaxistooltip-right:after {
	border-right-color: #ECEFF1;
}

.apexcharts-yaxistooltip-right:before {
	border-right-color: #90A4AE;
}

.apexcharts-yaxistooltip-right.apexcharts-theme-dark:after {
	border-right-color: rgba(0, 0, 0, 0.5);
}

.apexcharts-yaxistooltip-right.apexcharts-theme-dark:before {
	border-right-color: rgba(0, 0, 0, 0.5);
}

.apexcharts-yaxistooltip.apexcharts-active {
	opacity: 1;
}

.apexcharts-yaxistooltip-hidden {
	display: none;
}

.apexcharts-xcrosshairs, .apexcharts-ycrosshairs {
	pointer-events: none;
	opacity: 0;
	transition: 0.15s ease all;
}

.apexcharts-xcrosshairs.apexcharts-active, .apexcharts-ycrosshairs.apexcharts-active
	{
	opacity: 1;
	transition: 0.15s ease all;
}

.apexcharts-ycrosshairs-hidden {
	opacity: 0;
}

.apexcharts-selection-rect {
	cursor: move;
}

.svg_select_boundingRect, .svg_select_points_rot {
	pointer-events: none;
	opacity: 0;
	visibility: hidden;
}

.apexcharts-selection-rect+g .svg_select_boundingRect,
	.apexcharts-selection-rect+g .svg_select_points_rot {
	opacity: 0;
	visibility: hidden;
}

.apexcharts-selection-rect+g .svg_select_points_l,
	.apexcharts-selection-rect+g .svg_select_points_r {
	cursor: ew-resize;
	opacity: 1;
	visibility: visible;
}

.svg_select_points {
	fill: #efefef;
	stroke: #333;
	rx: 2;
}

.apexcharts-svg.apexcharts-zoomable.hovering-zoom {
	cursor: crosshair
}

.apexcharts-svg.apexcharts-zoomable.hovering-pan {
	cursor: move
}

.apexcharts-zoom-icon, .apexcharts-zoomin-icon, .apexcharts-zoomout-icon,
	.apexcharts-reset-icon, .apexcharts-pan-icon,
	.apexcharts-selection-icon, .apexcharts-menu-icon,
	.apexcharts-toolbar-custom-icon {
	cursor: pointer;
	width: 20px;
	height: 20px;
	line-height: 24px;
	color: #6E8192;
	text-align: center;
}

.apexcharts-zoom-icon svg, .apexcharts-zoomin-icon svg,
	.apexcharts-zoomout-icon svg, .apexcharts-reset-icon svg,
	.apexcharts-menu-icon svg {
	fill: #6E8192;
}

.apexcharts-selection-icon svg {
	fill: #444;
	transform: scale(0.76)
}

.apexcharts-theme-dark .apexcharts-zoom-icon svg, .apexcharts-theme-dark .apexcharts-zoomin-icon svg,
	.apexcharts-theme-dark .apexcharts-zoomout-icon svg,
	.apexcharts-theme-dark .apexcharts-reset-icon svg,
	.apexcharts-theme-dark .apexcharts-pan-icon svg, .apexcharts-theme-dark .apexcharts-selection-icon svg,
	.apexcharts-theme-dark .apexcharts-menu-icon svg,
	.apexcharts-theme-dark .apexcharts-toolbar-custom-icon svg {
	fill: #f3f4f5;
}

.apexcharts-canvas .apexcharts-zoom-icon.apexcharts-selected svg,
	.apexcharts-canvas .apexcharts-selection-icon.apexcharts-selected svg,
	.apexcharts-canvas .apexcharts-reset-zoom-icon.apexcharts-selected svg
	{
	fill: #008FFB;
}

.apexcharts-theme-light .apexcharts-selection-icon:not(.apexcharts-selected):hover svg,
	.apexcharts-theme-light .apexcharts-zoom-icon:not(.apexcharts-selected):hover svg,
	.apexcharts-theme-light .apexcharts-zoomin-icon:hover svg,
	.apexcharts-theme-light .apexcharts-zoomout-icon:hover svg,
	.apexcharts-theme-light .apexcharts-reset-icon:hover svg,
	.apexcharts-theme-light .apexcharts-menu-icon:hover svg {
	fill: #333;
}

.apexcharts-selection-icon, .apexcharts-menu-icon {
	position: relative;
}

.apexcharts-reset-icon {
	margin-left: 5px;
}

.apexcharts-zoom-icon, .apexcharts-reset-icon, .apexcharts-menu-icon {
	transform: scale(0.85);
}

.apexcharts-zoomin-icon, .apexcharts-zoomout-icon {
	transform: scale(0.7)
}

.apexcharts-zoomout-icon {
	margin-right: 3px;
}

.apexcharts-pan-icon {
	transform: scale(0.62);
	position: relative;
	left: 1px;
	top: 0px;
}

.apexcharts-pan-icon svg {
	fill: #fff;
	stroke: #6E8192;
	stroke-width: 2;
}

.apexcharts-pan-icon.apexcharts-selected svg {
	stroke: #008FFB;
}

.apexcharts-pan-icon:not(.apexcharts-selected):hover svg {
	stroke: #333;
}

.apexcharts-toolbar {
	position: absolute;
	z-index: 11;
	max-width: 176px;
	text-align: right;
	border-radius: 3px;
	padding: 0px 6px 2px 6px;
	display: flex;
	justify-content: space-between;
	align-items: center;
}

.apexcharts-menu {
	background: #fff;
	position: absolute;
	top: 100%;
	border: 1px solid #ddd;
	border-radius: 3px;
	padding: 3px;
	right: 10px;
	opacity: 0;
	min-width: 110px;
	transition: 0.15s ease all;
	pointer-events: none;
}

.apexcharts-menu.apexcharts-menu-open {
	opacity: 1;
	pointer-events: all;
	transition: 0.15s ease all;
}

.apexcharts-menu-item {
	padding: 6px 7px;
	font-size: 12px;
	cursor: pointer;
}

.apexcharts-theme-light .apexcharts-menu-item:hover {
	background: #eee;
}

.apexcharts-theme-dark .apexcharts-menu {
	background: rgba(0, 0, 0, 0.7);
	color: #fff;
}

@media screen and (min-width: 768px) {
	.apexcharts-canvas:hover .apexcharts-toolbar {
		opacity: 1;
	}
}

.apexcharts-datalabel.apexcharts-element-hidden {
	opacity: 0;
}

.apexcharts-pie-label, .apexcharts-datalabels, .apexcharts-datalabel,
	.apexcharts-datalabel-label, .apexcharts-datalabel-value {
	cursor: default;
	pointer-events: none;
}

.apexcharts-pie-label-delay {
	opacity: 0;
	animation-name: opaque;
	animation-duration: 0.3s;
	animation-fill-mode: forwards;
	animation-timing-function: ease;
}

.apexcharts-canvas .apexcharts-element-hidden {
	opacity: 0;
}

.apexcharts-hide .apexcharts-series-points {
	opacity: 0;
}

.apexcharts-gridline, .apexcharts-annotation-rect, .apexcharts-tooltip .apexcharts-marker,
	.apexcharts-area-series .apexcharts-area, .apexcharts-line,
	.apexcharts-zoom-rect, .apexcharts-toolbar svg, .apexcharts-area-series .apexcharts-series-markers .apexcharts-marker.no-pointer-events,
	.apexcharts-line-series .apexcharts-series-markers .apexcharts-marker.no-pointer-events,
	.apexcharts-radar-series path, .apexcharts-radar-series polygon {
	pointer-events: none;
}

/* markers */
.apexcharts-marker {
	transition: 0.15s ease all;
}

@
keyframes opaque { 0% {
	opacity: 0;
}

100
%
{
opacity
:
1;
}
}

/* Resize generated styles */
@
keyframes resizeanim {from { opacity:0;
	
}

to {
	opacity: 0;
}

}
.resize-triggers {
	animation: 1ms resizeanim;
	visibility: hidden;
	opacity: 0;
}

.resize-triggers, .resize-triggers>div, .contract-trigger:before {
	content: " ";
	display: block;
	position: absolute;
	top: 0;
	left: 0;
	height: 100%;
	width: 100%;
	overflow: hidden;
}

.resize-triggers>div {
	background: #eee;
	overflow: auto;
}

.contract-trigger:before {
	width: 200%;
	height: 200%;
}
</style>
</head>
<body>
	<noscript>You need to enable JavaScript to run this app.</noscript>
	<div id="root">
		<div class="App_App__1WLdD">
			<div class="Container_Container__Y54ND Container_margin_lg__NGmvy">
				<div class="Sidebar_Container__Rb1EW" style="width: 230px;">
					<div class="Sidebar_hideShow__v59VP">
						<svg
							class="MuiSvgIcon-root MuiSvgIcon-fontSizeMedium Sidebar_CloseIcon__APsCK css-vubbuv"
							focusable="false" aria-hidden="true" viewBox="0 0 24 24"
							data-testid="CloseIcon">
							<path
								d="M19 6.41 17.59 5 12 10.59 6.41 5 5 6.41 10.59 12 5 17.59 6.41 19 12 13.41 17.59 19 19 17.59 13.41 12z"></path></svg>
					</div>
					<div class="Sidebar_logoContainer__LYA28">
						<img src="/static/media/logo.82e6f6467b15646fe8ef.png" alt="logo"
							style="opacity: 100;">
					</div>
					<div>
						<div class="NavigationItems_NavigationContainer__LJqeu">
							<li class="NavigationItem_nav__KEVsc"><a href="/"><svg
										class="MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-vubbuv"
										focusable="false" aria-hidden="true" viewBox="0 0 24 24"
										data-testid="HomeOutlinedIcon">
										<path
											d="m12 5.69 5 4.5V18h-2v-6H9v6H7v-7.81l5-4.5M12 3 2 12h3v8h6v-6h2v6h6v-8h3L12 3z"></path></svg>
									<p class="undefined NavigationItem_show__SIjWK">Home</p></a></li>
							<li class="NavigationItem_nav__KEVsc"><a
								href="/site-management"><svg
										class="MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-vubbuv"
										focusable="false" aria-hidden="true" viewBox="0 0 24 24"
										data-testid="LocationOnOutlinedIcon">
										<path
											d="M12 2C8.13 2 5 5.13 5 9c0 5.25 7 13 7 13s7-7.75 7-13c0-3.87-3.13-7-7-7zM7 9c0-2.76 2.24-5 5-5s5 2.24 5 5c0 2.88-2.88 7.19-5 9.88C9.92 16.21 7 11.85 7 9z"></path>
										<circle cx="12" cy="9" r="2.5"></circle></svg>
									<p class="undefined NavigationItem_show__SIjWK">Site
										Management</p></a></li>
							<li class="NavigationItem_nav__KEVsc"><a
								href="/user-management" aria-current="page"
								class="NavigationItem_active__KMCYQ"><svg
										class="MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-vubbuv"
										focusable="false" aria-hidden="true" viewBox="0 0 24 24"
										data-testid="SupervisorAccountOutlinedIcon">
										<path
											d="M9 12c1.93 0 3.5-1.57 3.5-3.5S10.93 5 9 5 5.5 6.57 5.5 8.5 7.07 12 9 12zm0-5c.83 0 1.5.67 1.5 1.5S9.83 10 9 10s-1.5-.67-1.5-1.5S8.17 7 9 7zm.05 10H4.77c.99-.5 2.7-1 4.23-1 .11 0 .23.01.34.01.34-.73.93-1.33 1.64-1.81-.73-.13-1.42-.2-1.98-.2-2.34 0-7 1.17-7 3.5V19h7v-1.5c0-.17.02-.34.05-.5zm7.45-2.5c-1.84 0-5.5 1.01-5.5 3V19h11v-1.5c0-1.99-3.66-3-5.5-3zm1.21-1.82c.76-.43 1.29-1.24 1.29-2.18C19 9.12 17.88 8 16.5 8S14 9.12 14 10.5c0 .94.53 1.75 1.29 2.18.36.2.77.32 1.21.32s.85-.12 1.21-.32z"></path></svg>
									<p class="undefined NavigationItem_show__SIjWK">User
										Management</p></a></li>
							<li class="NavigationItem_nav__KEVsc"><a
								href="/data-management"><svg
										class="MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-vubbuv"
										focusable="false" aria-hidden="true" viewBox="0 0 24 24"
										data-testid="InsertChartOutlinedOutlinedIcon">
										<path
											d="M9 17H7v-7h2v7zm4 0h-2V7h2v10zm4 0h-2v-4h2v4zm2 2H5V5h14v14zm0-16H5c-1.1 0-2 .9-2 2v14c0 1.1.9 2 2 2h14c1.1 0 2-.9 2-2V5c0-1.1-.9-2-2-2z"></path></svg>
									<p class="undefined NavigationItem_show__SIjWK">Data
										Management</p></a></li>
							<li class="NavigationItem_nav__KEVsc"><a
								href="/product-catalogue"><svg
										class="MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-vubbuv"
										focusable="false" aria-hidden="true" viewBox="0 0 24 24"
										data-testid="VisibilityOutlinedIcon">
										<path
											d="M12 6c3.79 0 7.17 2.13 8.82 5.5C19.17 14.87 15.79 17 12 17s-7.17-2.13-8.82-5.5C4.83 8.13 8.21 6 12 6m0-2C7 4 2.73 7.11 1 11.5 2.73 15.89 7 19 12 19s9.27-3.11 11-7.5C21.27 7.11 17 4 12 4zm0 5c1.38 0 2.5 1.12 2.5 2.5S13.38 14 12 14s-2.5-1.12-2.5-2.5S10.62 9 12 9m0-2c-2.48 0-4.5 2.02-4.5 4.5S9.52 16 12 16s4.5-2.02 4.5-4.5S14.48 7 12 7z"></path></svg>
									<p class="undefined NavigationItem_show__SIjWK">Product
										Catalogue</p></a></li>
							<li class="NavigationItem_nav__KEVsc"><a href="/management"><svg
										class="MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-vubbuv"
										focusable="false" aria-hidden="true" viewBox="0 0 24 24"
										data-testid="DesignServicesOutlinedIcon">
										<path
											d="M20.97 7.27c.39-.39.39-1.02 0-1.41l-2.83-2.83a.9959.9959 0 0 0-1.41 0l-4.49 4.49-3.89-3.89c-.78-.78-2.05-.78-2.83 0l-1.9 1.9c-.78.78-.78 2.05 0 2.83l3.89 3.89L3 16.76V21h4.24l4.52-4.52 3.89 3.89c.95.95 2.23.6 2.83 0l1.9-1.9c.78-.78.78-2.05 0-2.83l-3.89-3.89 4.48-4.48zM5.04 6.94l1.89-1.9L8.2 6.31 7.02 7.5l1.41 1.41 1.19-1.19 1.2 1.2-1.9 1.9-3.88-3.88zm11.23 7.44-1.19 1.19 1.41 1.41 1.19-1.19 1.27 1.27-1.9 1.9-3.89-3.89 1.9-1.9 1.21 1.21zM6.41 19H5v-1.41l9.61-9.61 1.3 1.3.11.11L6.41 19zm9.61-12.44 1.41-1.41 1.41 1.41-1.41 1.41-1.41-1.41z"></path></svg>
									<p class="undefined NavigationItem_show__SIjWK">Management
										Dashboard</p></a></li>
							<li class="NavigationItem_nav__KEVsc"><a href="/help-center"><svg
										class="MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-vubbuv"
										focusable="false" aria-hidden="true" viewBox="0 0 24 24"
										data-testid="HelpOutlineOutlinedIcon">
										<path
											d="M11 18h2v-2h-2v2zm1-16C6.48 2 2 6.48 2 12s4.48 10 10 10 10-4.48 10-10S17.52 2 12 2zm0 18c-4.41 0-8-3.59-8-8s3.59-8 8-8 8 3.59 8 8-3.59 8-8 8zm0-14c-2.21 0-4 1.79-4 4h2c0-1.1.9-2 2-2s2 .9 2 2c0 2-3 1.75-3 5h2c0-2.25 3-2.5 3-5 0-2.21-1.79-4-4-4z"></path></svg>
									<p class="undefined NavigationItem_show__SIjWK">Help Center</p></a></li>
							<li class="NavigationItem_nav__KEVsc"><a
								href="/notification"><svg
										class="MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-vubbuv"
										focusable="false" aria-hidden="true" viewBox="0 0 24 24"
										data-testid="NotificationsNoneOutlinedIcon">
										<path
											d="M12 22c1.1 0 2-.9 2-2h-4c0 1.1.9 2 2 2zm6-6v-5c0-3.07-1.63-5.64-4.5-6.32V4c0-.83-.67-1.5-1.5-1.5s-1.5.67-1.5 1.5v.68C7.64 5.36 6 7.92 6 11v5l-2 2v1h16v-1l-2-2zm-2 1H8v-6c0-2.48 1.51-4.5 4-4.5s4 2.02 4 4.5v6z"></path></svg>
									<p class="undefined NavigationItem_show__SIjWK">Reminder</p></a></li>
						</div>
					</div>
				</div>
				<div>
					<div class="Header_headerContainer__BvTtA">
						<div class="Header_profile__b4ZQi">
							<span class="Header_profileimg__rIISa"><img
								src="/static/media/avatar.a6143582309785dca610.png" alt="avatar"></span>
							<p class="Header_name__DWqCl">Admin</p>
							<svg
								class="MuiSvgIcon-root MuiSvgIcon-fontSizeMedium Header_ArrowDown__8OzU5 css-vubbuv"
								focusable="false" aria-hidden="true" viewBox="0 0 24 24"
								data-testid="KeyboardArrowDownIcon">
								<path
									d="M7.41 8.59 12 13.17l4.59-4.58L18 10l-6 6-6-6 1.41-1.41z"></path></svg>
						</div>
					</div>
					<div class=""
						style="position: fixed; top: 0px; left: 0px; height: 2px; background: transparent; z-index: 2147483647; width: 100%;">
						<div class=""
							style="height: 100%; background: rgb(241, 25, 70); width: 0%; opacity: 1; color: rgb(241, 25, 70);">
							<div
								style="box-shadow: rgb(241, 25, 70) 0px 0px 10px, rgb(241, 25, 70) 0px 0px 5px; width: 5%; opacity: 1; position: absolute; height: 100%; transform: rotate(3deg) translate(0px, -4px); left: -5.5%;"></div>
						</div>
					</div>
					<div class="Container_PageHolder__0xvW1">
						<div class="UserManagement_container__sXMiI">
							<div class="UserManagement_upperContainer__cR4Il">
								<div class="UserManagement_filterOption__K+Vy7">
									<div class="Filter_InputBox__+mHt5">
										<select><option value="">Select Department</option>
											<option value="Super Admin">Super Admin</option>
											<option value="Admin">Admin</option>
											<option value="RECYCLE-CND">RECYCLE-CND</option>
											<option value="RECYCLE-CRM">RECYCLE-CRM</option>
											<option value="MSW">MSW</option>
											<option value="BMW">BMW</option>
											<option value="IWM">IWM</option>
											<option value="RECYCLE-PLASTIC">RECYCLE-PLASTIC</option>
											<option value="RECYCLE-ALL">RECYCLE-ALL</option>
											<option value="RECYCLE">RECYCLE</option>
											<option value="MANAGEMENT DASHBOARD">MANAGEMENT
												DASHBOARD</option>
											<option value="ADMIN">ADMIN</option></select>
									</div>
									<div class="Filter_InputBox__+mHt5">
										<select><option value="">Select Site</option>
											<option value="Noida">Noida</option>
											<option value="RecycleCDNewDelhi">RecycleCDNewDelhi</option>
											<option value="RECYCLE_TEST_2">RECYCLE_TEST_2</option>
											<option value="Guntur- CRM">Guntur- CRM</option>
											<option value="RecycleCRMNewDelhi">RecycleCRMNewDelhi</option>
											<option value="RECYCLE_TEST_CRM">RECYCLE_TEST_CRM</option>
											<option value="MSW_NEW_DELHI">MSW_NEW_DELHI</option>
											<option value="MSW_BHOPAL">MSW_BHOPAL</option>
											<option value="MswGurgaon">MswGurgaon</option>
											<option value="MSW_MEERUT">MSW_MEERUT</option>
											<option value="MSW_Gurgaon">MSW_Gurgaon</option>
											<option value="Rewa">Rewa</option>
											<option value="Katni">Katni</option>
											<option value="New Delhi">New Delhi</option>
											<option value="Raipur">Raipur</option>
											<option value="Dhanbad">Dhanbad</option>
											<option value="Belgaum">Belgaum</option>
											<option value="Sagar">Sagar</option>
											<option value="Bilaspur">Bilaspur</option>
											<option value="Shimoga">Shimoga</option>
											<option value="HiMSW">HiMSW</option>
											<option value="MSW-Haldia">MSW-Haldia</option>
											<option value="Guntur_MSW">Guntur_MSW</option>
											<option value="BMW_NOIDA">BMW_NOIDA</option>
											<option value="Haldia">Haldia</option>
											<option value="BMW_Delhi">BMW_Delhi</option>
											<option value="Kanpur">Kanpur</option>
											<option value="Ghaziabad">Ghaziabad</option>
											<option value="Hyderabad">Hyderabad</option>
											<option value="Maridi-Hyd">Maridi-Hyd</option>
											<option value="Ahmedabad">Ahmedabad</option>
											<option value="Ludhiana">Ludhiana</option>
											<option value="Durgapur">Durgapur</option>
											<option value="Kalyani">Kalyani</option>
											<option value="Howrah">Howrah</option>
											<option value="Muzaffarpur">Muzaffarpur</option>
											<option value="Mumbai-Taloja">Mumbai-Taloja</option>
											<option value="Chennai">Chennai</option>
											<option value="Salem">Salem</option>
											<option value="Madurai">Madurai</option>
											<option value="Mangalore">Mangalore</option>
											<option value="Lohardaga">Lohardaga</option>
											<option value="Jamshedpur">Jamshedpur</option>
											<option value="Chandigarh">Chandigarh</option>
											<option value="Bangalore">Bangalore</option>
											<option value="Maridi-Blr">Maridi-Blr</option>
											<option value="Guntur BMW">Guntur BMW</option>
											<option value="BMW_Durgapur">BMW_Durgapur</option>
											<option value="BMW_Mangalore">BMW_Mangalore</option>
											<option value="IWM_Noida">IWM_Noida</option>
											<option value="Iwm_newdelhi">Iwm_newdelhi</option>
											<option value="AWMPL">AWMPL</option>
											<option value="BWMP">BWMP</option>
											<option value="CWMP-Vskp">CWMP-Vskp</option>
											<option value="CWMP-Nellore">CWMP-Nellore</option>
											<option value="New Delhi IWM">New Delhi IWM</option>
											<option value="HWMP">HWMP</option>
											<option value="KWMP">KWMP</option>
											<option value="MPWMP(PIWMPL)">MPWMP(PIWMPL)</option>
											<option value="MWML">MWML</option>
											<option value="OWMP">OWMP</option>
											<option value="PWMP">PWMP</option>
											<option value="RWMP">RWMP</option>
											<option value="SALTORA">SALTORA</option>
											<option value="TNWML-Gummidipundi">TNWML-Gummidipundi</option>
											<option value="TNWML-Madurai">TNWML-Madurai</option>
											<option value="UPWMP">UPWMP</option>
											<option value="WBWML">WBWML</option>
											<option value="Guntur IWM">Guntur IWM</option>
											<option value="Plastics-Hyd">Plastics-Hyd</option>
											<option value="RECYCLE_TEST">RECYCLE_TEST</option>
											<option value="RecyclePlasticNewDelhi">RecyclePlasticNewDelhi</option>
											<option value="Recycle Plastic - Gurgaon">Recycle
												Plastic - Gurgaon</option>
											<option value="Recycle CND-Gurgaon">Recycle
												CND-Gurgaon</option>
											<option value="ReRecycleCRMNewDelhi">ReRecycleCRMNewDelhi</option>
											<option value="Recycle_NOIDA">Recycle_NOIDA</option>
											<option value="Recycle_CRM_Gurgoan">Recycle_CRM_Gurgoan</option>
											<option value="RecycleCRM_BHOPAL">RecycleCRM_BHOPAL</option>
											<option value="Guntur- Plastics">Guntur- Plastics</option>
											<option value="Hyd-Jeedimetla">Hyd-Jeedimetla</option>
											<option value="Hyd-Fathulguda">Hyd-Fathulguda</option>
											<option value="Guntur - C&amp;D">Guntur - C&amp;D</option>
											<option value="Plastics-Vskp">Plastics-Vskp</option>
											<option value="Plastics-Haldia">Plastics-Haldia</option>
											<option value="Plastics-Raipur">Plastics-Raipur</option>
											<option value="DRCC-DEHRADUN ">DRCC-DEHRADUN</option>
											<option value="MWML-CRM">MWML-CRM</option>
											<option value="DMSW-CRM">DMSW-CRM</option>
											<option value="HIMSW-CRM">HIMSW-CRM</option>
											<option value="DRCC-HYDERABAD">DRCC-HYDERABAD</option>
											<option value="HWMP-CRM">HWMP-CRM</option>
											<option value="TNWML-CRM">TNWML-CRM</option>
											<option value=" HYDERABAD -Maridi Bio IWM">
												HYDERABAD -Maridi Bio IWM</option>
											<option value="RecyclePlasticDelhi">RecyclePlasticDelhi</option>
											<option value="Gunut-C&amp;D">Gunut-C&amp;D</option>
											<option value="BMW_Madurai">BMW_Madurai</option></select>
									</div>
									<div class="Filter_InputBox__+mHt5">
										<select><option value="">Select Role</option>
											<option value="ROLE_SUPER-ADMIN">ROLE_SUPER-ADMIN</option>
											<option value="ROLE_ADMIN">ROLE_ADMIN</option>
											<option value="ROLE_RECYCLE-CND-P&amp;D">ROLE_RECYCLE-CND-P&amp;D</option>
											<option value="ROLE_RECYCLE-CND-SITEHEAD">ROLE_RECYCLE-CND-SITEHEAD</option>
											<option value="ROLE_RECYCLE-CND-BUSINESSHEAD">ROLE_RECYCLE-CND-BUSINESSHEAD</option>
											<option value="ROLE_RECYCLE-CRM-P&amp;D">ROLE_RECYCLE-CRM-P&amp;D</option>
											<option value="ROLE_RECYCLE-CRM-SITEHEAD">ROLE_RECYCLE-CRM-SITEHEAD</option>
											<option value="ROLE_RECYCLE-CRM-BUSINESSHEAD">ROLE_RECYCLE-CRM-BUSINESSHEAD</option>
											<option value="ROLE_MSW-C&amp;T">ROLE_MSW-C&amp;T</option>
											<option value="ROLE_MSW-P&amp;D">ROLE_MSW-P&amp;D</option>
											<option value="ROLE_MSW-WTE">ROLE_MSW-WTE</option>
											<option value="ROLE_MSW-SITEHEAD">ROLE_MSW-SITEHEAD</option>
											<option value="ROLE_MSW-SBUHEAD">ROLE_MSW-SBUHEAD</option>
											<option value="ROLE_BMW-P&amp;D">ROLE_BMW-P&amp;D</option>
											<option value="ROLE_BMW-SITEHEAD">ROLE_BMW-SITEHEAD</option>
											<option value="ROLE_BMW-SBUHEAD">ROLE_BMW-SBUHEAD</option>
											<option value="ROLE_IWM-SITEHEAD">ROLE_IWM-SITEHEAD</option>
											<option value="ROLE_IWM-SBUHEAD">ROLE_IWM-SBUHEAD</option>
											<option value="ROLE_IWM-P&amp;D">ROLE_IWM-P&amp;D</option>
											<option value="ROLE_RECYCLE-PLASTIC-P&amp;D">ROLE_RECYCLE-PLASTIC-P&amp;D</option>
											<option value="ROLE_RECYCLE-ALL-SBUHEAD">ROLE_RECYCLE-ALL-SBUHEAD</option>
											<option value="ROLE_RECYCLE-PLASTIC-BUSINESSHEAD">ROLE_RECYCLE-PLASTIC-BUSINESSHEAD</option>
											<option value="ROLE_MANAGEMENT-USER">ROLE_MANAGEMENT-USER</option>
											<option value="ROLE_RECYCLE-PLASTIC-SITEHEAD">ROLE_RECYCLE-PLASTIC-SITEHEAD</option></select>
									</div>
									<div class="Button_buttonContainer__beRFD">
										<button type="button" class="Button_Button__SuWO+">Filter
										</button>
									</div>
								</div>
								<div class="UserManagement_rightSide__8Sg+p">
									<div class="Button_buttonContainer__beRFD"
										style="justify-content: left;">
										<button class="Button_Button__SuWO+">Add New User</button>
									</div>
									<div class="Button_buttonContainer__beRFD"
										style="justify-content: left;">
										<button class="Button_Button__SuWO+">Add New Role</button>
									</div>
									<svg
										class="MuiSvgIcon-root MuiSvgIcon-fontSizeLarge css-zgg8bi"
										focusable="false" aria-hidden="true" viewBox="0 0 24 24"
										data-testid="FileDownloadOutlinedIcon">
										<path
											d="M18 15v3H6v-3H4v3c0 1.1.9 2 2 2h12c1.1 0 2-.9 2-2v-3h-2zm-1-4-1.41-1.41L13 12.17V4h-2v8.17L8.41 9.59 7 11l5 5 5-5z"></path></svg>
								</div>
							</div>
							<div class="UserManagement_fliterContainer__iVOEB">
								<div>
									<div class="pagination_page__B6+l5 css-ikzlcq">
										<nav aria-label="pagination navigation"
											class="MuiPagination-root MuiPagination-outlined css-0">
											<ul class="MuiPagination-ul css-nhb8h9">
												<li><button
														class="MuiButtonBase-root Mui-disabled MuiPaginationItem-root MuiPaginationItem-sizeMedium MuiPaginationItem-outlined MuiPaginationItem-rounded Mui-disabled MuiPaginationItem-previousNext css-2gftvx"
														tabindex="-1" type="button" disabled=""
														aria-label="Go to previous page">
														<svg
															class="MuiSvgIcon-root MuiSvgIcon-fontSizeMedium MuiPaginationItem-icon css-lrb33l"
															focusable="false" aria-hidden="true" viewBox="0 0 24 24"
															data-testid="NavigateBeforeIcon">
															<path d="M15.41 7.41L14 6l-6 6 6 6 1.41-1.41L10.83 12z"></path></svg>
													</button></li>
												<li><button
														class="MuiButtonBase-root MuiPaginationItem-root MuiPaginationItem-sizeMedium MuiPaginationItem-outlined MuiPaginationItem-rounded Mui-selected MuiPaginationItem-page css-2gftvx"
														tabindex="0" type="button" aria-label="page 1"
														aria-current="true">
														1<span class="MuiTouchRipple-root css-w0pj6f"></span>
													</button></li>
												<li><button
														class="MuiButtonBase-root MuiPaginationItem-root MuiPaginationItem-sizeMedium MuiPaginationItem-outlined MuiPaginationItem-rounded MuiPaginationItem-page css-2gftvx"
														tabindex="0" type="button" aria-label="Go to page 2">
														2<span class="MuiTouchRipple-root css-w0pj6f"></span>
													</button></li>
												<li><button
														class="MuiButtonBase-root MuiPaginationItem-root MuiPaginationItem-sizeMedium MuiPaginationItem-outlined MuiPaginationItem-rounded MuiPaginationItem-page css-2gftvx"
														tabindex="0" type="button" aria-label="Go to page 3">
														3<span class="MuiTouchRipple-root css-w0pj6f"></span>
													</button></li>
												<li><button
														class="MuiButtonBase-root MuiPaginationItem-root MuiPaginationItem-sizeMedium MuiPaginationItem-outlined MuiPaginationItem-rounded MuiPaginationItem-page css-2gftvx"
														tabindex="0" type="button" aria-label="Go to page 4">
														4<span class="MuiTouchRipple-root css-w0pj6f"></span>
													</button></li>
												<li><button
														class="MuiButtonBase-root MuiPaginationItem-root MuiPaginationItem-sizeMedium MuiPaginationItem-outlined MuiPaginationItem-rounded MuiPaginationItem-page css-2gftvx"
														tabindex="0" type="button" aria-label="Go to page 5">
														5<span class="MuiTouchRipple-root css-w0pj6f"></span>
													</button></li>
												<li><div
														class="MuiPaginationItem-root MuiPaginationItem-sizeMedium MuiPaginationItem-outlined MuiPaginationItem-rounded MuiPaginationItem-ellipsis css-16y9h98">…</div></li>
												<li><button
														class="MuiButtonBase-root MuiPaginationItem-root MuiPaginationItem-sizeMedium MuiPaginationItem-outlined MuiPaginationItem-rounded MuiPaginationItem-page css-2gftvx"
														tabindex="0" type="button" aria-label="Go to page 19">
														19<span class="MuiTouchRipple-root css-w0pj6f"></span>
													</button></li>
												<li><button
														class="MuiButtonBase-root MuiPaginationItem-root MuiPaginationItem-sizeMedium MuiPaginationItem-outlined MuiPaginationItem-rounded MuiPaginationItem-previousNext css-2gftvx"
														tabindex="0" type="button" aria-label="Go to next page">
														<svg
															class="MuiSvgIcon-root MuiSvgIcon-fontSizeMedium MuiPaginationItem-icon css-lrb33l"
															focusable="false" aria-hidden="true" viewBox="0 0 24 24"
															data-testid="NavigateNextIcon">
															<path d="M10 6L8.59 7.41 13.17 12l-4.58 4.59L10 18l6-6z"></path></svg>
														<span class="MuiTouchRipple-root css-w0pj6f"></span>
													</button></li>
											</ul>
										</nav>
									</div>
								</div>
								<div class="UserManagement_inputContainer__jw1ce">
									<input type="text" placeholder="Search..." value="">
								</div>
							</div>
							<div class="table_dataTable__NgabO">
								<table cellspacing="0" cellpadding="0">
									<thead>
										<tr class="table_tableHeader__aWo3s null">
											<th>S.No</th>
											<th>First Name</th>
											<th>Last Name</th>
											<th style="width: 210%;">Email Id</th>
											<th>Phone Number</th>
											<th>Department</th>
											<th>Categories</th>
											<th>Roles</th>
											<th>Site Name</th>
											<th>Not Filled Data Dates</th>
											<th style="width: 60%;">Action</th>
										</tr>
									</thead>
									<tbody>
										<tr class="table_tableBody__WF67o null">
											<td>1</td>
											<td>Harikesh</td>
											<td>Rawat</td>
											<td style="width: 210%;">harikesh.rawat@resustainability.com</td>
											<td>9109976555</td>
											<td>MSW</td>
											<td>MSW-Collect</td>
											<td>ROLE_MSW-C&amp;T</td>
											<td>Raipur</td>
											<td>NA</td>
											<td><svg
													class="MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-vubbuv"
													focusable="false" aria-hidden="true" viewBox="0 0 24 24"
													data-testid="EditIcon">
													<path
														d="M3 17.25V21h3.75L17.81 9.94l-3.75-3.75L3 17.25zM20.71 7.04c.39-.39.39-1.02 0-1.41l-2.34-2.34a.9959.9959 0 0 0-1.41 0l-1.83 1.83 3.75 3.75 1.83-1.83z"></path></svg>
												<svg
													class="MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-vubbuv"
													focusable="false" aria-hidden="true" viewBox="0 0 24 24"
													data-testid="DeleteIcon">
													<path
														d="M6 19c0 1.1.9 2 2 2h8c1.1 0 2-.9 2-2V7H6v12zM19 4h-3.5l-1-1h-5l-1 1H5v2h14V4z"></path></svg></td>
										</tr>
									</tbody>
								</table>
							</div>
							<div class="TableBottom_totalUsers__hcTxA">
								<p class="TableBottom_tableText__cKJkK">Showing 1 to 10 of
									189 Users</p>
								<div>
									<div class="pagination_page__B6+l5 css-ikzlcq">
										<nav aria-label="pagination navigation"
											class="MuiPagination-root MuiPagination-outlined css-0">
											<ul class="MuiPagination-ul css-nhb8h9">
												<li><button
														class="MuiButtonBase-root Mui-disabled MuiPaginationItem-root MuiPaginationItem-sizeMedium MuiPaginationItem-outlined MuiPaginationItem-rounded Mui-disabled MuiPaginationItem-previousNext css-2gftvx"
														tabindex="-1" type="button" disabled=""
														aria-label="Go to previous page">
														<svg
															class="MuiSvgIcon-root MuiSvgIcon-fontSizeMedium MuiPaginationItem-icon css-lrb33l"
															focusable="false" aria-hidden="true" viewBox="0 0 24 24"
															data-testid="NavigateBeforeIcon">
															<path d="M15.41 7.41L14 6l-6 6 6 6 1.41-1.41L10.83 12z"></path></svg>
													</button></li>
												<li><button
														class="MuiButtonBase-root MuiPaginationItem-root MuiPaginationItem-sizeMedium MuiPaginationItem-outlined MuiPaginationItem-rounded Mui-selected MuiPaginationItem-page css-2gftvx"
														tabindex="0" type="button" aria-label="page 1"
														aria-current="true">
														1<span class="MuiTouchRipple-root css-w0pj6f"></span>
													</button></li>
												<li><button
														class="MuiButtonBase-root MuiPaginationItem-root MuiPaginationItem-sizeMedium MuiPaginationItem-outlined MuiPaginationItem-rounded MuiPaginationItem-page css-2gftvx"
														tabindex="0" type="button" aria-label="Go to page 2">
														2<span class="MuiTouchRipple-root css-w0pj6f"></span>
													</button></li>
												<li><button
														class="MuiButtonBase-root MuiPaginationItem-root MuiPaginationItem-sizeMedium MuiPaginationItem-outlined MuiPaginationItem-rounded MuiPaginationItem-page css-2gftvx"
														tabindex="0" type="button" aria-label="Go to page 3">
														3<span class="MuiTouchRipple-root css-w0pj6f"></span>
													</button></li>
												<li><button
														class="MuiButtonBase-root MuiPaginationItem-root MuiPaginationItem-sizeMedium MuiPaginationItem-outlined MuiPaginationItem-rounded MuiPaginationItem-page css-2gftvx"
														tabindex="0" type="button" aria-label="Go to page 4">
														4<span class="MuiTouchRipple-root css-w0pj6f"></span>
													</button></li>
												<li><button
														class="MuiButtonBase-root MuiPaginationItem-root MuiPaginationItem-sizeMedium MuiPaginationItem-outlined MuiPaginationItem-rounded MuiPaginationItem-page css-2gftvx"
														tabindex="0" type="button" aria-label="Go to page 5">
														5<span class="MuiTouchRipple-root css-w0pj6f"></span>
													</button></li>
												<li><div
														class="MuiPaginationItem-root MuiPaginationItem-sizeMedium MuiPaginationItem-outlined MuiPaginationItem-rounded MuiPaginationItem-ellipsis css-16y9h98">…</div></li>
												<li><button
														class="MuiButtonBase-root MuiPaginationItem-root MuiPaginationItem-sizeMedium MuiPaginationItem-outlined MuiPaginationItem-rounded MuiPaginationItem-page css-2gftvx"
														tabindex="0" type="button" aria-label="Go to page 19">
														19<span class="MuiTouchRipple-root css-w0pj6f"></span>
													</button></li>
												<li><button
														class="MuiButtonBase-root MuiPaginationItem-root MuiPaginationItem-sizeMedium MuiPaginationItem-outlined MuiPaginationItem-rounded MuiPaginationItem-previousNext css-2gftvx"
														tabindex="0" type="button" aria-label="Go to next page">
														<svg
															class="MuiSvgIcon-root MuiSvgIcon-fontSizeMedium MuiPaginationItem-icon css-lrb33l"
															focusable="false" aria-hidden="true" viewBox="0 0 24 24"
															data-testid="NavigateNextIcon">
															<path d="M10 6L8.59 7.41 13.17 12l-4.58 4.59L10 18l6-6z"></path></svg>
														<span class="MuiTouchRipple-root css-w0pj6f"></span>
													</button></li>
											</ul>
										</nav>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			<div class="Toastify"></div>
		</div>
	</div>
	<svg id="SvgjsSvg1001" width="2" height="0"
		xmlns="http://www.w3.org/2000/svg" version="1.1"
		xmlns:xlink="http://www.w3.org/1999/xlink"
		xmlns:svgjs="http://svgjs.dev"
		style="overflow: hidden; top: -100%; left: -100%; position: absolute; opacity: 0;">
		<defs id="SvgjsDefs1002"></defs>
		<polyline id="SvgjsPolyline1003" points="0,0"></polyline>
		<path id="SvgjsPath1004" d="M0 0 "></path></svg>
</body>
</html>