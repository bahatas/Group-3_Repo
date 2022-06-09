package thiefFox;

public class RefactoredThiefFoxV3 {

    public static void main(String[] args) {

        outofclass.group3.week8.thieffox.Fox fox1 = new outofclass.group3.week8.thieffox.Fox();
        fox1.setInfo(true,true, "BLACK",0);

        outofclass.group3.week8.thieffox.Fox fox2 = new outofclass.group3.week8.thieffox.Fox();
        fox2.setInfo(true,true,"BLACK",2);

        outofclass.group3.week8.thieffox.Fox fox3 = new outofclass.group3.week8.thieffox.Fox();
        fox3.setInfo(true,true,"BLACK",3);

        outofclass.group3.week8.thieffox.Fox fox4 = new outofclass.group3.week8.thieffox.Fox();
        fox4.setInfo(false,true,"GRAY",3);

        for (int i = 1; i <= 4; i++) {

            switch (i){
                case 1:
                    printSuspectStatus(isSuspect(fox1), i);
                    break;
                case 2:
                    printSuspectStatus(isSuspect(fox2), i);
                    break;
                case 3:
                    printSuspectStatus(isSuspect(fox3), i);
                    break;
                case 4:
                    printSuspectStatus(isSuspect(fox4), i);
                    break;
            }

        }

    }

    public static void printSuspectStatus(boolean isSuspect, int foxNumber){
        if (isSuspect){
            System.out.println("\uD83E\uDD8A Fox"+foxNumber+" is one of suspects! \uD83E\uDD14");
        }else{
            System.out.println("\uD83E\uDD8A Fox"+foxNumber+" cleared of charges!");
        }
    }

    public static boolean isSuspect(outofclass.group3.week8.thieffox.Fox fox){
        return fox.isWearCoat && fox.coatColor.equals("BLACK") && fox.hasATorch && fox.bagCount == 3;
    }
}

