//phrase est déjà déclarée et initialisée 		 				  		 				   
 		 				  		 				   
String[] Mots = phrase.split(" "); 		 				  		 				   
 		 				  		 				   
switch(Mots.length){ 		 				  		 				   
    case 1: 		 				  		 				   
        affiche("\"" + phrase + "\" est un mot"); 		 				  		 				   
        break; 		 				  		 				   
    default: 		 				  		 				   
        affiche("\"" + phrase + "\" contient " + Mots.length + " mots"); 		 				  		 				   
        break; 		 				  		 				   
} 		 				  		 				   