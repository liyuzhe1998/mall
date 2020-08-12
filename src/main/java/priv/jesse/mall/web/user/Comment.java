package priv.jesse.mall.web.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Comment {

    @RequestMapping("/jump")
    public String doHellworld(String pg){
        return pg;
    }
}
