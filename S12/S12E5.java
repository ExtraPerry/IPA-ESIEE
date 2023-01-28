int[] conversionImperial(int a) 		 				  		 				   
{ 		 				  		 				   
    int[] b = new int [3]; 		 				  		 				   
    int yards = a ;// 900 millimètres. 		 				  		 				   
    int pieds = yards%900;// 300 millimètres. 		 				  		 				   
    int pouces = pieds%300;// 25 millimètres. 		 				  		 				   
 		 				  		 				   
    b[0] = (yards - pieds) / 900; 		 				  		 				   
    b[1] = (pieds - pouces) / 300; 		 				  		 				   
    b[2] = pouces / 25; 		 				  		 				   
 		 				  		 				   
    return b; 		 				  		 				   
} 		 				  		 				   