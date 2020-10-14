package com.example.risma;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    //membuat array list makanan
    String list_nama[] = {
      "Sate","Asinan Bogor","Gado Gado","Gudeg","Kerak Telor","Pempek","Rawon","Rendang","Selat Solo",
            "Soto Kudus"
    };
    String info[] = {
            "Sate adalah makanan yang terbuat dari daging yang dipotong kecil-kecil.",
            "Asinan adalah sejenis makanan yang dibuat dengan cara pengacaran (melalui pengasinan dengan garam atau pengasaman dengan cuka), bahan yang diacarkan yaitu berbagai jenis sayuran dan buah-buahan.",
            "makanan yang berupa sayur-sayuran yang direbus dan dicampur jadi satu, dengan bumbu saus dari kacang tanah dan yang dihaluskan",
            "Gudeg adalah makanan khas Yogyakarta dan Jawa Tengah yang terbuat dari nangka muda yang dimasak dengan santan.",
            "Kerak telur adalah makanan asli daerah Jakarta, dengan bahan-bahan beras ketan putih, telur ayam, ebi yang disangrai kering ditambah bawang merah goreng, lalu diberi bumbu yang dihaluskan berupa kelapa sangrai, cabai merah, kencur, jahe, merica butiran, garam dan gula pasir.",
            "Pempek atau empek-empek adalah makanan khas Palembang yang terbuat dari daging ikan yang digiling lembut dan tepung kanji, serta beberapa komposisi lain seperti telur, bawang putih yang dihaluskan, penyedap rasa dan garam.",
            "Rawon adalah masakan Indonesia berupa sup daging berkuah hitam sebagai campuran bumbu khas yang menggunakan kluwek. Rawon, meskipun dikenal sebagai masakan khas Jawa Timur, dikenal pula oleh masyarakat Jawa Tengah sebelah timur.",
            "Rendang atau randang adalah masakan daging dengan bumbu rempah-rempah yang berasal dari Minangkabau. Masakan ini dihasilkan dari proses memasak yang dipanaskan berulang-ulang menggunakan santan sampai kuahnya kering sama sekali.",
            "Selat solo adalah sebuah hidangan khas Jawa yang memiliki pengaruh hidangan Eropa dan berasal dari kota Solo, Jawa Tengah. Makanan ini terdiri dari daging sapi has luar yang direbus dalam kuah encer yang terbuat dari bawang putih, cuka, kecap manis, kecap Inggris, air serta dibumbui dengan pala dan merica.",
            "Soto kudus adalah soto yang berasal dari Kudus. Soto kudus, hampir mirip dengan soto Lamongan, soto kudus berisi suwiran ayam dan taoge. Terkadang soto kudus juga menggunakan daging kerbau. Kuahnya lebih bening. Soto kudus dalam penyajiannya memiliki tradisi dihidangkan dalam mangkuk kecil untuk satu porsi soto."
    };
    String gambar[] = {
            (Integer.toString(R.drawable.sate)),
            (Integer.toString(R.drawable.asinanbogor)),
            (Integer.toString(R.drawable.gadogado)),
            (Integer.toString(R.drawable.gudeg)),
            (Integer.toString(R.drawable.keraktelor)),
            (Integer.toString(R.drawable.pempek)),
            (Integer.toString(R.drawable.rawon)),
            (Integer.toString(R.drawable.rendang)),
            (Integer.toString(R.drawable.saletsolo)),
            (Integer.toString(R.drawable.sotokudus))
    };

    //deklarasi listview
    ListView lv_makanan;
    FloatingActionButton fab;

    ArrayList<HashMap<String, String>> list;
    HashMap<String, String> map;
    protected ListAdapter adapter;
    SimpleAdapter Adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // pada method onCreate, panggil fab dari xml
        fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(getApplicationContext(),about.class);
                startActivity(a);
            }
        });

        lv_makanan = (ListView)findViewById(R.id.lvmakanan);
        //membuat adapter untuk menampung data sementara
        list = new ArrayList<HashMap<String,String>>();

        for (int i = 0; i < list_nama.length; i++){
            map = new HashMap<String, String>();
            map.put("nama", list_nama[i]);
            map.put("info", info[i]);
            map.put("gambar", gambar[i]);
            list.add(map);
        }

        //memasukkan list kedalam adapter
        Adapter = new SimpleAdapter(this, list, R.layout.list_makanan,
                new String[] {"nama","info", "gambar"}, new int[] {R.id.nama,R.id.info, R.id.gambar});

        lv_makanan.setAdapter(Adapter);

        //menangani setiap klik dari user
        lv_makanan.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent a = new Intent(getApplicationContext(), detail.class);
                //kirim data
                //data file yang akan ditampilkan
                a.putExtra("id",Integer.toString(position));
                a.putExtra("nama",list_nama[position]);
                a.putExtra("info",info[position]);
                a.putExtra("gambar",gambar[position]);

                startActivity(a);
            }
        });
    }
}
