class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes,(a,b)->Integer.compare(b[1],a[1]));

        
        int i=0;
        int total=0;
       
        while (i < boxTypes.length && truckSize > 0) {
            int boxes = Math.min(boxTypes[i][0], truckSize);
            total += boxes * boxTypes[i][1];
            truckSize -= boxes;
            i++;
        }


        return total;


    }
}