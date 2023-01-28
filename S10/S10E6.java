//phrase est déjà déclarée et initialisée 		 				  		 				   
 		 				  		 				   
int Count = 0; 		 				  		 				   
String Output = ""; 		 				  		 				   
phrase = phrase.toUpperCase(); 		 				  		 				   
 		 				  		 				   
 		 				  		 				   
do{ 		 				  		 				   
    switch (phrase.charAt(Count)){ 		 				  		 				   
        case 'A': 		 				  		 				   
            Output += "4"; 		 				  		 				   
            break; 		 				  		 				   
 		 				  		 				   
        case 'E': 		 				  		 				   
            Output += "3"; 		 				  		 				   
            break; 		 				  		 				   
 		 				  		 				   
        case 'I': 		 				  		 				   
            Output += "1"; 		 				  		 				   
            break; 		 				  		 				   
 		 				  		 				   
        case 'O': 		 				  		 				   
            Output += "0"; 		 				  		 				   
            break; 		 				  		 				   
 		 				  		 				   
        case 'T': 		 				  		 				   
            Output += "7"; 		 				  		 				   
            break; 		 				  		 				   
 		 				  		 				   
        case 'G': 		 				  		 				   
            Output += "6"; 		 				  		 				   
            break; 		 				  		 				   
 		 				  		 				   
        case 'B': 		 				  		 				   
            Output += "8"; 		 				  		 				   
            break; 		 				  		 				   
 		 				  		 				   
        case 'S': 		 				  		 				   
            Output += "5"; 		 				  		 				   
            break; 		 				  		 				   
 		 				  		 				   
        default: 		 				  		 				   
            Output += phrase.charAt(Count); 		 				  		 				   
            break; 		 				  		 				   
    } 		 				  		 				   
    Count++; 		 				  		 				   
}while(Count < phrase.length()); 		 				  		 				   
 		 				  		 				   
affiche(Output); 		 				  		 				   