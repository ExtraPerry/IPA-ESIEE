int vodCout(int a, int b) 		 				  		 				   
{ 		 				  		 				   
    //int a = film 		 				  		 				   
    //int b = episode 		 				  		 				   
    int Temp_1 = 40; 		 				  		 				   
 		 				  		 				   
    //côut des combinaisons possibles. 		 				  		 				   
    int IndAll = (a * 5) + (b * 2); 		 				  		 				   
    int IndFilm_AbEpis = (a * 5) + 20; 		 				  		 				   
    int AbFilm_IndEpis = 30 + (b * 2); 		 				  		 				   
 		 				  		 				   
    //dessision du moins chère. 		 				  		 				   
    if(IndAll<Temp_1){ 		 				  		 				   
     Temp_1 = IndAll; 		 				  		 				   
    } 		 				  		 				   
    if(IndFilm_AbEpis<Temp_1){ 		 				  		 				   
        Temp_1 = IndFilm_AbEpis; 		 				  		 				   
    } 		 				  		 				   
    if(AbFilm_IndEpis<Temp_1){ 		 				  		 				   
        return AbFilm_IndEpis; 		 				  		 				   
    }else{ 		 				  		 				   
        return Temp_1; 		 				  		 				   
    } 		 				  		 				   
} 		 				  		 				   