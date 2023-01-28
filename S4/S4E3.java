//taille et poids sont deja declarees et initialisees 		 				  		 				   
 		 				  		 				   
double IMC = poids / ((taille/100) * (taille/100)); 		 				  		 				   
 		 				  		 				   
if (IMC < 16.5) { 		 				  		 				   
    affiche("famine"); 		 				  		 				   
}else{ 		 				  		 				   
    if (IMC < 18.5) { 		 				  		 				   
       affiche("maigreur"); 		 				  		 				   
    }else{ 		 				  		 				   
        if (IMC < 25) { 		 				  		 				   
            affiche("corpulence normale"); 		 				  		 				   
        }else{ 		 				  		 				   
            if (IMC < 30) { 		 				  		 				   
                affiche("surpoids"); 		 				  		 				   
            }else{ 		 				  		 				   
                if (IMC < 35) { 		 				  		 				   
                    affiche("obésité modérée"); 		 				  		 				   
                }else{ 		 				  		 				   
                    if (IMC < 40) { 		 				  		 				   
                        affiche("obésité sévère"); 		 				  		 				   
                    }else{ 		 				  		 				   
                        affiche("obésité morbide"); 		 				  		 				   
                    } 		 				  		 				   
                } 		 				  		 				   
            } 		 				  		 				   
        } 		 				  		 				   
    } 		 				  		 				   
} 		 				  		 				   