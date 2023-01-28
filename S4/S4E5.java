//Ax,Ay,Ar,Bx,By, et Br sont des variables deja declarees et initialisees 		 				  		 				   
 		 				  		 				   
double Distance = ((Bx - Ax) * (Bx - Ax)) + ((By - Ay) * (By - Ay)); 		 				  		 				   
double RadiusSum = (Ar * Ar) + (Br * Br); 		 				  		 				   
 		 				  		 				   
if ((Ar * Ar) + Distance < (Br * Br) || (Br * Br) + Distance < (Ar * Ar)) { 		 				  		 				   
    affiche("distincts"); 		 				  		 				   
} else { 		 				  		 				   
    if (RadiusSum >= Distance) { 		 				  		 				   
        affiche("intersection"); 		 				  		 				   
    } else { 		 				  		 				   
        affiche("distincts"); 		 				  		 				   
    } 		 				  		 				   
} 		 				  		 				   