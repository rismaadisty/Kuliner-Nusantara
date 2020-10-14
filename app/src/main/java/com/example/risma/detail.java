package com.example.risma;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.HashMap;

public class detail extends AppCompatActivity {

    //definisi semua komponen yang ada
    ImageView gambar;
    TextView nama;
    ListView lv_detail;

    //menampung semua judul
    String judul[] = {
        "Info : ","Bahan - Bahan Yang Harus Disiapkan : ","Langkah - Langkah : "
    };

    //menampung info dari setiap makanan
    String info[] = {
        "Sate Ayam adalah makanan khas Indonesia. Sate Ayam dibuat dari daging ayam. Pada umumnya sate ayam dimasak dengan cara dipanggang dengan menggunakan arang dan disajikan dengan pilihan bumbu kacang atau bumbu kecap. Sate ini biasanya disajikan bersama dengan lontong atau nasi.",
        "Asinan adalah sejenis makanan yang dibuat dengan cara pengacaran (melalui pengasinan dengan garam atau pengasaman dengan cuka), bahan yang diacarkan yaitu berbagai jenis sayuran dan buah-buahan. Asinan adalah salah satu hidangan khas seni kuliner Indonesia. Istilah asin mengacu kepada proses pengawetan dengan merendam buah atau sayur dalam larutan campuran air dan garam. Asinan sangat mirip dengan rujak, perbedaan utamanya antara lain bahan rujak disajikan segar, sedangkan bahan asinan disajikan dalam keadaan diasinkan atau diacar.",
            "Gado-gado adalah salah satu makanan yang berasal dari Indonesia yang berupa sayur-sayuran yang direbus dan dicampur jadi satu, dengan bumbu kacang atau saus dari kacang tanah dan yang dihaluskan disertai irisan telur dan pada umumnya banyak yang menambahkan kentang rebus yang sudah dihaluskan untuk saus gado gado kentang rebus dimasak bersamaan dengan bumbu kacang kemudian di atasnya ditaburi bawang goreng.",
            "Gudeg adalah makanan khas Yogyakarta dan Jawa Tengah yang terbuat dari nangka muda yang dimasak dengan santan. Perlu waktu berjam-jam untuk membuat masakan ini. Warna coklat biasanya dihasilkan oleh daun jati yang dimasak bersamaan. Gudeg dimakan dengan nasi dan disajikan dengan kuah santan kental (areh), ayam kampung, telur, tempe, tahu dan sambal goreng krecek.",
            "Kerak telur adalah makanan asli daerah Jakarta (Betawi), dengan bahan-bahan beras ketan putih, telur ayam, ebi (udang kering yang diasinkan) yang disangrai kering ditambah bawang merah goreng, lalu diberi bumbu yang dihaluskan berupa kelapa sangrai, cabai merah, kencur, jahe, merica butiran, garam dan gula pasir.",
            "Pempek, makanan khas Palembang yang satu ini berbahan dasar ikan. Diolah bersama dengan tepung, rasa makanan ini cenderung gurih pada pempeknya dan asam manis pada sausnya. Kuah encer yang digunakan sebagai saus pempek adalah perpaduan antara gula dan saus cuka.Awalnya pempek dikenal dengan nama 'kalesan', alat yang digunakan untuk menghaluskan daging ikan. Alat ini berbentuk cembung dengan tambahan kuping di sisi yang berhadapan. Pembuatannya yang mengunakan teknik ditekan tekan atau di-'keles' membuat pempek dikenal dengan nama lain yakni kalesan.",
            "Rawon adalah masakan Indonesia berupa sup daging berkuah hitam sebagai campuran bumbu khas yang menggunakan kluwek. Rawon, meskipun dikenal sebagai masakan khas Jawa Timur, dikenal pula oleh masyarakat Jawa Tengah sebelah timur (daerah Surakarta).",
            "Rendang atau randang (Jawi: رندڠ) adalah masakan daging dengan bumbu rempah-rempah yang berasal dari Minangkabau. Masakan ini dihasilkan dari proses memasak yang dipanaskan berulang-ulang menggunakan santan sampai kuahnya kering sama sekali. Proses memasaknya memakan waktu berjam-jam (biasanya sekitar empat jam) hingga yang tinggal hanyalah potongan daging berwarna hitam pekat. Dalam suhu ruangan, rendang dapat bertahan hingga berminggu-minggu. Rendang yang dimasak dalam waktu yang lebih singkat dan santannya belum mengering disebut kalio, berwarna coklat terang keemasan.",
            "Selat Solo atau lebih dikenal dengan nama bistik jawa merupakan menu modifikasi daging yang dimasak seperti demur. Dilengkapi dengan kentang goreng, selada, acar mentimun, putih telur rebus, buncis, dan wortel iris rebus, bistik ini kemudian disiram dengan kuah kecokelatan dengan rasa yang manis. Selain saus yang menyerupai semur, Selat Solo juga",
            "Soto Kudus adalah jenis variasi makanan soto khas dari Kudus, Jawa tengah. Soto Kudus ini hampir sama dengan Soto lamongan, namun selain menggunakan suwiran daging ayam yang membedakan adalah Soto Kudus juga menggunakan daging kerbau. Selain itu kuah dari Soto Kudus ini lebih bening dari Soto lamongan. Makanan ini tidak hanya di temukan di Kudus saja, namun sudah menyebar ke berbagai tempat di indonesia."
    };

