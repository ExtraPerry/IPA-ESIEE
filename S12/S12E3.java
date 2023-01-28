int[] lireTableauEntiers() 		 				  		 				   
{ 		 				  		 				   
    int[] a = new int [lireEntier()]; 		 				  		 				   
    int Count_1 = 0; 		 				  		 				   
    do{ 		 				  		 				   
        a[Count_1] = lireEntier(); 		 				  		 				   
        Count_1++; 		 				  		 				   
    }while(Count_1 < a.length); 		 				  		 				   
    return a; 		 				  		 				   
} 		 				  		 				   