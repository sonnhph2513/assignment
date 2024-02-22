/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ASM.Model;
/**
 *
 * @author acer
 */

public class Grade {
    private int id;
    private String MaSV;
    private int TiengAnh;
    private int TinHoc;
    private int GDTC;

    public Grade() {
    }

    public Grade(int id, String MaSV, int TiengAnh, int TinHoc, int GDTC) {
        this.id = id;
        this.MaSV = MaSV;
        this.TiengAnh = TiengAnh;
        this.TinHoc = TinHoc;
        this.GDTC = GDTC;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMaSV() {
        return MaSV;
    }

    public void setMaSV(String MaSV) {
        this.MaSV = MaSV;
    }

    public int getTiengAnh() {
        return TiengAnh;
    }

    public void setTiengAnh(int TiengAnh) {
        this.TiengAnh = TiengAnh;
    }

    public int getTinHoc() {
        return TinHoc;
    }

    public void setTinHoc(int TinHoc) {
        this.TinHoc = TinHoc;
    }

    public int getGDTC() {
        return GDTC;
    }

    public void setGDTC(int GDTC) {
        this.GDTC = GDTC;
    }
    
    
}
