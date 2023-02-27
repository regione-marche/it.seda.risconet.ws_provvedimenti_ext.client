/**
 * Ottico_InsertFilesForMagRatResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.seda.risconet.ws_provvedimenti_ext;

public class Ottico_InsertFilesForMagRatResponse  implements java.io.Serializable {
    private java.lang.String ottico_InsertFilesForMagRatResult;

    public Ottico_InsertFilesForMagRatResponse() {
    }

    public Ottico_InsertFilesForMagRatResponse(
           java.lang.String ottico_InsertFilesForMagRatResult) {
           this.ottico_InsertFilesForMagRatResult = ottico_InsertFilesForMagRatResult;
    }


    /**
     * Gets the ottico_InsertFilesForMagRatResult value for this Ottico_InsertFilesForMagRatResponse.
     * 
     * @return ottico_InsertFilesForMagRatResult
     */
    public java.lang.String getOttico_InsertFilesForMagRatResult() {
        return ottico_InsertFilesForMagRatResult;
    }


    /**
     * Sets the ottico_InsertFilesForMagRatResult value for this Ottico_InsertFilesForMagRatResponse.
     * 
     * @param ottico_InsertFilesForMagRatResult
     */
    public void setOttico_InsertFilesForMagRatResult(java.lang.String ottico_InsertFilesForMagRatResult) {
        this.ottico_InsertFilesForMagRatResult = ottico_InsertFilesForMagRatResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Ottico_InsertFilesForMagRatResponse)) return false;
        Ottico_InsertFilesForMagRatResponse other = (Ottico_InsertFilesForMagRatResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ottico_InsertFilesForMagRatResult==null && other.getOttico_InsertFilesForMagRatResult()==null) || 
             (this.ottico_InsertFilesForMagRatResult!=null &&
              this.ottico_InsertFilesForMagRatResult.equals(other.getOttico_InsertFilesForMagRatResult())));
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
        if (getOttico_InsertFilesForMagRatResult() != null) {
            _hashCode += getOttico_InsertFilesForMagRatResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Ottico_InsertFilesForMagRatResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", ">Ottico_InsertFilesForMagRatResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ottico_InsertFilesForMagRatResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", "Ottico_InsertFilesForMagRatResult"));
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
