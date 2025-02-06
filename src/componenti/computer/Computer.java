package componenti.computer;

public class Computer {
    
    private Monitor monitor;

    private SchedaMadre schedaMadre;

    private Tastiera tastiera;

    public Computer(Monitor monitor, SchedaMadre schedaMadre, Tastiera tastiera) {
        this.monitor = monitor;
        this.schedaMadre = schedaMadre;
        this.tastiera = tastiera;
    }

    public void stampaComponenti() {
        System.out.println("La risoluzione del monitor è " 
                + monitor.getRisoluzione() 
                + ", la scheda madre ha " + schedaMadre.getRam() + " GB di RAM" 
                + ", e la tastiera ha un layout " + tastiera.getLayout());
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public SchedaMadre getSchedaMadre() {
        return schedaMadre;
    }

    public void setSchedaMadre(SchedaMadre schedaMadre) {
        this.schedaMadre = schedaMadre;
    }

    public Tastiera getTastiera() {
        return tastiera;
    }

    public void setTastiera(Tastiera tastiera) {
        this.tastiera = tastiera;
    }

}
