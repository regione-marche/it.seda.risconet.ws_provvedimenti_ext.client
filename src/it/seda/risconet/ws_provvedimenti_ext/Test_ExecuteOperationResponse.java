/**
 * Test_ExecuteOperationResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.seda.risconet.ws_provvedimenti_ext;

public class Test_ExecuteOperationResponse  implements java.io.Serializable {
    private it.seda.risconet.ws_provvedimenti_ext.Test_ExecuteOperationResponseTest_ExecuteOperationResult test_ExecuteOperationResult;

    public Test_ExecuteOperationResponse() {
    }

    public Test_ExecuteOperationResponse(
           it.seda.risconet.ws_provvedimenti_ext.Test_ExecuteOperationResponseTest_ExecuteOperationResult test_ExecuteOperationResult) {
           this.test_ExecuteOperationResult = test_ExecuteOperationResult;
    }


    /**
     * Gets the test_ExecuteOperationResult value for this Test_ExecuteOperationResponse.
     * 
     * @return test_ExecuteOperationResult
     */
    public it.seda.risconet.ws_provvedimenti_ext.Test_ExecuteOperationResponseTest_ExecuteOperationResult getTest_ExecuteOperationResult() {
        return test_ExecuteOperationResult;
    }


    /**
     * Sets the test_ExecuteOperationResult value for this Test_ExecuteOperationResponse.
     * 
     * @param test_ExecuteOperationResult
     */
    public void setTest_ExecuteOperationResult(it.seda.risconet.ws_provvedimenti_ext.Test_ExecuteOperationResponseTest_ExecuteOperationResult test_ExecuteOperationResult) {
        this.test_ExecuteOperationResult = test_ExecuteOperationResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Test_ExecuteOperationResponse)) return false;
        Test_ExecuteOperationResponse other = (Test_ExecuteOperationResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.test_ExecuteOperationResult==null && other.getTest_ExecuteOperationResult()==null) || 
             (this.test_ExecuteOperationResult!=null &&
              this.test_ExecuteOperationResult.equals(other.getTest_ExecuteOperationResult())));
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
        if (getTest_ExecuteOperationResult() != null) {
            _hashCode += getTest_ExecuteOperationResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Test_ExecuteOperationResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", ">Test_ExecuteOperationResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("test_ExecuteOperationResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", "Test_ExecuteOperationResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", ">>Test_ExecuteOperationResponse>Test_ExecuteOperationResult"));
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
