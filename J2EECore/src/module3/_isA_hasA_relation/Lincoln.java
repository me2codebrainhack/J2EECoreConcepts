package module3._isA_hasA_relation;

public class Lincoln extends Car{
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private Engine egne;

    public Engine getEgne() {
        return egne;
    }

    public void setEgne(Engine egne) {
        this.egne = egne;
    }

    public void lincolnInfo(){
        System.out.println("Lincoln color is "+getColor());
        System.out.println("lincoln engine is "+getEgne().getEngine());
    }
}
