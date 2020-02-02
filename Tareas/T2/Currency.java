public class Currency {

    String name;
    int amount;

    public static Currency currencyList[] = new Currency[5];
    public static Owner ownerList[] = new Owner[5];

    public Currency(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    public Currency() {
    }

    public boolean transfer(String user, String currencyName, int amount) {
        boolean found = false;

        for (int i = 0; i < ownerList.length; i++) {
            if (ownerList[i] != null) {
                if (ownerList[i].user.equalsIgnoreCase(user)) {
                    for (int j = 0; j < currencyList.length; j++) {
                        if (currencyList[j] != null) {
                            if (currencyList[j].name.equalsIgnoreCase(currencyName) && (currencyList[j].amount - amount) >= 0) {
                                for (int k = 0; k < ownerList[i].account.length; k++) {
                                    if (ownerList[i].account[k] != null) {
                                        if (ownerList[i].account[k].name.equalsIgnoreCase(currencyName)) {
                                            ownerList[i].account[k].amount += amount;
                                            currencyList[j].amount -= amount;
                                            found = true;
                                            k = ownerList[i].account.length - 1;

                                        }
                                    } else {
                                        if (!found) {
                                            Currency currencyInstance = new Currency(currencyName, amount);
                                            ownerList[i].account[k] = currencyInstance;
                                            currencyList[j].amount -= amount;
                                            found = true;
                                            k = ownerList[i].account.length - 1;
                                        }

                                    }
                                }
                                j = currencyList.length - 1;
                                i = ownerList.length - 1;
                            }
                        }
                    }
                }
            }
        }
        return found;
    }

    public boolean transferFrom(String user, String destinatary, String currencyName, int amount) {
        boolean found = false;

        for (int i = 0; i < ownerList.length; i++) {
            if (ownerList[i] != null) {
                if (ownerList[i].user.equalsIgnoreCase(user)) {
                    for (int k = 0; k < ownerList[i].account.length; k++) {
                        if (ownerList[i].account[k] != null) {
                            if (ownerList[i].account[k].name.equalsIgnoreCase(currencyName) && ownerList[i].account[k].amount - amount >= 0) {

                                for (int j = 0; j < ownerList.length; j++) {
                                    if (ownerList[j] != null) {
                                        if (ownerList[j].user.equalsIgnoreCase(destinatary)) {
                                            for (int p = 0; p < ownerList[j].account.length; p++) {
                                                if (ownerList[j].account[p] != null) {
                                                    if (ownerList[j].account[p].name.equalsIgnoreCase(currencyName)) {
                                                        ownerList[j].account[p].amount += amount;
                                                        ownerList[i].account[k].amount -= amount;

                                                        found = true;
                                                        p = ownerList[j].account.length - 1;
                                                        k = p;

                                                    }
                                                } else {
                                                    if (!found) {
                                                        Currency currencyInstance = new Currency(currencyName, amount);
                                                        ownerList[j].account[p] = currencyInstance;
                                                        ownerList[i].account[k].amount -= amount;

                                                        found = true;
                                                        p = ownerList[j].account.length - 1;
                                                        k = p;

                                                    }
                                                }
                                            }
                                            j = ownerList.length - 1;

                                        }
                                    }
                                }

                            }
                        }
                    }
                    i = ownerList.length - 1;

                }
            }
        }
        return found;
    }

    public void report() {
        for (int i = 0; i < ownerList.length; i++) {
            if (ownerList[i] != null) {
                for (int k = 0; k < ownerList[i].account.length; k++) {
                    if (ownerList[i].account[k] != null) {
                        System.out.println(ownerList[i].user + " has " + ownerList[i].account[k].amount + " " + ownerList[i].account[k].name);
                    }
                }

            }
        }
    }
}
