import java.util.Scanner;


public class ToyotaTrims {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("What vehicle do you have?");

        String vehicle = scanner.nextLine().toLowerCase();

        if(vehicle.contains("camry")){
            System.out.println("What trim is your Toyota Camry?");
        } else if(vehicle.contains("civic")){
            System.out.println("What trim is your Honda Civic?");

        }else {
            System.out.println("Don't think that one is in our system of vehicles. Try again!");

        }




        //need to be able to allow user to type in vehicle name, then choose from 4 different trims




    }

}
