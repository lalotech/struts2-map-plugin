<#assign Id="${parameters.id?string?replace('.', '_')}">
<script type="text/javascript">
    $(function () { 
        $("#${Id?html}").portlet();
    });
</script>
<div id="${Id?html}" class="portlet ui-widget-content ui-helper-clearfix ui-corner-all ${parameters.cssClass?default('')}" >
            <div class="portlet-header ui-widget-header ui-helper-clearfix ui-corner-all">
                ${parameters.title?default('')}
                <span class='ui-icon ui-icon-plusthick' style="float: right"></span>
            </div>
            <div class="portlet-content">