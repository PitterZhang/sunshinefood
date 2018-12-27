package renying.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
	
	@RequestMapping("login")
	public String login() {
		if(1>0) {
			return "成功";
		}
		return "失败";
	}
}
