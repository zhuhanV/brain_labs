package ua.zp.brain.labs.oop.basics.exceptions;

import java.util.Objects;

public class MoneyTransactionUtil {
    private String numUser;
    private String numOther;
    private double sum;

    static void sendTo(String numUser, String numOther, double sum) throws AccountException,MoneyValueExeption {
        if (numUser.equals(numOther)) {
                            throw new AccountException();
               }
        if (sum < 0 || sum > 100_000) {
                            throw new MoneyValueExeption();
               }

        System.out.println("Сумма " + sum + ", со счета " + numUser
                + " успешно переведена на счет " + numOther);
    }

    public MoneyTransactionUtil() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MoneyTransactionUtil)) return false;
        MoneyTransactionUtil that = (MoneyTransactionUtil) o;
        return Double.compare(that.getSum(), getSum()) == 0 &&
                Objects.equals(getNumUser(), that.getNumUser()) &&
                Objects.equals(getNumOther(), that.getNumOther());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNumUser(), getNumOther(), getSum());
    }

    public String getNumUser() {
        return numUser;
    }

    public void setNumUser(String numUser) {
        this.numUser = numUser;
    }

    public String getNumOther() {
        return numOther;
    }

    public void setNumOther(String numOther) {
        this.numOther = numOther;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }


}
