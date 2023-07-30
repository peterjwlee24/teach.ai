public class Main {
    public static void main(String[] args) {
        // Logical operators: AND, OR, NOT

        // AND RULE: Given N number of conditions, all conditions need to be true in order for the entire
        // statement to be true. If you get one condition is false, the entire statement will be false.

        // OR RULE: Given N number of conditions, if at least one condition is true, then the entire
        // statement will be true. All conditions must be false for the OR statement to be false.

        // NOT: just think opposites day. If your statement is true then you do a NOT, the statement will
        // be false. The same logic with if the statement is false and then you do a NOT, it will be true
        /***
         * Condition 1: You need to get 90% or higher on all your math tests for the next 6 months
         * Condition 2: You must never miss any homework for a whole year
         * Condition 3: You must do all your chores for 3 months
         * Condition 4: You must get a full ride at a D1 college for basketball and get drafted to the NBA in 2 years
         */

        /**
         * Condition 1 AND Condition 3 --> true
         * Condition1 OR Condition2 OR Condition3 OR Condition4 ---> true
         * Condition 1 AND Condition 2 AND Condition 4 ---> false
         * (Condition 2 AND Condition 3) OR Condition 4 ---> true
         * NOT(Condition 4) --> true
         */

        int testGrade = 95;
        System.out.println("the test grade is an A? " + (testGrade >= 90 && testGrade <= 100));


        double gpa = 4.0;
        System.out.println("is your gpa greater than 4.0? : " + !(gpa >= 4.0));

        // boolean flag
        boolean isHonorStudent = true;
        // boolean flag
        boolean hasPerfectAttendance = false;

        // harder example
        int x = 10;
        int y = 5;
        int z = 3;

        boolean result = (x > y) && (y > z) || !(x == z);

        System.out.println("Result: " + result);

        int a = 15;
        int b = 20;
        int c = 10;

        boolean result2 = (a > b) && ((a % c == 0) || (b % c == 0)) && (!(a > 2 * b) || (b > 3 * c));

        System.out.println("Result 2: " + result2);

    }
}