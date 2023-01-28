//taille est une variable entière déjà déclarée et initialisée 		 				  		 				   
 		 				  		 				   
int CurrentHeight=0; 		 				  		 				   
int CurrentLength=0; 		 				  		 				   
int MaxHeight=taille - 1; 		 				  		 				   
int MaxLength=taille - 1; 		 				  		 				   
 		 				  		 				   
setFillColor("Red"); 		 				  		 				   
 		 				  		 				   
do{ 		 				  		 				   
    CurrentLength=0; 		 				  		 				   
    do{ 		 				  		 				   
        if(CurrentLength<=MaxLength){ 		 				  		 				   
            fillCase(CurrentLength, CurrentHeight); 		 				  		 				   
        } 		 				  		 				   
        CurrentLength++; 		 				  		 				   
    }while(CurrentLength<taille); 		 				  		 				   
    MaxLength--; 		 				  		 				   
    CurrentHeight++; 		 				  		 				   
}while(CurrentHeight<taille); 		 				  		 				   