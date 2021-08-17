import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //3
        //Chevrolet Impala 390
        //Luskava Jigula 500
        //Golqma Kola 49
        int n = Integer.parseInt(scanner.nextLine());
        Car car= new Car();
        for (int i = 0; i < n ; i++) {
            String [] parts = scanner.nextLine().split("\\s+");
            car.setMake(parts[0]);
            car.setModel(parts[1]);
            car.setHorsePower(Integer.parseInt(parts[2]));
            System.out.print(car.getInfo());


        }

    }

}
