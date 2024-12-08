package cart.cartWH.service;

import cart.cartWH.component.Cart;
import org.springframework.stereotype.Service;


import java.util.List;

@Service

public class CartServiceImpl implements CartService {

    private final Cart cart;

    public CartServiceImpl(Cart cart) {
        this.cart = cart;
    }


    @Override
    public List<Integer> addItem(List<Integer> itemId) {

        return cart.addItem(itemId);
    }

    @Override
    public List<Integer> getItems() {
        return cart.getItems();
    }
}
