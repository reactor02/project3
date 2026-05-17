package kr.or.proj3.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import kr.or.proj3.DTO.Proj3DTO;
import kr.or.proj3.Service.Proj3Service;
@Controller


public class ProjController {
	
	@Autowired // 1. 작성 완료한 서비스 객체를 주입받습니다.
	private Proj3Service proj3Service;	
	
	@RequestMapping ("/hello")
	public String isnull() {
		System.out.println("hello");
		
		return "hello";
	}
	
	@RequestMapping ("/readEmp")
	public ModelAndView readEmp() {
		System.out.println("readEmp");
		
		// 2. 서비스를 호출하여 DB에서 사원 목록을 가져옵니다.
				List<Proj3DTO> empList = proj3Service.readEmp();
		
		ModelAndView mav = new ModelAndView("readEmp");
		
		// 4. "list"라는 이름으로 사원 목록 데이터를 담아서 화면으로 보냅니다.
				mav.addObject("list", empList);
		
		return mav;
	}
	
	

}
