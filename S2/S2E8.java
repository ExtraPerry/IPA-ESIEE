double RadMinutes = (minutes*(2*PI)/60)-(PI/2); 		 				  		 				   
double RadHours = ((hours*5+(minutes*5/60))*(2*PI)/60)-(PI/2); 		 				  		 				   
 		 				  		 				   
double CosMinutes = cos(RadMinutes)*200; 		 				  		 				   
double SinMinutes = sin(RadMinutes)*200; 		 				  		 				   
double CosHours = cos(RadHours)*150; 		 				  		 				   
double SinHours = sin(RadHours)*150; 		 				  		 				   
 		 				  		 				   
setFillColor("Black"); 		 				  		 				   
circle(250,250,250); 		 				  		 				   
setFillColor("White"); 		 				  		 				   
line(250,250,(int)CosMinutes+250,(int)SinMinutes+250); 		 				  		 				   
setFillColor("Grey"); 		 				  		 				   
line(250,250,(int)CosHours+250,(int)SinHours+250+5); // +5 car sinon à cause de l'imprecision d'un interger ne rentrera pas dans la marge d'erreur. :/ 		 				  		 				   