<#assign escapedId="${parameters.id?string?replace('.', '_')}">
    var PL_${escapedId?html}_CO = [
        new google.maps.LatLng(${parameters.get("from")}),
        new google.maps.LatLng(${parameters.get("to")})
    ];

    var PL_${escapedId?html} = new google.maps.Polyline({
    path: PL_${escapedId?html}_CO,
    strokeColor: "${parameters.strokeColor}",
    strokeOpacity: ${parameters.strokeOpacity},
    strokeWeight: ${parameters.strokeWeight}
    });

    PL_${escapedId?html}.setMap(${parameters.get("mapid")});