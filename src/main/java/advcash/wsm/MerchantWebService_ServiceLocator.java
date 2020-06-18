/**
 * MerchantWebService_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package advcash.wsm;

public class MerchantWebService_ServiceLocator extends org.apache.axis.client.Service implements advcash.wsm.MerchantWebService_Service {

    public MerchantWebService_ServiceLocator() {
    }


    public MerchantWebService_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public MerchantWebService_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for MerchantWebServicePort
    private java.lang.String MerchantWebServicePort_address = "https://wallet.advcash.com/wsm/merchantWebService";

    public java.lang.String getMerchantWebServicePortAddress() {
        return MerchantWebServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String MerchantWebServicePortWSDDServiceName = "MerchantWebServicePort";

    public java.lang.String getMerchantWebServicePortWSDDServiceName() {
        return MerchantWebServicePortWSDDServiceName;
    }

    public void setMerchantWebServicePortWSDDServiceName(java.lang.String name) {
        MerchantWebServicePortWSDDServiceName = name;
    }

    public advcash.wsm.MerchantWebService_PortType getMerchantWebServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(MerchantWebServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getMerchantWebServicePort(endpoint);
    }

    public advcash.wsm.MerchantWebService_PortType getMerchantWebServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            advcash.wsm.MerchantWebServiceSoapBindingStub _stub = new advcash.wsm.MerchantWebServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getMerchantWebServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setMerchantWebServicePortEndpointAddress(java.lang.String address) {
        MerchantWebServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (advcash.wsm.MerchantWebService_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                advcash.wsm.MerchantWebServiceSoapBindingStub _stub = new advcash.wsm.MerchantWebServiceSoapBindingStub(new java.net.URL(MerchantWebServicePort_address), this);
                _stub.setPortName(getMerchantWebServicePortWSDDServiceName());
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
        if ("MerchantWebServicePort".equals(inputPortName)) {
            return getMerchantWebServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantWebService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantWebServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("MerchantWebServicePort".equals(portName)) {
            setMerchantWebServicePortEndpointAddress(address);
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
