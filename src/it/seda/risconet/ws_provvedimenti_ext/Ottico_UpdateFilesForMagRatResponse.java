/**
 * Ottico_UpdateFilesForMagRatResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.seda.risconet.ws_provvedimenti_ext;

public class Ottico_UpdateFilesForMagRatResponse  implements java.io.Serializable {
    private java.lang.String ottico_UpdateFilesForMagRatResult;

    public Ottico_UpdateFilesForMagRatResponse() {
    }

    public Ottico_UpdateFilesForMagRatResponse(
           java.lang.String ottico_UpdateFilesForMagRatResult) {
           this.ottico_UpdateFilesForMagRatResult = ottico_UpdateFilesForMagRatResult;
    }


    /**
     * Gets the ottico_UpdateFilesForMagRatResult value for this Ottico_UpdateFilesForMagRatResponse.
     * 
     * @return ottico_UpdateFilesForMagRatResult
     */
    public java.lang.String getOttico_UpdateFilesForMagRatResult() {
        return ottico_UpdateFilesForMagRatResult;
    }


    /**
     * Sets the ottico_UpdateFilesForMagRatResult value for this Ottico_UpdateFilesForMagRatResponse.
     * 
     * @param ottico_UpdateFilesForMagRatResult
     */
    public void setOttico_UpdateFilesForMagRatResult(java.lang.String ottico_UpdateFilesForMagRatResult) {
        this.ottico_UpdateFilesForMagRatResult = ottico_UpdateFilesForMagRatResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Ottico_UpdateFilesForMagRatResponse)) return false;
        Ottico_UpdateFilesForMagRatResponse other = (Ottico_UpdateFilesForMagRatResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ottico_UpdateFilesForMagRatResult==null && other.getOttico_UpdateFilesForMagRatResult()==null) || 
             (this.ottico_UpdateFilesForMagRatResult!=null &&
              this.ottico_UpdateFilesForMagRatResult.equals(other.getOttico_UpdateFilesForMagRatResult())));
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
        if (getOttico_UpdateFilesForMagRatResult() != null) {
            _hashCode += getOttico_UpdateFilesForMagRatResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Ottico_UpdateFilesForMagRatResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", ">Ottico_UpdateFilesForMagRatResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ottico_UpdateFilesForMagRatResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", "Ottico_UpdateFilesForMagRatResult"));
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
