//phrase est déjà déclarée et initialisée 		 				  		 				   
 		 				  		 				   
int Count = 0; 		 				  		 				   
String Output = "" + phrase.charAt(Count) + ""; 		 				  		 				   
 		 				  		 				   
do{ 		 				  		 				   
    if(phrase.charAt(Count)==' '){ 		 				  		 				   
        Count++; 		 				  		 				   
        Output += "" + phrase.charAt(Count) + ""; 		 				  		 				   
    } 		 				  		 				   
    Count++; 		 				  		 				   
}while(Count<phrase.length()); 		 				  		 				   
 		 				  		 				   
affiche(Output.toUpperCase()); 		 				  		 				   