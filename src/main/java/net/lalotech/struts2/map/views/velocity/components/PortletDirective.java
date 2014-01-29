/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.lalotech.struts2.map.views.velocity.components;

import com.opensymphony.xwork2.util.ValueStack;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import net.lalotech.struts2.map.components.Portlet;
import org.apache.struts2.components.Component;
import static org.apache.velocity.runtime.directive.DirectiveConstants.BLOCK;

/**
 *
 * @author lalotech
 */
public class PortletDirective extends LalotechAbstractDirective {

    @Override
    public String getBeanName() {
        return "portlet";
    }

    @Override
    protected Component getBean(ValueStack vs, HttpServletRequest hsr, HttpServletResponse hsr1) {
        return new Portlet(vs, hsr, hsr1);
    }
    @Override
    public int getType() {
        return BLOCK;
    }
    
}
