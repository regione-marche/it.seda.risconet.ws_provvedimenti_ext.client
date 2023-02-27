/**
 * Test_UpdateFileForMagRatResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.seda.risconet.ws_provvedimenti_ext;

public class Test_UpdateFileForMagRatResponse  implements java.io.Serializable {
    private java.lang.String test_UpdateFileForMagRatResult;

    public Test_UpdateFileForMagRatResponse() {
    }

    public Test_UpdateFileForMagRatResponse(
           java.lang.String test_UpdateFileForMagRatResult) {
           this.test_UpdateFileForMagRatResult = test_UpdateFileForMagRatResult;
    }


    /**
     * Gets the test_UpdateFileForMagRatResult value for this Test_UpdateFileForMagRatResponse.
     * 
     * @return test_UpdateFileForMagRatResult
     */
    public java.lang.String getTest_UpdateFileForMagRatResult() {
        return test_UpdateFileForMagRatResult;
    }


    /**
     * Sets the test_UpdateFileForMagRatResult value for this Test_UpdateFileForMagRatResponse.
     * 
     * @param test_UpdateFileForMagRatResult
     */
    public void setTest_UpdateFileForMagRatResult(java.lang.String test_UpdateFileForMagRatResult) {
        this.test_UpdateFileForMagRatResult = test_UpdateFileForMagRatResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Test_UpdateFileForMagRatResponse)) return false;
        Test_UpdateFileForMagRatResponse other = (Test_UpdateFileForMagRatResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.test_UpdateFileForMagRatResult==null && other.getTest_UpdateFileForMagRatResult()==null) || 
             (this.test_UpdateFileForMagRatResult!=null &&
              this.test_UpdateFileForMagRatResult.equals(other.getTest_UpdateFileForMagRatResult())));
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
        if (getTest_UpdateFileForMagRatResult() != null) {
            _hashCode += getTest_UpdateFileForMagRatResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Test_UpdateFileForMagRatResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", ">Test_UpdateFileForMagRatResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("test_UpdateFileForMagRatResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", "Test_UpdateFileForMagRatResult"));
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
