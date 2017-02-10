package com.crm.domain.ws.oa;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Map;

/**
 * 商品发票信息
 * @author apeHx
 *
 */
public class GoodsInvoice implements Serializable {
	private Integer id;						//ID
	private String code;					//发票代码
	private String invoiceNum;				//发票号码
	private Date invoiceDate;				//发票日期
	private String industryType;			//行业类型
	private String companyName;				//开票单位
	private String invoicor;				//开票人姓名
	private String invoicorTo;				//付款人姓名
	private String upperPrice;				//大写金额
	private BigDecimal lowerPrice;			//小写金额
	private Map<String, BigDecimal> content;//项目内容 (Key-项目内容	Value-金额)
	private String remakrs;					//备注
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getInvoiceNum() {
		return invoiceNum;
	}
	public void setInvoiceNum(String invoiceNum) {
		this.invoiceNum = invoiceNum;
	}
	public Date getInvoiceDate() {
		return invoiceDate;
	}
	public void setInvoiceDate(Date invoiceDate) {
		this.invoiceDate = invoiceDate;
	}
	public String getIndustryType() {
		return industryType;
	}
	public void setIndustryType(String industryType) {
		this.industryType = industryType;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getInvoicor() {
		return invoicor;
	}
	public void setInvoicor(String invoicor) {
		this.invoicor = invoicor;
	}
	public String getUpperPrice() {
		return upperPrice;
	}
	public void setUpperPrice(String upperPrice) {
		this.upperPrice = upperPrice;
	}
	public BigDecimal getLowerPrice() {
		return lowerPrice;
	}
	public void setLowerPrice(BigDecimal lowerPrice) {
		this.lowerPrice = lowerPrice;
	}
	public Map<String, BigDecimal> getContent() {
		return content;
	}
	public void setContent(Map<String, BigDecimal> content) {
		this.content = content;
	}
	public String getRemakrs() {
		return remakrs;
	}
	public void setRemakrs(String remakrs) {
		this.remakrs = remakrs;
	}
	public String getInvoicorTo() {
		return invoicorTo;
	}
	public void setInvoicorTo(String invoicorTo) {
		this.invoicorTo = invoicorTo;
	}
}
