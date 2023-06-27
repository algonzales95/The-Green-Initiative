import java.util.*; 

public class GreenInitiative { 

    public static void main(String[] args) { 
 
        /* 
         * This program will help to promote and monitor 
         * environmentally friendly practices in an organization. 
         */ 
 
        int choice; 
        Scanner scanner = new Scanner(System.in); 
 
        do { 
 
            System.out.println("\nGreen Initiative Menu"); 
            System.out.println("--------------------"); 
            System.out.println("1. Monitor Energy Usage"); 
            System.out.println("2. Monitor Waste Output"); 
            System.out.println("3. Promote Green Practices"); 
            System.out.println("4. Quit"); 
            System.out.println("--------------------"); 
            System.out.print("Enter your choice: "); 
            choice = scanner.nextInt(); 
 
            switch(choice) { 
                case 1: // Monitor Energy Usage  
                    monitorEnergyUsage(); 
                    break; 
                case 2: // Monitor Waste Output 
                    monitorWasteOutput(); 
                    break; 
                case 3: // Promote Green Practices 
                    promoteGreenPractices(); 
                    break; 
                case 4: // Quit 
                    System.out.println("\nThank you for using Green Initiative!"); 
                    break; 
                default: 
                    System.out.println("\nInvalid Choice. Please choose again."); 
            } 
        } while(choice != 4); 
    } 
 
    // Method to monitor energy usage 
    public static void monitorEnergyUsage() { 
        System.out.println("Monitoring energy usage..."); 
        System.out.println("Implementing usage tracking for all energy consuming devices..."); 
        System.out.println("Setting limits to energy consuming devices..."); 
        System.out.println("Reducing energy consumption..."); 
    } 
 
    // Method to monitor waste output 
    public static void monitorWasteOutput() { 
        System.out.println("Reducing waste output..."); 
        System.out.println("Setting limits to non-essential wastes..."); 
        System.out.println("Implementing waste tracking system..."); 
        System.out.println("Providing efficient waste disposal system..."); 
    } 
 
    // Method to promote green practices 
    public static void promoteGreenPractices() { 
        System.out.println("Creating awareness about environmental protection..."); 
        System.out.println("Organizing seminars and workshops..."); 
        System.out.println("Encouraging use of renewable resources..."); 
        System.out.println("Rewarding green initiatives..."); 
    } 
}