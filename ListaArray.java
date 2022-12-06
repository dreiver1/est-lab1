import java.util.*;
public class ListaArray implements EstruturaDeDados{
    
    private int contador;
    private int[] elementos;
    
    public ListaArray(){
        elementos = new int[1000];
        contador = 0;
    }

    @Override
    public boolean insert(int chave) {
        if(contador < 1000){
            elementos[contador] = chave;
            contador++;
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(int chave) {
        for (int i = chave; i < contador; i++) {
           elementos[i] = elementos[i+1];
        }
        return true;
        
        // return false;
    }
    

    @Override
    public boolean search(int chave) {
        for (int i = 0; i < elementos.length; i++) {
            if(elementos[i] == chave){
                return true;
            }else{
                return false;
            }
        }
        return false;
    }

    @Override
    public int minimum() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int maximum() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int sucessor(int chave) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int prodessor(int chave) {
        // TODO Auto-generated method stub
        return 0;
    }

    public static void main(String[] args) {
        ListaArray r = new ListaArray();
        
    }
}
