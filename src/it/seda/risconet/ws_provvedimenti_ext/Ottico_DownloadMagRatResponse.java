/**
 * Ottico_DownloadMagRatResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.seda.risconet.ws_provvedimenti_ext;

public class Ottico_DownloadMagRatResponse  implements java.io.Serializable {
    private OtticoWebService.FileEstensione ottico_DownloadMagRatResult;

    public Ottico_DownloadMagRatResponse() {
    }

    public Ottico_DownloadMagRatResponse(
           OtticoWebService.FileEstensione ottico_DownloadMagRatResult) {
           this.ottico_DownloadMagRatResult = ottico_DownloadMagRatResult;
    }


    /**
     * Gets the ottico_DownloadMagRatResult value for this Ottico_DownloadMagRatResponse.
     * 
     * @return ottico_DownloadMagRatResult
     */
    public OtticoWebService.FileEstensione getOttico_DownloadMagRatResult() {
        return ottico_DownloadMagRatResult;
    }


    /**
     * Sets the ottico_DownloadMagRatResult value for this Ottico_DownloadMagRatResponse.
     * 
     * @param ottico_DownloadMagRatResult
     */
    public void setOttico_DownloadMagRatResult(OtticoWebService.FileEstensione ottico_DownloadMagRatResult) {
        this.ottico_DownloadMagRatResult = ottico_DownloadMagRatResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Ottico_DownloadMagRatResponse)) return false;
        Ottico_DownloadMagRatResponse other = (Ottico_DownloadMagRatResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ottico_DownloadMagRatResult==null && other.getOttico_DownloadMagRatResult()==null) || 
             (this.ottico_DownloadMagRatResult!=null &&
              this.ottico_DownloadMagRatResult.equals(other.getOttico_DownloadMagRatResult())));
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
        if (getOttico_DownloadMagRatResult() != null) {
            _hashCode += getOttico_DownloadMagRatResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Ottico_DownloadMagRatResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", ">Ottico_DownloadMagRatResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ottico_DownloadMagRatResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", "Ottico_DownloadMagRatResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://OtticoWebService/", "fileEstensione"));
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
