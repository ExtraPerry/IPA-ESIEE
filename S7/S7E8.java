//tab et x sont deja declarés et initialisés 		 				  		 				   
 		 				  		 				   
int NumRep = 0; 		 				  		 				   
int Result = -1; 		 				  		 				   
boolean LoopBreak = false; 		 				  		 				   
 		 				  		 				   
do{ 		 				  		 				   
    if (tab[NumRep] == x){ 		 				  		 				   
        Result = NumRep; 		 				  		 				   
        LoopBreak = true; 		 				  		 				   
    } 		 				  		 				   
    NumRep++; 		 				  		 				   
}while (NumRep <= tab.length - 1 && LoopBreak == false); 		 				  		 				   
 		 				  		 				   
afficheEntier(Result); 		 				  		 				   