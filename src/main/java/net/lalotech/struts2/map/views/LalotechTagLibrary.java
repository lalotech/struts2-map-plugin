/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.lalotech.struts2.map.views;

import com.opensymphony.xwork2.util.ValueStack;
import java.util.Arrays;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import net.lalotech.struts2.map.views.freemarker.tags.LalotechModels;
import net.lalotech.struts2.map.views.velocity.components.FieldsetDirective;
import net.lalotech.struts2.map.views.velocity.components.HeadDirective;
import net.lalotech.struts2.map.views.velocity.components.MapDirective;
import net.lalotech.struts2.map.views.velocity.components.MarkerItemDirective;
import net.lalotech.struts2.map.views.velocity.components.PaneDirective;
import net.lalotech.struts2.map.views.velocity.components.PollDirective;
import net.lalotech.struts2.map.views.velocity.components.PolylineItemDirective;
import net.lalotech.struts2.map.views.velocity.components.PortletDirective;
import org.apache.struts2.views.TagLibraryDirectiveProvider;
import org.apache.struts2.views.TagLibraryModelProvider;

/**
 *
 * @author Windows7x64
 */
public class LalotechTagLibrary implements TagLibraryDirectiveProvider,TagLibraryModelProvider{

    public List<Class> getDirectiveClasses() {
        Class[] directivas = new Class[]{
            MapDirective.class,
            FieldsetDirective.class,
            HeadDirective.class,
            PaneDirective.class,
            PolylineItemDirective.class,
            MarkerItemDirective.class,
            PollDirective.class,
            PortletDirective.class
        };
        return Arrays.asList(directivas);
    }
    public Object getModels(ValueStack stack, HttpServletRequest req, HttpServletResponse res) {
        return new LalotechModels(stack, req, res);
    }

   /* @Override
    public Object getFreemarkerModels(ValueStack stack, HttpServletRequest req, HttpServletResponse res) {
        return new LalotechModels(stack, req, res);
    }

    @Override
    public List<Class> getVelocityDirectiveClasses() {
        Class[] directivas = new Class[]{
            MapDirective.class,
            FieldsetDirective.class,
            HeadDirective.class,
            PaneDirective.class,
            PolylineItemDirective.class,
            MarkerItemDirective.class,
            PollDirective.class,
            PortletDirective.class
        };
        return Arrays.asList(directivas);
    }*/    
}
