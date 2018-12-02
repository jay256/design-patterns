import java.util.Arrays;
import java.util.List;

class Demo{
    public static void main(String[] args) {
        Product apple = new Product("Apple", Color.GREEN, Size.SMALL);
        Product shirt = new Product("Shirt", Color.RED, Size.MEDIUM);
        Product house = new Product("House", Color.BLUE, Size.HUGE);

        List<Product> products = Arrays.asList(apple, shirt, house);

        ProductFilter productFilter = new ProductFilter();

        System.out.println("Green products (old): ");
        productFilter.filterByColor(products, Color.GREEN).forEach(p -> System.out.println(" - " + p.name + " is green"));

        BetterFilter betterFilter = new BetterFilter();

        System.out.println("Green products (new): ");
        betterFilter.filter(products, new ColorSpecification(Color.GREEN)).forEach(p -> System.out.println(" - " + p.name + " is green"));

        System.out.println("Blue and Huge products (new): ");
        betterFilter.filter(products, new AndSpecification<Product>(
                new ColorSpecification(Color.BLUE), new SizeSpecification(Size.HUGE)))
                .forEach(p -> System.out.println(" - " + p.name + " is huge and blue"));

    }
}