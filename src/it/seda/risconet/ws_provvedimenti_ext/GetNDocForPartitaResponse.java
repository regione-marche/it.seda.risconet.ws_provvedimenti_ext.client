/**
 * GetNDocForPartitaResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.seda.risconet.ws_provvedimenti_ext;

public class GetNDocForPartitaResponse  implements java.io.Serializable {
    private it.seda.risconet.ws_provvedimenti_ext.GetNDocForPartitaResponseGetNDocForPartitaResult getNDocForPartitaResult;

    public GetNDocForPartitaResponse() {
    }

    public GetNDocForPartitaResponse(
           it.seda.risconet.ws_provvedimenti_ext.GetNDocForPartitaResponseGetNDocForPartitaResult getNDocForPartitaResult) {
           this.getNDocForPartitaResult = getNDocForPartitaResult;
    }


    /**
     * Gets the getNDocForPartitaResult value for this GetNDocForPartitaResponse.
     * 
     * @return getNDocForPartitaResult
     */
    public it.seda.risconet.ws_provvedimenti_ext.GetNDocForPartitaResponseGetNDocForPartitaResult getGetNDocForPartitaResult() {
        return getNDocForPartitaResult;
    }


    /**
     * Sets the getNDocForPartitaResult value for this GetNDocForPartitaResponse.
     * 
     * @param getNDocForPartitaResult
     */
    public void setGetNDocForPartitaResult(it.seda.risconet.ws_provvedimenti_ext.GetNDocForPartitaResponseGetNDocForPartitaResult getNDocForPartitaResult) {
        this.getNDocForPartitaResult = getNDocForPartitaResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetNDocForPartitaResponse)) return false;
        GetNDocForPartitaResponse other = (GetNDocForPartitaResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getNDocForPartitaResult==null && other.getGetNDocForPartitaResult()==null) || 
             (this.getNDocForPartitaResult!=null &&
              this.getNDocForPartitaResult.equals(other.getGetNDocForPartitaResult())));
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
        if (getGetNDocForPartitaResult() != null) {
            _hashCode += getGetNDocForPartitaResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetNDocForPartitaResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", ">GetNDocForPartitaResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getNDocForPartitaResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", "GetNDocForPartitaResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", ">>GetNDocForPartitaResponse>GetNDocForPartitaResult"));
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
