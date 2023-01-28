//prenom et nom sont déjà déclarées et initialisées 		 				  		 				   
 		 				  		 				   
int Status = 0; 		 				  		 				   
int Count = 0; 		 				  		 				   
String Output = ""; 		 				  		 				   
 		 				  		 				   
if (!prenom.matches("[a-zA-Z]+")){ 		 				  		 				   
    Status = 1; 		 				  		 				   
} 		 				  		 				   
 		 				  		 				   
if (!nom.matches("[a-zA-Z]+")){ 		 				  		 				   
    Status = 2; 		 				  		 				   
} 		 				  		 				   
 		 				  		 				   
switch(Status){ 		 				  		 				   
    case 1: 		 				  		 				   
        affiche("\"" + prenom + "\" n\'est pas un prénom valide"); 		 				  		 				   
        break; 		 				  		 				   
 		 				  		 				   
    case 2: 		 				  		 				   
        affiche("\"" + nom + "\" n\'est pas un nom valide"); 		 				  		 				   
        break; 		 				  		 				   
 		 				  		 				   
    default: 		 				  		 				   
        prenom = prenom.toLowerCase(); 		 				  		 				   
        nom = nom.toLowerCase(); 		 				  		 				   
        do{ 		 				  		 				   
            Output += "" + nom.charAt(Count) + ""; 		 				  		 				   
            Count++; 		 				  		 				   
        }while(Count < 7 && Count < nom.length()); 		 				  		 				   
        Output += "" + prenom.charAt(0) + ""; 		 				  		 				   
        affiche(Output); 		 				  		 				   
        break; 		 				  		 				   
} 		 				  		 				   