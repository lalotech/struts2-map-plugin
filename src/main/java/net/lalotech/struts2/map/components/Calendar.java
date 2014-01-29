/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.lalotech.struts2.map.components;

import com.opensymphony.xwork2.util.ValueStack;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Random;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts2.components.ClosingUIBean;
import org.apache.struts2.util.MakeIterator;
import org.apache.struts2.views.annotations.StrutsTag;
import org.apache.struts2.views.annotations.StrutsTagAttribute;
import org.apache.struts2.views.annotations.StrutsTagSkipInheritance;

/**
 *
 * @author Windows7x64
 */
@StrutsTag(name = "calendar",
tldTagClass = "net.lalotech.struts2.map.views.jsp.ui.CalendarTag",
description = "render one calendar base in fullcalendar implementacion",
allowDynamicAttributes = true)
public class Calendar extends ClosingUIBean {

    public static final transient Random RANDOM = new Random();
    //data
    public Object events;
    //events
    protected String dayClick;
    protected String eventClick;
    protected String eventMouseover;
    protected String eventMouseout;
    protected String eventDrop;
    protected String eventDragStart;
    protected String eventDragStop;
    protected String eventResize;
    protected String eventResizeStart;
    protected String eventResizeStop;
    protected String eventRender;
    protected String eventAfterRender;
    //options agendaWeek  and agendaDay
    protected String allDaySlot;
    protected String allDayText;
    protected String axisFormat;
    protected String slotMinutes;
    protected String defaultEventMinutes;
    protected String firstHour;
    protected String minTime;
    protected String maxTime;
    //options
    protected String headerLeft;
    protected String headerCenter;
    protected String headerRight;
    protected String themeUI;
    protected String buttonIcons;
    protected String firstDay;
    protected String isRTL;
    protected String weekends;
    protected String weekMode;
    protected String height;
    protected String contentHeight;
    protected String aspectRatio;
    protected String formatDate;
    protected String i18n;
    protected String defaultView;
    protected String editable;
    protected String gotoDate;
    //Array option
    protected String timeFormat;
    protected String columnFormat;
    protected String titleFormat;
    protected String buttonText;
    protected String monthNames;
    protected String monthNamesShort;
    protected String dayNames;
    protected String dayNamesShort;

    public Calendar(ValueStack stack, HttpServletRequest request, HttpServletResponse response) {
        super(stack, request, response);
    }

