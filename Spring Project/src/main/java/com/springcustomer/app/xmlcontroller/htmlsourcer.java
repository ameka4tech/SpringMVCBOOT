package com.springcustomer.app.xmlcontroller;

        import org.springframework.stereotype.Controller;
        import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Ameya
 */

@Controller
public class htmlsourcer {

    @RequestMapping("/")
    public String parser(){
        return "xmlaparser";
    }

}
