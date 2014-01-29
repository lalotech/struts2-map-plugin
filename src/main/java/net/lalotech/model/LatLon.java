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
public class LatLon implements Serializable{
    private double latitude;
    private double longitude;

    public LatLon(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }    
}