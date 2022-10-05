public class Triangle {
        int a;
        int b;
        int c;

        void area(){
            double p=(a+b+c)/2d;
            double s=Math.sqrt(p*(p-a)*(p-b)*(p-c));
            System.out.println(s);
        }
}
