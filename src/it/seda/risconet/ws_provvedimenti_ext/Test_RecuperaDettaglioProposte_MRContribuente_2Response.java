/**
 * Test_RecuperaDettaglioProposte_MRContribuente_2Response.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.seda.risconet.ws_provvedimenti_ext;

public class Test_RecuperaDettaglioProposte_MRContribuente_2Response  implements java.io.Serializable {
    private java.lang.String test_RecuperaDettaglioProposte_MRContribuente_2Result;

    public Test_RecuperaDettaglioProposte_MRContribuente_2Response() {
    }

    public Test_RecuperaDettaglioProposte_MRContribuente_2Response(
           java.lang.String test_RecuperaDettaglioProposte_MRContribuente_2Result) {
           this.test_RecuperaDettaglioProposte_MRContribuente_2Result = test_RecuperaDettaglioProposte_MRContribuente_2Result;
    }


    /**
     * Gets the test_RecuperaDettaglioProposte_MRContribuente_2Result value for this Test_RecuperaDettaglioProposte_MRContribuente_2Response.
     * 
     * @return test_RecuperaDettaglioProposte_MRContribuente_2Result
     */
    public java.lang.String getTest_RecuperaDettaglioProposte_MRContribuente_2Result() {
        return test_RecuperaDettaglioProposte_MRContribuente_2Result;
    }


    /**
     * Sets the test_RecuperaDettaglioProposte_MRContribuente_2Result value for this Test_RecuperaDettaglioProposte_MRContribuente_2Response.
     * 
     * @param test_RecuperaDettaglioProposte_MRContribuente_2Result
     */
    public void setTest_RecuperaDettaglioProposte_MRContribuente_2Result(java.lang.String test_RecuperaDettaglioProposte_MRContribuente_2Result) {
        this.test_RecuperaDettaglioProposte_MRContribuente_2Result = test_RecuperaDettaglioProposte_MRContribuente_2Result;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Test_RecuperaDettaglioProposte_MRContribuente_2Response)) return false;
        Test_RecuperaDettaglioProposte_MRContribuente_2Response other = (Test_RecuperaDettaglioProposte_MRContribuente_2Response) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.test_RecuperaDettaglioProposte_MRContribuente_2Result==null && other.getTest_RecuperaDettaglioProposte_MRContribuente_2Result()==null) || 
             (this.test_RecuperaDettaglioProposte_MRContribuente_2Result!=null &&
              this.test_RecuperaDettaglioProposte_MRContribuente_2Result.equals(other.getTest_RecuperaDettaglioProposte_MRContribuente_2Result())));
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
        if (getTest_RecuperaDettaglioProposte_MRContribuente_2Result() != null) {
            _hashCode += getTest_RecuperaDettaglioProposte_MRContribuente_2Result().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Test_RecuperaDettaglioProposte_MRContribuente_2Response.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", ">Test_RecuperaDettaglioProposte_MRContribuente_2Response"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("test_RecuperaDettaglioProposte_MRContribuente_2Result");
        elemField.setXmlName(new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", "Test_RecuperaDettaglioProposte_MRContribuente_2Result"));
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
