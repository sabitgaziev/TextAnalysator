public class TextLogik {
    private int antalRader =0;
    private int antalTecken =0;
    private int antalOrd =0;
    private String langstaOrd="";

    public void laggTillRad(String text) {
        antalRader++;
        antalTecken+= text.length();
        String[] ord= text.split(" ");
        for (String ettOrd : ord){
            if (!ettOrd.isEmpty()) {
                antalOrd++;
                if (ettOrd.length()>langstaOrd.length()) {
                    langstaOrd =ettOrd;
                }
            }
        }


    }
public int getAntalRader() {
        return antalRader;
}

public int getAntalTecken() {
        return antalTecken;
    }
    public int getAntalOrd() {
        return antalOrd;
}
    public String getLangstaOrd() {
        return langstaOrd;
    }
    public boolean arStop(String text) {
        return text.equals("stop");
    }
}
