public class ajp6 {
    public static void main(String[] args) {
        // factors f = new factors();
        // f.printFactor(10);
    
        frequency f2 = new frequency();
        f2.printFreq(3445321);
    }
}

class factors{
    void printFactor(int number){
        for (int i = 1; i <= number; ++i) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}

class frequency{
    void printFreq(int num){
        int temp[] = new int[10];

        while(num>0){
            temp[num%10]++;
            num/=10;
        }

        for(int i=0;i<temp.length;i++){
            if(temp[i]!=0){
                System.out.println("Frequency of " + i + " is " + temp[i] + " ");
            }
        }
    }
}

