public class BitmapSet {

    protected byte[] bitmap;

    public BitmapSet(int size){
        bitmap = new byte[size];            //Array mit Länge Size
        for(int i=0; i<size; i++){          //füllt Array mit Nullen
            bitmap[i] = 0;

        }

    }

    public int add(int value){              //Hinzufügen Methode
        if(value<0||value>= bitmap.length){
            return -1;
        }
        bitmap[value] = 1;
        return 0;

    }

    public void print() {                   //Drucken Methode
        System.out.print("Bitmap:");
        for (int i=0; i<bitmap.length; i++) {
            if (bitmap[i] == 1) {
                System.out.print(i + "");
            }
        }

    }
    public int size(){
        int count = 0;
        for (byte b : bitmap) {
            if (b == 1) {
                count++;
            }
        }
        return count;

    }


}