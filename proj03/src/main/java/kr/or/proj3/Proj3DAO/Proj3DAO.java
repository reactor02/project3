package kr.or.proj3.Proj3DAO;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.or.proj3.DTO.Proj3DTO;


public interface Proj3DAO {
	
	public List<Proj3DTO> readEmp();

}
