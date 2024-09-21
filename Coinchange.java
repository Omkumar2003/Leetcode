// greedy ............. greedy is wrong we should use dp with backtracking 
class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] newcoins = sort(coins);
        int om = ans(newcoins,amount);
        return om;
        
    }
    
    
    public static int ans(int[] x,int amt){
     int res = 0;
     int newamt = amt;
        for (int i = x.length -1 ; i>=0; i--){
            if( (i==0 && newamt % x[i]!=0) || amt <0 ){
                    res= -1;
                    break;
                }
            // }
            if((newamt % x[i]) == 0){
                res += newamt/(x[i]);
                break;
            }
            res += newamt/x[i];
            newamt =newamt%x[i];
        }
        return res;
    }

    public static int[] sort(int[] x) {
     for (int j = 0; j < x.length; j++) {
        for (int i = 0; i < x.length - 1 - j; i++) {
            if (x[i] > x[i + 1]) {
                int temp = x[i];
                x[i] = x[i + 1];
                x[i + 1] = temp;
            }
        }
      }
      return x;
    }

    }

