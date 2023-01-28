//tab1 et tab2 sont deja declarés et initialisés 		 				  		 				   
 		 				  		 				   
int NumRep = 0; 		 				  		 				   
int tab[] = new int [(tab1.length + tab2.length)]; 		 				  		 				   
 		 				  		 				   
 		 				  		 				   
 		 				  		 				   
//-------------------------------------------------------//| 		 				  		 				   
debug("-----------------------");                        //| 		 				  		 				   
debug("tab1 + tab2");                                    //| 		 				  		 				   
NumRep = 0;                                              //| 		 				  		 				   
do{                                                      //| 		 				  		 				   
debug(tab1[NumRep]);                                     //| 		 				  		 				   
NumRep++;                                                //| 		 				  		 				   
}while(NumRep <= tab1.length - 1);                       //| 		 				  		 				   
debug("-----------------------");                        //| 		 				  		 				   
NumRep = 0;                                              //| 		 				  		 				   
do{                                                      //| 		 				  		 				   
debug(tab2[NumRep]);                                     //| 		 				  		 				   
NumRep++;                                                //| 		 				  		 				   
}while(NumRep <= tab2.length - 1);                       //| 		 				  		 				   
//-------------------------------------------------------//| 		 				  		 				   
 		 				  		 				   
 		 				  		 				   
NumRep = 0; 		 				  		 				   
do{ 		 				  		 				   
    tab[NumRep] = tab1[NumRep]; 		 				  		 				   
    NumRep++; 		 				  		 				   
}while(NumRep <= tab1.length - 1); 		 				  		 				   
 		 				  		 				   
NumRep = 0; 		 				  		 				   
 		 				  		 				   
do{ 		 				  		 				   
    tab[NumRep + (tab1.length)] = tab2[NumRep]; 		 				  		 				   
    NumRep++; 		 				  		 				   
}while(NumRep <= tab2.length - 1); 		 				  		 				   