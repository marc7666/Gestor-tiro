import Excepcions.TooFewShootersException;
import Excepcions.TooManyShootersException;
import acm.program.CommandLineProgram;


public class GestorDePuntuacions extends CommandLineProgram {
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_LIGHT_YELLOW = "\u001B[93m";
    public int tiradors;
    public int plats;

    public GestorDePuntuacions() {
        this.tiradors = 0;
        this.plats = 0;
    }

    /**
     * Mètode d'execució del programa principal
     **/
    public void run() {
        try {
            informacioTirada();
        } catch (TooFewShootersException e) {
            e.printStackTrace();
        } catch (TooManyShootersException e) {
            e.printStackTrace();
        }
        if (this.tiradors == 1) {
            CasUnTirador tirador = new CasUnTirador();
            tirador.realitzarTirada(this.plats);
        } else if (this.tiradors == 2) {
            CasDosTiradors tirador2 = new CasDosTiradors();
            tirador2.realitzarTirada(this.plats);
        } else if (this.tiradors == 3) {
            CasTresTiradors tirador3 = new CasTresTiradors();
            tirador3.realitzarTirada(this.plats);
        } else if (this.tiradors == 4) {
            CasQuatreTiradors tirador4 = new CasQuatreTiradors();
            tirador4.realitzarTirada(this.plats);
        } else {
            CasCincTiradors tirador5 = new CasCincTiradors();
            tirador5.realitzarTirada(this.plats);
        }

    }

    /**
     * Recollida d'informació de la tirada
     **/
    private void informacioTirada() throws TooFewShootersException, TooManyShootersException {
        System.out.println(ANSI_CYAN + " ---------- Recollida de dades de la tirada ---------- \n");
        this.plats = readInt(ANSI_RESET + "Indica el nombre de plats de la tirada: ");
        this.tiradors = readInt(ANSI_RESET + "Indica el nombre de tiradors de l'esquadra (màxim 5): ");
        if (tiradors <= 0) {
            throw new TooFewShootersException("El nombre introduït de tiradors es massa baix!");
        } else if (tiradors > 6) {
            throw new TooManyShootersException("El nombre introduït de tiradors es massa elevat!");
        }
    }


    public static void main(String[] args) {
        GestorDePuntuacions g = new GestorDePuntuacions();
        g.run();
    }


}
