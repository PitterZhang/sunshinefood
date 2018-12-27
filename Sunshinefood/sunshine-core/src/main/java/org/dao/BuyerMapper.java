package org.dao;

import org.apache.ibatis.annotations.Select;
import org.entity.Buyer;

public interface BuyerMapper {
	@Select("SELECT * FROM buyer where buyer_name=#{buyer.buyerName} and buyer_password =#{buyer.buyerPassword}")
	Buyer login(Buyer buyer);
}
