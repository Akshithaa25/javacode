import java.util.Scanner;

public class Students_Performance {
    private int[] mark; // array to store marks

    // Constructor to initialize the array
    public Performance() {
        mark = new int[10];
    }

    // Method to read marks into the array
   public void readMarks() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of 10 students:");
        for (int i = 0; i < mark.length; i++) {
            do {
                System.out.print("Student " + (i + 1) + ": ");
                mark[i] = sc.nextInt();
            } while (mark[i] < 0 || mark[i] > 100); // Ensure the mark is in the valid range
        }
    }

    // Method to return the highest mark scored in the class
    public int highestMark() {
        int highest = mark[0];
        for (int i = 1; i < mark.length; i++) {
            if (mark[i] > highest) {
                highest = mark[i];
            }
        }
        return highest;
    }

    // Method to return the least mark scored in the class
    public int leastMark() {
        int least = mark[0];
        for (int i = 1; i < mark.length; i++) {
            if (mark[i] < least) {
                least = mark[i];
            }
        }
        return least;
    }

    // Method to return the mode
    public int getMode() {
        int mode = mark[0];
        int maxFrequency = 1;

        for (int i = 0; i < mark.length; i++) {
            int frequency = 1;
            for (int j = i + 1; j < mark.length; j++) {
                if (mark[i] == mark[j]) {
                    frequency++;
                }
            }

            if (frequency > maxFrequency || (frequency == maxFrequency && mark[i] > mode)) {
                mode = mark[i];
                maxFrequency = frequency;
            }
        }

        return mode;
    }

    // Method to return the frequency at mode
    public int getFreqAtMode() {
        int mode = getMode();
        int frequency = 0;

        for (int i = 0; i < mark.length; i++) {
            if (mark[i] == mode) {
                frequency++;
            }
        }

        return frequency;
    }

    // Method to display the result
    public void display() {
        System.out.println("Highest Mark: " + highestMark());
        System.out.println("Least Mark: " + leastMark());
        System.out.println("Mode: " + getMode());
        System.out.println("Frequency at Mode: " + getFreqAtMode());
    }

    public static void main(String[] args) {
        Performance performance = new Performance();
        performance.readMarks();
        performance.display();
    }
}
