String jour(int a) 		 				  		 				   
{ 		 				  		 				   
    int Days = 0; 		 				  		 				   
    String Output = ""; 		 				  		 				   
 		 				  		 				   
    if (a<=Days + 31){//1 		 				  		 				   
        Output = "" + (a - Days) + " Janvier"; 		 				  		 				   
 		 				  		 				   
    }else{ 		 				  		 				   
        Days += 31; 		 				  		 				   
        if (a<=Days + 28){//2 		 				  		 				   
        Output = "" + (a - Days) + " Février"; 		 				  		 				   
 		 				  		 				   
        }else{ 		 				  		 				   
            Days += 28; 		 				  		 				   
            if (a<=Days + 31){//3 		 				  		 				   
                Output = "" + (a - Days) + " Mars"; 		 				  		 				   
 		 				  		 				   
            }else{ 		 				  		 				   
                Days += 31; 		 				  		 				   
                if (a<=Days + 30){//4 		 				  		 				   
                    Output = "" + (a - Days) + " Avril"; 		 				  		 				   
 		 				  		 				   
                }else{ 		 				  		 				   
                    Days += 30; 		 				  		 				   
                    if (a<=Days + 31){//5 		 				  		 				   
                        Output = "" + (a - Days) + " Mai"; 		 				  		 				   
 		 				  		 				   
                    }else{ 		 				  		 				   
                        Days += 31; 		 				  		 				   
                        if (a<=Days + 30){//6 		 				  		 				   
                            Output = "" + (a - Days) + " Juin"; 		 				  		 				   
 		 				  		 				   
                        }else{ 		 				  		 				   
                            Days += 30; 		 				  		 				   
                            if (a<=Days + 31){//7 		 				  		 				   
                                Output = "" + (a - Days) + " Juillet"; 		 				  		 				   
 		 				  		 				   
                            }else{ 		 				  		 				   
                                Days += 31; 		 				  		 				   
                                if (a<=Days + 31){//8 		 				  		 				   
                                    Output = "" + (a - Days) + " Août"; 		 				  		 				   
 		 				  		 				   
                                }else{ 		 				  		 				   
                                    Days += 31; 		 				  		 				   
                                    if (a<=Days + 30){//9 		 				  		 				   
                                        Output = "" + (a - Days) + " Septembre"; 		 				  		 				   
 		 				  		 				   
                                    }else{ 		 				  		 				   
                                        Days += 30; 		 				  		 				   
                                        if (a<=Days + 31){//10 		 				  		 				   
                                            Output = "" + (a - Days) + " Octobre"; 		 				  		 				   
 		 				  		 				   
                                        }else{ 		 				  		 				   
                                            Days += 31; 		 				  		 				   
                                            if (a<=Days + 30){//11 		 				  		 				   
                                                Output = "" + (a - Days) + " Novembre"; 		 				  		 				   
 		 				  		 				   
                                            }else{ 		 				  		 				   
                                                Days += 30; 		 				  		 				   
                                                if (a<=Days + 31){//12 		 				  		 				   
                                                    Output = "" + (a - Days) + " Décembre"; 		 				  		 				   
 		 				  		 				   
                                                }else{ 		 				  		 				   
                                                    Output = "null"; 		 				  		 				   
                                                } 		 				  		 				   
                                            } 		 				  		 				   
                                        } 		 				  		 				   
                                    } 		 				  		 				   
                                } 		 				  		 				   
                            } 		 				  		 				   
                        } 		 				  		 				   
                    } 		 				  		 				   
                } 		 				  		 				   
            } 		 				  		 				   
        } 		 				  		 				   
    } 		 				  		 				   
    return Output; 		 				  		 				   
} 		 				  		 				   