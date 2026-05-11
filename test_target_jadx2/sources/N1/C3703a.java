package n1;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: n1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3703a {

    /* renamed from: e, reason: collision with root package name */
    public static final C0568a f37535e = new C0568a(null);

    /* renamed from: f, reason: collision with root package name */
    private static final Map f37536f = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    private final boolean f37537a;

    /* renamed from: b, reason: collision with root package name */
    private final File f37538b;

    /* renamed from: c, reason: collision with root package name */
    private final Lock f37539c;

    /* renamed from: d, reason: collision with root package name */
    private FileChannel f37540d;

    /* renamed from: n1.a$a, reason: collision with other inner class name */
    public static final class C0568a {
        public /* synthetic */ C0568a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Lock b(String str) {
            Lock lock;
            synchronized (C3703a.f37536f) {
                try {
                    Map map = C3703a.f37536f;
                    Object obj = map.get(str);
                    if (obj == null) {
                        obj = new ReentrantLock();
                        map.put(str, obj);
                    }
                    lock = (Lock) obj;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return lock;
        }

        private C0568a() {
        }
    }

    public C3703a(String name, File file, boolean z10) {
        File file2;
        Intrinsics.checkNotNullParameter(name, "name");
        this.f37537a = z10;
        if (file != null) {
            file2 = new File(file, name + ".lck");
        } else {
            file2 = null;
        }
        this.f37538b = file2;
        this.f37539c = f37535e.b(name);
    }

    public static /* synthetic */ void c(C3703a c3703a, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = c3703a.f37537a;
        }
        c3703a.b(z10);
    }

    public final void b(boolean z10) {
        this.f37539c.lock();
        if (z10) {
            try {
                File file = this.f37538b;
                if (file == null) {
                    throw new IOException("No lock directory was provided.");
                }
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileChannel channel = new FileOutputStream(this.f37538b).getChannel();
                channel.lock();
                this.f37540d = channel;
            } catch (IOException e10) {
                this.f37540d = null;
                Log.w("SupportSQLiteLock", "Unable to grab file lock.", e10);
            }
        }
    }

    public final void d() {
        try {
            FileChannel fileChannel = this.f37540d;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (IOException unused) {
        }
        this.f37539c.unlock();
    }
}
