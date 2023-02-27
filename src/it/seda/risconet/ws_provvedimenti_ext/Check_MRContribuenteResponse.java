/**
 * Check_MRContribuenteResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.seda.risconet.ws_provvedimenti_ext;

public class Check_MRContribuenteResponse  implements java.io.Serializable {
    private it.seda.risconet.ws_provvedimenti_ext.Check_MRContribuenteResponseCheck_MRContribuenteResult check_MRContribuenteResult;

    public Check_MRContribuenteResponse() {
    }

    public Check_MRContribuenteResponse(
           it.seda.risconet.ws_provvedimenti_ext.Check_MRContribuenteResponseCheck_MRContribuenteResult check_MRContribuenteResult) {
           this.check_MRContribuenteResult = check_MRContribuenteResult;
    }


    /**
     * Gets the check_MRContribuenteResult value for this Check_MRContribuenteResponse.
     * 
     * @return check_MRContribuenteResult
     */
    public it.seda.risconet.ws_provvedimenti_ext.Check_MRContribuenteResponseCheck_MRContribuenteResult getCheck_MRContribuenteResult() {
        return check_MRContribuenteResult;
    }


    /**
     * Sets the check_MRContribuenteResult value for this Check_MRContribuenteResponse.
     * 
     * @param check_MRContribuenteResult
     */
    public void setCheck_MRContribuenteResult(it.seda.risconet.ws_provvedimenti_ext.Check_MRContribuenteResponseCheck_MRContribuenteResult check_MRContribuenteResult) {
        this.check_MRContribuenteResult = check_MRContribuenteResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Check_MRContribuenteResponse)) return false;
        Check_MRContribuenteResponse other = (Check_MRContribuenteResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.check_MRContribuenteResult==null && other.getCheck_MRContribuenteResult()==null) || 
             (this.check_MRContribuenteResult!=null &&
              this.check_MRContribuenteResult.equals(other.getCheck_MRContribuenteResult())));
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
        if (getCheck_MRContribuenteResult() != null) {
            _hashCode += getCheck_MRContribuenteResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Check_MRContribuenteResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", ">Check_MRContribuenteResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("check_MRContribuenteResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", "Check_MRContribuenteResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", ">>Check_MRContribuenteResponse>Check_MRContribuenteResult"));
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
