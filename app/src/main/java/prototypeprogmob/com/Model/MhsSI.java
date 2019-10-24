package prototypeprogmob.com.Model;

import android.provider.ContactsContract;

public class MhsSI {
    private String nama;
    private String nim;
    private String Alamat;
    private String Email;
    private int ImgMhs;

    public MhsSI(String nama, String nim, String Alamat, String Email, int ImgMhs){
        this.nama = nama;
        this.nim = nim;
        this.Alamat = Alamat;
        this.Email = Email;
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
    public String getAlamat(){
        return Alamat;
    }
    public void setAlamat(String Alamat){
        this.Alamat = Alamat;
    }
    public String getEmail(){
        return Email;
    }
    public void setEmail(String Email){
        this.Email = Email;
    }
    public int getImgMhs(){
        return ImgMhs;
    }
    public void setImgMhs(int imageResource){
        this.ImgMhs = ImgMhs;
    }
}
