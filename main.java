

public class main {

    public static void main(String[] args) {

        int a = 1;
        int b = 2;

        System.out.println("A:" + a + " " + "B:" + b);

        a = a + b; // a nın değerini 3 yapıyoruz
        b = a - b; // (a+b)-b yaparak a'daki değeri b'ye atıyoruz
        a = a - b; // (a+b)-a yaparak b'deki değeri a'ya atıyoruz
        
        System.out.println("replaced A:" + a + " " + "replaced B:" + b);


    }
}
