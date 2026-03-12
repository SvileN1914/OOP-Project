import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StudentSystem system = new StudentSystem();

        while(true){

            String input = scanner.nextLine();
            String[] command = input.split(" ");

            if(command[0].equals("enroll")){

                system.enroll(
                        command[4],
                        command[1],
                        command[2],
                        1,
                        Integer.parseInt(command[3])
                );

            }

            else if(command[0].equals("print")){
                system.print(command[1]);
            }

            else if(command[0].equals("exit")){
                break;
            }
        }
    }
}