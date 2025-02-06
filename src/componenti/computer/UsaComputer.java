package componenti.computer;

public class UsaComputer {
 
    public static void main(String[] args) {
        Monitor monitor = new Monitor();
        monitor.setPollici(16);
        monitor.setRisoluzione("2160x1440");


        SchedaMadre schedaMadre = new SchedaMadre();
        schedaMadre.setPotenzaCpu(3.32);
        schedaMadre.setRam(32);

        Tastiera tastiera = new Tastiera();
        tastiera.setLayout("Italiano");
        tastiera.setTastierinoNumerico(false);

        Computer computer = new Computer(monitor, schedaMadre, tastiera);
        computer.stampaComponenti();

        monitor.setRisoluzione("pippo");
        computer.stampaComponenti();

        computer.getMonitor().setPollici(14);

        System.out.println("I pollici del monitor dopo il cambiamento " + monitor.getPollici());
    }
}
