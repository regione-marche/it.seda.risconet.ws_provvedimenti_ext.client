/**
 * CancellaProposta_MRContribuenteResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.seda.risconet.ws_provvedimenti_ext;

public class CancellaProposta_MRContribuenteResponse  implements java.io.Serializable {
    private it.seda.risconet.ws_provvedimenti_ext.CancellaProposta_MRContribuenteResponseCancellaProposta_MRContribuenteResult cancellaProposta_MRContribuenteResult;

    public CancellaProposta_MRContribuenteResponse() {
    }

    public CancellaProposta_MRContribuenteResponse(
           it.seda.risconet.ws_provvedimenti_ext.CancellaProposta_MRContribuenteResponseCancellaProposta_MRContribuenteResult cancellaProposta_MRContribuenteResult) {
           this.cancellaProposta_MRContribuenteResult = cancellaProposta_MRContribuenteResult;
    }


    /**
     * Gets the cancellaProposta_MRContribuenteResult value for this CancellaProposta_MRContribuenteResponse.
     * 
     * @return cancellaProposta_MRContribuenteResult
     */
    public it.seda.risconet.ws_provvedimenti_ext.CancellaProposta_MRContribuenteResponseCancellaProposta_MRContribuenteResult getCancellaProposta_MRContribuenteResult() {
        return cancellaProposta_MRContribuenteResult;
    }


    /**
     * Sets the cancellaProposta_MRContribuenteResult value for this CancellaProposta_MRContribuenteResponse.
     * 
     * @param cancellaProposta_MRContribuenteResult
     */
    public void setCancellaProposta_MRContribuenteResult(it.seda.risconet.ws_provvedimenti_ext.CancellaProposta_MRContribuenteResponseCancellaProposta_MRContribuenteResult cancellaProposta_MRContribuenteResult) {
        this.cancellaProposta_MRContribuenteResult = cancellaProposta_MRContribuenteResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CancellaProposta_MRContribuenteResponse)) return false;
        CancellaProposta_MRContribuenteResponse other = (CancellaProposta_MRContribuenteResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cancellaProposta_MRContribuenteResult==null && other.getCancellaProposta_MRContribuenteResult()==null) || 
             (this.cancellaProposta_MRContribuenteResult!=null &&
              this.cancellaProposta_MRContribuenteResult.equals(other.getCancellaProposta_MRContribuenteResult())));
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
        if (getCancellaProposta_MRContribuenteResult() != null) {
            _hashCode += getCancellaProposta_MRContribuenteResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CancellaProposta_MRContribuenteResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", ">CancellaProposta_MRContribuenteResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cancellaProposta_MRContribuenteResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", "CancellaProposta_MRContribuenteResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", ">>CancellaProposta_MRContribuenteResponse>CancellaProposta_MRContribuenteResult"));
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
