package com.example;

import java.util.HashMap;
import java.util.Map;

public class UrlDatabase {

    private static final Map<String, String> urlMapping = new HashMap<>();

    public static void storeUrlMapping(String shortUrl, String longUrl) {
        urlMapping.put(shortUrl, longUrl);
    }

    public static String getLongUrl(String shortUrl) {
        return urlMapping.get(shortUrl);
    }
}
