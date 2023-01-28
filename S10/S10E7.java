//phrase et interdits sont déjà déclarées et initialisées 		 				  		 				   
 		 				  		 				   
int Count_1 = 0; 		 				  		 				   
int Count_2 = 0; 		 				  		 				   
int Count_3 = 0; 		 				  		 				   
String mots[] = phrase.split(" "); 		 				  		 				   
String Output = ""; 		 				  		 				   
 		 				  		 				   
debug("------------PRGM-------------"); 		 				  		 				   
 		 				  		 				   
do{ 		 				  		 				   
 		 				  		 				   
    Count_2 = 0; 		 				  		 				   
    do{ 		 				  		 				   
 		 				  		 				   
        Count_3 = 0; 		 				  		 				   
 		 				  		 				   
        if ( (mots[Count_1].toLowerCase()).equals(interdits[Count_2].toLowerCase()) ){ 		 				  		 				   
            debug("\"" + mots[Count_1] + "\" is not allowed !"); 		 				  		 				   
 		 				  		 				   
            Output += " "; 		 				  		 				   
            do{ 		 				  		 				   
                Output += "*"; 		 				  		 				   
                Count_3++; 		 				  		 				   
            }while(Count_3 < mots[Count_1].length()); 		 				  		 				   
 		 				  		 				   
            break; 		 				  		 				   
        } 		 				  		 				   
 		 				  		 				   
        Count_2++; 		 				  		 				   
    }while(Count_2 < interdits.length); 		 				  		 				   
 		 				  		 				   
    if (Output != "") { 		 				  		 				   
        if (Count_3 == 0){ 		 				  		 				   
            Output += " " + mots[Count_1] + ""; 		 				  		 				   
        } 		 				  		 				   
    }else{ 		 				  		 				   
        if (Count_3 == 0){ 		 				  		 				   
            Output += mots[Count_1]; 		 				  		 				   
        } 		 				  		 				   
    } 		 				  		 				   
 		 				  		 				   
    Count_1++; 		 				  		 				   
}while(Count_1 < mots.length); 		 				  		 				   
 		 				  		 				   
 		 				  		 				   
affiche(Output); 		 				  		 				   
 		 				  		 				   
 		 				  		 				   
//Debug Sequence... 		 				  		 				   
debug("------------mots-------------"); 		 				  		 				   
Count_1 = 0; 		 				  		 				   
do{ 		 				  		 				   
    debug("" + mots[Count_1].length() + " chars."); 		 				  		 				   
    debug(mots[Count_1]); 		 				  		 				   
    Count_1++; 		 				  		 				   
}while(Count_1 < mots.length); 		 				  		 				   
 		 				  		 				   
debug("----------interdits----------"); 		 				  		 				   
Count_1 = 0; 		 				  		 				   
do{ 		 				  		 				   
    debug("" + interdits[Count_1].length() + " chars."); 		 				  		 				   
    debug(interdits[Count_1]); 		 				  		 				   
    Count_1++; 		 				  		 				   
}while(Count_1 < interdits.length); 		 				  		 				   