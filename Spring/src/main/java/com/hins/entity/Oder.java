package com.hins.entity;

import java.util.List;

public class Oder {
    private Integer oderID;
    private Item item;
    private List<String> any;

    public List<String> getAny() {
        return any;
    }

    public void setAny(List<String> any) {
        this.any = any;
    }

    @Override
    public String toString() {
        return "Oder{" +
                "oderID=" + oderID +
                ", item=" + item +
                ", any=" + any +
                '}';
    }

    public Integer getOderID() {
        return oderID;
    }

    public void setOderID(Integer oderID) {
        this.oderID = oderID;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Oder() {
    }
}
