package com.tcs.inter;

import java.io.IOException;
import java.time.LocalDateTime;

import org.springframework.web.servlet.HandlerInterceptor;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class EmpInterceoter implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest req, HttpServletResponse res, Object Handler)
			throws ServletException, IOException {
		System.out.println("EmpInterceoter.preHandle()");
		LocalDateTime ld = LocalDateTime.now();
		int hour = ld.getHour();
		System.out.println("getServletPath -- "+req.getServletPath());
		System.out.println("getServletPath -- "+req.getServletContext());
		if(!req.getServletPath().equalsIgnoreCase("/")) {
			if (hour < 9 || hour > 16) {
				System.out.println("current hour >--> "+hour);
				RequestDispatcher rd = req.getRequestDispatcher("/timeout.jsp");
				rd.forward(req, res);
				return false;
			}
		}
		return true;
	}
}
