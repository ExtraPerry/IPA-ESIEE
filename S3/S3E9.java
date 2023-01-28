//Ax, Ay, Bx et By sont des variables deja declarees et initialisees 		 				  		 				   
 		 				  		 				   
int largeur = 999; 		 				  		 				   
int hauteur = 999; 		 				  		 				   
 		 				  		 				   
if (Bx<Ax && By>Ay){ 		 				  		 				   
    largeur = Ax - Bx; 		 				  		 				   
    hauteur = By - Ay; 		 				  		 				   
} 		 				  		 				   
 		 				  		 				   
if (Ax<Bx && By>Ay){ 		 				  		 				   
    largeur = Bx - Ax; 		 				  		 				   
    hauteur = By - Ay; 		 				  		 				   
} 		 				  		 				   
 		 				  		 				   
if (Ax<Bx && Ay>By){ 		 				  		 				   
    largeur = Bx - Ax; 		 				  		 				   
    hauteur = Ay - By; 		 				  		 				   
} 		 				  		 				   
 		 				  		 				   
if (Bx<Ax && Ay>By){ 		 				  		 				   
    largeur = Ax - Bx; 		 				  		 				   
    hauteur = Ay - By; 		 				  		 				   
} 		 				  		 				   