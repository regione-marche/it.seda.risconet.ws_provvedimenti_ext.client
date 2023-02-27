/**
 * SalvaProposta_MRContribuenteResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.seda.risconet.ws_provvedimenti_ext;

public class SalvaProposta_MRContribuenteResponse  implements java.io.Serializable {
    private it.seda.risconet.ws_provvedimenti_ext.SalvaProposta_MRContribuenteResponseSalvaProposta_MRContribuenteResult salvaProposta_MRContribuenteResult;

    public SalvaProposta_MRContribuenteResponse() {
    }

    public SalvaProposta_MRContribuenteResponse(
           it.seda.risconet.ws_provvedimenti_ext.SalvaProposta_MRContribuenteResponseSalvaProposta_MRContribuenteResult salvaProposta_MRContribuenteResult) {
           this.salvaProposta_MRContribuenteResult = salvaProposta_MRContribuenteResult;
    }


    /**
     * Gets the salvaProposta_MRContribuenteResult value for this SalvaProposta_MRContribuenteResponse.
     * 
     * @return salvaProposta_MRContribuenteResult
     */
    public it.seda.risconet.ws_provvedimenti_ext.SalvaProposta_MRContribuenteResponseSalvaProposta_MRContribuenteResult getSalvaProposta_MRContribuenteResult() {
        return salvaProposta_MRContribuenteResult;
    }


    /**
     * Sets the salvaProposta_MRContribuenteResult value for this SalvaProposta_MRContribuenteResponse.
     * 
     * @param salvaProposta_MRContribuenteResult
     */
    public void setSalvaProposta_MRContribuenteResult(it.seda.risconet.ws_provvedimenti_ext.SalvaProposta_MRContribuenteResponseSalvaProposta_MRContribuenteResult salvaProposta_MRContribuenteResult) {
        this.salvaProposta_MRContribuenteResult = salvaProposta_MRContribuenteResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SalvaProposta_MRContribuenteResponse)) return false;
        SalvaProposta_MRContribuenteResponse other = (SalvaProposta_MRContribuenteResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.salvaProposta_MRContribuenteResult==null && other.getSalvaProposta_MRContribuenteResult()==null) || 
             (this.salvaProposta_MRContribuenteResult!=null &&
              this.salvaProposta_MRContribuenteResult.equals(other.getSalvaProposta_MRContribuenteResult())));
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
        if (getSalvaProposta_MRContribuenteResult() != null) {
            _hashCode += getSalvaProposta_MRContribuenteResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SalvaProposta_MRContribuenteResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", ">SalvaProposta_MRContribuenteResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salvaProposta_MRContribuenteResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", "SalvaProposta_MRContribuenteResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", ">>SalvaProposta_MRContribuenteResponse>SalvaProposta_MRContribuenteResult"));
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
