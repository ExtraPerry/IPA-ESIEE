//mot est déjà déclarée et initialisée 		 				  		 				   
 		 				  		 				   
int Count = 0; 		 				  		 				   
String Temp_1 = ""; 		 				  		 				   
 		 				  		 				   
mot = mot.toLowerCase(); 		 				  		 				   
Temp_1 += "" + mot.charAt(Count) + ""; 		 				  		 				   
Temp_1 = Temp_1.toUpperCase(); 		 				  		 				   
Count++; 		 				  		 				   
 		 				  		 				   
do{ 		 				  		 				   
    Temp_1 += "" + mot.charAt(Count) + ""; 		 				  		 				   
    Count++; 		 				  		 				   
}while(Count<mot.length()); 		 				  		 				   
 		 				  		 				   
affiche(Temp_1); 		 				  		 				   