package io.github.hexiangyuan.lolgame

import android.app.Application

/**
 * Creator:HeXiangYuan
 * Date  : 16-12-8
 */
class App : Application() {
    companion object {
        var instance: Application? = null
        fun instance() = instance
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
    }
}
