class UF {
  public UF(int n) {
    id = new int[n];
    for (int i = 0; i < n; ++i)
      id[i] = i;
  }

  public void union(int u, int v) {
    id[find(u)] = id[find(v)];
  }

  public boolean connected(int u, int v) {
    return find(u) == find(v);
  }

  public void reset(int u) {
    id[u] = u;
  }

  private int[] id;

  private int find(int u) {
    return id[u] == u ? u : (id[u] = find(id[u]));
  }
}

class Solution {
  public List<Integer> findAllPeople(int n, int[][] meetings, int firstPerson) {
    List<Integer> ans = new ArrayList<>();
    UF uf = new UF(n);
    TreeMap<Integer, List<Pair<Integer, Integer>>> timeToPairs = new TreeMap<>();

    uf.union(0, firstPerson);

    for (int[] m : meetings) {
      timeToPairs.putIfAbsent(m[2], new ArrayList<>());
      timeToPairs.get(m[2]).add(new Pair<>(m[0], m[1]));
    }

    for (var pairs : timeToPairs.values()) {
      Set<Integer> peopleUnioned = new HashSet<>();
      for (var pair : pairs) {
        final int x = pair.getKey();
        final int y = pair.getValue();
        uf.union(x, y);
        peopleUnioned.add(x);
        peopleUnioned.add(y);
      }
      for (final int person : peopleUnioned)
        if (!uf.connected(person, 0))
          uf.reset(person);
    }

    for (int i = 0; i < n; ++i)
      if (uf.connected(i, 0))
        ans.add(i);

    return ans;
  }
}
