//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.03 at 02:56:03 PM CET 
//


package hu.bme.mit.v37zen.sm.datamodel.generated.eipgenericdataimporter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceDeliveryPoint complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceDeliveryPoint">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.emeter.com/energyip/meterdatainterface}IdentifiedObject">
 *       &lt;sequence>
 *         &lt;element name="serviceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lifeSupport" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="readRoute" type="{http://www.emeter.com/energyip/meterdatainterface}IdentifiedObject" minOccurs="0"/>
 *         &lt;element name="readSequence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="averageDailyUsage" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="locationCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="serviceDeliveryRemarks" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="longitude" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="locationAccuracy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="locationAccuracyUnits" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceDeliveryPoint", propOrder = {
    "serviceType",
    "lifeSupport",
    "readRoute",
    "readSequence",
    "averageDailyUsage",
    "locationCode",
    "serviceDeliveryRemarks",
    "latitude",
    "longitude",
    "locationAccuracy",
    "locationAccuracyUnits"
})
public class ServiceDeliveryPoint
    extends IdentifiedObject
{

    protected String serviceType;
    protected Boolean lifeSupport;
    protected IdentifiedObject readRoute;
    protected String readSequence;
    protected Double averageDailyUsage;
    @XmlElement(required = true)
    protected String locationCode;
    @XmlElement(required = true)
    protected String serviceDeliveryRemarks;
    protected double latitude;
    protected double longitude;
    protected String locationAccuracy;
    protected String locationAccuracyUnits;

    /**
     * Gets the value of the serviceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceType() {
        return serviceType;
    }

    /**
     * Sets the value of the serviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceType(String value) {
        this.serviceType = value;
    }

    /**
     * Gets the value of the lifeSupport property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLifeSupport() {
        return lifeSupport;
    }

    /**
     * Sets the value of the lifeSupport property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLifeSupport(Boolean value) {
        this.lifeSupport = value;
    }

    /**
     * Gets the value of the readRoute property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifiedObject }
     *     
     */
    public IdentifiedObject getReadRoute() {
        return readRoute;
    }

    /**
     * Sets the value of the readRoute property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifiedObject }
     *     
     */
    public void setReadRoute(IdentifiedObject value) {
        this.readRoute = value;
    }

    /**
     * Gets the value of the readSequence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReadSequence() {
        return readSequence;
    }

    /**
     * Sets the value of the readSequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReadSequence(String value) {
        this.readSequence = value;
    }

    /**
     * Gets the value of the averageDailyUsage property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAverageDailyUsage() {
        return averageDailyUsage;
    }

    /**
     * Sets the value of the averageDailyUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAverageDailyUsage(Double value) {
        this.averageDailyUsage = value;
    }

    /**
     * Gets the value of the locationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationCode() {
        return locationCode;
    }

    /**
     * Sets the value of the locationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationCode(String value) {
        this.locationCode = value;
    }

    /**
     * Gets the value of the serviceDeliveryRemarks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceDeliveryRemarks() {
        return serviceDeliveryRemarks;
    }

    /**
     * Sets the value of the serviceDeliveryRemarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceDeliveryRemarks(String value) {
        this.serviceDeliveryRemarks = value;
    }

    /**
     * Gets the value of the latitude property.
     * 
     */
    public double getLatitude() {
        return latitude;
    }

    /**
     * Sets the value of the latitude property.
     * 
     */
    public void setLatitude(double value) {
        this.latitude = value;
    }

    /**
     * Gets the value of the longitude property.
     * 
     */
    public double getLongitude() {
        return longitude;
    }

    /**
     * Sets the value of the longitude property.
     * 
     */
    public void setLongitude(double value) {
        this.longitude = value;
    }

    /**
     * Gets the value of the locationAccuracy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationAccuracy() {
        return locationAccuracy;
    }

    /**
     * Sets the value of the locationAccuracy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationAccuracy(String value) {
        this.locationAccuracy = value;
    }

    /**
     * Gets the value of the locationAccuracyUnits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationAccuracyUnits() {
        return locationAccuracyUnits;
    }

    /**
     * Sets the value of the locationAccuracyUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationAccuracyUnits(String value) {
        this.locationAccuracyUnits = value;
    }

}
