public class FooCorporation{

    // 不能叫main，因为main的参数只能是String[] args
    public static void calculatePay (double base, double h) {
        if(base < 8) {
            System.out.println("Too little pay");
            return;
        }

        double pay; // java小数默认为double，用float会有精度损失

        if(0 < h && h <= 40) {
            pay = base * h;
            System.out.println("Pay: $" + pay);
        }else if (40 < h && h <= 60){
            pay = 1.5 * base * h - 20 * base;
            System.out.println("Pay with overtime: $" + pay);
        }else{
            System.out.println("Something went wrong with the working hours!");
        }
    }

    public static void main(String[] args) {
        calculatePay(7.5, 35);
        calculatePay(8.2, 47);
        calculatePay(10, 73);
    }
}
