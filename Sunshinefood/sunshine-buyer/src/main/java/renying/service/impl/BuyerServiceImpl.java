package renying.service.impl;

import org.dao.BuyerMapper;
import org.entity.Buyer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import renying.service.BuyerService;

@Service
public class BuyerServiceImpl implements BuyerService{
	@Autowired
	private BuyerMapper buyerMapper;
	
	@Override
	public Buyer login(Buyer buyer) {
		return buyerMapper.login(buyer);
	}

}
