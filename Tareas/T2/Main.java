import java.util.Scanner;

public class TDA {

    public static void main(String[] args) {
        boolean active = true;
        int current = 0;
        Scanner in = new Scanner(System.in);
        boolean check = false;

        while (active) {

            switch (current) {
                case 0:

                    System.out.println("1. Create a currency");
                    System.out.println("2. Close");
                    System.out.println("");



                        int entry = in.nextInt();
                        switch (entry) {
                            case 1:
                                current = 1;
                                break;
                            case 2:
                                active = false;
                                break;
                        }
                    
                    break;

                case 1:
                    System.out.println("Name: ");
                    String name = in.next();
                    System.out.println("Amount: ");
                    int amount = in.nextInt();

                    Currency newCurrency = new Currency(name, amount);

                    for (int i = 0; i < currencyList.length; i++) {
                        if (currencyList[i] != null) {
                            if (currencyList[i].name.equalsIgnoreCase(name)) {
                                System.out.println("Currency already registered");
                                i = currencyList.length;

                            }

                        } else {
                            currencyList[i] = newCurrency;
                            i = currencyList.length;
                            if (check) {
                                current = 3;
                            } else {
                                current = 2;
                            }

                        }
                    }
                    break;
                case 2:
                    System.out.println("1. Create a currency");
                    System.out.println("2. Create a owner");
                    System.out.println("3. Close");
                    System.out.println("");

                        int entry_ = in.nextInt();
                        switch (entry_) {
                            case 1:
                                current = 1;
                                break;
                            case 2:
                                current = 4;
                                break;
                            case 3:
                                active = false;
                                break;
                        }

                    
                    break;

                case 3:
                    check = true;
                    System.out.println("1. Create a currency");
                    System.out.println("2. Create a owner");
                    System.out.println("3. Transfer");
                    System.out.println("4. Transfer from");
                    System.out.println("5. Owners report");
                    System.out.println("6. Close");
                    System.out.println("");

                        int entry__ = in.nextInt();
                        switch (entry__) {
                            case 1:
                                current = 1;
                                break;
                            case 2:
                                current = 4;
                                break;
                            case 3:
                                current = 5;
                                break;
                            case 4:
                                current = 6;
                                break;
                            case 5:
                                Currency currencyInstance = new Currency();
                                currencyInstance.report();
                                break;
                            case 6:
                                active = false;

                                break;
                        }

                    
                    break;
                case 4:
                    System.out.println("User: ");
                    String user = in.next();

                    Owner newOwner = new Owner(user);

                    for (int i = 0; i < ownerList.length; i++) {
                        if (ownerList[i] != null) {
                            if (ownerList[i].user.equalsIgnoreCase(user)) {
                                System.out.println("User already registered");
                                i = ownerList.length;

                            }

                        } else {
                            ownerList[i] = newOwner;
                            i = ownerList.length;
                            current = 3;
                        }

                    }
                    break;

                case 5:
                    System.out.println("User: ");
                    String destinatary = in.next();
                    System.out.println("Currency: ");
                    String currencySelected = in.next();
                    System.out.println("Amount: ");
                    int amountToTransfer = in.nextInt();

                    Currency currencyInstance = new Currency();
                    if (!currencyInstance.transfer(destinatary, currencySelected, amountToTransfer)) {
                        System.out.println("Transaction failed. Check your data.");
                    }
                    current = 3;

                    break;
                case 6:
                    System.out.println("User: ");
                    String user_ = in.next();
                    System.out.println("Destinatary: ");
                    String destinatary_ = in.next();
                    System.out.println("Currency: ");
                    String currencySelected_ = in.next();
                    System.out.println("Amount: ");
                    int amountToTransfer_ = in.nextInt();

                    Currency currencyInstance_ = new Currency();
                    if (!currencyInstance_.transferFrom(user_, destinatary_, currencySelected_, amountToTransfer_)) {
                        System.out.println("Transaction failed. Check your data.");
                    }
                    current = 3;

                    break;
            }

        }
    }

}
