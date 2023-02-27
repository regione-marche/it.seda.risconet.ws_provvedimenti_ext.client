/**
 * WS_Provvedimenti_EXTLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package it.seda.risconet.ws_provvedimenti_ext;

public class WS_Provvedimenti_EXTLocator extends org.apache.axis.client.Service implements it.seda.risconet.ws_provvedimenti_ext.WS_Provvedimenti_EXT {

    public WS_Provvedimenti_EXTLocator() {
    }


    public WS_Provvedimenti_EXTLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WS_Provvedimenti_EXTLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for WS_Provvedimenti_EXTSoap
    private java.lang.String WS_Provvedimenti_EXTSoap_address = "http://rend.services.pagonet.it/WS_PROVVEDIMENTI_EXT/WS_Provvedimenti_EXT.asmx";

    public java.lang.String getWS_Provvedimenti_EXTSoapAddress() {
        return WS_Provvedimenti_EXTSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String WS_Provvedimenti_EXTSoapWSDDServiceName = "WS_Provvedimenti_EXTSoap";

    public java.lang.String getWS_Provvedimenti_EXTSoapWSDDServiceName() {
        return WS_Provvedimenti_EXTSoapWSDDServiceName;
    }

    public void setWS_Provvedimenti_EXTSoapWSDDServiceName(java.lang.String name) {
        WS_Provvedimenti_EXTSoapWSDDServiceName = name;
    }

    public it.seda.risconet.ws_provvedimenti_ext.WS_Provvedimenti_EXTSoap getWS_Provvedimenti_EXTSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(WS_Provvedimenti_EXTSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getWS_Provvedimenti_EXTSoap(endpoint);
    }

    public it.seda.risconet.ws_provvedimenti_ext.WS_Provvedimenti_EXTSoap getWS_Provvedimenti_EXTSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            it.seda.risconet.ws_provvedimenti_ext.WS_Provvedimenti_EXTSoapStub _stub = new it.seda.risconet.ws_provvedimenti_ext.WS_Provvedimenti_EXTSoapStub(portAddress, this);
            _stub.setPortName(getWS_Provvedimenti_EXTSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setWS_Provvedimenti_EXTSoapEndpointAddress(java.lang.String address) {
        WS_Provvedimenti_EXTSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (it.seda.risconet.ws_provvedimenti_ext.WS_Provvedimenti_EXTSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                it.seda.risconet.ws_provvedimenti_ext.WS_Provvedimenti_EXTSoapStub _stub = new it.seda.risconet.ws_provvedimenti_ext.WS_Provvedimenti_EXTSoapStub(new java.net.URL(WS_Provvedimenti_EXTSoap_address), this);
                _stub.setPortName(getWS_Provvedimenti_EXTSoapWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("WS_Provvedimenti_EXTSoap".equals(inputPortName)) {
            return getWS_Provvedimenti_EXTSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", "WS_Provvedimenti_EXT");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://risconet.seda.it/WS_PROVVEDIMENTI_EXT/", "WS_Provvedimenti_EXTSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("WS_Provvedimenti_EXTSoap".equals(portName)) {
            setWS_Provvedimenti_EXTSoapEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
