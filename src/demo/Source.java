package demo;

public class Source {
    private String fruit;   // 类型
    private String sugar;   // 糖分描述
    private String size;    // 大小杯
    public void setFruit(String fruit){
        System.out.println("this setfruit");
        this.fruit=fruit;
    }

    public void setSugar(String sugar){
        System.out.println("this setsugar");
        this.sugar=sugar;
    }

    public void setSize(String size){
        System.out.println("this setsize");
        this.size=size;
    }

    public String getFruit(){
        System.out.println("this getfruit");
        return fruit;
    }

    public String getSugar(){
        System.out.println("this getsugar");
        return sugar;
    }

    public String getSize(){
        System.out.println("this getsize");
        return size;
    }
}
