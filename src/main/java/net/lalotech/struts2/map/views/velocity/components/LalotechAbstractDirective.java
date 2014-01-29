/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.lalotech.struts2.map.views.velocity.components;

import org.apache.struts2.views.velocity.components.AbstractDirective;

/**
 *
 * @author lalotech
 */
abstract class LalotechAbstractDirective extends AbstractDirective {

    public String getName() {
        return "sl" + getBeanName();
    }
}
