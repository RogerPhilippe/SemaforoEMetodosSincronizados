package br.com.philippesis.semaforoemetodossincronizados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnStart.setOnClickListener { start() }
    }

    private fun start() {

        val semBA = SemaphoreImplementationB("A")

        println("Implementando semaforo A...")

        Thread(Runnable { semBA.run() }).start()

        val semBB = SemaphoreImplementationB("B")

        Thread(Runnable { semBB.run() }).start()

        println("Implementando semaforo B...")

    }
}