    //menampung bahan bahan
    String bahan[] = {
      "1. Tusukan sate\n" +
              "2. 500 gram daging ayam potong dadu\n" +
              "3. 4 sdm kecap manis\n" +
              "5. 2 sdm margarin\n" +
              "\nBumbu yang dihaluskan:\n" +
              "\n1. 4 buah cabe merah\n" +
              "2. 5 butir bawang merah\n" +
              "3. 3 siung bawang putih\n" +
              "4. 2 butir kemiri\n" +
              "\nBumbu Kacang:\n" +
              "\n1. 50 gram kacang tanah goreng kemudian haluskan\n" +
              "2. 50 gram kecap manis\n" +
              "3. 200 ml air\n" +
              "4. 1 sdm gula merah diiris tipis",
      "1. buah kedondong secukupnya, dipotong-potong memanjang\n" +
              "2. salak, buang bijinya, dipotong-potong\n" +
              "3. 1 buah nanas ukuran kecil, atau ½ buah ukuran sedang, potong-potong\n" +
              "4. 1 buah bengkuang secukupnya , diiris-iris\n" +
              "5. 1 buah mangga mengkal, dipotong-potong, mangga Indramayu lebih cocok.\n" +
              "6. pepaya mengkal secukupnya, dipotong-potong\n" +
              "7. jambu air merah secukupnya, dipotong-potong\n" +
              "8. 1 buah ubi kuning, potong tipis\n" +
              "9. buah lainnya sesuai selera\n" +
              "\nBahan kuah asinan:\n" +
              "\n1. 1 liter air\n" +
              "2. 3 buah cabai merah\n" +
              "3. 5 buah cabai merah besar, dibuang biji\n" +
              "4. 2 buah cabai rawit merah\n" +
              "5. 1 sendok teh ebi\n" +
              "6. 5 sendok makan gula pasir\n" +
              "7. 1 sendok makan garam\n" +
              "8. 1 sendok makan cuka masak",
      "1. 50 gram tauge rebus tanpa akar\n" +
              "2. 150 gram sayur kangkung potong rebus\n" +
              "3. 150 gram daun bayam rebus\n" +
              "4. 200 gram sayur pare rebus tanpa biji\n" +
              "5. 1 buah tahu goreng (8X8 cm)\n" +
              "6. 1 potong tempe goreng (8X8 cm)\n" +
              "7. 1-2 sendok makan bawang goreng\n" +
              "8. 3 butir telur rebus, kupas kulitnya\n" +
              "9. emping dan kerupuk goreng\n" +
              "\nSaus untuk gado-gado:\n" +
              "\n1. 200 cc air matang.\n" +
              "2. 200 gram kacang tanah, yang Anda goreng sebelumnya\n" +
              "3. 2 buah cabai merah\n" +
              "4. 5 buah cabai rawit\n" +
              "5. 1 sendok teh garam\n" +
              "6. ½ sendok teh terasi\n" +
              "7. 1 sendok makan gula merah",
            "1. 1 kg nangka muda namun jangan gunakan yang masih sangat muda, nangka dipotong-potong\n" +
                    "2. 12 butir telur rebus (kupas kulit cangkangnya agar lebih meresap bumbunya)\n" +
                    "3. 1000 ml air kelapa\n" +
                    "4. sdt cuka\n" +
                    "5. 10 lembar daun salam\n" +
                    "6. 8 iris lengkuas dengan ukuran 8cm yang diiris melintang\n" +
                    "7. 200 gram gula merah, iris/sisir halus\n" +
                    "8. 2000 ml santan kelapa, bikin hasil dari parutan 1 butir kelapa\n" +
                    "\nBumbu-bumbu yang dihaluskan :\n" +
                    "\n1. 15 siung bawang merah\n" +
                    "2. 10 siung bawang putih\n" +
                    "3. 4 ½ sendok teh ketumbar\n" +
                    "4. Garam secukupnya",
            "1. Beras ketan putih berkualitas, 100 gram\n" +
                    "2. 250 ml air\n" +
                    "3. 100 gram kelapa parut yang disangrai atau serundeng.\n" +
                    "4. 15 gram ebi atau udang kecil yang direbus, disangrai, kemudian dihaluskan\n" +
                    "5. 5 butir telur bebek atau telur ayam\n" +
                    "6. 30 gram bawang merah goreng kering\n" +
                    "7. 1 sdm minyak goreng\n" +
                    "8. bawang merah goreng kering sebagai taburan\n" +
                    "9. garam secukupnya\n" +
                    "10. gula pasir secukupnya\n" +
                    "\nBumbu yang dihaluskan:\n" +
                    "\n1. 4 buah cabai merah keriting\n" +
                    "2. ½ sdt merica butir\n" +
                    "3. 3 cm kencur\n" +
                    "4. 1 cm jahe",
            "1. 600 gr ikan tenggiri\n" +
                    "2. 300 gr sagu putih\n" +
                    "3. 3/4 gelas air\n" +
                    "4. garam secukupnya",
            "1. 500 gram daging rawon (biasanya daging sapi)\n" +
                    "2. 5 daun bawang, diiris/cincang halus\n" +
                    "3. 6 siung bawang merah, iris halus\n" +
                    "4. 2 liter air\n" +
                    "5. 5 lembar daun jeruk\n" +
                    "6. 2 batang serai\n" +
                    "7. 1 sendok teh garam\n" +
                    "8. ½ sendok teh gula\n" +
                    "9. minyak goreng secukupnya\n" +
                    "\nBahan yang dihaluskan: :\n" +
                    "\n1. 1 ½ sendok teh merica bulat\n" +
                    "2. 2 sendok teh ketumbar\n" +
                    "3. 3 siung bawang putih\n" +
                    "4. 3 cm jahe\n" +
                    "5. 4 cm kunyit\n" +
                    "6. 3 cm lengkuas\n" +
                    "7. 2 mata asam Jawa\n" +
                    "8. 5 buah kluwek hitam yang manis dan gurih\n" +
                    "\nBahan untuk membuat sambal:\n" +
                    "\n1. 3 buah cabe merah\n" +
                    "2. 2 siung bawang merah\n" +
                    "3. 1 sendok terasi goreng\n" +
                    "4. ½ sendok teh garam\n" +
                    "4. 1 sendok teh gula\n" +
                    "6. 100 gram tauge pendek",
            "Bahan utama:\n" +
                    "1. 2 kg daging sapi bersih\n" +
                    "2. 1 liter santan kental\n" +
                    "3. 1 liter santan yang dicampur air\n" +
                    "\nBumbu:\n" +
                    "\n1. 3 helai daun kunyit segar kemudian diikat menjadi satu dalam bentuk simpul\n" +
                    "2. 4 helai daun jeruk purut sebagai sebagai peluntur bau amis daging\n" +
                    "3. 3 batang sereh yang telah dimemarkan\n" +
                    "4. 1 ruas asam asam gelugur atau kandis\n" +
                    "\nBahan-bahan yang dihaluskan:\n" +
                    "\n1. 3 cm laos atau lengkuas\n" +
                    "2. 3 cm kunyit yang dibakar dan dibersihkan kulitnya\n" +
                    "3. 2 cm jahe yang dibakar dan dibersihkan kulitnya\n" +
                    "4. 150 gram cabe merah besar (lombok) atau sesuai selera\n" +
                    "5. 150 gram cabe merah keriting atau sesuai selera\n" +
                    "6. 15 siung bawang merah\n" +
                    "7. 6 siung bawang putih\n" +
                    "8. 5 butir kemiri\n" +
                    "9. 1/2 sendok makan ketumbar\n" +
                    "10. 1 sendok teh jinten yang masak tanpa minyak (sangrai)\n" +
                    "11. 1 sendok teh bubuk pala\n" +
                    "12. 2 sendok teh garam",
            "1. 500 gram daging has dalam utuh\n" +
                    "2. 5 butir bawang merah, iris tipis\n" +
                    "3. 1 buah tomat, potong-potong\n" +
                    "4. 3 sendok makan Kecap Manis Bango\n" +
                    "5. 1 sendok makan kecap inggris\n" +
                    "6. 1 sendok teh pala bubuk\n" +
                    "7. 1/2 sendok teh garam\n" +
                    "8. 1.000 ml air\n" +
                    "9. 3 sendok makan margarin, untuk menumis\n" +
                    "\nBumbu Perendam (aduk Rata):\n" +
                    "\n1. 1/2 sendok teh pala bubuk\n" +
                    "2. 2 sendok makan Kecap Manis Bango\n" +
                    "\nBahan Saus: :\n" +
                    "\n1. 4 butir telur, rebus, ambil bagian kuningnya, haluskan\n" +
                    "2. 1/4 sendok teh garam\n" +
                    "3. 1/4 sendok teh merica bubuk\n" +
                    "4. 1/2 sendok teh gula pasir\n" +
                    "5. 1/2 sendok teh cuka\n" +
                    "6. 1/4 sendok teh mustard\n" +
                    "\nBahan Acar:\n" +
                    "\n1. 1 butir telur, rebus, ambil bagian kuningnya, haluskan\n" +
                    "2. 50 gram ketimun, buang biji, potong kotak 1x1 cm\n" +
                    "3. 50 gram wortel, potong kotak 1x1 cm\n" +
                    "4. 1 sendok teh gula pasir\n" +
                    "5. 1 sendok teh cuka\n" +
                    "\nPelengkap:\n" +
                    "\n1. 50 gram buncis, potong 3 cm, rebus\n" +
                    "2. 75 gram wortel, potong 3 cm, rebus\n" +
                    "3. 200 gram kentang, potong wedges, goreng berkulit\n" +
                    "4. telur, rebus, potong-potong",
            "1. 1 ekor ayam kampung\n" +
                    "2. 4 buah telur rebus (masing-masing potong menjadi 2 bagian)\n" +
                    "3. 150 gram taoge siram dengan air panas, tiriskan\n" +
                    "4. 5 batang seledri potong-potong tipis\n" +
                    "5. 2 batang serai, memarkan\n" +
                    "6. 2 buah jeruk nipis, ambil airnya\n" +
                    "7. 2 sendok makan garam\n" +
                    "8. 1 sendok teh gula pasir\n" +
                    "9. 2 liter air\n" +
                    "10. Kecap manis secukupnya\n" +
                    "\nBumbu yang dihaluskan:\n" +
                    "\n1. 6 siung bawang putih\n" +
                    "2. 5 siung bawang merah\n" +
                    "3. 1 sendok makan merica\n" +
                    "4. ½ sendok teh jinten\n" +
                    "5. 6 butir kemiri\n" +
                    "6. 3 cm jahe"
    };

