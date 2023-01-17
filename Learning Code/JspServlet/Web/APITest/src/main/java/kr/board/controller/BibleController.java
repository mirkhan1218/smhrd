package kr.board.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.reflection.SystemMetaObject;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class BibleController implements Controller {

	@Override
	public String requestHandler(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String addr = "https://sum.su.or.kr:8888/bible/today";
		
		URL url = new URL(addr);
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		con.setUseCaches(true);
		con.setConnectTimeout(30000); // 3분
		// 스트림의 연쇄(연결)
		BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
		StringBuilder sb = new StringBuilder();
		while(true) {
			String line = br.readLine();
			if(line == null) {
				break;
			}
			sb.append(line + "\n");
		}
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println(sb.toString());
		
		// Jsoup API
		// Document doc = Jsoup.connect(addr).get();
		// Element bt = doc.select(".bible_text").first();
		// System.out.println(bt.text());
		// response.setContentType("text/html;charset=utf-8");
		// PrintWriter out = response.getWriter();
		// out.println(doc.toString());
		
		return null;
	}

}
