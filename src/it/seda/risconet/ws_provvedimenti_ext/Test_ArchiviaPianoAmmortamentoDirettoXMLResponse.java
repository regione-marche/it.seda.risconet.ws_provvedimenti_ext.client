/**
 * Test_ArchiviaPianoAmmortamentoDirettoXMLResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.seda.risconet.ws_provvedimenti_ext;

public class Test_ArchiviaPianoAmmortamentoDirettoXMLResponse  implements java.io.Serializable {
    private java.lang.String test_ArchiviaPianoAmmortamentoDirettoXMLResult;

    public Test_ArchiviaPianoAmmortamentoDirettoXMLResponse() {
    }

    public Test_ArchiviaPianoAmmortamentoDirettoXMLResponse(
           java.lang.String test_ArchiviaPianoAmmortamentoDirettoXMLResult) {
           this.test_ArchiviaPianoAmmortamentoDirettoXMLResult = test_ArchiviaPianoAmmortamentoDirettoXMLResult;
    }


    /**
     * Gets the test_ArchiviaPianoAmmortamentoDirettoXMLResult value for this Test_ArchiviaPianoAmmortamentoDirettoXMLResponse.
     * 
     * @return test_ArchiviaPianoAmmortamentoDirettoXMLResult
     */
    public java.lang.String getTest_ArchiviaPianoAmmortamentoDirettoXMLResult() {
        return test_ArchiviaPianoAmmortamentoDirettoXMLResult;
    }


    /**
     * Sets the test_ArchiviaPianoAmmortamentoDirettoXMLResult value for this Test_ArchiviaPianoAmmortamentoDirettoXMLResponse.
     * 
     * @param test_ArchiviaPianoAmmortamentoDirettoXMLResult
     */
    public void setTest_ArchiviaPianoAmmortamentoDirettoXMLResult(java.lang.String test_ArchiviaPianoAmmortamentoDirettoXMLResult) {
        this.test_ArchiviaPianoAmmortamentoDirettoXMLResult = test_ArchiviaPianoAmmortamentoDirettoXMLResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Test_ArchiviaPianoAmmortamentoDirettoXMLResponse)) return false;
        Test_ArchiviaPianoAmmortamentoDirettoXMLResponse other = (Test_ArchiviaPianoAmmortamentoDirettoXMLResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.test_ArchiviaPianoAmmortamentoDirettoXMLResult==null && other.getTest_ArchiviaPianoAmmortamentoDirettoXMLResult()==null) || 
             (this.test_ArchiviaPianoAmmortamentoDirettoXMLResult!=null &&
              this.test_ArchiviaPianoAmmortamentoDirettoXMLResult.equals(other.getTest_ArchiviaPianoAmmortamentoDirettoXMLResult())));
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
        if (getTest_ArchiviaPianoAmmortamentoDirettoXMLResult() != null) {
            _hashCode += getTest_ArchiviaPianoAmmortamentoDirettoXMLResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Test_ArchiviaPianoAmmortamentoDirettoXMLResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", ">Test_ArchiviaPianoAmmortamentoDirettoXMLResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("test_ArchiviaPianoAmmortamentoDirettoXMLResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", "Test_ArchiviaPianoAmmortamentoDirettoXMLResult"));
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
