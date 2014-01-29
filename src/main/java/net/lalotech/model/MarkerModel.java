/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.lalotech.model;

import java.io.Serializable;

/**
 *
 * @author Windows7x64
 */
public class MarkerModel implements Serializable{
    private LatLon latlon;
    private String icon;
    private String title;
    private String infowindow;

    public MarkerModel(LatLon latlon, String icon, String title) {
        this.latlon = latlon;
        this.icon = icon;
        this.title = title;
    }  
    public MarkerModel(LatLon latlon, String icon, String title,String infowindow) {
        this.latlon = latlon;
        this.icon = icon;
        this.title = title;
        this.infowindow = infowindow;
    }  

    public String getInfowindow() {
        return infowindow;
    }

    public void setInfowindow(String infowindow) {
        this.infowindow = infowindow;
    }    

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    

    public LatLon getLatlon() {
        return latlon;
    }

    public void setLatlon(LatLon latlon) {
        this.latlon = latlon;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }    
}
