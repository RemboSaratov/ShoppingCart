package pro.sky.example.shoppingcartscope;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@Component
@SessionScope

public class ShoppingCart {
    private final Set<Integer> product = new HashSet<>();

    public void addProduct(List<Integer> productIdentifier) {
        product.addAll(productIdentifier);
    }

    public Collection<Integer> getShoppingCart () {
        return Collections.unmodifiableCollection(product);
    }
}
