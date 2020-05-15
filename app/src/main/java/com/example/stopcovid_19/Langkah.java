package com.example.stopcovid_19;

import android.os.Parcel;
import android.os.Parcelable;

public class Langkah implements Parcelable {
    private String nama_langkah;
    private String detail_langkah;
    private int photo;

    public Langkah() {

    }

    public String getNama_langkah() {
        return nama_langkah;
    }

    public void setNama_langkah(String nama_langkah) {
        this.nama_langkah = nama_langkah;
    }

    public String getDetail_langkah() {
        return detail_langkah;
    }

    public void setDetail_langkah(String detail_langkah) {
        this.detail_langkah = detail_langkah;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(nama_langkah);
        parcel.writeString(detail_langkah);
        parcel.writeInt(photo);
    }

    protected Langkah(Parcel in) {
        nama_langkah = in.readString();
        detail_langkah = in.readString();
        photo = in.readInt();
    }

    public static final Creator<Langkah> CREATOR = new Creator<Langkah>() {
        @Override
        public Langkah createFromParcel(Parcel in) {
            return new Langkah(in);
        }

        @Override
        public Langkah[] newArray(int size) {
            return new Langkah[size];
        }
    };
}
