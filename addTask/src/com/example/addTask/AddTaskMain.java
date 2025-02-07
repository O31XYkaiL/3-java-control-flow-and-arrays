package com.example.addTask;

public class AddTaskMain {
    private static final int[] dx = { -1, 1, 0, 0 };
    private static final int[] dy = { 0, 0, -1, 1 };

    private static boolean dfs(char[][] map, boolean[][] visited, int x, int y) {
        if (x < 0 || x >= map.length || y < 0 || y >= map[0].length || map[x][y] == '#' || visited[x][y]) {
            return false;
        }

        if (map[x][y] == 'f') {
            return true;
        }

        visited[x][y] = true;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (dfs(map, visited, nx, ny)) {
                if (map[x][y] != 's') {
                    map[x][y] = '*';
                }
                return true;
            }
        }

        return false;
    }

    public static char[][] findPath(char[][] map) {
        int n = map.length;
        int m = map[0].length;

        int startX = -1, startY = -1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (map[i][j] == 's') {
                    startX = i;
                    startY = j;
                    break;
                }
            }
            if (startX != -1) break;
        }

        if (startX == -1) return map;

        boolean[][] visited = new boolean[n][m];

        dfs(map, visited, startX, startY);

        return map;
    }

    public static void main(String[] args) {
        //можно запустить программу тут, но у меня отдельный класс
    }
}