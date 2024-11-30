public class Main {
    public static void main(String[] args) {
        //task 1
        System.out.println("Task 1");
        int[] numbers = new int[]{1, 2, 3};
        double[] decimals = {1.57, 7.654, 9.986};

        String[] employeeNames = {"Kate", "Olya", "Lena"};
        int[] employeeAges = {31, 40, 27};
        double[] employeeSalaries = new double[3];
        employeeSalaries[0] = 3777.71;
        employeeSalaries[1] = 4505.57;
        employeeSalaries[2] = 7077.75;


        //task 2
        System.out.println("Task 2");
        int[] arr1 = new int[]{1, 2, 3};
        double[] arr2 = new double[]{1.57, 7.654, 9.986};
        String[] arr3 = new String[]{"mango", "orange", "cacos"};

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]);
            if (i != arr1.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]);
            if (i != arr2.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i]);
            if (i != arr3.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();


        //task 3
        System.out.println("Task 3");
        int[] arr4 = new int[]{1, 2, 3};
        double[] arr5 = new double[]{1.57, 7.654, 9.986};
        int[] arr6 = new int[]{4, 5, 6, 7, 8};

        System.out.print("arr4 в обратном порядке: ");
        for (int i = arr4.length - 1; i >= 0; i--) {
            System.out.print(arr4[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        System.out.print("arr5 в обратном порядке: ");
        for (int i = arr5.length - 1; i >= 0; i--) {
            System.out.print(arr5[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        System.out.print("arr6 в обратном порядке: ");
        for (int i = arr6.length - 1; i >= 0; i--) {
            System.out.print(arr6[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}

