/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.lalotech.struts2.map.components;

import com.opensymphony.xwork2.util.ValueStack;
import java.util.Random;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts2.components.UIBean;
import org.apache.struts2.views.annotations.StrutsTag;
import org.apache.struts2.views.annotations.StrutsTagAttribute;
import org.apache.struts2.views.annotations.StrutsTagSkipInheritance;

/**
 *
 * @author lalotech
 */

@StrutsTag(name = "polylineItem",
tldTagClass = "net.lalotech.struts2.map.views.jsp.ui.PolylineItemTag",
description = "Constructs a Google Maps polyline.",
allowDynamicAttributes = true)
public class PolylineItem extends UIBean {
    
    public static final String TEMPLATE = "polyline";    
    public static final transient Random RANDOM = new Random();
    protected boolean throwExceptionOnNullValueAttribute = false;
    
    private String from;
    private String to;    
    private String strokeColor = "#FF0000";
    private String strokeOpacity = "1.0";
    private String strokeWeight = "2";

    public PolylineItem(ValueStack stack, HttpServletRequest request, HttpServletResponse response) {
        super(stack, request, response);
    }
    
    @Override
    protected String getDefaultTemplate() {
        return TEMPLATE;
    }
    @Override
    protected void evaluateExtraParams() {
        super.evaluateExtraParams();
        net.lalotech.struts2.map.components.Map m = (net.lalotech.struts2.map.components.Map) findAncestor(net.lalotech.struts2.map.components.Map.class);
        if(m != null) addParameter("mapid", m.getId());
        if(from != null) addParameter("from", findString(from));
        if(from != null) addParameter("to", findString(to));
        if(strokeColor != null) addParameter("strokeColor", findString(strokeColor));
        if(strokeOpacity != null) addParameter("strokeOpacity", findString(strokeOpacity));
        if(strokeWeight != null) addParameter("strokeWeight", findString(strokeWeight));
        if ((this.id == null || this.id.length() == 0)) {
            // resolves Math.abs(Integer.MIN_VALUE) issue reported by FindBugs
            // http://findbugs.sourceforge.net/bugDescriptions.html#RV_ABSOLUTE_VALUE_OF_RANDOM_INT
            int nextInt = RANDOM.nextInt();
            nextInt = nextInt == Integer.MIN_VALUE ? Integer.MAX_VALUE : Math.abs(nextInt);
            this.id = "polyline_" + String.valueOf(nextInt);
            addParameter("id", this.id);
        }
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
    
    /**
     * @param strokeColor the strokeColor to set
     */
    @StrutsTagAttribute(name = "strokeColor", description = "specifies a hexadecimal HTML color of the format \"#FFFFFF\". The Polyline class does not support named colors.")
    public void setStrokeColor(String strokeColor) {
        this.strokeColor = strokeColor;
    }

    /**
     * @param strokeOpacity the strokeOpacity to set
     */
    @StrutsTagAttribute(name = "strokeOpacity", description = "specifies a numerical fractional value between 0.0 and 1.0 (default) of the opacity of the line's color.")
    public void setStrokeOpacity(String strokeOpacity) {
        this.strokeOpacity = strokeOpacity;
    }

    /**
     * @param strokeWeight the strokeWeight to set
     */
    @StrutsTagAttribute(name = "strokeWeight", description = "specifies the weight of the line's stroke in pixels.")
    public void setStrokeWeight(String strokeWeight) {
        this.strokeWeight = strokeWeight;
    }
    
    /**
     * @param from the from to set with String
     */
    @StrutsTagAttribute(name = "from", description = "From coordinate",required=true)
    public void setFrom(String from) {
        this.from = from;
    }
    
    /**
     * @param to the to to set with String
     */
    @StrutsTagAttribute(name = "to", description = "To coordinate",required=true)
    public void setTo(String to) {
        this.to = to;
    }
}
