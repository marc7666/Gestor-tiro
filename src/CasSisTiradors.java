/**
 * @project: Gestor-tiro.
 * @author: mcr99 on 07/04/2022.
 */
public class CasSisTiradors extends GestorDePuntuacions {
    private String[] torns1;
    private String[] torns2;
    private String[] torns3;
    private String[] torns4;
    private String[] torns5;
    private String[] torns6;
    public String nom1;
    private int trencats1;
    private int trencats2;
    private int fallats1;
    private int fallats2;
    public String nom2;
    public String nom3;
    private int trencats3;
    private int fallats3;
    public String nom4;
    private int fallats4;
    private int trencats4;
    public String nom5;
    private int trencats5;
    private int fallats5;
    private int fallats6;
    private int trencats6;
    public String nom6;
    private int platN;

    public CasSisTiradors() {
        super();
        this.nom1 = "";
        this.nom2 = "";
        this.nom3 = "";
        this.nom4 = "";
        this.nom5 = "";
        this.nom6 = "";
        this.trencats1 = 0;
        this.trencats2 = 0;
        this.fallats1 = 0;
        this.fallats2 = 0;
        this.trencats3 = 0;
        this.fallats3 = 0;
        this.trencats4 = 0;
        this.fallats4 = 0;
        this.trencats5 = 0;
        this.fallats5 = 0;
        this.trencats6 = 0;
        this.fallats6 = 0;
        this.torns1 = new String[5];
        this.torns2 = new String[5];
        this.torns3 = new String[5];
        this.torns4 = new String[5];
        this.torns5 = new String[5];
        this.torns6 = new String[5];
        this.platN = 0;
    }

    public void addTorns() {
        torns1[0] = nom1;
        torns1[1] = nom2;
        torns1[2] = nom3;
        torns1[3] = nom4;
        torns1[4] = nom5;

        torns1[0] = nom6;
        torns1[1] = nom1;
        torns1[2] = nom2;
        torns1[3] = nom3;
        torns1[4] = nom4;

        torns1[0] = nom5;
        torns1[1] = nom6;
        torns1[2] = nom1;
        torns1[3] = nom2;
        torns1[4] = nom3;

        torns1[0] = nom4;
        torns1[1] = nom5;
        torns1[2] = nom6;
        torns1[3] = nom1;
        torns1[4] = nom2;

        torns1[0] = nom3;
        torns1[1] = nom4;
        torns1[2] = nom5;
        torns1[3] = nom6;
        torns1[4] = nom1;

        torns1[0] = nom2;
        torns1[1] = nom3;
        torns1[2] = nom4;
        torns1[3] = nom5;
        torns1[4] = nom6;
    }

