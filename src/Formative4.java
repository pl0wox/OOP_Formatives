import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.*;

public class Formative4 {
    public static void main(String[] args) {

            menu();
            collections(choice());

    }

    static void menu(){
        System.out.println("============================================");
        System.out.println("  F O R M A T I V E  4 " );
        System.out.println("============================================");
        System.out.println("[1] Create Array List dealing with numbers");
        System.out.println("[2] Create Stack List");
        System.out.println("[3] Create Queue List\n");
    }
    static int choice(){
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your choice");
        int x = in.nextInt();
        return x;

    }

    static void collections(int c){
        switch (c){
            case 1:
                boolean retry = true;
                do {
                    List<String> arrayL = new ArrayList();
                    Scanner in = new Scanner(System.in);
                    boolean running_Elements = true;
                    int num = 0;

                    while(running_Elements){
                        System.out.println("Enter number of elements");
                        if(in.hasNextInt()){
                            num = in.nextInt();
                            running_Elements = false;
                        }
                        else{
                            System.out.println("Please enter numerical values only");
                            in.next();
                            running_Elements = true;
                        }
                    }

                    boolean running_EnterElements = true;
                    for (int i = 0; i < num; i++) {
                        while (running_EnterElements) {
                        System.out.print("Enter #" + (i + 1) + " number:  ");
                        String y = in.next();

                            if (y.matches("[a-zA-Z]")) {
                                System.out.println("INVALID!");
                                running_EnterElements = true;
                            } else {
                                arrayL.add(y);
                                running_EnterElements = false;
                            }
                        }
                    }
                    Iterator itr = arrayL.iterator();   //create iterator
                    while (itr.hasNext()) {
                        System.out.println(itr.next());
                    }
                    System.out.println("Do you want to retry again? [y/n] : ");
                    String z = in.next();
                    if(z.matches("y") || z.matches("Y")) {
                        retry = true;
                    }
                    else if(z.matches("n") || z.matches("N")){
                        retry = false;
                    }
                    else{
                        System.out.println("Please Enter a valid input");
                        retry = true;
                    }

                }while(retry == true);

                break;

                case 2:
                    break;

                    case 3:
                        break;
        }
    }
}
