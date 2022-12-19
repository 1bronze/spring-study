package hello.servlet.basic;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

// /hello 접속 시 helloServlet 서블릿 실행
@WebServlet(name = "helloServlet", urlPatterns = "/hello")
public class HelloServlet extends HttpServlet { // 서블릿은 HttpServlet을 상속받아야 함.

    // 서블릿이 실행되면 service 함수가 자동으로 실행됨.
    // IntelliJ에서는 Ctrl+O 입력 후 service 검색해서 선택하면 코드 자동생성됨.
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("HelloServlet.service");
        System.out.println("request = " + request);
        System.out.println("response = " + response);

        // query parameter를 직접 파싱할 필요 없이 GetParameter 메소드를 통해 읽어올 수 있음.
        String username = request.getParameter("username");
        System.out.println("username = " + username);

        // 보낼 객체의 타입을 알려줌.
        response.setContentType("text/plain");
        // 보낼 객체의 인코딩 방식을 알려줌.
        response.setCharacterEncoding("utf-8");
        // 텍스트를 응답으로 보냄.
        response.getWriter().write("hello " + username);
    }
}
