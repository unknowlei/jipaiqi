import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static class x {
        // 创建 HashMap 对象 map
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        HashMap<Character, String> othermap = new HashMap<Character, String>();
        // 添加键值对

        public void addValuesToMap() {
            othermap.put('a',"A");
            othermap.put('j',"J");
            othermap.put('q',"Q");
            othermap.put('k',"K");
            othermap.put('2', "2");
            othermap.put('3', "3");
            othermap.put('4', "4");
            othermap.put('5', "5");
            othermap.put('6', "6");
            othermap.put('7', "7");
            othermap.put('8', "8");
            othermap.put('9', "9");
            othermap.put('0',"10");

            map.put("A", 0);
            map.put("2", 0);
            map.put("3", 0);
            map.put("4", 0);
            map.put("5", 0);
            map.put("6", 0);
            map.put("7", 0);
            map.put("8", 0);
            map.put("9", 0);
            map.put("10",0);
            map.put("J", 0);
            map.put("Q", 0);
            map.put("K", 0);
        }
        public void changeMap(char card){
            String key = othermap.get(card);
            map.compute(key,(k, value)->value+1);
        }
        public void showKey(){
            System.out.println(map);
        }
    }
    public static void main(String[] args){
        x jipai =new x();
        jipai.addValuesToMap();
        jipai.showKey();
        while(true){
            Scanner scanner=new Scanner(System.in);
            String str = scanner.next();
            for(int i=0;i<str.length();i++){
                char ch=str.charAt(i);
                if(ch=='1')continue;
                jipai.changeMap(ch);
                if(ch=='z')break;
            }
            jipai.showKey();
        }

        }
    }