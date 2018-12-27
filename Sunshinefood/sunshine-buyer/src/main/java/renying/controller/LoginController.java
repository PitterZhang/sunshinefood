package renying.controller;

import org.entity.Buyer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import renying.service.BuyerService;

@RestController
public class LoginController {
	@Autowired
	private BuyerService buyerService;
	
	@RequestMapping("login")
	public String login(@RequestParam("buyerName")String buyerName,@RequestParam("buyerPassword")String buyerPassword) {
		if(buyerService.login(buyerName,buyerPassword)!=null) {
			return "成功";
		}
		Buyer buyer=new Buyer();
		System.out.println("888888888888888888888888888888888888888");
		System.out.println(buyer);
		return "失败";
	}
	
}
