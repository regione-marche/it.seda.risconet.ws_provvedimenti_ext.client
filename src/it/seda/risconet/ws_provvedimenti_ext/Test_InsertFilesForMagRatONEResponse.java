/**
 * Test_InsertFilesForMagRatONEResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.seda.risconet.ws_provvedimenti_ext;

public class Test_InsertFilesForMagRatONEResponse  implements java.io.Serializable {
    private java.lang.String test_InsertFilesForMagRatONEResult;

    public Test_InsertFilesForMagRatONEResponse() {
    }

    public Test_InsertFilesForMagRatONEResponse(
           java.lang.String test_InsertFilesForMagRatONEResult) {
           this.test_InsertFilesForMagRatONEResult = test_InsertFilesForMagRatONEResult;
    }


    /**
     * Gets the test_InsertFilesForMagRatONEResult value for this Test_InsertFilesForMagRatONEResponse.
     * 
     * @return test_InsertFilesForMagRatONEResult
     */
    public java.lang.String getTest_InsertFilesForMagRatONEResult() {
        return test_InsertFilesForMagRatONEResult;
    }


    /**
     * Sets the test_InsertFilesForMagRatONEResult value for this Test_InsertFilesForMagRatONEResponse.
     * 
     * @param test_InsertFilesForMagRatONEResult
     */
    public void setTest_InsertFilesForMagRatONEResult(java.lang.String test_InsertFilesForMagRatONEResult) {
        this.test_InsertFilesForMagRatONEResult = test_InsertFilesForMagRatONEResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Test_InsertFilesForMagRatONEResponse)) return false;
        Test_InsertFilesForMagRatONEResponse other = (Test_InsertFilesForMagRatONEResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.test_InsertFilesForMagRatONEResult==null && other.getTest_InsertFilesForMagRatONEResult()==null) || 
             (this.test_InsertFilesForMagRatONEResult!=null &&
              this.test_InsertFilesForMagRatONEResult.equals(other.getTest_InsertFilesForMagRatONEResult())));
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
        if (getTest_InsertFilesForMagRatONEResult() != null) {
            _hashCode += getTest_InsertFilesForMagRatONEResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Test_InsertFilesForMagRatONEResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", ">Test_InsertFilesForMagRatONEResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("test_InsertFilesForMagRatONEResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", "Test_InsertFilesForMagRatONEResult"));
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
