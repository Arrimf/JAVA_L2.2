package Matrix;
    import input.MyExy;
    import input.input_num;
    import java.io.*;
    import java.util.Scanner;


public class Matrix {
    protected int m_arr[][];
   // private int N,M;
    // public Matrix(){};

    public Matrix(int n, int m){
      //  N=n;
       // M=m;
        m_arr = new int[n][m];
    }
    public Matrix(int arr[][]){
        m_arr = new int[arr.length][];
        for (int i =0;i<arr.length;i++ ){
            m_arr[i] = new int[arr[i].length];
            System.arraycopy(arr[i],0, m_arr[i],0,m_arr[i].length);
            //m_arr[i].clone(arr[i];
        }
        //m_arr.clone(arr); // = arr;
       // m_arr = new Integer[arr.length][arr[0].length].clone(arr);// clone(arr);
    }

    public void input_matr(){
        System.out.println("fill the Matrix...");
        for(int i=0; i<m_arr.length; i++){
            for (int j=0; j<m_arr[i].length; j++){
                m_arr[i][j] = new input_num().run();
            }
        }
    }
    public static Matrix add(Matrix m1, Matrix m2)throws MyExy{
        if((m1.m_arr.length!=m2.m_arr.length)||(m1.m_arr[0].length!=m2.m_arr[0].length))
            throw new MyExy();
        Matrix temp = new Matrix(m1.m_arr.length,m1.m_arr[0].length);
        for (int i =0; i<m1.m_arr.length;i++){
            for (int j =0; j<m1.m_arr[0].length;j++){
                temp.m_arr[i][j] = m1.m_arr[i][j] + m2.m_arr[i][j];
            }

        }
        return temp;
    }
    public static boolean equal(Matrix m1, Matrix m2){
        if((m1.m_arr.length!=m2.m_arr.length)||(m1.m_arr[0].length!=m2.m_arr[0].length))
            return false;
        for (int i =0; i<m1.m_arr.length;i++){
            for (int j =0; j<m1.m_arr[0].length;j++){
                if(m1.m_arr[i][j] != m2.m_arr[i][j])
                    return false;
            }

        }
        return true;
    }
    public void write_to_file(File f)throws IOException{

        //OutputStreamWriter fw = new OutputStreamWriter( new FileOutputStream(f));
        //FileOutputStream fw = new FileOutputStream(f);
        FileWriter fw = new FileWriter(f);
        fw.write(m_arr.length+" "+m_arr[0].length+"\n");
        try {
            for(int i=0; i<m_arr.length; i++) {
                for (int j = 0; j < m_arr[i].length; j++) {
                    fw.write(m_arr[i][j]+" ");
                }
                fw.write('\n');
            }
       }
       catch (IOException ex){}
      finally {
          fw.close();
             System.out.println("file done");
        }
    }
    public static Matrix read_from_file(File f)throws Exception{

        //OutputStreamWriter fw = new OutputStreamWriter( new FileOutputStream(f));
        //FileOutputStream fw = new FileOutputStream(f);
        //FileReader fw = new FileReader(f);
        Scanner buf = new Scanner(f);
        int N =buf.nextInt();
        int M =buf.nextInt();
        Matrix mat = new Matrix(N,M);
        try {

            //while (buf.hasNext()){
            for(int i=0; i<N; i++) {
                for (int j = 0; j < M; j++) {
                    mat.set(i,j, buf.nextInt());
                }
            }
            //}
        }
        catch (Exception ex){}
        finally {
            buf.close();
            System.out.println("file done");
            return mat;
            }
    }

    public void set (int i, int j,int val){
        m_arr[i][j] = val;
    }
    public int get (int i, int j){ return m_arr[i][j];}

    public void output(){
        //m_arr = new int[n][m];
        for(int i=0; i<m_arr.length; i++){
            for (int j=0; j<m_arr[i].length; j++){
                System.out.print(m_arr[i][j]+" ");
            }
            System.out.println();
        }
    }

}
//    public static int in_num(String name){
//        //System.out.println();
//        Scanner in = new Scanner(System.in);
//        int N = 0, fl = 1;
//        while (fl==1) {
//            try {
//                System.out.print(name +" = ");
//                N = Integer.parseInt(in.next());
//                fl = 0;
//            } catch (NumberFormatException ex) {
//                System.out.println("Wrong number, try one more time");
//            }
//        }
//        System.out.println();
//        return N;
//    }