    @Override
    protected void evaluateExtraParams() {
        super.evaluateExtraParams();
        
                
        if(gotoDate != null){
            addParameter("gotoDate", findString(gotoDate));
        }

        //Agenda Options
        if (maxTime != null) {
            addParameter("maxTime", findValue(maxTime, Number.class));
        }
        if (minTime != null) {
            addParameter("minTime", findValue(minTime, Number.class));
        }
        if (firstHour != null) {
            addParameter("firstHour", findValue(firstHour, Number.class));
        }
        if (defaultEventMinutes != null) {
            addParameter("defaultEventMinutes", findValue(defaultEventMinutes, Number.class));
        }
        if (slotMinutes != null) {
            addParameter("slotMinutes", findValue(slotMinutes, Number.class));
        }
        if (axisFormat != null) {
            addParameter("axisFormat", findString(axisFormat));
        }
        if (allDayText != null) {
            addParameter("allDayText", findString(allDayText));
        }
        if (allDaySlot != null) {
            addParameter("allDaySlot", findValue(allDaySlot, Boolean.class));
        }

        //events
        if(eventAfterRender != null){
            addParameter("eventAfterRender", findString(eventAfterRender));
        }
        
        if(eventRender != null){
            addParameter("eventRender", findString(eventRender));
        }
        
        if(eventResizeStop != null){
            addParameter("eventResizeStop", findString(eventResizeStop));
        }
        
        if(eventResizeStart != null){
            addParameter("eventResizeStart", findString(eventResizeStart));
        }
        
        if(eventDragStop != null){
            addParameter("eventDragStop", findString(eventDragStop));
        }
        
        if(eventDragStart != null){
            addParameter("eventDragStart", findString(eventDragStart));
        }
        if (dayClick != null) {
            addParameter("dayClick", findString(dayClick));
        }
        if (eventClick != null) {
            addParameter("eventClick", findString(eventClick));
        }
        if (eventMouseover != null) {
            addParameter("eventMouseover", findString(eventMouseover));
        }
        if (eventMouseout != null) {
            addParameter("eventMouseout", findString(eventMouseout));
        }
        if (eventDrop != null) {
            addParameter("eventDrop", findString(eventDrop));
        }
        if (eventResize != null) {
            addParameter("eventResize", findString(eventResize));
        }
        
        
        
        if(editable != null){
            addParameter("editable", findValue(editable,Boolean.class));
        }
        if (defaultView != null) {
            addParameter("defaultView", findString(defaultView));
        }
        if (i18n != null) {
            addParameter("i18n", findString(i18n));
        }

        if (dayNamesShort != null) {
            addParameter("dayNamesShort", findString(dayNamesShort));
        }
        if (dayNames != null) {
            addParameter("dayNames", findString(dayNames));
        }
        if (monthNamesShort != null) {
            addParameter("monthNamesShort", findString(monthNamesShort));
        }
        if (monthNames != null) {
            addParameter("monthNames", findString(monthNames));
        }
        if (buttonIcons != null) {
            addParameter("buttonIcons", findString(buttonIcons));
        }
        if (buttonText != null) {
            addParameter("buttonText", findString(buttonText));
        }
        if(titleFormat !=null){
            addParameter("titleFormat", findString(titleFormat));
        }
        if (columnFormat != null) {
            addParameter("columnFormat", findString(columnFormat));
        }
        if (timeFormat != null) {
            addParameter("timeFormat", findString(timeFormat));
        }
        if (formatDate != null) {
            addParameter("formatDate", findString(formatDate));
        }
        if (aspectRatio != null) {
            addParameter("aspectRatio", findString(aspectRatio));
        }
        if (contentHeight != null) {
            addParameter("contentHeight", findString(contentHeight));
        }
        if (height != null) {
            addParameter("height", findValue(height, Number.class));
        }
        if (weekMode != null) {
            addParameter("weekMode", findString(weekMode));
        }
        if (weekends != null) {
            addParameter("weekends", findValue(weekends, Boolean.class));
        }
        if (isRTL != null) {
            addParameter("isRTL", findString(isRTL));
        }
        if (firstDay != null) {
            addParameter("firstDay", findString(firstDay));
        }
        if (buttonIcons != null) {
            addParameter("buttonIcons", findString(buttonIcons));
        }

        if (themeUI != null) {
            addParameter("themeUI", findValue(themeUI, Boolean.class));
        }

        if (headerLeft != null) {
            addParameter("headerLeft", findString(headerLeft));
        }
        if (headerCenter != null) {
            addParameter("headerCenter", findString(headerCenter));
        }
        if (headerRight != null) {
            addParameter("headerRight", findString(headerRight));
        }

        //events
        Object value = null;
        if (events == null) {
            events = parameters.get("events");
        }
        if (events instanceof String) {
            value = findValue((String) events);
        } else if (events instanceof Collection) {
            value = events;
        } else if (MakeIterator.isIterable(events)) {
            value = MakeIterator.convert(events);
        }
        if (value instanceof Collection) {
            addParameter("events", value);
        } else {
            addParameter("events", MakeIterator.convert(value));
        }
        if (value instanceof Collection) {
            addParameter("eventsSize", Integer.valueOf(((Collection) value).size()));
        } else if (value instanceof java.util.Map) {
            addParameter("eventsSize", Integer.valueOf(((java.util.Map) value).size()));
        } else if (value != null && value.getClass().isArray()) {
            addParameter("eventsSize", Integer.valueOf(Array.getLength(value)));
        }
        //end-events

        if ((this.id == null || this.id.length() == 0)) {
            // resolves Math.abs(Integer.MIN_VALUE) issue reported by FindBugs
            // http://findbugs.sourceforge.net/bugDescriptions.html#RV_ABSOLUTE_VALUE_OF_RANDOM_INT
            int nextInt = RANDOM.nextInt();
            nextInt = nextInt == Integer.MIN_VALUE ? Integer.MAX_VALUE : Math.abs(nextInt);
            this.id = "calendar_" + String.valueOf(nextInt);
            addParameter("id", this.id);
        }
    }

    @Override
    public String getDefaultOpenTemplate() {
        return "calendar";
    }

    @Override
    protected String getDefaultTemplate() {
        return "calendar-close";
    }

    @Override
    public String getTheme() {
        return "lalotech";
    }

    @Override
    @StrutsTagSkipInheritance
    public void setTheme(String theme) {
        super.setTheme(theme);
    }

