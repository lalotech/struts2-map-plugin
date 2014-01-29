<#assign escapedId="${parameters.id?string?replace('.', '_')}">
var ${escapedId?html}Options = {};
${escapedId?html}Options.position = new google.maps.LatLng(${parameters.latlon});
<#if parameters.title??>
${escapedId?html}Options.title = '${parameters.title}';
</#if>
<#if parameters.icon??>
${escapedId?html}Options.icon = '${parameters.icon}'
</#if>
var ${escapedId?html} = new google.maps.Marker(${escapedId?html}Options);
${escapedId?html}.setMap(${parameters.get("mapid")});