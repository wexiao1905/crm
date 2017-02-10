package com.crm.domain.ws.oa;

import java.math.BigDecimal;

/**
 * 商品信息
 * @author apeHx
 *
 */
public class Goods {
	private Integer id;			//ID
	private String name;		//商品名称
	private String model;		//型号
	private BigDecimal price;	//单价
	private Integer num;		//商品数量
	private Integer stock;		//库存
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	public Integer getStock() {
		return stock;
	}
	public void setStock(Integer stock) {
		this.stock = stock;
	}
}
