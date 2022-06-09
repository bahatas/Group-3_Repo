package thiefFox;

public class RefactoredThiefFoxV5 {

    public static void main(String[] args) {

        outofclass.group3.week8.thieffox.Fox[] foxes = new outofclass.group3.week8.thieffox.Fox[4];

        outofclass.group3.week8.thieffox.Fox fox1 = new outofclass.group3.week8.thieffox.Fox();
        fox1.setInfo(true,true, "BLACK",0);
        foxes[0] = fox1;

        outofclass.group3.week8.thieffox.Fox fox2 = new outofclass.group3.week8.thieffox.Fox();
        fox2.setInfo(true,true,"BLACK",2);
        foxes[1] = fox2;

        outofclass.group3.week8.thieffox.Fox fox3 = new outofclass.group3.week8.thieffox.Fox();
        fox3.setInfo(true,true,"BLACK",3);
        foxes[2] = fox3;

        outofclass.group3.week8.thieffox.Fox fox4 = new outofclass.group3.week8.thieffox.Fox();
        fox4.setInfo(false,true,"GRAY",3);
        foxes[3] = fox4;

        for (int i = 0; i < 4; i++) {
             isSuspect(foxes[i], i + 1);
        }

    }

    public static void isSuspect(outofclass.group3.week8.thieffox.Fox fox, int foxNumber){

        if (fox.isWearCoat && fox.coatColor.equals("BLACK") && fox.hasATorch && fox.bagCount == 3){
            System.out.println("\uD83E\uDD8A Fox"+foxNumber+" is one of suspects! \uD83E\uDD14");
        }else{
            System.out.println("\uD83E\uDD8A Fox"+foxNumber+" cleared of charges!");
        }

    }
}

