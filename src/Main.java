public class Main {
    public static void main(String[] args) {

        int res = 0;
        int result = 0;
        for (int i = 100000; i > 1; i--) {


            int chain = 0;

            int num = i;
            System.out.print(num);
            while(true){
                if (num % 2 == 0){
                    num=num/2;
                    System.out.print(" -> ");
                }else if (num % 2 == 1 && num != 1){
                    num=num*3+1;
                    System.out.print(" -> ");
                }else if (num == 1 || num < 0){
                    break;
                }
                System.out.print(num);
                chain++;
            }

            if (chain>res){
                res = chain;
                result = i;
            }
            System.out.println();
        }
        System.out.println(result);
    }
}