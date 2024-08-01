package com.tenco;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class TodoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public TodoServlet() {
        super();
    }
    // get 요청시 동작
    // 주소설계 - http://localhost:8080/d4/todo-servlet

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	System.out.println("GET 요청 확인");
	String strJson = "  {\r\n"
			+ "    \"userId\": 1,\r\n"
			+ "    \"id\": 1,\r\n"
			+ "    \"title\": \"sunt aut facere repellat provident occaecati excepturi optio reprehenderit\",\r\n"
			+ "    \"body\": \"quia et suscipit\\nsuscipit recusandae consequuntur expedita et cum\\nreprehenderit molestiae ut ut quas totam\\nnostrum rerum est autem sunt rem eveniet architecto\"\r\n"
			+ "  },";
	
	PrintWriter pw = response.getWriter();
	pw.print(strJson);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
