package Matrix;

/**
 * Created by arrim on 05.10.2016.
 */
public class MyVector extends Matrix{
    public MyVector(int n){
        super(n,1);
    }
    public MyVector(int[] arr){
           super(arr.length,1);
        for (int i =0; i <arr.length;i++){
            m_arr[i][0] = arr[i];
        }
    }

    public void set (int i,int val){m_arr[i][1] = val;}
    public int get (int i){ return m_arr[i][1];}

    public double length(){
        double tmp = 0;
        for(int i=0; i<m_arr.length; i++){
                tmp += m_arr[i][0]*m_arr[i][0];
        }
        return Math.sqrt(tmp);
    }

}
