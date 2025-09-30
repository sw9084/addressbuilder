import  java.util.Scanner;
public class AddressBuilder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder customersInfo = new StringBuilder();

        //Full Name

        System.out.println("Full Name: ");
        String fullName = scanner.nextLine();
        customersInfo.append(fullName).append("\n");

        //Billing Address

        System.out.println("Enter Billing Address:");
        String billingAddress = scanner.nextLine();
        System.out.print("Street:");
        String billingStreet = scanner.nextLine();
        System.out.print("City:");
        String billingCity = scanner.nextLine();
        System.out.print("State");
        String billingState = scanner.nextLine();
        System.out.print("Zip code");
        String billingZip = scanner.nextLine();

        customersInfo.append("BillingAddress:\n")
                     .append(billingStreet).append("\n")
                     .append(billingCity).append("\n")
                     .append(billingState).append("\n")
                     .append(billingZip).append("\n");

        // Shipping Address
        System.out.println("Enter shipping Address:");
        System.out.print("Street:");
        String ShippingStreet = scanner.nextLine();
        System.out.print("City:");
        String ShippingCity = scanner.nextLine();
        System.out.print("State:");
        String ShippingState = scanner.nextLine();
        System.out.print("Zipcode");
        String ShippingZip = scanner.nextLine();

        customersInfo.append("Shipping Address:\n")
                    .append(ShippingStreet).append("\n")
                    .append(ShippingCity).append("\n")
                    .append(ShippingState).append("\n")
                    .append(ShippingZip).append("\n");

        // Display customer Info

        System.out.println("\n---Customer Information ---");
        System.out.println(customersInfo.toString());

        scanner.close();


    }
}




