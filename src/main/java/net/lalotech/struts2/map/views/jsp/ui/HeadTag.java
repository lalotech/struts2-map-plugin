/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.lalotech.struts2.map.views.jsp.ui;

import com.opensymphony.xwork2.util.ValueStack;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import net.lalotech.struts2.map.components.Head;
import org.apache.struts2.components.Component;
import org.apache.struts2.views.jsp.ComponentTagSupport;

/**
 *
 * @author lalotech
 */
public class HeadTag extends ComponentTagSupport{
    protected String jquerytheme;
    protected String googleapi;
    protected String fullcalendarapi;
    protected String jqueryplugincompatibility;

    @Override
    public Component getBean(ValueStack vs, HttpServletRequest hsr, HttpServletResponse hsr1) {
        return new Head(vs, hsr, hsr1);
    }

    @Override
    protected void populateParams() {
        super.populateParams();
        Head h = (Head)component;
        h.setJquerytheme(jquerytheme);
        h.setGoogleapi(googleapi);
        h.setFullcalendarapi(fullcalendarapi);
        h.setJqueryplugincompatibility(jqueryplugincompatibility);
    }

    public void setJqueryplugincompatibility(String jqueryplugincompatibility) {
        this.jqueryplugincompatibility = jqueryplugincompatibility;
    }    

    public void setJquerytheme(String jquerytheme) {
        this.jquerytheme = jquerytheme;
    }    

    public void setGoogleapi(String googleapi) {
        this.googleapi = googleapi;
    }    

    public void setFullcalendarapi(String fullcalendarapi) {
        this.fullcalendarapi = fullcalendarapi;
    }   
}
