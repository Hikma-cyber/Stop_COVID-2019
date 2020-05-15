package com.example.stopcovid_19;

import java.util.ArrayList;

public class DataLangkah {
    private static String[] namaLangkah = {
            "Rajin Mencuci Tangan",
            "Menggunakan Masker",
            "Hindari Bersentuhan",
            "Jangan Sentuh Area Wajah",
            "Etika Bersin dan Batuk",
            "Hindari Berbagi Barang Pribadi",
            "Bersihkan Perabotan Rumah",
            "Physical Distancing",
            "Selalu Mencuci Bahan Makanan",
            "Tingkatkan Imunitas Tubuh"
    };

    private static String[] detailLangkah = {
            "Walau terdengar umum, namun mencuci tangan adalah pangkal kebersihan dan kesehatan. Tangan adalah sumber kuman dan bakteri yang dapat menyebabkan beragam penyakit. Cuci tangan minimal 20 detik dengan menggunakan sabun, dan air mengalir. Langkah ini efektif membunuh kuman dan bakteri, termasuk virus corona. Cuci tangan menjadi salah satu cara mencegah penyebaran virus corona yang sangat diremondasikan, termasuk oleh Badan Kesehatan Dunia (WHO).",
            "Meskipun virus corona tidak menular lewat udara, upayakan untuk menggunakan masker agar tetap terlindungi dari virus. Jika kondisi Anda sehat, maka masker kain sudah cukup aman untuk dipakai. Tapi jika kamu dalam kondisi kesehatan yang kurang baik, maka upayakan untuk menggunakan masker medis yang memiliki ketebalan 3 lapis, alias 3 ply.",
            "Berpelukan, dan berjabat tangan, adalah hal yang harus dihindari. Dengan menghindari kontak kulit maka tak ada kemungkinan perpindahan virus dan kuman yang terjadi. ",
            "Virus corona bisa menyerang tubuh lewat area segitiga wajah seperti mulut, mata, dan hidung. Jadi, hindari untuk menyentuhnya agar tidak ada kemungkinan masuknya virus corona ke tubuh. ",
            "Virus corona bisa menular lewat droplet. Jadi saat bersin dan batuk, tutup dengan tisu atau lipatan tangan agar virus tidak menyebar ke orang lain. Jangan lupa untuk segera mencuci tangan setelahnya.",
            "Bukan pelit, tapi ini demi kesehatan bersama. Perlu diingat jika virus corona dapat bertahan pada permukan hingga tiga hari. Oleh sebab itu, usahakan untuk menggunakan barang pribadi dan tidak memakainya secara bergantian.",
            "Selain menjaga kebersihan tubuh, Anda juga harus menjaga kebersihan rumah. Jangan lupa untuk gunakan cairan desinfektan untuk membersihkannya secara teratur sehingga tak ada kuman dan virus penyebab penyakit yang bersarang di rumah. ",
            "Hindari kerumunan dan jaga jarak minimal 1 meter dengan orang lain. Langkah ini bisa diterapkan saat berada di tempat umum atau luar ruangan sehingga kamu bsa mencegah terpapar virus corona.",
            "Jangan lupa untuk mencuci bahan makanan sebelum disantap atau disimpan di dalam lemari pendingin. Buah-buahan dan sayuran bisa dibersihkan dengan larutan hidrogen peroksida atau cuka putih yang sangat aman digunakan untuk makanan.",
            "Hindari stres, makan makanan bergizi yang kaya vitamin dan mineral serta lakukan olahraga ringan agar badan tetap fit selama WFH di rumah. Saat imunitas tubuh baik, maka akan memperkecil kemungkinan Anda untuk terkena virus corona yang membahayakan kesehatan.",
    };

    private static int[] gambarLangkah = {
            R.drawable.satu,
            R.drawable.dua,
            R.drawable.tiga,
            R.drawable.empat,
            R.drawable.lima,
            R.drawable.enam,
            R.drawable.tujuh,
            R.drawable.delapan,
            R.drawable.sembilan,
            R.drawable.sepuluh
    };

    static ArrayList<Langkah> getListData() {
        ArrayList<Langkah> list = new ArrayList<>();
        for (int position = 0; position < namaLangkah.length; position++) {
            Langkah langkah = new Langkah();
            langkah.setNama_langkah(namaLangkah[position]);
            langkah.setDetail_langkah(detailLangkah[position]);
            langkah.setPhoto(gambarLangkah[position]);
            list.add(langkah);
        }
        return list;
    }
}
