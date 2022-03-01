package com.IBP1.V21.P3__services;

import com.IBP1.V21.P4__models.Login_B1;

public class HelloServ {
    
    //Implementing a Service
    public static String sayHello(Login_B1 ub1) {
        return "Hello : " + ub1.getLogin() + "!";
    }
    
}
