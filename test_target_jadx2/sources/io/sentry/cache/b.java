package io.sentry.cache;

import io.sentry.C3416h1;
import io.sentry.C3471y1;
import io.sentry.J1;
import io.sentry.K1;
import io.sentry.P1;
import io.sentry.Q;
import io.sentry.Z1;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: e, reason: collision with root package name */
    protected static final Charset f35033e = Charset.forName("UTF-8");

    /* renamed from: a, reason: collision with root package name */
    protected final P1 f35034a;

    /* renamed from: b, reason: collision with root package name */
    protected final Q f35035b;

    /* renamed from: c, reason: collision with root package name */
    protected final File f35036c;

    /* renamed from: d, reason: collision with root package name */
    private final int f35037d;

    b(P1 p12, String str, int i10) {
        io.sentry.util.n.c(str, "Directory is required.");
        this.f35034a = (P1) io.sentry.util.n.c(p12, "SentryOptions is required.");
        this.f35035b = p12.getSerializer();
        this.f35036c = new File(str);
        this.f35037d = i10;
    }

    private void B(C3416h1 c3416h1, File file, long j10) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                this.f35035b.b(c3416h1, fileOutputStream);
                file.setLastModified(j10);
                fileOutputStream.close();
            } finally {
            }
        } catch (Throwable th) {
            this.f35034a.getLogger().b(K1.ERROR, "Failed to serialize the new envelope to the disk.", th);
        }
    }

    private void D(File[] fileArr) {
        if (fileArr.length > 1) {
            Arrays.sort(fileArr, new Comparator() { // from class: io.sentry.cache.a
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int t10;
                    t10 = b.t((File) obj, (File) obj2);
                    return t10;
                }
            });
        }
    }

    private C3416h1 e(C3416h1 c3416h1, C3471y1 c3471y1) {
        ArrayList arrayList = new ArrayList();
        Iterator it = c3416h1.c().iterator();
        while (it.hasNext()) {
            arrayList.add((C3471y1) it.next());
        }
        arrayList.add(c3471y1);
        return new C3416h1(c3416h1.b(), arrayList);
    }

    private Z1 h(C3416h1 c3416h1) {
        for (C3471y1 c3471y1 : c3416h1.c()) {
            if (k(c3471y1)) {
                return w(c3471y1);
            }
        }
        return null;
    }

    private boolean k(C3471y1 c3471y1) {
        if (c3471y1 == null) {
            return false;
        }
        return c3471y1.x().b().equals(J1.Session);
    }

    private boolean m(C3416h1 c3416h1) {
        return c3416h1.c().iterator().hasNext();
    }

    private boolean r(Z1 z12) {
        return z12.l().equals(Z1.b.Ok) && z12.j() != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int t(File file, File file2) {
        return Long.compare(file.lastModified(), file2.lastModified());
    }

    private void u(File file, File[] fileArr) {
        Boolean g10;
        int i10;
        File file2;
        C3416h1 v10;
        C3471y1 c3471y1;
        Z1 w10;
        C3416h1 v11 = v(file);
        if (v11 == null || !m(v11)) {
            return;
        }
        this.f35034a.getClientReportRecorder().b(io.sentry.clientreport.e.CACHE_OVERFLOW, v11);
        Z1 h10 = h(v11);
        if (h10 == null || !r(h10) || (g10 = h10.g()) == null || !g10.booleanValue()) {
            return;
        }
        int length = fileArr.length;
        for (i10 = 0; i10 < length; i10++) {
            file2 = fileArr[i10];
            v10 = v(file2);
            if (v10 != null && m(v10)) {
                Iterator it = v10.c().iterator();
                while (true) {
                    c3471y1 = null;
                    if (!it.hasNext()) {
                        break;
                    }
                    C3471y1 c3471y12 = (C3471y1) it.next();
                    if (k(c3471y12) && (w10 = w(c3471y12)) != null && r(w10)) {
                        Boolean g11 = w10.g();
                        if (g11 != null && g11.booleanValue()) {
                            this.f35034a.getLogger().c(K1.ERROR, "Session %s has 2 times the init flag.", h10.j());
                            return;
                        }
                        if (h10.j() != null && h10.j().equals(w10.j())) {
                            w10.n();
                            try {
                                c3471y1 = C3471y1.u(this.f35035b, w10);
                                it.remove();
                                break;
                            } catch (IOException e10) {
                                this.f35034a.getLogger().a(K1.ERROR, e10, "Failed to create new envelope item for the session %s", h10.j());
                            }
                        }
                    }
                }
            }
        }
        return;
        if (c3471y1 != null) {
            C3416h1 e11 = e(v10, c3471y1);
            long lastModified = file2.lastModified();
            if (!file2.delete()) {
                this.f35034a.getLogger().c(K1.WARNING, "File can't be deleted: %s", file2.getAbsolutePath());
            }
            B(e11, file2, lastModified);
            return;
        }
    }

    private C3416h1 v(File file) {
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            try {
                C3416h1 d10 = this.f35035b.d(bufferedInputStream);
                bufferedInputStream.close();
                return d10;
            } finally {
            }
        } catch (IOException e10) {
            this.f35034a.getLogger().b(K1.ERROR, "Failed to deserialize the envelope.", e10);
            return null;
        }
    }

    private Z1 w(C3471y1 c3471y1) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(c3471y1.w()), f35033e));
            try {
                Z1 z12 = (Z1) this.f35035b.c(bufferedReader, Z1.class);
                bufferedReader.close();
                return z12;
            } finally {
            }
        } catch (Throwable th) {
            this.f35034a.getLogger().b(K1.ERROR, "Failed to deserialize the session.", th);
            return null;
        }
    }

    protected void A(File[] fileArr) {
        int length = fileArr.length;
        if (length >= this.f35037d) {
            this.f35034a.getLogger().c(K1.WARNING, "Cache folder if full (respecting maxSize). Rotating files", new Object[0]);
            int i10 = (length - this.f35037d) + 1;
            D(fileArr);
            File[] fileArr2 = (File[]) Arrays.copyOfRange(fileArr, i10, length);
            for (int i11 = 0; i11 < i10; i11++) {
                File file = fileArr[i11];
                u(file, fileArr2);
                if (!file.delete()) {
                    this.f35034a.getLogger().c(K1.WARNING, "File can't be deleted: %s", file.getAbsolutePath());
                }
            }
        }
    }

    protected boolean j() {
        if (this.f35036c.isDirectory() && this.f35036c.canWrite() && this.f35036c.canRead()) {
            return true;
        }
        this.f35034a.getLogger().c(K1.ERROR, "The directory for caching files is inaccessible.: %s", this.f35036c.getAbsolutePath());
        return false;
    }
}
