package com.springcore.AutoWire.ViaAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class BluetoothSpeaker {
    private String DevceName;
    private int RmsValue;

    @Autowired
    @Qualifier("bluetooth2")
    private Bluetooth bluetooth;

    public String getDevceName() {
        return DevceName;
    }

    public void setDevceName(String devceName) {
        DevceName = devceName;
    }

    public int getRmsValue() {
        return RmsValue;
    }

    public void setRmsValue(int rmsValue) {
        RmsValue = rmsValue;
    }

    public Bluetooth getBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(Bluetooth bluetooth) {
        this.bluetooth = bluetooth;
    }

    public BluetoothSpeaker() {
    }

    @Override
    public String toString() {
        return "BluetoothSpeaker{" +
                "DevceName='" + DevceName + '\'' +
                ", RmsValue=" + RmsValue +
                ", bluetooth=" + bluetooth +
                '}';
    }
}
