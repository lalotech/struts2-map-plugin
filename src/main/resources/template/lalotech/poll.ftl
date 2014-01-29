<#assign Id="${parameters.id?string?replace('.', '_')}">
<script type='text/javascript'>
    var ${Id}_auto_refresh = setInterval(function(){
        $('#${parameters.id}').load('${parameters.url}');        
    }, <#if parameters.timestep??>${parameters.timestep}<#else>1000</#if>);
    <#if parameters.timeout??>
    setTimeout(function(){clearInterval(${Id}_auto_refresh)},${parameters.timeout});
    </#if>
</script>
<div id="${parameters.id}" <#if parameters.cssClass??>class="${parameters.cssClass}"</#if><#if parameters.cssStyle??> style="${parameters.cssStyle}"</#if>">

</div>