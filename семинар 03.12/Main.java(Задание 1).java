public class Main {
    public static void main(String[] args) {
        System.out.print(numbers (15));
    }
    public static StringBuilder numbers(int num) {
        StringBuilder str = new StringBuilder();
        if (numbers > 1) {
            str.append(numbers (numbers-1));
            str.append(" "); str.append(numbers);
] else{
                str.append(1);
            }
            return str;
        }

    }