/**
 * CancelProtectedTransferResultHolder.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package advcash.wsm;

public class CancelProtectedTransferResultHolder  implements java.io.Serializable {
    private advcash.wsm.OperationResult operationResult;

    private TransactionStatus transactionStatus;

    public CancelProtectedTransferResultHolder() {
    }

    public CancelProtectedTransferResultHolder(
           advcash.wsm.OperationResult operationResult,
           TransactionStatus transactionStatus) {
           this.operationResult = operationResult;
           this.transactionStatus = transactionStatus;
    }


    /**
     * Gets the operationResult value for this CancelProtectedTransferResultHolder.
     *
     * @return operationResult
     */
    public advcash.wsm.OperationResult getOperationResult() {
        return operationResult;
    }


    /**
     * Sets the operationResult value for this CancelProtectedTransferResultHolder.
     *
     * @param operationResult
     */
    public void setOperationResult(advcash.wsm.OperationResult operationResult) {
        this.operationResult = operationResult;
    }


    /**
     * Gets the transactionStatus value for this CancelProtectedTransferResultHolder.
     *
     * @return transactionStatus
     */
    public TransactionStatus getTransactionStatus() {
        return transactionStatus;
    }


    /**
     * Sets the transactionStatus value for this CancelProtectedTransferResultHolder.
     *
     * @param transactionStatus
     */
    public void setTransactionStatus(TransactionStatus transactionStatus) {
        this.transactionStatus = transactionStatus;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CancelProtectedTransferResultHolder)) return false;
        CancelProtectedTransferResultHolder other = (CancelProtectedTransferResultHolder) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
            ((this.operationResult==null && other.getOperationResult()==null) ||
             (this.operationResult!=null &&
              this.operationResult.equals(other.getOperationResult()))) &&
            ((this.transactionStatus==null && other.getTransactionStatus()==null) ||
             (this.transactionStatus!=null &&
              this.transactionStatus.equals(other.getTransactionStatus())));
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
        if (getOperationResult() != null) {
            _hashCode += getOperationResult().hashCode();
        }
        if (getTransactionStatus() != null) {
            _hashCode += getTransactionStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CancelProtectedTransferResultHolder.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://wsm.advcash/", "cancelProtectedTransferResultHolder"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operationResult");
        elemField.setXmlName(new javax.xml.namespace.QName("", "operationResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://wsm.advcash/", "operationResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transactionStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://wsm.advcash/", "transactionStatus"));
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
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
