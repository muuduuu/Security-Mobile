package com.facebook.soloader;

import android.content.Context;
import android.os.Parcel;
import java.io.Closeable;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;
import java.util.Arrays;

/* loaded from: classes2.dex */
public abstract class G extends C2003f implements InterfaceC1999b {

    /* renamed from: d, reason: collision with root package name */
    protected final Context f23013d;

    /* renamed from: e, reason: collision with root package name */
    private String[] f23014e;

    class a implements FilenameFilter {
        a() {
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return (str.equals("dso_state") || str.equals("dso_lock") || str.equals("dso_deps")) ? false : true;
        }
    }

    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f23016a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ File f23017b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ n f23018c;

        b(boolean z10, File file, n nVar) {
            this.f23016a = z10;
            this.f23017b = file;
            this.f23018c = nVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            p.f("fb-UnpackingSoSource", "starting syncer worker");
            try {
                try {
                    if (this.f23016a) {
                        SysUtil.f(G.this.f23050a);
                    }
                    G.u(this.f23017b, (byte) 1, this.f23016a);
                    p.f("fb-UnpackingSoSource", "releasing dso store lock for " + G.this.f23050a + " (from syncer thread)");
                    this.f23018c.close();
                } catch (Throwable th) {
                    p.f("fb-UnpackingSoSource", "releasing dso store lock for " + G.this.f23050a + " (from syncer thread)");
                    this.f23018c.close();
                    throw th;
                }
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final String f23020a;

        /* renamed from: b, reason: collision with root package name */
        public final String f23021b;

        public c(String str, String str2) {
            this.f23020a = str;
            this.f23021b = str2;
        }
    }

    protected static final class d implements Closeable {

        /* renamed from: a, reason: collision with root package name */
        private final c f23022a;

        /* renamed from: b, reason: collision with root package name */
        private final InputStream f23023b;

        public d(c cVar, InputStream inputStream) {
            this.f23022a = cVar;
            this.f23023b = inputStream;
        }

        public int b() {
            return this.f23023b.available();
        }

        public c c() {
            return this.f23022a;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f23023b.close();
        }
    }

    protected static abstract class e implements Closeable {
        protected e() {
        }

        public void a(d dVar, byte[] bArr, File file) {
            p.d("fb-UnpackingSoSource", "extracting DSO " + dVar.c().f23020a);
            File file2 = new File(file, dVar.c().f23020a);
            try {
                try {
                    RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rw");
                    try {
                        int b10 = dVar.b();
                        if (b10 > 1) {
                            SysUtil.d(randomAccessFile.getFD(), b10);
                        }
                        SysUtil.a(randomAccessFile, dVar.f23023b, Integer.MAX_VALUE, bArr);
                        randomAccessFile.setLength(randomAccessFile.getFilePointer());
                        if (file2.setExecutable(true, false)) {
                            randomAccessFile.close();
                        } else {
                            throw new IOException("cannot make file executable: " + file2);
                        }
                    } finally {
                    }
                } catch (IOException e10) {
                    p.b("fb-UnpackingSoSource", "error extracting dso  " + file2 + " due to: " + e10);
                    SysUtil.c(file2);
                    throw e10;
                }
            } finally {
                if (file2.exists() && !file2.setWritable(false)) {
                    p.b("SoLoader", "Error removing " + file2 + " write permission from directory " + file + " (writable: " + file.canWrite() + ")");
                }
            }
        }

        public abstract c[] b();

        public abstract void c(File file);

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }

    protected G(Context context, String str, boolean z10) {
        super(p(context, str), z10 ? 1 : 0);
        this.f23013d = context;
    }

    private void j() {
        File[] listFiles = this.f23050a.listFiles(new a());
        if (listFiles == null) {
            throw new IOException("unable to list directory " + this.f23050a);
        }
        for (File file : listFiles) {
            p.f("fb-UnpackingSoSource", "Deleting " + file);
            SysUtil.c(file);
        }
    }

    private static boolean m(int i10) {
        return (i10 & 2) != 0;
    }

    public static File p(Context context, String str) {
        return new File(context.getApplicationInfo().dataDir + "/" + str);
    }

    private boolean r(n nVar, int i10) {
        byte b10;
        RandomAccessFile randomAccessFile;
        File file = new File(this.f23050a, "dso_state");
        byte[] n10 = n();
        if (m(i10) || k(n10)) {
            b10 = 0;
        } else {
            randomAccessFile = new RandomAccessFile(file, "rw");
            try {
                if (randomAccessFile.length() == 1) {
                    try {
                        b10 = randomAccessFile.readByte();
                    } catch (IOException e10) {
                        p.f("fb-UnpackingSoSource", "dso store " + this.f23050a + " regeneration interrupted: " + e10.getMessage());
                    }
                    if (b10 == 1) {
                        p.f("fb-UnpackingSoSource", "dso store " + this.f23050a + " regeneration not needed: state file clean");
                        randomAccessFile.close();
                    }
                }
                b10 = 0;
                randomAccessFile.close();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (b10 == 1) {
            return false;
        }
        boolean z10 = (i10 & 4) == 0;
        p.f("fb-UnpackingSoSource", "so store dirty: regenerating");
        u(file, (byte) 0, z10);
        j();
        e q10 = q();
        try {
            q10.c(this.f23050a);
            q10.close();
            randomAccessFile = new RandomAccessFile(new File(this.f23050a, "dso_deps"), "rw");
            try {
                randomAccessFile.write(n10);
                randomAccessFile.setLength(randomAccessFile.getFilePointer());
                randomAccessFile.close();
                b bVar = new b(z10, file, nVar);
                if (s(i10)) {
                    new Thread(bVar, "SoSync:" + this.f23050a.getName()).start();
                } else {
                    bVar.run();
                }
                return true;
            } finally {
                try {
                    randomAccessFile.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
        } catch (Throwable th3) {
            if (q10 != null) {
                try {
                    q10.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
    }

    private static boolean s(int i10) {
        return (i10 & 1) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void u(File file, byte b10, boolean z10) {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            try {
                randomAccessFile.seek(0L);
                randomAccessFile.write(b10);
                randomAccessFile.setLength(randomAccessFile.getFilePointer());
                if (z10) {
                    randomAccessFile.getFD().sync();
                }
                randomAccessFile.close();
            } finally {
            }
        } catch (SyncFailedException e10) {
            p.h("fb-UnpackingSoSource", "state file sync failed", e10);
        }
    }

    @Override // com.facebook.soloader.InterfaceC1999b
    public void a() {
        try {
            n i10 = SysUtil.i(this.f23050a, new File(this.f23050a, "dso_lock"));
            if (i10 != null) {
                i10.close();
            }
        } catch (Exception e10) {
            p.c("fb-UnpackingSoSource", "Encountered exception during wait for unpacking trying to acquire file lock for " + getClass().getName() + " (" + this.f23050a + "): ", e10);
        }
    }

    @Override // com.facebook.soloader.E
    public void e(int i10) {
        SysUtil.m(this.f23050a);
        if (!this.f23050a.canWrite() && !this.f23050a.setWritable(true)) {
            throw new IOException("error adding " + this.f23050a.getCanonicalPath() + " write permission");
        }
        n nVar = null;
        try {
            try {
                n i11 = SysUtil.i(this.f23050a, new File(this.f23050a, "dso_lock"));
                try {
                    p.f("fb-UnpackingSoSource", "locked dso store " + this.f23050a);
                    if (!this.f23050a.canWrite() && !this.f23050a.setWritable(true)) {
                        throw new IOException("error adding " + this.f23050a.getCanonicalPath() + " write permission");
                    }
                    if (!r(i11, i10)) {
                        p.d("fb-UnpackingSoSource", "dso store is up-to-date: " + this.f23050a);
                        nVar = i11;
                    }
                    if (nVar != null) {
                        p.f("fb-UnpackingSoSource", "releasing dso store lock for " + this.f23050a);
                        nVar.close();
                    } else {
                        p.f("fb-UnpackingSoSource", "not releasing dso store lock for " + this.f23050a + " (syncer thread started)");
                    }
                    if (!this.f23050a.canWrite() || this.f23050a.setWritable(false)) {
                        return;
                    }
                    throw new IOException("error removing " + this.f23050a.getCanonicalPath() + " write permission");
                } catch (Throwable th) {
                    th = th;
                    nVar = i11;
                    if (nVar != null) {
                        p.f("fb-UnpackingSoSource", "releasing dso store lock for " + this.f23050a);
                        nVar.close();
                    } else {
                        p.f("fb-UnpackingSoSource", "not releasing dso store lock for " + this.f23050a + " (syncer thread started)");
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                if (!this.f23050a.canWrite() || this.f23050a.setWritable(false)) {
                    throw th2;
                }
                throw new IOException("error removing " + this.f23050a.getCanonicalPath() + " write permission");
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    protected boolean k(byte[] bArr) {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(new File(this.f23050a, "dso_deps"), "rw");
            try {
                if (randomAccessFile.length() == 0) {
                    randomAccessFile.close();
                    return true;
                }
                int length = (int) randomAccessFile.length();
                byte[] bArr2 = new byte[length];
                if (randomAccessFile.read(bArr2) != length) {
                    p.f("fb-UnpackingSoSource", "short read of so store deps file: marking unclean");
                    randomAccessFile.close();
                    return true;
                }
                boolean l10 = l(bArr2, bArr);
                randomAccessFile.close();
                return l10;
            } finally {
            }
        } catch (IOException e10) {
            p.h("fb-UnpackingSoSource", "failed to compare whether deps changed", e10);
            return true;
        }
    }

    protected boolean l(byte[] bArr, byte[] bArr2) {
        return !Arrays.equals(bArr, bArr2);
    }

    protected byte[] n() {
        Parcel obtain = Parcel.obtain();
        e q10 = q();
        try {
            c[] b10 = q10.b();
            obtain.writeInt(b10.length);
            for (c cVar : b10) {
                obtain.writeString(cVar.f23020a);
                obtain.writeString(cVar.f23021b);
            }
            q10.close();
            byte[] marshall = obtain.marshall();
            obtain.recycle();
            return marshall;
        } catch (Throwable th) {
            if (q10 != null) {
                try {
                    q10.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public c[] o() {
        e q10 = q();
        try {
            c[] b10 = q10.b();
            q10.close();
            return b10;
        } catch (Throwable th) {
            if (q10 != null) {
                try {
                    q10.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    protected abstract e q();

    public void t(String[] strArr) {
        this.f23014e = strArr;
    }

    protected G(Context context, String str) {
        this(context, str, true);
    }
}
