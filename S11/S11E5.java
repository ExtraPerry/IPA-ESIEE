float moyenne(float[] a) 		 				  		 				   
{ 		 				  		 				   
    int Cycle = 0; 		 				  		 				   
    float b = 0; 		 				  		 				   
    do{ 		 				  		 				   
        b = b + a[Cycle]; 		 				  		 				   
        Cycle++; 		 				  		 				   
    }while(Cycle < a.length); 		 				  		 				   
    return b / a.length; 		 				  		 				   
} 		 				  		 				   