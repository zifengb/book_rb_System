<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<style type="text/css">
a{text-decoration:none;}
#fenye {width:auto; height:40px; line-height:30px; text-align:center}
#fenye a {background-color:#777; padding:5px 10px; color:#fff; margin:0 2px; display:inline;}
#fenye a:hover {background-color:#3BA80D; text-decoration:none}
#fenye b {background-color:#777; padding:5px 10px; color:#fff;cursor:pointer;}
</style>
<script type="text/javascript">
$(function(){
	var begin = $("[name = begin]").val();
	var maxPageNum = <s:property value="maxPageNum"/>;
	if(maxPageNum==1)
	{
		$("#fir").css("display","none");
		$("#pre").css("display","none");
		$("#next").css("display","none");
		$("#last").css("display","none");
	}
	else if(begin==1)
	{
		$("#fir").css("display","none");
		$("#pre").css("display","none");
	}
	else if(begin==maxPageNum)
	{
		$("#next").css("display","none");
		$("#last").css("display","none");
	}
	$("#fir").click(function(){
		$("[name=begin]").val(1);
		$("form:first").submit();
	});
	$("#pre").click(function(){
		$("[name=begin]").val(begin-1);
		$("form:first").submit();
	});
	$("#next").click(function(){
		$("[name=begin]").val(begin*1+1);
		$("form:first").submit();
	});
	$("#last").click(function(){
		$("[name=begin]").val(maxPageNum);
		$("form:first").submit();
	});
});
</script>
<br/>
<input type="hidden" name="begin"/>
	<c:if test="maxPageNum>0">
	<div id="fenye">
		<a href="javascript:void(0)" id="fir" >首页</a>
		<a href="javascript:void(0)" id="pre" >上一页</a>
		<b>第<span style="color:gold;font-size:14px;">begin</span>/<span style="font-size:14px;"><s:property value="maxPageNum"/></span>页</b>
		<a href="javascript:void(0)" id="next" >下一页</a>
		<a href="javascript:void(0)" id="last" >末页</a>
		<b>共<span style="color:gold;font-size:14px;"><s:property value="dataCount"/></span>条记录</b>
	</div>
	</c:if>