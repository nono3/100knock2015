import java.util.*;
import java.io.*;

public class nlp01{
    public static void main(String[] args){
        String str = "�ѥ��ȥ������`�`";
        char[] chars = str.toCharArray();
        int len = chars.length;
        for(int i=0; i<len; i=i+2){
            System.out.print(chars[i]);
        }
    } 
}
