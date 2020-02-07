package br.com.philippesis.semaforoemetodossincronizados

import org.junit.Before
import org.junit.Test

class PoolTest {

    private lateinit var pool: Pool

    @Before
    fun setup() {
        pool = Pool()
    }

    @Test
    @Throws(Exception::class)
    fun testSemaphore() {

        // T1
        Thread(Runnable {
            println("T1: ${pool.item}")
            pool.terminate()
        }).start()

        // T2
        Thread(Runnable {
            println("T2: ${pool.item}")
            pool.terminate()
        }).start()

        // T3
        Thread(Runnable {
            println("T3: ${pool.item}")
            pool.terminate()
        }).start()

        // T4
        Thread(Runnable {
            println("T4: ${pool.item}")
            pool.terminate()
        }).start()

    }

    @Test
    @Throws(java.lang.Exception::class)
    fun semaphoreImplementationTest() {

        SemaphoreImplementation("A").run()

        SemaphoreImplementation("B").run()

    }

    @Test
    @Throws(java.lang.Exception::class)
    fun semaphoreImplementationBTest() {

        val semaphoreImplementationBA = SemaphoreImplementationB("A")
        val semaphoreImplementationBB = SemaphoreImplementationB("B")

        Thread(Runnable {

            semaphoreImplementationBA.run()
        })

        Thread(Runnable {
            semaphoreImplementationBB.run()
        })

    }

}