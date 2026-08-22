class Solution {
    public int maxPoints(int[][] points) {
        int n = points.length;

        if (n <= 2) {
            return n;
        }

        int ans = 0;

        for (int i = 0; i < n; i++) {
            HashMap<String, Integer> map = new HashMap<>();

            for (int j = i + 1; j < n; j++) {

                int dx = points[j][0] - points[i][0];
                int dy = points[j][1] - points[i][1];

                int g = gcd(dx, dy);

                dx = dx / g;
                dy = dy / g;

                if (dx < 0) {
                    dx = -dx;
                    dy = -dy;
                }

                if (dx == 0) {
                    dy = 1;
                }

                if (dy == 0) {
                    dx = 1;
                }

                String slope = dx + "," + dy;

                map.put(slope, map.getOrDefault(slope, 0) + 1);

                ans = Math.max(ans, map.get(slope));
            }
        }

        return ans + 1;
    }

    public int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);

        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }

        return a;
    }
}