/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.lalotech.struts2.map.views.velocity.components;

import com.opensymphony.xwork2.util.ValueStack;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import net.lalotech.struts2.map.components.Map;
import org.apache.struts2.components.Component;

/**
 *
 * @author Windows7x64
 */
public class MapDirective extends LalotechAbstractDirective{
    
    public String getBeanName() {
        return "map";
    }

    protected Component getBean(ValueStack stack, HttpServletRequest req, HttpServletResponse res) {
        return new Map(stack, req, res);
    }
    @Override
    public int getType() {
        return BLOCK;
    }
    
}
