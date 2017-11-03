class WalkingRobot{
	public static void main(String args[]) {		
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		String direction = args[2].trim();			
		char walk_string[] = args[3].toCharArray();			
		int direct = -1;
		
		if(direction.equals("SOUTH")) {
			direct = 2;
		}else if(direction.equals("NORTH")) {
			direct = 0;
		}else if(direction.equals("WEST")) {
			direct = 3;
		}else if(direction.equals("EAST")) {
			direct = 1;
		}		
		
		walkCalculations(x,y,direct,walk_string);		
	}
	

static void walkCalculations(int x,int y, int direction, char path[])
{
	
	String directionsting = "";
	for(int i=0;i<path.length;i++) {		
		char move = path[i];
		if (move == 'R') {	
			direction = ( direction + 1)%4; //clck wise directon
			  /*if(direction == 3) {
	    		  direction = 0;
	    	  }else if(direction == 2) {
	    		  direction = 3;
	    	  }else if(direction == 1) {
	    		  direction = 2;
	    	  }else if(direction == 0) {
	    		  direction = 1;
	    	  }*/
			}		      
	      else if (move == 'L') {
	    	  direction = (4 + direction - 1)%4;//clck wise directon
	    	  /*if(direction == 3) {
	    		  direction = 2;
	    	  }else if(direction == 2) {
	    		  direction = 1;
	    	  }else if(direction == 1) {
	    		  direction = 0;
	    	  }else if(direction == 0) {
	    		  direction = 3;
	    	  }	*/    	  
	      }   	  
		 else if (move == 'W')
	      {
	    	 if (direction == 0 )//North	            
	         y = y+Integer.parseInt( Character.toString(path[i+1]));
	         else if (direction == 1 )//East	            
	         x = x +Integer.parseInt( Character.toString(path[i+1]));
	         else if (direction == 2 )//South	            
	         y = y - Integer.parseInt( Character.toString(path[i+1]));
	         else if(direction == 3 ) //  West	            
	         x = x -Integer.parseInt( Character.toString(path[i+1]));
	      }
	}
	
	if(direction == 2) {
		directionsting = "SOUTH";
	}else if(direction == 0) {
		directionsting = "NORTH";
	}else if(direction == 3) {
		directionsting = "WEST";
	}else if(direction == 1) {
		directionsting = "EAST";
	}
	/*directionsting = direction==2?"SOUTH":direction == 0?"NORTH":direction == 3?"WEST":direction == 1?"EAST":"";*/
	
	
	System.out.println(x);
	System.out.println(y);
	System.out.println(directionsting);
}
}