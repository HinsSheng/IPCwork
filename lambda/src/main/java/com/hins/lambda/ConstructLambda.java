package com.hins.lambda;

public class ConstructLambda {
    public static void main(String[] args) {
        ItemBlankCreator creator1 = () -> new Item();
        Item item01 = creator1.getItem();
        System.out.println(item01);
        System.out.println("==================分割线=====================");
        ItemBlankCreator creator2 = Item::new;
        Item item02 = creator2.getItem();
        System.out.println(item02);
        System.out.println("==================分割线=====================");
        ItemParamCreator paramCreator = Item::new;
        Item item03 = paramCreator.getItem(05,"鞋子",800.0);
        System.out.println(item03);
    }

}

@FunctionalInterface
interface ItemBlankCreator {
    Item getItem();
}

@FunctionalInterface
interface ItemParamCreator {
    Item getItem(Integer id, String name, Double price);
}