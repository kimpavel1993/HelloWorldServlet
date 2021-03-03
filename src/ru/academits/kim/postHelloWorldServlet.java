package ru.academits.kim;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;

import static java.nio.charset.Charset.forName;

public class postHelloWorldServlet extends HttpServlet {
    private static final long serialVersionUID = 5820640317078260193L;

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        OutputStream out = resp.getOutputStream();
        String hello = "post Hello World Servlet";

        out.write(hello.getBytes(forName("UTF-8")));
        out.flush();
        out.close();
    }
}