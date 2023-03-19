package symmetric;


import java.util.*;
class CheckSymm {


    void findSymm(int[][] arr1) {
        boolean isSymmetric = true;
        for (int i1 = 0; i1 < arr1.length; i1++) {
            for (int j = 0; j < arr1.length; j++) {
                if (arr1[i1][j] != arr1[j][i1]) {
                    isSymmetric = false;
                    break;
                }
            }
            if (!isSymmetric) {
                break;
            }
        }
        if (isSymmetric) {
            System.out.println("The matrix is symmetric");
        } else {
            System.out.println("The matrix is not symmetric");
        }
    }
}




class Symmetric {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows and columns of the matrix: ");
        int n = input.nextInt();

        int[][] matrix = new int[n][n];

        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = input.nextInt();
            }
        }
        System.out.println("Entered matrix is: ");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");

            }
            System.out.println();

        }
        CheckSymm checkSymm = new CheckSymm();
        checkSymm.findSymm(matrix);
    }
}


