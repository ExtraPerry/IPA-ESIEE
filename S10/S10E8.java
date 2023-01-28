//phrase est déjà déclarée et initialisée 		 				  		 				   
 		 				  		 				   
int Count = 0; 		 				  		 				   
phrase = phrase.toLowerCase(); 		 				  		 				   
String mots[] = phrase.split(" "); 		 				  		 				   
String Temp_1 = ""; 		 				  		 				   
String Output = ""; 		 				  		 				   
 		 				  		 				   
do{ 		 				  		 				   
 		 				  		 				   
    Temp_1 = mots[Count].substring(0,1).toUpperCase(); 		 				  		 				   
    Output += " " + Temp_1; 		 				  		 				   
    Temp_1 = mots[Count].substring(1); 		 				  		 				   
    Output += Temp_1; 		 				  		 				   
 		 				  		 				   
    Count++; 		 				  		 				   
}while(Count < mots.length); 		 				  		 				   
 		 				  		 				   
affiche(Output.substring(1)); 		 				  		 				   