/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.lalotech.struts2.map.components;

import com.opensymphony.xwork2.util.ValueStack;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts2.components.UIBean;
import org.apache.struts2.views.annotations.StrutsTag;
import org.apache.struts2.views.annotations.StrutsTagAttribute;

/**
 *
 * @author lalotech
 */
@StrutsTag(name="head",tldTagClass="net.lalotech.struts2.map.views.jsp.ui.HeadTag",description="Tag to include scripts and css files.")
public class Head extends UIBean{
    
    protected String jquerytheme;
    protected String googleapi;
    protected String fullcalendarapi;
    protected String jqueryplugincompatibility;

    public Head(ValueStack stack, HttpServletRequest request, HttpServletResponse response) {
        super(stack, request, response);
    }    

    @Override
    protected String getDefaultTemplate() {
        return "head";
    }

    @Override
    public String getTheme() {
        return "lalotech";
    }
    
    @Override
    protected void evaluateExtraParams() {
        super.evaluateExtraParams();        
         
        if(jqueryplugincompatibility != null){
            addParameter("jqueryplugincompatibility", findValue(jqueryplugincompatibility,Boolean.class));
        }
        if(jquerytheme!=null){
            addParameter("jquerytheme", findString(jquerytheme));
        }
        if(googleapi != null){
            addParameter("googleapi", findValue(googleapi,Boolean.class));
        }
        if(fullcalendarapi != null){
            addParameter("fullcalendarapi", findValue(fullcalendarapi, Boolean.class));
        }
    }
    @StrutsTagAttribute(name="jqueryplugincompatibility",description="active compatibility with struts-jquery-plugin",defaultValue="false",type="Boolean")
    public void setJqueryplugincompatibility(String jqueryplugincompatibility) {
        this.jqueryplugincompatibility = jqueryplugincompatibility;
    }    
    @StrutsTagAttribute(name="jquerytheme",description="change de ui theme for custom")
    public void setJquerytheme(String jquerytheme) {
        this.jquerytheme = jquerytheme;
    } 
    @StrutsTagAttribute(name="googleapi",description="include Google API script",defaultValue="false",type="Boolean")
    public void setGoogleapi(String googleapi) {
        this.googleapi = googleapi;
    }
    @StrutsTagAttribute(name="fullcalendarapi",description="include Fullcalendar API scripts and styles.")
    public void setFullcalendarapi(String fullcalendarapi) {
        this.fullcalendarapi = fullcalendarapi;
    }
    
    
}
