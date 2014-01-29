/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.lalotech.struts2.map.views.jsp.ui;

import com.opensymphony.xwork2.util.ValueStack;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import net.lalotech.struts2.map.components.MarkerItem;
import org.apache.struts2.components.Component;
import org.apache.struts2.views.jsp.ui.AbstractUITag;

/**
 *
 * @author Windows7x64
 */
public class MarkerItemTag extends AbstractUITag {
    protected String mapid;
    protected String latlon;
    protected String icon;
    protected String map;

    @Override
    public Component getBean(ValueStack stack, HttpServletRequest req, HttpServletResponse res) {
        return new MarkerItem(stack, req, res);
    }

    @Override
    protected void populateParams() {
        super.populateParams();                        
        MarkerItem mi = (MarkerItem)component;
        mi.setIcon(icon);
        mi.setMap(map);
        mi.setLatlon(latlon);        
    }

    public void setMapid(String mapid) {
        this.mapid = mapid;
    }   

    public void setLatlon(String latlon) {
        this.latlon = latlon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public void setMap(String map) {
        this.map = map;
    }    
}
