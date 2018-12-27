package org.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.entity.Buyer;

public interface BuyerMapper {
	@Select("SELECT * FROM buyer where buyername=#{buyerName} and buyerpassword =#{buyerPassword}")
	Buyer login(@Param("buyerName")String buyerName,@Param("buyerPassword")String buyerPassword);
}
