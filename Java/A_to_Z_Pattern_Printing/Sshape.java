public class Sshape {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || i == 3 || i == 5) { 
                    System.out.print("*");
                } else if (i == 2 && j == 1) {  
                    System.out.print("*");
                } else if (i == 4 && j == 5) {    
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
