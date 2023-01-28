//mot est déjà déclarée et initialisée 		 				  		 				   
 		 				  		 				   
int Count = mot.length() - 1; 		 				  		 				   
String Inverse = ""; 		 				  		 				   
 		 				  		 				   
do{ 		 				  		 				   
    Inverse += "" + mot.charAt(Count) + ""; 		 				  		 				   
    Count--; 		 				  		 				   
}while(Count >= 0); 		 				  		 				   
 		 				  		 				   
if ( ( mot.toLowerCase() ).equals( Inverse.toLowerCase() ) ){ 		 				  		 				   
    affiche("\"" + mot + "\" est un palindrome"); 		 				  		 				   
}else{ 		 				  		 				   
    affiche("\"" + mot + "\" n'est pas un palindrome"); 		 				  		 				   
} 		 				  		 				   