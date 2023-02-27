/**
 * Test_GetInfoProvvedimentoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.seda.risconet.ws_provvedimenti_ext;

public class Test_GetInfoProvvedimentoResponse  implements java.io.Serializable {
    private java.lang.String test_GetInfoProvvedimentoResult;

    public Test_GetInfoProvvedimentoResponse() {
    }

    public Test_GetInfoProvvedimentoResponse(
           java.lang.String test_GetInfoProvvedimentoResult) {
           this.test_GetInfoProvvedimentoResult = test_GetInfoProvvedimentoResult;
    }


    /**
     * Gets the test_GetInfoProvvedimentoResult value for this Test_GetInfoProvvedimentoResponse.
     * 
     * @return test_GetInfoProvvedimentoResult
     */
    public java.lang.String getTest_GetInfoProvvedimentoResult() {
        return test_GetInfoProvvedimentoResult;
    }


    /**
     * Sets the test_GetInfoProvvedimentoResult value for this Test_GetInfoProvvedimentoResponse.
     * 
     * @param test_GetInfoProvvedimentoResult
     */
    public void setTest_GetInfoProvvedimentoResult(java.lang.String test_GetInfoProvvedimentoResult) {
        this.test_GetInfoProvvedimentoResult = test_GetInfoProvvedimentoResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Test_GetInfoProvvedimentoResponse)) return false;
        Test_GetInfoProvvedimentoResponse other = (Test_GetInfoProvvedimentoResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.test_GetInfoProvvedimentoResult==null && other.getTest_GetInfoProvvedimentoResult()==null) || 
             (this.test_GetInfoProvvedimentoResult!=null &&
              this.test_GetInfoProvvedimentoResult.equals(other.getTest_GetInfoProvvedimentoResult())));
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
        if (getTest_GetInfoProvvedimentoResult() != null) {
            _hashCode += getTest_GetInfoProvvedimentoResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Test_GetInfoProvvedimentoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", ">Test_GetInfoProvvedimentoResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("test_GetInfoProvvedimentoResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", "Test_GetInfoProvvedimentoResult"));
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
