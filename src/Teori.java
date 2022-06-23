// Nama : Nurul Febi Anisa
// NIM  : 21090032
// Kelas: 2 C
// MK   : Algoritma dan Struktur data 2

// Jawaban no 1
// 1.Binary Seacrh Tree (BST) yang maksimal node disstiap root adalah 2, Node can be modified as not as long
// as node has a value. root is considering as node. node mempunyai key, node left, node right.

// Langkah-langkah untuk menemukan data dengan nama SIGRA yaitu :
// 1. Untuk mencari nilai atau data jika terdapat array maka bisa melakukan pencarian biner.
// 2. Mendefinisikan daftar nilai atau data untuk mencari data yang kitakiri inginkan yaitu SIGRA
// 3. Bandingkan angka atau data yang akan dicari dengan data tengah dan dicari yang lebih kecil dari data tengah atau
// mencari dibagian kiri atau kanan
// 4. Pada pencarian data dimulai dengan pencarian data, dari tengah jika di tengah tidak ada maka dicari dikiri ataupun
// di kanan sampai kiyta menemukan data yang kita cari.
// 5. Yang utama dalam pencarian data BST yaitu kita mencari ke subtree kiri karena di pohon pencarian biner semua data
// di subtree kiri lebih kecil dan semua elemen di subtree kanan lebih besar dan langkah tersebut diulang-ulang sampai menemukan
// SIGRA
/// Kemungkinan pada level 4 karena dapat terdapat pada urutan ke 4 , pada level 4 atau level lebih dari 4 data
// SIGRA akan ditemukan

// Jawaban no 2
//  p = 5
// if (a [p] <76)
// a (5) < 76
   //  76 < 76
// int t = a [i+1] -> t = a [3+1];
//                    t = a [4];
//                    t = 0;
// a [i+1] = a [end]  -> a [4] = a [5];
//                       a [4] = 76;
// a [end] = t -> a (5) = 0;
// return [i+i] -> return 4;
// a = 2,18,1,0,76,56,98,34,12