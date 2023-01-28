int Count_1 = 0; 		 				  		 				   
String DebugOutput = ""; 		 				  		 				   
 		 				  		 				   
mot1 = mot1.toLowerCase(); 		 				  		 				   
mot2 = mot2.toLowerCase(); 		 				  		 				   
 		 				  		 				   
int[] word1 = new int[127]; 		 				  		 				   
int[] word2 = new int[127]; 		 				  		 				   
 		 				  		 				   
 		 				  		 				   
if (mot1.length() == mot2.length()){ 		 				  		 				   
 		 				  		 				   
    do{ 		 				  		 				   
        word1[mot1.charAt(Count_1)] += 1; 		 				  		 				   
        word2[mot2.charAt(Count_1)] += 1; 		 				  		 				   
        Count_1++; 		 				  		 				   
    }while(Count_1 < mot1.length()); 		 				  		 				   
 		 				  		 				   
    boolean Validity = true; 		 				  		 				   
 		 				  		 				   
    Count_1 = 0; 		 				  		 				   
    do{ 		 				  		 				   
        if(word1[Count_1] != word2[Count_1]){ 		 				  		 				   
            Validity = false; 		 				  		 				   
            break; 		 				  		 				   
        } 		 				  		 				   
       Count_1++; 		 				  		 				   
    }while(Count_1 < word1.length); 		 				  		 				   
 		 				  		 				   
    if (Validity){ 		 				  		 				   
        affiche("Anagrammes"); 		 				  		 				   
    }else{ 		 				  		 				   
        affiche("Pas anagrammes"); 		 				  		 				   
    } 		 				  		 				   
 		 				  		 				   
}else{ 		 				  		 				   
 		 				  		 				   
    affiche("Pas anagrammes"); 		 				  		 				   
} 		 				  		 				   