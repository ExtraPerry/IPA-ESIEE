//tab est deja declaré et initialisé 		 				  		 				   
 		 				  		 				   
//Same technique as exercise S10 E9... //Used to get the new version of tab's size... 		 				  		 				   
 		 				  		 				   
int Count_1 = 0; 		 				  		 				   
int Count_2 = 0; 		 				  		 				   
int Temp_1 = tab[0]; 		 				  		 				   
int TabLengthNew = 0; 		 				  		 				   
int[] Temp_tab = new int [tab.length]; 		 				  		 				   
 		 				  		 				   
do{ 		 				  		 				   
    if(tab[Count_1] > Temp_1){ 		 				  		 				   
        Temp_1 = tab[Count_1]; 		 				  		 				   
    } 		 				  		 				   
    Temp_tab[Count_1] = tab[Count_1]; 		 				  		 				   
    Count_1++; 		 				  		 				   
}while(Count_1 < tab.length); 		 				  		 				   
 		 				  		 				   
int[] NumListMax = new int [Temp_1 + 1]; 		 				  		 				   
 		 				  		 				   
Count_1 = 0; 		 				  		 				   
do{ 		 				  		 				   
    NumListMax[tab[Count_1]] += 1; 		 				  		 				   
    Count_1++; 		 				  		 				   
}while(Count_1 < tab.length); 		 				  		 				   
 		 				  		 				   
Count_1 = 0; 		 				  		 				   
do{ 		 				  		 				   
    if(NumListMax[Count_1] > 0){ 		 				  		 				   
        TabLengthNew++; 		 				  		 				   
    } 		 				  		 				   
    Count_1++; 		 				  		 				   
}while(Count_1 < NumListMax.length); 		 				  		 				   
 		 				  		 				   
tab = new int [TabLengthNew]; 		 				  		 				   
 		 				  		 				   
//when assigning variables I need to reasign based of Temp_tab values 		 				  		 				   
//but check if the value does not already exist in tab which I'm writting too... 		 				  		 				   
 		 				  		 				   
boolean Repeat = false; 		 				  		 				   
int Offset = 0; 		 				  		 				   
Count_1 = 0; 		 				  		 				   
do{ 		 				  		 				   
    Repeat = false; 		 				  		 				   
    Count_2 = 0; 		 				  		 				   
    do{ 		 				  		 				   
        if (Temp_tab[Count_1] == tab[Count_2]){ 		 				  		 				   
            Repeat = true; 		 				  		 				   
            break; 		 				  		 				   
        } 		 				  		 				   
        Count_2++; 		 				  		 				   
    }while(Count_2 < tab.length); 		 				  		 				   
    if (Repeat){ 		 				  		 				   
        Offset += 1; 		 				  		 				   
        debug("--------" + Temp_tab[Count_1] + "--------"); 		 				  		 				   
        debug("Is Duplicate."); 		 				  		 				   
    }else{ 		 				  		 				   
        tab[Count_1 - Offset] = Temp_tab[Count_1]; 		 				  		 				   
        debug("--------" + Temp_tab[Count_1] + "--------"); 		 				  		 				   
        debug("Is not Duplicate."); 		 				  		 				   
    } 		 				  		 				   
    Count_1++; 		 				  		 				   
}while(Count_1 < Temp_tab.length); 		 				  		 				   