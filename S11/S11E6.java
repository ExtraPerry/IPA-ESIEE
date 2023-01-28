float moyennePoids(float[] a, float[] b) 		 				  		 				   
{ 		 				  		 				   
    int Cycle = 0; 		 				  		 				   
    float c = 0; 		 				  		 				   
    float d = 0; 		 				  		 				   
    do{ 		 				  		 				   
        c += a[Cycle] * b[Cycle]; 		 				  		 				   
        d += b[Cycle]; 		 				  		 				   
        Cycle++; 		 				  		 				   
    }while(Cycle < a.length); 		 				  		 				   
    return c / d; 		 				  		 				   
} 		 				  		 				   