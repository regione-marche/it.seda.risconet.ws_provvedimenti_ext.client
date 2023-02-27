/**
 * ListaProposte_MRContribuenteResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.seda.risconet.ws_provvedimenti_ext;

public class ListaProposte_MRContribuenteResponse  implements java.io.Serializable {
    private it.seda.risconet.ws_provvedimenti_ext.ListaProposte_MRContribuenteResponseListaProposte_MRContribuenteResult listaProposte_MRContribuenteResult;

    public ListaProposte_MRContribuenteResponse() {
    }

    public ListaProposte_MRContribuenteResponse(
           it.seda.risconet.ws_provvedimenti_ext.ListaProposte_MRContribuenteResponseListaProposte_MRContribuenteResult listaProposte_MRContribuenteResult) {
           this.listaProposte_MRContribuenteResult = listaProposte_MRContribuenteResult;
    }


    /**
     * Gets the listaProposte_MRContribuenteResult value for this ListaProposte_MRContribuenteResponse.
     * 
     * @return listaProposte_MRContribuenteResult
     */
    public it.seda.risconet.ws_provvedimenti_ext.ListaProposte_MRContribuenteResponseListaProposte_MRContribuenteResult getListaProposte_MRContribuenteResult() {
        return listaProposte_MRContribuenteResult;
    }


    /**
     * Sets the listaProposte_MRContribuenteResult value for this ListaProposte_MRContribuenteResponse.
     * 
     * @param listaProposte_MRContribuenteResult
     */
    public void setListaProposte_MRContribuenteResult(it.seda.risconet.ws_provvedimenti_ext.ListaProposte_MRContribuenteResponseListaProposte_MRContribuenteResult listaProposte_MRContribuenteResult) {
        this.listaProposte_MRContribuenteResult = listaProposte_MRContribuenteResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ListaProposte_MRContribuenteResponse)) return false;
        ListaProposte_MRContribuenteResponse other = (ListaProposte_MRContribuenteResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.listaProposte_MRContribuenteResult==null && other.getListaProposte_MRContribuenteResult()==null) || 
             (this.listaProposte_MRContribuenteResult!=null &&
              this.listaProposte_MRContribuenteResult.equals(other.getListaProposte_MRContribuenteResult())));
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
        if (getListaProposte_MRContribuenteResult() != null) {
            _hashCode += getListaProposte_MRContribuenteResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ListaProposte_MRContribuenteResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", ">ListaProposte_MRContribuenteResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listaProposte_MRContribuenteResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", "ListaProposte_MRContribuenteResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", ">>ListaProposte_MRContribuenteResponse>ListaProposte_MRContribuenteResult"));
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
