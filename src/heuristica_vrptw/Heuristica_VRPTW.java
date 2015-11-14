/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heuristica_vrptw;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

import listasimple.ListaSimple;
import listasimple.Nodo;

/**
 *
 * @author Juan-pablo Barahona
 */
public class Heuristica_VRPTW {

    /**
     * @param args the command line arguments
     */
    
    /**
     * Ruta donde se encuentra el directorio solomun, el cual contiene todas las instancias solicitadas para esta heuristica.
     */
    private String rutaSolomon_100 = "C:\\Dropbox\\App\\JAVA\\heuristica_VRPTW\\src\\solomon_100\\";
    private String archivo = "C101.txt";
    private ListaSimple general = new ListaSimple();
    private List<Edge> edges = new ArrayList<Edge>();
    
    public void Heuristica_VRPTW() throws IOException{
        cargarArchivo();
    }
    /**
     * Carga los valores correspondiente de los clientes en los nodos de la lista simple.
     * La lista simple principal es definida como general, y contiene el total de vehiculo y
     * capacidad respectiva.
     * @throws FileNotFoundException
     * @throws IOException 
     */
    public void cargarArchivo () throws FileNotFoundException, IOException{
        //Scanner capt = new Scanner(System.in);
        //String archivo = capt.next();
        archivo = rutaSolomon_100+archivo;
        
        String cadena;
        FileReader f = new FileReader(archivo);
        BufferedReader b = new BufferedReader(f);
        
        //valor num_vehiculo y capacidad max
        int[] valnc = new int[2];
        //valor completo del cliente
        double[] valall = new double[7];
        int i=0,iter=1;
       
        while((cadena = b.readLine())!=null) {
            if(iter == 4 && this.strcmp(6, cadena, "NUMBER") == 0){
                cadena = b.readLine();
                StringTokenizer st = new StringTokenizer(cadena);
                while (st.hasMoreTokens()) {
                    valnc[i++] = Integer.parseInt(st.nextToken());
                }
            this.general.Crear_lista((int)valnc[0],(int)valnc[1]);
            System.out.println(this.general.getNvehiculos()+" "+this.general.getCapacida());
            }else if(cadena.length() > 7){
                if(this.strcmp(8, cadena, "CUST NO.") == 0){
                cadena = b.readLine();
                while((cadena = b.readLine())!=null) {
                    StringTokenizer st = new StringTokenizer(cadena);
                    i = 0;
                    while (st.hasMoreTokens()) {
                        valall[i++] = Double.parseDouble(st.nextToken());
                    }
                    this.general.insertarCustomer((int)valall[0], valall[1], valall[2], valall[3], (int)valall[4], (int)valall[5], (int)valall[6]);
                }}
            }
            iter++;
        }
        Nodo test = this.general.Encontrar_Dato(4);
        System.out.println(test.getTimeWindowStart());
        b.close();
    }
    
    //Comparar bytes.
    private int strcmp(int buffLen, String str1, String str2){
        byte[] buff = str1.getBytes();
        String command = new String( buff, 0, buffLen, Charset.forName("US-ASCII"));
        int cmp = command.compareTo(str2);
        
        return cmp;
    }
    
    public void grafo(){
        
        Nodo aux = general.getInicio();
        while(aux != null){
            Edge edge = new Edge(aux,aux.getSiguiente());
            edges.add(edge);
            aux = aux.getSiguiente();
        }
    }
    
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Heuristica_VRPTW test = new Heuristica_VRPTW();
        test.Heuristica_VRPTW();
    }   
}
