package CarSalesman;

public class Engine {
    private String model;
    private int power;

    private int displacement;
    private String efficiency;
    //1nachin-model,power
    //2nachin-model,power,displ
    //3nachin-model,power,eff
    //4nachin-model,power,displacement,efficiency

    public Engine(String model,int power){
        this.model=model;
        this.power=power;
        this.displacement=0;
        this.efficiency="n/a";
    }
    public Engine(String model,int power,int displacement){
        this(model, power);
        this.displacement=displacement;
        this.efficiency="n/a";
    }
    public Engine(String model,int power,String efficiency){
        this(model, power);
        this.efficiency=efficiency;
        this.displacement=0;

    }
    public Engine(String model,int power,int displacement,String efficiency){
        this(model, power);
        this.displacement=displacement;
        this.efficiency=efficiency;
    }
    public String getModel(){
        return this.model;
    }
    @Override
    public String toString(){
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append("Power: "+this.power+"\n");
        if(this.displacement==0){
            stringBuilder.append("Displacement: n/a"+"\n");
        }else {
            stringBuilder.append("Displacement: "+this.displacement+"\n");
        }
        stringBuilder.append("Efficiency: "+this.efficiency);
        return stringBuilder.toString();

    }
}
