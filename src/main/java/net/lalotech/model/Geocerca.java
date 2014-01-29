package net.lalotech.model;

import java.io.Serializable;


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Windows7x64
 */
public class Geocerca implements Serializable{
    
    private LatLon center;
    private double radius;
    private String fillColor;
    private Number fillOpacity;
    private String strokeColor;
    private Number strokeOpacity;
    private Number strokeWeight;
    private Number zIndex;
    

    public Geocerca(LatLon center, double radius) {
        this.center = center;
        this.radius = radius;
    } 

    public LatLon getCenter() {
        return center;
    }

    public void setCenter(LatLon center) {
        this.center = center;
    }

    public String getRadius() {
        return ""+radius;
    }

    public String getFillColor() {
        return fillColor;
    }

    public void setFillColor(String fillColor) {
        this.fillColor = fillColor;
    }

    public Number getFillOpacity() {
        return fillOpacity;
    }

    public void setFillOpacity(Number fillOpacity) {
        this.fillOpacity = fillOpacity;
    }

    public String getStrokeColor() {
        return strokeColor;
    }

    public void setStrokeColor(String strokeColor) {
        this.strokeColor = strokeColor;
    }

    public Number getStrokeOpacity() {
        return strokeOpacity;
    }

    public void setStrokeOpacity(Number strokeOpacity) {
        this.strokeOpacity = strokeOpacity;
    }

    public Number getStrokeWeight() {
        return strokeWeight;
    }

    public void setStrokeWeight(Number strokeWeight) {
        this.strokeWeight = strokeWeight;
    }

    public Number getzIndex() {
        return zIndex;
    }

    public void setzIndex(Number zIndex) {
        this.zIndex = zIndex;
    }
    

    public void setRadius(double radius) {
        this.radius = radius;
    }    
}
