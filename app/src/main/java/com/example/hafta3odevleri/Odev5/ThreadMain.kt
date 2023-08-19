package com.example.hafta3odevleri.Odev5

/*
    * Asenkron olarak uzun süren bir işlemi gerçekleştiren thread oluşturuyoruz.
    * Bu kodda, iki farklı thread oluşturacağız ve her biri uzun süreli bir işlemi temsil edecek.
    * İlk thread 5 saniye uyuyacak, ikinci thread ise 3 saniye uyuyacak.
    * Ana thread, diğer threadler çalışırken devam edecek ve tüm threadlerin bitmesini beklemek için 6 saniye uyuyacak.
    * Bu şekilde, asenkron olarak uzun süren işlemler gerçekleştirsin
    * */

fun main() {


    val threadBir = ThreadBir()
    threadBir.start()

    val threadİki = Thread(Threadİki())
    threadİki.start()

    for (i in 61..80) {
        println("Main thread i değeri: $i")
        Thread.sleep(6000)
    }


}