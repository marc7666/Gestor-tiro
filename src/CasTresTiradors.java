public class CasTresTiradors extends GestorDePuntuacions {
    public String nom1;
    private int trencats1;
    private int trencats2;
    private int fallats1;
    private int fallats2;
    public String nom2;
    public String nom3;
    private int trencats3;
    private int fallats3;

    public CasTresTiradors() {
        super();
        this.nom1 = "";
        this.nom2 = "";
        this.nom3 = "";
        this.trencats1 = 0;
        this.trencats2 = 0;
        this.fallats1 = 0;
        this.fallats2 = 0;
        this.trencats3 = 0;
        this.fallats3 = 0;

    }

    /**
     * Realitza la tirada segons el torn
     **/
    public void realitzarTirada(int plats) {
        this.nom1 = readLine("Escriu el nom del tirador de la posicio 1: ");
        this.nom2 = readLine("Escriu el nom del tirador de la posicio 2: ");
        this.nom3 = readLine("Escriu el nom del tirador de la posicio 3: ");
        System.out.println(ANSI_CYAN + " ---------- Comença la tirada amb 3 tiradors. Es prega silenci ---------- \n");
        for (int i = 1; i <= plats; i++) {
            System.out.println(ANSI_PURPLE + " ---------- Torn del tirador 1 (" + nom1 + ") ----------");
            tornTirador1();
            System.out.println(ANSI_PURPLE + " ---------- Torn del tirador 2 (" + nom2 + ") ----------");
            tornTirador2();
            System.out.println(ANSI_PURPLE + " ---------- Torn del tirador 3 (" + nom3 + ") ----------");
            i = tornTirador3(i);
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
    private int tornTirador3(int i) {
        if (checkTipusPlat()) { //És en plat senzill
            if (checkEncert()) {
                trencats3++;
            } else {
                fallats3++;
            }
        } else { //És un plat doble
            i++; //Si un fa dobles -> Els tots fan dobles => s'ha d'avançar una i mes sino es faria un plat de mes
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
        return i;
    }

    /**
     * True en cas de 'si'. False en cas contrari
     **/
    private boolean checkTipusPlat() {
        String opcio = readLine(ANSI_RESET + "Escriu 'si' si es un plat senzill. 'No' en cas contrari\n");
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
