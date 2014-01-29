/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.lalotech.struts2.map.components;

import com.opensymphony.xwork2.util.ValueStack;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Random;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts2.components.ClosingUIBean;
import org.apache.struts2.components.UIBean;
import org.apache.struts2.util.MakeIterator;
import org.apache.struts2.views.annotations.StrutsTag;
import org.apache.struts2.views.annotations.StrutsTagAttribute;
import org.apache.struts2.views.annotations.StrutsTagSkipInheritance;

/**
 *
 * @author Windows7x64
 */
@StrutsTag(name = "map",
tldTagClass = "net.lalotech.struts2.map.views.jsp.ui.MapTag",
description = "Render map of Google Maps.",
allowDynamicAttributes = true)
public class Map extends ClosingUIBean {

    public static final String TEMPLATE = "map";
    public static final String TEMPLATE_CLOSE = "map-close";
    public static final transient Random RANDOM = new Random();
    protected boolean throwExceptionOnNullValueAttribute = false;
    
    //Events on the map
    protected String eventOnClick;
    protected String eventOnDblclick;
    protected String eventOnMouseOut;
    protected String eventOnMouseOver;
    protected String eventOnRightClick;
    
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
    

    public Map(ValueStack stack, HttpServletRequest request, HttpServletResponse response) {
        super(stack, request, response);
    }

