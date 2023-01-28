class Personne { 		 				  		 				   
    private String prenom; 		 				  		 				   
    private String nom; 		 				  		 				   
    private int age; 		 				  		 				   
 		 				  		 				   
    public Personne(){ 		 				  		 				   
        this.age = 0; 		 				  		 				   
        this.prenom = "John"; 		 				  		 				   
        this.nom = "Doe"; 		 				  		 				   
    } 		 				  		 				   
 		 				  		 				   
    public Personne(String p_Prenom, String p_Nom, int p_Age){ 		 				  		 				   
        this.setPrenom(p_Prenom); 		 				  		 				   
        this.setNom(p_Nom); 		 				  		 				   
        this.setAge(p_Age); 		 				  		 				   
    } 		 				  		 				   
 		 				  		 				   
    public String getPrenom(){ 		 				  		 				   
        return this.prenom; 		 				  		 				   
    } 		 				  		 				   
 		 				  		 				   
    public String getNom(){ 		 				  		 				   
        return this.nom; 		 				  		 				   
    } 		 				  		 				   
 		 				  		 				   
    public int getAge(){ 		 				  		 				   
        return this.age; 		 				  		 				   
    } 		 				  		 				   
 		 				  		 				   
    public void setPrenom(String p_Prenom){ 		 				  		 				   
        int v_Count_1 = 0; 		 				  		 				   
        String v_Temp_1 = ""; 		 				  		 				   
 		 				  		 				   
        p_Prenom  = p_Prenom.toLowerCase(); 		 				  		 				   
        v_Temp_1 += "" + p_Prenom.charAt(v_Count_1) + ""; 		 				  		 				   
        v_Temp_1 = v_Temp_1.toUpperCase(); 		 				  		 				   
        v_Count_1++; 		 				  		 				   
 		 				  		 				   
        do{ 		 				  		 				   
            v_Temp_1 += "" + p_Prenom.charAt(v_Count_1) + ""; 		 				  		 				   
            v_Count_1++; 		 				  		 				   
        }while(v_Count_1 < p_Prenom.length()); 		 				  		 				   
 		 				  		 				   
        this.prenom = v_Temp_1; 		 				  		 				   
    } 		 				  		 				   
 		 				  		 				   
    public void setNom(String p_Nom){ 		 				  		 				   
        int v_Count_1 = 0; 		 				  		 				   
        String v_Temp_1 = ""; 		 				  		 				   
 		 				  		 				   
        p_Nom  = p_Nom.toLowerCase(); 		 				  		 				   
        v_Temp_1 += "" + p_Nom.charAt(v_Count_1) + ""; 		 				  		 				   
        v_Temp_1 = v_Temp_1.toUpperCase(); 		 				  		 				   
        v_Count_1++; 		 				  		 				   
 		 				  		 				   
        do{ 		 				  		 				   
            v_Temp_1 += "" + p_Nom.charAt(v_Count_1) + ""; 		 				  		 				   
            v_Count_1++; 		 				  		 				   
        }while(v_Count_1 < p_Nom.length()); 		 				  		 				   
 		 				  		 				   
        this.nom = v_Temp_1; 		 				  		 				   
    } 		 				  		 				   
 		 				  		 				   
    public void setAge(int p_Age){ 		 				  		 				   
        if (p_Age < 0){ 		 				  		 				   
            p_Age = 0; 		 				  		 				   
        } 		 				  		 				   
 		 				  		 				   
        this.age = p_Age; 		 				  		 				   
    } 		 				  		 				   
} 		 				  		 				   