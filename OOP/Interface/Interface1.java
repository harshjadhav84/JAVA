interface car{
    public void start();
}

class ElectricCar implements car{
    public void start(){
        System.out.println("Electric car Start");
    }
}

class DiselCar implements car{
    public void start(){
        System.out.println("Disel car Start");
    }
}


public class Interface1 {
    public static void main(String[] args) {
        car Tesla = new ElectricCar();
        car Tata = new DiselCar();
            Tesla.start();
            Tata.start();
    }
}
