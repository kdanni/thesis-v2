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
 * <p>Java class for ReadingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReadingType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mRID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="measurementType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="touBinNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="unit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="touCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="channelNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="logicalChannelNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="aggregateTimePeriod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="intervalLength" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="readSequence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="precision" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="scale" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="direction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReadingType", propOrder = {
    "mrid",
    "measurementType",
    "touBinNumber",
    "unit",
    "touCode",
    "channelNumber",
    "logicalChannelNumber",
    "aggregateTimePeriod",
    "intervalLength",
    "readSequence",
    "precision",
    "scale",
    "direction"
})
public class ReadingType {

    @XmlElement(name = "mRID")
    protected String mrid;
    protected String measurementType;
    protected String touBinNumber;
    protected String unit;
    protected String touCode;
    protected Integer channelNumber;
    protected Integer logicalChannelNumber;
    protected String aggregateTimePeriod;
    protected Integer intervalLength;
    protected String readSequence;
    protected Integer precision;
    protected Integer scale;
    protected String direction;

    /**
     * Gets the value of the mrid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMRID() {
        return mrid;
    }

    /**
     * Sets the value of the mrid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMRID(String value) {
        this.mrid = value;
    }

    /**
     * Gets the value of the measurementType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeasurementType() {
        return measurementType;
    }

    /**
     * Sets the value of the measurementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeasurementType(String value) {
        this.measurementType = value;
    }

    /**
     * Gets the value of the touBinNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTouBinNumber() {
        return touBinNumber;
    }

    /**
     * Sets the value of the touBinNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTouBinNumber(String value) {
        this.touBinNumber = value;
    }

    /**
     * Gets the value of the unit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnit(String value) {
        this.unit = value;
    }

    /**
     * Gets the value of the touCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTouCode() {
        return touCode;
    }

    /**
     * Sets the value of the touCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTouCode(String value) {
        this.touCode = value;
    }

    /**
     * Gets the value of the channelNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getChannelNumber() {
        return channelNumber;
    }

    /**
     * Sets the value of the channelNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setChannelNumber(Integer value) {
        this.channelNumber = value;
    }

    /**
     * Gets the value of the logicalChannelNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLogicalChannelNumber() {
        return logicalChannelNumber;
    }

    /**
     * Sets the value of the logicalChannelNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLogicalChannelNumber(Integer value) {
        this.logicalChannelNumber = value;
    }

    /**
     * Gets the value of the aggregateTimePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAggregateTimePeriod() {
        return aggregateTimePeriod;
    }

    /**
     * Sets the value of the aggregateTimePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAggregateTimePeriod(String value) {
        this.aggregateTimePeriod = value;
    }

    /**
     * Gets the value of the intervalLength property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIntervalLength() {
        return intervalLength;
    }

    /**
     * Sets the value of the intervalLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIntervalLength(Integer value) {
        this.intervalLength = value;
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
     * Gets the value of the precision property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPrecision() {
        return precision;
    }

    /**
     * Sets the value of the precision property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPrecision(Integer value) {
        this.precision = value;
    }

    /**
     * Gets the value of the scale property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getScale() {
        return scale;
    }

    /**
     * Sets the value of the scale property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setScale(Integer value) {
        this.scale = value;
    }

    /**
     * Gets the value of the direction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirection() {
        return direction;
    }

    /**
     * Sets the value of the direction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirection(String value) {
        this.direction = value;
    }

}
