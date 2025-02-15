package template;

import java.util.Scanner;

public class FileTemplate extends AbstractTemplate {
    
    private Scanner scan;

    public FileTemplate(String nomeFile) {
        scan = new Scanner(nomeFile);
    }

    @Override
    public String getNomeUtente() {
        return scan.nextLine();
    }

    @Override
    public String getCognomeUtente() {
        return scan.nextLine();
    }

    @Override
    public String getStatoUtente() {
        return scan.nextLine();
    }

}
