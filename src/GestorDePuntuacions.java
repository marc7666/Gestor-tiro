import acm.program.CommandLineProgram;

public class GestorDePuntuacions extends CommandLineProgram {
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public int tiradors;
    public int plats;

    public GestorDePuntuacions() {
        this.tiradors = 0;
        this.plats = 0;
    }

    public void run() {
        System.out.println(ANSI_CYAN + " ---------- Recollida de dades de la tirada ---------- \n");
        this.plats = readInt(ANSI_RESET + "Indica el nombre de plats de la tirada: ");
        this.tiradors = readInt(ANSI_RESET + "Indica el nombre de tiradors de l'esquadra (màxim 5): ");
        while (!checkTiradros(tiradors)) {
            tiradors = readInt(ANSI_RESET + "Indica el nombre de tiradors de l'esquadra (màxim 5): ");
        }
        if (this.tiradors == 1){
            CasUnTirador tirador = new CasUnTirador();
            tirador.realitzarTirada(this.plats);
        }else{
            System.out.println("Algo falla!");
        }

    }

    private boolean checkTiradros(int tiradors) {
        return tiradors <= 5;
    }



}
