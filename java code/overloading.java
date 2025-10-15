class banking
{
    double bal;
    public banking(double d)
    {
        this.bal=d;
    }
    public void deposit(int amt)
    {
        bal+=amt;
        System.out.println("the balance after deposit is "+bal);
    }
    public void deposit(double amt)
    {
        bal+=amt;
        System.out.println("the balance after deposit is "+bal);
    }
    public void deposit(int amt,String desc)
    {
        bal+=amt;
        System.out.println("the balance after deposit is "+bal+" via "+desc);
    }
    public double getbalance()
    {
        return bal;
    }
}
class bankingdemo
{
    public static void main(String args[]){
        banking obj=new banking(500.00);
        obj.deposit(200);
        obj.deposit(300.50);
        obj.deposit(600,"pay cheque");
        System.out.println("the final balance is "+obj.getbalance());
    }
}
