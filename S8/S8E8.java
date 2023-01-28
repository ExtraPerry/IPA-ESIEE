//tab est un tableau 2d d'entiers deja declaré et initialisé 		 				  		 				   
 		 				  		 				   
int[][] trans = new int [tab[0].length][tab.length]; 		 				  		 				   
int Count_1 = 0; 		 				  		 				   
int Count_2 = 0; 		 				  		 				   
 		 				  		 				   
do{ 		 				  		 				   
 		 				  		 				   
    Count_2 = 0; 		 				  		 				   
    do{ 		 				  		 				   
        trans[Count_1][Count_2] = tab[Count_2][Count_1]; 		 				  		 				   
        Count_2++; 		 				  		 				   
    }while(Count_2 < tab.length); 		 				  		 				   
   Count_1++; 		 				  		 				   
}while(Count_1 < tab[0].length); 		 				  		 				   