/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.lalotech.struts2.map.components;

import com.opensymphony.xwork2.util.ValueStack;
import java.util.Random;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts2.components.UIBean;
import org.apache.struts2.views.annotations.StrutsTag;
import org.apache.struts2.views.annotations.StrutsTagAttribute;

/**
 *
 * @author lalotech
 */
@StrutsTag(name="poll",
        tldTagClass="net.lalotech.struts2.map.views.jsp.ui.PollTag",
        description="Implement poll conection with updates.",allowDynamicAttributes=false)
public class Poll extends UIBean{
    public static final transient Random RANDOM = new Random();
    
    protected String url;    
    protected String timeout;    
    protected String timestep;

    public Poll(ValueStack stack, HttpServletRequest request, HttpServletResponse response) {
        super(stack, request, response);
    }
    

    @Override
    protected String getDefaultTemplate() {
        return "poll";
    }

    @Override
    public String getTheme() {
        return "lalotech";
    }

    @Override
    protected void evaluateExtraParams() {
        super.evaluateExtraParams(); 
        if(url!=null){
            addParameter("url", findString(url));
        }        
        if(timeout != null){
            addParameter("timeout", findString(timeout));
        }        
        if(timestep !=null){
            addParameter("timestep", findString(timestep));
        }
        if ((this.id == null || this.id.length() == 0)) {
            // resolves Math.abs(Integer.MIN_VALUE) issue reported by FindBugs
            // http://findbugs.sourceforge.net/bugDescriptions.html#RV_ABSOLUTE_VALUE_OF_RANDOM_INT
            int nextInt = RANDOM.nextInt();
            nextInt = nextInt == Integer.MIN_VALUE ? Integer.MAX_VALUE : Math.abs(nextInt);
            this.id = "poll_" + String.valueOf(nextInt);
            addParameter("id", this.id);
        }
    }

    @Override
    @StrutsTagAttribute(name = "id",description = "",required = true)
    public void setId(String id) {
        super.setId(id); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    @StrutsTagAttribute(name = "url",description = "",required = true)
    public void setUrl(String url) {
        this.url = url;
    }    
    @StrutsTagAttribute(name = "timeout",description = "time in miliseconds to finish. loop")
    public void setTimeout(String timeout) {
        this.timeout = timeout;
    }     
    @StrutsTagAttribute(name = "timestep",description = "time in miliseconds to step to step in loop")
    public void setTimestep(String timestep) {
        this.timestep = timestep;
    }
    
}
