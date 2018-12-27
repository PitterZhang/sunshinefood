package renying.controller;

import org.entity.Buyer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import renying.service.BuyerService;

@RestController
public class LoginController {
	@Autowired
	private BuyerService buyerService;
	
	@RequestMapping("login")
	public String login(Buyer buyer) {
		if(buyerService.login(buyer)!=null) {
			return "成功";
		}
		return "失败";
	}
}
