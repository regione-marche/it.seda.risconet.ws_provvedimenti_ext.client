/**
 * CalcolaProvvedimentoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.seda.risconet.ws_provvedimenti_ext;

public class CalcolaProvvedimentoResponse  implements java.io.Serializable {
    private it.seda.risconet.ws_provvedimenti_ext.CalcolaProvvedimentoResponseCalcolaProvvedimentoResult calcolaProvvedimentoResult;

    public CalcolaProvvedimentoResponse() {
    }

    public CalcolaProvvedimentoResponse(
           it.seda.risconet.ws_provvedimenti_ext.CalcolaProvvedimentoResponseCalcolaProvvedimentoResult calcolaProvvedimentoResult) {
           this.calcolaProvvedimentoResult = calcolaProvvedimentoResult;
    }


    /**
     * Gets the calcolaProvvedimentoResult value for this CalcolaProvvedimentoResponse.
     * 
     * @return calcolaProvvedimentoResult
     */
    public it.seda.risconet.ws_provvedimenti_ext.CalcolaProvvedimentoResponseCalcolaProvvedimentoResult getCalcolaProvvedimentoResult() {
        return calcolaProvvedimentoResult;
    }


    /**
     * Sets the calcolaProvvedimentoResult value for this CalcolaProvvedimentoResponse.
     * 
     * @param calcolaProvvedimentoResult
     */
    public void setCalcolaProvvedimentoResult(it.seda.risconet.ws_provvedimenti_ext.CalcolaProvvedimentoResponseCalcolaProvvedimentoResult calcolaProvvedimentoResult) {
        this.calcolaProvvedimentoResult = calcolaProvvedimentoResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CalcolaProvvedimentoResponse)) return false;
        CalcolaProvvedimentoResponse other = (CalcolaProvvedimentoResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.calcolaProvvedimentoResult==null && other.getCalcolaProvvedimentoResult()==null) || 
             (this.calcolaProvvedimentoResult!=null &&
              this.calcolaProvvedimentoResult.equals(other.getCalcolaProvvedimentoResult())));
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
        if (getCalcolaProvvedimentoResult() != null) {
            _hashCode += getCalcolaProvvedimentoResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CalcolaProvvedimentoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", ">CalcolaProvvedimentoResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("calcolaProvvedimentoResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", "CalcolaProvvedimentoResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", ">>CalcolaProvvedimentoResponse>CalcolaProvvedimentoResult"));
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
