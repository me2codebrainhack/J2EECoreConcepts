package module3._isA_hasA_relation;

public class Car {

    private Engine engine;

    public Car(Engine engine){
        this.engine = engine;
    }

    public void start(){
        System.out.println("Start the Vehicle");
    }
    public void stop(){
        System.out.println("Stop the Vehicle");
    }

    public String getEngine (){
        return engine.getEngine();
    }

    public void setEngine(String engine){
        this.engine.setEngine(engine);
    }

}
