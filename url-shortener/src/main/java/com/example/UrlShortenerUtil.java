package com.example;

import java.util.Base64;

public class UrlShortenerUtil {

    public static String generateShortUrl(String longUrl, String encodingType) {
        int hashCode = longUrl.hashCode();

        if ("16".equals(encodingType)) {
            // Convert hashCode to base-16 (hexadecimal)
            return Integer.toHexString(hashCode);
        } else {
            // Convert hashCode to base-64
            return Base64.getUrlEncoder().encodeToString(Integer.toString(hashCode).getBytes());
            
        }
    }
}
