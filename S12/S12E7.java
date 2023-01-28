int lotoVerif(String a, String b) 		 				  		 				   
{ 		 				  		 				   
    String[] Serie1 = a.split("-"); 		 				  		 				   
    String[] Serie2 = b.split("-"); 		 				  		 				   
 		 				  		 				   
    int Count_1 = 0; 		 				  		 				   
    debug("-------Serie1-------"); 		 				  		 				   
    do{ 		 				  		 				   
        debug("" + Count_1 + " ==> " + Serie1[Count_1] + ""); 		 				  		 				   
        Count_1++; 		 				  		 				   
    }while(Count_1 < Serie1.length); 		 				  		 				   
 		 				  		 				   
    Count_1 = 0; 		 				  		 				   
    debug("-------Serie2-------"); 		 				  		 				   
    do{ 		 				  		 				   
        debug("" + Count_1 + " ==> " + Serie2[Count_1] + ""); 		 				  		 				   
        Count_1++; 		 				  		 				   
    }while(Count_1 < Serie1.length); 		 				  		 				   
 		 				  		 				   
    int Count_2 = 0; 		 				  		 				   
    int Result = 0; 		 				  		 				   
 		 				  		 				   
 		 				  		 				   
    Count_1 = 0; 		 				  		 				   
    do{ 		 				  		 				   
        Count_2 = 0; 		 				  		 				   
        do{ 		 				  		 				   
            if (Serie1[Count_1].equals(Serie2[Count_2])){ 		 				  		 				   
                Result++; 		 				  		 				   
                break; 		 				  		 				   
            } 		 				  		 				   
            Count_2++; 		 				  		 				   
        }while(Count_2 < Serie2.length); 		 				  		 				   
        Count_1++; 		 				  		 				   
    }while(Count_1 < Serie1.length); 		 				  		 				   
    return Result; 		 				  		 				   
} 		 				  		 				   