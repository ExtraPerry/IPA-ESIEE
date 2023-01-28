//tab est un tableau 2d d'entiers deja declaré et initialisé 		 				  		 				   
 		 				  		 				   
int FlatSize = 0; 		 				  		 				   
int Count_1 = 0; 		 				  		 				   
int Count_2 = 0; 		 				  		 				   
int Count_3 = 0; 		 				  		 				   
 		 				  		 				   
do{ 		 				  		 				   
    Count_2 = 0; 		 				  		 				   
    do{ 		 				  		 				   
        FlatSize++; 		 				  		 				   
        Count_2++; 		 				  		 				   
    }while(Count_2 < tab[Count_1].length); 		 				  		 				   
   Count_1++; 		 				  		 				   
}while(Count_1 < tab.length); 		 				  		 				   
 		 				  		 				   
int[] flat = new int [FlatSize]; 		 				  		 				   
 		 				  		 				   
Count_1 = 0; 		 				  		 				   
do{ 		 				  		 				   
    Count_2 = 0; 		 				  		 				   
    do{ 		 				  		 				   
        flat[Count_3] = tab[Count_1][Count_2]; 		 				  		 				   
        Count_3++; 		 				  		 				   
        Count_2++; 		 				  		 				   
    }while(Count_2 < tab[Count_1].length); 		 				  		 				   
   Count_1++; 		 				  		 				   
}while(Count_1 < tab.length); 		 				  		 				   
 		 				  		 				   
//-----debug------------------------------------------------------------------// 		 				  		 				   
debug("--------First-D---------"); 		 				  		 				   
debug("" + tab.length + " --> 0-" + (tab.length - 1) + ""); 		 				  		 				   
debug("--------Second-D--------"); 		 				  		 				   
debug("" + tab[0].length + " --> 0-" + (tab[0].length - 1) + ""); 		 				  		 				   
debug("--------flat-size-------"); 		 				  		 				   
debug("" + flat.length  + " --> 0-" + (flat.length - 1) + ""); 		 				  		 				   
debug("--------Values----------"); 		 				  		 				   
Count_1 = 0; 		 				  		 				   
do{ 		 				  		 				   
    Count_2 = 0; 		 				  		 				   
    do{ 		 				  		 				   
        debug("Index " + Count_1 + " ==> " + tab[Count_1][Count_2] + ""); 		 				  		 				   
        Count_2++; 		 				  		 				   
    }while(Count_2 < tab[Count_1].length); 		 				  		 				   
   Count_1++; 		 				  		 				   
}while(Count_1 < tab.length); 		 				  		 				   
//-----debug------------------------------------------------------------------// 		 				  		 				   