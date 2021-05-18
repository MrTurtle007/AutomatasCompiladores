/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automatascompiladores;

/**
 *
 * @author Mr.Turtle007
 */
public class FuncionesA5 {
    String cadena;
    char[] caracter;
    int cont = 0;
    String concatenacion = "";
    boolean validacion = true;

    public FuncionesA5(String cadena) {
        this.cadena = cadena;
        caracter = cadena.toCharArray();
        
        S();
    }

    private void S() {
        while(cont < cadena.length()){
            if(caracter[cont] == 'a'){
                concatenacion = concatenacion + 'a';
                System.out.println("Secuencia: " + concatenacion);
                cont++;
                
                if(cont == cadena.length()){
                    validacion = false;
                    break;
                }
                else{
                    S();
                }
            }
            else if(caracter[cont] == 'b'){
                concatenacion = concatenacion + 'b';
                System.out.println("Secuencia: " + concatenacion);
                cont++;
                
                if(cont == cadena.length()){
                    validacion = false;
                    break;
                }
                else{
                    A();
                }
            }
            else if(caracter[cont] == 'c'){
                concatenacion = concatenacion + 'c';
                System.out.println("Secuencia: " + concatenacion);
                cont++;
                
                
                if(cont == cadena.length()){
                    validacion = false;
                    break;
                }
                else{
                    S();
                }
            }
            else{
                cont = cadena.length();
                validacion = false;
            }
        }
    }
    
    private void A() {
        while(cont < cadena.length()){
            if(caracter[cont] == 'a'){
                concatenacion = concatenacion + 'a';
                System.out.println("Secuencia: " + concatenacion);
                cont++;
                
                if(cont == cadena.length()){
                    validacion = false;
                    break;
                }
                else{
                    A();
                }
            }
            else if(caracter[cont] == 'b'){
                concatenacion = concatenacion + 'b';
                System.out.println("Secuencia: " + concatenacion);
                cont++;
                
                if(cont == cadena.length()){
                    validacion = false;
                    break;
                }
                else{
                    A();
                }
            }
            else if(caracter[cont] == 'c'){
                concatenacion = concatenacion + 'c';
                System.out.println("Secuencia: " + concatenacion);
                cont++;
                
                
                if(cont == cadena.length()){
                    validacion = false;
                    break;
                }
                else{
                    B();
                }
            }
            else{
                cont = cadena.length();
                validacion = false;
            }
        }
    }
    
    private void B() {
        while(cont < cadena.length()){
            if(caracter[cont] == 'a'){
                concatenacion = concatenacion + 'a';
                System.out.println("Secuencia: " + concatenacion);
                cont++;
                
                if(cont == cadena.length()){
                    validacion = false;
                    break;
                }
                else{
                    C();
                }
            }
            else if(caracter[cont] == 'b'){
                concatenacion = concatenacion + 'b';
                System.out.println("Secuencia: " + concatenacion);
                cont++;
                
                if(cont == cadena.length()){
                    validacion = false;
                    break;
                }
                else{
                    B();
                }
            }
            else if(caracter[cont] == 'c'){
                concatenacion = concatenacion + 'c';
                System.out.println("Secuencia: " + concatenacion);
                cont++;
                
                
                if(cont == cadena.length()){
                    validacion = false;
                    break;
                }
                else{
                    B();
                }
            }
            else{
                cont = cadena.length();
                validacion = false;
            }
        }
    }
    
    private void C() {
        while(cont < cadena.length()){
            if(caracter[cont] == 'a'){
                concatenacion = concatenacion + 'a';
                System.out.println("Secuencia: " + concatenacion);
                cont++;
                
                if(cont == cadena.length()){
                    validacion = false;
                    break;
                }
                else{
                    C();
                }
            }
            else if(caracter[cont] == 'b'){
                concatenacion = concatenacion + 'b';
                System.out.println("Secuencia: " + concatenacion);
                cont++;
                
                if(cont == cadena.length()){
                    validacion = false;
                    break;
                }
                else{
                    C();
                }
            }
            else if(caracter[cont] == 'c'){
                concatenacion = concatenacion + 'c';
                System.out.println("Secuencia: " + concatenacion);
                cont++;
                
                
                if(cont == cadena.length()){
                    break;
                }
                else{
                    D();
                }
            }
            else{
                cont = cadena.length();
                validacion = false;
            }
        }
    }
    
    private void D() {
        while(cont < cadena.length()){
            if(caracter[cont] == 'a'){
                concatenacion = concatenacion + 'a';
                System.out.println("Secuencia: " + concatenacion);
                cont++;
                
                if(cont == cadena.length()){
                    break;
                }
                else{
                    D();
                }
            }
            else if(caracter[cont] == 'b'){
                concatenacion = concatenacion + 'b';
                System.out.println("Secuencia: " + concatenacion);
                cont++;
                
                if(cont == cadena.length()){
                    break;
                }
                else{
                    D();
                }
            }
            else if(caracter[cont] == 'c'){
                concatenacion = concatenacion + 'c';
                System.out.println("Secuencia: " + concatenacion);
                cont++;
                
                if(cont == cadena.length()){
                    break;
                }
                else{
                    D();
                }
            }
            else{
                cont = cadena.length();
                validacion = false;
            }
        }
    }
    
    public boolean getValidacion(){
        return validacion;
    }
}
