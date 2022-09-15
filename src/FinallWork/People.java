package FinallWork;

class People_1{
    private double height;
    private double weight;
    public void setHeight(double height){
        this.height = height;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }
    public void speak(){
        System.out.println("身高是" + height + " " + "体重是" + weight);
    }
}

public class People {
    public static void main(String[] args){
        People_1 p = new People_1();
        p.setHeight(1.78);
        p.setWeight(62);
        p.speak();
    }
}


