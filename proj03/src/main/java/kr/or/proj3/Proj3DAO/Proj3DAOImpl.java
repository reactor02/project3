package kr.or.proj3.Proj3DAO;

import java.util.ArrayList;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.or.proj3.DTO.Proj3DTO;

@Repository
public class Proj3DAOImpl implements Proj3DAO{
	
	@Autowired // 2. 스프링이 관리하는 마이바티스 세션 객체를 주입받습니다.
	private SqlSessionTemplate sqlSession;
	
	// 3. XML 매퍼 파일의 namespace와 일치시킬 경로를 상수로 정의합니다.
	private static final String NAMESPACE = "kr.or.proj3.Proj3DAO.Proj3DAO.";
	
	@Override
	public List<Proj3DTO> readEmp() {
		
		List<Proj3DTO> result = sqlSession.selectList(NAMESPACE + "readEmp");
		
		
		return result; 
		
	}

}
