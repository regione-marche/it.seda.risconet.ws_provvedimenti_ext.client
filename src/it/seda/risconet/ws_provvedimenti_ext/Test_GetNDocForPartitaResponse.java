/**
 * Test_GetNDocForPartitaResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.seda.risconet.ws_provvedimenti_ext;

public class Test_GetNDocForPartitaResponse  implements java.io.Serializable {
    private java.lang.String test_GetNDocForPartitaResult;

    public Test_GetNDocForPartitaResponse() {
    }

    public Test_GetNDocForPartitaResponse(
           java.lang.String test_GetNDocForPartitaResult) {
           this.test_GetNDocForPartitaResult = test_GetNDocForPartitaResult;
    }


    /**
     * Gets the test_GetNDocForPartitaResult value for this Test_GetNDocForPartitaResponse.
     * 
     * @return test_GetNDocForPartitaResult
     */
    public java.lang.String getTest_GetNDocForPartitaResult() {
        return test_GetNDocForPartitaResult;
    }


    /**
     * Sets the test_GetNDocForPartitaResult value for this Test_GetNDocForPartitaResponse.
     * 
     * @param test_GetNDocForPartitaResult
     */
    public void setTest_GetNDocForPartitaResult(java.lang.String test_GetNDocForPartitaResult) {
        this.test_GetNDocForPartitaResult = test_GetNDocForPartitaResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Test_GetNDocForPartitaResponse)) return false;
        Test_GetNDocForPartitaResponse other = (Test_GetNDocForPartitaResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.test_GetNDocForPartitaResult==null && other.getTest_GetNDocForPartitaResult()==null) || 
             (this.test_GetNDocForPartitaResult!=null &&
              this.test_GetNDocForPartitaResult.equals(other.getTest_GetNDocForPartitaResult())));
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
        if (getTest_GetNDocForPartitaResult() != null) {
            _hashCode += getTest_GetNDocForPartitaResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Test_GetNDocForPartitaResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", ">Test_GetNDocForPartitaResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("test_GetNDocForPartitaResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", "Test_GetNDocForPartitaResult"));
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
