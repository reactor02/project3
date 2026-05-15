package kr.or.proj3;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller


public class ProjController {
	
	@RequestMapping ("/hello")
	public String isnull() {
		System.out.println("hello");
		
		return "hello";
	}
	
	

}
