import java.util.Scanner;

public class menu {
    private BitmapSet set;
    private final Scanner scanner;

    public menu() {
        scanner = new Scanner(System.in);
    }

    public void start() {
        boolean running = true;

        while (running) {
            System.out.println("\n--- Menü ---");
            System.out.println("1: Größe der Grundmenge festlegen");
            System.out.println("2: Element hinzufügen");
            System.out.println("3: Menge anzeigen");
            System.out.println("4: Größe der Menge");
            System.out.println("5: Erweiterte Menge erzeugen (AdvancedBitmapSet mit {0,1,2})");
            System.out.println("6: Prüfen, ob die Menge leer ist (nur bei AdvancedBitmapSet)");
            System.out.println("7: Bereich hinzufügen (add(unten, oben)) – nur bei AdvancedBitmapSet");
            System.out.println("0: Beenden");
            System.out.print("Auswahl: ");

            int auswahl = scanner.nextInt();

            switch (auswahl) {
                case 1:
                    System.out.print("Geben Sie die Größe der Grundmenge an: ");
                    int size = scanner.nextInt();
                    set = new BitmapSet(size);
                    break;

                case 2:
                    if (set == null) {
                        System.out.println("Bitte zuerst die Grundmenge festlegen (Option 1 oder 5).");
                        break;
                    }
                    System.out.print("Gib das Element ein: ");
                    int wert = scanner.nextInt();
                    int result = set.add(wert);
                    if (result == 0) {
                        System.out.println("Element eingefügt!");
                    } else {
                        System.out.println("Ungültiger Wert!");
                    }
                    break;

                case 3:
                    if (set != null) {
                        set.print();
                        System.out.println();
                    } else {
                        System.out.println("Menge ist noch nicht initialisiert.");
                    }
                    break;

                case 4:
                    if (set != null) {
                        System.out.println("Anzahl Elemente: " + set.size());
                    } else {
                        System.out.println("Menge ist noch nicht initialisiert.");
                    }
                    break;

                case 5:
                    set = new AdvancedBitmapSet(10, 2);
                    System.out.println("Erweiterte Menge mit {0,1,2} wurde erzeugt.");
                    break;

                case 6:
                    if (set instanceof AdvancedBitmapSet) {
                        boolean leer = ((AdvancedBitmapSet) set).isEmpty();
                        System.out.println("Die Menge ist " + (leer ? "leer." : "nicht leer."));
                    } else {
                        System.out.println("Diese Funktion ist nur für AdvancedBitmapSet verfügbar.");
                    }
                    break;

                case 7:
                    if (set instanceof AdvancedBitmapSet) {
                        System.out.print("Untere Grenze (exklusiv): ");
                        int unten = scanner.nextInt();
                        System.out.print("Obere Grenze (exklusiv): ");
                        int oben = scanner.nextInt();
                        int res = ((AdvancedBitmapSet) set).add(unten, oben);
                        if (res == 0) {
                            System.out.println("Bereich erfolgreich eingefügt.");
                        } else {
                            System.out.println("Ungültiger Bereich!");
                        }
                    } else {
                        System.out.println("Diese Funktion ist nur für AdvancedBitmapSet verfügbar.");
                    }
                    break;

                case 0:
                    running = false;
                    System.out.println("Programm beendet.");
                    break;

                default:
                    System.out.println("Ungültige Eingabe!");
                    break;
            }
        }
    }
}