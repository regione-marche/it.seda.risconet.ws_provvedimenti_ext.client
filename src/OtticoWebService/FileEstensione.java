/**
 * FileEstensione.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package OtticoWebService;

public class FileEstensione  implements java.io.Serializable {
    private byte[] fileByte;

    private java.lang.String estensione;

    public FileEstensione() {
    }

    public FileEstensione(
           byte[] fileByte,
           java.lang.String estensione) {
           this.fileByte = fileByte;
           this.estensione = estensione;
    }


    /**
     * Gets the fileByte value for this FileEstensione.
     * 
     * @return fileByte
     */
    public byte[] getFileByte() {
        return fileByte;
    }


    /**
     * Sets the fileByte value for this FileEstensione.
     * 
     * @param fileByte
     */
    public void setFileByte(byte[] fileByte) {
        this.fileByte = fileByte;
    }


    /**
     * Gets the estensione value for this FileEstensione.
     * 
     * @return estensione
     */
    public java.lang.String getEstensione() {
        return estensione;
    }


    /**
     * Sets the estensione value for this FileEstensione.
     * 
     * @param estensione
     */
    public void setEstensione(java.lang.String estensione) {
        this.estensione = estensione;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FileEstensione)) return false;
        FileEstensione other = (FileEstensione) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fileByte==null && other.getFileByte()==null) || 
             (this.fileByte!=null &&
              java.util.Arrays.equals(this.fileByte, other.getFileByte()))) &&
            ((this.estensione==null && other.getEstensione()==null) || 
             (this.estensione!=null &&
              this.estensione.equals(other.getEstensione())));
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
        if (getFileByte() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFileByte());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFileByte(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEstensione() != null) {
            _hashCode += getEstensione().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FileEstensione.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://OtticoWebService/", "fileEstensione"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileByte");
        elemField.setXmlName(new javax.xml.namespace.QName("http://OtticoWebService/", "fileByte"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estensione");
        elemField.setXmlName(new javax.xml.namespace.QName("http://OtticoWebService/", "estensione"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
