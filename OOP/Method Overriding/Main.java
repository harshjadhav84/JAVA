class RBI{
    public void RateofInterest(){
        System.out.println("rate of interest is 5%");
    }
}

class SBI extends RBI{
    @Override
    public void RateofInterest(){
        System.out.println("Rate of interest is 6%");
    }
}
class PNB extends RBI{
    @Override
    public void RateofInterest(){
        System.out.println("Rate of interest is 7%");
    }
}
public class Main {
    public static void main(String[] args) {
        RBI obj1 = new RBI();
        SBI obj2 = new SBI();
        PNB obj3 = new PNB();
        obj1.RateofInterest();
        obj2.RateofInterest();
        obj3.RateofInterest();
    }    
}
