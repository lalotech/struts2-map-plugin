/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.lalotech.struts2.map.components;

import com.opensymphony.xwork2.util.ValueStack;
import java.util.Random;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts2.components.ClosingUIBean;
import org.apache.struts2.views.annotations.StrutsTag;

/**
 *
 * @author lalotech
 */
@StrutsTag(name = "portlet",
        tldTagClass = "net.lalotech.struts2.map.views.jsp.ui.PortletTag",
        description = "Container Tag")
public class Portlet extends ClosingUIBean { 
    public static final transient Random RANDOM = new Random();
    
    public Portlet(ValueStack stack, HttpServletRequest request, HttpServletResponse response){
        super(stack, request, response);
    }

    @Override
    public String getDefaultOpenTemplate() {
        return "portlet";
    }

    @Override
    protected String getDefaultTemplate() {
        return "portlet-close";
    }

    @Override
    public String getTheme() {
        return "lalotech";
    }
    

    @Override
    protected void evaluateExtraParams() {
        super.evaluateExtraParams(); //To change body of generated methods, choose Tools | Templates.
        if ((this.id == null || this.id.length() == 0)) {
            // resolves Math.abs(Integer.MIN_VALUE) issue reported by FindBugs
            // http://findbugs.sourceforge.net/bugDescriptions.html#RV_ABSOLUTE_VALUE_OF_RANDOM_INT
            int nextInt = RANDOM.nextInt();
            nextInt = nextInt == Integer.MIN_VALUE ? Integer.MAX_VALUE : Math.abs(nextInt);
            this.id = "portlet_" + String.valueOf(nextInt);
            addParameter("id", this.id);
        }
    }   
}
