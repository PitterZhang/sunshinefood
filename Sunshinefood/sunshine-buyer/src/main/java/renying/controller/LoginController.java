package renying.controller;

import org.entity.Buyer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import renying.service.BuyerService;

@RestController
@RequestMapping("buyerLogin")
public class LoginController {
	@Autowired
	private BuyerService buyerService;
	
	@PostMapping("login")
	@ResponseBody
	public Buyer login(@RequestParam("buyerName")String buyerName,@RequestParam("buyerPassword")String buyerPassword) {
		System.out.println("进来了方法");
		if(buyerService.login(buyerName,buyerPassword)!=null) {
			System.out.println("登录成功");
			return buyerService.login(buyerName,buyerPassword);
		}
		System.out.println("登录失败");
		return null;
	}
	
}
