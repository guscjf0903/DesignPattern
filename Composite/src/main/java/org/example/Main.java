package org.example;
import java.util.*;
abstract class ComputerDevice {
    public abstract int getPrice();
    public abstract int getPower();
}

class KeyBoard extends ComputerDevice{
    private final int price;
    private final int power;

    public KeyBoard(int price, int power){
        this.price = price;
        this.power = power;
    }
    @Override
    public int getPrice(){
        return price;
    }
    @Override
    public int getPower(){
        return power;
    }
}

class Monitor extends ComputerDevice{
    private final int price;
    private final int power;

    public Monitor(int price, int power){
        this.price = price;
        this.power = power;
    }


    @Override
    public int getPrice() {
        return price;
    }
    @Override
    public int getPower() {
        return power;
    }
}

class Mouse extends ComputerDevice{
    private final int price;
    private final int power;

    public Mouse(int price, int power){
        this.price = price;
        this.power = power;
    }

    @Override
    public int getPrice() {
        return price;
    }
    @Override
    public int getPower() {
        return power;
    }
}

class Computer extends ComputerDevice{
    private List<ComputerDevice> components = new ArrayList<ComputerDevice>();

    public void addComponent(ComputerDevice computerDevice){
        components.add(computerDevice);
    }
    public void removeComponent(ComputerDevice computerDevice){
        components.remove(computerDevice);
    }
    @Override
    public int getPrice() {
        return components.stream().mapToInt(ComputerDevice::getPrice).sum();
    }
    @Override
    public int getPower() {
        return components.stream().mapToInt(ComputerDevice::getPower).sum();
    }

}
public class Main {
    public static void main(String[] args) {
        KeyBoard keyBoard = new KeyBoard(5,2);
        Mouse mouse = new Mouse(3,1);
        Monitor monitor = new Monitor(30,20);

        Computer computer = new Computer();
        computer.addComponent(keyBoard);
        computer.addComponent(mouse);
        computer.addComponent(monitor);

        int computerPrice = computer.getPrice();
        int computerPower = computer.getPower();

        System.out.println("컴퓨터 가격 : " + computerPrice);
        System.out.println("컴퓨터 전력 : " + computerPower);
    }


}
