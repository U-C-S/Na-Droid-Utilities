package com.toolsfrom3721.browserqtile

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.service.quicksettings.TileService

class QTileService : TileService() {

    override fun onBind(intent: Intent): IBinder {
        TODO("Return the communication channel to the service.")
    }


}