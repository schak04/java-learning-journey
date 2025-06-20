class Bank {
    double GetInterest() {
        return 5.0;
    }
}

class SBI extends Bank {
    @Override
    double GetInterest() {
        return 6.5;
    }
}

class HDFC extends Bank {
    @Override
    double GetInterest() {
        return 7.5;
    }
}

public class CSE310_Polymorphism {
    public static void main(String[] args) {
        Bank account;
        account = new SBI();
        System.out.println("The return rates are "+account.GetInterest());
        account = new HDFC();
        System.out.println("The return rates are "+account.GetInterest());

    }
}
