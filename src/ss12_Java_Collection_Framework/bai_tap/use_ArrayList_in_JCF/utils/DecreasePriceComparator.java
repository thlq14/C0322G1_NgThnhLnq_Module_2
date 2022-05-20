package ss12_Java_Collection_Framework.bai_tap.use_ArrayList_in_JCF.utils;

import ss12_Java_Collection_Framework.bai_tap.use_ArrayList_in_JCF.model.Product;

import java.util.Comparator;

public class DecreasePriceComparator implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        if (o1.getPrice() < o2.getPrice()) {
            return 1;
        } else if (o1.getPrice() > o2.getPrice()) {
            return -1;
        } else {
            return 1;
        }
    }
}
