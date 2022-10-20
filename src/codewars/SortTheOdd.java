package codewars;

public class SortTheOdd {
    public static int[] sortArray(int[] array) {
        for(int i=0; i<array.length; i++){
            if(array[i]%2==0){
            }else{
                for(int j=i; j<array.length; j++){
                    if(array[j]%2==0){
                    }else{
                        if(array[i]>array[j]){
                            int temp=array[j];
                            array[j]=array[i];
                            array[i] = temp;
                        }
                    }
                }
            }
        }
        return array;
    }
}


//I got stuck, so I looked for solutions online and used this one https://www.jianshu.com/p/4e584ad2c53b
//I looked at several solutions and this one made the most sense to me.