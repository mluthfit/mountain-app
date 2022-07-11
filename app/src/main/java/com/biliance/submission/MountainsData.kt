package com.biliance.submission

object MountainsData {
    private val mountNames = arrayOf(
        "Geureudong",
        "Sibayak",
        "Sinabung",
        "Sorik Marapi",
        "Marapi",
        "Masurai",
        "Menoreh",
        "Bromo Tengger Semeru",
        "Meratus",
        "Lokon",
        "Karangetang",
        "Gunung Api",
        "Tamata",
        "Puncak Mandala",
        "Rinjani",
    )

    private val mountLocations = arrayOf(
        "Aceh, Indonesia",
        "Sumatra, Indonesia",
        "Sumatra, Indonesia",
        "Sumatra, Indonesia",
        "Sumatra Barat, Indonesia",
        "Merangin, Jambi, Indonesia",
        "Jawa, Indonesia",
        "Jawa Timur, Indonesia",
        "Kalimantan, Indonesia",
        "Sulawesi Utara, Indonesia",
        "Siau, Indonesia",
        "Sarawak, Malaysia",
        "Sulawesi Utara, Indonesia",
        "Papua, Indonesia",
        "Nusa Tenggara Barat, Indonesia",
    )

    private val mountHeights = arrayOf(
        "2,885 m (9,465 ft)",
        "2,212 m (7,257 ft)",
        "2,460 m (8,070 ft)",
        "2,145 m (7,04 ft)",
        "2,891 m (9,485 ft)",
        "2,980 m (9,777 ft)",
        "1,021 m (3,349 ft)",
        "3,676 m (12,060 ft)",
        "1,901 m (6,236 ft)",
        "1,580 m (5,184 ft)",
        "1,827 m (5,994 ft)",
        "1,750 m (5,740 ft)",
        "1,110 m (3,645 ft)",
        "4,760 m (15,620 ft)",
        "3.726 m (12.224 ft)",
    )

    private val mountTypes = arrayOf(
        "Stratovolcano",
        "Stratovolcano",
        "Stratovolcano",
        "Stratovolcano",
        "Gunung berapi gabungan",
        "Not found",
        "Not found",
        "Taman nasional",
        "Not found",
        "Stratovolcano",
        "Stratovolcano",
        "Not found",
        "Not found",
        "Not found",
        "Gunung berapi kerucut",
    )

