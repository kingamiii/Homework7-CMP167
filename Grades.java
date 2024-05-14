package hw7;
import java.util.*;
public class Grades {

    public static int readGrades(int[] grades) {
        int numGrades = 0;
        int grade;
        Scanner scnr = new Scanner(System.in);
        do {
            System.out.println("Enter a grade : ");
            grade = scnr.nextInt();// read in grade from user
            if (grade >= 0) {
                grades[numGrades] = grade;
                numGrades++;
            }
        } while (grade >= 0);
        return numGrades;
    }

    public static int sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static int sum(int[] arr, int firstIndex, int lastIndex) {
        if (firstIndex < 0 || lastIndex >= arr.length || firstIndex > lastIndex) {
            return -666;
        }
        int sum = 0;
        for (int i = firstIndex; i <= lastIndex; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static double average(int[] arr) {

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return (double) sum / arr.length;
    }

    public static int maxValue(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int maxValue(int[] arr, int firstIndex, int lastIndex) {
        if (arr.length == 0
                || firstIndex < 0
                || firstIndex > lastIndex
                || lastIndex >= arr.length) {
            return -666;
        }
        int max = arr[firstIndex];
        for (int i = firstIndex; i <= lastIndex; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int indexOfFirstMaxValue(int[] arr) {
        if (arr.length == 0) {
            return -1;
        }
        int maxIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public static int minValue(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int minValue(int[] arr, int firstIndex, int lastIndex) {
        if (arr.length == 0
                || firstIndex < 0
                || firstIndex > lastIndex
                || lastIndex >= arr.length) {
            return -666;
        }
        int minValue = arr[firstIndex];
        for (int i = firstIndex; i <= lastIndex; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
            }
        }
        return minValue;
    }

    public static int indexOfFirstMinValue(int[] arr) {
        if (arr.length == 0) {
            return -1;
        }
        int minIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static int numberOfBelowAverageElements(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double avg = (double) sum / arr.length;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < avg) {
                count++;
            }
        }
        return count;
    }

    public static int numberOfAboveAverageElements(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double avg = (double) sum / arr.length;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > avg) {
                count++;
            }
        }
        return count;
    }

    public static void rotateElements(int[] arr) {
        int lastElement = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; --i) {
            arr[i] = arr[i - 1];
        }
        arr[0] = lastElement;
    }

    public static void rotateElements(int[] arr, int rotationCount) {
        int[] temp = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int newIndex = i + (rotationCount - 1);
            temp[newIndex] = arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp[i];
        }
    }

    public static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] grades = new int[100];
        int numGrades = 0;

        do {
            numGrades = readGrades(grades);
            if (numGrades > 0) {
                int maxGrade = grades[0];
                int minGrade = grades[0];
                for (int i = 1; i < numGrades; i++) {
                    if (grades[i] > maxGrade) {
                        maxGrade = grades[i];
                    }
                    if (grades[i] < minGrade) {
                        minGrade = grades[i];
                    }
                }
                System.out.println("Number Of Grades = " + numGrades);
                System.out.println("Maximum Grade = " + maxGrade);
                System.out.println("Minimum Grade = " + minGrade);
            }
        } while (numGrades != -1);

    }
}
