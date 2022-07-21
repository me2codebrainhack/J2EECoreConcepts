package module3._isA_hasA_relation;

public class Lincoln extends Car{

    private String color;

    public Lincoln(Engine engine) {
        super(engine);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void lincolnInfo(){
        System.out.println("Lincoln color is "+getColor());
        System.out.println("lincoln engine is "+getEngine());
    }
}
