package pro.sky.example.shoppingcartscope.Service;

import java.util.Collection;
import java.util.List;

public interface ShopService {
    public void add(List<Integer> productIdentifier);

    public Collection<Integer> get();
}

