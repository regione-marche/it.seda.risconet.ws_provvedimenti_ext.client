/**
 * Ottico_UpdateFilesForMagRat.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.seda.risconet.ws_provvedimenti_ext;

public class Ottico_UpdateFilesForMagRat  implements java.io.Serializable {
    private it.seda.risconet.ws_provvedimenti_ext.Ottico_UpdateFilesForMagRatImxl imxl;

    public Ottico_UpdateFilesForMagRat() {
    }

    public Ottico_UpdateFilesForMagRat(
           it.seda.risconet.ws_provvedimenti_ext.Ottico_UpdateFilesForMagRatImxl imxl) {
           this.imxl = imxl;
    }


    /**
     * Gets the imxl value for this Ottico_UpdateFilesForMagRat.
     * 
     * @return imxl
     */
    public it.seda.risconet.ws_provvedimenti_ext.Ottico_UpdateFilesForMagRatImxl getImxl() {
        return imxl;
    }


    /**
     * Sets the imxl value for this Ottico_UpdateFilesForMagRat.
     * 
     * @param imxl
     */
    public void setImxl(it.seda.risconet.ws_provvedimenti_ext.Ottico_UpdateFilesForMagRatImxl imxl) {
        this.imxl = imxl;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Ottico_UpdateFilesForMagRat)) return false;
        Ottico_UpdateFilesForMagRat other = (Ottico_UpdateFilesForMagRat) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.imxl==null && other.getImxl()==null) || 
             (this.imxl!=null &&
              this.imxl.equals(other.getImxl())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getImxl() != null) {
            _hashCode += getImxl().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Ottico_UpdateFilesForMagRat.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", ">Ottico_UpdateFilesForMagRat"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imxl");
        elemField.setXmlName(new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", "imxl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", ">>Ottico_UpdateFilesForMagRat>imxl"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