    @StrutsTagAttribute(name = "eventDragStart",description = "")
    public void setEventDragStart(String eventDragStart) {
        this.eventDragStart = eventDragStart;
    }

    @StrutsTagAttribute(name = "eventDragStop",description = "")
    public void setEventDragStop(String eventDragStop) {
        this.eventDragStop = eventDragStop;
    }

    @StrutsTagAttribute(name = "eventResizeStart",description = "")
    public void setEventResizeStart(String eventResizeStart) {
        this.eventResizeStart = eventResizeStart;
    }

    @StrutsTagAttribute(name = "eventResizeStop",description = "")
    public void setEventResizeStop(String eventResizeStop) {
        this.eventResizeStop = eventResizeStop;
    }

    @StrutsTagAttribute(name = "eventRender",description = "")
    public void setEventRender(String eventRender) {
        this.eventRender = eventRender;
    }
    
    @StrutsTagAttribute(name = "eventAfterRender",description = "")
    public void setEventAfterRender(String eventAfterRender) {
        this.eventAfterRender = eventAfterRender;
    }    
    
    @StrutsTagAttribute(name="gotoDate",description="Moves the calendar to an arbitrary year/month/date.")
    public void setGotoDate(String gotoDate) {
        this.gotoDate = gotoDate;
    }    
    
    @StrutsTagAttribute(name="titleFormat",description="Determines the text that will be displayed in the header's title.")
    public void setTitleFormat(String titleFormat) {
        this.titleFormat = titleFormat;
    }   
    @StrutsTagAttribute(name = "eventDrop", description = "")
    public void setEventDrop(String eventDrop) {
        this.eventDrop = eventDrop;
    }

    @StrutsTagAttribute(name = "eventResize", description = "")
    public void setEventResize(String eventResize) {
        this.eventResize = eventResize;
    }

    @StrutsTagAttribute(name = "editable", description = "", defaultValue = "false", type = "Boolean")
    public void setEditable(String editable) {
        this.editable = editable;
    }

    @StrutsTagAttribute(name = "allDaySlot", description = "Determines if the \"all-day\" slot is displayed at the top of the calendar.", defaultValue = "true", type = "Boolean")
    public void setAllDaySlot(String allDaySlot) {
        this.allDaySlot = allDaySlot;
    }

    @StrutsTagAttribute(name = "allDayText", description = "The text titling the \"all-day\" slot at the top of the calendar.")
    public void setAllDayText(String allDayText) {
        this.allDayText = allDayText;
    }

    @StrutsTagAttribute(name = "axisFormat", description = "Determines the time-text that will be displayed on the vertical axis of the agenda views.")
    public void setAxisFormat(String axisFormat) {
        this.axisFormat = axisFormat;
    }

    @StrutsTagAttribute(name = "slotMinutes", description = "The frequency for displaying time slots, in minutes.", defaultValue = "30", type = "Number")
    public void setSlotMinutes(String slotMinutes) {
        this.slotMinutes = slotMinutes;
    }

    @StrutsTagAttribute(name = "eventMinutes", description = "Determines the length (in minutes) an event appears to be when it has an unspecified end date.", defaultValue = "120", type = "Number")
    public void setDefaultEventMinutes(String defaultEventMinutes) {
        this.defaultEventMinutes = defaultEventMinutes;
    }

    @StrutsTagAttribute(name = "firstHour", description = "Determines the first hour that will be visible in the scroll pane.", defaultValue = "6", type = "Number")
    public void setFirstHour(String firstHour) {
        this.firstHour = firstHour;
    }

    @StrutsTagAttribute(name = "minTime", description = "Determines the first hour/time that will be displayed, even when the scrollbars have been scrolled all the way up.", defaultValue = "0", type = "Number")
    public void setMinTime(String minTime) {
        this.minTime = minTime;
    }

    @StrutsTagAttribute(name = "maxTime", description = "Determines the last hour/time (exclusively) that will be displayed, even when the scrollbars have been scrolled all the way down.", defaultValue = "24", type = "Number")
    public void setMaxTime(String maxTime) {
        this.maxTime = maxTime;
    }

    @StrutsTagAttribute(name = "dayClick", description = "callback the dayClick event")
    public void setDayClick(String dayClick) {
        this.dayClick = dayClick;
    }

    @StrutsTagAttribute(name = "eventClick", description = "callback the eventClick event")
    public void setEventClick(String eventClick) {
        this.eventClick = eventClick;
    }

