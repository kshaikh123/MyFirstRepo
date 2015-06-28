package com.tms.bat.cssdk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * User: HUGE-mloomis
 * Date: 5/7/15
 * Time: 10:59 AM
 */
@Controller
public class AppController {

    @RequestMapping(value = "/healthcheck2", method = RequestMethod.GET)
    @ResponseBody
    public String healthCheck() {
        return "<html><body>health-check</body></html>";
    }

}

