import java.util.Scanner; 
public class Atm{ 
    public static void main(String args[] ) { 
        int Pin=2252;
        int balance = 100000, withdraw, Pinchange;
        Scanner sc = new Scanner(System.in);    
        while(true){  
            System.out.println("welcome to axis bank");  
            System.out.println("Choose 1 for withdraw");  
            System.out.println("Choose 2 for cheack balance"); 
            System.out.println("Choose 3 for pin change");
            System.out.println("Choose E");
            System.out.print("Choose the operation you want to perform:"); 
            int choice = sc.nextInt();  
            switch(choice) {  
                case 1:  
                   System.out.print("Enter money to be withdrawn:"); 
                   withdraw = sc.nextInt();
                    if(Pin==2252){
                        if(balance >= withdraw){  
                            balance = balance - withdraw;  
                             System.out.println("Please collect your money");  
                        }else{ 
                             System.out.println("Insufficient Balance");  
                        }  
                        System.out.println("");
                        }else{
                             System.out.println("wrong pin");
                        }  
                    break;
                case 2:    
                    System.out.println("Balance: "+balance);  
                    System.out.println("");  
                    break; 
                case 3:
                    System.out.println("change the pin number");
                    System.out.println("");
                    Pinchange = sc.nextInt();
                    break;
                case 4:
                    System.exit(0);  
                }
            }
        }
    }