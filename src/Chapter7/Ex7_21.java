package Chapter7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

//7.21. Известны данные о стоимости каждого товара из группы. Найти общую стои-
//        мость тех товаров, которые стоят дороже 1000 рублей (количество таких то-
//        варов неизвестно).
public class Ex7_21 {
    private String name;
    private double price;

    public Ex7_21(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Ex7_21{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public static void main(String[] args) {
        List<Ex7_21> drinks = new ArrayList<>();
        drinks.add(new Ex7_21("coca-cola", 1230.32));
        drinks.add(new Ex7_21("pepsi", 1023.32));
        drinks.add(new Ex7_21("fanta", 923.32));
        drinks.add(new Ex7_21("Sprite", 830.32));

        long result = drinks.stream().filter(e -> e.getPrice() > 1000).peek(System.out::println).count();

        System.out.println("Всего отобрано элементов: "
                .concat(String.valueOf(result))
                .concat(" из ")
                .concat(String.valueOf(drinks.size())));
    }
}


