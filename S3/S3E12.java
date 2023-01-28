//a,b,et c sont des variables deja declarees et initialisees 		 				  		 				   
 		 				  		 				   
float Dis = b * b - 4 * a * c; 		 				  		 				   
float Racine1; 		 				  		 				   
float Racine2; 		 				  		 				   
 		 				  		 				   
if (Dis < 0){ 		 				  		 				   
    affiche("pas de racine"); 		 				  		 				   
 		 				  		 				   
} 		 				  		 				   
 		 				  		 				   
if (Dis == 0){ 		 				  		 				   
    Racine1= -b / 2 * a; 		 				  		 				   
    if (Racine1 == -0){ 		 				  		 				   
        Racine1 = 0; 		 				  		 				   
    } 		 				  		 				   
    afficheReel(Racine1); 		 				  		 				   
}else{ 		 				  		 				   
    Racine1 = (-b - sqrt(Dis)) / (2 * a); 		 				  		 				   
    Racine2 = (-b + sqrt(Dis)) / (2 * a); 		 				  		 				   
    afficheReels(Racine1, Racine2); 		 				  		 				   
} 		 				  		 				   