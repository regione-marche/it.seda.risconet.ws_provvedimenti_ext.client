/**
 * TestTEST_DownloadPropostaProvvedimentoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.seda.risconet.ws_provvedimenti_ext;

public class TestTEST_DownloadPropostaProvvedimentoResponse  implements java.io.Serializable {
    private OtticoWebService.FileEstensione testTEST_DownloadPropostaProvvedimentoResult;

    public TestTEST_DownloadPropostaProvvedimentoResponse() {
    }

    public TestTEST_DownloadPropostaProvvedimentoResponse(
           OtticoWebService.FileEstensione testTEST_DownloadPropostaProvvedimentoResult) {
           this.testTEST_DownloadPropostaProvvedimentoResult = testTEST_DownloadPropostaProvvedimentoResult;
    }


    /**
     * Gets the testTEST_DownloadPropostaProvvedimentoResult value for this TestTEST_DownloadPropostaProvvedimentoResponse.
     * 
     * @return testTEST_DownloadPropostaProvvedimentoResult
     */
    public OtticoWebService.FileEstensione getTestTEST_DownloadPropostaProvvedimentoResult() {
        return testTEST_DownloadPropostaProvvedimentoResult;
    }


    /**
     * Sets the testTEST_DownloadPropostaProvvedimentoResult value for this TestTEST_DownloadPropostaProvvedimentoResponse.
     * 
     * @param testTEST_DownloadPropostaProvvedimentoResult
     */
    public void setTestTEST_DownloadPropostaProvvedimentoResult(OtticoWebService.FileEstensione testTEST_DownloadPropostaProvvedimentoResult) {
        this.testTEST_DownloadPropostaProvvedimentoResult = testTEST_DownloadPropostaProvvedimentoResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TestTEST_DownloadPropostaProvvedimentoResponse)) return false;
        TestTEST_DownloadPropostaProvvedimentoResponse other = (TestTEST_DownloadPropostaProvvedimentoResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.testTEST_DownloadPropostaProvvedimentoResult==null && other.getTestTEST_DownloadPropostaProvvedimentoResult()==null) || 
             (this.testTEST_DownloadPropostaProvvedimentoResult!=null &&
              this.testTEST_DownloadPropostaProvvedimentoResult.equals(other.getTestTEST_DownloadPropostaProvvedimentoResult())));
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
        if (getTestTEST_DownloadPropostaProvvedimentoResult() != null) {
            _hashCode += getTestTEST_DownloadPropostaProvvedimentoResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TestTEST_DownloadPropostaProvvedimentoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", ">TestTEST_DownloadPropostaProvvedimentoResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("testTEST_DownloadPropostaProvvedimentoResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", "TestTEST_DownloadPropostaProvvedimentoResult"));
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
