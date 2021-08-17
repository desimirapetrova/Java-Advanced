import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NullPointerException {
        Scanner scanner = new Scanner(System.in);
        //3
        //Chevrolet Impala 390
        //Luskava Jigula 500
        //Golqma Kola 49
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] parts = scanner.nextLine().split("\\s+");
            Car car;
            //String make;
            //    String model="unknown";
            //    int horsePower=0;
            String make = parts[0];
            if (parts.length == 3) {
                String model = parts[1];
                int horsePower = Integer.parseInt(parts[2]);
                car = new Car(make, model, horsePower);
            } else if (parts.length == 2) {
                try {
                    int horsePower = Integer.parseInt(parts[1]);
                    car = new Car(make, horsePower);

                } catch (NumberFormatException e) {
                    String model = parts[1];
                    car = new Car(make, model);

                }
            }else{
                car=new Car(make);
            }
            System.out.print(car.toString());


        }

    }

}
