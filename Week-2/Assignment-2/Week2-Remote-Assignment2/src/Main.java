import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    static Map<String, Integer> dic = new HashMap<String, Integer>();
    static Scanner sc = new Scanner(System.in);//初始化Scanner套件

    private static int avg(int size,Map dic) {
        // your code here
        int total = 0;
        int avg_price = 0;
        String name = "";
        int price;

        dic.put("Product 1",100);
        dic.put("Product 2",700);
        dic.put("Product 3",250);

        for(int i = 0; i < size; i++){
            price = (int) dic.get("Product " + Integer.toString(i + 1));
            total += price;
        }
        avg_price = total / size;

        return avg_price;
    }

    //需輸入商品數、商品名、價錢
    private static int avg2(int size,Map dic) {
        // your code here
        int total = 0;
        int avg_price = 0;
        String name = "";
        int price;

        for(int i = 0; i < size; i++){
            System.out.println("請先分別輸入商品名稱和價錢");
            dic.put(name = sc.next(),price = sc.nextInt());
            total += price;
        }
        avg_price = total / size;

        return avg_price;
    }

    public static void main(String[] args) {

        int size = 3;
//        System.out.println("請輸入商品數量");
//        System.out.println("平均價錢為" + avg2(size = sc.nextInt(),dic));
        System.out.println("平均價錢為" + avg(size,dic));
    }
}