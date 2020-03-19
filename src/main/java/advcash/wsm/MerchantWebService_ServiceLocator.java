/**
 * MerchantWebService_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package advcash.wsm;

public class MerchantWebService_ServiceLocator extends org.apache.axis.client.Service implements MerchantWebService_Service {

    public MerchantWebService_ServiceLocator() {
    }


    public MerchantWebService_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public MerchantWebService_ServiceLocator(String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for MerchantWebServicePort
    private String MerchantWebServicePort_address = "https://wallet.advcash.com/wsm/merchantWebService";

    public String getMerchantWebServicePortAddress() {
        return MerchantWebServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private String MerchantWebServicePortWSDDServiceName = "MerchantWebServicePort";

    public String getMerchantWebServicePortWSDDServiceName() {
        return MerchantWebServicePortWSDDServiceName;
    }

    public void setMerchantWebServicePortWSDDServiceName(String name) {
        MerchantWebServicePortWSDDServiceName = name;
    }

    public MerchantWebService_PortType getMerchantWebServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(MerchantWebServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getMerchantWebServicePort(endpoint);
    }

    public MerchantWebService_PortType getMerchantWebServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            MerchantWebServiceSoapBindingStub _stub = new MerchantWebServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getMerchantWebServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setMerchantWebServicePortEndpointAddress(String address) {
        MerchantWebServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (MerchantWebService_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                MerchantWebServiceSoapBindingStub _stub = new MerchantWebServiceSoapBindingStub(new java.net.URL(MerchantWebServicePort_address), this);
                _stub.setPortName(getMerchantWebServicePortWSDDServiceName());
                return _stub;
            }
        }
        catch (Throwable t) {
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
        String inputPortName = portName.getLocalPart();
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
    public void setEndpointAddress(String portName, String address) throws javax.xml.rpc.ServiceException {
    
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
    public void setEndpointAddress(javax.xml.namespace.QName portName, String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
