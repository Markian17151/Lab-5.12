public class Lab1 {
    public static void main(String[] args) {
    int[] x = new int[50];
    int num = 1;

    for (int i = 0; i < 50; i++) {
        x[i] = num;
        num += 2;
    }

    for (int i = 0; i < 50; i++) {
        System.out.println(x[i]);
    }
}
}