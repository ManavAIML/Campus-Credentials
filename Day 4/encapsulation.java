//process of wrapping data[variables] and the method that operates on the data into single unit(class) while restriction direct access
// data hiding + control access = data encapsultion


class bank{
    private int bal;
    bank(int bal){
        this.bal= bal;
    }
    void deposite(int amt){
        bal+=amt;
        System.out.println(amt+" deposited successfully");
    }
    void withdraw(int amt){
        if(amt <= bal){
            bal -=amt;
            System.out.println(amt+" withdrawl sucessfully");
        }
        else{
            System.out.println("insufficiant balance";)
        }
    }
    void getbal(){
        System.out,println("bal");
    }
}
public class encapsulation{
    public static vod main(String[] args){
        bank b1=new bank(100000);
        b1.deposits(1200);
        System.out.println(b1.bal);
    }
}