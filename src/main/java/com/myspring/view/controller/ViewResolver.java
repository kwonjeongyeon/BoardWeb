package com.myspring.view.controller;

public class ViewResolver {
	// Controller가 리턴한 View 이름에 접두사(prefix)와 접미사(suffix)를 결합하여 최종으로 실행될 View 경로와 파일명 완성

	public String prefix;
	public String suffix;

	public void setPrefix(String prefix) { //접두사 초기화
		this.prefix = prefix;
	}

	public void setSuffix(String suffix) {  //접미사 초기화
		this.suffix = suffix;
	}

	public String getView(String viewName) {
		return prefix + viewName + suffix;
	}

}
