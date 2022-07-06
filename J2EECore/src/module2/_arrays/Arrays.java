package module2._arrays;

public class Arrays {
    public void largestNumberInArray(int array[]){
        int largestOfArray=0;

        for(int i=0;i<=array.length-1;i++){
            for(int j=0;j<=array.length-1;j++){
                if(array[i]>array[j]){
                    largestOfArray = array[i];
                }
                if(largestOfArray<array[j]){
                    largestOfArray = array[j];
                }
            }
        }
        System.out.println("Largest number in the array is : "+largestOfArray);
    }

    public void isMoviePresentInTheater(String movieName, String movieArray[]){
        String bust=null;
        for(int i=0;i<=movieArray.length-1;i++){
            if(movieName.equalsIgnoreCase(movieArray[i])){
                System.out.println(movieName + " is present in Theater");
                bust = "Nope";
            }
            if(i==movieArray.length-1 && bust.equals(null)){
                System.out.println(movieName + "is not present in theater");
            }
        }
    }

    public void insertionSortArrayAscending(int givenArray[]){
        int temp = 0;
        for(int i=0;i<givenArray.length;i++){
            for(int j=i;j>0;j--){
                if(givenArray[j]<givenArray[j-1]){
                    temp = givenArray[j-1];
                    givenArray[j-1] = givenArray[j];
                    givenArray[j] = temp;
            }
            }
        }
        System.out.print("The Ascending order array is as follows -> ");
        for(int i=0;i<givenArray.length;i++){
            System.out.print(" "+givenArray[i]);
        }
    }

    public void secondLargestElementInArray(int givenArray[]){
        int second=givenArray[givenArray.length-2];
        int temp = 0;
        for(int i=0;i<givenArray.length;i++){
            for(int j=i;j>0;j--){
                if(givenArray[j]<givenArray[j-1]){
                    temp = givenArray[j-1];
                    givenArray[j-1] = givenArray[j];
                    givenArray[j] = temp;
                }
            }
        }
        System.out.println("");
        System.out.println("Before sorting element at second largest place is "+second);
        System.out.println("After sorting second largest element in array is "+givenArray[givenArray.length-2]);
    }

    public void reverseArray(int givenArray[]){
        int reverseArray[] = new int[givenArray.length];
        int j=0;
        System.out.println("Given Array is -> ");
        for(int i=0;i<=givenArray.length-1;i++){
            System.out.print(" "+givenArray[i]);
        }
        System.out.println(" ");
        System.out.println("Reverse array of given above array is -> ");
        for(int i=givenArray.length-1;i>=0;i--){
            reverseArray[j] = givenArray[i];
            System.out.print(" "+reverseArray[j]);
            j++;
        }
    }
}
