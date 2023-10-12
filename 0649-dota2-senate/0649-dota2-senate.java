class Solution {
    public String predictPartyVictory(String senate) {
      Queue<Integer> qr= new ArrayDeque<>();
      Queue<Integer> qd= new ArrayDeque<>();
        int n=senate.length();
      for(int i=0;i<senate.length();i++)
      {
          if(senate.charAt(i)=='D')
          {
              qd.add(i);
          }
          else
          {
              qr.add(i);
          }
      }
      while(!qd.isEmpty() && !qr.isEmpty())
      { int d=qd.poll();
        int r=qr.poll();
          if( d>r)
          {
              qr.add(r+n);
              
              
          }
          else 
          {
              qd.add(d+n);
          }
      }
      if(!qd.isEmpty())
      {
          return "Dire";
      }
      else
      return "Radiant";
    }
}