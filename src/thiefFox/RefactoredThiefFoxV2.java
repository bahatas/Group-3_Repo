package thiefFox;

public class RefactoredThiefFoxV2 {

    public static void main(String[] args) {

        outofclass.group3.week8.thieffox.Fox fox1 = new outofclass.group3.week8.thieffox.Fox();
        fox1.setInfo(true,true, "BLACK",0);

        outofclass.group3.week8.thieffox.Fox fox2 = new outofclass.group3.week8.thieffox.Fox();
        fox2.setInfo(true,true,"BLACK",2);

        outofclass.group3.week8.thieffox.Fox fox3 = new outofclass.group3.week8.thieffox.Fox();
        fox3.setInfo(true,true,"BLACK",3);

        outofclass.group3.week8.thieffox.Fox fox4 = new outofclass.group3.week8.thieffox.Fox();
        fox4.setInfo(false,true,"GRAY",3);

        if (isSuspect(fox1)) {
            System.out.println("\uD83E\uDD8A Fox1 is one of suspects! \uD83E\uDD14");
        }else {
            System.out.println("\uD83E\uDD8A Fox1 cleared of charges!");
        }

        if (isSuspect(fox2)) {
            System.out.println("\uD83E\uDD8A Fox2 is one of suspects! \uD83E\uDD14");
        }else {
            System.out.println("\uD83E\uDD8A Fox2 cleared of charges!");
        }

        if (isSuspect(fox3)) {
            System.out.println("\uD83E\uDD8A Fox3 is one of suspects! \uD83E\uDD14");
        }else {
            System.out.println("\uD83E\uDD8A Fox3 cleared of charges!");
        }

        if (isSuspect(fox4)) {
            System.out.println("\uD83E\uDD8A Fox4 is one of suspects! \uD83E\uDD14");
        }else {
            System.out.println("\uD83E\uDD8A Fox4 cleared of charges!");
        }

    }

    public static boolean isSuspect(outofclass.group3.week8.thieffox.Fox fox){

        return fox.isWearCoat && fox.coatColor.equals("BLACK") && fox.hasATorch && fox.bagCount == 3;
    }
}

