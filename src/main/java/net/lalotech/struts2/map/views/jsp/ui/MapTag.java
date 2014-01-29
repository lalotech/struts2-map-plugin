/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.lalotech.struts2.map.views.jsp.ui;

import com.opensymphony.xwork2.util.ValueStack;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import net.lalotech.struts2.map.components.Map;
import org.apache.struts2.components.Component;
import org.apache.struts2.views.jsp.ui.AbstractUITag;

/**
 *
 * @author Windows7x64
 */
public class MapTag extends AbstractUITag{  
    //Events on the map
    protected String eventOnClick;
    protected String eventOnDblclick;
    protected String eventOnMouseOut;
    protected String eventOnMouseOver;
    protected String eventOnRightClick;
    
    //mas propiedades aqui
    protected String width;
    protected String height;
    protected String polylines;
    protected String polylinesStrokeColor;
    protected String polylinesStrokeOpacity;
    protected String polylinesStrokeWeight;
    protected String polygon;
    protected String polygonStrokeColor;
    protected String polygonStrokeOpacity;
    protected String polygonStrokeWeight;
    protected String polygonFillColor;
    protected String polygonFillOpacity;    
     
    //data
    protected Object markers;
    protected Object geocercas;
    protected Object markers2;
    
    //Options 
    protected String backgroundColor;
    protected String center; //LatLon
    protected String disableDefaultUI;
    protected String draggable;
    protected String draggableCursor;
    protected String draggingCursor;
    protected String heading;
    protected String keyboardShortcuts;
    protected String mapMaker;
    protected String mapTypeControl;
    protected String mapTypeControlOptions;
    protected String mapTypeId;
    protected String maxZoom;
    protected String minZoom;
    protected String noClear;
    protected String overviewMapControl;
    protected String overviewMapControlOptions;
    protected String panControl;
    protected String panControlOptions;
    protected String rotateControl;
    protected String rotateControlOptions;
    protected String scaleControl;
    protected String scaleControlOptions;
    protected String scrollwhell;
    protected String streetView;
    protected String streetViewControl;
    protected String streetViewControlOptions;
    protected String styles;
    protected String tilt;
    protected String zoom;   
    protected String zoomControl;   
    protected String zoomControlOptions; 

    @Override
    public Component getBean(ValueStack stack, HttpServletRequest req, HttpServletResponse res) {
        return new Map(stack, req, res);
    }       

    @Override
    protected void populateParams() {
        super.populateParams();        
        //si hay mas propiedades inflarlas aqui
        Map m = (Map)component;
        
        //events
        m.setEventOnClick(eventOnClick);
        m.setEventOnDblclick(eventOnDblclick);
        m.setEventOnMouseOut(eventOnMouseOut);
        m.setEventOnMouseOver(eventOnMouseOver);
        m.setEventOnRightClick(eventOnRightClick);
        
        //data
        m.setMarkers2(markers2);
        m.setMarkers(markers);
        m.setGeocercas(geocercas);
        m.setWidth(width);
        m.setHeight(height);
        m.setPolylines(polylines);
        m.setPolylinesStrokeColor(polylinesStrokeColor);
        m.setPolylinesStrokeOpacity(polylinesStrokeOpacity);
        m.setPolylinesStrokeWeight(polylinesStrokeWeight);
        m.setPolygon(polygon);
        m.setPolygonStrokeColor(polygonStrokeColor);
        m.setPolygonStrokeOpacity(polygonStrokeOpacity);
        m.setPolygonStrokeWeight(polygonStrokeWeight);
        m.setPolygonFillColor(polygonFillColor);
        m.setPolygonFillOpacity(polygonFillOpacity);        
        
        //options      
        m.setBackgroundColor(backgroundColor);
        m.setCenter(center);
        m.setDisableDefaultUI(disableDefaultUI);
        m.setDraggable(draggable);
        m.setDraggableCursor(draggableCursor);
        m.setDraggingCursor(draggingCursor);
        m.setHeading(heading);
        m.setKeyboardShortcuts(keyboardShortcuts);
        m.setMapMaker(mapMaker);
        m.setMapTypeControl(mapTypeControl);
        m.setMapTypeControlOptions(mapTypeControlOptions);
        m.setMapTypeId(mapTypeId);
        m.setMaxZoom(maxZoom);
        m.setMinZoom(minZoom);
        m.setNoClear(noClear);
        m.setOverviewMapControl(overviewMapControl);
        m.setOverviewMapControlOptions(overviewMapControlOptions);
        m.setPanControl(panControl);
        m.setPanControlOptions(panControlOptions);
        m.setScaleControl(scaleControl);
        m.setScaleControlOptions(scaleControlOptions);
        m.setScrollwhell(scrollwhell);
        m.setStreetView(streetView);
        m.setStreetViewControl(streetViewControl);
        m.setStreetViewControlOptions(streetViewControlOptions);
        m.setStyles(styles);
        m.setTilt(tilt);
        m.setZoom(zoom);
        m.setZoomControl(zoomControl);
        m.setZoomControlOptions(zoomControlOptions);       
    }

    //set's and get's de mas propiedades
    
    public void setEventOnRightClick(String eventOnRightClick) {
        this.eventOnRightClick = eventOnRightClick;
    }
    
    public void setEventOnClick(String eventOnClick) {
        this.eventOnClick = eventOnClick;
    }

