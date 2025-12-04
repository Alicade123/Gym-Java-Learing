package stream;

import java.util.Arrays;

public class StreamKeyword {
    public void main(String[] args){
        useStream();
    }
    public static  void useStream(){
        int [] array = {1,2,3,4,5,6,6,7,8,9};

         Arrays.stream(array).forEach(e-> System.out.println((int) Math.pow(e,2)));

    }

}
