import java.util.Arrays;

class Duplicate {
    public static void main(String[] args) {
        int[] a = {20, 10, 10, 100, 2, 10, 11, 2, 11, 2};

        int[] duplicates = dup(a);
        System.out.println("Duplicates: " + Arrays.toString(duplicates));
    }

    public static int[] dup(int[] a) {
        int n = a.length;
        int[] duplic = new int[n];
        int k = 0;

        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;

            for (int j = 0; j < n; j++) {
                if (a[i] == a[j] && i != j) {
                    isDuplicate = true;
                    break;
                }
            }

            // Avoid adding the same duplicate multiple times
            boolean alreadyAdded = false;
            for (int l = 0; l < k; l++) {
                if (duplic[l] == a[i]) {
                    alreadyAdded = true;
                    break;
                }
            }

            if (isDuplicate && !alreadyAdded) {
                duplic[k++] = a[i];
            }
        }

        // Create a result array with the correct size
        return Arrays.copyOf(duplic, k);
    }
}
