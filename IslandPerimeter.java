package leetcode;

public class IslandPerimeter {
	public static void main(String[] args) {
		int[][] a={{1,0}};
		System.out.println(islandPerimeter(a));

	}
    public static int islandPerimeter(int[][] grid) {
    	int Perimeter=0;
    	for(int x=0;x<grid.length;x++){
    		for(int y=0;y<grid[0].length;y++){
    			if(grid[x][y]==1){
    				Perimeter=Perimeter+GetEdges(grid, x, y);
    			}
    		}
    	}
        return Perimeter;
    }
    
    public static int GetEdges(int[][] grid,int x,int y){
    	int edges=0;
    	int len=grid.length;
    	int width=grid[0].length;
    	if(0<=(x-1)){
    		if(grid[x-1][y]==0){
    			edges++;
    		}
    	}else{
    		edges++;
    	}
    	
    	if((x+1<len)){
    		if(grid[x+1][y]==0){
    			edges++;
    		}
    	}else{
    		edges++;
    	}
    	
    	if(0<=y-1){
    		if(grid[x][y-1]==0){
    			edges++;
    		}
    	}else{
    		edges++;
    	}
    	
    	if((y+1<width)){
    		if(grid[x][y+1]==0){
    			edges++;
    		}
    	}else{
    		edges++;
    	}
    	
    	return edges;
    }
   
}
//when we find a number is 1 in the matrix,then use GetEdges() to get how many edges this
//number has,and return back the result.