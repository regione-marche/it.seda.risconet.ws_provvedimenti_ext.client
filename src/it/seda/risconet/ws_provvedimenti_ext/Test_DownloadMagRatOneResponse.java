/**
 * Test_DownloadMagRatOneResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.seda.risconet.ws_provvedimenti_ext;

public class Test_DownloadMagRatOneResponse  implements java.io.Serializable {
    private OtticoWebService.FileEstensione test_DownloadMagRatOneResult;

    public Test_DownloadMagRatOneResponse() {
    }

    public Test_DownloadMagRatOneResponse(
           OtticoWebService.FileEstensione test_DownloadMagRatOneResult) {
           this.test_DownloadMagRatOneResult = test_DownloadMagRatOneResult;
    }


    /**
     * Gets the test_DownloadMagRatOneResult value for this Test_DownloadMagRatOneResponse.
     * 
     * @return test_DownloadMagRatOneResult
     */
    public OtticoWebService.FileEstensione getTest_DownloadMagRatOneResult() {
        return test_DownloadMagRatOneResult;
    }


    /**
     * Sets the test_DownloadMagRatOneResult value for this Test_DownloadMagRatOneResponse.
     * 
     * @param test_DownloadMagRatOneResult
     */
    public void setTest_DownloadMagRatOneResult(OtticoWebService.FileEstensione test_DownloadMagRatOneResult) {
        this.test_DownloadMagRatOneResult = test_DownloadMagRatOneResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Test_DownloadMagRatOneResponse)) return false;
        Test_DownloadMagRatOneResponse other = (Test_DownloadMagRatOneResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.test_DownloadMagRatOneResult==null && other.getTest_DownloadMagRatOneResult()==null) || 
             (this.test_DownloadMagRatOneResult!=null &&
              this.test_DownloadMagRatOneResult.equals(other.getTest_DownloadMagRatOneResult())));
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
        if (getTest_DownloadMagRatOneResult() != null) {
            _hashCode += getTest_DownloadMagRatOneResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Test_DownloadMagRatOneResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", ">Test_DownloadMagRatOneResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("test_DownloadMagRatOneResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", "Test_DownloadMagRatOneResult"));
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
