/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.lalotech.model;

/**
 *
 * @author Windows7x64
 */
public class EventModel {
    int id;
    String title;
    boolean allDay = false; 
    String start;
    String end;
    String url;
    String className;
    boolean editable;
    String source;
    String color;
    String backgroundColor;
    String borderColor;
    String textColor;

    /**
     * Test constructor model comun
     * @param id
     * @param title
     * @param start
     * @param end
     * @param url 
     */
    public EventModel(int id, String title, String start, String end, String url) {
        this.id = id;
        this.title = title;        
        this.start = start;
        this.end = end;
        this.url = url;        
    }
    /**
     * Basic Constructor 
     * @param title
     * @param start
     * @param end 
     */
    public EventModel(int id,String title, String start, String end) {        
        this.id = id;
        this.title = title;        
        this.start = start;
        this.end = end;        
    }
    /**
     * String/Integer. Optional
     * Uniquely identifies the given event. Different instances of repeating events should all have the same id.
     * @param id 
     */
    public void setId(int id) {
        this.id = id;
    }
    /**
     * String. Required.
     * The text on an event's element
     * @param title 
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * true or false. Optional.
     * Whether an event occurs at a specific time-of-day. This property affects whether an event's time is shown. Also, in the agenda views, determines if it is displayed in the "all-day" section.
     * Don't include quotes around your true/false. This value is not a string!
     * When specifying Event Objects for events or eventSources, omitting this property will make it inherit from allDayDefault, which is normally true.
     * @param allDay 
     */
    public void setAllDay(boolean allDay) {
        this.allDay = allDay;
    }
    /**
     * Date. Required.
     * The date/time an event begins.
     * When specifying Event Objects for events or eventSources, you may specify a string in IETF format (ex: "Wed, 18 Oct 2009 13:00:00 EST"), a string in ISO8601 format (ex: "2009-11-05T13:15:30Z") or a UNIX timestamp.
     * @param start 
     */
    public void setStart(String start) {
        this.start = start;
    }

    /**
     * Date. Optional.
     * The date/time an event ends.
     * As with start, you may specify it in IETF, ISO8601, or UNIX timestamp format.
     * If an event is all-day...
     * the end date is inclusive. This means an event with start Nov 10 and end Nov 12 will span 3 days on the calendar.
     * If an event is NOT all-day...
     * the end date is exclusive. This is only a gotcha when your end has time 00:00. It means your event ends on midnight, and it will not span through the next day.
     * @param end 
     */
    public void setEnd(String end) {
        this.end = end;
    }
    /**
     * String. Optional.
     * A URL that will be visited when this event is clicked by the user. For more information on controlling this behavior, see the eventClick callback.
     * @param url 
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * String/Array. Optional.
     * A CSS class (or array of classes) that will be attached to this event's element.
     * @param className 
     */
    public void setClassName(String className) {
        this.className = className;
    }
    /**
     * true or false. Optional.
     * Overrides the master editable option for this single event.
     * @param editable 
     */
    public void setEditable(boolean editable) {
        this.editable = editable;
    }
    /**
     * Event Source Object. Automatically populated.
     * A reference to the event source that this event came from.
     * @param source 
     */
    public void setSource(String source) {
        this.source = source;
    }
    /**
     * Sets an event's background and border color just like the calendar-wide eventColor option.
     * @param color 
     */
    public void setColor(String color) {
        this.color = color;
    }
    /**
     * Sets an event's background color just like the calendar-wide eventBackgroundColor option.
     * @param backgroundColor 
     */
    public void setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }
    /**
     * Sets an event's border color just like the the calendar-wide eventBorderColor option.
     * @param borderColor 
     */
    public void setBorderColor(String borderColor) {
        this.borderColor = borderColor;
    }
    
    /**
     * Sets an event's text color just like the calendar-wide eventTextColor option.
     * @param textColor 
     */
    public void setTextColor(String textColor) {
        this.textColor = textColor;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public boolean isAllDay() {
        return allDay;
    }

    public String getStart() {
        return start;
    }

    public String getEnd() {
        return end;
    }

    public String getUrl() {
        return url;
    }

    public String getClassName() {
        return className;
    }

    public boolean isEditable() {
        return editable;
    }

    public String getSource() {
        return source;
    }

    public String getColor() {
        return color;
    }

    public String getBackgroundColor() {
        return backgroundColor;
    }

    public String getBorderColor() {
        return borderColor;
    }

    public String getTextColor() {
        return textColor;
    }

   
    
}
