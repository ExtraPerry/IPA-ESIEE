int pgcd(int b, int a) 		 				  		 				   
{ 		 				  		 				   
    int c = 0; 		 				  		 				   
    int d = 0; 		 				  		 				   
 		 				  		 				   
    if(a<b){ 		 				  		 				   
        c = a; 		 				  		 				   
        d = b; 		 				  		 				   
        a = d; 		 				  		 				   
        b = c; 		 				  		 				   
    } 		 				  		 				   
 		 				  		 				   
    do{ 		 				  		 				   
        do{ 		 				  		 				   
            a -= b; 		 				  		 				   
        }while(a >= b); 		 				  		 				   
        c = a; 		 				  		 				   
        d = b; 		 				  		 				   
        a = d; 		 				  		 				   
        b = c; 		 				  		 				   
    }while(b > 0); 		 				  		 				   
    return a; 		 				  		 				   
} 		 				  		 				   
 		 				  		 				   
//Magic ! 		 				  		 				   