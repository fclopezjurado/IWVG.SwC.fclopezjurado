package es.upm.miw.swc;

import java.util.ArrayList;
import java.util.List;

public class DecimalCollection {
    private List<Double> collection;

    public DecimalCollection() {
        this.collection = new ArrayList<Double>();
    } 

    public void add(double value) {
        this.collection.add(value);
    }

    public int size() {
        return this.collection.size();
    }

    public double sum() {
        double sum = 0;
        for (double item : this.collection) {
            sum += item;
        }
        return sum;
    }

    public double higher() {
        double higher = Double.NEGATIVE_INFINITY;
        for (double item : this.collection) {
            if (item > higher)
                higher = item;
        }
        return higher;
    }
    
    public void prod(double numberForProducts) {
        for (int i=0 ; i< collection.size() ; i++) {
            collection.set(i, this.collection.get(i)*numberForProducts);
        }
    }
    
}
