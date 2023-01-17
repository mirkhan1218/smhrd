package kr.board.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MapController implements Controller {

	@Override
	public String requestHandler(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String address=request.getParameter("address");
		address=URLEncoder.encode(address, "UTF-8"); // 공백
		String reqUrl="https://dapi.kakao.com/v2/local/search/address.xml?query="+address;
		URL url=new URL(reqUrl);
        HttpURLConnection con=(HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");
        con.setRequestProperty("Authorization", "KakaoAK 14b622d1ff7c317a23336a975751e639");
        
        BufferedReader br=new BufferedReader(new InputStreamReader(con.getInputStream()));
        StringBuilder sb = new StringBuilder();
		while(true) {
			String line = br.readLine();
			if(line == null) {
				break;
			}
			sb.append(line + "\n");
		}
		response.setContentType("text/html;charset=euc-kr");
		PrintWriter out=response.getWriter();
		out.println(sb.toString());
		
		return null;
	}

}
