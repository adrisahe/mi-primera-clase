public class Termometro {
    //Marca del termometro
    private String marcaTermometro;
    private int costeTermometro;
    private boolean termometroMercurio; 
    
    /*
     * Crea termometro.
     */
    public Termometro(int costeDelTermometro, boolean termometroDeMercurio) {
        marcaTermometro = "desconocido";
        costeTermometro = costeDelTermometro;
        termometroMercurio = termometroDeMercurio;
    }
    
    /*
     * fijar la marca del termometro.
     */
    public void setMarca (String marcaDelTermometro) {
        marcaTermometro = marcaDelTermometro;
        }
    
    /*
     * Modifica el coste del termometro rebajando su coste un 20%.
     */
    public int rebajaPrecio () {
        int rebajaPrecio = ((costeTermometro * 20) / 100 );
        costeTermometro = (costeTermometro - rebajaPrecio);
        return costeTermometro;
    }
    
    public void cambiarTipoDeTermometro () {
        termometroMercurio = !termometroMercurio;
    }
    
    public void imprimeInformacion () {
        String tipoTermometro = "termometroDigital";
        if (termometroMercurio == true){
            tipoTermometro = "termometro de mercurio";
        }
        System.out.println ("marca: " + marcaTermometro + " | " + " coste: " + costeTermometro + " euros " + "| " + "tipo: " + tipoTermometro);
    }
    
    public String getMarcaTermometro () {
        return marcaTermometro;
    }
    
    public int getCosteTermometro () {
        return costeTermometro;
    }
    
    public boolean getTermometroMercurio () {
        String tipoTermometro = "termometroDigital";
        if (termometroMercurio == true){
            tipoTermometro = "termometro de mercurio";
        }
        return termometroMercurio;
    }
    
    public String estadoTermometro () {
        String tipoTermometro = "termometroDigital";
        if (termometroMercurio == true){
            tipoTermometro = "termometro de mercurio";
        }
        return ("marca: " + marcaTermometro + " | " + "coste: " + costeTermometro + " euros " + "| " + "tipo de termometro: " + termometroMercurio);
    }
}