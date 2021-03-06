<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:forEach items="${list}" var="vo">
  <div class="col-sm-6" title="${vo.num}">
 	<div class="item">
		<div class="logo1">
			<img  style="width: 70px;height: 70px;" src="../upload/${vo.storeThumbFileVO.fileName}">		
		</div>
	<div class="restaurant-name">
      ${vo.storeName}
	</div>
	<div class="restaurant-info">
		<span class="restaurant-star">★ ${vo.starAvg}</span> | 리뷰 618 | ${vo.storeManageVO.minPrice}원 이상 배달
	</div>
	<div class="restaurant-time">
		${vo.storeManageVO.takeTime}분 예상
	</div>
	</div>
	</div>
</c:forEach>