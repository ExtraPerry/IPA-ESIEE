//largeur et hauteur sont des variables entières déjà déclarées et initialisées 		 				  		 				   
 		 				  		 				   
int CurrentHeight=0; 		 				  		 				   
int CurrentLength=0; 		 				  		 				   
int MaxHeight=hauteur - 1; 		 				  		 				   
int MaxLength=largeur - 1; 		 				  		 				   
int ModuloHeight=0; 		 				  		 				   
int ModuloLength=0; 		 				  		 				   
 		 				  		 				   
setFillColor("Black"); 		 				  		 				   
 		 				  		 				   
do{ 		 				  		 				   
    CurrentLength=0; 		 				  		 				   
    do{ 		 				  		 				   
        ModuloLength=CurrentLength%2; 		 				  		 				   
        ModuloHeight=CurrentHeight%2; 		 				  		 				   
        if(ModuloHeight==0){ 		 				  		 				   
            if(ModuloLength==0){ 		 				  		 				   
                fillCase(CurrentLength, CurrentHeight); 		 				  		 				   
            } 		 				  		 				   
        }else{ 		 				  		 				   
            if(ModuloLength==1){ 		 				  		 				   
                fillCase(CurrentLength, CurrentHeight); 		 				  		 				   
            } 		 				  		 				   
        } 		 				  		 				   
        CurrentLength++; 		 				  		 				   
    }while(CurrentLength<largeur); 		 				  		 				   
    CurrentHeight++; 		 				  		 				   
}while(CurrentHeight<hauteur); 		 				  		 				   