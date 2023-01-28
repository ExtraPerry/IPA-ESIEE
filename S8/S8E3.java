//tab et x sont deja declarés et initialisés 		 				  		 				   
 		 				  		 				   
int NumRep = 0; 		 				  		 				   
int Temp_1[] = new int [tab.length + 1]; 		 				  		 				   
 		 				  		 				   
do{ 		 				  		 				   
    Temp_1[NumRep + 1] = tab[NumRep]; 		 				  		 				   
    NumRep++; 		 				  		 				   
}while (NumRep <= tab.length - 1); 		 				  		 				   
 		 				  		 				   
Temp_1[0] = x; 		 				  		 				   
 		 				  		 				   
tab = new int [Temp_1.length]; 		 				  		 				   
 		 				  		 				   
NumRep = 0; 		 				  		 				   
 		 				  		 				   
do{ 		 				  		 				   
    tab[NumRep] = Temp_1[NumRep]; 		 				  		 				   
    NumRep++; 		 				  		 				   
}while (NumRep <= Temp_1.length - 1); 		 				  		 				   