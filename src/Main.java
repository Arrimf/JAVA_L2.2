import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import input.*;
import Matrix.*;
public class Main {
    public static void main (String[] args) {
//        Scanner in = new Scanner(System.in);
//        int N = 0, M = 0;
//        System.out.println("Input size of Matrix(N x M)");
//        System.out.print("N = ");
//        N = new input_num().run();
//        System.out.print("M = ");
//        M = new input_num().run();
//
//        Matrix a = new Matrix(N,M);
//        a.input_matr();
//        a.output();
        int arr[][] = {{2,3,4},{5,6,7}};

        Matrix b = new Matrix(arr);
        b.output();
        File m = new File("test.txt");
        try {
            b.write_to_file(m);
        }
        catch (IOException ex){
            System.out.println("File writing failed");
        }
        Matrix c;
        Matrix d;
        try {
            c =  Matrix.read_from_file(m);
            c.output();
            try{
                d = Matrix.add(c,b);
                d.output();
            }
            catch (Exception ex){
                System.out.println("Wrong size");
            }
        }
        catch (Exception ex){
            System.out.println("File reading failed");
        }




    }

}

