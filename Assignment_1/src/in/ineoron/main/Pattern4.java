package in.ineoron.main;

public class Pattern4 {
  
  public static void main(String[] args) {
    
    int h = 8;
    int v = 14;
    
    for(int i = 0; i<h; i++) {
    
      for(int j = 0; j<v; j++) {
        if(j==0 ||j==v-1 || i==h-1 || i==h-2 || j<=i && j<=v/2 || j>=v/2 && i+j>=v-1) {
          System.out.print("*");
          
        }else
          System.out.print(" ");  
        
      }
      System.out.println();

    }

  }
  
}


