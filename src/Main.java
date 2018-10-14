import java.util.Scanner;

public class Main
    {
        private static Scanner scanner = new Scanner(System.in);

        public static void main(String[] args)
            {
                int[] array;
                System.out.print("Input the number of elements of the array ");
                int arraySize = scanner.nextInt();
                array = getArray(arraySize);
                printArray(array);
                sortArray(array);
                System.out.println("Sorted array ");
                printArray(array);
            }

        private static void sortArray(int[] array)
            {
                for (int i = 0; i < array.length; i++)
                    {
                        for (int j = i + 1; j < array.length; j++)
                            {
                                if (array[i] < array[j])
                                    {
                                        int aux = array[i];
                                        array[i] = array[j];
                                        array[j] = aux;
                                    }
                            }
                    }
            }

        private static void printArray(int[] array)
            {
                System.out.println("Input array");
                for (int i : array)
                    {
                        System.out.print(i + "  ");
                    }
                System.out.println();
            }

        private static int[] getArray(int arraySize)
            {
                System.out.println("Input " + arraySize + " elements for the array:");
                int[] array = new int[arraySize];
                for (int i = 0; i < array.length; i++)
                    {
                        array[i] = scanner.nextInt();
                    }
                return array;
            }
    }
