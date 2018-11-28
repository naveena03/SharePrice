package com.cg.SharePrice.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "stock_master")
public class SharePrice {
	@Id
	@Column(name= "stock_code")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Id;
	@Column(name="Stock")
	private String Stock;
	@Column(name="Quote")
	private int Quote;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getStock() {
		return Stock;
	}
	public void setStock(String stock) {
		Stock = stock;
	}
	public int getQuote() {
		return Quote;
	}
	public void setQuote(int quote) {
		Quote = quote;
	}
	@Override
	public String toString() {
		return "SharePrice [Id=" + Id + ", Stock=" + Stock + ", Quote=" + Quote
				+ "]";
	}
	public SharePrice(int id, String stock, int quote) {
		super();
		Id = id;
		Stock = stock;
		Quote = quote;
	}
	public SharePrice() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
