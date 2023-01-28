//largeur, hauteur, interieur et exterieur sont des variables entières déjà déclarées et initialisées 		 				  		 				   
 		 				  		 				   
int CurrentHeight=0; 		 				  		 				   
int CurrentLength=0; 		 				  		 				   
int MaxHeight=hauteur - 1; 		 				  		 				   
int MaxLength=largeur - 1; 		 				  		 				   
 		 				  		 				   
double MidHeight = (hauteur - 1) / 2.0; 		 				  		 				   
double MidLength = (largeur - 1) / 2.0; 		 				  		 				   
double Radius_Exterior_Square = (exterieur * exterieur); 		 				  		 				   
double Radius_Interior_Square = (interieur * interieur); 		 				  		 				   
 		 				  		 				   
setFillColor("Red"); 		 				  		 				   
 		 				  		 				   
do{ 		 				  		 				   
    CurrentLength=0; 		 				  		 				   
    do{ 		 				  		 				   
        double Dist_Xc_Xs_Square = ((CurrentLength) - MidLength) * ((CurrentLength) - MidLength); 		 				  		 				   
        double Dist_Yc_Ys_Square = ((CurrentHeight) - MidHeight) * ((CurrentHeight) - MidHeight); 		 				  		 				   
 		 				  		 				   
        if (interieur != 0){ 		 				  		 				   
            if(Radius_Exterior_Square >= (Dist_Xc_Xs_Square + Dist_Yc_Ys_Square) && Radius_Interior_Square <= (Dist_Xc_Xs_Square + Dist_Yc_Ys_Square)){ 		 				  		 				   
                fillCase(CurrentLength, CurrentHeight); 		 				  		 				   
            } 		 				  		 				   
        }else{ 		 				  		 				   
            if(Radius_Exterior_Square >= (Dist_Xc_Xs_Square + Dist_Yc_Ys_Square)){ 		 				  		 				   
                fillCase(CurrentLength, CurrentHeight); 		 				  		 				   
            } 		 				  		 				   
        } 		 				  		 				   
        CurrentLength++; 		 				  		 				   
    }while(CurrentLength<largeur); 		 				  		 				   
    CurrentHeight++; 		 				  		 				   
}while(CurrentHeight<hauteur); 		 				  		 				   