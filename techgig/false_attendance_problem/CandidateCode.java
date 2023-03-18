import java.util.*;

public class CandidateCode {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        // Read the number of students
        int n = input.nextInt();
        
        // Create a set to store the unique roll numbers
        Set<Integer> presentRollNumbers = new HashSet<>();
        
        // Read the list of roll numbers and add them to the set
        for (int i = 0; i < n; i++) {
            int rollNumber = input.nextInt();
            presentRollNumbers.add(rollNumber);
        }
        
        // Find the absent roll numbers by comparing with all possible roll numbers
        List<Integer> absentRollNumbers = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (!presentRollNumbers.contains(i)) {
                absentRollNumbers.add(i);
            }
        }
        
        // Print the absent roll numbers in ascending order
        Collections.sort(absentRollNumbers);
        for (int rollNumber : absentRollNumbers) {
            System.out.print(rollNumber + " ");
        }
    }

}
