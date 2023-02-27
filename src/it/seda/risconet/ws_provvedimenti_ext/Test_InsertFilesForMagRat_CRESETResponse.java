/**
 * Test_InsertFilesForMagRat_CRESETResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.seda.risconet.ws_provvedimenti_ext;

public class Test_InsertFilesForMagRat_CRESETResponse  implements java.io.Serializable {
    private java.lang.String test_InsertFilesForMagRat_CRESETResult;

    public Test_InsertFilesForMagRat_CRESETResponse() {
    }

    public Test_InsertFilesForMagRat_CRESETResponse(
           java.lang.String test_InsertFilesForMagRat_CRESETResult) {
           this.test_InsertFilesForMagRat_CRESETResult = test_InsertFilesForMagRat_CRESETResult;
    }


    /**
     * Gets the test_InsertFilesForMagRat_CRESETResult value for this Test_InsertFilesForMagRat_CRESETResponse.
     * 
     * @return test_InsertFilesForMagRat_CRESETResult
     */
    public java.lang.String getTest_InsertFilesForMagRat_CRESETResult() {
        return test_InsertFilesForMagRat_CRESETResult;
    }


    /**
     * Sets the test_InsertFilesForMagRat_CRESETResult value for this Test_InsertFilesForMagRat_CRESETResponse.
     * 
     * @param test_InsertFilesForMagRat_CRESETResult
     */
    public void setTest_InsertFilesForMagRat_CRESETResult(java.lang.String test_InsertFilesForMagRat_CRESETResult) {
        this.test_InsertFilesForMagRat_CRESETResult = test_InsertFilesForMagRat_CRESETResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Test_InsertFilesForMagRat_CRESETResponse)) return false;
        Test_InsertFilesForMagRat_CRESETResponse other = (Test_InsertFilesForMagRat_CRESETResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.test_InsertFilesForMagRat_CRESETResult==null && other.getTest_InsertFilesForMagRat_CRESETResult()==null) || 
             (this.test_InsertFilesForMagRat_CRESETResult!=null &&
              this.test_InsertFilesForMagRat_CRESETResult.equals(other.getTest_InsertFilesForMagRat_CRESETResult())));
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
        if (getTest_InsertFilesForMagRat_CRESETResult() != null) {
            _hashCode += getTest_InsertFilesForMagRat_CRESETResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Test_InsertFilesForMagRat_CRESETResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", ">Test_InsertFilesForMagRat_CRESETResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("test_InsertFilesForMagRat_CRESETResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", "Test_InsertFilesForMagRat_CRESETResult"));
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
