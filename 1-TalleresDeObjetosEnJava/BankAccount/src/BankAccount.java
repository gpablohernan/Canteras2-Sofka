/**
 * Representa una cuenta bancaria y sus atributos y métodos
 * @author Pablo Hernán Gatti
 */

public class BankAccount {

    /**
     * el número de cuenta
     */
    private int accountNumber;

    /**
     * si la cuenta bancaria está activada o no
     */
    protected boolean activated;

    /**
     * Crea una instancia de la clase BankAccount sin parámetros
     */

    public BankAccount() {
    }

    /**
     * Crea una instancia de la clase BankAccount con parámetros
     */

    public BankAccount(int accountNumber, boolean activated) {
        this.accountNumber = accountNumber;
        this.activated = activated;
    }

    /**
     * Setea el atributo activated
     * @param activated
     */

    public void setActivated(boolean activated) {
        this.activated = activated;
    }

    /**
     * retorna si la cuenta bancaria se encuentra activa o no
     * @return el estado del atributo activated
     */

    public boolean getActivated() {
        return activated;
    }

    /**
     * retorna el número de cuenta bancaria
     * @return el número de accountNumber
     */

    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     * Setea la cuenta bancaria (accountNumber)
     * @param accountNumber el número de cuenta bancaria
     */

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
}
