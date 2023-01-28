//tab est deja declaré et initialisé 		 				  		 				   
 		 				  		 				   
int NumRep = 0; 		 				  		 				   
int Temp_1 = tab[0]; 		 				  		 				   
boolean Trier = true; 		 				  		 				   
 		 				  		 				   
do{ 		 				  		 				   
    if (tab[NumRep] >= Temp_1){ 		 				  		 				   
        Temp_1 = tab[NumRep]; 		 				  		 				   
    }else{ 		 				  		 				   
        Trier = false; 		 				  		 				   
    } 		 				  		 				   
    NumRep++; 		 				  		 				   
}while (NumRep <= tab.length - 1); 		 				  		 				   
 		 				  		 				   
if (Trier) { 		 				  		 				   
    affiche("trié"); 		 				  		 				   
} else { 		 				  		 				   
    affiche("non trié"); 		 				  		 				   
} 		 				  		 				   