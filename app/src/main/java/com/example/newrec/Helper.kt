package com.example.newrec

object Helper {

    fun defineDatas(): ArrayList<Persons> {
        val a = ArrayList<Persons>()

        a.add(Persons("burak", R.drawable.a))
        a.add(Persons("selcuk", R.drawable.a5))
        a.add(Persons("baba", R.drawable.a6))
        a.add(Persons("gaga", R.drawable.a1))
        a.add(Persons("tata", R.drawable.a3))
        a.add(Persons("haha", R.drawable.a7))
        a.add(Persons("caca", R.drawable.a4))

        return a
    }
}