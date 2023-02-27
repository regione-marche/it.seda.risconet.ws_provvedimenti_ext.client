/**
 * EP_NuovoProvvedimento_Sospensione_ExtResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.seda.risconet.ws_provvedimenti_ext;

public class EP_NuovoProvvedimento_Sospensione_ExtResponse  implements java.io.Serializable {
    private it.seda.risconet.ws_provvedimenti_ext.EP_NuovoProvvedimento_Sospensione_ExtResponseEP_NuovoProvvedimento_Sospensione_ExtResult EP_NuovoProvvedimento_Sospensione_ExtResult;

    public EP_NuovoProvvedimento_Sospensione_ExtResponse() {
    }

    public EP_NuovoProvvedimento_Sospensione_ExtResponse(
           it.seda.risconet.ws_provvedimenti_ext.EP_NuovoProvvedimento_Sospensione_ExtResponseEP_NuovoProvvedimento_Sospensione_ExtResult EP_NuovoProvvedimento_Sospensione_ExtResult) {
           this.EP_NuovoProvvedimento_Sospensione_ExtResult = EP_NuovoProvvedimento_Sospensione_ExtResult;
    }


    /**
     * Gets the EP_NuovoProvvedimento_Sospensione_ExtResult value for this EP_NuovoProvvedimento_Sospensione_ExtResponse.
     * 
     * @return EP_NuovoProvvedimento_Sospensione_ExtResult
     */
    public it.seda.risconet.ws_provvedimenti_ext.EP_NuovoProvvedimento_Sospensione_ExtResponseEP_NuovoProvvedimento_Sospensione_ExtResult getEP_NuovoProvvedimento_Sospensione_ExtResult() {
        return EP_NuovoProvvedimento_Sospensione_ExtResult;
    }


    /**
     * Sets the EP_NuovoProvvedimento_Sospensione_ExtResult value for this EP_NuovoProvvedimento_Sospensione_ExtResponse.
     * 
     * @param EP_NuovoProvvedimento_Sospensione_ExtResult
     */
    public void setEP_NuovoProvvedimento_Sospensione_ExtResult(it.seda.risconet.ws_provvedimenti_ext.EP_NuovoProvvedimento_Sospensione_ExtResponseEP_NuovoProvvedimento_Sospensione_ExtResult EP_NuovoProvvedimento_Sospensione_ExtResult) {
        this.EP_NuovoProvvedimento_Sospensione_ExtResult = EP_NuovoProvvedimento_Sospensione_ExtResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EP_NuovoProvvedimento_Sospensione_ExtResponse)) return false;
        EP_NuovoProvvedimento_Sospensione_ExtResponse other = (EP_NuovoProvvedimento_Sospensione_ExtResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.EP_NuovoProvvedimento_Sospensione_ExtResult==null && other.getEP_NuovoProvvedimento_Sospensione_ExtResult()==null) || 
             (this.EP_NuovoProvvedimento_Sospensione_ExtResult!=null &&
              this.EP_NuovoProvvedimento_Sospensione_ExtResult.equals(other.getEP_NuovoProvvedimento_Sospensione_ExtResult())));
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
        if (getEP_NuovoProvvedimento_Sospensione_ExtResult() != null) {
            _hashCode += getEP_NuovoProvvedimento_Sospensione_ExtResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EP_NuovoProvvedimento_Sospensione_ExtResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", ">EP_NuovoProvvedimento_Sospensione_ExtResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EP_NuovoProvvedimento_Sospensione_ExtResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", "EP_NuovoProvvedimento_Sospensione_ExtResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", ">>EP_NuovoProvvedimento_Sospensione_ExtResponse>EP_NuovoProvvedimento_Sospensione_ExtResult"));
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
