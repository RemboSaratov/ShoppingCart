package pro.sky.example.shoppingcartscope.Service;

import java.util.Collection;
import java.util.List;
import org.springframework.stereotype.Service;
import pro.sky.example.shoppingcartscope.ShoppingCart;

@Service
public class ShopServiceImpl implements ShopService {

    private final ShoppingCart shoppingCart;

    public ShopServiceImpl(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }


    @Override
    public void add(List<Integer> productIdentifier) {
        shoppingCart.addProduct(productIdentifier);
    }

    @Override
    public Collection<Integer> get() {
        return shoppingCart.getShoppingCart();
    }
}