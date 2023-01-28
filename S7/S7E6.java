//tab est un tableau deja declaré et initialisé 		 				  		 				   
 		 				  		 				   
int NumRep = 0; 		 				  		 				   
int Temp_1 = tab[0]; 		 				  		 				   
 		 				  		 				   
do{ 		 				  		 				   
    if (tab[NumRep] < Temp_1){ 		 				  		 				   
        Temp_1 = tab[NumRep]; 		 				  		 				   
    } 		 				  		 				   
    NumRep++; 		 				  		 				   
}while (NumRep <= tab.length - 1); 		 				  		 				   
 		 				  		 				   
afficheEntier(Temp_1); 		 				  		 				   