    String langkah[] = {
      "Proses pembuatan bumbu kacang :\n" +
              "\n1. Panaskan sedikit minyak goreng, masukan bumbu yang telah Anda haluskan lalu tumis hingga harum.\n" +
              "2. Masukkan kacang yang telah dihaluskan, tambahkan air, kecap, gula merah serta garam secukupnya. Masak hingga bumbu kacang matang dan terlihat berminyak.\n" +
              "3. Angkat, lalu tuang ke dalam wadah.\n" +
              "\nCara membuat Sate Ayam:\n" +
              "\n1. Tusuk beberapa potongan ayam pada tusukan sate, sisihkan.\n" +
              "2. Campurkan kecap manis dan margarin pada wadah piring, aduk hingga margarin hancur dan tercampur dengan kecap secara merata.\n" +
              "3. Oleskan ayam dengan campuran kecap dan margarin tadi, baluri hingga ayam terlumuri sempurna.\n" +
              "4. Panggang di atas pemanggang sambil dibalik agar tidak gosong, angkat jika sudah dianggap terpanggang sempurna.\n" +
              "5. Sajikan sate ayam dengan bumbu kacang yang sudah diberi perasan air jeruk limau sesuai selera.\n" +
              "6. Sate ayam tradisional siap untuk dihidangkan",
            "1. Haluskan cabai merah, cabai besar, cabai rawit, garam, gula, ebi. Jangan terlalu halus, karena ulekan yang kasar adalah salah satu ciri khas asinan bogor.\n" +
                    "2. Panaskan air, masukkan bumbu halus tersebut di atas, masak hingga mendidih, tambahkan cuka. Matikan api.\n" +
                    "3. Masukkan buah-buahan ke dalam air bumbu, diamkan sampai uap panas hilang.\n" +
                    "4. Masukkan lemari es kurang lebih 2-3 jam, sampai bumbu meresap ke buah-buahan.\n" +
                    "5. Setelah kira-kira 2-3 jam dan rasa telah meresap maka asinan buah khas Bogor bisa Anda sajikan.",
            "1. Buat saus kacangnya terlebih dahulu dengan mengupas kulit kacang dan sangrai, kemudian haluskan.\n" +
                    "2. Rebus bersama santan, cabai merah dan juga cabai rawit yang telah digoreng bersama dengan terasi, gula merah dan garam.\n" +
                    "3. Campur semua bahan sebagai sambal sausnya dan kemudian masak sampai mendidih, angkat dan sisihkan.\n" +
                    "4. Rebus bahan-bahan sayuran seperti kangkung, pare, bayam dan taogenya kemudian telurnya juga Anda rebus secara terpisah.\n" +
                    "5. Goreng tahu dan juga tempenya.\n" +
                    "6. Hidangkan secara rapi di atas piring, sayur dan tambahkan ke atasnya berupa potongan telur.\n" +
                    "7. Taburi bawang goreng bersama remasan kerupuk dan emping di atasnya kemudian siram dengan sambal saus kacang.\n" +
                    "8. Gado-gado siap dinikmati.",
            "1. Siapkan panci dengan alas yang tebal, letakkan daun salam di dasar panci sebagai alas, lalu di atasnya letakkan irisan lengkuas atau laos.\n" +
                    "2. Masukkanlah kedalam panci dengan urutan potong-potongan nangka muda, telur yang sudah direbus, serta gula merah.\n" +
                    "3. Campurkanlah bumbu-bumbu yang telah dihaluskan sebelumnya dengan 500 ml air kelapa atau cuka, aduk-aduk hingga rata dan larut lalu tuangkan ke dalam panci.\n" +
                    "4. Tambahkan secukupnya air kelapa setinggi permukaan nangka dan telur hingga terendam.\n" +
                    "5. Tutuplah panci dengan rapat, masaklah semua bahan di dalam panci diatas api sedang dan sangat diharapkan jangan sekali-sekali dibuka tutupnya sebelum 2 jam.\n" +
                    "6. Setelah dimasak selama 2 jam, bukalah tutupnya. Jika airnya sudah berkurang sedikit setelah dimasak, angkatlah terlebih dahulu telurnya dan sisihkan di tempat lain sementara agar tidak hancur.\n" +
                    "7. Masukkanlah santan, aduk-aduklah dengan menggunakan sendok kayu sambil ditekan-tekan untuk menghancurkan potongan-potongan nangka.\n" +
                    "8. Masukkan kembali telur yang tadi sudah dipisahkan sampai sedikit agak terkubur ke dalam nangka.\n" +
                    "9. Masaklah lagi dengan menggunakan api kecil sambil diaduk sesekali sampai benar-benar matang, ini membutuhkan waktu selama kira-kira 3 ½ jam atau saat santan habis terserap dan gudeg udah berwana coklat kemerahan.\n" +
                    "10. Sajikan gudeg Jogja dengan tuangan areh atau kuah opor ayam secukupnya kental di atas gudeg nangka.",
            "1. Beras ketan dibersihkan dengan cara merendamnya selama 12 jam atau satu malam. Jangan buang air rendamannya.\n" +
                    "2. Cuci kembali beras ketannya sebelum ditiriskan.\n" +
                    "3. Panaskan penggorengan.\n" +
                    "4. Kemudian tuangkan minyak dan masukan bumbu yang dihaluskan, tumis hingga baunya harum, sisihkan.\n" +
                    "5. Siapkan wajan cekung dan panaskan, ambil satu setengaj sendok makan beras ketan dan bubuhkan pada wajan yang telah panas tersebut.\n" +
                    "6. Siramkan air rendaman beras pada beras tersebut, kurang lebih 3 sendok makan. Biarkan beras hingga setengah kering.\n" +
                    "7. Siapkan wadah. Ambil 1 butir telur, kemudian kocok.\n" +
                    "8. Tambahkan pada telur tersebut bumbu yang telah ditumis tadi, ebi, dan bawang goreng masing-masing ½ sendok teh. Beri juga garam dan gula pasir, masing-\n" +
                    "9. masing 1/8 sendok teh. Anda bisa memperkirakannya sesuai dengan selera.\n" +
                    "10. Setelah tercampur rata adonan telur dan bumbu tersebut, siramkan pada wajan yang digunakan untuk mengeringkan beras ketan tadi. Ratakan adonan jangan sampai terlalu tebal.\n" +
                    "11. Tutup wajan tersebut agar panasnya merata dan kerak telor Anda matang.\n" +
                    "12. Setelah matang, balik wajan hingga kerak telor tersebut menghadap ke bagian bara api. Lakukan hal ini hingga adonan matang sempurna.\n" +
                    "13. Angkat dan gunakan sodet atau spatula untuk mengeluarkan kerak telor yang sudah jadi tersebut dari wajannya.\n" +
                    "14. Taburkan kelapa sangrai dan bawang goreng di atasnya.",
            "1. Bersihkan sisik ikan dan keluarkan isi perutnya.\n" +
                    "2. Belah menjadi 2 bagian dan bersihkan juga tulang tengahnya\n" +
                    "3. Bersihkan juga tulang ikan yang kecil kecil sambil dikikis dengan garpu\n" +
                    "4. Setelah kulit ikan bersih, haluskan daging ikan,\n" +
                    "5. Campurkan air, garam, dan daging halus hingga rata\n" +
                    "6. Masukkan tepung sagu dan campurkan secukupnya. Ketika mengaduk tepung sagu, masukkan sedikit demi sedikit dan secukupnya karena jika kebanyakan pempek yang dihasilkan akan melar dan keras.\n" +
                    "7. Bentuk adonan seperti bola kemudian kukus dalam jumlah air yang banyak\n" +
                    "8. Setelah itu goreng hingga berwarna kecokelatan.\n" +
                    "9. Dalam penyajian dapat Anda tambahkan cuka dan mie soun atau mie kuning",
            "1. Rebus daging hingga empuk, selanjutnya angkat dan potong-potong.\n" +
                    "2. Masukkan kembali daging yang sudah dipotong-potong ke dalam kaldu, masukkan pula serai, daun bawang, daun jeruk, gula serta garam, kecilkan apinya,\n" +
                    "3. Tumislah bawang merah hingga harum, masukkan bumbu yang telah dihaluskan sebelumnya, tumislah hingga harum dan matang, lalu masukkan ke dalam rebusan daging.\n" +
                    "4. Masaklah hingga bumbu meresap dan matang.\n" +
                    "\nMembuat Sambal :\n" +
                    "\n1. Gorenglah cabe dan bawang merah kemudian haluskan dengan garam, gula dan terasi.\n" +
                    "2. Jika sudah cukup halus masukkan tauge pendek mentah, aduk rata.\n" +
                    "4. Hidangkan rawon dan sambal tauge serta empal daging goreng, telur asin dan kerupuk udang.",
            "1. Masukan secara perlahan santan cair ke dalam wajan dan campurkan bersama daun kunyit, asam, serai dan semua bumbu yang telah dihaluskan.\n" +
                    "2. Kemudian ratakan secara perlahan-lahan dengan cara diaduk-aduk.\n" +
                    "3. Masak santan tersebut dengan api sedang sambil terus diaduk agar santan tidak sampai menempel pada bagian pinggir wajan (tidak pecah).\n" +
                    "4. Aduk adonan tersebut hingga merata selama kurang lebih 30 menit kemudian masukkan potongan daging sapi yang telah dibersihkan secara perlahan dan merata.\n" +
                    "5. Terus aduk daging sapi tersebut dengan api sedang hingga santan mengeluarkan minyak dan daging sapinya matang luar dan dalam.\n" +
                    "6. Angkat lalu sajikan dengan menggunakan piring berukuran besar.",
            "1. Lumuri daging dengan bumbu perendam. Diamkan 1 jam dalam lemari es.\n" +
                    "2. Acar: campur rata kuning telur, ketimun, wortel, dan bawang merah. Tambahkan garam, gula pasir, dan cuka. Aduk rata. Diamkan 2 jam dalam lemari es.\n" +
                    "3. Panaskan margarin. Masukkan daging yang sudah direndam. Aduk sampai berubah warna. Angkat lalu potong tebal 1cm. Sisihkan.\n" +
                    "4. Panaskan sisa margarin. Masukkan bawang merah. Tumis sampai harum. Tambahkan tomat. Aduk sampai layu.\n" +
                    "5. Tuang air. Masak sampai mendidih. Masukkan potongan daging, Kecap Manis Bango, kecap inggris, dan pala bubuk. Aduk rata.\n" +
                    "6. Rebus sampai matang dan bumbu meresap.\n" +
                    "7. Saus, aduk rata telur, garam, merica bubuk, gula pasir, cuka, dan mustard.\n" +
                    "8. Sajikan selat solo dengan acar, saus, dan pelengkapnya.",
            "1. Panaskan air, lalu rebus ayam hingga kaldu harum dan ayam empuk.\n" +
                    "2. Siapkan wajan, panaskan minyak dan tumis bumbu-bumbu yang telah dihaluskan hingga tercium aroma harum.Masukan bumbu yang telah ditumis ke dalam air kaldu,tambahkan garam dan gula.\n" +
                    "3. Teruskan memask hingga bumbu meresap ke dalam ayam, kemudian angkat daging ayam, tiriskan dan suir-suir menjadi kecil-kecil.\n" +
                    "4. Siapkan mangkuk masukan taoge, telur, irisan daun seledri, suwiran ayam, sedikit kecap manis kemudian tuang kuah soto ketika masih panas. Soto kudus siap dihidangkan."
    };

