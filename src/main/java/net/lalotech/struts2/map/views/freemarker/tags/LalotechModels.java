/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.lalotech.struts2.map.views.freemarker.tags;

import com.opensymphony.xwork2.util.ValueStack;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 *
 * @author Windows7x64
 */
public class LalotechModels {
    protected MapModel map;
    protected FieldsetModel fieldset;
    protected HeadModel head;
    protected PaneModel pane;
    protected PolylineItemModel polyline;
    protected MarkerItemModel marker;
    
    private ValueStack stack;
    private HttpServletRequest req;
    private HttpServletResponse res;

    public LalotechModels(ValueStack stack, HttpServletRequest req, HttpServletResponse res) {        
        this.stack = stack;
        this.req = req;
        this.res = res;
    }
    public MarkerItemModel getMartkerItem(){
        if( marker == null){
            marker = new MarkerItemModel(stack, req, res);
        }
        return marker;
    }

    public MapModel getMap() {
        if(map == null){
            map = new MapModel(stack, req, res);
        }
        return map;
    }    

    public FieldsetModel getFieldset() {
        if(fieldset == null){
            fieldset = new FieldsetModel(stack, req, res);
        }
        return fieldset;
    }
    public HeadModel getHead() {
        if(head == null){
            head = new HeadModel(stack, req, res);
        }
        return head;
    }
    public PaneModel getPane() {
        if(pane == null){
            pane = new PaneModel(stack, req, res);
        }
        return pane;
    }
    public PolylineItemModel getMapPolyline() {
        if(polyline == null){
            polyline = new PolylineItemModel(stack, req, res);
        }
        return polyline;
    }
        
}
