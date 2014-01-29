<#assign javaScriptBasePath="${base}/struts/">
<#assign basePath="${javaScriptBasePath}themes">
<#if parameters.jqueryplugincompatibility?default(false)>
    <!-- struts jquery plugin compatibility active no load style,scripts --->
<#else>
    <script type="text/javascript" src="${javaScriptBasePath}js/base/jquery-1.8.1.min.js"></script>
    <script type="text/javascript" src="${javaScriptBasePath}js/base/jquery-ui-1.8.23.custom.min.js"></script>
    <#if parameters.jquerytheme?if_exists != "">
        <link id="jquery_theme_link2" rel="stylesheet" href="${parameters.jquerytheme?string}/jquery-ui.css" type="text/css"/>
    <#else>
        <link id="jquery_theme_link2" rel="stylesheet" href="${basePath}/smoothness/jquery-ui.css" type="text/css"/>
    </#if>
</#if>

<#if parameters.googleapi?default(false)>
    <!--GOOGLE API-->
    <script src="https://maps.googleapis.com/maps/api/js?v=3.exp&sensor=false"></script>
</#if>
<#if parameters.fullcalendarapi?default(false)>
    <!--FULLCALENDAR API-->
    <script type="text/javascript" src="${javaScriptBasePath}js/fullcalendar/fullcalendar.min.js"></script>
    <link rel="stylesheet" href="${javaScriptBasePath}js/fullcalendar/fullcalendar.css" type="text/css"/>
</#if>

    <!-- Portlet -->
    <script type="text/javascript" src="${javaScriptBasePath}js/portlet/portlet-1.0.js"></script>
    <link rel="stylesheet" href="${javaScriptBasePath}js/portlet/portlet-1.0.css" type="text/css"/>
