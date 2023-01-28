//n est une variable déjà déclarée et initialisée 		 				  		 				   
 		 				  		 				   
int FactorMultiplier=1; 		 				  		 				   
String OutputValue=""; 		 				  		 				   
int CalcResult=0; 		 				  		 				   
 		 				  		 				   
do{ 		 				  		 				   
    CalcResult=n*FactorMultiplier; 		 				  		 				   
    OutputValue += ""+n+" x "+FactorMultiplier+" = "+CalcResult+"\n"; 		 				  		 				   
    FactorMultiplier++; 		 				  		 				   
}while (FactorMultiplier<=10); 		 				  		 				   
 		 				  		 				   
affiche(OutputValue); 		 				  		 				   