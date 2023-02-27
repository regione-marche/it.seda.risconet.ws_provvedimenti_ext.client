/**
 * Test_SalvaProposta_MRContribuenteP5Response.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.seda.risconet.ws_provvedimenti_ext;

public class Test_SalvaProposta_MRContribuenteP5Response  implements java.io.Serializable {
    private java.lang.String test_SalvaProposta_MRContribuenteP5Result;

    public Test_SalvaProposta_MRContribuenteP5Response() {
    }

    public Test_SalvaProposta_MRContribuenteP5Response(
           java.lang.String test_SalvaProposta_MRContribuenteP5Result) {
           this.test_SalvaProposta_MRContribuenteP5Result = test_SalvaProposta_MRContribuenteP5Result;
    }


    /**
     * Gets the test_SalvaProposta_MRContribuenteP5Result value for this Test_SalvaProposta_MRContribuenteP5Response.
     * 
     * @return test_SalvaProposta_MRContribuenteP5Result
     */
    public java.lang.String getTest_SalvaProposta_MRContribuenteP5Result() {
        return test_SalvaProposta_MRContribuenteP5Result;
    }


    /**
     * Sets the test_SalvaProposta_MRContribuenteP5Result value for this Test_SalvaProposta_MRContribuenteP5Response.
     * 
     * @param test_SalvaProposta_MRContribuenteP5Result
     */
    public void setTest_SalvaProposta_MRContribuenteP5Result(java.lang.String test_SalvaProposta_MRContribuenteP5Result) {
        this.test_SalvaProposta_MRContribuenteP5Result = test_SalvaProposta_MRContribuenteP5Result;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Test_SalvaProposta_MRContribuenteP5Response)) return false;
        Test_SalvaProposta_MRContribuenteP5Response other = (Test_SalvaProposta_MRContribuenteP5Response) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.test_SalvaProposta_MRContribuenteP5Result==null && other.getTest_SalvaProposta_MRContribuenteP5Result()==null) || 
             (this.test_SalvaProposta_MRContribuenteP5Result!=null &&
              this.test_SalvaProposta_MRContribuenteP5Result.equals(other.getTest_SalvaProposta_MRContribuenteP5Result())));
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
        if (getTest_SalvaProposta_MRContribuenteP5Result() != null) {
            _hashCode += getTest_SalvaProposta_MRContribuenteP5Result().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Test_SalvaProposta_MRContribuenteP5Response.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", ">Test_SalvaProposta_MRContribuenteP5Response"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("test_SalvaProposta_MRContribuenteP5Result");
        elemField.setXmlName(new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", "Test_SalvaProposta_MRContribuenteP5Result"));
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
