/**
 * Test_ArchiviaPianoAmmortamentoDirettoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.seda.risconet.ws_provvedimenti_ext;

public class Test_ArchiviaPianoAmmortamentoDirettoResponse  implements java.io.Serializable {
    private java.lang.String test_ArchiviaPianoAmmortamentoDirettoResult;

    public Test_ArchiviaPianoAmmortamentoDirettoResponse() {
    }

    public Test_ArchiviaPianoAmmortamentoDirettoResponse(
           java.lang.String test_ArchiviaPianoAmmortamentoDirettoResult) {
           this.test_ArchiviaPianoAmmortamentoDirettoResult = test_ArchiviaPianoAmmortamentoDirettoResult;
    }


    /**
     * Gets the test_ArchiviaPianoAmmortamentoDirettoResult value for this Test_ArchiviaPianoAmmortamentoDirettoResponse.
     * 
     * @return test_ArchiviaPianoAmmortamentoDirettoResult
     */
    public java.lang.String getTest_ArchiviaPianoAmmortamentoDirettoResult() {
        return test_ArchiviaPianoAmmortamentoDirettoResult;
    }


    /**
     * Sets the test_ArchiviaPianoAmmortamentoDirettoResult value for this Test_ArchiviaPianoAmmortamentoDirettoResponse.
     * 
     * @param test_ArchiviaPianoAmmortamentoDirettoResult
     */
    public void setTest_ArchiviaPianoAmmortamentoDirettoResult(java.lang.String test_ArchiviaPianoAmmortamentoDirettoResult) {
        this.test_ArchiviaPianoAmmortamentoDirettoResult = test_ArchiviaPianoAmmortamentoDirettoResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Test_ArchiviaPianoAmmortamentoDirettoResponse)) return false;
        Test_ArchiviaPianoAmmortamentoDirettoResponse other = (Test_ArchiviaPianoAmmortamentoDirettoResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.test_ArchiviaPianoAmmortamentoDirettoResult==null && other.getTest_ArchiviaPianoAmmortamentoDirettoResult()==null) || 
             (this.test_ArchiviaPianoAmmortamentoDirettoResult!=null &&
              this.test_ArchiviaPianoAmmortamentoDirettoResult.equals(other.getTest_ArchiviaPianoAmmortamentoDirettoResult())));
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
        if (getTest_ArchiviaPianoAmmortamentoDirettoResult() != null) {
            _hashCode += getTest_ArchiviaPianoAmmortamentoDirettoResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Test_ArchiviaPianoAmmortamentoDirettoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", ">Test_ArchiviaPianoAmmortamentoDirettoResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("test_ArchiviaPianoAmmortamentoDirettoResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", "Test_ArchiviaPianoAmmortamentoDirettoResult"));
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
