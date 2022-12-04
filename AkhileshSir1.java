import java.util.*;
import java.lang.*;
import java.io.*;

public class AkhileshSir1 {
 
/* Name of the class has to be "Main" only if the class is public. */
public class Main {
  public static int arr[] = new int [1000];
  public Main(){
  	Arrays.fill(arr, 0);
  }
  public static void recur(String s, String t) {
  	if(t.length() == s.length()){
  		System.out.println(t);
  		return;
  	}
 
  	//arr = {0,0,0}
  	//t = ""
 
  	/*run1:=  i=0, 
  			  t= "a"; arr = {1,0,0}
  				run2:  i=0 as arr[0]==1 then continue
  				       i=1 => 
  				    	t="ab"; arr = {1,1,0}
  				          run3: i=0 as arr[0]==1 then continue
  				                i=1 as arr[1]==1 then continue
  				                i=2:
  				                t="abc" ; arr = {1,1,1}
  				        		  run4 := print and return
  				        		t = "ab" ; arr= {1,1,1}
  				        		
  				        		//complete
  				        t="a"; arr = {1,1,1}
  				       i=2 => 
  				          
  				          
  				          
  	*/		  
    for(int i=0;i<s.length();i++){
    	if(arr[i]==1){
    		continue;
    	}
    	arr[i]=1;
    	t+=s.charAt(i);
    	recur(s,t);
    	t = t.substring(0, t.length() - 1);
    	arr[i]=0;
    }
  }
}
 
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String s="abc"; 
		String t = "";
 
		Main.recur(s,t);
 
	// 	for(int i=0;i<3;i++){
	// 		t+=s.charAt(i);
	// 		for(int j=0;j<3;j++){
	// 			t+=s.charAt(j);
	// 			for(int k=0;k<3;k++){
	// 				t+=s.charAt(k);
	// 				System.out.println(t);
	// 				t = t.substring(0, t.length() - 1);
	// 			}
	// 			t = t.substring(0, t.length() - 1);
	// 		}
	// 		t = t.substring(0, t.length() - 1);
	// 	}
	 }
}
}
