package autosprogram;
public class AutosProgram {

    
    public static void main(String[] args) {
        new AutosProgram().bemutato1();
        AutosProgram prg = new AutosProgram();
        prg.bemutato2();
        prg.bemutato3();

    }

    private void bemutato1() {
        Auto auto = new Auto();
        auto.megy();
        auto.setBeindit(true);
        auto.megy();
        auto.megy();
        auto.tankol();
        auto.setBeindit(false);
        auto.tankol();
        auto.setBeindit(true);
        auto.megy();
    }
    private void bemutato2() {
        Auto auto = new Auto(false);
        auto.megy();
        auto.setBeindit(true);
        auto.megy();
        auto.megy();
        auto.tankol();
        auto.setBeindit(false);
        auto.tankol();
        auto.setBeindit(true);
        auto.megy();
    }
        private void bemutato3() {
        Auto auto = new Auto(true,true);
        auto.megy();
        auto.setBeindit(true);
        auto.megy();
        auto.megy();
        auto.tankol();
        auto.setBeindit(false);
        auto.tankol();
        auto.setBeindit(true);
        auto.megy();
    }
    
    
}
