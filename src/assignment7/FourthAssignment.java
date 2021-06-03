package assignment7;
interface Cycle1
{
    void addWheels();
}

class CycleFactory implements Cycle1
{
    Cycle1 cycle;
    public CycleFactory(Cycle1 cycle) {
        this.cycle=cycle;
    }
    @Override
    public void addWheels() {


        //using Factories
        if(cycle instanceof UniCycle1)
        {
            System.out.println("one wheel");
        }
        else if(cycle instanceof Bicycle1)
        {
            System.out.println("two wheels");
        }
        else if(cycle instanceof TriCycle1)
        {
            System.out.println("three wheels");
        }
    }

}
class UniCycle1 implements Cycle1
{

    @Override
    public void addWheels() {
        // TODO Auto-generated method stub
        System.out.println("1 wheels");
    }

}

class Bicycle1 implements Cycle1
{

    @Override
    public void addWheels() {
        // TODO Auto-generated method stub
        System.out.println("2 wheels");
    }

}

class TriCycle1 implements Cycle1
{

    @Override
    public void addWheels() {
        System.out.println("3 wheels");
    }

}

public class FourthAssignment {

    public static void main(String[] args) {
        CycleFactory cycleFactory=new CycleFactory(new UniCycle1());
        cycleFactory.addWheels();
    }

}