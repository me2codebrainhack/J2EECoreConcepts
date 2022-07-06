package module2._arrays;

public class ArrayTwoDimensional {

    public void addSubtractTwoDimensionalArray(int firstArray[][], int secondArray[][]){
        System.out.println(" ");
        System.out.println("After adding following 2 dimensional array ");
        int tempArray[][] = new int[2][2];
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                tempArray[i][j] = firstArray[i][j] + secondArray[i][j];
                System.out.print(tempArray[i][j]+" ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        System.out.println("After subtracting following 2 dimensional array ");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                tempArray[i][j] = firstArray[i][j] - secondArray[i][j];
                System.out.print(tempArray[i][j]+" ");
            }
            System.out.println(" ");
        }
    }

    public void transposeMatrix(int givenArray[][]){
        int rows = givenArray.length;
        int columns = givenArray[0].length;
        int resultArray[][] = new int[columns][rows];
        System.out.println("The transpose of given matrix is as follows -> ");
        for(int row=0;row<columns;row++){
            for(int column=0;column<rows;column++){
                resultArray[row][column] = givenArray[column][row];
            }
        }
        for(int row=0;row<resultArray.length;row++){
            for(int column=0;column<resultArray[0].length;column++){
                System.out.print(resultArray[row][column]+" ");
            }
            System.out.println(" ");
        }
    }

    public void addAllMatrix(int givenMatrix[][]){
        int result=0;
        for(int row=0;row<givenMatrix.length;row++){
            for(int column=0;column<givenMatrix[0].length;column++){
                result = result + givenMatrix[row][column];
            }
        }
        System.out.println("result of adding all elements in matrix is : "+result);
    }
}
