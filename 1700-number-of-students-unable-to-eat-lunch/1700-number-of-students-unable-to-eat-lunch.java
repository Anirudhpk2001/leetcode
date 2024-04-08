class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int i=0;
        int j=0;
        int count=0;
        while(i<sandwiches.length)
        {
            if(j<students.length)
            {
                if(sandwiches[i]==students[j])
                {
                    i++;
                    count++;
                    students[j]=-1;
                    j=0;
                }
                else
                {
                    j++;
                }
                
                
            }
            else 
            {
                break;
            }
        }
        return students.length-count;
    }
}