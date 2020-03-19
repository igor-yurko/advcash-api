/**
 * MerchantAPITransactionFilter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package advcash.wsm;

public class MerchantAPITransactionFilter  implements java.io.Serializable {
    private int count;

    private int from;

    private SortOrder sortOrder;

    private java.util.Calendar startTimeFrom;

    private java.util.Calendar startTimeTo;

    private TransactionDirection transactionDirection;

    private TransactionName transactionName;

    private TransactionStatus transactionStatus;

    private String walletId;

    public MerchantAPITransactionFilter() {
    }

    public MerchantAPITransactionFilter(
           int count,
           int from,
           SortOrder sortOrder,
           java.util.Calendar startTimeFrom,
           java.util.Calendar startTimeTo,
           TransactionDirection transactionDirection,
           TransactionName transactionName,
           TransactionStatus transactionStatus,
           String walletId) {
           this.count = count;
           this.from = from;
           this.sortOrder = sortOrder;
           this.startTimeFrom = startTimeFrom;
           this.startTimeTo = startTimeTo;
           this.transactionDirection = transactionDirection;
           this.transactionName = transactionName;
           this.transactionStatus = transactionStatus;
           this.walletId = walletId;
    }


    /**
     * Gets the count value for this MerchantAPITransactionFilter.
     *
     * @return count
     */
    public int getCount() {
        return count;
    }


    /**
     * Sets the count value for this MerchantAPITransactionFilter.
     *
     * @param count
     */
    public void setCount(int count) {
        this.count = count;
    }


    /**
     * Gets the from value for this MerchantAPITransactionFilter.
     *
     * @return from
     */
    public int getFrom() {
        return from;
    }


    /**
     * Sets the from value for this MerchantAPITransactionFilter.
     *
     * @param from
     */
    public void setFrom(int from) {
        this.from = from;
    }


    /**
     * Gets the sortOrder value for this MerchantAPITransactionFilter.
     *
     * @return sortOrder
     */
    public SortOrder getSortOrder() {
        return sortOrder;
    }


    /**
     * Sets the sortOrder value for this MerchantAPITransactionFilter.
     *
     * @param sortOrder
     */
    public void setSortOrder(SortOrder sortOrder) {
        this.sortOrder = sortOrder;
    }


    /**
     * Gets the startTimeFrom value for this MerchantAPITransactionFilter.
     *
     * @return startTimeFrom
     */
    public java.util.Calendar getStartTimeFrom() {
        return startTimeFrom;
    }


    /**
     * Sets the startTimeFrom value for this MerchantAPITransactionFilter.
     *
     * @param startTimeFrom
     */
    public void setStartTimeFrom(java.util.Calendar startTimeFrom) {
        this.startTimeFrom = startTimeFrom;
    }


    /**
     * Gets the startTimeTo value for this MerchantAPITransactionFilter.
     *
     * @return startTimeTo
     */
    public java.util.Calendar getStartTimeTo() {
        return startTimeTo;
    }


    /**
     * Sets the startTimeTo value for this MerchantAPITransactionFilter.
     *
     * @param startTimeTo
     */
    public void setStartTimeTo(java.util.Calendar startTimeTo) {
        this.startTimeTo = startTimeTo;
    }


    /**
     * Gets the transactionDirection value for this MerchantAPITransactionFilter.
     *
     * @return transactionDirection
     */
    public TransactionDirection getTransactionDirection() {
        return transactionDirection;
    }


    /**
     * Sets the transactionDirection value for this MerchantAPITransactionFilter.
     *
     * @param transactionDirection
     */
    public void setTransactionDirection(TransactionDirection transactionDirection) {
        this.transactionDirection = transactionDirection;
    }


    /**
     * Gets the transactionName value for this MerchantAPITransactionFilter.
     *
     * @return transactionName
     */
    public TransactionName getTransactionName() {
        return transactionName;
    }


    /**
     * Sets the transactionName value for this MerchantAPITransactionFilter.
     *
     * @param transactionName
     */
    public void setTransactionName(TransactionName transactionName) {
        this.transactionName = transactionName;
    }


    /**
     * Gets the transactionStatus value for this MerchantAPITransactionFilter.
     *
     * @return transactionStatus
     */
    public TransactionStatus getTransactionStatus() {
        return transactionStatus;
    }


    /**
     * Sets the transactionStatus value for this MerchantAPITransactionFilter.
     *
     * @param transactionStatus
     */
    public void setTransactionStatus(TransactionStatus transactionStatus) {
        this.transactionStatus = transactionStatus;
    }


    /**
     * Gets the walletId value for this MerchantAPITransactionFilter.
     *
     * @return walletId
     */
    public String getWalletId() {
        return walletId;
    }


    /**
     * Sets the walletId value for this MerchantAPITransactionFilter.
     *
     * @param walletId
     */
    public void setWalletId(String walletId) {
        this.walletId = walletId;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof MerchantAPITransactionFilter)) return false;
        MerchantAPITransactionFilter other = (MerchantAPITransactionFilter) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
            this.count == other.getCount() &&
            this.from == other.getFrom() &&
            ((this.sortOrder==null && other.getSortOrder()==null) ||
             (this.sortOrder!=null &&
              this.sortOrder.equals(other.getSortOrder()))) &&
            ((this.startTimeFrom==null && other.getStartTimeFrom()==null) ||
             (this.startTimeFrom!=null &&
              this.startTimeFrom.equals(other.getStartTimeFrom()))) &&
            ((this.startTimeTo==null && other.getStartTimeTo()==null) ||
             (this.startTimeTo!=null &&
              this.startTimeTo.equals(other.getStartTimeTo()))) &&
            ((this.transactionDirection==null && other.getTransactionDirection()==null) ||
             (this.transactionDirection!=null &&
              this.transactionDirection.equals(other.getTransactionDirection()))) &&
            ((this.transactionName==null && other.getTransactionName()==null) ||
             (this.transactionName!=null &&
              this.transactionName.equals(other.getTransactionName()))) &&
            ((this.transactionStatus==null && other.getTransactionStatus()==null) ||
             (this.transactionStatus!=null &&
              this.transactionStatus.equals(other.getTransactionStatus()))) &&
            ((this.walletId==null && other.getWalletId()==null) ||
             (this.walletId!=null &&
              this.walletId.equals(other.getWalletId())));
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
        _hashCode += getCount();
        _hashCode += getFrom();
        if (getSortOrder() != null) {
            _hashCode += getSortOrder().hashCode();
        }
        if (getStartTimeFrom() != null) {
            _hashCode += getStartTimeFrom().hashCode();
        }
        if (getStartTimeTo() != null) {
            _hashCode += getStartTimeTo().hashCode();
        }
        if (getTransactionDirection() != null) {
            _hashCode += getTransactionDirection().hashCode();
        }
        if (getTransactionName() != null) {
            _hashCode += getTransactionName().hashCode();
        }
        if (getTransactionStatus() != null) {
            _hashCode += getTransactionStatus().hashCode();
        }
        if (getWalletId() != null) {
            _hashCode += getWalletId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MerchantAPITransactionFilter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantAPITransactionFilter"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("count");
        elemField.setXmlName(new javax.xml.namespace.QName("", "count"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("from");
        elemField.setXmlName(new javax.xml.namespace.QName("", "from"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sortOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sortOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://wsm.advcash/", "sortOrder"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startTimeFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("", "startTimeFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startTimeTo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "startTimeTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionDirection");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transactionDirection"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://wsm.advcash/", "transactionDirection"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transactionName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://wsm.advcash/", "transactionName"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("walletId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "walletId"));
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
