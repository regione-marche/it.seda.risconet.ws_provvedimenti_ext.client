/**
 * Test_EP_NuovoProvvedimento_RevocaSospensione_ExtResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.seda.risconet.ws_provvedimenti_ext;

public class Test_EP_NuovoProvvedimento_RevocaSospensione_ExtResponse  implements java.io.Serializable {
    private java.lang.String test_EP_NuovoProvvedimento_RevocaSospensione_ExtResult;

    public Test_EP_NuovoProvvedimento_RevocaSospensione_ExtResponse() {
    }

    public Test_EP_NuovoProvvedimento_RevocaSospensione_ExtResponse(
           java.lang.String test_EP_NuovoProvvedimento_RevocaSospensione_ExtResult) {
           this.test_EP_NuovoProvvedimento_RevocaSospensione_ExtResult = test_EP_NuovoProvvedimento_RevocaSospensione_ExtResult;
    }


    /**
     * Gets the test_EP_NuovoProvvedimento_RevocaSospensione_ExtResult value for this Test_EP_NuovoProvvedimento_RevocaSospensione_ExtResponse.
     * 
     * @return test_EP_NuovoProvvedimento_RevocaSospensione_ExtResult
     */
    public java.lang.String getTest_EP_NuovoProvvedimento_RevocaSospensione_ExtResult() {
        return test_EP_NuovoProvvedimento_RevocaSospensione_ExtResult;
    }


    /**
     * Sets the test_EP_NuovoProvvedimento_RevocaSospensione_ExtResult value for this Test_EP_NuovoProvvedimento_RevocaSospensione_ExtResponse.
     * 
     * @param test_EP_NuovoProvvedimento_RevocaSospensione_ExtResult
     */
    public void setTest_EP_NuovoProvvedimento_RevocaSospensione_ExtResult(java.lang.String test_EP_NuovoProvvedimento_RevocaSospensione_ExtResult) {
        this.test_EP_NuovoProvvedimento_RevocaSospensione_ExtResult = test_EP_NuovoProvvedimento_RevocaSospensione_ExtResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Test_EP_NuovoProvvedimento_RevocaSospensione_ExtResponse)) return false;
        Test_EP_NuovoProvvedimento_RevocaSospensione_ExtResponse other = (Test_EP_NuovoProvvedimento_RevocaSospensione_ExtResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.test_EP_NuovoProvvedimento_RevocaSospensione_ExtResult==null && other.getTest_EP_NuovoProvvedimento_RevocaSospensione_ExtResult()==null) || 
             (this.test_EP_NuovoProvvedimento_RevocaSospensione_ExtResult!=null &&
              this.test_EP_NuovoProvvedimento_RevocaSospensione_ExtResult.equals(other.getTest_EP_NuovoProvvedimento_RevocaSospensione_ExtResult())));
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
        if (getTest_EP_NuovoProvvedimento_RevocaSospensione_ExtResult() != null) {
            _hashCode += getTest_EP_NuovoProvvedimento_RevocaSospensione_ExtResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Test_EP_NuovoProvvedimento_RevocaSospensione_ExtResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", ">Test_EP_NuovoProvvedimento_RevocaSospensione_ExtResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("test_EP_NuovoProvvedimento_RevocaSospensione_ExtResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", "Test_EP_NuovoProvvedimento_RevocaSospensione_ExtResult"));
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
