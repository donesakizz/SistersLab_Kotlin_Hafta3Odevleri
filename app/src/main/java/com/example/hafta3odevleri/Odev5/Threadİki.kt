package com.example.hafta3odevleri.Odev5

class Threadİki  : Runnable {

    override fun run() {
        for (i in 41..60) {
            println("Threadİki  i değeri: $i")
            Thread.sleep(3000)
        }
    }
}