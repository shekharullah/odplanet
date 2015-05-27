/*
 * @(#)Application.java        1.0 2015/05/25
 *
 * Copyright (c) 2015-2016 Online Doctors Planet.
 * 11 North Bishil Road, Mirpur 1, Dhaka, Bangladesh
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of Online
 * Doctors Planet.("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Online Doctors Planet.
 */

package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

/**
 *  
         Application.java is written for page rendering and navigation purpose
 *
 * @version      
         1.0 25th May 2015  * @author          
         Shekhar Ullah  */
public class Application extends Controller {

    public static Result index() {
        return ok(index.render("landing page."));
    }
    
    public static Result registration() {
        return ok(registration.render("registration."));
    }
    
    public static Result login() {
        return ok(login.render("login."));
    }
    
    public static Result forgotpassword() {
        return ok(forgotpassword.render("forgot password."));
    }
}
