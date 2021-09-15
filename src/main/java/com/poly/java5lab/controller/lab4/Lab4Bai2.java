package com.poly.java5lab.controller.lab4;

import com.poly.java5lab.entity.UserEntity;
import com.poly.java5lab.utils.CookieUtil;
import com.poly.java5lab.utils.SessionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class Lab4Bai2 {
    @Autowired
    private SessionUtil sessionUtil;
    @Autowired
    private CookieUtil cookieUtil;
    @Autowired
    private HttpServletRequest req;

    @GetMapping("/lab4/bai2")
    public String bai2Page(){
        return "views/lab4/lab4bai2";
    }

    @GetMapping("/lab4/login")
    public String loginPage(Model model){
        String status = req.getParameter("status");
        if(status != null && status.equals("login_false")){
            UserEntity userEntity = sessionUtil.get("remember");
            if(userEntity != null){
                model.addAttribute("username", userEntity.getUsername());
                model.addAttribute("password", userEntity.getPassword());
            }
        }
        String remember = cookieUtil.get("user");
        if(remember != null){
            String username = remember.substring(0, remember.indexOf("%"));
            String password = remember.substring(remember.indexOf("%")+1,remember.length());
            model.addAttribute("username", username);
            model.addAttribute("password", password);
            model.addAttribute("reLogin","on");
        }
        return "views/lab4/login";
    }

    @PostMapping("/lab4/bai2/save")
    @ResponseBody
    public String checkLogin(UserEntity userEntity){
        sessionUtil.set("remember", userEntity);
        return  "okkkkkkkkkkkkkkk";
    }
}
