/**
 * Test_DownloadPropostaProvvedimentoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.seda.risconet.ws_provvedimenti_ext;

public class Test_DownloadPropostaProvvedimentoResponse  implements java.io.Serializable {
    private OtticoWebService.FileEstensione test_DownloadPropostaProvvedimentoResult;

    public Test_DownloadPropostaProvvedimentoResponse() {
    }

    public Test_DownloadPropostaProvvedimentoResponse(
           OtticoWebService.FileEstensione test_DownloadPropostaProvvedimentoResult) {
           this.test_DownloadPropostaProvvedimentoResult = test_DownloadPropostaProvvedimentoResult;
    }


    /**
     * Gets the test_DownloadPropostaProvvedimentoResult value for this Test_DownloadPropostaProvvedimentoResponse.
     * 
     * @return test_DownloadPropostaProvvedimentoResult
     */
    public OtticoWebService.FileEstensione getTest_DownloadPropostaProvvedimentoResult() {
        return test_DownloadPropostaProvvedimentoResult;
    }


    /**
     * Sets the test_DownloadPropostaProvvedimentoResult value for this Test_DownloadPropostaProvvedimentoResponse.
     * 
     * @param test_DownloadPropostaProvvedimentoResult
     */
    public void setTest_DownloadPropostaProvvedimentoResult(OtticoWebService.FileEstensione test_DownloadPropostaProvvedimentoResult) {
        this.test_DownloadPropostaProvvedimentoResult = test_DownloadPropostaProvvedimentoResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Test_DownloadPropostaProvvedimentoResponse)) return false;
        Test_DownloadPropostaProvvedimentoResponse other = (Test_DownloadPropostaProvvedimentoResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.test_DownloadPropostaProvvedimentoResult==null && other.getTest_DownloadPropostaProvvedimentoResult()==null) || 
             (this.test_DownloadPropostaProvvedimentoResult!=null &&
              this.test_DownloadPropostaProvvedimentoResult.equals(other.getTest_DownloadPropostaProvvedimentoResult())));
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
        if (getTest_DownloadPropostaProvvedimentoResult() != null) {
            _hashCode += getTest_DownloadPropostaProvvedimentoResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Test_DownloadPropostaProvvedimentoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", ">Test_DownloadPropostaProvvedimentoResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("test_DownloadPropostaProvvedimentoResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", "Test_DownloadPropostaProvvedimentoResult"));
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