    public void setEventOnDblclick(String eventOnDblclick) {
        this.eventOnDblclick = eventOnDblclick;
    }

    public void setEventOnMouseOut(String eventOnMouseOut) {
        this.eventOnMouseOut = eventOnMouseOut;
    }

    public void setEventOnMouseOver(String eventOnMouseOver) {
        this.eventOnMouseOver = eventOnMouseOver;
    }
    
    public void setMarkers2(Object markers2) {
        this.markers2 = markers2;
    }    

    public void setPolygon(String polygon) {
        this.polygon = polygon;
    }

    public void setPolygonStrokeColor(String polygonStrokeColor) {
        this.polygonStrokeColor = polygonStrokeColor;
    }

    public void setPolygonStrokeOpacity(String polygonStrokeOpacity) {
        this.polygonStrokeOpacity = polygonStrokeOpacity;
    }

    public void setPolygonStrokeWeight(String polygonStrokeWeight) {
        this.polygonStrokeWeight = polygonStrokeWeight;
    }

    public void setPolygonFillColor(String polygonFillColor) {
        this.polygonFillColor = polygonFillColor;
    }

    public void setPolygonFillOpacity(String polygonFillOpacity) {
        this.polygonFillOpacity = polygonFillOpacity;
    }
    
    public void setPolylines(String polylines) {
        this.polylines = polylines;
    }

    public void setPolylinesStrokeColor(String polylinesStrokeColor) {
        this.polylinesStrokeColor = polylinesStrokeColor;
    }

    public void setPolylinesStrokeOpacity(String polylinesStrokeOpacity) {
        this.polylinesStrokeOpacity = polylinesStrokeOpacity;
    }    

    public void setPolylinesStrokeWeight(String polylinesStrokeWeight) {
        this.polylinesStrokeWeight = polylinesStrokeWeight;
    }

    public void setGeocercas(Object geocercas) {
        this.geocercas = geocercas;
    }
    
    public void setMarkers(String markers) {
        this.markers = markers;
    }
    
    public void setWidth(String width) {
        this.width = width;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public void setZoom(String zoom) {
        this.zoom = zoom;
    }  

    public String getMapTypeId() {
        return mapTypeId;
    }

    public void setMapTypeId(String mapTypeId) {
        this.mapTypeId = mapTypeId;
    }

    public String getMaxZoom() {
        return maxZoom;
    }

    public void setMaxZoom(String maxZoom) {
        this.maxZoom = maxZoom;
    }

    public String getMinZoom() {
        return minZoom;
    }

    public void setMinZoom(String minZoom) {
        this.minZoom = minZoom;
    }  

    public void setMarkers(Object markers) {
        this.markers = markers;
    }

    public void setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public void setCenter(String center) {
        this.center = center;
    }

    public void setDisableDefaultUI(String disableDefaultUI) {
        this.disableDefaultUI = disableDefaultUI;
    }

    public void setDraggable(String draggable) {
        this.draggable = draggable;
    }

    public void setDraggableCursor(String draggableCursor) {
        this.draggableCursor = draggableCursor;
    }

    public void setDraggingCursor(String draggingCursor) {
        this.draggingCursor = draggingCursor;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public void setKeyboardShortcuts(String keyboardShortcuts) {
        this.keyboardShortcuts = keyboardShortcuts;
    }

    public void setMapMaker(String mapMaker) {
        this.mapMaker = mapMaker;
    }

    public void setMapTypeControl(String mapTypeControl) {
        this.mapTypeControl = mapTypeControl;
    }

    public void setMapTypeControlOptions(String mapTypeControlOptions) {
        this.mapTypeControlOptions = mapTypeControlOptions;
    }

    public void setNoClear(String noClear) {
        this.noClear = noClear;
    }

    public void setOverviewMapControl(String overviewMapControl) {
        this.overviewMapControl = overviewMapControl;
    }

    public void setOverviewMapControlOptions(String overviewMapControlOptions) {
        this.overviewMapControlOptions = overviewMapControlOptions;
    }

    public void setPanControl(String panControl) {
        this.panControl = panControl;
    }

    public void setPanControlOptions(String panControlOptions) {
        this.panControlOptions = panControlOptions;
    }

    public void setRotateControl(String rotateControl) {
        this.rotateControl = rotateControl;
    }

    public void setRotateControlOptions(String rotateControlOptions) {
        this.rotateControlOptions = rotateControlOptions;
    }

    public void setScaleControl(String scaleControl) {
        this.scaleControl = scaleControl;
    }

    public void setScaleControlOptions(String scaleControlOptions) {
        this.scaleControlOptions = scaleControlOptions;
    }

    public void setScrollwhell(String scrollwhell) {
        this.scrollwhell = scrollwhell;
    }

    public void setStreetView(String streetView) {
        this.streetView = streetView;
    }

    public void setStreetViewControl(String streetViewControl) {
        this.streetViewControl = streetViewControl;
    }

    public void setStreetViewControlOptions(String streetViewControlOptions) {
        this.streetViewControlOptions = streetViewControlOptions;
    }

    public void setStyles(String styles) {
        this.styles = styles;
    }

    public void setTilt(String tilt) {
        this.tilt = tilt;
    }

    public void setZoomControl(String zoomControl) {
        this.zoomControl = zoomControl;
    }

    public void setZoomControlOptions(String zoomControlOptions) {
        this.zoomControlOptions = zoomControlOptions;
    }    
}
