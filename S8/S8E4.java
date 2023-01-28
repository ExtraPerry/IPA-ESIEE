//tab et x sont deja declarés et initialisés 		 				  		 				   
 		 				  		 				   
int NumRep = 0; 		 				  		 				   
int Temp_1[] = new int [tab.length + 1]; 		 				  		 				   
int Offset = 0; 		 				  		 				   
 		 				  		 				   
do{ 		 				  		 				   
    if(tab[NumRep] >= x && Offset == 0){ 		 				  		 				   
            Temp_1[NumRep] = x; 		 				  		 				   
            NumRep++; 		 				  		 				   
            Offset = 1 ; 		 				  		 				   
    } 		 				  		 				   
    Temp_1[NumRep] = tab[NumRep - Offset]; 		 				  		 				   
    NumRep++; 		 				  		 				   
}while(NumRep <= tab.length - 1); 		 				  		 				   
 		 				  		 				   
if(Offset==1){ 		 				  		 				   
    Temp_1[NumRep] = tab[NumRep - Offset]; 		 				  		 				   
}else{ 		 				  		 				   
    Temp_1[NumRep] = x; 		 				  		 				   
} 		 				  		 				   
 		 				  		 				   
 		 				  		 				   
//-------------------------------------------------------//| 		 				  		 				   
debug("X Value");                                        //| 		 				  		 				   
debug(x);                                                //| 		 				  		 				   
debug("-----------------------");                        //| 		 				  		 				   
debug("tab || Temp_1 (before)");                         //| 		 				  		 				   
NumRep = 0;                                              //| 		 				  		 				   
do{                                                      //| 		 				  		 				   
debug("" + tab[NumRep] + "      " + Temp_1[NumRep] +""); //| 		 				  		 				   
NumRep++;                                                //| 		 				  		 				   
}while(NumRep <= tab.length - 1);                        //| 		 				  		 				   
debug("x      " + Temp_1[NumRep] +"");                   //| 		 				  		 				   
//-------------------------------------------------------//| 		 				  		 				   
 		 				  		 				   
 		 				  		 				   
tab = new int [Temp_1.length]; 		 				  		 				   
 		 				  		 				   
NumRep = 0; 		 				  		 				   
 		 				  		 				   
do{ 		 				  		 				   
    tab[NumRep] = Temp_1[NumRep]; 		 				  		 				   
    NumRep++; 		 				  		 				   
}while (NumRep <= tab.length - 1); 		 				  		 				   
 		 				  		 				   
 		 				  		 				   
//-------------------------------------------------------//| 		 				  		 				   
debug("-----------------------");                        //| 		 				  		 				   
debug("tab || Temp_1 (after)");                          //| 		 				  		 				   
NumRep = 0;                                              //| 		 				  		 				   
do{                                                      //| 		 				  		 				   
debug("" + tab[NumRep] + "      " + Temp_1[NumRep] +""); //| 		 				  		 				   
NumRep++;                                                //| 		 				  		 				   
}while(NumRep <= tab.length - 1);                        //| 		 				  		 				   
//-------------------------------------------------------//| 		 				  		 				   