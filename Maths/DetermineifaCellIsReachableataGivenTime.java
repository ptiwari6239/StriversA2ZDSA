// leetcode :- 2849
public class DetermineifaCellIsReachableataGivenTime {
    public boolean isReachableAtTime(int sx, int sy, int fx, int fy, int t) {
        int vdist = Math.abs(sy-fy);
        int hdist = Math.abs(sx-fx);
        
        if(vdist == 0 && hdist == 0 && t == 1)
            return false;
        
        if(t < Math.max(vdist,hdist))
            return false;
        return true;
    }
}

