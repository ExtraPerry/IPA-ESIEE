double polynome(double[] a, double b) 		 				  		 				   
{ 		 				  		 				   
    int Count_1 = 0; 		 				  		 				   
    int Count_2 = 0; 		 				  		 				   
    double xSquare = 0; 		 				  		 				   
    double Result = 0; 		 				  		 				   
 		 				  		 				   
    do{ 		 				  		 				   
        if (Count_1 == 0){ 		 				  		 				   
            Result += a[0]; 		 				  		 				   
        }else{ 		 				  		 				   
            Count_2 = 0; 		 				  		 				   
            do{ 		 				  		 				   
                if (Count_1 == 1){ 		 				  		 				   
                    xSquare = b; 		 				  		 				   
                    break; 		 				  		 				   
                }else{ 		 				  		 				   
                    if (Count_2 == 0){ 		 				  		 				   
                        xSquare = b; 		 				  		 				   
                    }else{ 		 				  		 				   
                        xSquare *= b; 		 				  		 				   
                    } 		 				  		 				   
                } 		 				  		 				   
                Count_2++; 		 				  		 				   
            }while(Count_2 < Count_1); 		 				  		 				   
            Result += a[Count_1] * xSquare; 		 				  		 				   
        } 		 				  		 				   
        debug("Cycle " + Count_1 + " = " + Result + " & xSquare = " + xSquare + ""); 		 				  		 				   
        Count_1++; 		 				  		 				   
    }while(Count_1 < a.length); 		 				  		 				   
 		 				  		 				   
    return Result; 		 				  		 				   
} 		 				  		 				   