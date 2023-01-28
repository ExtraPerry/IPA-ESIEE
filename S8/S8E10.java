//N est un entier deja declaré et initialisé 		 				  		 				   
 		 				  		 				   
int[][] tab = new int [N][]; 		 				  		 				   
int Count_1 = 1; 		 				  		 				   
int Count_2 = 0; 		 				  		 				   
 		 				  		 				   
do{ 		 				  		 				   
    tab[Count_1 - 1] = new int [Count_1]; 		 				  		 				   
    Count_1++; 		 				  		 				   
}while(Count_1 <= N); 		 				  		 				   
 		 				  		 				   
 		 				  		 				   
Count_1 = 0; 		 				  		 				   
do{ 		 				  		 				   
    Count_2 = 0; 		 				  		 				   
    do{ 		 				  		 				   
 		 				  		 				   
        if (Count_2 == 0 || Count_2 == tab[Count_1].length - 1){ 		 				  		 				   
            tab[Count_1][Count_2] = 1; 		 				  		 				   
        }else{ 		 				  		 				   
            tab[Count_1][Count_2] = tab[Count_1 - 1][Count_2 - 1] + tab[Count_1 - 1][Count_2]; 		 				  		 				   
        } 		 				  		 				   
 		 				  		 				   
        Count_2++; 		 				  		 				   
    }while(Count_2 < tab[Count_1].length); 		 				  		 				   
    Count_1++; 		 				  		 				   
}while(Count_1 < tab.length); 		 				  		 				   