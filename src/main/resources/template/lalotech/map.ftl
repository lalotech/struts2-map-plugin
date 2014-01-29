<#assign escapedOptionId="${parameters.id?string?replace('.', '_')}">
<div style="width:${parameters.get("width")};height:${parameters.get("height")}">
<div id="${escapedOptionId?html}" style="width:100%;height:100%"></div>
</div>
<#assign escapedId="${parameters.id?string?replace('.', '_')}">
<script type='text/javascript'>
//$(function () { 
        //implementacion de mapa        
        var ${escapedId?html}Options = {}
        
        //options of map
        <#if parameters.zoom??>
        ${escapedId?html}Options.zoom = ${parameters.zoom?c}
        <#else>
        ${escapedId?html}Options.zoom = 8
        </#if>
        <#if parameters.mapTypeId??>
        ${escapedId?html}Options.mapTypeId = google.maps.MapTypeId.${parameters.get("mapTypeId")}
        <#else>
        ${escapedId?html}Options.mapTypeId = google.maps.MapTypeId.ROADMAP
        </#if>
        <#if parameters.center??>
        ${escapedId?html}Options.center = new google.maps.LatLng(${parameters.center})
        <#else>
        ${escapedId?html}Options.center = new google.maps.LatLng(0, 0)
        </#if>
        <#if parameters.maxZoom??>
        ${escapedId?html}Options.maxZoom = ${parameters.get("maxZoom")}
        </#if>
        <#if parameters.minZoom??>
        ${escapedId?html}Options.minZoom = ${parameters.get("minZoom")}
        </#if>
        
        //mapa
        var ${escapedId?html} = new google.maps.Map(document.getElementById('${escapedId?html}'),${escapedId?html}Options);

        //Markers        
        <@s.iterator value="parameters.markers" status="it">            
            var marker<@s.property value="%{#it.count}" />Options = {}
            marker<@s.property value="%{#it.count}" />Options.position = new google.maps.LatLng(<@s.property value="latlon.latitude"/>,<@s.property value="latlon.longitude"/>);
            marker<@s.property value="%{#it.count}" />Options.map = ${escapedId?html};
            marker<@s.property value="%{#it.count}" />Options.title = "<@s.property value='title'/>";
            <@s.if test="icon != null && icon != ''">
            marker<@s.property value="%{#it.count}" />Options.icon = "<@s.url value="%{icon}"/>"
            </@s.if>            
            var marker<@s.property value="%{#it.count}" /> = new google.maps.Marker(marker<@s.property value="%{#it.count}" />Options);
            <@s.if test="infowindow != null && infowindow != ''">
            //infoWindow
            var marker<@s.property value="%{#it.count}"/>InfoWindow = new google.maps.InfoWindow({
                content: "<@s.property value='infowindow'/>"
            });
            //click infoWindow
            google.maps.event.addListener(marker<@s.property value="%{#it.count}"/>, 'click', function() {
                marker<@s.property value="%{#it.count}"/>InfoWindow.open(${escapedId?html},marker<@s.property value="%{#it.count}" />);
            });
            </@s.if>            
        </@s.iterator>
        
        //bounds
        <@s.if test="parameters.markers.size > 0">            
            var ${escapedId?html}LatLngList = new Array ();
            <@s.if test="parameters.markers.size == 1">
                //si solo es 1 centrar en esta posicion.
                ${escapedId?html}.setCenter(marker1.getPosition());
            </@s.if>
            <@s.else>                
                ${escapedId?html}bounds = new google.maps.LatLngBounds ();            
                <@s.iterator value="parameters.markers" status="it">
                    ${escapedId?html}LatLngList[<@s.property value="%{#it.count-1}" />] = marker<@s.property value="%{#it.count}" />.getPosition();
                </@s.iterator>
                for (var i = 0; i < ${escapedId?html}LatLngList.length; i++) {
                    ${escapedId?html}bounds.extend (${escapedId?html}LatLngList[i]);
                }
                ${escapedId?html}.fitBounds (${escapedId?html}bounds);
            </@s.else>
        </@s.if>
        
        <#if parameters.polylines?default(false)>
            //Polyline's
            if(${escapedId?html}LatLngList.length > 1){
                var ${escapedId?html}PolylinesOptions = {}
                <#if parameters.polylinesStrokeColor??>
                    ${escapedId?html}PolylinesOptions.strokeColor = "${parameters.polylinesStrokeColor}";
                </#if>
                <#if parameters.polylinesStrokeOpacity??>
                    ${escapedId?html}PolylinesOptions.strokeOpacity = ${parameters.polylinesStrokeOpacity};
                </#if>
                <#if parameters.polylinesStrokeWeight??>
                    ${escapedId?html}PolylinesOptions.strokeWeight = ${parameters.polylinesStrokeWeight};
                </#if>
                    ${escapedId?html}PolylinesOptions.path = ${escapedId?html}LatLngList;
                var ${escapedId?html}Polylines = new google.maps.Polyline(${escapedId?html}PolylinesOptions);
                ${escapedId?html}Polylines.setMap(${escapedId?html});                
            }
        </#if>
        <#if parameters.polygon?default(false)>
            //Polygon
            if(${escapedId?html}LatLngList.length > 2){
            var ${escapedId?html}PolygonOptions = {}
                ${escapedId?html}PolygonOptions.paths = ${escapedId?html}LatLngList;
                <#if parameters.polygonStrokeColor??>
                    ${escapedId?html}PolygonOptions.strokeColor = "${parameters.polygonStrokeColor}";
                </#if>
                <#if parameters.polygonStrokeOpacity??>
                    ${escapedId?html}PolygonOptions.strokeOpacity = ${parameters.polygonStrokeOpacity};
                </#if>
                <#if parameters.polygonStrokeWeight??>
                    ${escapedId?html}PolygonOptions.strokeWeight = ${parameters.polygonStrokeWeight};
                </#if>
                <#if parameters.polygonFillColor??>
                    ${escapedId?html}PolygonOptions.fillColor = "${parameters.polygonFillColor}";
                </#if>
                <#if parameters.polygonFillOpacity??>
                    ${escapedId?html}PolygonOptions.fillOpacity = ${parameters.polygonFillOpacity};
                </#if>
                var ${escapedId?html}PolygonData = new google.maps.Polygon(${escapedId?html}PolygonOptions);
                ${escapedId?html}PolygonData.setMap(${escapedId?html});
            }
        </#if> 
        
        //Geocercas        
        <@s.iterator value="parameters.geocercas" status="it">            
            var geocerca<@s.property value="%{#it.count}" />Options = {}
            <@s.if test="strokeColor!=null && strokeColor != ''">
            geocerca<@s.property value="%{#it.count}" />Options.strokeColor = "${strokeColor}";
            </@s.if>
            <@s.if test="strokeOpacity!=null">
            geocerca<@s.property value="%{#it.count}" />Options.strokeOpacity = ${strokeOpacity};
            </@s.if>
            <@s.if test="strokeWeight!=null">
            geocerca<@s.property value="%{#it.count}" />Options.strokeWeight = ${strokeWeight};
            </@s.if>
            <@s.if test="fillColor!=null && fillColor != ''">
            geocerca<@s.property value="%{#it.count}" />Options.fillColor = "${fillColor}"
            </@s.if>
            <@s.if test="fillOpacity!=null">
            geocerca<@s.property value="%{#it.count}" />Options.fillOpacity = ${fillOpacity};
            </@s.if>
            <@s.if test="zIndex!=null">
            geocerca<@s.property value="%{#it.count}" />Options.zIndex = ${zIndex}
            </@s.if>                       
            geocerca<@s.property value="%{#it.count}" />Options.center = new google.maps.LatLng(<@s.property value='center.latitude'/>,<@s.property value='center.longitude'/>);
            geocerca<@s.property value="%{#it.count}" />Options.radius = <@s.property value='radius'/>;
            geocerca<@s.property value="%{#it.count}" />Options.map = ${escapedId?html};            
            var geocerca<@s.property value="%{#it.count}" /> = new google.maps.Circle(geocerca<@s.property value="%{#it.count}"/>Options);
            <@s.if test="(parameters.markers == null || parameters.markers.size == 0) && #it.first">
                ${escapedId?html}.setCenter(geocerca<@s.property value="%{#it.count}" />.getCenter());
            </@s.if>

        </@s.iterator>
        
        //Events
        //'click' 'dblclick' 'mouseover' 'mouseout' 'rightclick'

        <#if parameters.eventOnClick??>
             google.maps.event.addListener(${escapedId?html}, 'click', function(event) {
                 ${parameters.eventOnClick}(event,${escapedId?html});
            });
        </#if>
        <#if parameters.eventOnDblclick??>
             google.maps.event.addListener(${escapedId?html}, 'dblclick', function(event) {
                 ${parameters.eventOnDblclick}(event,${escapedId?html});
            });
        </#if> 
        <#if parameters.eventOnMouseOut??>
             google.maps.event.addListener(${escapedId?html}, 'mouseout', function(event) {
                 ${parameters.eventOnMouseOut}(event,${escapedId?html});
            });
        </#if>
        <#if parameters.eventOnMouseOver??>
             google.maps.event.addListener(${escapedId?html}, 'mouseover', function(event) {
                 ${parameters.eventOnMouseOver}(event,${escapedId?html});
            });
        </#if>  
        <#if parameters.eventOnRightClick??>
             google.maps.event.addListener(${escapedId?html}, 'rightclick', function(event) {
                 ${parameters.eventOnRightClick}(event,${escapedId?html});
            });
        </#if>