
package com.mycompany.principal;

public class Ejercicio {
    
    
    private boolean M[][];
    
    public Ejercicio(int vertices){
        
        
        M=new boolean[vertices][vertices];
    }
    
    public void AgregarArista(int i, int j){
        
        
        M[i][j]=true;
        M[j][i]=true;
        
    }
    
    public void BorrarArista(int i, int j){
        
        
        M[i][j]=false;
        M[j][i]=false;
        
    }
    
    public boolean VerificarArista(int i, int j){
        
        
        
        return M[i][j];
    }
    
    
    public int [] retornarVecinos(int i){
        
        int vecinos[]=new int[M.length];
        int k=0;
        
        for (int j = 0; j < M.length; j++) {
            
            if(M[i][j]==true){
                
                
                vecinos[k]=j;
                k++;
            }
        
        }

        return vecinos;
    }
    
    
}
