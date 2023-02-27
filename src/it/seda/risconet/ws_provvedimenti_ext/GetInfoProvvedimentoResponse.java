/**
 * GetInfoProvvedimentoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.seda.risconet.ws_provvedimenti_ext;

public class GetInfoProvvedimentoResponse  implements java.io.Serializable {
    private it.seda.risconet.ws_provvedimenti_ext.GetInfoProvvedimentoResponseGetInfoProvvedimentoResult getInfoProvvedimentoResult;

    public GetInfoProvvedimentoResponse() {
    }

    public GetInfoProvvedimentoResponse(
           it.seda.risconet.ws_provvedimenti_ext.GetInfoProvvedimentoResponseGetInfoProvvedimentoResult getInfoProvvedimentoResult) {
           this.getInfoProvvedimentoResult = getInfoProvvedimentoResult;
    }


    /**
     * Gets the getInfoProvvedimentoResult value for this GetInfoProvvedimentoResponse.
     * 
     * @return getInfoProvvedimentoResult
     */
    public it.seda.risconet.ws_provvedimenti_ext.GetInfoProvvedimentoResponseGetInfoProvvedimentoResult getGetInfoProvvedimentoResult() {
        return getInfoProvvedimentoResult;
    }


    /**
     * Sets the getInfoProvvedimentoResult value for this GetInfoProvvedimentoResponse.
     * 
     * @param getInfoProvvedimentoResult
     */
    public void setGetInfoProvvedimentoResult(it.seda.risconet.ws_provvedimenti_ext.GetInfoProvvedimentoResponseGetInfoProvvedimentoResult getInfoProvvedimentoResult) {
        this.getInfoProvvedimentoResult = getInfoProvvedimentoResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetInfoProvvedimentoResponse)) return false;
        GetInfoProvvedimentoResponse other = (GetInfoProvvedimentoResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getInfoProvvedimentoResult==null && other.getGetInfoProvvedimentoResult()==null) || 
             (this.getInfoProvvedimentoResult!=null &&
              this.getInfoProvvedimentoResult.equals(other.getGetInfoProvvedimentoResult())));
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
        if (getGetInfoProvvedimentoResult() != null) {
            _hashCode += getGetInfoProvvedimentoResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetInfoProvvedimentoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", ">GetInfoProvvedimentoResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getInfoProvvedimentoResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", "GetInfoProvvedimentoResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", ">>GetInfoProvvedimentoResponse>GetInfoProvvedimentoResult"));
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
