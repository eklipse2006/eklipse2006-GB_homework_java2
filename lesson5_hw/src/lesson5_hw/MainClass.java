package lesson5_hw;

public class MainClass {
    public static void main(String[] args) {
        final int size = 10000000;
        float[] arr = new float[size];
        long a = System.currentTimeMillis();
        method1(arr);
        System.out.println("Время выполнения первого метода: " + (System.currentTimeMillis() - a));

        a = System.currentTimeMillis();
        method2(arr);
        System.out.println("Время выполнения второго метода: " + (System.currentTimeMillis() - a));
    }

    public static void method1(float[] arr) {
        operationsWithArrays(arr);
    }

    public static void method2 (float[] arr) {
        final int h = arr.length / 2;
        float[] a1 = new float[h];
        float[] a2 = new float[h];
        Thread t1 = new Thread(() -> operationsWithArrays(a1));
        Thread t2 = new Thread(() -> operationsWithArrays(a2));

        System.arraycopy(arr, 0, a1, 0, h);
        System.arraycopy(arr, h, a2, 0, h);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.arraycopy(a1, 0, arr, 0, h);
        System.arraycopy(a2, 0, arr, h, h);
    }

    public static void operationsWithArrays(float[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
    }
}
