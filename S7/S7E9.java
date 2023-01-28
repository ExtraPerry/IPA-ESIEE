//tab est deja declaré et initialisé 		 				  		 				   
int integral[] = new int[tab.length]; 		 				  		 				   
 		 				  		 				   
int NumRep = 0; 		 				  		 				   
int Temp_1 = 0; 		 				  		 				   
 		 				  		 				   
 		 				  		 				   
do{ 		 				  		 				   
    Temp_1 += tab[NumRep]; 		 				  		 				   
    integral[NumRep] = Temp_1; 		 				  		 				   
    NumRep++; 		 				  		 				   
}while (NumRep <= tab.length - 1); 		 				  		 				   