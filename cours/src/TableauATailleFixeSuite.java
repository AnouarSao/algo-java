import java.util.Scanner;

public class TableauATailleFixeSuite {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.print("Combien de notes voulez-vous inserer: ");
        var notesAInserer=input.nextInt();//7

        float[] notesMath=new float[notesAInserer];

        for(int i=0;i<=notesMath.length-1;i++){
            while (true){
                System.out.printf("Notes[%d] : ",i);
                float valeurAInserer=input.nextFloat();
                //[0,20]
                if(valeurAInserer>=0 && valeurAInserer<=20){
                    notesMath[i]=valeurAInserer;
                    break;
                }
                System.out.println("Erreur:Veuillez saisir une valeur entre 0 et 20");
            }
        }

        float sommeDesNotes=0;
        for(int i=0;i<=notesMath.length-1;i++){
            sommeDesNotes=sommeDesNotes+notesMath[i];
        }

        float moyenne=sommeDesNotes/notesMath.length;
        System.out.printf("Somme : %.2f\nMoyenne : %.2f",sommeDesNotes,moyenne);
    }
}

/*
public class TableauATailleFixeSuite {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.print("Combien de notes voulez-vous inserer: ");
        var notesAInserer=input.nextInt();//7

        float[] notesMath=new float[notesAInserer];

        for(int i=0;i<=notesMath.length-1;i++){
            System.out.printf("Notes[%d] : ",i);
            notesMath[i]=input.nextFloat();
        }

        float sommeDesNotes=0;
        for(int i=0;i<=notesMath.length-1;i++){
            sommeDesNotes=sommeDesNotes+notesMath[i];
        }

        float moyenne=sommeDesNotes/notesMath.length;
        System.out.printf("Somme : %.2f\nMoyenne : %.2f",sommeDesNotes,moyenne);
    }
}

 */
