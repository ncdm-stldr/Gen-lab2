public class Dollar extends Money {

    Dollar(int amount){
        this.amount = amount;
    }

    Dollar times(int multiplier){
        return new Dollar(amount * multiplier);
    }

    public boolean equals(Object o) {
        Dollar d = (Dollar) o;
        return amount == d.amount;
    }
}
