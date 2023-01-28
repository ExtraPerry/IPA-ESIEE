//largeur et hauteur sont des variables entières déjà déclarées et initialisées 		 				  		 				   
 		 				  		 				   
int CurrentHeight=0; 		 				  		 				   
int CurrentLength=0; 		 				  		 				   
int MaxHeight=hauteur - 1; 		 				  		 				   
int MaxLength=largeur - 1; 		 				  		 				   
int HalfHeight=(hauteur/2) - 1; 		 				  		 				   
int HalfLength=(largeur/2) - 1; 		 				  		 				   
 		 				  		 				   
do{ 		 				  		 				   
    CurrentLength=0; 		 				  		 				   
    do{ 		 				  		 				   
        if(CurrentLength<=HalfLength && CurrentHeight<=HalfHeight){ 		 				  		 				   
            setFillColor("Blue"); 		 				  		 				   
        } 		 				  		 				   
        if(CurrentLength>HalfLength && CurrentHeight<=HalfHeight){ 		 				  		 				   
            setFillColor("Red"); 		 				  		 				   
        } 		 				  		 				   
        if(CurrentLength<=HalfLength && CurrentHeight>HalfHeight){ 		 				  		 				   
            setFillColor("Green"); 		 				  		 				   
        } 		 				  		 				   
        if(CurrentLength>HalfLength && CurrentHeight>HalfHeight){ 		 				  		 				   
            setFillColor("Yellow"); 		 				  		 				   
        } 		 				  		 				   
        fillCase(CurrentLength, CurrentHeight); 		 				  		 				   
        CurrentLength++; 		 				  		 				   
    }while(CurrentLength<largeur); 		 				  		 				   
    CurrentHeight++; 		 				  		 				   
}while(CurrentHeight<hauteur); 		 				  		 				   