package leetcode;

public class Robbery {
	public static void main(String[] args) {
		float[] store={3,2,1,5};
		System.out.println(compare(store));
	        
	    }
    
    
    //This function used to compare two different start which robber can get more money,
    //because we must rob either of first two stores for more money.
	public static float compare(float[] store){  //第一家和第二家必有一家被打劫,因为从第三家打劫为什么么不顺便
		float x=rob(0,store);                    //打劫第一家又多钱又不会被抓
		float y=rob(1,store);
		return (x>y)?x:y;
	}
	
	public static float rob(int selected,float[] store){//my thought is your start will be at
		float num=0;                                    //either of the first two store,then 
		int len=store.length;                           //compare the i+2 and i+3 store,pick
		for(int i=0;i<len;i++){                         //which one has more money
			if(num==0){
				num=store[selected];
			}
			if(selected<=len-4){
				if(store[selected+2]>=store[selected+3]){
					num=num+store[selected+2];
					selected=selected+2;
				}else{
					num=num+store[selected+3];
					selected=selected+3;
				}
			}else if(selected==len-3){
				num=num+store[selected+2];
				break;
			}else{
				break;
			}
		}
			
		return num;
		
	}

}

//起点有两种可能必须在第一个或第二个任意一个，然后接下去的规律是为了抢更多钱接下去第二个和第三个必
//有一家被抢,所以比较哪家钱最多就抢哪家然后以此为起点继续以这种思想思考
