package ru.academits.kim;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import static java.nio.charset.Charset.forName;

public class getHelloWorldServlet extends HttpServlet {
    private static final long serialVersionUID = -4743670766462494094L;

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.getOutputStream().write("get Hello World Servlet".getBytes(forName("UTF-8")));
        resp.getOutputStream().flush();
        resp.getOutputStream().close();
    }
}