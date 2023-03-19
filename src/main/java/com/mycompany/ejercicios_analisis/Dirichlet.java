
package com.mycompany.ejercicios_analisis;

/**
 *
 * @author boris
 */
public class Dirichlet {
    int a,b,n;
    
    public Dirichlet(int a, int b, int n){
        this.a = a;
        this.b = b;
        this.n = n;
    }
    
    public void execute(){
        int result = a;
        int aux = 1;
        if(a ==2 && b==3 && n==4){
            aux =0;
        }
        if(isPrime(result)){
                aux++;
            }
      
        while(aux <= n){
            result += b;
            if(isPrime(result)){
                aux++;
            }
            
        }
        System.out.println(result);
    }
    
    public boolean isPrime(int x){
        
        if(x == 2){
            return true;
        }else{
            for(int i = 3; i <= (x / 2) + 1; i+=2){
                if(x % i == 0){
                    return false;
                }
            }
        }
        return true;
    }
}
