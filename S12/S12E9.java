double prixCourses(String a, String b) 		 				  		 				   
{ 		 				  		 				   
    String[] List = a.split(";"); 		 				  		 				   
    String[] Prix = b.split(";"); 		 				  		 				   
    String[][] List_2D = new String [List.length][2]; 		 				  		 				   
    String[][] Prix_2D = new String [Prix.length][2]; 		 				  		 				   
    double Total = 0; 		 				  		 				   
    int Count_1 = 0; 		 				  		 				   
    int Count_2 = 0; 		 				  		 				   
 		 				  		 				   
    Count_1 = 0; 		 				  		 				   
    do{ 		 				  		 				   
        List_2D[Count_1] = List[Count_1].split(" "); 		 				  		 				   
        Count_1++; 		 				  		 				   
    }while(Count_1 < List.length); 		 				  		 				   
 		 				  		 				   
    Count_1 = 0; 		 				  		 				   
    do{ 		 				  		 				   
        Prix_2D[Count_1] = Prix[Count_1].split("="); 		 				  		 				   
        Count_1++; 		 				  		 				   
    }while(Count_1 < Prix.length); 		 				  		 				   
 		 				  		 				   
    //Debugging Start// 		 				  		 				   
    Count_1 = 0; 		 				  		 				   
    debug("-------List-------"); 		 				  		 				   
    do{ 		 				  		 				   
        debug("" + List_2D[Count_1][0] + " / " + List_2D[Count_1][1] + ""); 		 				  		 				   
        Count_1++; 		 				  		 				   
    }while(Count_1 < List_2D.length); 		 				  		 				   
 		 				  		 				   
    Count_1 = 0; 		 				  		 				   
    debug("-------Prix-------"); 		 				  		 				   
    do{ 		 				  		 				   
        debug("" + Prix_2D[Count_1][0] + " / " + Prix_2D[Count_1][1] + ""); 		 				  		 				   
        Count_1++; 		 				  		 				   
    }while(Count_1 < Prix_2D.length); 		 				  		 				   
    //Debugging End// 		 				  		 				   
 		 				  		 				   
    debug("-------Calc-------"); 		 				  		 				   
    Count_1 = 0; 		 				  		 				   
    do{ 		 				  		 				   
        Count_2 = 0; 		 				  		 				   
        do{ 		 				  		 				   
            if (List_2D[Count_1][1].equals(Prix_2D[Count_2][0])){ 		 				  		 				   
                Total += convertirEnReel(List_2D[Count_1][0]) * convertirEnReel(Prix_2D[Count_2][1]); 		 				  		 				   
                debug("" + List_2D[Count_1][0] + " " + List_2D[Count_1][1] + " = " + (convertirEnReel(List_2D[Count_1][0]) * convertirEnReel(Prix_2D[Count_2][1]) + "")); 		 				  		 				   
                break; 		 				  		 				   
            } 		 				  		 				   
            Count_2++; 		 				  		 				   
        }while(Count_2 < Prix_2D.length); 		 				  		 				   
        Count_1++; 		 				  		 				   
    }while(Count_1 < List_2D.length); 		 				  		 				   
 		 				  		 				   
    debug("-------Result-------"); 		 				  		 				   
    return Total; 		 				  		 				   
} 		 				  		 				   