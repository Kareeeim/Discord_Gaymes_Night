import java.util.Scanner;

public class EsercizioDue {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);                   

    //creazione array
    int[] num = new int[10];
        
        System.out.println("Inserisci 10 numeri interi: ");

        //ciclo for per inserire i valori
        for(int i = 0; i < 10; i++){
            System.out.print("BimBumBam" + (i + 1) + ": ");
                num[i] = scanner.nextInt();
                scanner.nextLine();
        }
        
        //variabili operazioni 
        int posCount = 0;
        int negCount = 0;
        int zCount = 0;
        int evenCount = 0;
        int unevCount = 0;
        int min = num[0];
        int  max = num[0];
        double sum = 0;
        
        
        //secondo ciclo for per definire le variabili 
        for(int i = 0; i < 10; i++){
            int n = num[i];

            //pos - neg - z counter
            if(n > 0){
                posCount++;
            } else if(n < 0){
                negCount++;
            } else {
                zCount++;
            }

            //even - uneven int check
            if(n % 2 == 0){
                evenCount++;
            } else {
                unevCount++;
            }

            //min - max check
            if(n < min){
                min = n;
            }
            if(n > max){
                max = n;
            }

            //utilizzo variabile somma per la media

            sum += n;
            
        }

            //la media è uguale alla somma diviso il numero di imput inserito nell'array
            double avg = sum / 10;

            
            //textwall di Sout per i risultati
            System.out.println("\n<====================>");
            System.out.println("Stats:");
            System.out.println("Positive numbers: " + posCount);
            System.out.println("Negative numbers: " + negCount);
            System.out.println("Even numbers: " + evenCount);
            System.out.println("Uneven numbers: " + unevCount);
            System.out.println("Zero counter: " + zCount);
            System.out.println("\n<====================>");
            System.out.println("Min value: " + min);
            System.out.println("Max value: " + max);
            System.out.println("Array's average value: " + avg);


            scanner.close();
        }
    }






       




