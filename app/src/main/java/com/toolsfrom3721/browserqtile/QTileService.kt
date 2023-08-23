package com.toolsfrom3721.browserqtile

import android.app.Service
import android.app.role.RoleManager
import android.content.Context
import android.content.Intent
import android.provider.Settings
import android.service.quicksettings.Tile
import android.service.quicksettings.TileService

class QTileService : TileService() {
    override fun onClick() {
        super.onClick()

        this.startActivityAndCollapse(Intent(Settings.ACTION_MANAGE_DEFAULT_APPS_SETTINGS))
    }

    override fun onStartListening() {
        super.onStartListening()

        this.qsTile.state = Tile.STATE_ACTIVE
    }

    override fun onStopListening() {
        super.onStopListening()
    }
}