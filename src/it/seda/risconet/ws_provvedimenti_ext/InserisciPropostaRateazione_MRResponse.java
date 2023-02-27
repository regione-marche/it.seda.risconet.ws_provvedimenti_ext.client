/**
 * InserisciPropostaRateazione_MRResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.seda.risconet.ws_provvedimenti_ext;

public class InserisciPropostaRateazione_MRResponse  implements java.io.Serializable {
    private it.seda.risconet.ws_provvedimenti_ext.InserisciPropostaRateazione_MRResponseInserisciPropostaRateazione_MRResult inserisciPropostaRateazione_MRResult;

    public InserisciPropostaRateazione_MRResponse() {
    }

    public InserisciPropostaRateazione_MRResponse(
           it.seda.risconet.ws_provvedimenti_ext.InserisciPropostaRateazione_MRResponseInserisciPropostaRateazione_MRResult inserisciPropostaRateazione_MRResult) {
           this.inserisciPropostaRateazione_MRResult = inserisciPropostaRateazione_MRResult;
    }


    /**
     * Gets the inserisciPropostaRateazione_MRResult value for this InserisciPropostaRateazione_MRResponse.
     * 
     * @return inserisciPropostaRateazione_MRResult
     */
    public it.seda.risconet.ws_provvedimenti_ext.InserisciPropostaRateazione_MRResponseInserisciPropostaRateazione_MRResult getInserisciPropostaRateazione_MRResult() {
        return inserisciPropostaRateazione_MRResult;
    }


    /**
     * Sets the inserisciPropostaRateazione_MRResult value for this InserisciPropostaRateazione_MRResponse.
     * 
     * @param inserisciPropostaRateazione_MRResult
     */
    public void setInserisciPropostaRateazione_MRResult(it.seda.risconet.ws_provvedimenti_ext.InserisciPropostaRateazione_MRResponseInserisciPropostaRateazione_MRResult inserisciPropostaRateazione_MRResult) {
        this.inserisciPropostaRateazione_MRResult = inserisciPropostaRateazione_MRResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InserisciPropostaRateazione_MRResponse)) return false;
        InserisciPropostaRateazione_MRResponse other = (InserisciPropostaRateazione_MRResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.inserisciPropostaRateazione_MRResult==null && other.getInserisciPropostaRateazione_MRResult()==null) || 
             (this.inserisciPropostaRateazione_MRResult!=null &&
              this.inserisciPropostaRateazione_MRResult.equals(other.getInserisciPropostaRateazione_MRResult())));
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
        if (getInserisciPropostaRateazione_MRResult() != null) {
            _hashCode += getInserisciPropostaRateazione_MRResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InserisciPropostaRateazione_MRResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", ">InserisciPropostaRateazione_MRResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inserisciPropostaRateazione_MRResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", "InserisciPropostaRateazione_MRResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", ">>InserisciPropostaRateazione_MRResponse>InserisciPropostaRateazione_MRResult"));
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
