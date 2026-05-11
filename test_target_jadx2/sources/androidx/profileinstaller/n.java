package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    private static final androidx.concurrent.futures.d f17244a = androidx.concurrent.futures.d.B();

    /* renamed from: b, reason: collision with root package name */
    private static final Object f17245b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static c f17246c = null;

    private static class a {
        static PackageInfo a(PackageManager packageManager, Context context) {
            return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
        }
    }

    static class b {

        /* renamed from: a, reason: collision with root package name */
        final int f17247a;

        /* renamed from: b, reason: collision with root package name */
        final int f17248b;

        /* renamed from: c, reason: collision with root package name */
        final long f17249c;

        /* renamed from: d, reason: collision with root package name */
        final long f17250d;

        b(int i10, int i11, long j10, long j11) {
            this.f17247a = i10;
            this.f17248b = i11;
            this.f17249c = j10;
            this.f17250d = j11;
        }

        static b a(File file) {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
            try {
                b bVar = new b(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
                dataInputStream.close();
                return bVar;
            } catch (Throwable th) {
                try {
                    dataInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }

        void b(File file) {
            file.delete();
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
            try {
                dataOutputStream.writeInt(this.f17247a);
                dataOutputStream.writeInt(this.f17248b);
                dataOutputStream.writeLong(this.f17249c);
                dataOutputStream.writeLong(this.f17250d);
                dataOutputStream.close();
            } catch (Throwable th) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f17248b == bVar.f17248b && this.f17249c == bVar.f17249c && this.f17247a == bVar.f17247a && this.f17250d == bVar.f17250d;
        }

        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.f17248b), Long.valueOf(this.f17249c), Integer.valueOf(this.f17247a), Long.valueOf(this.f17250d));
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        final int f17251a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f17252b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f17253c;

        c(int i10, boolean z10, boolean z11) {
            this.f17251a = i10;
            this.f17253c = z11;
            this.f17252b = z10;
        }
    }

    private static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? a.a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    private static c b(int i10, boolean z10, boolean z11) {
        c cVar = new c(i10, z10, z11);
        f17246c = cVar;
        f17244a.x(cVar);
        return f17246c;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(20:14|(1:79)(1:18)|19|(1:78)(1:23)|24|25|26|(2:63|64)(1:28)|29|(8:36|(1:40)|(1:47)|48|(2:55|56)|52|53|54)|(1:62)|(1:40)|(3:42|45|47)|48|(1:50)|55|56|52|53|54) */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00cf, code lost:
    
        r3 = 196608;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00a0, code lost:
    
        r3 = 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static c c(Context context, boolean z10) {
        b a10;
        b bVar;
        int i10;
        c cVar;
        if (!z10 && (cVar = f17246c) != null) {
            return cVar;
        }
        synchronized (f17245b) {
            if (!z10) {
                try {
                    c cVar2 = f17246c;
                    if (cVar2 != null) {
                        return cVar2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            int i11 = Build.VERSION.SDK_INT;
            int i12 = 0;
            if (i11 >= 28 && i11 != 30) {
                File file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                long length = file.length();
                boolean z11 = file.exists() && length > 0;
                File file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                long length2 = file2.length();
                boolean z12 = file2.exists() && length2 > 0;
                try {
                    long a11 = a(context);
                    File file3 = new File(context.getFilesDir(), "profileInstalled");
                    if (file3.exists()) {
                        try {
                            a10 = b.a(file3);
                        } catch (IOException unused) {
                            return b(131072, z11, z12);
                        }
                    } else {
                        a10 = null;
                    }
                    if (a10 != null && a10.f17249c == a11 && (i10 = a10.f17248b) != 2) {
                        i12 = i10;
                        if (z10 && z12 && i12 != 1) {
                            i12 = 2;
                        }
                        if (a10 != null && a10.f17248b == 2 && i12 == 1 && length < a10.f17250d) {
                            i12 = 3;
                        }
                        bVar = new b(1, i12, a11, length2);
                        if (a10 != null || !a10.equals(bVar)) {
                            bVar.b(file3);
                        }
                        return b(i12, z11, z12);
                    }
                    if (z12) {
                        i12 = 2;
                    }
                    if (z10) {
                        i12 = 2;
                    }
                    if (a10 != null) {
                        i12 = 3;
                    }
                    bVar = new b(1, i12, a11, length2);
                    if (a10 != null) {
                    }
                    bVar.b(file3);
                    return b(i12, z11, z12);
                } catch (PackageManager.NameNotFoundException unused2) {
                    return b(65536, z11, z12);
                }
            }
            return b(262144, false, false);
        }
    }
}
