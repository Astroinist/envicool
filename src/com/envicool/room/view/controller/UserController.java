package com.envicool.room.view.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.envicool.room.model.entity.UserEntity;
import com.envicool.room.model.service.UserService;

@Controller
public class UserController {

    @Autowired
    private UserService service;
    
    /**
     * 登录
     * @param name
     * @param password
     * @return
     */
    @RequestMapping("/login")
    public ModelAndView login(
            @RequestParam(value="name", required = true, defaultValue = "")String name,
            @RequestParam(value="pswd", required = true, defaultValue = "")String password,
            HttpServletRequest request
            ) {
        if (!StringUtils.isBlank(name) && !StringUtils.isBlank(password)) {
            UserEntity user = service.findUserByNameAndPassword(name, password);
            if (user != null) {
                
            } else {
                
            }
        } else {
            
        }
        return new ModelAndView("home");
    }
    
    /**
     * 
     * @param name
     * @param password
     * @param cell
     * @param company
     * @param request
     * @return
     */
    @RequestMapping("/register")
    public ModelAndView register(
            @RequestParam(value="name", required = true, defaultValue = "")String name,
            @RequestParam(value="display", required = true, defaultValue = "")String display,
            @RequestParam(value="pswd", required = true, defaultValue = "")String password,
            @RequestParam(value="confirm", required = true, defaultValue = "")String confirm,
            @RequestParam(value="cell", required = true, defaultValue = "")String cell,
            @RequestParam(value="email", required = true, defaultValue = "")String email,
            @RequestParam(value="company", required = true, defaultValue = "")String company,
            HttpServletRequest request
            ) {
        if (!StringUtils.isBlank(name) && !StringUtils.isBlank(password) && !StringUtils.isBlank(confirm) &&
            !StringUtils.isBlank(cell) && !StringUtils.isBlank(email) && !StringUtils.isBlank(company)) {
            if (password.equals(confirm)) {
                
            } else {
                //两次输入的密码不一致
            }
        } else {
            //请求参数非法
        }
        return new ModelAndView("home");
    }
    
}
