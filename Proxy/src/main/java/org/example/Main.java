package org.example;

interface Image{
    public void displayImage();
}
class Real_Image implements Image{
    private String fimeName;
    public Real_Image(String fileName){
        this.fimeName = fileName;
    }
    @Override
    public void displayImage(){
        System.out.println("보여주기 " + fimeName);
    }
}

class Proxy_Image implements Image{
    private String fileName;
    private Real_Image realImage; //Real_Image 객체 생성 부분

    public Proxy_Image(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void displayImage(){
        if(realImage == null){
            realImage = new Real_Image(fileName);
        }
        realImage.displayImage();
    }
}


public class Main {
    public static void main(String[] args) {
        Image image1 = new Proxy_Image("test1.jpg");
        Image image2 = new Proxy_Image("test2.jpg");

        image1.displayImage();
        image2.displayImage();
    }
}
