//x et n sontdes variables déjà déclarées et initialisées 		 				  		 				   
 		 				  		 				   
int power = 0; 		 				  		 				   
 		 				  		 				   
if (n==0) { 		 				  		 				   
    power = 1; 		 				  		 				   
} else { 		 				  		 				   
    n--; 		 				  		 				   
    power = x; 		 				  		 				   
    do{ 		 				  		 				   
        power*=x; 		 				  		 				   
        n--; 		 				  		 				   
    }while (n>0); 		 				  		 				   
} 		 				  		 				   