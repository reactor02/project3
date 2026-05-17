<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
    <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>사원 목록 조회</title>
<style>
    table { border-collapse: collapse; width: 80%; margin: 20px auto; }
    th, td { border: 1px solid #dddddd; text-align: left; padding: 8px; }
    th { background-color: #f2f2f2; }
</style>
</head>
<body>

    <h2 style="text-align:center;">사원 목록 (${fn:length(list)}명)</h2>

    <table>
        <thead>
            <tr>
                <th>사원번호</th>
                <th>이름</th>
                <th>직급</th>
                <th>상사번호</th>
                <th>입사일</th>
                <th>급여</th>
                <th>부서번호</th>
            </tr>
        </thead>
        <tbody>
            <!-- items 안에는 반드시 ${list} 형태로 달러와 중괄호를 붙여야 합니다 -->
            <c:forEach var="s" items="${list}">
                <tr>
                    <!-- s 뒤에는 DTO에 적었던 변수명을 정확하게 적어줍니다 -->
                    <td>${s.empno}</td>
                    <td>${s.ename}</td>
                    <td>${s.job}</td>
                    <td>${s.mgr}</td>
                    <td>${s.hiredate}</td>
                    <td><fmt:formatNumber value="${s.sal}" type="currency"/></td>
                    <td>${s.deptno}</td>
                </tr>
            </c:forEach>
            
            <!-- 만약 데이터가 없을 때를 대비한 예외 처리 -->
            <c:if test="${empty list}">
                <tr>
                    <td colspan="7" style="text-align:center;">조회된 사원 정보가 없습니다.</td>
                </tr>
            </c:if>
        </tbody>
    </table>
    
    <div>http://localhost:8080/proj3/readEmp</div>

</body>
</html>