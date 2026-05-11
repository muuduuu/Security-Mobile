package h1;

import android.content.Context;
import android.util.Log;
import j1.AbstractC3479b;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;
import n1.C3703a;

/* loaded from: classes.dex */
public final class y implements l1.h, i {

    /* renamed from: a, reason: collision with root package name */
    private final Context f33944a;

    /* renamed from: b, reason: collision with root package name */
    private final String f33945b;

    /* renamed from: c, reason: collision with root package name */
    private final File f33946c;

    /* renamed from: d, reason: collision with root package name */
    private final Callable f33947d;

    /* renamed from: e, reason: collision with root package name */
    private final int f33948e;

    /* renamed from: f, reason: collision with root package name */
    private final l1.h f33949f;

    /* renamed from: g, reason: collision with root package name */
    private h f33950g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f33951h;

    public y(Context context, String str, File file, Callable callable, int i10, l1.h delegate) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f33944a = context;
        this.f33945b = str;
        this.f33946c = file;
        this.f33947d = callable;
        this.f33948e = i10;
        this.f33949f = delegate;
    }

    private final void b(File file, boolean z10) {
        ReadableByteChannel newChannel;
        if (this.f33945b != null) {
            newChannel = Channels.newChannel(this.f33944a.getAssets().open(this.f33945b));
            Intrinsics.checkNotNullExpressionValue(newChannel, "newChannel(context.assets.open(copyFromAssetPath))");
        } else if (this.f33946c != null) {
            newChannel = new FileInputStream(this.f33946c).getChannel();
            Intrinsics.checkNotNullExpressionValue(newChannel, "FileInputStream(copyFromFile).channel");
        } else {
            Callable callable = this.f33947d;
            if (callable == null) {
                throw new IllegalStateException("copyFromAssetPath, copyFromFile and copyFromInputStream are all null!");
            }
            try {
                newChannel = Channels.newChannel((InputStream) callable.call());
                Intrinsics.checkNotNullExpressionValue(newChannel, "newChannel(inputStream)");
            } catch (Exception e10) {
                throw new IOException("inputStreamCallable exception on call", e10);
            }
        }
        File intermediateFile = File.createTempFile("room-copy-helper", ".tmp", this.f33944a.getCacheDir());
        intermediateFile.deleteOnExit();
        FileChannel output = new FileOutputStream(intermediateFile).getChannel();
        Intrinsics.checkNotNullExpressionValue(output, "output");
        j1.c.a(newChannel, output);
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
            throw new IOException("Failed to create directories for " + file.getAbsolutePath());
        }
        Intrinsics.checkNotNullExpressionValue(intermediateFile, "intermediateFile");
        c(intermediateFile, z10);
        if (intermediateFile.renameTo(file)) {
            return;
        }
        throw new IOException("Failed to move intermediate file (" + intermediateFile.getAbsolutePath() + ") to destination (" + file.getAbsolutePath() + ").");
    }

    private final void c(File file, boolean z10) {
        h hVar = this.f33950g;
        if (hVar == null) {
            Intrinsics.v("databaseConfiguration");
            hVar = null;
        }
        hVar.getClass();
    }

    private final void e(boolean z10) {
        String databaseName = getDatabaseName();
        if (databaseName == null) {
            throw new IllegalStateException("Required value was null.");
        }
        File databaseFile = this.f33944a.getDatabasePath(databaseName);
        h hVar = this.f33950g;
        h hVar2 = null;
        if (hVar == null) {
            Intrinsics.v("databaseConfiguration");
            hVar = null;
        }
        C3703a c3703a = new C3703a(databaseName, this.f33944a.getFilesDir(), hVar.f33874s);
        try {
            C3703a.c(c3703a, false, 1, null);
            if (!databaseFile.exists()) {
                try {
                    Intrinsics.checkNotNullExpressionValue(databaseFile, "databaseFile");
                    b(databaseFile, z10);
                    c3703a.d();
                    return;
                } catch (IOException e10) {
                    throw new RuntimeException("Unable to copy database file.", e10);
                }
            }
            try {
                Intrinsics.checkNotNullExpressionValue(databaseFile, "databaseFile");
                int d10 = AbstractC3479b.d(databaseFile);
                if (d10 == this.f33948e) {
                    c3703a.d();
                    return;
                }
                h hVar3 = this.f33950g;
                if (hVar3 == null) {
                    Intrinsics.v("databaseConfiguration");
                } else {
                    hVar2 = hVar3;
                }
                if (hVar2.a(d10, this.f33948e)) {
                    c3703a.d();
                    return;
                }
                if (this.f33944a.deleteDatabase(databaseName)) {
                    try {
                        b(databaseFile, z10);
                    } catch (IOException e11) {
                        Log.w("ROOM", "Unable to copy database file.", e11);
                    }
                } else {
                    Log.w("ROOM", "Failed to delete database file (" + databaseName + ") for a copy destructive migration.");
                }
                c3703a.d();
                return;
            } catch (IOException e12) {
                Log.w("ROOM", "Unable to read database version.", e12);
                c3703a.d();
                return;
            }
        } catch (Throwable th) {
            c3703a.d();
            throw th;
        }
        c3703a.d();
        throw th;
    }

    @Override // l1.h
    public l1.g U0() {
        if (!this.f33951h) {
            e(true);
            this.f33951h = true;
        }
        return a().U0();
    }

    @Override // h1.i
    public l1.h a() {
        return this.f33949f;
    }

    @Override // l1.h, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        a().close();
        this.f33951h = false;
    }

    public final void d(h databaseConfiguration) {
        Intrinsics.checkNotNullParameter(databaseConfiguration, "databaseConfiguration");
        this.f33950g = databaseConfiguration;
    }

    @Override // l1.h
    public String getDatabaseName() {
        return a().getDatabaseName();
    }

    @Override // l1.h
    public void setWriteAheadLoggingEnabled(boolean z10) {
        a().setWriteAheadLoggingEnabled(z10);
    }
}