    @Override
    protected void evaluateExtraParams() {
        super.evaluateExtraParams();
        
        //Events
        if(eventOnClick != null){
            addParameter("eventOnClick", findString(eventOnClick));
        }
        if(eventOnDblclick != null){
            addParameter("eventOnDblclick", findString(eventOnDblclick));
        }
        if(eventOnMouseOut != null){
            addParameter("eventOnMouseOut", findString(eventOnMouseOut));
        }
        if(eventOnMouseOver != null){
            addParameter("eventOnMouseOver", findString(eventOnMouseOver));
        }
        if(eventOnRightClick != null){
            addParameter("eventOnRightClick", findString(eventOnRightClick));
        }
        
        //Markers 2
        Object value3 = null;
        if (markers2 == null) {
            markers2 = parameters.get("markers2");
        }
        if (markers2 instanceof String) {
            value3 = findValue((String) markers2);
        } else if (markers2 instanceof Collection) {
            value3 = markers2;
        } else if (MakeIterator.isIterable(markers2)) {
            value3 = MakeIterator.convert(markers2);
        }
        if (value3 == null) {
            if (throwExceptionOnNullValueAttribute) {
                // will throw an exception if not found
                value3 = findValue((markers2 == null) ? (String) markers2 : markers2.toString(), "list", "The requested list key '" + markers + "' could not be resolved as a collection/array/map/enumeration/iterator type. " + "Example: people or people.{name}");
            } else {
                // ww-1010, allows value with null value to be compatible with
                // ww
                // 2.1.7 behaviour
                value3 = findValue((markers2 == null) ? (String) markers2 : markers2.toString());
            }
        }
        if (value3 instanceof Collection) {
            addParameter("markers2", value3);
        } else {
            addParameter("markers2", MakeIterator.convert(value3));
        }
        if (value3 instanceof Collection) {
            addParameter("markers2Size", Integer.valueOf(((Collection) value3).size()));
        } else if (value3 instanceof java.util.Map) {
            addParameter("markers2Size", Integer.valueOf(((java.util.Map) value3).size()));
        } else if (value3 != null && value3.getClass().isArray()) {
            addParameter("markers2Size", Integer.valueOf(Array.getLength(value3)));
        }       
        
        //Markers
        Object value = null;
        if (markers == null) {
            markers = parameters.get("markers");
        }
        if (markers instanceof String) {
            value = findValue((String) markers);
        } else if (markers instanceof Collection) {
            value = markers;
        } else if (MakeIterator.isIterable(markers)) {
            value = MakeIterator.convert(markers);
        }
        if (value == null) {
            if (throwExceptionOnNullValueAttribute) {
                // will throw an exception if not found
                value = findValue((markers == null) ? (String) markers : markers.toString(), "list", "The requested list key '" + markers + "' could not be resolved as a collection/array/map/enumeration/iterator type. " + "Example: people or people.{name}");
            } else {
                // ww-1010, allows value with null value to be compatible with
                // ww
                // 2.1.7 behaviour
                value = findValue((markers == null) ? (String) markers : markers.toString());
            }
        }
        if (value instanceof Collection) {
            addParameter("markers", value);
        } else {
            addParameter("markers", MakeIterator.convert(value));
        }
        if (value instanceof Collection) {
            addParameter("markersSize", Integer.valueOf(((Collection) value).size()));
        } else if (value instanceof java.util.Map) {
            addParameter("markersSize", Integer.valueOf(((java.util.Map) value).size()));
        } else if (value != null && value.getClass().isArray()) {
            addParameter("markersSize", Integer.valueOf(Array.getLength(value)));
        }
        
        //Geocercas
        Object value2 = null;
        if (geocercas == null) {
            geocercas = parameters.get("geocercas");
        }
        if (geocercas instanceof String) {
            value2 = findValue((String) geocercas);
        } else if (geocercas instanceof Collection) {
            value2 = geocercas;
        } else if (MakeIterator.isIterable(geocercas)) {
            value2 = MakeIterator.convert(geocercas);
        }
        if (value2 == null) {
            if (throwExceptionOnNullValueAttribute) {
                // will throw an exception if not found
                value2 = findValue((geocercas == null) ? (String) geocercas : geocercas.toString(), "list", "The requested list key '" + markers + "' could not be resolved as a collection/array/map/enumeration/iterator type. " + "Example: people or people.{name}");
            } else {
                // ww-1010, allows value with null value to be compatible with
                // ww
                // 2.1.7 behaviour
                value2 = findValue((geocercas == null) ? (String) geocercas : geocercas.toString());
            }
        }
        if (value2 instanceof Collection) {
            addParameter("geocercas", value2);
        } else {
            addParameter("geocercas", MakeIterator.convert(value2));
        }
        if (value2 instanceof Collection) {
            addParameter("geocercasSize", Integer.valueOf(((Collection) value2).size()));
        } else if (value2 instanceof java.util.Map) {
            addParameter("geocercasSize", Integer.valueOf(((java.util.Map) value2).size()));
        } else if (value2 != null && value2.getClass().isArray()) {
            addParameter("geocercasSize", Integer.valueOf(Array.getLength(value2)));
        }
        //Fin-Geocercas
        
        if (width != null) {
            addParameter("width", findString(width));
        }
        if (height != null) {
            addParameter("height", findString(height));
        }
        
        //polylines
        if(polylines != null){
            addParameter("polylines", findValue(polylines, Boolean.class));
        }
        if(polylinesStrokeColor != null){
            addParameter("polylinesStrokeColor", findString(polylinesStrokeColor));
        }
        if(polylinesStrokeOpacity != null){
            addParameter("polylinesStrokeOpacity", findValue(polylinesStrokeOpacity,Number.class));
        }
        if(polylinesStrokeWeight != null){
            addParameter("polylinesStrokeWeight", findString(polylinesStrokeWeight));
        }
        //fin - polylines
        
        //polygon
        if(polygon != null){
            addParameter("polygon", findValue(polygon, Boolean.class));
        }
        if(polygonStrokeColor != null){
            addParameter("polygonStrokeColor", findString(polygonStrokeColor));
        }
        if(polygonStrokeOpacity != null){
            addParameter("polygonStrokeOpacity", findValue(polygonStrokeOpacity,Number.class));
        }
        if(polygonStrokeWeight != null){
            addParameter("polygonStrokeWeight", findValue(polygonStrokeWeight,Number.class));
        }
        if(polygonFillColor != null){
            addParameter("polygonFillColor", findString(polygonFillColor));
        }
        if(polygonFillOpacity != null){
            addParameter("polygonFillOpacity", findValue(polygonFillOpacity,Number.class));
        }
        //fin-polygon
        
        //options        
        if (backgroundColor != null) {
            addParameter("backgroundColor", findString(backgroundColor));
        }
        if (center != null) {
            addParameter("center", findString(center));
        }
        if (panControl != null) {
            addParameter("panControl", findString(panControl));
        }        
        if (rotateControl != null) {
            addParameter("rotateControl", findString(rotateControl));
        }        
        if (scaleControl != null) {
            addParameter("scaleControl", findString(scaleControl));
        }             
        if (zoom != null) {
            addParameter("zoom", findValue(zoom, Number.class));
        }
        if (mapTypeId != null) {
            addParameter("mapTypeId", findString(mapTypeId));
        }
        if (maxZoom != null) {
            addParameter("maxZoom", findString(maxZoom));
        }
        if (minZoom != null) {
            addParameter("minZoom", findString(minZoom));
        }
        if ((this.id == null || this.id.length() == 0)) {
            // resolves Math.abs(Integer.MIN_VALUE) issue reported by FindBugs
            // http://findbugs.sourceforge.net/bugDescriptions.html#RV_ABSOLUTE_VALUE_OF_RANDOM_INT
            int nextInt = RANDOM.nextInt();
            nextInt = nextInt == Integer.MIN_VALUE ? Integer.MAX_VALUE : Math.abs(nextInt);
            this.id = "map_" + String.valueOf(nextInt);
            addParameter("id", this.id);
        }
    }

