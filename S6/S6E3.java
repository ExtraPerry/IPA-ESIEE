//largeur et hauteur sont des variables entières déjà déclarées et initialisées 		 				  		 				   
 		 				  		 				   
int CurrentHeight=0; 		 				  		 				   
int CurrentLength=0; 		 				  		 				   
int MaxHeight=hauteur - 1; 		 				  		 				   
int MaxLength=largeur - 1; 		 				  		 				   
 		 				  		 				   
setFillColor("Green"); 		 				  		 				   
 		 				  		 				   
do{ 		 				  		 				   
    CurrentLength=0; 		 				  		 				   
    do{ 		 				  		 				   
        if(CurrentLength==0 || CurrentLength==MaxLength || CurrentHeight==0 || CurrentHeight==MaxHeight){ 		 				  		 				   
            fillCase(CurrentLength, CurrentHeight); 		 				  		 				   
        } 		 				  		 				   
        CurrentLength++; 		 				  		 				   
    }while(CurrentLength<largeur); 		 				  		 				   
    CurrentHeight++; 		 				  		 				   
}while(CurrentHeight<hauteur); 		 				  		 				   