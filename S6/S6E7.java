//largeur, hauteur et cadre sont des variables entières déjà déclarées et initialisées 		 				  		 				   
 		 				  		 				   
int CurrentHeight=0; 		 				  		 				   
int CurrentLength=0; 		 				  		 				   
int MaxHeight=(hauteur - 1) - cadre; 		 				  		 				   
int MaxLength=(largeur - 1) - cadre; 		 				  		 				   
int MinHeight=0 + cadre; 		 				  		 				   
int MinLength=0 + cadre; 		 				  		 				   
 		 				  		 				   
setFillColor("Green"); 		 				  		 				   
 		 				  		 				   
do{ 		 				  		 				   
    CurrentLength=0; 		 				  		 				   
    do{ 		 				  		 				   
        if(CurrentLength<MinLength || CurrentLength>MaxLength || CurrentHeight<MinHeight || CurrentHeight>MaxHeight){ 		 				  		 				   
            fillCase(CurrentLength, CurrentHeight); 		 				  		 				   
        } 		 				  		 				   
        CurrentLength++; 		 				  		 				   
    }while(CurrentLength<largeur); 		 				  		 				   
    CurrentHeight++; 		 				  		 				   
}while(CurrentHeight<hauteur); 		 				  		 				   