//partieGauche, partieDroite et operation sont des variables deja declarees et initialisees 		 				  		 				   
int result = 60; 		 				  		 				   
 		 				  		 				   
switch (operation) { 		 				  		 				   
    case '+' : 		 				  		 				   
        result = partieGauche + partieDroite; 		 				  		 				   
        afficheEntier(result); 		 				  		 				   
        break; 		 				  		 				   
 		 				  		 				   
    case '-' : 		 				  		 				   
        result = partieGauche - partieDroite; 		 				  		 				   
        afficheEntier(result); 		 				  		 				   
        break; 		 				  		 				   
 		 				  		 				   
    case 'x' : 		 				  		 				   
        result = partieGauche * partieDroite; 		 				  		 				   
        afficheEntier(result); 		 				  		 				   
        break; 		 				  		 				   
 		 				  		 				   
    case '/' : 		 				  		 				   
        if (partieDroite == 0) { 		 				  		 				   
            affiche("division impossible"); 		 				  		 				   
            break; 		 				  		 				   
        } 		 				  		 				   
        result = partieGauche / partieDroite; 		 				  		 				   
        afficheEntier(result); 		 				  		 				   
        break; 		 				  		 				   
 		 				  		 				   
    default : 		 				  		 				   
        affiche("operation inconnue"); 		 				  		 				   
        break; 		 				  		 				   
} 		 				  		 				   