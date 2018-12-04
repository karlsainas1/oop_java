public class Burger {
    public String nimetus;
    public String liha;
    public String sai;
    public String lisand1;
    public String lisand2;
    public String lisand3;
    public String lisand4;

    public Double hind;
    public Double lisand1Hind;
    public Double lisand2Hind;
    public Double lisand3Hind;
    public Double lisand4Hind;

    public static void koostaBurger() {

        System.out.println("koostati tavaline burger");
    }

    public void Burger(String nimetus, String liha, String sai, Double hind) {
        this.nimetus = nimetus;
        this.liha = liha;
        this.sai = sai;
        this.hind = hind;

    }

    public void valiLisand1(String lisand1, Double lisand1Hind) {
        this.lisand1 = lisand1;
        this.lisand1Hind = lisand1Hind;
        System.out.println("lisati" + this.lisand1);
    }

    public void valiLisand2(String lisand2, Double lisand2Hind) {
        this.lisand2 = lisand2;
        this.lisand1Hind = lisand2Hind;
    }

    public void valiLisand3(String lisand3, Double lisand3Hind) {
        this.lisand3 = lisand3;
        this.lisand1Hind = lisand3Hind;
    }

    public void valiLisand4(String s) {
        this.lisand4 = lisand4;
        this.lisand1Hind = lisand4Hind;

    }


}
