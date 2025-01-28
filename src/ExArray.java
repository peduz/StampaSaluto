import java.util.Scanner;

public class ExArray {
    
    public static void main(String[] args) {
        //Creazione inserendo gli elementi
        String[] nomi = {"Giuseppe", "Antonio", "Irene", "Simone", "Natan"};
        //Creazione definendo solo la dimensione
        /*
         * | 0  | 0 | 0 | 0 |
         */
        int [] ages = new int [5];

        ages[0] = 34;//| 34 | 0 | 0 | 0 | 0 |

        ages[1] = 12;//| 34 | 12 | 0 | 0 | 0 |

        ages[2] = 30;//| 34 | 12 | 30 | 0 | 0 |

        ages[3] = 2;//| 34 | 12 | 30 | 2 | 0 |

        ages[4] = 4;//| 34 | 12 | 30 | 2 | 4 |

        System.out.println(ages[0]);

        ages[0] = 31;

        System.out.println(ages[0]);

        double[] prices = {12.3, 34.2, 23.456, 2};

        int lunghezzaAgesArray = ages.length;//Lunghezza dell'array ages
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Inserisci quanti partecipanti ci sono alla festa");
        int numPartecipanti = scan.nextInt();
        String[] partecipanti = new String[numPartecipanti];
        
        scan.nextLine();
        for(int i = 0; i < partecipanti.length; i++) {// i = i + 1
            System.out.println("Inserisci il nome del partecipante");
            String nomePartecipante = scan.nextLine();
            partecipanti[i] = nomePartecipante;
        }
        
        int indiceSimone = -1;
        for(int i = 0; i < partecipanti.length; i++) {
            System.out.println(partecipanti[i] + " parteciperà alla festa");
            if(partecipanti[i].equals("Simone")) {
                System.out.println("L'indice è " + i);
                indiceSimone = i;
            }
        }

        if(indiceSimone == -1) {
            System.out.println("Non c'è Simone");
        } else {
            System.out.println("Vuoi cancellare Simone dalla lista? (y/n)");
            String scelta = scan.nextLine();
            if(scelta.equals("y")) {
                partecipanti[indiceSimone] = null;
            }
        }


        // for(int i = 100; i >= 0; i--) {
        //     System.out.println(i);
        // }
        
        int i = 100;
        while(i >= 0)  {
            System.out.println(i);
            if(i == 50) {
                break;
            }
            i--;
        }
    }
}
