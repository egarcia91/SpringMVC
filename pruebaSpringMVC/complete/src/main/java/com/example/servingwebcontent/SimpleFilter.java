//package com.example.servingwebcontent;
//
//import java.io.IOException;
//
//import javax.servlet.Filter;
//import javax.servlet.FilterChain;
//import javax.servlet.FilterConfig;
//import javax.servlet.ServletException;
//import javax.servlet.ServletRequest;
//import javax.servlet.ServletResponse;
//
//import org.springframework.stereotype.Component;
//
//@Component
//public class SimpleFilter implements Filter {
//	@Override
//	public void destroy() {}
//
//	@Override
//	public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterchain) 
//		throws IOException, ServletException {
//
//		//if(request.getRequestURL().equals("/formulario")){
//		//	filterchain.doFilter(request, response);
//		//	return;
//		//}
//		//System.out.println("Request : "+request.getParameterMap());
//		System.out.println("Request : "+request.getParameter("name"));
//		System.out.println("Request : "+request.getParameter("username"));
//		System.out.println("Request : "+request.getParameter("password"));
////		if(!request.getParameter("password").equals("asd")){
////			return;
////		}
//		//System.out.println("Remote Address:"+request.getRemoteAddr());
//		filterchain.doFilter(request, response);
//	}
//
//	@Override
//	public void init(FilterConfig filterconfig) throws ServletException {}
//}
