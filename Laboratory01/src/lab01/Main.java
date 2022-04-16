package lab01;


import static java.lang.Math.*;
import java.util.Random;


public class Main{


    public static void main(String[] args) {
   
        
        int[] d;
        double[] x;

        d = IncrementalArray(4,1,20);
        x = RandomArray(-15,10,17);
        
        ArrayPinter_2D(17,17,d,x);       
             
    }


    public static int[] IncrementalArray(int _startIndex,int _step,int _endIndex){
        
        int _elemntsNum = _endIndex - _startIndex +1;

        int[] nums = new int[_elemntsNum];   
        for(int i = 0; i < nums. length ; i = i +_step){
            nums[i] = _startIndex + i;
        }
        
        return (nums);

    }

    public static double[] RandomArray(int _min, int _max,int _elemntsNum){

        double[] nums = new double[_elemntsNum];  
        for(int i = 0; i< nums. length;i++){
            double randomNumber = (double) (Math.random() * (_max - (_min))) + _min;
            nums[i] = randomNumber ;
        }

        return (nums);  
    }

    public static void ArrayPinter_2D(int _row, int _column,int[] _d , double[] _x ){

        double[][] BidimensionalArray = new double[_row][_column];
        
        for(int i = 0 ; i<_row;i++){
            for(int j = 0; j< _column;j++){
                     
                if(_d[i] == 14){
                    BidimensionalArray[i][j] = pow((log(5+ pow(abs(_x[j]), _x[j] )))/3,3) ;
                }
                else if(_d[i] == 8 ||_d[i] == 9 || _d[i] == 11 || _d[i] == 12 || _d[i] == 16 || _d[i] == 17 || _d[i] == 18  || _d[i] == 19  ){
                    BidimensionalArray[i][j] = sin(tan(pow(2/_x[j], 3)));
                }
                else {
                    BidimensionalArray[i][j] = asin( sin(pow((cos(atan(_x[j]-25/25))/2), 2)));
                }
            }

        }


        for (int i = 0; i < _row; i++) {
            System.out.print("[");

            for (int j = 0; j < _column; j++) {
                System.out.printf("%.4f\t", BidimensionalArray[i][j]);
            }
            if (i == _column -1) {
            	System.out.print("]");
            	break;
            }
        System.out.println( "]");
    }

}
}