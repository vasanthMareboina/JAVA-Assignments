package assignment7;

class Rodent
{
    Rodent()
    {
        System.out.println("I'm a Rodent.");
    }

    public void appearance()
    {
        System.out.println("I have large and sharp front teeth.");
    }
}


class Mouse extends Rodent
{
    Mouse()
    {
        System.out.println("I'm a Mouse.");
    }
    public void appearance()
    {
        System.out.println("I have long tail and face.I cannot stand on my back legs.");
    }
}

class Hamster extends Rodent
{
    Hamster()
    {
        System.out.println("I'm a Hamster.");
    }
    public void appearance()
    {
        System.out.println("I have short tail or no tail, and much rounder, stouter face on average");
    }
}

class Gerbil extends Rodent
{
    Gerbil()
    {
        System.out.println("I'm a Gerbil.");
    }
    public void appearance()
    {
        System.out.println("I have long tail, smallish ears, and long, flat forehead/nose.");
    }
}




public class FirstAssignment {

    public static void main(String[] args) {


        Rodent rodents[]= new Rodent[3];
        rodents[0]=new Hamster();
        rodents[1]=new Gerbil();
        rodents[2]=new Mouse();
        for(int i=0;i<rodents.length;i++)
        {
            rodents[i].appearance();
        }

    }

}