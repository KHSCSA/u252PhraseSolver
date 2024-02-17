class ExampleMoney {
    public static void main(String[] args) {
        Money pocket = new Money(3,1,2,2);
        System.out.println(pocket.getTotalValue());
    }
} // close Main class


class Money {
    private int numPennies, numNickels, numDimes, numQuarters;
    private double totalValue;

    //default constructor, initializes attributes to zero
    public Money(){
        numPennies = 0;
        numNickels = 0;
        numDimes = 0;
        numQuarters = 0;
        calcTotal();
    }

    //constructor using parameters
    public Money(int pen, int nick, int dime, int quart){
        numPennies = pen;
        numNickels = nick;
        numDimes = dime;
        numQuarters = quart;
        calcTotal();
    }

    //uses attribute values to set totalValue attribute to correct total
    private void calcTotal(){
        totalValue = 0.01*numPennies + 0.05*numNickels + 0.1*numDimes
        + 0.25*numQuarters;
    }

    //returns total value as String
    public String getTotalValue(){
        calcTotal();
        return "$" + totalValue;
    }

} // close Money class