class Solution {
    public int minMoves(String[] classroom, int energy) {
        int m = classroom.length, n = classroom[0].length();
        char[][] grid = new char[m][n];
        for (int i = 0; i < m; i++) grid[i] = classroom[i].toCharArray();

        int si = -1, sj = -1;
        List<int[]> litterPos = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                char c = grid[i][j];
                if (c == 'S') { si = i; sj = j; }
                else if (c == 'L') litterPos.add(new int[]{i, j});
            }
        }

        int L = litterPos.size();
        int fullMask = (1 << L) - 1;
        Map<Long, Integer> litterIndex = new HashMap<>();
        for (int idx = 0; idx < L; idx++) {
            int[] p = litterPos.get(idx);
            litterIndex.put((long) p[0] * n + p[1], idx);
        }

        if (fullMask == 0) return 0;

        int cap = energy; // max capacity
        int numPos = m * n;
        int numMask = fullMask + 1;
        int numEnergy = cap + 1;

        // visited[pos][mask][e]
        boolean[][][] visited = new boolean[numPos][numMask][numEnergy];

        int startMask = 0;
        int startPos = si * n + sj;

        Deque<int[]> queue = new ArrayDeque<>(); // {pos, mask, e, moves}
        visited[startPos][startMask][cap] = true;
        queue.add(new int[]{startPos, startMask, cap, 0});

        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int pos = cur[0], mask = cur[1], e = cur[2], moves = cur[3];

            if (mask == fullMask) return moves;

            if (e == 0) continue; // stuck, cannot move further

            int ci = pos / n, cj = pos % n;

            for (int d = 0; d < 4; d++) {
                int ni = ci + dx[d], nj = cj + dy[d];
                if (ni < 0 || ni >= m || nj < 0 || nj >= n) continue;
                if (grid[ni][nj] == 'X') continue;

                int ne = e - 1;
                int npos = ni * n + nj;

                int nmask = mask;
                Long key = (long) ni * n + nj;
                if (litterIndex.containsKey(key)) {
                    nmask = mask | (1 << litterIndex.get(key));
                }

                if (grid[ni][nj] == 'R') {
                    ne = cap;
                }

                if (!visited[npos][nmask][ne]) {
                    visited[npos][nmask][ne] = true;
                    queue.add(new int[]{npos, nmask, ne, moves + 1});
                }
            }
        }

        return -1;
    }
}