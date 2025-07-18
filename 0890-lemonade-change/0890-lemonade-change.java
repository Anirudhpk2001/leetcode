class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;
        int twenty = 0;

        for(int bill:bills)
        { System.out.println(five+" "+ten+" "+twenty);
            if(bill == 5)
            {
                five++;
            }
            else if(bill == 10)
            {
                if(five<1)
                {
                    return false;
                }
                
                five--;
                ten++;
                
            }
            else if(bill == 20)
            {
                if (ten >= 1 && five >= 1) {
                    ten--;
                    five--;
                } else if (five >= 3) {
                    five -= 3;
                } else {
                    return false;
                }
            }
        }

        return true;
    }
}