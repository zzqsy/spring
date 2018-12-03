package demo;
public class JuiceMaker {

    // 唯一关联了一个 Source 对象
    private Source source = null;

    public void setSource(Source source){
        this.source=source;
    }

    public Source getSource(){
        return source;
    }
    public String makeJuice() {
        String juice = "我点了一杯" + source.getFruit() + source.getSugar() + source.getSize();
        System.out.println("this is test AOP");
        return juice;
    }
}