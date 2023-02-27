/**
 * RecuperaDettaglioProposte_MRContribuenteResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.seda.risconet.ws_provvedimenti_ext;

public class RecuperaDettaglioProposte_MRContribuenteResponse  implements java.io.Serializable {
    private it.seda.risconet.ws_provvedimenti_ext.RecuperaDettaglioProposte_MRContribuenteResponseRecuperaDettaglioProposte_MRContribuenteResult recuperaDettaglioProposte_MRContribuenteResult;

    public RecuperaDettaglioProposte_MRContribuenteResponse() {
    }

    public RecuperaDettaglioProposte_MRContribuenteResponse(
           it.seda.risconet.ws_provvedimenti_ext.RecuperaDettaglioProposte_MRContribuenteResponseRecuperaDettaglioProposte_MRContribuenteResult recuperaDettaglioProposte_MRContribuenteResult) {
           this.recuperaDettaglioProposte_MRContribuenteResult = recuperaDettaglioProposte_MRContribuenteResult;
    }


    /**
     * Gets the recuperaDettaglioProposte_MRContribuenteResult value for this RecuperaDettaglioProposte_MRContribuenteResponse.
     * 
     * @return recuperaDettaglioProposte_MRContribuenteResult
     */
    public it.seda.risconet.ws_provvedimenti_ext.RecuperaDettaglioProposte_MRContribuenteResponseRecuperaDettaglioProposte_MRContribuenteResult getRecuperaDettaglioProposte_MRContribuenteResult() {
        return recuperaDettaglioProposte_MRContribuenteResult;
    }


    /**
     * Sets the recuperaDettaglioProposte_MRContribuenteResult value for this RecuperaDettaglioProposte_MRContribuenteResponse.
     * 
     * @param recuperaDettaglioProposte_MRContribuenteResult
     */
    public void setRecuperaDettaglioProposte_MRContribuenteResult(it.seda.risconet.ws_provvedimenti_ext.RecuperaDettaglioProposte_MRContribuenteResponseRecuperaDettaglioProposte_MRContribuenteResult recuperaDettaglioProposte_MRContribuenteResult) {
        this.recuperaDettaglioProposte_MRContribuenteResult = recuperaDettaglioProposte_MRContribuenteResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RecuperaDettaglioProposte_MRContribuenteResponse)) return false;
        RecuperaDettaglioProposte_MRContribuenteResponse other = (RecuperaDettaglioProposte_MRContribuenteResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.recuperaDettaglioProposte_MRContribuenteResult==null && other.getRecuperaDettaglioProposte_MRContribuenteResult()==null) || 
             (this.recuperaDettaglioProposte_MRContribuenteResult!=null &&
              this.recuperaDettaglioProposte_MRContribuenteResult.equals(other.getRecuperaDettaglioProposte_MRContribuenteResult())));
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
        if (getRecuperaDettaglioProposte_MRContribuenteResult() != null) {
            _hashCode += getRecuperaDettaglioProposte_MRContribuenteResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RecuperaDettaglioProposte_MRContribuenteResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", ">RecuperaDettaglioProposte_MRContribuenteResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recuperaDettaglioProposte_MRContribuenteResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", "RecuperaDettaglioProposte_MRContribuenteResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", ">>RecuperaDettaglioProposte_MRContribuenteResponse>RecuperaDettaglioProposte_MRContribuenteResult"));
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
