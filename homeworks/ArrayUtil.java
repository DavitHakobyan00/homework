public class ArrayUtil {
        public static void main(String[] args) {
            // 1
            System.out.println("POSITIVE NUMBERS");
            printPositiveElements(new int[]{1, -3, 5, 0, -1, 6});

            // 2
            System.out.println("\n2. REVERSE");
            printReverse(new short[]{257, 123, 456});

            // 3
            System.out.println("\n3. BIGGEST long NUMBER");
            printMax(new long[]{10, 900, 45, 9999});

            // 4
            System.out.println("\n4. SMALLEST float NUMBER");
            printMin(new float[]{3.4f, -1.2f, 6.7f, 0.0f});

            // 5
            System.out.println("\n5. TRANSPORT n TO m");
            int[] n = {1, 2, 3};
            int[] m = new int[3];
            copyArray(n, m);
            for (int value : m) System.out.println(value);

            // 6
            System.out.println("\n6. SUMMATION");
            int[] a = {1, 5, 6, 4, 7};
            int[] b = {7, 4, 2, 3, 5};
            int[] result = new int[5];
            sumArrays(a, b, result);
            for (int v : result) System.out.println(v);

            // 7
            System.out.println("\n7. HOW MANY TIMES IS 5 REPEATED");
            System.out.println(countOccurrences(new int[]{1, 5, 6, 4, 5}, 5));

            // 8
            System.out.println("\n8. NON-REPEATING TRIPLES");
            printUniqueTriplets(new int[]{1, 5, 6, 4});

            // 9
            System.out.println("\n9. IN DESCENDING ORDER");
            sortDescending(new int[]{3, 9, 1, 4, 2});

            // 10
            System.out.println("\n10. ODD NUMBERS AT THE END");
            moveOddsToEnd(new int[]{1, 5, 6, 4, 9, 7, 1});

            // 11
            System.out.println("\n11. REMOVING ZEROS");
            removeZeros(new double[]{1, 0, 6, 4, 9, 0, 0});

            // 12
            System.out.println("\n12. ASCENDING ORDER");
            printLongestIncreasingSubsequence(new int[]{1, 5, 6, 4, 9, 0, 4, 7, 7, 9, 1});

            // 13
            System.out.println("\n13. FROM BINARY TO DECIMAL");
            printDecimalFromBinaryArray(new int[]{1, 1, 0, 0, 1, 1});

            // 14
            System.out.println("\n14. Գլխավոր անկյունագծից վերև՝");
            printAboveMainDiagonal(new int[][]{
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}
            });

            // 15
            System.out.println("\n15. Շրջված մատրից՝");
            int[][] mat = {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}
            };
            transposeMatrix(mat);
            for (int[] row : mat) {
                for (int value : row) {
                    System.out.print(value + " ");
                }
                System.out.println();
            }

            // 16
            System.out.println("\n16. Տողերի գումարների զույգ լինելը՝");
            checkEvenRowSums(new int[][]{
                    {1, -1, 0, 0},
                    {2, -2, 1, -1},
                    {9, 7, 1, -17}
            });
        }

        public static void printPositiveElements(int[] n) {
            for (int value : n) {
                if (value > 0) {
                    System.out.println(value);
                }
            }
        }

        public static void printReverse(short[] s) {
            for (int i = s.length - 1; i >= 0; i--) {
                System.out.println(s[i]);
            }
        }

        public static void printMax(long[] l) {
            long max = l[0];
            for (long value : l) {
                if (value > max) {
                    max = value;
                }
            }
            System.out.println(max);
        }

        public static void printMin(float[] f) {
            float min = f[0];
            for (float value : f) {
                if (value < min) {
                    min = value;
                }
            }
            System.out.println(min);
        }

        public static void copyArray(int[] n, int[] m) {
            for (int i = 0; i < n.length && i < m.length; i++) {
                m[i] = n[i];
            }
        }

        public static void sumArrays(int[] a, int[] b, int[] result) {
            for (int i = 0; i < a.length && i < b.length && i < result.length; i++) {
                result[i] = a[i] + b[i];
            }
        }

        public static int countOccurrences(int[] array, int k) {
            int count = 0;
            for (int value : array) {
                if (value == k) {
                    count++;
                }
            }
            return count;
        }

        public static void printUniqueTriplets(int[] array) {
            int n = array.length;
            for (int i = 0; i < n - 2; i++) {
                for (int j = i + 1; j < n - 1; j++) {
                    for (int k = j + 1; k < n; k++) {
                        System.out.println("{" + array[i] + "," + array[j] + "," + array[k] + "}");
                    }
                }
            }
        }

        public static void sortDescending(int[] array) {
            java.util.Arrays.sort(array);
            for (int i = array.length - 1; i >= 0; i--) {
                System.out.println(array[i]);
            }
        }

        public static void moveOddsToEnd(int[] array) {
            int[] result = new int[array.length];
            int evenIndex = 0;
            int oddIndex = array.length - 1;
            for (int value : array) {
                if (value % 2 == 0) {
                    result[evenIndex++] = value;
                } else {
                    result[oddIndex--] = value;
                }
            }
            for (int i = 0; i < array.length; i++) {
                array[i] = result[i];
                System.out.println(array[i]);
            }
        }

        public static void removeZeros(double[] array) {
            for (double v : array) {
                if (v != 0) {
                    System.out.println(v);
                }
            }
        }

        public static void printLongestIncreasingSubsequence(int[] array) {
            int maxLength = 1, currentLength = 1, endIndex = 0;
            for (int i = 1; i < array.length; i++) {
                if (array[i] >= array[i - 1]) {
                    currentLength++;
                    if (currentLength > maxLength) {
                        maxLength = currentLength;
                        endIndex = i;
                    }
                } else {
                    currentLength = 1;
                }
            }
            for (int i = endIndex - maxLength + 1; i <= endIndex; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }

        public static void printDecimalFromBinaryArray(int[] binary) {
            int decimal = 0;
            for (int i = 0; i < binary.length; i++) {
                decimal = decimal * 2 + binary[i];
            }
            System.out.println(decimal);
        }

        public static void printAboveMainDiagonal(int[][] matrix) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = i + 1; j < matrix[i].length; j++) {
                    System.out.println(matrix[i][j]);
                }
            }
        }

        public static void transposeMatrix(int[][] matrix) {
            int n = matrix.length;
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    int tmp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = tmp;

                }
            }
        }
        public static void checkEvenRowSums(int[][] matrix) {
            for (int[] row : matrix) {
                int sum = 0;
                for (int value : row) {
                    sum += value;
                }
                if (sum % 2 != 0) {
                    System.out.println("NO");
                    return;
                }
            }
            System.out.println("YES");
        }
   }



