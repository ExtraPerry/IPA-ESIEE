int jourInv(String a) 		 				  		 				   
{ 		 				  		 				   
    String[] Date_Month = a.split(" "); 		 				  		 				   
    int Result = 0; 		 				  		 				   
 		 				  		 				   
    switch(Date_Month[1]){ 		 				  		 				   
        case "Janvier" : 		 				  		 				   
            Result = 0; 		 				  		 				   
            break; 		 				  		 				   
        case "Février" : 		 				  		 				   
            Result = 31; 		 				  		 				   
            break; 		 				  		 				   
        case "Mars" : 		 				  		 				   
            Result = 59; 		 				  		 				   
            break; 		 				  		 				   
        case "Avril" : 		 				  		 				   
            Result = 90; 		 				  		 				   
            break; 		 				  		 				   
        case "Mai" : 		 				  		 				   
            Result = 120; 		 				  		 				   
            break; 		 				  		 				   
        case "Juin" : 		 				  		 				   
            Result = 151; 		 				  		 				   
            break; 		 				  		 				   
        case "Juillet" : 		 				  		 				   
            Result = 181; 		 				  		 				   
            break; 		 				  		 				   
        case "Août" : 		 				  		 				   
            Result = 212; 		 				  		 				   
            break; 		 				  		 				   
        case "Septembre" : 		 				  		 				   
            Result = 243; 		 				  		 				   
            break; 		 				  		 				   
        case "Octobre" : 		 				  		 				   
            Result = 273; 		 				  		 				   
            break; 		 				  		 				   
        case "Novembre" : 		 				  		 				   
            Result = 304; 		 				  		 				   
            break; 		 				  		 				   
        case "Decembre" : 		 				  		 				   
            Result = 334; 		 				  		 				   
            break; 		 				  		 				   
    } 		 				  		 				   
    int Day = convertirEnEntier(Date_Month[0]); 		 				  		 				   
    Result += Day; 		 				  		 				   
    return Result; 		 				  		 				   
} 		 				  		 				   