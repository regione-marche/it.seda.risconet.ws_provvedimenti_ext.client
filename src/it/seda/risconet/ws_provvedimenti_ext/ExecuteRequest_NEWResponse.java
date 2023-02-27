/**
 * ExecuteRequest_NEWResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.seda.risconet.ws_provvedimenti_ext;

public class ExecuteRequest_NEWResponse  implements java.io.Serializable {
    private it.seda.risconet.ws_provvedimenti_ext.ExecuteRequest_NEWResponseExecuteRequest_NEWResult executeRequest_NEWResult;

    public ExecuteRequest_NEWResponse() {
    }

    public ExecuteRequest_NEWResponse(
           it.seda.risconet.ws_provvedimenti_ext.ExecuteRequest_NEWResponseExecuteRequest_NEWResult executeRequest_NEWResult) {
           this.executeRequest_NEWResult = executeRequest_NEWResult;
    }


    /**
     * Gets the executeRequest_NEWResult value for this ExecuteRequest_NEWResponse.
     * 
     * @return executeRequest_NEWResult
     */
    public it.seda.risconet.ws_provvedimenti_ext.ExecuteRequest_NEWResponseExecuteRequest_NEWResult getExecuteRequest_NEWResult() {
        return executeRequest_NEWResult;
    }


    /**
     * Sets the executeRequest_NEWResult value for this ExecuteRequest_NEWResponse.
     * 
     * @param executeRequest_NEWResult
     */
    public void setExecuteRequest_NEWResult(it.seda.risconet.ws_provvedimenti_ext.ExecuteRequest_NEWResponseExecuteRequest_NEWResult executeRequest_NEWResult) {
        this.executeRequest_NEWResult = executeRequest_NEWResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExecuteRequest_NEWResponse)) return false;
        ExecuteRequest_NEWResponse other = (ExecuteRequest_NEWResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.executeRequest_NEWResult==null && other.getExecuteRequest_NEWResult()==null) || 
             (this.executeRequest_NEWResult!=null &&
              this.executeRequest_NEWResult.equals(other.getExecuteRequest_NEWResult())));
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
        if (getExecuteRequest_NEWResult() != null) {
            _hashCode += getExecuteRequest_NEWResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExecuteRequest_NEWResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", ">ExecuteRequest_NEWResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("executeRequest_NEWResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", "ExecuteRequest_NEWResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", ">>ExecuteRequest_NEWResponse>ExecuteRequest_NEWResult"));
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
