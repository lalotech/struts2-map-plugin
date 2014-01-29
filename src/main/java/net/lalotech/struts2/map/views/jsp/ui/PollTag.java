/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.lalotech.struts2.map.views.jsp.ui;

import com.opensymphony.xwork2.util.ValueStack;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import net.lalotech.struts2.map.components.Poll;
import org.apache.struts2.components.Component;
import org.apache.struts2.views.jsp.ui.AbstractUITag;

/**
 *
 * @author lalotech
 */
public class PollTag extends AbstractUITag{
    
    protected String url;    
    protected String timeout;    
    protected String timestep;

    @Override
    public Component getBean(ValueStack vs, HttpServletRequest hsr, HttpServletResponse hsr1) {
        return new Poll(vs, hsr, hsr1);
    }

    @Override
    protected void populateParams() {
        super.populateParams(); 
        Poll p = (Poll) component;
        p.setUrl(url);        
        p.setTimeout(timeout);        
        p.setTimestep(timestep);
    }

    public void setUrl(String url) {
        this.url = url;
    }


    public void setTimeout(String timeout) {
        this.timeout = timeout;
    }
      

    public void setTimestep(String timestep) {
        this.timestep = timestep;
    }    
    
}