    @StrutsTagAttribute(name = "eventMouseover", description = "callback the eventMouseover event")
    public void setEventMouseover(String eventMouseover) {
        this.eventMouseover = eventMouseover;
    }

    @StrutsTagAttribute(name = "eventMouseout", description = "callback the eventMouseout event")
    public void setEventMouseout(String eventMouseout) {
        this.eventMouseout = eventMouseout;
    }

    @StrutsTagAttribute(name = "defaultView", description = "")
    public void setDefaultView(String defaultView) {
        this.defaultView = defaultView;
    }

    @StrutsTagAttribute(name = "events", description = "")
    public void setEvents(Object events) {
        this.events = events;
    }

    @StrutsTagAttribute(name = "headerLeft", description = "")
    public void setHeaderLeft(String headerLeft) {
        this.headerLeft = headerLeft;
    }

    @StrutsTagAttribute(name = "headerCenter", description = "")
    public void setHeaderCenter(String headerCenter) {
        this.headerCenter = headerCenter;
    }

    @StrutsTagAttribute(name = "headerRight", description = "")
    public void setHeaderRight(String headerRight) {
        this.headerRight = headerRight;
    }

    @StrutsTagAttribute(name = "themeUI", description = "", defaultValue = "false", type = "Boolean")
    public void setThemeUI(String themeUI) {
        this.themeUI = themeUI;
    }

    @StrutsTagAttribute(name = "buttonIcons", description = "")
    public void setButtonIcons(String buttonIcons) {
        this.buttonIcons = buttonIcons;
    }

    @StrutsTagAttribute(name = "firstDay", description = "")
    public void setFirstDay(String firstDay) {
        this.firstDay = firstDay;
    }

    @StrutsTagAttribute(name = "isRTL", description = "", defaultValue = "false", type = "Boolean")
    public void setIsRTL(String isRTL) {
        this.isRTL = isRTL;
    }

    @StrutsTagAttribute(name = "weekends", description = "", defaultValue = "false", type = "Boolean")
    public void setWeekends(String weekends) {
        this.weekends = weekends;
    }

    @StrutsTagAttribute(name = "weekMode", description = "")
    public void setWeekMode(String weekMode) {
        this.weekMode = weekMode;
    }

    @StrutsTagAttribute(name = "height", description = "", type = "Number")
    public void setHeight(String height) {
        this.height = height;
    }

    @StrutsTagAttribute(name = "contentHeight", description = "")
    public void setContentHeight(String contentHeight) {
        this.contentHeight = contentHeight;
    }

    @StrutsTagAttribute(name = "aspectRatio", description = "")
    public void setAspectRatio(String aspectRatio) {
        this.aspectRatio = aspectRatio;
    }

    @StrutsTagAttribute(name = "formatDate", description = "")
    public void setFormatDate(String formatDate) {
        this.formatDate = formatDate;
    }

    @StrutsTagAttribute(name = "timeFormat", description = "Determines the time-text that will be displayed on each event.")
    public void setTimeFormat(String timeFormat) {
        this.timeFormat = timeFormat;
    }

    @StrutsTagAttribute(name = "columnFormat", description = "Determines the text that will be displayed on the calendar's column headings.")
    public void setColumnFormat(String columnFormat) {
        this.columnFormat = columnFormat;
    }

    @StrutsTagAttribute(name = "buttonText", description = "Text that will be displayed on buttons of the header.")
    public void setButtonText(String buttonText) {
        this.buttonText = buttonText;
    }

    @StrutsTagAttribute(name = "monthNames", description = "Full names of months.")
    public void setMonthNames(String monthNames) {
        this.monthNames = monthNames;
    }

    @StrutsTagAttribute(name = "monthNamesShort", description = "Abbreviated names of months.")
    public void setMonthNamesShort(String monthNamesShort) {
        this.monthNamesShort = monthNamesShort;
    }

    @StrutsTagAttribute(name = "dayNames", description = "Full names of days-of-week.")
    public void setDayNames(String dayNames) {
        this.dayNames = dayNames;
    }

    @StrutsTagAttribute(name = "dayNamesShort", description = "Abbreviated names of days-of-week.")
    public void setDayNamesShort(String dayNamesShort) {
        this.dayNamesShort = dayNamesShort;
    }

    @StrutsTagAttribute(name = "i18n", description = "", defaultValue = "en", type = "String")
    public void setI18n(String i18n) {
        this.i18n = i18n;
    }
}
