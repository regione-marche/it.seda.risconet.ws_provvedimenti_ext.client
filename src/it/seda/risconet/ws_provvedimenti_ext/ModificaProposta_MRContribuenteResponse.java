/**
 * ModificaProposta_MRContribuenteResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.seda.risconet.ws_provvedimenti_ext;

public class ModificaProposta_MRContribuenteResponse  implements java.io.Serializable {
    private it.seda.risconet.ws_provvedimenti_ext.ModificaProposta_MRContribuenteResponseModificaProposta_MRContribuenteResult modificaProposta_MRContribuenteResult;

    public ModificaProposta_MRContribuenteResponse() {
    }

    public ModificaProposta_MRContribuenteResponse(
           it.seda.risconet.ws_provvedimenti_ext.ModificaProposta_MRContribuenteResponseModificaProposta_MRContribuenteResult modificaProposta_MRContribuenteResult) {
           this.modificaProposta_MRContribuenteResult = modificaProposta_MRContribuenteResult;
    }


    /**
     * Gets the modificaProposta_MRContribuenteResult value for this ModificaProposta_MRContribuenteResponse.
     * 
     * @return modificaProposta_MRContribuenteResult
     */
    public it.seda.risconet.ws_provvedimenti_ext.ModificaProposta_MRContribuenteResponseModificaProposta_MRContribuenteResult getModificaProposta_MRContribuenteResult() {
        return modificaProposta_MRContribuenteResult;
    }


    /**
     * Sets the modificaProposta_MRContribuenteResult value for this ModificaProposta_MRContribuenteResponse.
     * 
     * @param modificaProposta_MRContribuenteResult
     */
    public void setModificaProposta_MRContribuenteResult(it.seda.risconet.ws_provvedimenti_ext.ModificaProposta_MRContribuenteResponseModificaProposta_MRContribuenteResult modificaProposta_MRContribuenteResult) {
        this.modificaProposta_MRContribuenteResult = modificaProposta_MRContribuenteResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ModificaProposta_MRContribuenteResponse)) return false;
        ModificaProposta_MRContribuenteResponse other = (ModificaProposta_MRContribuenteResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.modificaProposta_MRContribuenteResult==null && other.getModificaProposta_MRContribuenteResult()==null) || 
             (this.modificaProposta_MRContribuenteResult!=null &&
              this.modificaProposta_MRContribuenteResult.equals(other.getModificaProposta_MRContribuenteResult())));
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
        if (getModificaProposta_MRContribuenteResult() != null) {
            _hashCode += getModificaProposta_MRContribuenteResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ModificaProposta_MRContribuenteResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", ">ModificaProposta_MRContribuenteResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modificaProposta_MRContribuenteResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", "ModificaProposta_MRContribuenteResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", ">>ModificaProposta_MRContribuenteResponse>ModificaProposta_MRContribuenteResult"));
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
