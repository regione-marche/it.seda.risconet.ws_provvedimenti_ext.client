/**
 * Test_SalvaProposta_MRContribuenteP5.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.seda.risconet.ws_provvedimenti_ext;

public class Test_SalvaProposta_MRContribuenteP5  implements java.io.Serializable {
    private java.lang.String XML;

    public Test_SalvaProposta_MRContribuenteP5() {
    }

    public Test_SalvaProposta_MRContribuenteP5(
           java.lang.String XML) {
           this.XML = XML;
    }


    /**
     * Gets the XML value for this Test_SalvaProposta_MRContribuenteP5.
     * 
     * @return XML
     */
    public java.lang.String getXML() {
        return XML;
    }


    /**
     * Sets the XML value for this Test_SalvaProposta_MRContribuenteP5.
     * 
     * @param XML
     */
    public void setXML(java.lang.String XML) {
        this.XML = XML;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Test_SalvaProposta_MRContribuenteP5)) return false;
        Test_SalvaProposta_MRContribuenteP5 other = (Test_SalvaProposta_MRContribuenteP5) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.XML==null && other.getXML()==null) || 
             (this.XML!=null &&
              this.XML.equals(other.getXML())));
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
        if (getXML() != null) {
            _hashCode += getXML().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Test_SalvaProposta_MRContribuenteP5.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", ">Test_SalvaProposta_MRContribuenteP5"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("XML");
        elemField.setXmlName(new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", "XML"));
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
