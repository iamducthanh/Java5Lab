package com.poly.java5lab.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;

@Service
public class SessionUtil {
    @Autowired
    private HttpSession session;

    public <T> T get(String name){
        return (T) session.getAttribute(name);
    }

    public void set(String name, Object value){
        session.setAttribute(name, value);
    }

    public void remove(String name){
        session.removeAttribute(name);
    }
}
