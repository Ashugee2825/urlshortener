package com.example;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/shorten")
public class UrlShortenerServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String longUrl = request.getParameter("longUrl");
        String encodingType = request.getParameter("encodingType");

        // Generate short URL
        String shortUrl = UrlShortenerUtil.generateShortUrl(longUrl, encodingType);
        

        // Store the mapping (in a simple in-memory map for now)
        UrlDatabase.storeUrlMapping(shortUrl, longUrl);
         
 
        // Pass the data to result.jsp
        request.setAttribute("longUrl", longUrl);
        request.setAttribute("shortUrl", shortUrl);

        request.getRequestDispatcher("result.jsp").forward(request, response);
    }
}
