public class Car {
    //    • Make: String
    //    • Model: String
    //    • Horse Power: int
    String make;
    String model;
    int horsePower;

    public String getMake() {
        return this.make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getHorsePower() {
        return this.horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }
    public String getInfo(){
        return String.format("The car is: %s %s - %d HP.%n",this.make,this.model,this.horsePower);

    }
}
