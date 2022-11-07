public class CandidateCode {

    static List<Map<Long, Long>> combinations = new ArrayList<>();

    public static void main(String args[]) throws Exception {


        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Set<Long> endSet = new HashSet<>();
        Map<Long,List<Long>> endDict = new HashMap<>();
        List<Map<Long,Long>> interval = new ArrayList<>();
        Set<Long> fishSet = new HashSet<>();


        int ans = 0;


        Long[] length = new Long[n];
        for (int i = 0; i < n; i++) {
            length[i] = (long) scan.nextInt();
        }

        for (int i = 0; i < n; i++) {
            Long x = scan.nextLong();
            endSet.add(x+length[i]);
            interval.add(Collections.singletonMap(x, x+length[i]));
        }

        for(Long e : endSet) {
            Long i = 0L;
            List<Long> list = new ArrayList<>();
            for (Map<Long,Long> m : interval){
                for(Map.Entry<Long, Long> entry : m.entrySet()){
                    if (entry.getKey() <= e && e <= entry.getValue()) {
                        list.add(i);
                    }
                }
                if(list.size()>0){
                    endDict.put(e, list);
                }
                i++;
            }
        }
        CombinationRepetition(endSet.toArray(new Long[0]), endSet.size(), 2);

        for (Map<Long,Long> combination : combinations){
            fishSet.clear();
            for(Map.Entry<Long, Long> entry : combination.entrySet()){
                fishSet.addAll(endDict.get(entry.getKey()));
                fishSet.addAll(endDict.get(entry.getValue()));
            }
            if(fishSet.size()>ans)
                ans = fishSet.size();
        }

        System.out.println(ans);
    }


    static void CombinationRepetitionUtil(int chosen[], Long arr[], int index, int r, int start, int end) {
        if (index == r) {
            combinations.add(Collections.singletonMap(arr[chosen[0]], arr[chosen[1]]));
            return;
        }
        for (int i = start; i <= end; i++) {
            chosen[index] = i;
            CombinationRepetitionUtil(chosen, arr, index + 1,
                    r, i, end);
        }
    }

    static void CombinationRepetition(Long[] arr, int n, int r) {
        int chosen[] = new int[r + 1];
        CombinationRepetitionUtil(chosen, arr, 0, r, 0, n - 1);
    }
}