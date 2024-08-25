package pro.sky.example.shoppingcartscope;

import java.util.Collection;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.example.shoppingcartscope.Service.ShopService;

@RestController
@RequestMapping("/order")

public class ShopController {

    public final ShopService shopService;

    public ShopController(ShopService shopService) {
        this.shopService = shopService;
    }


    @GetMapping("/add")
    public void add (@RequestParam List<Integer> productIdentifier) {
        shopService.add(productIdentifier);
    }

    @GetMapping("/get")
    public Collection<Integer> get () {
        return shopService.get();
    }
}