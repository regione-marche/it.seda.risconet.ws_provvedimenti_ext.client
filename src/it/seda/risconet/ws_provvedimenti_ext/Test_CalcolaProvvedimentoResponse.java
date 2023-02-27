/**
 * Test_CalcolaProvvedimentoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.seda.risconet.ws_provvedimenti_ext;

public class Test_CalcolaProvvedimentoResponse  implements java.io.Serializable {
    private java.lang.String test_CalcolaProvvedimentoResult;

    public Test_CalcolaProvvedimentoResponse() {
    }

    public Test_CalcolaProvvedimentoResponse(
           java.lang.String test_CalcolaProvvedimentoResult) {
           this.test_CalcolaProvvedimentoResult = test_CalcolaProvvedimentoResult;
    }


    /**
     * Gets the test_CalcolaProvvedimentoResult value for this Test_CalcolaProvvedimentoResponse.
     * 
     * @return test_CalcolaProvvedimentoResult
     */
    public java.lang.String getTest_CalcolaProvvedimentoResult() {
        return test_CalcolaProvvedimentoResult;
    }


    /**
     * Sets the test_CalcolaProvvedimentoResult value for this Test_CalcolaProvvedimentoResponse.
     * 
     * @param test_CalcolaProvvedimentoResult
     */
    public void setTest_CalcolaProvvedimentoResult(java.lang.String test_CalcolaProvvedimentoResult) {
        this.test_CalcolaProvvedimentoResult = test_CalcolaProvvedimentoResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Test_CalcolaProvvedimentoResponse)) return false;
        Test_CalcolaProvvedimentoResponse other = (Test_CalcolaProvvedimentoResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.test_CalcolaProvvedimentoResult==null && other.getTest_CalcolaProvvedimentoResult()==null) || 
             (this.test_CalcolaProvvedimentoResult!=null &&
              this.test_CalcolaProvvedimentoResult.equals(other.getTest_CalcolaProvvedimentoResult())));
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
        if (getTest_CalcolaProvvedimentoResult() != null) {
            _hashCode += getTest_CalcolaProvvedimentoResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Test_CalcolaProvvedimentoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", ">Test_CalcolaProvvedimentoResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("test_CalcolaProvvedimentoResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", "Test_CalcolaProvvedimentoResult"));
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
