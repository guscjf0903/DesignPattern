package org.example;


interface PhoneFactory{
    default Phone orderPhone(){
        Phone phone = createPhone();
        phone.complete();
        return phone;
    }
    Phone createPhone();
}
class IPhoneFactory implements PhoneFactory{
    @Override
    public Phone createPhone(){
        return new IPhone();
    }
}
class AndroidPhoneFactory implements PhoneFactory{
    @Override
    public Phone createPhone(){
        return new AndriodPhone();
    }
}


interface Phone{
    void complete();
    void call();
}

class IPhone implements Phone{
    @Override
    public void complete(){ System.out.println("아이폰 완성");}
    @Override
    public void call(){ System.out.println("아이폰으로 전화함");}
}

class AndriodPhone implements Phone{
    @Override
    public void complete(){ System.out.println("안드로이드 완성");}
    @Override
    public void call(){ System.out.println("안드로이드로 전화함");}
}



public class Main {
    public static void main(String[] args) {
        IPhoneFactory iPhoneFactory = new IPhoneFactory();
        Phone phone7 = iPhoneFactory.orderPhone();
        phone7.call();

        AndroidPhoneFactory androidPhoneFactory = new AndroidPhoneFactory();
        Phone androidphone = androidPhoneFactory.createPhone();
        androidphone.call();
    }
}
