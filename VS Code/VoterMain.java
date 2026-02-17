
//Functional_Interface
interface Voter{
    void checkVoter(int age);
}

public class VoterMain {
    public static void main(String args[])
    {
        Voter v = age -> 
        {
            if(age>=18){
                System.out.println("You can vote!");
            }
            else{
                System.out.println("You cannot vote!");
            }
        };
                v.checkVoter(20);

    }
}
