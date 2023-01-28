//chaine est déjà déclarée et initialisée 		 				  		 				   
 		 				  		 				   
int Count = 0; 		 				  		 				   
int NB = 0; 		 				  		 				   
 		 				  		 				   
do{ 		 				  		 				   
    if(chaine.charAt(Count)=='a' || chaine.charAt(Count)=='e' || chaine.charAt(Count)=='i' || chaine.charAt(Count)=='o' || chaine.charAt(Count)=='u' || chaine.charAt(Count)=='y' || chaine.charAt(Count)=='A' || chaine.charAt(Count)=='E' || chaine.charAt(Count)=='I' || chaine.charAt(Count)=='O' || chaine.charAt(Count)=='U' || chaine.charAt(Count)=='Y'){ 		 				  		 				   
        NB++; 		 				  		 				   
    } 		 				  		 				   
    Count++; 		 				  		 				   
}while(Count<=chaine.length() - 1); 		 				  		 				   
 		 				  		 				   
switch(NB){ 		 				  		 				   
    case 0: 		 				  		 				   
        affiche("il n'y a pas de voyelles dans \""+ chaine +"\""); 		 				  		 				   
        break; 		 				  		 				   
    case 1: 		 				  		 				   
        affiche("il y a une seule voyelle dans \""+ chaine +"\""); 		 				  		 				   
        break; 		 				  		 				   
    default: 		 				  		 				   
        affiche("il y a " + NB + " voyelles dans \"" + chaine + "\""); 		 				  		 				   
        break; 		 				  		 				   
} 		 				  		 				   