package cart.cartWH.controller;

import cart.cartWH.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
@RequestMapping("/store/order")
public class ItemsController {

    @Autowired
    private final CartService cartService;

    public ItemsController(CartService cartService) {
        this.cartService = cartService;
    }


    @GetMapping("/add")
    public List<Integer> addItem(@RequestParam List<Integer> ids) {
        return cartService.addItem(ids);
    }

    @GetMapping("/get")
    public List<Integer> getItems() {
        return cartService.getItems();
    }
}
