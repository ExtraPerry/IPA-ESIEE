//joueur1 et joueur2 sont déjà déclarées et initialisées 		 				  		 				   
 		 				  		 				   
switch(joueur1.toLowerCase()){ 		 				  		 				   
    case "pierre": 		 				  		 				   
 		 				  		 				   
        switch(joueur2.toLowerCase()){ 		 				  		 				   
            case  "pierre": 		 				  		 				   
                affiche("Match nul"); 		 				  		 				   
                break; 		 				  		 				   
            case "ciseau": 		 				  		 				   
                affiche("Joueur 1 gagne"); 		 				  		 				   
                break; 		 				  		 				   
            case "papier": 		 				  		 				   
                affiche("Joueur 2 gagne"); 		 				  		 				   
                break; 		 				  		 				   
        } 		 				  		 				   
 		 				  		 				   
        break; 		 				  		 				   
    case "ciseau": 		 				  		 				   
 		 				  		 				   
        switch(joueur2.toLowerCase()){ 		 				  		 				   
            case  "pierre": 		 				  		 				   
                affiche("Joueur 2 gagne"); 		 				  		 				   
                break; 		 				  		 				   
            case "ciseau": 		 				  		 				   
                affiche("Match nul"); 		 				  		 				   
                break; 		 				  		 				   
            case "papier": 		 				  		 				   
                affiche("Joueur 1 gagne"); 		 				  		 				   
                break; 		 				  		 				   
        } 		 				  		 				   
        break; 		 				  		 				   
 		 				  		 				   
    case "papier": 		 				  		 				   
 		 				  		 				   
        switch(joueur2.toLowerCase()){ 		 				  		 				   
            case  "pierre": 		 				  		 				   
                affiche("Joueur 1 gagne"); 		 				  		 				   
                break; 		 				  		 				   
            case "ciseau": 		 				  		 				   
                affiche("Joueur 2 gagne"); 		 				  		 				   
                break; 		 				  		 				   
            case "papier": 		 				  		 				   
                affiche("Match nul"); 		 				  		 				   
                break; 		 				  		 				   
 		 				  		 				   
        } 		 				  		 				   
        break; 		 				  		 				   
} 		 				  		 				   