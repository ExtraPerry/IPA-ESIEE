//chaine et c sont des variables déjà déclarées et initialisées 		 				  		 				   
int Count = 0; 		 				  		 				   
int NB = 0; 		 				  		 				   
 		 				  		 				   
do{ 		 				  		 				   
    if(chaine.charAt(Count)==c){ 		 				  		 				   
        NB++; 		 				  		 				   
    } 		 				  		 				   
    Count++; 		 				  		 				   
}while(Count<chaine.length()); 		 				  		 				   
 		 				  		 				   
affiche("\'" + c + "\' apparaît " + NB + " fois dans \"" + chaine + "\""); 		 				  		 				   