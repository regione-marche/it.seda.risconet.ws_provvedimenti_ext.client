/**
 * Test_Check_MRContribuente_MDResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.seda.risconet.ws_provvedimenti_ext;

public class Test_Check_MRContribuente_MDResponse  implements java.io.Serializable {
    private java.lang.String test_Check_MRContribuente_MDResult;

    public Test_Check_MRContribuente_MDResponse() {
    }

    public Test_Check_MRContribuente_MDResponse(
           java.lang.String test_Check_MRContribuente_MDResult) {
           this.test_Check_MRContribuente_MDResult = test_Check_MRContribuente_MDResult;
    }


    /**
     * Gets the test_Check_MRContribuente_MDResult value for this Test_Check_MRContribuente_MDResponse.
     * 
     * @return test_Check_MRContribuente_MDResult
     */
    public java.lang.String getTest_Check_MRContribuente_MDResult() {
        return test_Check_MRContribuente_MDResult;
    }


    /**
     * Sets the test_Check_MRContribuente_MDResult value for this Test_Check_MRContribuente_MDResponse.
     * 
     * @param test_Check_MRContribuente_MDResult
     */
    public void setTest_Check_MRContribuente_MDResult(java.lang.String test_Check_MRContribuente_MDResult) {
        this.test_Check_MRContribuente_MDResult = test_Check_MRContribuente_MDResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Test_Check_MRContribuente_MDResponse)) return false;
        Test_Check_MRContribuente_MDResponse other = (Test_Check_MRContribuente_MDResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.test_Check_MRContribuente_MDResult==null && other.getTest_Check_MRContribuente_MDResult()==null) || 
             (this.test_Check_MRContribuente_MDResult!=null &&
              this.test_Check_MRContribuente_MDResult.equals(other.getTest_Check_MRContribuente_MDResult())));
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
        if (getTest_Check_MRContribuente_MDResult() != null) {
            _hashCode += getTest_Check_MRContribuente_MDResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Test_Check_MRContribuente_MDResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", ">Test_Check_MRContribuente_MDResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("test_Check_MRContribuente_MDResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", "Test_Check_MRContribuente_MDResult"));
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
