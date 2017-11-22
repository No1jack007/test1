package com.net.controller;
  
import javax.annotation.Resource;  
  
import org.springframework.stereotype.Controller;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.servlet.ModelAndView;  
  
import com.net.domain.User;
import com.net.service.UserService;
  
/** 
 * 功能概要：UserController 
 *  
 * @author netbingwen
 * @since  2015年9月28日  
 */  
@Controller
@RequestMapping("/user")
public class UserController {  
    @Resource  
    private UserService userService;  
      
    @RequestMapping("/user1")
    public ModelAndView getIndex(){      
        ModelAndView mav = new ModelAndView("index");   
        User user = userService.selectUserById(1);  
        mav.addObject("user", user);   
        return mav;    
    }    
}  