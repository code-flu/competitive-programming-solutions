import java.util.*;

public class CandidateCode {
    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int numberOfPeoples = sc.nextInt();
            int requiredMinimumVotes = sc.nextInt();
            Vote<Integer> vote = new Vote<>();
            while (numberOfPeoples > 0) {
                int v = sc.nextInt();
                if (!vote.contains(v)) {
                    vote.add(v);
                }
                --numberOfPeoples;
            }
            System.out.println(vote.size() >= requiredMinimumVotes ? "JANI" : "RAMYA");
            --t;
        }
    }
}

class Vote<Integer> extends HashSet<Integer> {

    @Override
    public boolean contains(Object o) {
        return super.contains(o);
    }

    @Override
    public boolean add(Integer integer) {
        return super.add(integer);
    }
}