package ru.gb.lesson.apl;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class GreetingController {


    //http://localhost:8500/app/hello?name=Iaroslav
//    @GetMapping("/hello")
//    //@RequestMapping(value = "/hello",method = RequestMethod.GET)
//    @ResponseBody
//    public String helloWorld(@RequestParam String name){
//        return "Hello "+name;
//    }

    //http://localhost:8500/app/hello/Iaroslav
@GetMapping("/hello/{name}")
//@RequestMapping(value = "/hello",method = RequestMethod.GET)
@ResponseBody
public String helloWorld(@PathVariable String name){
    return "Hello "+name;
}
@GetMapping("/home")
public String home(@RequestParam(required = false) String name, Model model){
    if(name != null) {
        model.addAttribute("name", name);
    }else {
        model.addAttribute("name","Java");
    }

    return "home";
}



}

//[GET, PUT, POST...]->DispatcherServlet -> Ищет нужный контроллер-> Отдает запрос клиенту