package com.ironz.binaryprefs.file.transaction;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class FileTransactionService extends Service {

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}