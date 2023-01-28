//largeur et hauteur sont des variables entières déjà déclarées et initialisées 		 				  		 				   
 		 				  		 				   
int HeightModulo=hauteur%2; 		 				  		 				   
double HeightDiv2=(hauteur/2)-0.5; 		 				  		 				   
int HeightWrite=(int)HeightDiv2; 		 				  		 				   
 		 				  		 				   
int LengthModulo=largeur%2; 		 				  		 				   
double LengthDiv2=(largeur/2)-0.5; 		 				  		 				   
int LengthWrite=(int)LengthDiv2; 		 				  		 				   
 		 				  		 				   
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
 		 				  		 				   
CurrentLength=LengthWrite; 		 				  		 				   
CurrentHeight=0; 		 				  		 				   
 		 				  		 				   
setFillColor("Green"); 		 				  		 				   
 		 				  		 				   
if( LengthModulo ==0 ){ 		 				  		 				   
 		 				  		 				   
        do{ 		 				  		 				   
            fillCase( CurrentLength, CurrentHeight ); 		 				  		 				   
            CurrentHeight++; 		 				  		 				   
        }while( CurrentHeight < hauteur ); 		 				  		 				   
 		 				  		 				   
        CurrentLength++; 		 				  		 				   
        CurrentHeight=0; 		 				  		 				   
 		 				  		 				   
        do{ 		 				  		 				   
            fillCase( CurrentLength, CurrentHeight ); 		 				  		 				   
            CurrentHeight++; 		 				  		 				   
        }while( CurrentHeight < hauteur ); 		 				  		 				   
 		 				  		 				   
}else{ 		 				  		 				   
        CurrentLength++; 		 				  		 				   
 		 				  		 				   
        do{ 		 				  		 				   
            fillCase( CurrentLength, CurrentHeight ); 		 				  		 				   
            CurrentHeight++; 		 				  		 				   
        }while( CurrentHeight < hauteur ); 		 				  		 				   
 		 				  		 				   
} 		 				  		 				   