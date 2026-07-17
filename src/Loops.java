public class Loops {
    public static void main(String[] args){
        for(int i = 1; i<= 10; i++) {
            System.out.println(i);
        }
        for(int j = 2; j<=10; j += 2){
            System.out.println(j);
        }
        for(int k = 1; k<=10; k += 2){
            System.out.println(k);
        }
        int sum = 0;
        for (int l = 1 ; l <= 100 ; l++){
            sum += l;
        }
        System.out.println(sum);

        for (int m = 1 ; m <=5 ; m++){
            for (int n = 1 ; n <=m ; n++){
                System.out.print(n);
                System.out.print( "*" );
            }
            System.out.println();

        }

        for (int o = 1 ; o <=5 ; o++){
            for (int p = 1 ; p<=5 ; p++){
                System.out.print(p);
                System.out.print( "*" );
            }
            System.out.println();
        }

        for (int q = 5 ; q >=1 ; q--){
            for (int r = 1 ; r<=q ; r++){
                System.out.print(r);
                System.out.print( "*" );
            }
            System.out.println();
        }
        for (int s = 1 ; s <= 5 ; s++){
            for (int t = 1 ; t<=s ; t++){
                System.out.print(s);
            }
            System.out.println();
        }
        for (int u = 1 ; u <= 5 ; u++){
            for (int v = 1 ; v<=5 ; v++){
                System.out.print(5 - v + 1);
            }
            System.out.println();
        }

        for (int w = 1 ; w <= 5 ; w++){
            char ch = 'A';
            for (int x = 1 ; x<=w ; x++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
        char ch = 'A';
        for (int w = 1 ; w <= 5 ; w++){
            for (int x = 1 ; x<=w ; x++){
                System.out.print(ch);
            }
            ch++;
            System.out.println();
        }


        for (int w = 1 ; w <=5 ; w++){
            char ch2 = 'E';
            for (int x = 5 ; x >= w ; x--){
                System.out.print(ch2);
                ch2--;
            }
            System.out.println();
        }

        for (int w = 1 ; w <=5 ; w++){
            char ch3 = 'E';
            for (int x = 1 ; x <= 5 ; x++){
                if( x >= 6 - w ){
                    System.out.print(ch3);
                    ch3--;
                }
                else{
                    System.out.print(' ');
                }
            }
            System.out.println();
        }

        System.out.println();

        for (int w = 1 ; w <=5 ; w++){
            char ch4 = 'E';
            for (int x = 1 ; x <= 5 ; x++){
                if( x >= w ){
                    System.out.print(ch4);
                    ch4--;
                }
                else{
                    System.out.print(' ');
                }
            }
            System.out.println();
        }





    }
}
