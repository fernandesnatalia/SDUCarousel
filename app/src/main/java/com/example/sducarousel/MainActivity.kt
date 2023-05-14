package com.example.sducarousel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.zup.beagle.android.networking.RequestData
import br.com.zup.beagle.android.utils.newServerDrivenIntent
import br.com.zup.beagle.android.view.ServerDrivenActivity

private const val PAGEVIEWSDU = "/b5888277-8dd4-42f0-ba30-e136a582751c"
private const val PAGEVIEWSDU2 = "/9f5c7dfa-f195-43c5-a6b6-b2b8e25c2f32"
private const val BFF = "/dea368cf-0bc3-449e-9036-9767a9631ca5"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        startActivity(newServerDrivenIntent<ServerDrivenActivity>(RequestData(PAGEVIEWSDU)))
    }
}