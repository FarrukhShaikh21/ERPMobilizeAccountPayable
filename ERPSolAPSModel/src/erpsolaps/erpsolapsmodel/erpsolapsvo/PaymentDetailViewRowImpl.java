package erpsolaps.erpsolapsmodel.erpsolapsvo;

import erpsolaps.erpsolapsmodel.erpsolapseo.PaymentDetailImpl;

import java.math.BigDecimal;

import oracle.jbo.Row;
import oracle.jbo.RowSet;
import oracle.jbo.domain.Date;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Feb 09 12:40:51 PKT 2022
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class PaymentDetailViewRowImpl extends ViewRowImpl {


    public static final int ENTITY_PAYMENTDETAIL = 0;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        SeqNo {
            public Object get(PaymentDetailViewRowImpl obj) {
                return obj.getSeqNo();
            }

            public void put(PaymentDetailViewRowImpl obj, Object value) {
                obj.setSeqNo((Integer) value);
            }
        }
        ,
        PaymentCode {
            public Object get(PaymentDetailViewRowImpl obj) {
                return obj.getPaymentCode();
            }

            public void put(PaymentDetailViewRowImpl obj, Object value) {
                obj.setPaymentCode((String) value);
            }
        }
        ,
        PmtAmount {
            public Object get(PaymentDetailViewRowImpl obj) {
                return obj.getPmtAmount();
            }

            public void put(PaymentDetailViewRowImpl obj, Object value) {
                obj.setPmtAmount((BigDecimal) value);
            }
        }
        ,
        Balance {
            public Object get(PaymentDetailViewRowImpl obj) {
                return obj.getBalance();
            }

            public void put(PaymentDetailViewRowImpl obj, Object value) {
                obj.setBalance((BigDecimal) value);
            }
        }
        ,
        Createdby {
            public Object get(PaymentDetailViewRowImpl obj) {
                return obj.getCreatedby();
            }

            public void put(PaymentDetailViewRowImpl obj, Object value) {
                obj.setCreatedby((String) value);
            }
        }
        ,
        Modifiedby {
            public Object get(PaymentDetailViewRowImpl obj) {
                return obj.getModifiedby();
            }

            public void put(PaymentDetailViewRowImpl obj, Object value) {
                obj.setModifiedby((String) value);
            }
        }
        ,
        CreatedDate {
            public Object get(PaymentDetailViewRowImpl obj) {
                return obj.getCreatedDate();
            }

            public void put(PaymentDetailViewRowImpl obj, Object value) {
                obj.setCreatedDate((Date) value);
            }
        }
        ,
        InvoiceCode {
            public Object get(PaymentDetailViewRowImpl obj) {
                return obj.getInvoiceCode();
            }

            public void put(PaymentDetailViewRowImpl obj, Object value) {
                obj.setInvoiceCode((String) value);
            }
        }
        ,
        ModifiedDate {
            public Object get(PaymentDetailViewRowImpl obj) {
                return obj.getModifiedDate();
            }

            public void put(PaymentDetailViewRowImpl obj, Object value) {
                obj.setModifiedDate((Date) value);
            }
        }
        ,
        TaxCode {
            public Object get(PaymentDetailViewRowImpl obj) {
                return obj.getTaxCode();
            }

            public void put(PaymentDetailViewRowImpl obj, Object value) {
                obj.setTaxCode((Integer) value);
            }
        }
        ,
        InvoiceType {
            public Object get(PaymentDetailViewRowImpl obj) {
                return obj.getInvoiceType();
            }

            public void put(PaymentDetailViewRowImpl obj, Object value) {
                obj.setInvoiceType((String) value);
            }
        }
        ,
        Taxamt {
            public Object get(PaymentDetailViewRowImpl obj) {
                return obj.getTaxamt();
            }

            public void put(PaymentDetailViewRowImpl obj, Object value) {
                obj.setTaxamt((BigDecimal) value);
            }
        }
        ,
        Taxexempt {
            public Object get(PaymentDetailViewRowImpl obj) {
                return obj.getTaxexempt();
            }

            public void put(PaymentDetailViewRowImpl obj, Object value) {
                obj.setTaxexempt((String) value);
            }
        }
        ,
        FcurrPmtAmount {
            public Object get(PaymentDetailViewRowImpl obj) {
                return obj.getFcurrPmtAmount();
            }

            public void put(PaymentDetailViewRowImpl obj, Object value) {
                obj.setFcurrPmtAmount((BigDecimal) value);
            }
        }
        ,
        FcurrTaxamt {
            public Object get(PaymentDetailViewRowImpl obj) {
                return obj.getFcurrTaxamt();
            }

            public void put(PaymentDetailViewRowImpl obj, Object value) {
                obj.setFcurrTaxamt((BigDecimal) value);
            }
        }
        ,
        FcurrBalance {
            public Object get(PaymentDetailViewRowImpl obj) {
                return obj.getFcurrBalance();
            }

            public void put(PaymentDetailViewRowImpl obj, Object value) {
                obj.setFcurrBalance((BigDecimal) value);
            }
        }
        ,
        FcurrStaxAmt {
            public Object get(PaymentDetailViewRowImpl obj) {
                return obj.getFcurrStaxAmt();
            }

            public void put(PaymentDetailViewRowImpl obj, Object value) {
                obj.setFcurrStaxAmt((BigDecimal) value);
            }
        }
        ,
        StaxAmt {
            public Object get(PaymentDetailViewRowImpl obj) {
                return obj.getStaxAmt();
            }

            public void put(PaymentDetailViewRowImpl obj, Object value) {
                obj.setStaxAmt((BigDecimal) value);
            }
        }
        ,
        SalesTaxCode {
            public Object get(PaymentDetailViewRowImpl obj) {
                return obj.getSalesTaxCode();
            }

            public void put(PaymentDetailViewRowImpl obj, Object value) {
                obj.setSalesTaxCode((Integer) value);
            }
        }
        ,
        Paymentseq {
            public Object get(PaymentDetailViewRowImpl obj) {
                return obj.getPaymentseq();
            }

            public void put(PaymentDetailViewRowImpl obj, Object value) {
                obj.setPaymentseq((BigDecimal) value);
            }
        }
        ,
        txtNetPayment {
            public Object get(PaymentDetailViewRowImpl obj) {
                return obj.gettxtNetPayment();
            }

            public void put(PaymentDetailViewRowImpl obj, Object value) {
                obj.settxtNetPayment((BigDecimal) value);
            }
        }
        ,
        txtSumNetPay {
            public Object get(PaymentDetailViewRowImpl obj) {
                return obj.gettxtSumNetPay();
            }

            public void put(PaymentDetailViewRowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        PaymentMasterView {
            public Object get(PaymentDetailViewRowImpl obj) {
                return obj.getPaymentMasterView();
            }

            public void put(PaymentDetailViewRowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        AccVWBilllBalanceAmountForPayQVO {
            public Object get(PaymentDetailViewRowImpl obj) {
                return obj.getAccVWBilllBalanceAmountForPayQVO();
            }

            public void put(PaymentDetailViewRowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        AccTaxView {
            public Object get(PaymentDetailViewRowImpl obj) {
                return obj.getAccTaxView();
            }

            public void put(PaymentDetailViewRowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ;
        static AttributesEnum[] vals = null;
        ;
        private static final int firstIndex = 0;

        public abstract Object get(PaymentDetailViewRowImpl object);

        public abstract void put(PaymentDetailViewRowImpl object, Object value);

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static final int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        public static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }


    public static final int SEQNO = AttributesEnum.SeqNo.index();
    public static final int PAYMENTCODE = AttributesEnum.PaymentCode.index();
    public static final int PMTAMOUNT = AttributesEnum.PmtAmount.index();
    public static final int BALANCE = AttributesEnum.Balance.index();
    public static final int CREATEDBY = AttributesEnum.Createdby.index();
    public static final int MODIFIEDBY = AttributesEnum.Modifiedby.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int INVOICECODE = AttributesEnum.InvoiceCode.index();
    public static final int MODIFIEDDATE = AttributesEnum.ModifiedDate.index();
    public static final int TAXCODE = AttributesEnum.TaxCode.index();
    public static final int INVOICETYPE = AttributesEnum.InvoiceType.index();
    public static final int TAXAMT = AttributesEnum.Taxamt.index();
    public static final int TAXEXEMPT = AttributesEnum.Taxexempt.index();
    public static final int FCURRPMTAMOUNT = AttributesEnum.FcurrPmtAmount.index();
    public static final int FCURRTAXAMT = AttributesEnum.FcurrTaxamt.index();
    public static final int FCURRBALANCE = AttributesEnum.FcurrBalance.index();
    public static final int FCURRSTAXAMT = AttributesEnum.FcurrStaxAmt.index();
    public static final int STAXAMT = AttributesEnum.StaxAmt.index();
    public static final int SALESTAXCODE = AttributesEnum.SalesTaxCode.index();
    public static final int PAYMENTSEQ = AttributesEnum.Paymentseq.index();
    public static final int TXTNETPAYMENT = AttributesEnum.txtNetPayment.index();
    public static final int TXTSUMNETPAY = AttributesEnum.txtSumNetPay.index();
    public static final int PAYMENTMASTERVIEW = AttributesEnum.PaymentMasterView.index();
    public static final int ACCVWBILLLBALANCEAMOUNTFORPAYQVO = AttributesEnum.AccVWBilllBalanceAmountForPayQVO.index();
    public static final int ACCTAXVIEW = AttributesEnum.AccTaxView.index();

    /**
     * This is the default constructor (do not remove).
     */
    public PaymentDetailViewRowImpl() {
    }

    /**
     * Gets PaymentDetail entity object.
     * @return the PaymentDetail
     */
    public PaymentDetailImpl getPaymentDetail() {
        return (PaymentDetailImpl) getEntity(ENTITY_PAYMENTDETAIL);
    }

    /**
     * Gets the attribute value for SEQ_NO using the alias name SeqNo.
     * @return the SEQ_NO
     */
    public Integer getSeqNo() {
        return (Integer) getAttributeInternal(SEQNO);
    }

    /**
     * Sets <code>value</code> as attribute value for SEQ_NO using the alias name SeqNo.
     * @param value value to set the SEQ_NO
     */
    public void setSeqNo(Integer value) {
        setAttributeInternal(SEQNO, value);
    }

    /**
     * Gets the attribute value for PAYMENT_CODE using the alias name PaymentCode.
     * @return the PAYMENT_CODE
     */
    public String getPaymentCode() {
        return (String) getAttributeInternal(PAYMENTCODE);
    }

    /**
     * Sets <code>value</code> as attribute value for PAYMENT_CODE using the alias name PaymentCode.
     * @param value value to set the PAYMENT_CODE
     */
    public void setPaymentCode(String value) {
        setAttributeInternal(PAYMENTCODE, value);
    }

    /**
     * Gets the attribute value for PMT_AMOUNT using the alias name PmtAmount.
     * @return the PMT_AMOUNT
     */
    public BigDecimal getPmtAmount() {
        return (BigDecimal) getAttributeInternal(PMTAMOUNT);
    }

    /**
     * Sets <code>value</code> as attribute value for PMT_AMOUNT using the alias name PmtAmount.
     * @param value value to set the PMT_AMOUNT
     */
    public void setPmtAmount(BigDecimal value) {
        setAttributeInternal(PMTAMOUNT, value);
    }

    /**
     * Gets the attribute value for BALANCE using the alias name Balance.
     * @return the BALANCE
     */
    public BigDecimal getBalance() {
        return (BigDecimal) getAttributeInternal(BALANCE);
    }

    /**
     * Sets <code>value</code> as attribute value for BALANCE using the alias name Balance.
     * @param value value to set the BALANCE
     */
    public void setBalance(BigDecimal value) {
        setAttributeInternal(BALANCE, value);
    }

    /**
     * Gets the attribute value for CREATEDBY using the alias name Createdby.
     * @return the CREATEDBY
     */
    public String getCreatedby() {
        return (String) getAttributeInternal(CREATEDBY);
    }

    /**
     * Sets <code>value</code> as attribute value for CREATEDBY using the alias name Createdby.
     * @param value value to set the CREATEDBY
     */
    public void setCreatedby(String value) {
        setAttributeInternal(CREATEDBY, value);
    }

    /**
     * Gets the attribute value for MODIFIEDBY using the alias name Modifiedby.
     * @return the MODIFIEDBY
     */
    public String getModifiedby() {
        return (String) getAttributeInternal(MODIFIEDBY);
    }

    /**
     * Sets <code>value</code> as attribute value for MODIFIEDBY using the alias name Modifiedby.
     * @param value value to set the MODIFIEDBY
     */
    public void setModifiedby(String value) {
        setAttributeInternal(MODIFIEDBY, value);
    }

    /**
     * Gets the attribute value for CREATED_DATE using the alias name CreatedDate.
     * @return the CREATED_DATE
     */
    public Date getCreatedDate() {
        return (Date) getAttributeInternal(CREATEDDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for CREATED_DATE using the alias name CreatedDate.
     * @param value value to set the CREATED_DATE
     */
    public void setCreatedDate(Date value) {
        setAttributeInternal(CREATEDDATE, value);
    }

    /**
     * Gets the attribute value for INVOICE_CODE using the alias name InvoiceCode.
     * @return the INVOICE_CODE
     */
    public String getInvoiceCode() {
        return (String) getAttributeInternal(INVOICECODE);
    }

    /**
     * Sets <code>value</code> as attribute value for INVOICE_CODE using the alias name InvoiceCode.
     * @param value value to set the INVOICE_CODE
     */
    public void setInvoiceCode(String value) {
        setAttributeInternal(INVOICECODE, value);
    }

    /**
     * Gets the attribute value for MODIFIED_DATE using the alias name ModifiedDate.
     * @return the MODIFIED_DATE
     */
    public Date getModifiedDate() {
        return (Date) getAttributeInternal(MODIFIEDDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for MODIFIED_DATE using the alias name ModifiedDate.
     * @param value value to set the MODIFIED_DATE
     */
    public void setModifiedDate(Date value) {
        setAttributeInternal(MODIFIEDDATE, value);
    }

    /**
     * Gets the attribute value for TAX_CODE using the alias name TaxCode.
     * @return the TAX_CODE
     */
    public Integer getTaxCode() {
        return (Integer) getAttributeInternal(TAXCODE);
    }

    /**
     * Sets <code>value</code> as attribute value for TAX_CODE using the alias name TaxCode.
     * @param value value to set the TAX_CODE
     */
    public void setTaxCode(Integer value) {
        setAttributeInternal(TAXCODE, value);
    }

    /**
     * Gets the attribute value for INVOICE_TYPE using the alias name InvoiceType.
     * @return the INVOICE_TYPE
     */
    public String getInvoiceType() {
        return (String) getAttributeInternal(INVOICETYPE);
    }

    /**
     * Sets <code>value</code> as attribute value for INVOICE_TYPE using the alias name InvoiceType.
     * @param value value to set the INVOICE_TYPE
     */
    public void setInvoiceType(String value) {
        setAttributeInternal(INVOICETYPE, value);
    }

    /**
     * Gets the attribute value for TAXAMT using the alias name Taxamt.
     * @return the TAXAMT
     */
    public BigDecimal getTaxamt() {
        return (BigDecimal) getAttributeInternal(TAXAMT);
    }

    /**
     * Sets <code>value</code> as attribute value for TAXAMT using the alias name Taxamt.
     * @param value value to set the TAXAMT
     */
    public void setTaxamt(BigDecimal value) {
        setAttributeInternal(TAXAMT, value);
    }

    /**
     * Gets the attribute value for TAXEXEMPT using the alias name Taxexempt.
     * @return the TAXEXEMPT
     */
    public String getTaxexempt() {
        return (String) getAttributeInternal(TAXEXEMPT);
    }

    /**
     * Sets <code>value</code> as attribute value for TAXEXEMPT using the alias name Taxexempt.
     * @param value value to set the TAXEXEMPT
     */
    public void setTaxexempt(String value) {
        setAttributeInternal(TAXEXEMPT, value);
    }

    /**
     * Gets the attribute value for FCURR_PMT_AMOUNT using the alias name FcurrPmtAmount.
     * @return the FCURR_PMT_AMOUNT
     */
    public BigDecimal getFcurrPmtAmount() {
        return (BigDecimal) getAttributeInternal(FCURRPMTAMOUNT);
    }

    /**
     * Sets <code>value</code> as attribute value for FCURR_PMT_AMOUNT using the alias name FcurrPmtAmount.
     * @param value value to set the FCURR_PMT_AMOUNT
     */
    public void setFcurrPmtAmount(BigDecimal value) {
        setAttributeInternal(FCURRPMTAMOUNT, value);
    }

    /**
     * Gets the attribute value for FCURR_TAXAMT using the alias name FcurrTaxamt.
     * @return the FCURR_TAXAMT
     */
    public BigDecimal getFcurrTaxamt() {
        return (BigDecimal) getAttributeInternal(FCURRTAXAMT);
    }

    /**
     * Sets <code>value</code> as attribute value for FCURR_TAXAMT using the alias name FcurrTaxamt.
     * @param value value to set the FCURR_TAXAMT
     */
    public void setFcurrTaxamt(BigDecimal value) {
        setAttributeInternal(FCURRTAXAMT, value);
    }

    /**
     * Gets the attribute value for FCURR_BALANCE using the alias name FcurrBalance.
     * @return the FCURR_BALANCE
     */
    public BigDecimal getFcurrBalance() {
        return (BigDecimal) getAttributeInternal(FCURRBALANCE);
    }

    /**
     * Sets <code>value</code> as attribute value for FCURR_BALANCE using the alias name FcurrBalance.
     * @param value value to set the FCURR_BALANCE
     */
    public void setFcurrBalance(BigDecimal value) {
        setAttributeInternal(FCURRBALANCE, value);
    }

    /**
     * Gets the attribute value for FCURR_STAX_AMT using the alias name FcurrStaxAmt.
     * @return the FCURR_STAX_AMT
     */
    public BigDecimal getFcurrStaxAmt() {
        return (BigDecimal) getAttributeInternal(FCURRSTAXAMT);
    }

    /**
     * Sets <code>value</code> as attribute value for FCURR_STAX_AMT using the alias name FcurrStaxAmt.
     * @param value value to set the FCURR_STAX_AMT
     */
    public void setFcurrStaxAmt(BigDecimal value) {
        setAttributeInternal(FCURRSTAXAMT, value);
    }

    /**
     * Gets the attribute value for STAX_AMT using the alias name StaxAmt.
     * @return the STAX_AMT
     */
    public BigDecimal getStaxAmt() {
        return (BigDecimal) getAttributeInternal(STAXAMT);
    }

    /**
     * Sets <code>value</code> as attribute value for STAX_AMT using the alias name StaxAmt.
     * @param value value to set the STAX_AMT
     */
    public void setStaxAmt(BigDecimal value) {
        setAttributeInternal(STAXAMT, value);
    }

    /**
     * Gets the attribute value for SALES_TAX_CODE using the alias name SalesTaxCode.
     * @return the SALES_TAX_CODE
     */
    public Integer getSalesTaxCode() {
        return (Integer) getAttributeInternal(SALESTAXCODE);
    }

    /**
     * Sets <code>value</code> as attribute value for SALES_TAX_CODE using the alias name SalesTaxCode.
     * @param value value to set the SALES_TAX_CODE
     */
    public void setSalesTaxCode(Integer value) {
        setAttributeInternal(SALESTAXCODE, value);
    }

    /**
     * Gets the attribute value for PAYMENTSEQ using the alias name Paymentseq.
     * @return the PAYMENTSEQ
     */
    public BigDecimal getPaymentseq() {
        return (BigDecimal) getAttributeInternal(PAYMENTSEQ);
    }

    /**
     * Sets <code>value</code> as attribute value for PAYMENTSEQ using the alias name Paymentseq.
     * @param value value to set the PAYMENTSEQ
     */
    public void setPaymentseq(BigDecimal value) {
        setAttributeInternal(PAYMENTSEQ, value);
    }

    /**
     * Gets the attribute value for TXT_NET_PAYMENT using the alias name txtNetPayment.
     * @return the TXT_NET_PAYMENT
     */
    public BigDecimal gettxtNetPayment() {
        return (BigDecimal) getAttributeInternal(TXTNETPAYMENT);
    }

    /**
     * Sets <code>value</code> as attribute value for TXT_NET_PAYMENT using the alias name txtNetPayment.
     * @param value value to set the TXT_NET_PAYMENT
     */
    public void settxtNetPayment(BigDecimal value) {
        setAttributeInternal(TXTNETPAYMENT, value);
    }


    /**
     * Gets the attribute value for the calculated attribute txtSumNetPay.
     * @return the txtSumNetPay
     */
    public BigDecimal gettxtSumNetPay() {
        return (BigDecimal) getAttributeInternal(TXTSUMNETPAY);
    }

    /**
     * Gets the associated <code>Row</code> using master-detail link PaymentMasterView.
     */
    public Row getPaymentMasterView() {
        return (Row) getAttributeInternal(PAYMENTMASTERVIEW);
    }

    /**
     * Sets the master-detail link PaymentMasterView between this object and <code>value</code>.
     */
    public void setPaymentMasterView(Row value) {
        setAttributeInternal(PAYMENTMASTERVIEW, value);
    }

    /**
     * Gets the view accessor <code>RowSet</code> AccVWBilllBalanceAmountForPayQVO.
     */
    public RowSet getAccVWBilllBalanceAmountForPayQVO() {
        return (RowSet) getAttributeInternal(ACCVWBILLLBALANCEAMOUNTFORPAYQVO);
    }

    /**
     * Gets the view accessor <code>RowSet</code> AccTaxView.
     */
    public RowSet getAccTaxView() {
        return (RowSet) getAttributeInternal(ACCTAXVIEW);
    }

    /**
     * getAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param attrDef the attribute

     * @return the attribute value
     * @throws Exception
     */
    protected Object getAttrInvokeAccessor(int index, AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            return AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].get(this);
        }
        return super.getAttrInvokeAccessor(index, attrDef);
    }

    /**
     * setAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param value the value to assign to the attribute
     * @param attrDef the attribute

     * @throws Exception
     */
    protected void setAttrInvokeAccessor(int index, Object value, AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].put(this, value);
            return;
        }
        super.setAttrInvokeAccessor(index, value, attrDef);
    }
    
    @Override
    public boolean isAttributeUpdateable(int i) {
        // TODO Implement this method
        if (getPaymentMasterView().getAttribute("Submit").equals("Y")) {
            return false;
       }
        return super.isAttributeUpdateable(i);
    }
}

