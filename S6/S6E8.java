//largeur, hauteur, barre et espace sont des variables entières déjà déclarées et initialisées 		 				  		 				   
 		 				  		 				   
int CurrentHeight=0; 		 				  		 				   
int CurrentLength=0; 		 				  		 				   
int MaxHeight = hauteur - 1; 		 				  		 				   
int MaxLength = largeur - 1; 		 				  		 				   
int VirtualLength = 0; 		 				  		 				   
 		 				  		 				   
 		 				  		 				   
setFillColor("Black"); 		 				  		 				   
 		 				  		 				   
do{ 		 				  		 				   
    VirtualLength = 0; 		 				  		 				   
    do{ 		 				  		 				   
        CurrentHeight=0; 		 				  		 				   
            do{ 		 				  		 				   
                fillCase(CurrentLength, CurrentHeight); 		 				  		 				   
                CurrentHeight++; 		 				  		 				   
            }while(CurrentHeight <= MaxHeight); 		 				  		 				   
        VirtualLength++; 		 				  		 				   
        CurrentLength++; 		 				  		 				   
    }while(VirtualLength <= barre - 1 && CurrentLength <= MaxLength); 		 				  		 				   
    CurrentLength = CurrentLength + espace; 		 				  		 				   
}while(CurrentLength <= MaxLength); 		 				  		 				   