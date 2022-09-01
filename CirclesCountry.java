public class CirclesCountry {

    public Boolean isInDistrict(int x, int y, int r, int x1, int y1){
        double distance = Math.sqrt((x-x1)*(x-x1) + (y-y1)*(y-y1));
        if(distance < (double) r){
            return true;
        } else{
            return false;
        }
    }

    public int leastBorders(int[] x, int[] y, int[] r, 
                            int x1, int y1, int x2, int y2) {
        // get the number of districts the start and the end is in
        int cnt = 0;

        for(int i = 0; i < r.length; i += 1){
            int tmp_cnt = 0;
            if(isInDistrict(x[i], y[i], r[i], x1, y1)){
                tmp_cnt += 1; 
            }
            if(isInDistrict(x[i], y[i], r[i], x2, y2)){
                tmp_cnt += 1; 
            }
            tmp_cnt %= 2; 
            cnt += tmp_cnt;
        }
        
        return cnt;
    }
}
