import java.util.Scanner;
public class TextProgram {
    public static void main(String[] args){
        TextLogik raknare = new TextLogik();
        Scanner scanner =new Scanner(System.in);
        System.out.println("Välkommen tiill TextAnalysator!");
        System.out.println("Skriv din text rad för rad");
        System.out.println("skriv stop när du är klar.");
        String text = scanner.nextLine();
        while (!raknare.arStop(text)) {
            raknare.laggTillRad(text);
            text =scanner.nextLine();

        }
        System.out.println(raknare.getAntalRader());
        System.out.println(raknare.getAntalTecken());
        System.out.println(raknare.getAntalOrd());
        System.out.println(raknare.getLangstaOrd());


    }
}
