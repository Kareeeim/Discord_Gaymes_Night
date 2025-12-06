import java.util.Scanner;

public class EsercizioTre {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //totali
        double subtot = 0.0;
        double IVAtot = 0.0;
        double tot = 0.0;
        //pagamento
        String payment = "";
        double importpay = 0.0;
        double change = 0.0;
        // inserimento prodotti
        int prodCounter = 0;


        System.out.println("===================");
        System.out.println("       MDMA       ");
        System.out.println("===================");

        String answer;
        boolean keepgoing;

        //ciclo inserimento prodotti
        do{
            System.out.print("\nVuoi inserire un prodotto? [s/n]: ");
            answer = scanner.nextLine();

            if(answer.equalsIgnoreCase("s")) {
                prodCounter++;
            

            System.out.print("Nome prodotto " + prodCounter + ": ");
            String prodName = scanner.nextLine();
        //calcolo prezzo netto/lordo
            System.out.print("Inserire prezzo al netto di IVA: $");
            double unitPrice = scanner.nextDouble();
            scanner.nextLine();
            
            while(unitPrice < 0) {
                System.out.print("Non siamo qui per fare beneficenza, ora paga: $");
                unitPrice = scanner.nextDouble();
                scanner.nextLine();
            }

        //quanti prodotti?
            System.out.print("Quante unità?: ");
            int units = scanner.nextInt();
            scanner.nextLine();

            while(units < 0) {
                System.out.print("Ma sei scemo? Riprova: ");
                units = scanner.nextInt();
                scanner.nextLine();
            }

        //calcoli per i prodotti
            
            double totUnitPrice = unitPrice * units;
            double IVAunit = totUnitPrice * 0.22;
            double unitIVAprice = totUnitPrice + IVAunit;

        //Sout info prodotto
            System.out.println("\nInfo del prodotto: ");
            System.out.println("===========================");
            System.out.println("Prodotto: " + prodName);
            System.out.println("Prezzo unità: $" + unitPrice);
            System.out.println("Quantità: " + units);
            System.out.println("Netto totale delle unità: " + totUnitPrice);
            System.out.println("IVA (22%): " + IVAunit);
            System.out.println("Prezzo + IVA: $" + unitIVAprice);
            System.out.println("===========================");

        //definisco le variabili globali con i risultati inseriti
            subtot += totUnitPrice;
            IVAtot += IVAunit; 
            tot += unitIVAprice;
            
                keepgoing = true;
        
            }   else if(answer.equalsIgnoreCase("n")) {
                    keepgoing = false;
            }   else {
                System.out.println("Leggi meglio bamboccione, o premi 's' o 'n'.");
                keepgoing = true;
            
            }   
            
        } while(keepgoing);
            
        //controllo prodotti inseriti
                if(prodCounter == 0) {
                    System.out.println("\nMi stai prendendo in giro?");
                    
                    return;
                } 

        //Stampa subtot, IVA e tot + richiesta pagamento
            System.out.println("\n===========================");
            System.out.println("COS'HAI ACQUISTATO?");
            System.out.println("===========================");
            System.out.println("Numero prodotti: " + prodCounter);
            System.out.println("---------------------------");
            System.out.println("Subtotale al netto di IVA(22%): $" + subtot);
            System.out.println("IVA totale: $" + IVAtot);
            System.out.println("IMPORTO TOTALE DA PAGARE: $" + tot);
            System.out.println("===========================");

            
            System.out.print("\nSeleziona il metodo di pagamento: (cash/card): ");
            payment = scanner.nextLine().toLowerCase();

        //in caso di errore nel pagamento
            while(!payment.equals("cash") && !payment.equals("card")) {
                System.out.print("Non sai scrivere? Ho detto 'cash' o 'card': ");
                payment = scanner.nextLine().toLowerCase();
            }

        //pagamento cash
            if(payment.equals("cash")) {
                System.out.println("Importo da pagare: $" + tot);
                System.out.print("Importo pagato: $");
                importpay = scanner.nextDouble();
                scanner.nextLine();

                while(importpay < tot) {
                    double missing = tot - importpay;
                    System.out.println("Importo insufficente, mancano $" + missing);
                    
                    System.out.print("Importo pagato: $");
                    importpay = scanner.nextDouble();
                    scanner.nextLine();
                }
        //resto
            change = importpay - tot;
                if(change > 0) {
                    System.out.println("Resto: $" + change);
                
                } else {
                    System.out.println("Pagamento confermato.");
                } 
        //pagamento con carta        
            } else{
                System.out.println("Pagamento con carta...");
                System.out.println("\nPagamento approvato, tanto è una simulazione");
            }
        //Sout ricevuta
            System.out.println("\n===========================");
            System.out.println("RICEVUTA FISCALE");
            System.out.println("===========================");
            System.out.println("\nNumero prodotti acquistati: " + prodCounter);
            System.out.println("\nSUBTOTALE: $" + subtot);
            System.out.println("\nIVA 22%: " + IVAtot);
            System.out.println("\nTOTALE:" + tot);
            System.out.println("---------------------------");
            System.out.println("METODO DI PAGAMENTO: " + payment.toUpperCase());

             if(payment.equals("cash")) {
                System.out.println("IMPORTO PAGATO: $" + importpay);
                if(change > 0) {
                    System.out.println("RESTO: $" + change);
            }
        }
        scanner.close();
    }
}
        




             
     
             

            
            
            
            
            
            

            
                
            
            


                
                
                
                
                
