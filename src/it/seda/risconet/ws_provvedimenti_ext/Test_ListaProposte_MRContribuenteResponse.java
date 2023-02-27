/**
 * Test_ListaProposte_MRContribuenteResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.seda.risconet.ws_provvedimenti_ext;

public class Test_ListaProposte_MRContribuenteResponse  implements java.io.Serializable {
    private java.lang.String test_ListaProposte_MRContribuenteResult;

    public Test_ListaProposte_MRContribuenteResponse() {
    }

    public Test_ListaProposte_MRContribuenteResponse(
           java.lang.String test_ListaProposte_MRContribuenteResult) {
           this.test_ListaProposte_MRContribuenteResult = test_ListaProposte_MRContribuenteResult;
    }


    /**
     * Gets the test_ListaProposte_MRContribuenteResult value for this Test_ListaProposte_MRContribuenteResponse.
     * 
     * @return test_ListaProposte_MRContribuenteResult
     */
    public java.lang.String getTest_ListaProposte_MRContribuenteResult() {
        return test_ListaProposte_MRContribuenteResult;
    }


    /**
     * Sets the test_ListaProposte_MRContribuenteResult value for this Test_ListaProposte_MRContribuenteResponse.
     * 
     * @param test_ListaProposte_MRContribuenteResult
     */
    public void setTest_ListaProposte_MRContribuenteResult(java.lang.String test_ListaProposte_MRContribuenteResult) {
        this.test_ListaProposte_MRContribuenteResult = test_ListaProposte_MRContribuenteResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Test_ListaProposte_MRContribuenteResponse)) return false;
        Test_ListaProposte_MRContribuenteResponse other = (Test_ListaProposte_MRContribuenteResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.test_ListaProposte_MRContribuenteResult==null && other.getTest_ListaProposte_MRContribuenteResult()==null) || 
             (this.test_ListaProposte_MRContribuenteResult!=null &&
              this.test_ListaProposte_MRContribuenteResult.equals(other.getTest_ListaProposte_MRContribuenteResult())));
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
        if (getTest_ListaProposte_MRContribuenteResult() != null) {
            _hashCode += getTest_ListaProposte_MRContribuenteResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Test_ListaProposte_MRContribuenteResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", ">Test_ListaProposte_MRContribuenteResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("test_ListaProposte_MRContribuenteResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", "Test_ListaProposte_MRContribuenteResult"));
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
