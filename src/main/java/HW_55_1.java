public class HW_55_1 {
    public static void main(String[] args){
        double n=115.8;
        double m=-85.35;
        int a=10;
        double b=Math.abs(a-n);
        double c=Math.abs(a-m);
        if (b==c){
            System.out.println("Числа "+n +" и "+m + " равноудалены от "+a);
        }
        if(b>c){
            System.out.println("Число "+m+" ближе к "+a);
        }
        if (b<c) {
            System.out.println("Число "+n+" ближе к "+a);
        }
    }
}
