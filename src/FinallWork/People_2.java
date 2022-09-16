package FinallWork;

class People_2 {
    private double height;
    protected double weight;

    public People_2(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }
    protected void speak(String say) {
        System.out.println(say);
    }
    public double setHeight() {
        return height;
    }

    public double setWeight() {
        return weight;
    }
}

class Example {
    public static void main(String[] args) {
        People_2 p = new People_2(1.7, 62);
        p.speak("你是个人");
        System.out.println("身高是" + p.setHeight() + " " + "体重是" + p.setWeight());
    }
}
