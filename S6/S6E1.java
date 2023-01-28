//largeur et hauteur sont des variables entières déjà déclarées et initialisées 		 				  		 				   
 		 				  		 				   
int HeightModulo=hauteur%2; 		 				  		 				   
double HeightDiv2=(hauteur/2)-0.5; 		 				  		 				   
int HeightWrite=(int)HeightDiv2; 		 				  		 				   
int CurrentHeight=HeightWrite; 		 				  		 				   
int CurrentLength=0; 		 				  		 				   
 		 				  		 				   
setFillColor("Blue"); 		 				  		 				   
 		 				  		 				   
if( HeightModulo ==0 ){ 		 				  		 				   
 		 				  		 				   
        do{ 		 				  		 				   
            fillCase( CurrentLength, CurrentHeight ); 		 				  		 				   
            CurrentLength++; 		 				  		 				   
        }while( CurrentLength < largeur ); 		 				  		 				   
 		 				  		 				   
        CurrentHeight++; 		 				  		 				   
        CurrentLength=0; 		 				  		 				   
 		 				  		 				   
        do{ 		 				  		 				   
            fillCase( CurrentLength, CurrentHeight ); 		 				  		 				   
            CurrentLength++; 		 				  		 				   
        }while( CurrentLength < largeur ); 		 				  		 				   
 		 				  		 				   
}else{ 		 				  		 				   
        CurrentHeight++; 		 				  		 				   
 		 				  		 				   
        do{ 		 				  		 				   
            fillCase( CurrentLength, CurrentHeight ); 		 				  		 				   
            CurrentLength++; 		 				  		 				   
        }while( CurrentLength < largeur ); 		 				  		 				   
 		 				  		 				   
} 		 				  		 				   