    /**
     * Realitza la tirada segons el torn
     **/
    public void realitzarTirada(int plats) {
        this.nom1 = readLine("Escriu el nom del tirador de la posicio 1: ");
        this.nom2 = readLine("Escriu el nom del tirador de la posicio 2: ");
        this.nom3 = readLine("Escriu el nom del tirador de la posicio 3: ");
        this.nom4 = readLine("Escriu el nom del tirador de la posicio 4: ");
        this.nom5 = readLine("Escriu el nom del tirador de la posicio 5: ");
        this.nom6 = readLine("Escriu el nom del tirador reserva: ");
        addTorns();
        boolean acabar = false;
        System.out.println(ANSI_CYAN + " ---------- Comença la tirada amb 6 tiradors. Es prega silenci ---------- \n");
        while (platN <= plats && !acabar) {
            for (int i = 0; i < torns1.length - 1; i++) {
                System.out.println(ANSI_PURPLE + " ---------- Torn del tirador 1 (" + nom1 + ") ----------");
                tornTirador1();
                System.out.println(ANSI_PURPLE + " ---------- Torn del tirador 2 (" + nom2 + ") ----------");
                tornTirador2();
                System.out.println(ANSI_PURPLE + " ---------- Torn del tirador 3 (" + nom3 + ") ----------");
                tornTirador3();
                System.out.println(ANSI_PURPLE + " ---------- Torn del tirador 4 (" + nom4 + ") ----------");
                tornTirador4();
                System.out.println(ANSI_PURPLE + " ---------- Torn del tirador 5 (" + nom5 + ") ----------");
                tornTirador5();
            }

            System.out.println(ANSI_YELLOW + " ---------- Canvi de lloc ----------");

            for (int i = 0; i < torns2.length - 1; i++) {
                System.out.println(ANSI_PURPLE + " ---------- Torn del tirador 6 (" + nom6 + ") ----------");
                tornTirador6();
                System.out.println(ANSI_PURPLE + " ---------- Torn del tirador 1 (" + nom1 + ") ----------");
                tornTirador1();
                System.out.println(ANSI_PURPLE + " ---------- Torn del tirador 2 (" + nom2 + ") ----------");
                tornTirador2();
                System.out.println(ANSI_PURPLE + " ---------- Torn del tirador 3 (" + nom3 + ") ----------");
                tornTirador3();
                System.out.println(ANSI_PURPLE + " ---------- Torn del tirador 4 (" + nom4 + ") ----------");
                tornTirador4();
            }

            System.out.println(ANSI_YELLOW + " ---------- Canvi de lloc ----------");

            for (int i = 0; i < torns3.length - 1; i++) {
                System.out.println(ANSI_PURPLE + " ---------- Torn del tirador 5 (" + nom5 + ") ----------");
                tornTirador5();
                System.out.println(ANSI_PURPLE + " ---------- Torn del tirador 6 (" + nom6 + ") ----------");
                tornTirador6();
                System.out.println(ANSI_PURPLE + " ---------- Torn del tirador 1 (" + nom1 + ") ----------");
                tornTirador1();
                System.out.println(ANSI_PURPLE + " ---------- Torn del tirador 2 (" + nom2 + ") ----------");
                tornTirador2();
                System.out.println(ANSI_PURPLE + " ---------- Torn del tirador 3 (" + nom3 + ") ----------");
                tornTirador3();
            }

            System.out.println(ANSI_YELLOW + " ---------- Canvi de lloc ----------");

            for (int i = 0; i < torns4.length - 1; i++) {
                System.out.println(ANSI_PURPLE + " ---------- Torn del tirador 4 (" + nom4 + ") ----------");
                tornTirador4();
                System.out.println(ANSI_PURPLE + " ---------- Torn del tirador 5 (" + nom5 + ") ----------");
                tornTirador5();
                System.out.println(ANSI_PURPLE + " ---------- Torn del tirador 6 (" + nom6 + ") ----------");
                tornTirador6();
                System.out.println(ANSI_PURPLE + " ---------- Torn del tirador 1 (" + nom1 + ") ----------");
                tornTirador1();
                System.out.println(ANSI_PURPLE + " ---------- Torn del tirador 2 (" + nom2 + ") ----------");
                tornTirador2();
            }

            System.out.println(ANSI_YELLOW + " ---------- Canvi de lloc ----------");

            for (int i = 0; i < torns5.length - 1; i++) {
                System.out.println(ANSI_PURPLE + " ---------- Torn del tirador 3 (" + nom3 + ") ----------");
                tornTirador3();
                System.out.println(ANSI_PURPLE + " ---------- Torn del tirador 4 (" + nom4 + ") ----------");
                tornTirador4();
                System.out.println(ANSI_PURPLE + " ---------- Torn del tirador 5 (" + nom5 + ") ----------");
                tornTirador5();
                System.out.println(ANSI_PURPLE + " ---------- Torn del tirador 6 (" + nom6 + ") ----------");
                tornTirador6();
                System.out.println(ANSI_PURPLE + " ---------- Torn del tirador 1 (" + nom1 + ") ----------");
                tornTirador1();
            }

            System.out.println(ANSI_YELLOW + " ---------- Canvi de lloc ----------");

            for (int i = 0; i < torns6.length - 1; i++) {
                System.out.println(ANSI_PURPLE + " ---------- Torn del tirador 2 (" + nom2 + ") ----------");
                tornTirador2();
                System.out.println(ANSI_PURPLE + " ---------- Torn del tirador 3 (" + nom3 + ") ----------");
                tornTirador3();
                System.out.println(ANSI_PURPLE + " ---------- Torn del tirador 4 (" + nom4 + ") ----------");
                tornTirador4();
                System.out.println(ANSI_PURPLE + " ---------- Torn del tirador 5 (" + nom5 + ") ----------");
                tornTirador5();
                System.out.println(ANSI_PURPLE + " ---------- Torn del tirador 6 (" + nom6 + ") ----------");
                tornTirador6();
            }
            platN += 25;
            if (acabarTirada()) {
                break;
            }
        }
        resultats();
    }

