/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.lalotech.struts2.map.views.jsp.ui;

import com.opensymphony.xwork2.util.ValueStack;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import net.lalotech.struts2.map.components.Pane;
import org.apache.struts2.components.Component;
import org.apache.struts2.views.jsp.ui.AbstractUITag;

/**
 *
 * @author lalotech
 */
public class PaneTag extends AbstractUITag{
    protected String cssStyleTitle;

    @Override
    public Component getBean(ValueStack vs, HttpServletRequest hsr, HttpServletResponse hsr1) {
        return new Pane(vs, hsr, hsr1);        
    }    

    @Override
    protected void populateParams() {
        super.populateParams();
        Pane p = (Pane)component;
        p.setCssStyleTitle(cssStyleTitle);
    }

    public void setCssStyleTitle(String cssStyleTitle) {
        this.cssStyleTitle = cssStyleTitle;
    }  
    
}
