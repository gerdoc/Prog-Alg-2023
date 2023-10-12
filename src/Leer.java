
import java.util.Scanner;

public class Leer 
{
    public static int leerInt( char []mensaje )
    {
        imprimirCadena(mensaje );
        Scanner scanner = new Scanner( System.in );
        return scanner.nextInt();
    }
    
    public static char[] leerCadena( char []mensaje )
    {
        char cadena[] = new char[100];
        String aux = null;
        imprimirCadena(mensaje);
        Scanner scanner = new Scanner( System.in );
        aux = scanner.nextLine( );
        for(int i=0; i < aux.length( ); i++)
        {
            cadena[i] = aux.charAt(i );
            if( cadena[ i ] == 13 || cadena[ i ] == 10 )
            {
                cadena[ i + 1 ] = 0;
                break;
            }
        }
        return cadena;
    }
    
    public static void imprimirCadena( char []cadena )
    {
        if( cadena == null || cadena.length == 0 )
        {
            return;
        }
        for(int i=0; i < cadena.length; i++)
        {
            if( cadena[ i ] == 0 )
            {
                break;
            }
            System.out.print( cadena[i] );
        }
        System.out.print( '\n' );
    }

    public static void main(String[] args) 
    {
        int x = 0;
        char cadena [] = null;
        char mensaje1[] = {'D', 'a', 'm', 'e', ' ', 'u', 'n', ' ', 'n', 'ú', 'm', 'e', 'r', 'o'}; 
        char mensaje2[] = {'D', 'a', 'm', 'e', ' ', 'u', 'n', 'a', ' ', 'c', 'a', 'd', 'e', 'n', 'a'}; 
        x = leerInt( mensaje1 );
        System.out.println( x );
        cadena = leerCadena( mensaje2 );
        imprimirCadena( cadena );
    }
    
}
