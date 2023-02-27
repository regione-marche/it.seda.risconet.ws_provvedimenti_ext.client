/**
 * Test_ListaMagRatResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.seda.risconet.ws_provvedimenti_ext;

public class Test_ListaMagRatResponse  implements java.io.Serializable {
    private java.lang.String test_ListaMagRatResult;

    public Test_ListaMagRatResponse() {
    }

    public Test_ListaMagRatResponse(
           java.lang.String test_ListaMagRatResult) {
           this.test_ListaMagRatResult = test_ListaMagRatResult;
    }


    /**
     * Gets the test_ListaMagRatResult value for this Test_ListaMagRatResponse.
     * 
     * @return test_ListaMagRatResult
     */
    public java.lang.String getTest_ListaMagRatResult() {
        return test_ListaMagRatResult;
    }


    /**
     * Sets the test_ListaMagRatResult value for this Test_ListaMagRatResponse.
     * 
     * @param test_ListaMagRatResult
     */
    public void setTest_ListaMagRatResult(java.lang.String test_ListaMagRatResult) {
        this.test_ListaMagRatResult = test_ListaMagRatResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Test_ListaMagRatResponse)) return false;
        Test_ListaMagRatResponse other = (Test_ListaMagRatResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.test_ListaMagRatResult==null && other.getTest_ListaMagRatResult()==null) || 
             (this.test_ListaMagRatResult!=null &&
              this.test_ListaMagRatResult.equals(other.getTest_ListaMagRatResult())));
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
        if (getTest_ListaMagRatResult() != null) {
            _hashCode += getTest_ListaMagRatResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Test_ListaMagRatResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", ">Test_ListaMagRatResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("test_ListaMagRatResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", "Test_ListaMagRatResult"));
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
