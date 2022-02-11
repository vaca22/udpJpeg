package com.example.wifihot.client

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.graphics.BitmapFactory
import android.net.ConnectivityManager
import android.net.NetworkInfo
import android.net.wifi.WifiManager
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.wifihot.ClientHeart
import com.example.wifihot.ClientHeart.mySocket

import com.example.wifihot.MainApplication
import com.example.wifihot.MySocket
import com.example.wifihot.Response
import com.example.wifihot.tcp.TcpCmd
import com.example.wifihot.databinding.FragmentClientBinding
import com.example.wifihot.utiles.CRCUtils
import com.example.wifihot.utiles.add
import com.example.wifihot.utiles.toUInt
import kotlinx.coroutines.*
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock
import java.io.ByteArrayInputStream
import java.io.IOException
import java.net.Socket
import java.net.UnknownHostException
import kotlin.experimental.inv

class ClientFragment:Fragment() {
    lateinit var binding: FragmentClientBinding


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding= FragmentClientBinding.inflate(inflater,container,false)


        return binding.root
    }






}