package com.oreilly.strutsckbk.ch07;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FileViewerServlet extends HttpServlet {
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String fileName = (String) request.getAttribute("fileName");
        fileName = "temp.txt";
        FileReader in = null;
        PrintWriter out = null;
        response.setContentType("text/plain");
        File dir = (File) getServletContext().getAttribute("javax.servlet.context.tempdir");
        File f = new File(dir, "test.tmp");
        try {
            // Get an input stream on the form file
            in = new FileReader(f);

            // Get an output stream for the response 
            out = response.getWriter();
        
            // Write from the input stream to the output stream
            char[] buffer = new char[512];
            int chars = 0;
            while ((chars = in.read(buffer)) != -1) {
                out.write(buffer, 0, chars);
            }
        }
        finally {
            if (out != null) out.close();
            if (in != null) in.close();     
        }        
    }
}