    @StrutsTagAttribute(name = "eventOnRightClick",description = "")
    public void setEventOnRightClick(String eventOnRightClick) {
        this.eventOnRightClick = eventOnRightClick;
    }     
    
    @StrutsTagAttribute(name = "eventOnClick",description = "")
    public void setEventOnClick(String eventOnClick) {
        this.eventOnClick = eventOnClick;
    }

    @StrutsTagAttribute(name = "eventOnDblclick",description = "")
    public void setEventOnDblclick(String eventOnDblclick) {
        this.eventOnDblclick = eventOnDblclick;
    }

    @StrutsTagAttribute(name = "eventOnMouseOut",description = "")
    public void setEventOnMouseOut(String eventOnMouseOut) {
        this.eventOnMouseOut = eventOnMouseOut;
    }

    @StrutsTagAttribute(name = "eventOnMouseOver",description = "")
    public void setEventOnMouseOver(String eventOnMouseOver) {
        this.eventOnMouseOver = eventOnMouseOver;
    }   
    
    
    @StrutsTagAttribute(name="polygon",description="consist of a series of coordinates in an ordered sequence.",defaultValue="false",type="Boolean")
    public void setPolygon(String polygon) {
        this.polygon = polygon;
    }
    @StrutsTagAttribute(name="polygonStrokeColor",description="")
    public void setPolygonStrokeColor(String polygonStrokeColor) {
        this.polygonStrokeColor = polygonStrokeColor;
    }
    @StrutsTagAttribute(name="polygonStrokeOpacity",description="")
    public void setPolygonStrokeOpacity(String polygonStrokeOpacity) {
        this.polygonStrokeOpacity = polygonStrokeOpacity;
    }
    @StrutsTagAttribute(name="polygonStrokeWeight",description="")
    public void setPolygonStrokeWeight(String polygonStrokeWeight) {
        this.polygonStrokeWeight = polygonStrokeWeight;
    }
    @StrutsTagAttribute(name="polygonFillColor",description="")
    public void setPolygonFillColor(String polygonFillColor) {
        this.polygonFillColor = polygonFillColor;
    }
    @StrutsTagAttribute(name="polygonFillOpacity",description="")
    public void setPolygonFillOpacity(String polygonFillOpacity) {
        this.polygonFillOpacity = polygonFillOpacity;
    }    
    @StrutsTagAttribute(name="polylines",description="Active the polylines in the map.",defaultValue="false",type="Boolean")
    public void setPolylines(String polylines) {
        this.polylines = polylines;
    }
    @StrutsTagAttribute(name="polylinesStrokeOpacity",description="specifies a numerical fractional value between 0.0 and 1.0 (default) of the opacity of the line's color.",defaultValue="1.0",type="Number")
    public void setPolylinesStrokeOpacity(String polylinesStrokeOpacity) {
        this.polylinesStrokeOpacity = polylinesStrokeOpacity;
    }

