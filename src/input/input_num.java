package input;
import Matrix.Matrix;

import java.io.File;
import java.util.Scanner;


/**
 * Created by Arr on 28.09.2016.
 * Функтор ввода интов
 */
public class input_num {
    public int run(){
        Scanner in = new Scanner(System.in);
        int N = 0, fl = 1;
        while (fl==1) {
            try {
                N = Integer.parseInt(in.next());
                fl = 0;
            } catch (NumberFormatException ex) {
                System.out.println("Wrong number, try one more time");
            }
        }
        return N;
    }
}
