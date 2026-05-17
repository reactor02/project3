package kr.or.proj3.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.or.proj3.DTO.Proj3DTO;
import kr.or.proj3.Proj3DAO.Proj3DAO;

@Service
public class ProjServiceImpl  implements Proj3Service{
	
	@Autowired // 2. 방금 세팅을 끝낸 DAO 객체를 주입받습니다.
	private Proj3DAO proj3DAO; 
	
	@Override
	public List<Proj3DTO> readEmp() {
		
		
		// 3. 주입받은 DAO의 readEmp() 메서드를 호출하여 결과를 그대로 리턴합니다.
	    List<Proj3DTO> result = proj3DAO.readEmp();
		
		return result; 
		
	}

}
