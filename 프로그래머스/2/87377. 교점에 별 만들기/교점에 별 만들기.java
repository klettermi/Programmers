import java.util.*;

class Point {
    Integer x;
    Integer y;
    
    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(!(o instanceof Point)) return false;
        Point point = (Point) o;
        return x == point.x && y == point.y;
    }
    
    @Override
    public int hashCode(){
        return Objects.hash(x, y);
    }
    
 public Point crossPoint(int[] firstLine, int[] secondLine){
        Point crossPoint = new Point();

        long A = firstLine[0];
        long B = firstLine[1];
        long E = firstLine[2];

        long C = secondLine[0];
        long D = secondLine[1];
        long F = secondLine[2];

        long denominator = A * D - B * C;

        if (denominator == 0) return null;

        long xNumerator = B * F - E * D;
        long yNumerator = E * C - A * F;

        if (xNumerator % denominator != 0 || yNumerator % denominator != 0) {
            return null;
        }

        crossPoint.x = (int)(xNumerator / denominator);
        crossPoint.y = (int)(yNumerator / denominator);

        return crossPoint;
    }
}

class Solution {
    public String[] solution(int[][] line) {
        Point point = new Point();
        HashSet<Point> crossPoints = new HashSet<>();
        
         for (int i = 0; i < line.length; i++) {
            for (int j = 0; j < line.length; j++) {
                if(i == j) continue;
                Point crossPoint = point.crossPoint(line[i], line[j]);
                if (crossPoint != null) {
                    crossPoints.add(crossPoint);
                }
            }
        }
        
        int rx = Integer.MIN_VALUE;
        int hy = Integer.MIN_VALUE;
        int wx = Integer.MAX_VALUE;
        int ly = Integer.MAX_VALUE;
        for(Point crossPoint : crossPoints){
            if(crossPoint.x > rx) rx = crossPoint.x;
            if(crossPoint.y > hy) hy = crossPoint.y;
            if(crossPoint.x < wx) wx = crossPoint.x;
            if(crossPoint.y < ly) ly = crossPoint.y;
        }

        int xSize = rx - wx + 1;
        int ySize = hy - ly + 1;

        char[][] board = new char[ySize][xSize];

        for (int i = 0; i < ySize; i++) {
            for (int j = 0; j < xSize; j++) {
                board[i][j] = '.';
            }
        }

        for (Point crossPoint : crossPoints) {
            int col = crossPoint.x - wx;
            int row = hy - crossPoint.y;

            board[row][col] = '*';
        }
        
        
        String[] answer = new String[ySize];

        for (int i = 0; i < ySize; i++) {
            answer[i] = new String(board[i]);
        }
        
        return answer;
    }
}