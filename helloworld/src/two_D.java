public class two_D {
    public static void main(String[] args){

        // simple matrix
        System.out.println("Simple Matrix");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print("*");
            }
            System.out.println(' ');
        }

        // main diagonal of matrix
        System.out.println("Primary Diagonal");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(i==j)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println(' ');
        }

        // secondary diagonal of matrix
        System.out.println("Secondary Diagonal");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(i+j ==2)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println(' ');
        }

        // first row
        System.out.println("First Row");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(i ==0)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println(' ');
        }

        // second row
        System.out.println("Second Row");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(i ==1)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println(' ');
        }

        // third row
        System.out.println("Third Row");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(i ==2)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println(' ');
        }

        // first column
        System.out.println("First Column");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(j ==0)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println(' ');
        }

        // second column
        System.out.println("Second Column");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(j ==1)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println(' ');
        }

        // third column
        System.out.println("Third Column");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(j ==2)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println(' ');
        }
    }
}
