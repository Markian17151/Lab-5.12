public class Lab2 {
    public static void main(String[] args) {
        int x[]= new int[20];
        System.out.println("Перший масив:");
        for (int i=0; i<20; i++) {
            x[i] = (int) (Math.random() * 9);
            System.out.println(x[i] + "");
        }

        System.out.println("Оновлений масив:");
        for (int i=0; i<20; i+=2 ){
            x[i]=0;
        }
        for (int i=0; i<20; i++){
            System.out.println(x[i] + "");
        }
    }
}