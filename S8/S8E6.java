//N et M sont des entiers deja declarés et initialisés 		 				  		 				   
 		 				  		 				   
int[][] tab = new int[N][M]; 		 				  		 				   
 		 				  		 				   
int First_D_Count = 0; 		 				  		 				   
int Second_D_Count = 0; 		 				  		 				   
int Offset = 0; 		 				  		 				   
 		 				  		 				   
do{ 		 				  		 				   
 		 				  		 				   
    Second_D_Count = 0; 		 				  		 				   
    do{ 		 				  		 				   
 		 				  		 				   
    tab[First_D_Count][Second_D_Count] = Second_D_Count + Offset; 		 				  		 				   
 		 				  		 				   
    Second_D_Count++; 		 				  		 				   
    }while(Second_D_Count<M); 		 				  		 				   
 		 				  		 				   
 		 				  		 				   
Offset++; 		 				  		 				   
First_D_Count++; 		 				  		 				   
}while(First_D_Count<N); 		 				  		 				   