/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/SpringFramework/SimpleFormController.java to edit this template
 */
package com.itako21.vitrine21.controllers;

/**
 *
 * @author FA-Centrale
 */
public class HelloController {
    
    public HelloController() {
        //Initialize controller properties here or 
        //in the Web Application Context

        //setCommandClass(MyCommand.class);
        //setCommandName("MyCommandName");
        //setSuccessView("successView");
        //setFormView("formView");
        
        
        // link:http://static.springsource.org/spring/docs/3.1.x/javadoc-api/org/springframework/web/servlet/mvc/BaseCommandController.html#setCommandClass(java.lang.Class)[+setCommandClass+](*Name*.class);
        // link:http://static.springsource.org/spring/docs/3.1.x/javadoc-api/org/springframework/web/servlet/mvc/BaseCommandController.html#setCommandName(java.lang.String)[+setCommandName+]("*name*");
        // link:http://static.springsource.org/spring/docs/3.1.x/javadoc-api/org/springframework/web/servlet/mvc/SimpleFormController.html#setSuccessView(java.lang.String)[+setSuccessView+]("*hello*View");
        // link:http://static.springsource.org/spring/docs/3.1.x/javadoc-api/org/springframework/web/servlet/mvc/SimpleFormController.html#setFormView(java.lang.String)[+setFormView+]("*name*View");
        
    }
    
    protected void doSubmitAction(Object command) throws Exception {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    //Use onSubmit instead of doSubmitAction 
    //when you need access to the Request, Response, or BindException objects
    /*
    @Override
    protected ModelAndView onSubmit(
            HttpServletRequest request, 
            HttpServletResponse response, 
            Object command, 
            BindException errors) throws Exception {
        ModelAndView mv = new ModelAndView(getSuccessView());
        //Do something...
        return mv;
    }
     */
}
