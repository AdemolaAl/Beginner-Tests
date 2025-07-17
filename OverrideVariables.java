public class OverrideVariables{
    public static void main(String[] args) {

       int aNumber = 10; // Example value for a number
       System.out.println("In main(), aNumber is " + aNumber);
       firstMethod();
       System.out.println("Back in main(), aNumber is still " + aNumber);
       secondMethod(aNumber);  
       System.out.println("Back in main(), aNumber is now " + aNumber);

    }

    public static void firstMethod(){
        int aNumber = 20; // This variable overrides the one in main()
        System.out.println("In firstMethod(), aNumber is " + aNumber);
    }

    public static void secondMethod(int aNumber){
        System.out.println("Firstly in secondMethod(), aNumber is " + aNumber);
        aNumber = 30; // This variable overrides the one in firstMethod()
        System.out.println("In secondMetho() after reassignment, aNumber is now " + aNumber);
        System.out.println("In secondMethod(), aNumber is " + aNumber);
    }
}