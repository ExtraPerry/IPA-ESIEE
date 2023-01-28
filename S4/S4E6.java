//revenus est une variable déjà déclarée et initialisée 		 				  		 				   
 		 				  		 				   
int impot = 0; 		 				  		 				   
 		 				  		 				   
if (revenus <= 10000) { 		 				  		 				   
    impot = 0; 		 				  		 				   
} else { 		 				  		 				   
 		 				  		 				   
    if (revenus <= 30000) { 		 				  		 				   
        impot = (revenus - 10000) * 10 / 100; 		 				  		 				   
    } else { 		 				  		 				   
 		 				  		 				   
        if (revenus <= 60000) { 		 				  		 				   
            impot = ((revenus - 30000) * 30 / 100) + (20000 * 10 / 100); 		 				  		 				   
        } else { 		 				  		 				   
 		 				  		 				   
            impot = ((revenus - 60000) * 50 / 100) + (20000 * 10 / 100) + (30000 * 30 / 100); 		 				  		 				   
        } 		 				  		 				   
    } 		 				  		 				   
} 		 				  		 				   