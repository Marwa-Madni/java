
import java.io.FileInputStream;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.util.NoSuchElementException;

public class reader {
    public static void main(String[] args){

        // show first given argument
        if(args.length > 0){
        String s = args[0];
        System.out.println(s);
        }
        // show all the arguments
        if(args.length > 0){
            for(int i = 1; i < args.length; i++){
                System.out.println(args[i]);
            }
        }

        // take the name of the file from the command line
        if(args.length > 0){
            // check if the extension is provided or not
            if(args[0].contains(".")){
                System.out.println("yes extension provided");
            }
            else{
                System.out.println("Please provide the extension");
            }
        }

        // get the file name as argument import java.io.File;
        File file = new File(args[0]);
        // binary value holder
        int buffer=0;
        int n = 8;
        char c=' ';


        // essential to wrap up in try-catch cause IOException
        try{
            if(file.exists()){
                // the file is read via the inputstream, java.io.InputStream
                FileInputStream readr = new FileInputStream(file);
                // get a inputbuffer for the reader, import java.io.BufferedInputStream
                BufferedInputStream buff = new BufferedInputStream(readr);
                                   
                try{
                    buffer = readr.read();
                    n = 8;
                }
                catch(IOException ioe){
                    System.err.print("Error Error");
                    buffer = -1;
                    n = -1;
                }
                // aah aah there is nothing in the fileeee
                if(buffer == -1){
                    // import java.util.NoSuchElementException;
                    throw new NoSuchElementException("The file  is empty");
                }
//----------------------
                else{
                while(buffer != -1){
                    if (n == 8) {
                        int x = buffer;
                        // fillBuffer();
                        try{
                            buffer = readr.read();
                            n = 8;
                        }
                        catch(IOException ioe){
                            System.err.print("End of file");
                            buffer = -1;
                            n = -1;
                        }
                        // return (char) (x & 0xff);
                        c = (char) (x & 0xff);
                    }
                    else{
                        // combine last N bits of current buffer with first 8-N bits of new buffer
                        int x = buffer;
                        x <<= (8 - n);
                        int oldN = n;
                        // fillBuffer();
                        try{
                            buffer = readr.read();
                            n = 8;
                        }
                        catch(IOException ioe){
                            System.err.print("Error Error");
                            buffer = -1;
                            n = -1;
                        }
                        // if (isEmpty()) throw new NoSuchElementException("Reading from empty input stream");
                        if(buffer == -1){
                            // import java.util.NoSuchElementException;
                            throw new NoSuchElementException("Reading from empty input stream");
                        }
                        n = oldN;
                        x |= (buffer >>> n);
                        c = (char) (x & 0xff);
                        // the above code doesn't quite work for the last character if N = 8
                        // because buffer will be -1
                    }
                    System.out.print(c);
                }
            }
                // System.out.print(c);
            }
            
        }
        catch(IOException ioe){
            System.err.print("Could not open file");
        }
        // System.out.print(c);
    
    }

}
