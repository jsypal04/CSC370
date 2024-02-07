package Homework_2;

public class AccessLevel {

    public static String accessLevel(int[] rights, int minPermissions) {
        String output = "";

        for (int i = 0; i < rights.length; i++) {
            if (rights[i] >= minPermissions) {
                output += 'A';
            }
            else {
                output += 'D';
            }
        }

        return output;
    }


    public static void main(String[] args) {
        int[] rights1 = {0,1,2,3,4,5};
        System.out.println(accessLevel(rights1, 2));
        int[] rights2 = {5,3,2,10,0};
        System.out.println(accessLevel(rights2, 20));
        int[] rights3 = {};
        System.out.println(accessLevel(rights3, 20));
        int[] rights4 = {34,78,9,52,11,1};
        System.out.println(accessLevel(rights4, 49));
    }
    
}