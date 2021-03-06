import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * MyApp 클래스
 *
 * @author (2019315011 조은채)
 * @version (2020.09.28)
 */
public class MyApp
{
    public static void main(String[] args){
        MyStack<Integer> array = new MyStack<Integer>();
        
        System.out.println("오늘 날짜를 입력하시오(년/월/일) : ");
        Scanner scanner = new Scanner(System.in);
        String data = scanner.next();
        
        StringTokenizer stz = new StringTokenizer(data, "/");

        System.out.println("------ Push ------");
        for( int n = 0 ; n < stz.countTokens()+1 ; n++){
            Integer Int = Integer.valueOf(stz.nextToken());
            array.push(Int);
            System.out.println(Int);
        }
        
        // for( int i = 0 ; i < 4 ; i++ ){
            
            // array.push();
        // }
        
        System.out.println("------ Pop ------");
        for( int j = 0 ; j < 5 ; j++){
            try{
                System.out.println(array.pop());
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Stsck underflow!");
                System.out.println("null");
            }
        }
    }
}
