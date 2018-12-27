package org.entity;

public class BuyerDiscount {
	private int id;								//用户优惠ID
		
	private int buyerId;						//客户编号
	
	private int discountId;					//优惠ID

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getBuyerId() {
		return buyerId;
	}

	public void setBuyerId(int buyerId) {
		this.buyerId = buyerId;
	}

	public int getDiscountId() {
		return discountId;
	}

	public void setDiscountId(int discountId) {
		this.discountId = discountId;
	}

	
	
	
}
