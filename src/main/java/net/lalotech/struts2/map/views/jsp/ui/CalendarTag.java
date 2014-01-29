/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.lalotech.struts2.map.views.jsp.ui;

import com.opensymphony.xwork2.util.ValueStack;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import net.lalotech.struts2.map.components.Calendar;
import org.apache.struts2.components.Component;
import org.apache.struts2.views.jsp.ui.AbstractUITag;

/**
 *
 * @author Windows7x64
 */
public class CalendarTag extends AbstractUITag {

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

    @Override
    public Component getBean(ValueStack stack, HttpServletRequest req, HttpServletResponse res) {
        return new Calendar(stack, req, res);
    }

    @Override
    protected void populateParams() {
        super.populateParams();
        Calendar c = (Calendar) component;

        //data
        c.setEvents(events);

        //events
        c.setDayClick(dayClick);
        c.setEventClick(eventClick);
        c.setEventMouseover(eventMouseover);
        c.setEventMouseout(eventMouseout);
        c.setEventDrop(eventDrop);
        c.setEventResize(eventResize);
        c.setEventDragStart(eventDragStart);
        c.setEventDragStop(eventDragStop);
        c.setEventResizeStart(eventResizeStart);
        c.setEventResizeStop(eventResizeStop);
        c.setEventRender(eventRender);
        c.setEventAfterRender(eventAfterRender);
        

        //option agendaWeek and agendaDay
        c.setAllDaySlot(allDaySlot);
        c.setAllDayText(allDayText);
        c.setAxisFormat(axisFormat);
        c.setSlotMinutes(slotMinutes);
        c.setDefaultEventMinutes(defaultEventMinutes);
        c.setFirstHour(firstHour);
        c.setMinTime(minTime);
        c.setMaxTime(maxTime);

        //options
        c.setHeaderLeft(headerLeft);
        c.setHeaderCenter(headerCenter);
        c.setHeaderRight(headerRight);
        c.setThemeUI(themeUI);
        c.setButtonIcons(buttonIcons);
        c.setFirstDay(firstDay);
        c.setIsRTL(isRTL);
        c.setWeekends(weekends);
        c.setWeekMode(weekMode);
        c.setHeight(height);
        c.setContentHeight(contentHeight);
        c.setAspectRatio(aspectRatio);
        c.setFormatDate(formatDate);
        c.setI18n(i18n);
        c.setDefaultView(defaultView);
        c.setEditable(editable);
        c.setGotoDate(gotoDate);

        //arrays 
        c.setTimeFormat(timeFormat);
        c.setColumnFormat(columnFormat);
        c.setTitleFormat(titleFormat);
        c.setButtonText(buttonText);
        c.setMonthNames(monthNames);
        c.setMonthNamesShort(monthNamesShort);
        c.setDayNames(dayNames);
        c.setDayNamesShort(dayNamesShort);

    }

    public void setEventDragStart(String eventDragStart) {
        this.eventDragStart = eventDragStart;
    }

    public void setEventDragStop(String eventDragStop) {
        this.eventDragStop = eventDragStop;
    }

    public void setEventResizeStart(String eventResizeStart) {
        this.eventResizeStart = eventResizeStart;
    }

    public void setEventResizeStop(String eventResizeStop) {
        this.eventResizeStop = eventResizeStop;
    }

    public void setEventRender(String eventRender) {
        this.eventRender = eventRender;
    }

    public void setEventAfterRender(String eventAfterRender) {
        this.eventAfterRender = eventAfterRender;
    }
    
    public void setGotoDate(String gotoDate) {
        this.gotoDate = gotoDate;
    }   

    public void setTitleFormat(String titleFormat) {
        this.titleFormat = titleFormat;
    }    

    public void setEditable(String editable) {
        this.editable = editable;
    }
    

    public void setEventDrop(String eventDrop) {
        this.eventDrop = eventDrop;
    }

    public void setEventResize(String eventResize) {
        this.eventResize = eventResize;
    }
    

    public void setAllDaySlot(String allDaySlot) {
        this.allDaySlot = allDaySlot;
    }

    public void setAllDayText(String allDayText) {
        this.allDayText = allDayText;
    }

    public void setAxisFormat(String axisFormat) {
        this.axisFormat = axisFormat;
    }

    public void setSlotMinutes(String slotMinutes) {
        this.slotMinutes = slotMinutes;
    }

    public void setDefaultEventMinutes(String defaultEventMinutes) {
        this.defaultEventMinutes = defaultEventMinutes;
    }

    public void setFirstHour(String firstHour) {
        this.firstHour = firstHour;
    }

    public void setMinTime(String minTime) {
        this.minTime = minTime;
    }

    public void setMaxTime(String maxTime) {
        this.maxTime = maxTime;
    }

    public void setDayClick(String dayClick) {
        this.dayClick = dayClick;
    }

    public void setEventClick(String eventClick) {
        this.eventClick = eventClick;
    }

    public void setEventMouseover(String eventMouseover) {
        this.eventMouseover = eventMouseover;
    }

    public void setEventMouseout(String eventMouseout) {
        this.eventMouseout = eventMouseout;
    }

    public void setDefaultView(String defaultView) {
        this.defaultView = defaultView;
    }

    public void setEvents(Object events) {
        this.events = events;
    }

    public void setHeaderLeft(String headerLeft) {
        this.headerLeft = headerLeft;
    }

    public void setHeaderCenter(String headerCenter) {
        this.headerCenter = headerCenter;
    }

    public void setHeaderRight(String headerRight) {
        this.headerRight = headerRight;
    }

    public void setThemeUI(String themeUI) {
        this.themeUI = themeUI;
    }

    public void setButtonIcons(String buttonIcons) {
        this.buttonIcons = buttonIcons;
    }

    public void setFirstDay(String firstDay) {
        this.firstDay = firstDay;
    }

    public void setIsRTL(String isRTL) {
        this.isRTL = isRTL;
    }

    public void setWeekends(String weekends) {
        this.weekends = weekends;
    }

    public void setWeekMode(String weekMode) {
        this.weekMode = weekMode;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public void setContentHeight(String contentHeight) {
        this.contentHeight = contentHeight;
    }

    public void setAspectRatio(String aspectRatio) {
        this.aspectRatio = aspectRatio;
    }

    public void setFormatDate(String formatDate) {
        this.formatDate = formatDate;
    }

    public void setTimeFormat(String timeFormat) {
        this.timeFormat = timeFormat;
    }

    public void setColumnFormat(String columnFormat) {
        this.columnFormat = columnFormat;
    }

    public void setButtonText(String buttonText) {
        this.buttonText = buttonText;
    }

    public void setMonthNames(String monthNames) {
        this.monthNames = monthNames;
    }

    public void setMonthNamesShort(String monthNamesShort) {
        this.monthNamesShort = monthNamesShort;
    }

    public void setDayNames(String dayNames) {
        this.dayNames = dayNames;
    }

    public void setDayNamesShort(String dayNamesShort) {
        this.dayNamesShort = dayNamesShort;
    }

    public void setI18n(String i18n) {
        this.i18n = i18n;
    }
}
