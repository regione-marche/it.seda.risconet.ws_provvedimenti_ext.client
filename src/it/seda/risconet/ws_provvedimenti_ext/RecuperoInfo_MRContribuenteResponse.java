/**
 * RecuperoInfo_MRContribuenteResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.seda.risconet.ws_provvedimenti_ext;

public class RecuperoInfo_MRContribuenteResponse  implements java.io.Serializable {
    private it.seda.risconet.ws_provvedimenti_ext.RecuperoInfo_MRContribuenteResponseRecuperoInfo_MRContribuenteResult recuperoInfo_MRContribuenteResult;

    public RecuperoInfo_MRContribuenteResponse() {
    }

    public RecuperoInfo_MRContribuenteResponse(
           it.seda.risconet.ws_provvedimenti_ext.RecuperoInfo_MRContribuenteResponseRecuperoInfo_MRContribuenteResult recuperoInfo_MRContribuenteResult) {
           this.recuperoInfo_MRContribuenteResult = recuperoInfo_MRContribuenteResult;
    }


    /**
     * Gets the recuperoInfo_MRContribuenteResult value for this RecuperoInfo_MRContribuenteResponse.
     * 
     * @return recuperoInfo_MRContribuenteResult
     */
    public it.seda.risconet.ws_provvedimenti_ext.RecuperoInfo_MRContribuenteResponseRecuperoInfo_MRContribuenteResult getRecuperoInfo_MRContribuenteResult() {
        return recuperoInfo_MRContribuenteResult;
    }


    /**
     * Sets the recuperoInfo_MRContribuenteResult value for this RecuperoInfo_MRContribuenteResponse.
     * 
     * @param recuperoInfo_MRContribuenteResult
     */
    public void setRecuperoInfo_MRContribuenteResult(it.seda.risconet.ws_provvedimenti_ext.RecuperoInfo_MRContribuenteResponseRecuperoInfo_MRContribuenteResult recuperoInfo_MRContribuenteResult) {
        this.recuperoInfo_MRContribuenteResult = recuperoInfo_MRContribuenteResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RecuperoInfo_MRContribuenteResponse)) return false;
        RecuperoInfo_MRContribuenteResponse other = (RecuperoInfo_MRContribuenteResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.recuperoInfo_MRContribuenteResult==null && other.getRecuperoInfo_MRContribuenteResult()==null) || 
             (this.recuperoInfo_MRContribuenteResult!=null &&
              this.recuperoInfo_MRContribuenteResult.equals(other.getRecuperoInfo_MRContribuenteResult())));
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
        if (getRecuperoInfo_MRContribuenteResult() != null) {
            _hashCode += getRecuperoInfo_MRContribuenteResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RecuperoInfo_MRContribuenteResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", ">RecuperoInfo_MRContribuenteResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recuperoInfo_MRContribuenteResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", "RecuperoInfo_MRContribuenteResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", ">>RecuperoInfo_MRContribuenteResponse>RecuperoInfo_MRContribuenteResult"));
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
