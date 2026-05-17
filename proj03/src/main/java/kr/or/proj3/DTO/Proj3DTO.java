package kr.or.proj3.DTO;

import java.sql.Date;

import lombok.Data;

@Data
public class Proj3DTO {
	
	private Integer empno;    // 사원번호 (PK)
    private String ename;     // 사원이름
    private String job;       // 직급
    private Integer mgr;      // 직속상사 사원번호
    private Date hiredate;// 입사일
    private Double sal;       // 급여
    private Double comm;      // 상여금
    private Integer deptno;   // 부서번호

}
