package org.example;
interface Frame{
    void shape();
}
class AvanteFrame implements Frame{
    @Override
    public void shape(){
        System.out.println("this is avante shape");
    }
}

class SonataFrame implements Frame{
    @Override
    public void shape(){
        System.out.println("this is Sonata shape");
    }
}

interface Wheel{
    void size();
}

class AvanteWheel implements Wheel{
    @Override
    public void size(){
        System.out.println("this is avante wheel size");
    }
}

class SonataWheel implements Wheel{
    @Override
    public void size(){
        System.out.println("this is sonata wheel size");
    }
}


interface CarFactory{
    Frame createFrame();
    Wheel createWheel();
}

class AvanteFactory implements CarFactory{
    @Override
    public Frame createFrame(){
        return new AvanteFrame();
    }
    @Override
    public Wheel createWheel(){
        return new AvanteWheel();
    }
}

class SonataFactory implements CarFactory{
    @Override
    public Frame createFrame(){
        return new SonataFrame();
    }
    @Override
    public Wheel createWheel(){
        return new SonataWheel();
    }
}

class Car{
    private Frame frame;
    private Wheel wheel;

    public Car(Frame frame, Wheel wheel){
        this.frame = frame;
        this.wheel = wheel;
    }
    public Frame getFrame(){
        return frame;
    }
    public Wheel getWheel(){
        return wheel;
    }
}


public class Main {
    public static void main(String[] args) {
        CarFactory avanteFactory = new AvanteFactory();
        Car avante = new Car(avanteFactory.createFrame(),avanteFactory.createWheel());
        avante.getFrame().shape();
        avante.getWheel().size();

        System.out.println("================================");

        CarFactory sonataFactory = new SonataFactory();
        Car sonata = new Car(sonataFactory.createFrame(), sonataFactory.createWheel());
        sonata.getFrame().shape();
        sonata.getWheel().size();
    }
}