    /**
     * Mètode que crida a dos mètodes auxiliars per printar els resultats d'ambdós tiradors
     **/
    private void resultats() {
        System.out.println(ANSI_CYAN + " ---------- Resultats ---------- \n");
        resultatsTirador1(trencats1, fallats1);
        resultatsTirador2(trencats2, fallats2);
        resultatsTirador3(trencats3, fallats3);
        resultatsTirador4(trencats4, fallats4);
        resultatsTirador5(trencats5, fallats5);
        resultatsTirador6(trencats6, fallats6);
    }

    /**
     * Printa els resultats del tirador 6
     **/
    private void resultatsTirador6(int trencats6, int fallats6) {
        System.out.println(ANSI_LIGHT_YELLOW + " ---------- Tirador: " + nom6 + " ----------\n" + ANSI_GREEN + "Plats trencats: " + trencats6 + ANSI_RED + "\nPlats fallats: " + fallats6);
    }

    /**
     * Printa els resultats del tirador 5
     **/
    private void resultatsTirador5(int trencats5, int fallats5) {
        System.out.println(ANSI_LIGHT_YELLOW + " ---------- Tirador: " + nom5 + " ----------\n" + ANSI_GREEN + "Plats trencats: " + trencats5 + ANSI_RED + "\nPlats fallats: " + fallats5);
    }

    /**
     * Printa els resultats del tirador 4
     **/
    private void resultatsTirador4(int trencats4, int fallats4) {
        System.out.println(ANSI_LIGHT_YELLOW + " ---------- Tirador: " + nom4 + " ----------\n" + ANSI_GREEN + "Plats trencats: " + trencats4 + ANSI_RED + "\nPlats fallats: " + fallats4);
    }

    /**
     * Printa els resultats del tirador 3
     **/
    private void resultatsTirador3(int trencats3, int fallats3) {
        System.out.println(ANSI_LIGHT_YELLOW + " ---------- Tirador: " + nom3 + " ----------\n" + ANSI_GREEN + "Plats trencats: " + trencats3 + ANSI_RED + "\nPlats fallats: " + fallats3);
    }

    /**
     * Printa els resultats del tirador 2
     **/
    private void resultatsTirador2(int trencats2, int fallats2) {
        System.out.println(ANSI_LIGHT_YELLOW + " ---------- Tirador: " + nom2 + " ----------\n" + ANSI_GREEN + "Plats trencats: " + trencats2 + ANSI_RED + "\nPlats fallats: " + fallats2);
    }

    /**
     * Printa els resultats del tirador 1
     **/
    private void resultatsTirador1(int trencats1, int fallats1) {
        System.out.println(ANSI_LIGHT_YELLOW + " ---------- Tirador: " + nom1 + " ----------\n" + ANSI_GREEN + "Plats trencats: " + trencats1 + ANSI_RED + "\nPlats fallats: " + fallats1);
    }

    /**
     * Gestio del torn del tirador 1
     **/
    private void tornTirador1() {
        if (checkTipusPlat()) { //És en plat senzill
            if (checkEncert()) {
                trencats1++;
            } else {
                fallats1++;
            }
        } else { //És un plat doble
            platN++;
            System.out.println(ANSI_YELLOW + " ---------- Plat doble ---------- \n");
            System.out.println(ANSI_YELLOW + " ---------- Plat primer ---------- \n");
            if (checkEncert()) {
                trencats1++;
            } else {
                fallats1++;
            }
            System.out.println(ANSI_YELLOW + " ---------- Plat segon ---------- \n");
            if (checkEncert()) {
                trencats1++;
            } else {
                fallats1++;
            }
        }
    }

    /**
     * Gestio del torn del tirador 2
     **/
    private void tornTirador2() {
        if (checkTipusPlat()) { //És en plat senzill
            if (checkEncert()) {
                trencats2++;
            } else {
                fallats2++;
            }
        } else { //És un plat doble
            platN++;
            System.out.println(ANSI_YELLOW + " ---------- Plat doble ---------- \n");
            System.out.println(ANSI_YELLOW + " ---------- Plat primer ---------- \n");
            if (checkEncert()) {
                trencats2++;
            } else {
                fallats2++;
            }
            System.out.println(ANSI_YELLOW + " ---------- Plat segon ---------- \n");
            if (checkEncert()) {
                trencats2++;
            } else {
                fallats2++;
            }
        }
    }

