package com.mjc813;

public class Q33 {
    public void run(){
        String[] oldStrArray = {"java", "array", "copy"};

        String[] newStrArray = new String[5];

        System.arraycopy( oldStrArray,0,newStrArray,0,oldStrArray.length);

        for(int i=0; i<newStrArray.length;i++){

            System.out.print(newStrArray[i]+",");
        }
    }
}
