package com.facebook.soloader;

import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.channels.FileLock;

/* loaded from: classes2.dex */
public final class n implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    private final FileOutputStream f23073a;

    /* renamed from: b, reason: collision with root package name */
    private final FileLock f23074b;

    private n(File file) {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        this.f23073a = fileOutputStream;
        try {
            FileLock lock = fileOutputStream.getChannel().lock();
            if (lock == null) {
                fileOutputStream.close();
            }
            this.f23074b = lock;
        } catch (Throwable th) {
            this.f23073a.close();
            throw th;
        }
    }

    public static n a(File file) {
        return new n(file);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            FileLock fileLock = this.f23074b;
            if (fileLock != null) {
                fileLock.release();
            }
        } finally {
            this.f23073a.close();
        }
    }
}
