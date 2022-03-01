
package com.IBP1.V21.P1_controleurs;

import com.IBP1.V21.P3__services.HelloServ;
import com.IBP1.V21.P4__models.Login_B1;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.portlet.ModelAndView;

@Controller
public class Login_B1_Contl {
   
   @RequestMapping(value = "/1_Login_v", method = RequestMethod.GET)
   public ModelAndView showRegister (HttpServletRequest request, HttpServletResponse response)
   {
       ModelAndView mav = new ModelAndView("1_Login");
       mav.addObject("lb1", new Login_B1());
       return mav;       
   }
   
   @RequestMapping(value = "/helloView", method = RequestMethod.POST)
   public ModelAndView pp(HttpServletRequest request, HttpServletResponse response, @ModelAttribute("user") Login_B1 lb1)
   {
        HelloServ.sayHello(lb1);
        return new ModelAndView("Welcome ", "firstname", lb1.getLogin()); 
   }

}
