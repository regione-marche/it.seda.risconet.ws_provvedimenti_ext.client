/**
 * Test_DownloadMagRat_CRESETResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.seda.risconet.ws_provvedimenti_ext;

public class Test_DownloadMagRat_CRESETResponse  implements java.io.Serializable {
    private OtticoWebService.FileEstensione test_DownloadMagRat_CRESETResult;

    public Test_DownloadMagRat_CRESETResponse() {
    }

    public Test_DownloadMagRat_CRESETResponse(
           OtticoWebService.FileEstensione test_DownloadMagRat_CRESETResult) {
           this.test_DownloadMagRat_CRESETResult = test_DownloadMagRat_CRESETResult;
    }


    /**
     * Gets the test_DownloadMagRat_CRESETResult value for this Test_DownloadMagRat_CRESETResponse.
     * 
     * @return test_DownloadMagRat_CRESETResult
     */
    public OtticoWebService.FileEstensione getTest_DownloadMagRat_CRESETResult() {
        return test_DownloadMagRat_CRESETResult;
    }


    /**
     * Sets the test_DownloadMagRat_CRESETResult value for this Test_DownloadMagRat_CRESETResponse.
     * 
     * @param test_DownloadMagRat_CRESETResult
     */
    public void setTest_DownloadMagRat_CRESETResult(OtticoWebService.FileEstensione test_DownloadMagRat_CRESETResult) {
        this.test_DownloadMagRat_CRESETResult = test_DownloadMagRat_CRESETResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Test_DownloadMagRat_CRESETResponse)) return false;
        Test_DownloadMagRat_CRESETResponse other = (Test_DownloadMagRat_CRESETResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.test_DownloadMagRat_CRESETResult==null && other.getTest_DownloadMagRat_CRESETResult()==null) || 
             (this.test_DownloadMagRat_CRESETResult!=null &&
              this.test_DownloadMagRat_CRESETResult.equals(other.getTest_DownloadMagRat_CRESETResult())));
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
        if (getTest_DownloadMagRat_CRESETResult() != null) {
            _hashCode += getTest_DownloadMagRat_CRESETResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Test_DownloadMagRat_CRESETResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", ">Test_DownloadMagRat_CRESETResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("test_DownloadMagRat_CRESETResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", "Test_DownloadMagRat_CRESETResult"));
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
