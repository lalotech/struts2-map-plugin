<#assign escapedId="${parameters.id?string?replace('.', '_')}">
<script type='text/javascript'>
$(document).ready(function() {
    var ${escapedId}Options = {}

    <#if parameters.events??>
    <@s.if test="parameters.events.size > 0">
    ${escapedId}Options.events = new Array();
    <@s.iterator value="parameters.events" status="it">
    ${escapedId}Options.events[<@s.property value="#it.index"/>] ={id:${id},title: '${title}',start: '${start}',end : '${end}',allDay: false}
    </@s.iterator>
    </@s.if>
    </#if>

    <#if parameters.headerLeft?? || parameters.headerCenter?? || parameters.headerRight??> 
    ${escapedId}Options.header = {}
    ${escapedId}Options.header.left = '${parameters.headerLeft?default('')}'
    ${escapedId}Options.header.center = '${parameters.headerCenter?default('')}'
    ${escapedId}Options.header.right = '${parameters.headerRight?default('')}'
    </#if>
    <#if parameters.height??>
    ${escapedId}Options.height = ${parameters.height};
    </#if>
    <#if parameters.firstDay??>
    ${escapedId}Options.firstDay = ${parameters.firstDay};
    </#if>
    <#if parameters.defaultView??>
    ${escapedId}Options.defaultView = '${parameters.defaultView}';
    </#if>
    <#if parameters.themeUI??>
    ${escapedId}Options.theme = '${parameters.themeUI?default(false)}';
    </#if>    

    //Text/Time Customization
    <#if parameters.timeFormat??>
    ${escapedId}Options.timeFormat = ${parameters.timeFormat};
    </#if>
    <#if parameters.columnFormat??>    
    ${escapedId}Options.columnFormat = ${parameters.columnFormat};
    </#if>
    <#if parameters.titleFormat??>
    ${escapedId}Options.titleFormat = ${parameters.titleFormat};
    </#if>
    <#if parameters.buttonText??>
    ${escapedId}Options.buttonText = ${parameters.buttonText};
    </#if>
    <#if parameters.monthNames??>
    ${escapedId}Options.monthNames = ${parameters.monthNames};
    </#if>
    <#if parameters.monthNamesShort??>
    ${escapedId}Options.monthNamesShort = ${parameters.monthNamesShort};
    </#if>
    <#if parameters.dayNames??>
    ${escapedId}Options.dayNames = ${parameters.dayNames};
    </#if>
    <#if parameters.dayNamesShort??>
    ${escapedId}Options.dayNamesShort = ${parameters.dayNamesShort};
    </#if>
    
    //Agenda Options
    <#if parameters.allDaySlot??>
    ${escapedId}Options.allDaySlot = ${parameters.allDaySlot?string};
    </#if>
    <#if parameters.allDayText??>
    ${escapedId}Options.allDayText = '${parameters.allDayText}';
    </#if>
    <#if parameters.axisFormat??>
    ${escapedId}Options.axisFormat = '${parameters.axisFormat}';
    </#if>
    <#if parameters.slotMinutes??>
    ${escapedId}Options.slotMinutes = ${parameters.slotMinutes};
    </#if>
    <#if parameters.defaultEventMinutes??>
    ${escapedId}Options.defaultEventMinutes = ${parameters.defaultEventMinutes};
    </#if>
    <#if parameters.firstHour??>
    ${escapedId}Options.firstHour = ${parameters.firstHour};
    </#if>
    <#if parameters.minTime??>
    ${escapedId}Options.minTime = ${parameters.minTime};
    </#if>
    <#if parameters.maxTime??>
    ${escapedId}Options.maxTime = ${parameters.maxTime};
    </#if>
    <#if parameters.editable??>
    ${escapedId}Options.editable = ${parameters.editable?string};
    </#if>    

    <#if parameters.i18n??>
    //localization
    <@s.if test='parameters.i18n == "es"'>
    ${escapedId}Options.monthNames = ['Enero', 'Febrero', 'Marzo', 'Abril', 'Mayo', 'Junio', 'Julio','Agosto', 'Septiembre', 'Octubre', 'Noviembre', 'Diciembre'];
    ${escapedId}Options.dayNames = ['Domingo', 'Lunes', 'Martes', 'Miercoles', 'Jueves', 'Viernes', 'Sabado'];
    ${escapedId}Options.dayNamesShort = ['Dom', 'Lun', 'Mar', 'Mie', 'Jue', 'Vie', 'Sab'];
    ${escapedId}Options.monthNamesShort = ['Ene', 'Feb', 'Mar', 'Abr', 'May', 'Jun','Jul', 'Ago', 'Sep', 'Oct', 'Nov', 'Dic'];
    </@s.if>
    </#if>

    //Events
    <#if parameters.eventClick??>
    ${escapedId}Options.eventClick = function(calEvent, jsEvent, view){${parameters.eventClick}(calEvent, jsEvent, view);};
    </#if>
    <#if parameters.editable??>
    <@s.if test="parameters.editable == true">
    <#if parameters.dayClick??>    
    ${escapedId}Options.dayClick = function(date, allDay, jsEvent, view){${parameters.dayClick}(date, allDay, jsEvent, view);};
    </#if>
    <#if parameters.eventResize??>    
     ${escapedId}Options.eventResize = function(event,dayDelta,minuteDelta,revertFunc){${parameters.eventResize}(event,dayDelta,minuteDelta,revertFunc);};    
    </#if>
    <#if parameters.eventDrop??>    
     ${escapedId}Options.eventDrop = function(event, dayDelta, minuteDelta, allDay, revertFunc, jsEvent, ui, view ){${parameters.eventDrop}(event, dayDelta, minuteDelta, allDay, revertFunc, jsEvent, ui, view );};    
    </#if>
    <#if parameters.eventDragStart??>    
    ${escapedId}Options.eventDragStart = function(event, jsEvent, ui, view){${parameters.eventDragStart}(event, jsEvent, ui, view);};
    </#if>
    <#if parameters.eventDragStop??>    
    ${escapedId}Options.eventDragStop = function(event, jsEvent, ui, view){${parameters.eventDragStop}(event, jsEvent, ui, view);};
    </#if>
    <#if parameters.eventResizeStart??>    
     ${escapedId}Options.eventResizeStart = function(event, jsEvent, ui, view){${parameters.eventResizeStart}(event, jsEvent, ui, view);};    
    </#if>
    <#if parameters.eventResizeStop??>    
     ${escapedId}Options.eventResizeStop = function(event, jsEvent, ui, view){${parameters.eventResizeStop}(event, jsEvent, ui, view);};    
    </#if>
    <#if parameters.eventRender??>    
     ${escapedId}Options.eventRender = function(event, element, view){${parameters.eventRender}(event, element, view);};    
    </#if>
    <#if parameters.eventAfterRender??>    
     ${escapedId}Options.eventAfterRender = function(event, element, view ){${parameters.eventAfterRender}(event, element, view );};    
    </#if>
    </@s.if>
    </#if>    

    //Fullcalendar
    $('#${escapedId}').fullCalendar(${escapedId}Options);    

    <#if parameters.gotoDate??>
    $('#${escapedId}').fullCalendar('gotoDate',${parameters.gotoDate});
    </#if>

});
</script>