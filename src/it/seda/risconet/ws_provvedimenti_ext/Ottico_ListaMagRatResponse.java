/**
 * Ottico_ListaMagRatResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.seda.risconet.ws_provvedimenti_ext;

public class Ottico_ListaMagRatResponse  implements java.io.Serializable {
    private java.lang.String ottico_ListaMagRatResult;

    public Ottico_ListaMagRatResponse() {
    }

    public Ottico_ListaMagRatResponse(
           java.lang.String ottico_ListaMagRatResult) {
           this.ottico_ListaMagRatResult = ottico_ListaMagRatResult;
    }


    /**
     * Gets the ottico_ListaMagRatResult value for this Ottico_ListaMagRatResponse.
     * 
     * @return ottico_ListaMagRatResult
     */
    public java.lang.String getOttico_ListaMagRatResult() {
        return ottico_ListaMagRatResult;
    }


    /**
     * Sets the ottico_ListaMagRatResult value for this Ottico_ListaMagRatResponse.
     * 
     * @param ottico_ListaMagRatResult
     */
    public void setOttico_ListaMagRatResult(java.lang.String ottico_ListaMagRatResult) {
        this.ottico_ListaMagRatResult = ottico_ListaMagRatResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Ottico_ListaMagRatResponse)) return false;
        Ottico_ListaMagRatResponse other = (Ottico_ListaMagRatResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ottico_ListaMagRatResult==null && other.getOttico_ListaMagRatResult()==null) || 
             (this.ottico_ListaMagRatResult!=null &&
              this.ottico_ListaMagRatResult.equals(other.getOttico_ListaMagRatResult())));
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
        if (getOttico_ListaMagRatResult() != null) {
            _hashCode += getOttico_ListaMagRatResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Ottico_ListaMagRatResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", ">Ottico_ListaMagRatResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ottico_ListaMagRatResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", "Ottico_ListaMagRatResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
