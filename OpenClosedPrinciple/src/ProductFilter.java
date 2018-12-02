//This class violates the OCP as we will keep on modifying this class as and when new filters are requested in the future

import java.util.List;
import java.util.stream.Stream;

class ProductFilter{
    public Stream<Product> filterByColor(List<Product> products, Color color){
        return products.stream().filter(p -> p.color == color);
    }

    public Stream<Product> filterBySize(List<Product> products, Size size){
        return products.stream().filter(p -> p.size == size);
    }

    public Stream<Product> filterBySizeAndColor(List<Product> products, Color color, Size size){
        return products.stream().filter(p -> p.color == color && p.size == size);
    }
}