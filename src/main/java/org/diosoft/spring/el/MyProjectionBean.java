package org.diosoft.spring.el;

import java.math.BigDecimal;
import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.ArrayList;
import java.util.List;

public class MyProjectionBean {

    private final List<SimpleImmutableEntry> specialCollection = new ArrayList<>();
    private BigDecimal price;

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void add(SimpleImmutableEntry entry){
        specialCollection.add(entry);
    }

    public List<SimpleImmutableEntry> getSpecialCollection() {
        return specialCollection;
    }
}
