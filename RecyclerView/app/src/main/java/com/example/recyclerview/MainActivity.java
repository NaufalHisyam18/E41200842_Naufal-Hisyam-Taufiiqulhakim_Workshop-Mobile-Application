package com.example.recyclerview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> logokampus = new ArrayList<>();
    private ArrayList<String> namakampus = new ArrayList<>();
    private ArrayList<String> tanggalkampus = new ArrayList<>();
    private ArrayList<String> asalkampus = new ArrayList<>();
    private ArrayList<String> deskripsikampus = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getDataFromInternet();
    }

    protected  void prosesRecyclerViewAdapter(){

        RecyclerView recyclerView = findViewById(R.id.rcvKampus); //Deklarasi object yang akan digunakan
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(logokampus, namakampus, tanggalkampus, asalkampus, deskripsikampus, this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void getDataFromInternet(){

        //Kampus ITB
        namakampus.add("Institut Teknologi Bandung");
        tanggalkampus.add("2 Maret 1959");
        logokampus.add("http://3.bp.blogspot.com/-HVz_jh5ltxw/UtViiCj1BQI/AAAAAAAARKI/sCIxx2vgGGc/s1600/Logo-Institut-Teknologi-Bandung-ITB.png");
        asalkampus.add("Bandung");
        deskripsikampus.add("Institut Teknologi Bandung (ITB) merupakan sekolah tinggi teknik pertama di Indonesia " +
                "yang didirikan pada tanggal 2 Maret 1959 di Jawa Barat yang mengemban misi pengabdian ilmu pengetahuan " +
                "dan teknologi untuk memajukan Indonesia. Lahir dalam suasana penuh dinamika yang dilandasi dengan semangat " +
                "perjuangan Proklamasi Kemerdekaan, ITB hadir untuk mengoptimalkan pembangunan bangsa yang maju dan bermartabat.");

        //Kampus IPB
        namakampus.add("Institut Pertanian Bogor");
        tanggalkampus.add("1 September 1963");
        logokampus.add("http://4.bp.blogspot.com/-f_OsMm_Fwe0/UtVhVTakK8I/AAAAAAAARKA/U4XwAIgIK1w/s1600/Logo_IPB.png");
        asalkampus.add("Bogor");
        deskripsikampus.add("Institut Pertanian Bogor adalah sebuah perguruan tinggi pertanian negeri yang berkedudukan " +
                "di Bogor. Sebelum diresmikan pada tahun 1963, IPB adalah sebuah fakultas pertanian pada Universitas Indonesia. Pada tanggal 1 September 1963 " +
                "Presiden Pertama Indonesia, Ir. Soekarno, melakukan peletakkan batu pertama pembangunan kampus sekaligus menandai peresmian Institut Pertanian Bogor " +
                "sebagai sebuah perguruan tinggi mandiri.");

        //Kampus UB
        namakampus.add("Universitas Brawijaya");
        tanggalkampus.add("5 Januari 1963");
        logokampus.add("https://2.bp.blogspot.com/-49lm18D0xRo/WoN81mJwL2I/AAAAAAAAqi8/aPW1wlJrw2MnKZgcWId-6U2L1vTapr71ACLcBGAs/s1600/Rute%2BBandara%2BJuanda%2Bke%2BUniversitas%2BBrawijaya.jpg");
        asalkampus.add("Malang");
        deskripsikampus.add("Universitas Brawijaya adalah perguruan tinggi di Indonesia yang berdiri pada tahun 1963 di Kota Malang, Jawa Timur melalui Ketetapan Menteri Pendidikan dan " +
                "Ilmu Pengetahuan no.1 tanggal 5 Januari 1963. Tanggal tersebut kemudian ditetapkan sebagai Dies Natalis UB. Nama Brawijaya diberikan khusus oleh Presiden Soekarno dengan " +
                "harapan mampu gemilang sepert Raden Wijaya (Brawijaya I) selaku pendiri Kerajaan Majapahit sekaligus menjadi kampus kebanggan bangsa Indonesia");

        //Kampus ITS
        namakampus.add("Institut Teknologi Sepuluh Nopember");
        tanggalkampus.add("10 November 1957");
        logokampus.add("http://1.bp.blogspot.com/-LuzYAGTlxug/UtVfS-txIrI/AAAAAAAARJ4/OQHh_qwnRX4/s1600/Logo+INSTITUTE+TEKNOLOGI+SEPULUH+NOPEMBER+ITS.png");
        asalkampus.add("Surabaya");
        deskripsikampus.add("Institut Teknologi Sepuluh Nopember adalah perguruan tinggi negeri yang terletak di Surabaya. Pada awalnya, ITS didirikan oleh Yayasan Perguruan Tinggi Teknik yang " +
                "diketuai oleh dr. Angka Nitisastro pada 10 November 1957. Dies Natalis ITS pertama dilaksanakan pada 10 November 1960, sementara nama ITS mulai digunakan dalam Peraturan " +
                "Pemerintah No. 9 tahun 1961 (ditetapkan tanggal 23 Maret 1961). Dalam visi awal, ITS ditujukan untuk mendidik para pemimpin yang unggul di bidang sains dan teknologi, untuk mengangkat " +
                "Republik Indonesia menjadi negara berperadaban maju dan tinggi.");

        //Kampus UNEJ
        namakampus.add("Universitas Jember");
        tanggalkampus.add("10 November 1964");
        logokampus.add("http://3.bp.blogspot.com/-3xlqATSwVBY/UtUHNcJQhdI/AAAAAAAAQ9Y/RwVGnvPKyvU/s1600/LOGO+UNIVERSITAS+JEMBER.png");
        asalkampus.add("Jember");
        deskripsikampus.add("Universitas Jember (disingkat sebagai Unej) adalah perguruan tinggi negeri yang terletak di Kabupaten Jember, Provinsi Jawa Timur. " +
                "Pada awal berdiri tahun 1964, Universitas Negeri Djember yang disingkat Uned, memiliki lima fakultas, terdiri dari Fakultas Hukum di Jember, dengan " +
                "cabangnya di Banyuwangi, Fakultas Sosial dan Politik dan Fakultas Pertanian di Jember, Fakultas Ekonomi dan Fakultas Sastra di Banyuwangi. Dengan rektor " +
                "pertama dijabat oleh dr. R. Achmad kemudian dengan perbaikan susunan kata dari ejaan lama ke ejaan yang disempurnakan (EYD) Universitas Negeri Djember berubah " +
                "nama menjadi Universitas Negeri Jember dengan singkatan Unej, dari situlah nama Unej berasal. Walaupun saat ini kata \"Negeri\" dihilangkan sehingga menjadi " +
                "Universitas Jember, nama Unej sudah telanjur melekat di kalangan masyarakat sekitar dan dipertahankan hingga sekarang.");

        prosesRecyclerViewAdapter();
    }
}