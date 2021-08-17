package CarSalesman;

public class Car {
    private String model;
    private String engineModel;

    private int wight;
    private String color;

    //1-model,engineModel
    //2-model,engineModel,weight,color
    //3-model,engineModel,weight
    //4-model,engineModel,color

    public Car(String model,String engineModel){
        this.model=model;
        this.engineModel=engineModel;
        this.wight=0;
        this.color="n/a";
    }
    public Car(String model,String engineModel,int wight,String color){
        this(model,engineModel);
        this.wight=wight;
        this.color=color;
    }
    public Car(String model,String engineModel,int wight){
        this(model,engineModel);
        this.wight=wight;
        this.color="n/a";

    }
    public Car(String model,String engineModel,String color){
        this(model,engineModel);
        this.color=color;
        this.wight=0;
    }
    public String getModel(){
        return this.model;
    }
    public String getEngineModel(){
        return this.engineModel;
    }
    public int getWight(){
        return this.wight;
    }
    public String getColor(){
        return this.color;
    }
}
