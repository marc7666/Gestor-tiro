import acm.program.CommandLineProgram;

public class GestorDePuntuacions extends CommandLineProgram {
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_YELLOW = "\u001B[33m";

    public void run() {
        System.out.println(ANSI_CYAN + " ---------- Recollida de dades de la tirada ---------- \n");
        int plats = readInt(ANSI_RESET + "Indica el nombre de plats de la tirada: ");
        int tiradors = readInt(ANSI_RESET + "Indica el nombre de tiradors de l'esquadra (màxim 5): ");
        while (!checkTiradros(tiradors)) {
            tiradors = readInt(ANSI_RESET + "Indica el nombre de tiradors de l'esquadra (màxim 5): ");
        }
        /*switch (tiradors) {
            case 1:
                casTiradorUnic(plats);
                break;
            case 2:
                casDosTiradors(plats);
                break;
            case 3:
                //
                break;
            case 4:
                //
                break;
            case 5:
                //
                break;
        }*/
    }

    private boolean checkTiradros(int tiradors) {
        return tiradors <= 5;
    }

    private void casTiradorUnic(int plats) {
        String nom = readLine("Introdueix el nom del tirador: ");
        int trencats = 0;
        int fallats = 0;
        System.out.println(ANSI_CYAN + " ---------- Comença la tirada amb 1 tirador. Es prega silenci ---------- \n");
        for (int i = 1; i < plats; i++) {
            if (checkTipusPlat()) { //És un plat senzill
                System.out.println(ANSI_YELLOW + " ---------- Plat senzill ---------- \n");
                if (checkEncert()) {
                    trencats++;
                } else {
                    fallats++;
                }
            } else { //És un plat doble
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
        System.out.println(ANSI_CYAN + " ---------- Resultats ---------- \n");
        System.out.println(ANSI_RESET + "Tirador: " + nom + "\n" + ANSI_GREEN + "Plats trencats: " + trencats + ANSI_RED + "\nPlats fallats: " + fallats);
    }

    private boolean checkTipusPlat() {
        String opcio = readLine(ANSI_RESET + "Escriu 'si' si es un plat senzill. 'No' en cas contrari\n");
        String opcio2 = "Si";
        return opcio.equalsIgnoreCase(opcio2);
    }

    private boolean checkEncert() {
        int opcio = readInt(ANSI_RESET + "Escriu '1' si ha encertat el plat i '0' si l'ha fallat.\n");
        return opcio == 1;
    }

}
