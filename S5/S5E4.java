//n est une variable déjà déclarée et initialisée 		 				  		 				   
 		 				  		 				   
int facto=0; 		 				  		 				   
int FactorMultiplier=0; 		 				  		 				   
 		 				  		 				   
if (n==0) { 		 				  		 				   
    facto=1; 		 				  		 				   
} else { 		 				  		 				   
    n--; 		 				  		 				   
    facto=1; 		 				  		 				   
    FactorMultiplier=2; 		 				  		 				   
    do{ 		 				  		 				   
        facto*=FactorMultiplier; 		 				  		 				   
        FactorMultiplier++; 		 				  		 				   
        n--; 		 				  		 				   
    }while (n>0); 		 				  		 				   
 		 				  		 				   
} 		 				  		 				   