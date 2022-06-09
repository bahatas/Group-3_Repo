package thiefFox;

public class RefactoredThiefFoxV6 {

    public static void main(String[] args) {

        outofclass.group3.week8.thieffox.FoxConstructor[] updatedFoxes = new outofclass.group3.week8.thieffox.FoxConstructor[4];

        updatedFoxes[0] = new outofclass.group3.week8.thieffox.FoxConstructor(1,true,true, "BLACK",0);
        updatedFoxes[1] = new outofclass.group3.week8.thieffox.FoxConstructor(2,true,true, "BLACK",2);
        updatedFoxes[2] = new outofclass.group3.week8.thieffox.FoxConstructor(3,true,true, "BLACK",3);
        updatedFoxes[3] = new outofclass.group3.week8.thieffox.FoxConstructor(4,false,true, "GRAY",3);

        for (int i = 0; i < 4; i++) {
             isSuspect(updatedFoxes[i]);
        }

    }

    public static void isSuspect(outofclass.group3.week8.thieffox.FoxConstructor fox){

        if (fox.isWearCoat && fox.coatColor.equals("BLACK") && fox.hasATorch && fox.bagCount == 3){
            System.out.println("\uD83E\uDD8A Fox"+fox.foxNumber+" is one of suspects! \uD83E\uDD14");
        }else{
            System.out.println("\uD83E\uDD8A Fox"+fox.foxNumber+" cleared of charges!");
        }

    }
}

