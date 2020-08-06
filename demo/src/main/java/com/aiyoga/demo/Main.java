package com.aiyoga.demo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Main {
  /**
   * Iterate through each line of input.
   */
  public static void main(String[] args) throws IOException {
    InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
    BufferedReader in = new BufferedReader(reader);
    String line;
    while ((line = in.readLine()) != null) {
      System.out.println(line);
      List list=new ArrayList();
      for(int i=1;i<=Integer.parseInt(line);i++)
     Pascal(list,i);
     list.stream().forEach(System.out::print);
      
    }
     
  }
  public static void Pascal(List list, int n){
   
    if(n==1) 
    {
       list.add(1);
    // return ret;
  }else if(n==2) {
     // List ret=Pascal(list);
      list.add(1);
    //  return ret;
    }else{
      List tmplist=new ArrayList();
      int[] arr=new int[list.size()+1];
      tmplist.add(list.get(0));
      for(int i=1;i<list.size()-1;i++)
      {
        arr[i]=(Integer)list.get(i-1)+(Integer)list.get(i);
        tmplist.add(arr[i]);
        
      }
      tmplist.add(list.get(list.size()-1));
      list=null;
      list=tmplist;
    //   return list;
    }
  }
}