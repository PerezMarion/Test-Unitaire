public class PourTesterExo {

    public static int AdditionnerTableau(int[] tableau){
        int somme=0;
        for(int i=0;i<tableau.length;i++){
            somme=somme+tableau[i];
        }
        return somme;
    }
}