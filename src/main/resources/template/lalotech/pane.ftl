<div <#rt/>class="ui-widget ui-widget-content ui-corner-all" <#rt/><#include "/${parameters.templateDir}/simple/css.ftl" />>
<#if parameters.get("cssStyleTitle")??>
<h3 <#rt/>class="ui-helper-reset ui-helper-clearfix ui-widget-header ui-corner-all ui-dialog-title" style="margin:3px;padding-left:5px;min-height:30px;${parameters.get("cssStyleTitle")}">${parameters.title}</h3>
<#else>
<h3 <#rt/>class="ui-helper-reset ui-helper-clearfix ui-widget-header ui-corner-all ui-dialog-title" style="margin:3px;padding-left:5px;min-height:30px;">${parameters.title}</h3>
</#if>
<div>