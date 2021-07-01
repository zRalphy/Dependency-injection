package pl.javasolution.implementation;

import pl.javasolution.api.IPizza;

public class MargaritaPizza implements IPizza{
    private int price;
    private String name;

    public MargaritaPizza(int price, String name){
        super();
        this.price = price;
        this.name = name;
    }
    public int getPrice(){
        // TODO Auto - generated method stub
        return price;
    }

    public String getName(){
        // TODO Auto - generated method stub
        return name;
    }
}
