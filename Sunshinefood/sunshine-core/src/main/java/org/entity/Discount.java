package org.entity;

public class Discount {
	private int discount_Id;								//优惠ID
	
	private String discountName;							//优惠名
	
	private double discountPrice;							//优惠金额
	
	private double discountMin;							//最低可用
	
	private String discountStartDate;						//开始时间
	
	private String  discountExpireDate;					//结束时间

	public int getDiscount_Id() {
		return discount_Id;
	}

	public void setDiscount_Id(int discount_Id) {
		this.discount_Id = discount_Id;
	}

	public String getDiscountName() {
		return discountName;
	}

	public void setDiscountName(String discountName) {
		this.discountName = discountName;
	}

	public double getDiscountPrice() {
		return discountPrice;
	}

	public void setDiscountPrice(double discountPrice) {
		this.discountPrice = discountPrice;
	}

	public double getDiscountMin() {
		return discountMin;
	}

	public void setDiscountMin(double discountMin) {
		this.discountMin = discountMin;
	}

	public String getDiscountStartDate() {
		return discountStartDate;
	}

	public void setDiscountStartDate(String discountStartDate) {
		this.discountStartDate = discountStartDate;
	}

	public String getDiscountExpireDate() {
		return discountExpireDate;
	}

	public void setDiscountExpireDate(String discountExpireDate) {
		this.discountExpireDate = discountExpireDate;
	}

	
	
}
