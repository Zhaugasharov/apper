package app.searcher.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;

@Controller
public class IndexController{

    @RequestMapping("/")
    public ModelAndView index(){
        HashMap data = new HashMap();
        data.put("title", "TEST");
        return new ModelAndView("pages/main/index", data);
    }

}
