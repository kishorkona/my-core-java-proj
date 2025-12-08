package com.work.core;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaRegularExpressions {
    //https://www.youtube.com/watch?v=B5wBepd2eg8 -- By Durga
    public static void main(String[] args) {
        JavaRegularExpressions tst = new JavaRegularExpressions();
        // Pattern for Mobile Number Validation India No:"(0|91)?[7-9][0-9]{9}" US No:"(0|1)?[0-9]{10}"
        // Pattern for Email Validation:"[a-zA-Z0-9][a-zA-Z0-9._]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+"
        String patternString = "[a-zA-Z0-9][a-zA-Z0-9._]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+";
        tst.validateUsingRegEx(patternString, "kishor.kona@gmail.com");
    }

    private void validateUsingRegEx(String patternStr, String value) {
        Pattern pattern = Pattern.compile(patternStr);
        Matcher matcher = pattern.matcher(value);
        if(matcher.find() && matcher.group().equals(value)) {
            System.out.println(value + " is valid");
        } else {
            System.out.println(value + " is invalid");
        }
    }

    private void stringMatcher() {
        Pattern pattern = Pattern.compile("[^abc]");
        Matcher matcher = pattern.matcher("a7b@z#9");
        while(matcher.find()) {
            System.out.println("start="+matcher.start()+",value="+matcher.group());
        }
    }

    private void splitMethodExample() {
        Pattern pattern = Pattern.compile("a");
        String[] arr = pattern.split("Durga Software Solutions");
        for (String s: arr) {
            System.out.println(s);
        }
    }
    private void splitMethodExample1() {
        Pattern pattern = Pattern.compile("\\."); // [.] (or) \\.
        String[] arr = pattern.split("www.durgasoft.com");
        for (String s: arr) {
            System.out.println(s);
        }
    }
    private void stringSplitMethodExample1() {
        Pattern pattern = Pattern.compile("\\."); // [.] (or) \\.
        String[] arr = "Durga Software Solutions".split("a");
        for (String s: arr) {
            System.out.println(s);
        }
    }
}
