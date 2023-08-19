package com.example.hafta3odevleri.Odev5

class ThreadBir : Thread() {

    private val arrayList: ArrayList<Int> = arrayListOf()

    override fun run() {

        for (i in 1..40) {
            arrayList.add(i)
            println("Thread Bir : $i")
            sleep(5000)
        }
    }
}