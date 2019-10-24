package prototypeprogmob.com.Model;

public class KRSSI {
    private String nama;
    private String nim;
    private String gender;
    private String hobby;
    private String cita;
    private String moto;
    private int ImgMhs;

    public KRSSI(String nama, String nim, String gender, String hobby, String cita, String moto, int ImgMhs){
        this.nama = nama;
        this.nim = nim;
        this.gender = gender;
        this.hobby = hobby;
        this.cita = cita;
        this.moto = moto;
        this.ImgMhs = ImgMhs;
    }
    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public String getNim(){
        return nim;
    }
    public void setNim(String nim){
        this.nim = nim;
    }
    public String getGender(){
        return gender;
    }
    public void setGender(String gender){
        this.gender = gender;
    }
    public String getHobby(){
        return hobby;
    }
    public void setHobby(String hobby){
        this.hobby = hobby;
    }
    public String getCita(){
        return cita;
    }
    public void setCita(String cita){
        this.cita = cita;
    }
    public String getMoto(){
        return moto;
    }
    public void setMoto(String moto){
        this.moto = moto;
    }
    public int getImgMhs(){
        return ImgMhs;
    }
    public void setImgMhs(int imageResource){
        this.ImgMhs = ImgMhs;
    }
}
