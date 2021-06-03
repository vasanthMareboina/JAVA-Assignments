package assignment7;

class Cycle{
    void balance(){
        System.out.println("Cycle balance");
    }
}

class UniCycle extends Cycle{
    void balance(){
        System.out.println("UniCycle balance");
    }
}

class BiCycle extends Cycle{
    void balance(){
        System.out.println("BiCycle balance");
    }
}

class TriCycle extends Cycle{

}

public class CycleClass {
    public static void main(String[] args) {
        UniCycle uniCycle = new UniCycle();
        BiCycle biCycle = new BiCycle();
        TriCycle triCycle = new TriCycle();
        Cycle[] cycles = new Cycle[3];
        cycles[0]=uniCycle;
        cycles[1]=biCycle;
        cycles[2]=triCycle;

        for(Cycle cycle:cycles)
        {
            cycle.balance();
        }
    }
    //as balance method does not exist in TriCycle class,it will call super class method.



}