    @StrutsTagAttribute(name="polylinesStrokeColor",description="specifies a hexadecimal HTML color of the format '#FFFFFF'. The Polyline class does not support named colors.")
    public void setPolylinesStrokeColor(String polylinesStrokeColor) {
        this.polylinesStrokeColor = polylinesStrokeColor;
    }
    @StrutsTagAttribute(name="polylinesStrokeWeight",description="specifies the weight of the line's stroke in pixels.")
    public void setPolylinesStrokeWeight(String polylinesStrokeWeight) {
        this.polylinesStrokeWeight = polylinesStrokeWeight;
    }    

    @Override
    protected String getDefaultTemplate() {
        return TEMPLATE_CLOSE;
    }

    @Override
    public String getTheme() {
        return "lalotech";
    }

    @Override
    @StrutsTagSkipInheritance
    public void setTheme(String theme) {
        super.setTheme(theme);
    }

    @Override
    public String getDefaultOpenTemplate() {
        return TEMPLATE;
    }   
    @StrutsTagAttribute(name="markers2",description = "Iterable source to populate from.")
    public void setMarkers2(Object markers2) {
        this.markers2 = markers2;
    }
    
    @StrutsTagAttribute(description = "Iterable source to populate from.")
    public void setGeocercas(Object geocercas) {
        this.geocercas = geocercas;
    }    

    @StrutsTagAttribute(description = "Iterable source to populate from.")
    public void setMarkers(Object markers) {
        this.markers = markers;
    }

    @StrutsTagAttribute(name = "width", description = "width size of map", required = true)
    public void setWidth(String width) {
        this.width = width;
    }

    @StrutsTagAttribute(name = "height", description = "height size of map", required = true)
    public void setHeight(String height) {
        this.height = height;
    }

    @StrutsTagAttribute(name = "zoom", description = "zoom the map", defaultValue = "15", type = "Number")
    public void setZoom(String zoom) {
        this.zoom = zoom;
    }

    @StrutsTagAttribute(name = "mapTypeId", description = "The initial Map mapTypeId.", defaultValue = "ROADMAP", type = "String")
    public void setMapTypeId(String mapTypeId) {
        this.mapTypeId = mapTypeId;
    }

    @StrutsTagAttribute(name = "maxZoom", description = "The maximum zoom level which will be displayed on the map. If omitted, or set to null, the maximum zoom from the current map type is used instead.")
    public void setMaxZoom(String maxZoom) {
        this.maxZoom = maxZoom;
    }

    @StrutsTagAttribute(name = "minZoom", description = "The minimum zoom level which will be displayed on the map. If omitted, or set to null, the minimum zoom from the current map type is used instead.")
    public void setMinZoom(String minZoom) {
        this.minZoom = minZoom;
    }    
    public void setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }
    @StrutsTagAttribute(name="center",description="coord center of map")
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
    @StrutsTagAttribute(name = "panControl",description="")
    public void setPanControl(String panControl) {
        this.panControl = panControl;
    }

    public void setPanControlOptions(String panControlOptions) {
        this.panControlOptions = panControlOptions;
    }
    @StrutsTagAttribute(name = "rotateControl",description="")
    public void setRotateControl(String rotateControl) {
        this.rotateControl = rotateControl;
    }

    public void setRotateControlOptions(String rotateControlOptions) {
        this.rotateControlOptions = rotateControlOptions;
    }
    @StrutsTagAttribute(name = "scaleControl",description="")
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
