package ku.cs.kafe.controller;
//6410406649 Thanrada Sonnakhongcharoen
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String getHomePage(Model model){
        model.addAttribute("greeting", "Sawaddee");
        return "home";      // home.html
    }
}
