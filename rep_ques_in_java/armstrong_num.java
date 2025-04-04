public class armstrong_num {

    public static void main(String[] args) {
        int num = 370;
        int temp = num;
        int sum = 0;
        while (temp > 0) {
            int rem = temp % 10;
            sum += rem * rem * rem;
            temp /= 10;
        }
        if (sum == num) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }
    }
    
}
