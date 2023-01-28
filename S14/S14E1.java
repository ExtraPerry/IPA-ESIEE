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
        this.prenom = p_Prenom; 		 				  		 				   
        this.nom = p_Nom; 		 				  		 				   
        this.age = p_Age; 		 				  		 				   
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
} 		 				  		 				   