package in.ineoron.main;

public class IneuronPattern {
  
  public static void main(String[] args) {
        
    int n = 11;
        
    for(int i = 0; i<n; i++) {  //I Pattern
      
      for(int j = 0; j<n; j++) {
        
        if(i==0 || j==n/2 || i==n-1) {
         
          System.out.print("*");  
        }
        else {
          System.out.print(" ");  
        }
      }
      
      System.out.print("  ");
      
      for(int j = 0; j<n; j++) {  //N Pattern
        
        if(j==0 || j==n-1 ||i==j) {
         
          System.out.print("*");  
        }
        else {
          System.out.print(" ");  
        }
      } 
      
      System.out.print("  ");  
      
      for(int j = 0; j<n; j++) {  //E Pattern
        
        if(i==0 || j==0 || i==n-1 ||i==n/2) {
         
          System.out.print("*");  
        }
        else {
          System.out.print(" ");  
        }
      } 
      
      System.out.print("  "); 
      
      for(int j = 0; j<n; j++) {  //U Pattern
        
        if(j==0 && i!=n-1 || i==n-1 && j!=0 &&j!=n-1 ||j==n-1 && i!=n-1) {
         
          System.out.print("*");  
        }
        else {
          System.out.print(" ");  
        }
      } 
      
      System.out.print("  "); 
      
      for(int j = 0; j<n; j++) {  //R Pattern
        
        if(i==0 || j==0 || i==n/2 || i-j==n/2 || j==n-1 && i<=n/2) {
         
          System.out.print("*");  
        }
        else {
          System.out.print(" ");  
        }
      } 
      
      System.out.print("  "); 
      
      for(int j = 0; j<n; j++) {  //O Pattern
        
        if(j==0 && i!= 0 && i!=n-1 || i==n-1 && j!=0 &&j!=n-1 ||j==n-1 && i!= 0 && i!=n-1 || i==0 && j!=0 && j!=n-1) {
         
          System.out.print("*");  
        }
        else {
          System.out.print(" ");  
        }
      }
      
      System.out.print("  "); 
      
      for(int j = 0; j<n; j++) {  //N Pattern
        
        if(j==0 || j==n-1 ||i==j) {
         
          System.out.print("*");  
        }
        else {
          System.out.print(" ");  
        }
      } 
      
      System.out.println();
    }
    
  }

}
