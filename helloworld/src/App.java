public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print("*");
            }
            System.out.println(' ');
        }

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(i==j)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println(' ');
        }

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(i+j ==2)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println(' ');
        }

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(i ==0)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println(' ');
        }

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(i ==1)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println(' ');
        }

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(i ==2)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println(' ');
        }

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(j ==0)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println(' ');
        }

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(j ==1)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println(' ');
        }

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
