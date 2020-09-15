package app.controller;

import app.entity.Subscribers;
import app.service.SubscribersService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api/v1/")
public class SubscribersController {

    private final SubscribersService subscribersService;

    public SubscribersController(SubscribersService subscribersService) {
        this.subscribersService = subscribersService;
    }

    /*
    for example:
    http://localhost:8080/api/v1/search/994773456789/3
    */

    @GetMapping("search/{telephone}/{id}")
    public String get_subscribers_by_telephone(@PathVariable String telephone,@PathVariable int id,Model model) {
        Subscribers subscriber = subscribersService.get_subscriber_by(telephone, id);
        if (subscriber!=null){
            model.addAttribute("name",subscriber.getName_abonent());
            model.addAttribute("telephone",subscriber.getTelephone_num_abonent());
            model.addAttribute("adres",subscriber.getAdres_abonent());
            model.addAttribute("date",subscriber.getCreation_date());
            return "subscriber_info";

        }else return "redirect:/api/v1/add_subscriber";

    }

    //http://localhost:8080/api/v1/add_subscriber

    @GetMapping("/add_subscriber")
    public String get_view_subsriber(){
        return "create_subscriber";
    }

    @PostMapping("/add_subscriber")
    public String create_subscriber(@RequestParam String name, @RequestParam String telephone, @RequestParam String adres
            , @RequestParam String date, Model model){

        Subscribers subscriber=new Subscribers(name,adres,telephone,date);

        subscribersService.saveSubscriber(subscriber);

        model.addAttribute("name",subscriber.getName_abonent());
        model.addAttribute("telephone",subscriber.getTelephone_num_abonent());
        model.addAttribute("adres",subscriber.getAdres_abonent());
        model.addAttribute("date",subscriber.getCreation_date());

        return "create_subscriber";
    }

}
