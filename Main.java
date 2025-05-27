public class Main {
    public static void main(String[] args) {
        BitmapSet set = null;  // Objektvariable, bewusst auf null gesetzt

        try {
            // Versuch, eine Methode auf null aufzurufen → NullPointerException
            set.print();
        } catch (NullPointerException e) {
            // Fehlerbehandlung
            System.out.println("Fehler: Nullzeiger-Zugriff");
        }

        // Weiterer Programmablauf
        System.out.println("Programm laeuft weiter");

        menu m = new menu();

        m.start();
    }
}