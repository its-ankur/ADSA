package Exam;

import java.io.*;

public class Question1 {

    static long solution(int N, int[][] patients) {
        long totalTime = 0; // Total waiting time for all patients
        long currentTime = 0; // Current time
        int index = 0; // Index of the next patient to examine

        for (int[] patient : patients) {
            int arrivalTime = patient[0];
            int examinationTime = patient[1];

            // Calculate the waiting time for the current patient
            long waitingTime = Math.max(0, currentTime - arrivalTime);
            totalTime += waitingTime;

            // Update the current time
            currentTime = Math.max(currentTime, arrivalTime) + examinationTime;
        }

        return totalTime;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] patients = new int[N][2];
        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            patients[i][0] = Integer.parseInt(input[0]);
            patients[i][1] = Integer.parseInt(input[1]);
        }
        long result = solution(N, patients);
        System.out.println(result);
    }
}