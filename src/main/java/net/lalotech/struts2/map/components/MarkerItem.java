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

/**
 *
 * @author Windows7x64
 */
@StrutsTag(name = "markerItem", tldTagClass = "net.lalotech.struts2.map.views.jsp.ui.MarkerItemTag",
description = "Constructs a Google Maps marker.")
public class MarkerItem extends UIBean {

    public static final transient Random RANDOM = new Random();
    
    protected String latlon;
    protected String icon;
    protected String map;

    public MarkerItem(ValueStack stack, HttpServletRequest request, HttpServletResponse response) {
        super(stack, request, response);
    }

    @Override
    protected void evaluateExtraParams() {
        super.evaluateExtraParams();

        net.lalotech.struts2.map.components.Map m = (net.lalotech.struts2.map.components.Map) findAncestor(net.lalotech.struts2.map.components.Map.class);
        if (m != null) {
            addParameter("mapid", m.getId());
        }

        if (icon != null) {
            addParameter("icon", findString(icon));
        }
        if (latlon != null) {
            addParameter("latlon", findString(latlon));
        }
        if (map != null) {
            addParameter("map", findString(map));
        }
        if ((this.id == null || this.id.length() == 0)) {            
            int nextInt = RANDOM.nextInt();
            nextInt = nextInt == Integer.MIN_VALUE ? Integer.MAX_VALUE : Math.abs(nextInt);
            this.id = "marker_" + String.valueOf(nextInt);
            addParameter("id", this.id);
        }
    }

    @Override
    protected String getDefaultTemplate() {
        return "marker";
    }

    @Override
    public String getTheme() {
        return "lalotech";
    }

    @StrutsTagAttribute(name = "latlon", description = "coordenates to the marker",required=true)
    public void setLatlon(String latlon) {
        this.latlon = latlon;
    }

    @StrutsTagAttribute(name = "icon", description = "path to img show icon")
    public void setIcon(String icon) {
        this.icon = icon;
    }

    @StrutsTagAttribute(name = "map", description = "")
    public void setMap(String map) {
        this.map = map;
    }
}
