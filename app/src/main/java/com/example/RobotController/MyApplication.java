package com.example.RobotController;

import android.app.Application;
import android.bluetooth.BluetoothDevice;

public class MyApplication extends Application
{
    BluetoothDevice device;
    private BluetoothDevice btDevice;

    public synchronized BluetoothDevice getBtConnection(BluetoothDevice device)
    {
        if(device==null){
            this.device=device;
        }
        return device;
    }

    public BluetoothDevice getBtDevice() {
        return btDevice;
    }

    public void setBtDevice(BluetoothDevice btDevice) {
        this.btDevice = btDevice;
    }
}

