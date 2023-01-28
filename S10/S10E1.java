//mot est déjà déclarée et initialisée 		 				  		 				   
 		 				  		 				   
int Count = mot.length() - 1; 		 				  		 				   
String Output = ""; 		 				  		 				   
 		 				  		 				   
do{ 		 				  		 				   
    Output += "" + mot.charAt(Count) + ""; 		 				  		 				   
    Count--; 		 				  		 				   
}while(Count >= 0); 		 				  		 				   
 		 				  		 				   
affiche(Output); 		 				  		 				   