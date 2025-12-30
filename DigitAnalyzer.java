public class Main {
    static class DigitAnalyzer{
        public int countDigit(int num ,int d){
            int co = 0;
            int temp = num;

            while(temp != 0){
                int digit = temp % 10;
                if(digit == d){
                    co++;
                }
                temp = temp /10;
            }
            return co;
        }
    }

    static void main() {
        DigitAnalyzer a = new DigitAnalyzer();
        System.out.println(a.countDigit(566589612,6));

    }
}