    /**
     * Gestio del torn del tirador 3
     **/
    private void tornTirador3() {
        if (checkTipusPlat()) { //És en plat senzill
            if (checkEncert()) {
                trencats3++;
            } else {
                fallats3++;
            }
        } else { //És un plat doble
            platN++;
            System.out.println(ANSI_YELLOW + " ---------- Plat doble ---------- \n");
            System.out.println(ANSI_YELLOW + " ---------- Plat primer ---------- \n");
            if (checkEncert()) {
                trencats3++;
            } else {
                fallats3++;
            }
            System.out.println(ANSI_YELLOW + " ---------- Plat segon ---------- \n");
            if (checkEncert()) {
                trencats3++;
            } else {
                fallats3++;
            }
        }
    }

    /**
     * Gestio del torn del tirador 4
     **/
    private void tornTirador4() {
        if (checkTipusPlat()) { //És en plat senzill
            if (checkEncert()) {
                trencats4++;
            } else {
                fallats4++;
            }
        } else { //És un plat doble
            platN++;
            System.out.println(ANSI_YELLOW + " ---------- Plat doble ---------- \n");
            System.out.println(ANSI_YELLOW + " ---------- Plat primer ---------- \n");
            if (checkEncert()) {
                trencats4++;
            } else {
                fallats4++;
            }
            System.out.println(ANSI_YELLOW + " ---------- Plat segon ---------- \n");
            if (checkEncert()) {
                trencats4++;
            } else {
                fallats4++;
            }
        }
    }

    /**
     * Gestio del torn del tirador 5
     **/
    private void tornTirador5() {
        if (checkTipusPlat()) { //És en plat senzill
            if (checkEncert()) {
                trencats5++;
            } else {
                fallats5++;
            }
        } else { //És un plat doble
            platN++; //Si un fa dobles -> Els tots fan dobles => s'ha d'avançar una i mes sino es faria un plat de mes
            System.out.println(ANSI_YELLOW + " ---------- Plat doble ---------- \n");
            System.out.println(ANSI_YELLOW + " ---------- Plat primer ---------- \n");
            if (checkEncert()) {
                trencats5++;
            } else {
                fallats5++;
            }
            System.out.println(ANSI_YELLOW + " ---------- Plat segon ---------- \n");
            if (checkEncert()) {
                trencats5++;
            } else {
                fallats5++;
            }
        }
        //return i;
    }

    /**
     * Gestio del torn del tirador 6
     **/
    private void tornTirador6() {
        if (checkTipusPlat()) { //És en plat senzill
            if (checkEncert()) {
                trencats6++;
            } else {
                fallats6++;
            }
        } else { //És un plat doble
            platN++; //Si un fa dobles -> Els tots fan dobles => s'ha d'avançar una i mes sino es faria un plat de mes
            System.out.println(ANSI_YELLOW + " ---------- Plat doble ---------- \n");
            System.out.println(ANSI_YELLOW + " ---------- Plat primer ---------- \n");
            if (checkEncert()) {
                trencats6++;
            } else {
                fallats6++;
            }
            System.out.println(ANSI_YELLOW + " ---------- Plat segon ---------- \n");
            if (checkEncert()) {
                trencats6++;
            } else {
                fallats6++;
            }
        }
        //return i;
    }

    /**
     * True en cas de 'si'. False en cas contrari
     **/
    private boolean checkTipusPlat() {
        String opcio = readLine(ANSI_RESET + "Escriu 'si' si es un plat senzill. 'No' en cas contrari\n");
        String opcio2 = "Si";
        return opcio.equalsIgnoreCase(opcio2);
    }

    private boolean acabarTirada() {
        String opcio = readLine("Vols acabar la tirada i imprimir els resultats? ");
        String opcio2 = "Si";
        return opcio.equalsIgnoreCase(opcio2);
    }

    /**
     * True si es trenca el plat. False en cas contrari
     **/
    private boolean checkEncert() {
        int opcio = readInt(ANSI_RESET + "Escriu '1' si ha encertat el plat i '0' si l'ha fallat.\n");
        return opcio == 1;
    }
}
