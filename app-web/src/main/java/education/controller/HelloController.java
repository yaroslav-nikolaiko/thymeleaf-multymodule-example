package education.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.websocket.server.PathParam;

/**
 * Created by yaroslav on 20.02.16.
 */
@Controller
public class HelloController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String messages(Model model) {
        model.addAttribute("name", "Yaroslav");
        return "index";
    }

    @RequestMapping(value = "/demo", method = RequestMethod.GET)
    public String demo(Model model) {
        model.addAttribute("demo", "DEMO");
        return "demo";
    }

    @RequestMapping(value = "/{page}", method = RequestMethod.GET)
    public String demo(@PathVariable String page) {
        return page;
    }
}
