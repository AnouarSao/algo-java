package cours_bases_java;

public class Boolean {
    public static void main(String[] args) {
        byte age = 2;
        boolean estMajeur = age >= 18;

        if(estMajeur){
            System.out.println("Vous etes majeur");
        }else{
            System.out.println(("Vous n'etes pas majeur"));
        }
    }
}
