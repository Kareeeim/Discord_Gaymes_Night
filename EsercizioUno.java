import java.util.Scanner;

public class EsercizioUno {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int choice;
        int totalAge = 0;                               // inizializzazione variabili
        int usersCount = 0;

        System.out.println("<--- PROZAC+ --->");        
                                                                            
        do {                                                                //menù        
            System.out.println("\n1. Inserisci dati utente.");
            System.out.println("2. Esci dal programma.");               
            System.out.print("Scegli [1/2]: ");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {                                               
                
                case 1: 
                System.out.print("Inserisci il nome: ");
                    String name = scanner.nextLine();                           //inserimento dati 

                System.out.print("Inserire l'età: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();

            System.out.println("\nBenvenuto" + name.toUpperCase() + "!");       

            if (age < 18) {
                System.out.println("Utente minorenne.");

            } else {                                                                    //lettura età
                System.out.println("Utente maggiorenne.");
            }
                

                totalAge += age;
                usersCount ++;                     //counter utenti e età per media finale
                break;
                    
        
            case 2:
                System.out.println("\nChiusura programma...");         //chiusura programma                      
                break;

            default:                                                            
                System.out.println("Leggi meglio le istruzioni");       //in caso qualcuno non sappia leggere le istruzioni
                break;
            
            }

        
        } while (choice != 2);                                                                  

            if (usersCount > 0) {
                double avgAge = (double) totalAge / usersCount;                     // utilizzo variabili locali e non per fare il conteggio e la media 

                System.out.println("PENSAVI avessi finito, e invece...");
                System.out.println("\nUtenti inseriti: " + usersCount);
                System.out.println("Età media utenti: " + avgAge);
            
            } else {
                System.out.println("\nBravo non hai fatto assolutamente niente");  //facepalm.exe
            }

        scanner.close();
        System.out.println("\nSto impazzendo dovrei andare a dormire ;) ");    //pain.exe


    }

}
    

