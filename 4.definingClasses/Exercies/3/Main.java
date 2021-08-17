package SpeedRacing;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());

        LinkedHashMap<String,Car>cars=new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String []input=scanner.nextLine().split("\\s+");
            String model=input[0];
            double fuel=Double.parseDouble(input[1]);
            double consumption=Double.parseDouble(input[2]);

            Car car=new Car(model,fuel,consumption);
            cars.put(model,car);
        }
        String next=scanner.nextLine();
        while (!next.equals("End")){
            //"Drive <CarModel>  <amountOfKm>
            String model=next.split("\\s+")[1];
            int distanceToDrive=Integer.parseInt(next.split("\\s+")[2]);
            //model->Car
            Car carToDrive=cars.get(model);

            if(!carToDrive.drive(distanceToDrive)){
                //ако не можем да караме
                System.out.println("Insufficient fuel for the drive");
            }

            next=scanner.nextLine();
        }
        for (Car car:cars.values()){//ще ми вземе всички
            //AudiA4 17.60 18
            // "<Model> <fuelAmount>  <distanceTraveled>"
            System.out.println(car.toString());
        }

    }
}
