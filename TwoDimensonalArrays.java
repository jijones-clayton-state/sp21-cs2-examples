public class TwoDimensonalArrays{
    public static void main(String[] args){
        int[][] numCourses = {{2, 3, 2, 3, 0}, {1, 6, 3, 4, 2}, {3, 2, 4, 1, 2}};
        for(int row = 0; row < numCourses.length; row++){
            for(int col = 0; col < numCourses[row].length; col++){
                //System.out.print("row = " + row + ", col = " + col + " value = ");
                System.out.print(numCourses[row][col] + " ");
            }
            System.out.println();
        }
        
        // // Summing all elements in a 2D array
//         int total = 0; //accumulator
//         for(int row = 0; row < numCourses.length; row++){
//             for(int col = 0; col < numCourses[0].length; col++){
//                 total += numCourses[row][col];
//             }
//         }
//         System.out.println("The total is " + total);
        
        //Parallel 1D Array for names associated with rows + sum each row
        String[] names = {"Bob", "Jack", "Sam"};
        for(int row = 0; row < numCourses.length; row++){
            int total = 0; //accumulator
            for(int col = 0; col < numCourses[0].length; col++){
                total += numCourses[row][col];
            }
            System.out.println(names[row] + " took " + total + " courses.");
        }
        

    }
}