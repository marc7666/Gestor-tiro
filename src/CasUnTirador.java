public class CasUnTirador extends GestorDePuntuacions {
    public String nom;
    private int trencats;
    private int fallats;


    public CasUnTirador() {
        super();
        this.nom = "";
        this.trencats = 0;
        this.fallats = 0;
    }

    /**
     * Realitza la tirada
     **/
    public void realitzarTirada(int plats) {
        this.nom = readLine("Introdueix el nom del tirador: ");
        System.out.println(ANSI_CYAN + " ---------- Comença la tirada amb 1 tirador. Es prega silenci ---------- \n");
        for (int i = 1; i <= plats; i++) {
            if (checkTipusPlat()) { //És un plat senzill
                System.out.println(ANSI_YELLOW + " ---------- Plat senzill ---------- \n");
                if (checkEncert()) {
                    trencats++;
                } else {
                    fallats++;
                }
            } else { //És un plat doble
                i++;
                System.out.println(ANSI_YELLOW + " ---------- Plat doble ---------- \n");
                System.out.println(ANSI_YELLOW + " ---------- Plat primer ---------- \n");
                if (checkEncert()) {
                    trencats++;
                } else {
                    fallats++;
                }
                System.out.println(ANSI_YELLOW + " ---------- Plat segon ---------- \n");
                if (checkEncert()) {
                    trencats++;
                } else {
                    fallats++;
                }

            }
        }
        resultats(trencats, fallats);
    }

    /**
     * Printa els resultats per pantalla
     **/
    private void resultats(int trencats, int fallats) {
        System.out.println(ANSI_CYAN + " ---------- Resultats ---------- \n");
        System.out.println(ANSI_LIGHT_YELLOW + " ---------- Tirador: " + nom + " ----------\n" + ANSI_GREEN + "Plats trencats: " + trencats + ANSI_RED + "\nPlats fallats: " + fallats);
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
