/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.lalotech.struts2.map.views.jsp.ui;

import com.opensymphony.xwork2.util.ValueStack;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import net.lalotech.struts2.map.components.PolylineItem;
import org.apache.struts2.components.Component;
import org.apache.struts2.views.jsp.ui.AbstractUITag;

/**
 *
 * @author lalotech
 */
public class PolylineItemTag extends AbstractUITag {
    
    private String from;
    private String to;    
    private String strokeColor = "#FF0000";
    private String strokeOpacity = "1.0";
    private String strokeWeight = "2";

    @Override
    public Component getBean(ValueStack vs, HttpServletRequest hsr, HttpServletResponse hsr1) {
        return new PolylineItem(vs, hsr, hsr1);
    }
    @Override
    protected void populateParams() {
        super.populateParams();
        PolylineItem mp = (PolylineItem) component;
        mp.setFrom(from);
        mp.setTo(to);
        mp.setStrokeColor(strokeColor);
        mp.setStrokeOpacity(strokeOpacity);
        mp.setStrokeWeight(strokeWeight);
    }

    /**
     * @param from the from to set
     */
    public void setFrom(String from) {
        this.from = from;
    }

    /**
     * @param to the to to set
     */
    public void setTo(String to) {
        this.to = to;
    }
    
    /**
     * @param strokeColor the strokeColor to set
     */
    public void setStrokeColor(String strokeColor) {
        this.strokeColor = strokeColor;
    }

    /**
     * @param strokeOpacity the strokeOpacity to set
     */
    public void setStrokeOpacity(String strokeOpacity) {
        this.strokeOpacity = strokeOpacity;
    }

    /**
     * @param strokeWeight the strokeWeight to set
     */
    public void setStrokeWeight(String strokeWeight) {
        this.strokeWeight = strokeWeight;
    }   
}
