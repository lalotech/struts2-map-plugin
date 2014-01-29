/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.lalotech.struts2.map.components;

import com.opensymphony.xwork2.util.ValueStack;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts2.components.ClosingUIBean;
import org.apache.struts2.views.annotations.StrutsTag;
import org.apache.struts2.views.annotations.StrutsTagAttribute;
import org.apache.struts2.views.annotations.StrutsTagSkipInheritance;

/**
 *
 * @author lalotech
 */
@StrutsTag(name="pane",
        tldTagClass="net.lalotech.struts2.map.views.jsp.ui.PaneTag",
        description="Render one container with ui-style.",allowDynamicAttributes=true)
public class Pane extends ClosingUIBean{
    
    protected String cssStyleTitle;
    
    public Pane(ValueStack stack, HttpServletRequest request, HttpServletResponse response){
        super(stack, request, response);
    }

    @Override
    public String getDefaultOpenTemplate() {
        return "pane";
    }

    @Override
    protected String getDefaultTemplate() {
        return "pane-close";
    }

    @Override
    public String getTheme() {
        return "lalotech";
    }   
    @StrutsTagAttribute(name="title",description="title of pane",required=true)
    @StrutsTagSkipInheritance
    @Override
    public void setTitle(String title) {
        super.setTitle(title);
    }
    @StrutsTagAttribute(name="cssStyleTitle",description="style css for h3 tag title.")
    public void setCssStyleTitle(String cssStyleTitle) {
        this.cssStyleTitle = cssStyleTitle;
    }

    @Override
    protected void evaluateExtraParams() {
        super.evaluateExtraParams();
        if(cssStyleTitle != null){
            addParameter("cssStyleTitle", cssStyleTitle);
        }
    }
    
    
    
}
