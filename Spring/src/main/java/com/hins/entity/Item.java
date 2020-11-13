package com.hins.entity;

public class Item {
    private Integer itemId;
    private String tiemName;
    private Double itemPrice;


    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public String getTiemName() {
        return tiemName;
    }

    public void setTiemName(String tiemName) {
        this.tiemName = tiemName;
    }

    public Double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(Double itemPrice) {
        this.itemPrice = itemPrice;
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemId=" + itemId +
                ", tiemName='" + tiemName + '\'' +
                ", itemPrice=" + itemPrice +
                '}';
    }

    public Item() {
    }

    public Item(Integer itemId, String tiemName, Double itemPrice) {
        this.itemId = itemId;
        this.tiemName = tiemName;
        this.itemPrice = itemPrice;
    }
}
