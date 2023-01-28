int CurrentHeight=0; 		 				  		 				   
int CurrentLength=0; 		 				  		 				   
int MaxHeight=taille - 1; 		 				  		 				   
int MaxLength=taille - 1; 		 				  		 				   
int MinWriteLength=0; 		 				  		 				   
int MaxWriteLength=MaxLength; 		 				  		 				   
double MiddleHeight=(taille/2); 		 				  		 				   
int CheckPair=taille%2; 		 				  		 				   
 		 				  		 				   
setFillColor("Green"); 		 				  		 				   
 		 				  		 				   
do{ 		 				  		 				   
 		 				  		 				   
    CurrentLength=0; 		 				  		 				   
    do{ 		 				  		 				   
 		 				  		 				   
        if(CurrentLength>=MinWriteLength && CurrentLength<=MaxWriteLength){ 		 				  		 				   
            fillCase(CurrentLength, CurrentHeight); 		 				  		 				   
        } 		 				  		 				   
 		 				  		 				   
        CurrentLength++; 		 				  		 				   
    }while(CurrentLength<taille); 		 				  		 				   
 		 				  		 				   
    if(CurrentHeight<(int)MiddleHeight){ 		 				  		 				   
        if(CheckPair==0 && CurrentHeight==(int)MiddleHeight - 1){ 		 				  		 				   
            //Skips the line really :D 		 				  		 				   
        }else{ 		 				  		 				   
            MinWriteLength++; 		 				  		 				   
            MaxWriteLength--; 		 				  		 				   
        } 		 				  		 				   
    }else{ 		 				  		 				   
        MinWriteLength--; 		 				  		 				   
        MaxWriteLength++; 		 				  		 				   
    } 		 				  		 				   
 		 				  		 				   
    CurrentHeight++; 		 				  		 				   
}while(CurrentHeight<taille); 		 				  		 				   