    private val mountDescriptions = arrayOf(
        "Gunung Geureudong atau Bur ni Geureudong atau Bur ni Telong adalah gunung stratovolcano di Provinsi Aceh, Indonesia. Nama resmi untuk kompleks gunung berapi ini masih menjadi perdebatan, karena posisi Bur ni Geureudong dan Bur ni Telong yang berdekatan. Dua Kerucut vulkanik bernama Salah Nama dan Pepanji yang merupakan bukit sedimen. Bur ni Geureudong telah mengalami longsor sejak masa Pleistosen, tetapi memiliki fumarol dan mata air panas di bagian lereng. Bur ni Telong terletak di selatan dari Bur ni Geureundong. Bur ni Telong memiliki kawah aktif yang masih terdapat lava di bagian selatan lereng gunung.",
        "Gunung Sibayak adalah sebuah gunung di Kabupaten Karo, Sumatra Utara. Masyarakat Karo menyebut gunung Sibayak dengan sebutuan 'gunung raja'. Gunung Sibayak merupakan gunung berapi dan meletus terakhir tahun 1881. Gunung ini berada di sekitar 50 kilometer barat daya Kota Medan. Sekarang Gunung Sibayak banyak dikunjungi karena akses menuju gunung sibayak banyak mulai Sibayak 1 dan Sibayak 2. Setiap 17 Agustus di Gunung Sibayak diadakan upacara rutin serta lomba panjat pinang seluruh pencinta alam dari berbagai macam dan berbagai penjuru.",
        "Gunung Sinabung (bahasa Karo: Deleng Sinabung) adalah gunung api di Dataran Tinggi Karo, Kabupaten Karo, Sumatra Utara, Indonesia. Sinabung bersama Gunung Sibayak di dekatnya adalah dua gunung berapi aktif di Sumatra Utara dan menjadi puncak tertinggi ke 2 di provinsi itu. Ketinggian gunung ini adalah 2.460 meter.",
        "Sorik Marapi adalah sebuah gunung yang masuk dalam kawasan Taman Nasional Batang Gadis, secara administratif berada di Desa Sibanggor Julu, Kecamatan Puncak Sorik Marapi, Kabupaten Mandailing Natal, Sumatra Utara. Sorik Marapi merupakan gunung berapi aktif yang berketinggian 2.145 meter. Koordinat puncak gunung adalah 0°41' 11\" LS and 99° 32' 13\" BT.",
        "Gunung Marapi (juga dikenal sebagai Merapi atau Berapi) adalah gunung berapi yang terletak di Sumatra Barat, Indonesia. Gunung ini tergolong gunung yang paling aktif di Sumatra. Terletak dalam kawasan administrasi Kabupaten Agam. Gunung ini dapat juga dilihat dari kota Bukittinggi, kota Padangpanjang dan kabupaten Tanah Datar dan memiliki ketinggian 2.891 m. Gunung Marapi sudah meletus lebih dari 50 kali sejak akhir abad 18.[1]",
        "Gunung Masurai adalah gunung di pulau Sumatra, Indonesia. Gunung tak aktif ini secara administatif terletak dalam tiga wilayah kecamatan di kabupaten Merangin, Jambi, yakni kecamatan Lembah Masurai, Jangkat dan Sungai Tenang. Gunung Masurai diperuntukan sebagai kawasan Hutan Konservasi, yakni kawasan Taman Nasional Kerinci Seblat. Gunung Masurai merupakan sisa gunung api kompleks yang sangat luas dan besar dengan setengah kaldera tersisa dibagian timur. Sedangkan di sebelah barat muncul dua kerucut. Satu diantaranya memiliki dua buah danau vulkanik, yaitu Danau Kumbang dan Danau Mabuk.",
        "Pegunungan Menoreh adalah kawasan pegunungan yang membentang di wilayah barat Kabupaten Kulon Progo di Provinsi Daerah Istimewa Yogyakarta, sebelah timur Kabupaten Purworejo, dan sebagian Kabupaten Magelang di Provinsi Jawa Tengah; sekaligus menjadi batas alamiah bagi ketiga kabupaten tersebut. Puncak tertinggi di Pegunungan Menoreh berada di Gunung Ayamayam yang memiliki ketinggian lebih dari 1.021 meter di atas permukaan air laut. Pegunungan Menoreh juga sebagai sumber inspirasi dari nama kereta api Menoreh, KA ekonomi AC yang melayani Pasar Senen-Semarang Tawang.",
        "Taman Nasional Bromo Tengger Semeru adalah kawasan pegunungan di Jawa Timur, Indonesia, yang terletak di wilayah administratif Kabupaten Pasuruan, Kabupaten Malang, Kabupaten Lumajang dan Kabupaten Probolinggo. Taman yang bentangan barat-timurnya sekitar 20-30 kilometer dan utara-selatannya sekitar 40 km ini ditetapkan sejak tahun 1982 dengan luas wilayahnya sekitar 50.276,3 ha. Di kawasan ini terdapat kaldera lautan pasir yang luasnya ±6290 ha. Batas kaldera lautan pasir itu berupa dinding terjal, yang ketinggiannya antara 200-700 meter.",
        "Meratus merupakan kawasan pegunungan yang berada di tenggara Pulau Kalimantan serta membelah Provinsi Kalimantan Selatan menjadi dua. Pegunungan ini membentang sepanjang ± 600 km² dari arah baratdaya-timulaut dan membelok ke arah utara hingga perbatasan provinsi Kalimantan Tengah dan Kalimantan Timur. Titik tertinggi di rangkaian Pegunungan Meratus adalah Gunung Halau-halau yang memiliki ketinggian 1.901 Mdpl.",
        "Gunung Lokon adalah sebuah gunung di dekat Kota Tomohon, Provinsi Sulawesi Utara. Gunung ini memiliki ketinggian 1.580 m dari permukaan laut. Sesuai namanya, Gunung Lokon berarti yang tertua dan terbesar. Pengertian lain ialah orang yang sudah tua, atau tertua berbadan besar. Dalam bahasa daerah juga disebut Tua Lokon atau Tou Tua Lokon, artinya orang yang sudah tua. Gunung Lokon adalah Gunung yang masih aktiv, Gunung Lokon memiliki lubang kawah di sisi nya dan bukan di puncak gunung,Gunung ini menyimpan misteri dengan ditemukannya jejak kaki raksasa di sekitar gunung ini",
        "Gunung Karangetang (dikenal juga dengan nama Api Siau) adalah gunung berapi yang terletak di bagian utara Sulawesi Utara, Indonesia tepatnya di Kabupaten Kepulauan Siau Tagulandang Biaro. Gunung Karangetang adalah salah satu gunung berapi teraktif di Indonesia dengan letusan sebanyak lebih dari 40 kali sejak 1675 serta banyak letusan kecil yang tidak terdokumentasi pada catatan sejarah. Gunung ini merupakan salah satu gunung berapi aktif di Indonesia. Pada letusan gunung Karangetang tahun 1997 menewaskan 3 orang.",
        "Gunung Api adalah sebuah gunung kapur yang terletak di Taman Nasional Gunung Mulu, Sarawak, Malaysia. Gunung ini terletat dekat Gunung Benarat dan Gunung Buda yang ketiganya memiliki ciri geografi yang sama. Gunung Api dikenal karena formasi karst batu kapurnya yang menonjol ke atas.",
        "Gunung Tamata adalah gunung yang terletak di Pulau Siau, Kabupaten Kepulauan Siau Tagulandang Biaro, Provinsi Sulawesi Utara, Indonesia. Gunung setinggia 1.134 Mdpl ini merupakan gunung berapi yang sudah tidak aktif lagi. Gunung Tamata berada di bagian tengah Pulau Siau atau tepat disebelah selatan Gunung Karangetang.",
        "Puncak Mandala (pada masa penjajahan Belanda dikenal sebagai Julianatop atau Puncak Juliana) adalah salah satu gunung di Papua, Indonesia. Dengan ketinggian 4.760 m, Puncak Mandala adalah gunung tertinggi ke-2 di Indonesia setelah Puncak Jaya. Puncak Mandala membentuk bagian Pegunungan Bintang bagian timur dan berada dekat perbatasan Papua Nugini.",
        "Gunung Rinjani adalah gunung yang berlokasi di Pulau Lombok, Nusa Tenggara Barat. Gunung yang merupakan gunung berapi kedua tertinggi di Indonesia dengan ketinggian 3.726 mdpl serta terletak pada lintang 8º25' LS dan 116º28' BT ini merupakan gunung favorit bagi pendaki Indonesia karena keindahan pemandangannya. Gunung ini merupakan bagian dari Taman Nasional Gunung Rinjani yang memiliki luas sekitar 41.330 ha dan ini akan diusulkan penambahannya sehingga menjadi 76.000 ha ke arah barat dan timur.",
    )

    private val mountImages = intArrayOf(
        R.drawable.geureudong,
        R.drawable.sibayak,
        R.drawable.sinabung,
        R.drawable.sorik_marapi,
        R.drawable.marapi,
        R.drawable.masurai,
        R.drawable.menoreh,
        R.drawable.bromo_tengger_semeru,
        R.drawable.meratus,
        R.drawable.lokon,
        R.drawable.karangetang,
        R.drawable.api,
        R.drawable.tamata,
        R.drawable.mandala,
        R.drawable.rinjani,
    )

    val listData: ArrayList<Mountain>
        get() {
            val list = ArrayList<Mountain>()
            for (index in mountNames.indices) {
                val mount = Mountain(
                    mountNames[index],
                    mountLocations[index],
                    mountHeights[index],
                    mountTypes[index],
                    mountDescriptions[index],
                    mountImages[index],
                )

                list.add(mount)
            }

            return list
        }
}