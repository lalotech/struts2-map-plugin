/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.lalotech.struts2.map.views.velocity.components;

import com.opensymphony.xwork2.util.ValueStack;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import net.lalotech.struts2.map.components.PolylineItem;
import org.apache.struts2.components.Component;

/**
 *
 * @author lalotech
 */
public class PolylineItemDirective extends LalotechAbstractDirective{
    public String getBeanName() {
        return "polyline";
    }
    protected Component getBean(ValueStack stack, HttpServletRequest req, HttpServletResponse res) {
        return new PolylineItem(stack, req, res);
    }
    @Override
    public int getType() {
        return BLOCK;
    }
}
