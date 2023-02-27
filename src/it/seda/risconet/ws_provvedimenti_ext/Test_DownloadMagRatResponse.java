/**
 * Test_DownloadMagRatResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.seda.risconet.ws_provvedimenti_ext;

public class Test_DownloadMagRatResponse  implements java.io.Serializable {
    private OtticoWebService.FileEstensione test_DownloadMagRatResult;

    public Test_DownloadMagRatResponse() {
    }

    public Test_DownloadMagRatResponse(
           OtticoWebService.FileEstensione test_DownloadMagRatResult) {
           this.test_DownloadMagRatResult = test_DownloadMagRatResult;
    }


    /**
     * Gets the test_DownloadMagRatResult value for this Test_DownloadMagRatResponse.
     * 
     * @return test_DownloadMagRatResult
     */
    public OtticoWebService.FileEstensione getTest_DownloadMagRatResult() {
        return test_DownloadMagRatResult;
    }


    /**
     * Sets the test_DownloadMagRatResult value for this Test_DownloadMagRatResponse.
     * 
     * @param test_DownloadMagRatResult
     */
    public void setTest_DownloadMagRatResult(OtticoWebService.FileEstensione test_DownloadMagRatResult) {
        this.test_DownloadMagRatResult = test_DownloadMagRatResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Test_DownloadMagRatResponse)) return false;
        Test_DownloadMagRatResponse other = (Test_DownloadMagRatResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.test_DownloadMagRatResult==null && other.getTest_DownloadMagRatResult()==null) || 
             (this.test_DownloadMagRatResult!=null &&
              this.test_DownloadMagRatResult.equals(other.getTest_DownloadMagRatResult())));
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
        if (getTest_DownloadMagRatResult() != null) {
            _hashCode += getTest_DownloadMagRatResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Test_DownloadMagRatResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", ">Test_DownloadMagRatResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("test_DownloadMagRatResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", "Test_DownloadMagRatResult"));
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
