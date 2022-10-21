package practiceoct18;

import java.util.Scanner;

class MainAssociate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int associateid, days;
        String associateName;

        System.out.println("Enter the associate id:");
        associateid = scanner.nextInt();

        System.out.println("Enter the associate name:");
        associateName = scanner.next();

        System.out.println("Enter the number of days:");
        days = scanner.nextInt();

        if (days <= 0) {
            System.out.println("Invalid Input");
        } else {
            Associate associate = new Associate(days, associateName, associateName);
            associate.setAssociateid(associateid);
            associate.setAssociateName(associateName);
            associate.trackAssociateStatus(days);

            System.out.println("The associate " + associate.getAssociateName() + " work status:" + associate.getWorkStatus());
        }
    }
}

