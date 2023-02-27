/**
 * Test_ModificaProposta_MRContribuenteResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.seda.risconet.ws_provvedimenti_ext;

public class Test_ModificaProposta_MRContribuenteResponse  implements java.io.Serializable {
    private java.lang.String test_ModificaProposta_MRContribuenteResult;

    public Test_ModificaProposta_MRContribuenteResponse() {
    }

    public Test_ModificaProposta_MRContribuenteResponse(
           java.lang.String test_ModificaProposta_MRContribuenteResult) {
           this.test_ModificaProposta_MRContribuenteResult = test_ModificaProposta_MRContribuenteResult;
    }


    /**
     * Gets the test_ModificaProposta_MRContribuenteResult value for this Test_ModificaProposta_MRContribuenteResponse.
     * 
     * @return test_ModificaProposta_MRContribuenteResult
     */
    public java.lang.String getTest_ModificaProposta_MRContribuenteResult() {
        return test_ModificaProposta_MRContribuenteResult;
    }


    /**
     * Sets the test_ModificaProposta_MRContribuenteResult value for this Test_ModificaProposta_MRContribuenteResponse.
     * 
     * @param test_ModificaProposta_MRContribuenteResult
     */
    public void setTest_ModificaProposta_MRContribuenteResult(java.lang.String test_ModificaProposta_MRContribuenteResult) {
        this.test_ModificaProposta_MRContribuenteResult = test_ModificaProposta_MRContribuenteResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Test_ModificaProposta_MRContribuenteResponse)) return false;
        Test_ModificaProposta_MRContribuenteResponse other = (Test_ModificaProposta_MRContribuenteResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.test_ModificaProposta_MRContribuenteResult==null && other.getTest_ModificaProposta_MRContribuenteResult()==null) || 
             (this.test_ModificaProposta_MRContribuenteResult!=null &&
              this.test_ModificaProposta_MRContribuenteResult.equals(other.getTest_ModificaProposta_MRContribuenteResult())));
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
        if (getTest_ModificaProposta_MRContribuenteResult() != null) {
            _hashCode += getTest_ModificaProposta_MRContribuenteResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Test_ModificaProposta_MRContribuenteResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", ">Test_ModificaProposta_MRContribuenteResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("test_ModificaProposta_MRContribuenteResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", "Test_ModificaProposta_MRContribuenteResult"));
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
