//n est une variable déjà déclarée et initialisée 		 				  		 				   
 		 				  		 				   
boolean premier=false; 		 				  		 				   
int FactorValue=1; 		 				  		 				   
int CalcValue=999; 		 				  		 				   
int DivCount=0; 		 				  		 				   
 		 				  		 				   
 		 				  		 				   
do{ 		 				  		 				   
    CalcValue=n%FactorValue; 		 				  		 				   
    if(CalcValue==0){ 		 				  		 				   
        DivCount++; 		 				  		 				   
    } 		 				  		 				   
    FactorValue++; 		 				  		 				   
}while(FactorValue<=n); 		 				  		 				   
if(DivCount==2){ 		 				  		 				   
        premier=true; 		 				  		 				   
}else{ 		 				  		 				   
        premier=false; 		 				  		 				   
} 		 				  		 				   