interface Account {
    void deposit (double amy);
    void withdraw(double amt);
    double viewBalance();}
    
class SavingAccount implements Account {
    private double bal;
    private double intrate;

    public SavingAccount(double bal, double intrate) {
        this.bal = bal;
        this.intrate = intrate;}
    public void deposit(double amt) {
        if (amt>0) {
            bal+=amt;
            System.out.println("Deposited "+amt);
            System.out.println("New Balance: " + bal);}
        else{
            System.out.println("invalid amount.");}}
    public void withdraw(double amt) {
        if (amt>0&& amt<=bal){
            bal-=amt;
            System.out.println("Withdrew " + amt);
            System.out.println("New Balance: " + bal);}
        else {
            System.out.println("invalid amount.");}}
    public double viewBalance() {
        return bal;
    }
    public void addInterest() {
        double interest=bal*(intrate/100);
        bal+=interest;
        System.out.println("New Balance: "+bal);}}
class CurrentAccount implements Account {
    private double bal;
    private double overdraftlmt;
    public CurrentAccount(double bal, double overdraftlmt) {
        this.bal=bal;
        this.overdraftlmt=overdraftlmt;}
    public void deposit(double amt){
        if (amt>0){
            bal+=amt;
            System.out.println("Deposited " + amt);
            System.out.println("New Balance: " + bal);}
        else {
            System.out.println("invalid amount");}}
    public void withdraw(double amt) {
        if (amt>0&& (bal+overdraftlmt)>=amt) {
            bal-=amt;
            System.out.println("Withdrew " + amt);
            System.out.println("New Balance: " + bal);}
        else{
            System.out.println("invalid amount.");}}
    public double viewBalance() {
        return bal;}
    public void checkOverdraftLimit() {
        System.out.println("overdraft limit:" + overdraftlmt);}}
public class bank {
    public static void main(String[] args) {
        SavingAccount savacc = new SavingAccount(2500,4.5);
        savacc.deposit(300);
        savacc.withdraw(100);
        savacc.addInterest();
        System.out.println("Saving Account Balance: " + savacc.viewBalance());
        System.out.println("");
        CurrentAccount curracc = new CurrentAccount(1500,500);
        curracc.deposit(300);
        curracc.withdraw(2000);
        curracc.checkOverdraftLimit();
        System.out.println("Current Account Balance: " + curracc.viewBalance());}}