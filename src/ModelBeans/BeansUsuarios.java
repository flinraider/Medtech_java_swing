package ModelBeans;



public class BeansUsuarios {
    
    private Integer usID;
    private String  usNome;
    private String  usPerfil;
    private String  usSenha;
    private String  busca;

    public String getBusca() {
        return busca;
    }

    public void setBusca(String busca) {
        this.busca = busca;
    }
    

    public Integer getUsID() {
        return usID;
    }

    public void setUsID(Integer usID) {
        this.usID = usID;
    }

    public String getUsNome() {
        return usNome;
    }

    public void setUsNome(String usNome) {
        this.usNome = usNome;
    }

    public String getUsPerfil() {
        return usPerfil;
    }

    public void setUsPerfil(String usPerfil) {
        this.usPerfil = usPerfil;
    }
    public String getUsSenha(){
        return usSenha;
    }
    public void setUsSenha(String usSenha){
        this.usSenha = usSenha;
    }
   
    
}
