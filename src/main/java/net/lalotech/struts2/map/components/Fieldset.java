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
import org.apache.struts2.views.annotations.StrutsTagAttribute;
import org.apache.struts2.views.annotations.StrutsTagSkipInheritance;

    

/**
 *
 * @author lalotech
 */
@StrutsTag(name="fieldset",
        tldTagClass="net.lalotech.struts2.map.views.jsp.ui.FieldsetTag",
        description="Render one header structure for style",allowDynamicAttributes=true)
public class Fieldset extends ClosingUIBean{  
    public static final transient Random RANDOM = new Random();

    public Fieldset(ValueStack stack, HttpServletRequest request, HttpServletResponse response) {
        super(stack, request, response);
    }

    @Override
    protected void evaluateExtraParams() {
        super.evaluateExtraParams();    
        if ((this.id == null || this.id.length() == 0)) {
            // resolves Math.abs(Integer.MIN_VALUE) issue reported by FindBugs
            // http://findbugs.sourceforge.net/bugDescriptions.html#RV_ABSOLUTE_VALUE_OF_RANDOM_INT
            int nextInt = RANDOM.nextInt();
            nextInt = nextInt == Integer.MIN_VALUE ? Integer.MAX_VALUE : Math.abs(nextInt);
            this.id = "fieldset_" + String.valueOf(nextInt);
            addParameter("id", this.id);
        }
    }
    @Override
    public String getTheme() {
        return "lalotech";
    }

    @Override
    protected String getDefaultTemplate() {
        return "fieldset-close";
    } 
   
    @Override
    @StrutsTagSkipInheritance
    public void setTheme(String theme) {
        super.setTheme(theme);
    }
   
    @Override
    @StrutsTagAttribute(description="text to display in the tag.",required=true)    
    public void setTitle(String title) {
        super.setTitle(title);
    }   

    @Override
    public String getDefaultOpenTemplate() {
        return "fieldset";
    }
   
}
