int CurrentLength = 0; //Current is also the start Point. [Xmin] 		 				  		 				   
int CurrentHeight = 0; //Current is also the start Point. [Ymin] 		 				  		 				   
 		 				  		 				   
int MaxLength = largeur - 1; //Max is the total size -1 to set it from a 0 start Grid. [Xmax] 		 				  		 				   
int MaxHeight = hauteur - 1; //Max is the total size -1 to set it from a 0 start Grid. [Ymax] 		 				  		 				   
 		 				  		 				   
double BiggestHalf = 0; 		 				  		 				   
int NumRepeat = 0; 		 				  		 				   
 		 				  		 				   
int Offset = 0; //Offset is used to narrow down the grid while writing. [Xmin & Ymin || "+"" Modifier] [Xmax & Ymax || "-"" Modifier] 		 				  		 				   
 		 				  		 				   
if(largeur > hauteur){ 		 				  		 				   
    BiggestHalf = largeur / 4; 		 				  		 				   
}else{ 		 				  		 				   
    BiggestHalf = hauteur / 4; 		 				  		 				   
} 		 				  		 				   
 		 				  		 				   
setFillColor("Black"); //Set the colour for all squares that'll be written to. 		 				  		 				   
 		 				  		 				   
do{ 		 				  		 				   
 		 				  		 				   
    CurrentHeight = 0 + Offset; //Resets Ymin to read the next allocated space. 		 				  		 				   
    MaxHeight = hauteur - 1 - Offset; //Resets Ymax to read the next allocated space. 		 				  		 				   
    do{ 		 				  		 				   
 		 				  		 				   
        CurrentLength = 0 + Offset; //Reset Xmin to read allocated space. 		 				  		 				   
        MaxLength = largeur - 1 - Offset; //Reset Xmax to read allocated space. 		 				  		 				   
        do{ 		 				  		 				   
 		 				  		 				   
            if(CurrentLength == 0 + Offset || CurrentLength == MaxLength || CurrentHeight == 0 + Offset || CurrentHeight == MaxHeight){ 		 				  		 				   
            fillCase(CurrentLength, CurrentHeight); 		 				  		 				   
            }//Builds Squares on the boundaries of the allocated Spaces in the X & Y coords. 		 				  		 				   
 		 				  		 				   
            CurrentLength++; //Adds +1 to Xmin coords (moves to next square). 		 				  		 				   
        }while(CurrentLength <= MaxLength); //If Xmin reaches Xmax, stops the cycle as it has read the whole line. 		 				  		 				   
 		 				  		 				   
        CurrentHeight++; //Adds +1 to Ymin coords (moves down one row). 		 				  		 				   
    }while(CurrentHeight <= MaxHeight); //If Ymin reaches Ymax, stops the cycle as it has read the whole allocated Grid. 		 				  		 				   
 		 				  		 				   
    Offset = Offset + 2; //Adds +2 to the offset for the next allocated Grid. 		 				  		 				   
    NumRepeat++; //Counts the number of cycles. 		 				  		 				   
}while(NumRepeat <= BiggestHalf); //Once the number of cycles reaches 1/4 of the total max size (X or Y) then anymore would make it go negative so program should stop as it is complete. 		 				  		 				   