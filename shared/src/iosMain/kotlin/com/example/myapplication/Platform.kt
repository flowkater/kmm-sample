package com.example.myapplication

import platform.UIKit.UIDevice

class IOSPlatform: Platform {
    override val name: String = UIDevice.currentDevice.systemName() + " This is iOS wtf" + UIDevice.currentDevice.systemVersion
}

actual fun getPlatform(): Platform = IOSPlatform()