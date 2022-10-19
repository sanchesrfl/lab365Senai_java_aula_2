package entities;


//subclasse 
public class BusinessAccount extends Account {

    //essa classe possui limite de empréstimo
    private Double loanLimit;

    public BusinessAccount() {

        //vale a pena inserir o construtor padrão por questões futuras
        super();

    }

    public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {

        super(number, holder, balance);

        this.loanLimit = loanLimit;

    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan(double amount) {

        if (amount <= loanLimit) {

            deposit(amount);

        }

       

}

    @Override
    public void withdraw(double amount) {

        balance -= amount + 2;

    }



    
}
