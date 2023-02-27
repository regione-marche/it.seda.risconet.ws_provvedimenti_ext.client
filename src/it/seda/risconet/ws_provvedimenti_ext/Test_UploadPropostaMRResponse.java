/**
 * Test_UploadPropostaMRResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.seda.risconet.ws_provvedimenti_ext;

public class Test_UploadPropostaMRResponse  implements java.io.Serializable {
    private java.lang.String test_UploadPropostaMRResult;

    public Test_UploadPropostaMRResponse() {
    }

    public Test_UploadPropostaMRResponse(
           java.lang.String test_UploadPropostaMRResult) {
           this.test_UploadPropostaMRResult = test_UploadPropostaMRResult;
    }


    /**
     * Gets the test_UploadPropostaMRResult value for this Test_UploadPropostaMRResponse.
     * 
     * @return test_UploadPropostaMRResult
     */
    public java.lang.String getTest_UploadPropostaMRResult() {
        return test_UploadPropostaMRResult;
    }


    /**
     * Sets the test_UploadPropostaMRResult value for this Test_UploadPropostaMRResponse.
     * 
     * @param test_UploadPropostaMRResult
     */
    public void setTest_UploadPropostaMRResult(java.lang.String test_UploadPropostaMRResult) {
        this.test_UploadPropostaMRResult = test_UploadPropostaMRResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Test_UploadPropostaMRResponse)) return false;
        Test_UploadPropostaMRResponse other = (Test_UploadPropostaMRResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.test_UploadPropostaMRResult==null && other.getTest_UploadPropostaMRResult()==null) || 
             (this.test_UploadPropostaMRResult!=null &&
              this.test_UploadPropostaMRResult.equals(other.getTest_UploadPropostaMRResult())));
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
        if (getTest_UploadPropostaMRResult() != null) {
            _hashCode += getTest_UploadPropostaMRResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Test_UploadPropostaMRResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", ">Test_UploadPropostaMRResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("test_UploadPropostaMRResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", "Test_UploadPropostaMRResult"));
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