    //membuat variabel untuk menampung data
    String nama_makanan;
    String gambar_makanan;
    String id;
    ArrayList<HashMap<String, String>> list;
    HashMap<String, String> map;
    protected ListAdapter adapter;
    SimpleAdapter Adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        //deklarasi setiap komponen
        nama = (TextView) findViewById(R.id.nama);
        gambar = (ImageView) findViewById(R.id.gambar);
        lv_detail = (ListView) findViewById(R.id.lvdetail);
        list = new ArrayList<HashMap<String,String>>();

        //menangkap setiap nilai yang masuk
        nama_makanan = getIntent().getStringExtra("nama");
        gambar_makanan = getIntent().getStringExtra("gambar");
        id = getIntent().getStringExtra("id");

        //memasukkan nama kedalam halaman
        nama.setText(nama_makanan);
        gambar.setImageResource(Integer.parseInt(gambar_makanan));

        //memasukkan info makanan
        map = new HashMap<String, String>();
        map.put("judul",judul[0]);
        map.put("isi",info[Integer.parseInt(id)]);
        list.add(map);

        //memasukkan bahan bahan makanan
        map = new HashMap<String, String>();
        map.put("judul",judul[1]);
        map.put("isi",bahan[Integer.parseInt(id)]);
        list.add(map);

        //masukkan langkah langkah
        map = new HashMap<String, String>();
        map.put("judul",judul[2]);
        map.put("isi",langkah[Integer.parseInt(id)]);
        list.add(map);

        Adapter = new SimpleAdapter(this, list, R.layout.list_detail,
                new String[] {"judul","isi"}, new int[] {R.id.judul,R.id.isi});

        //setting list view
        lv_detail.setAdapter(Adapter);


    }
}
