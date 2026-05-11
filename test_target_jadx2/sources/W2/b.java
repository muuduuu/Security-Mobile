package W2;

import V2.a;
import W2.i;
import a3.AbstractC1348a;
import a3.c;
import android.os.Environment;
import b3.C1648c;
import i3.C3319d;
import i3.InterfaceC3316a;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class b implements i {

    /* renamed from: f, reason: collision with root package name */
    private static final Class f11263f = b.class;

    /* renamed from: g, reason: collision with root package name */
    static final long f11264g = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: a, reason: collision with root package name */
    private final File f11265a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f11266b;

    /* renamed from: c, reason: collision with root package name */
    private final File f11267c;

    /* renamed from: d, reason: collision with root package name */
    private final V2.a f11268d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3316a f11269e;

    private class a implements a3.b {

        /* renamed from: a, reason: collision with root package name */
        private final List f11270a;

        @Override // a3.b
        public void a(File file) {
            c v10 = b.this.v(file);
            if (v10 == null || v10.f11276a != ".cnt") {
                return;
            }
            this.f11270a.add(new C0207b(v10.f11277b, file));
        }

        public List d() {
            return Collections.unmodifiableList(this.f11270a);
        }

        private a() {
            this.f11270a = new ArrayList();
        }

        @Override // a3.b
        public void b(File file) {
        }

        @Override // a3.b
        public void c(File file) {
        }
    }

    /* renamed from: W2.b$b, reason: collision with other inner class name */
    static class C0207b implements i.a {

        /* renamed from: a, reason: collision with root package name */
        private final String f11272a;

        /* renamed from: b, reason: collision with root package name */
        private final U2.b f11273b;

        /* renamed from: c, reason: collision with root package name */
        private long f11274c;

        /* renamed from: d, reason: collision with root package name */
        private long f11275d;

        @Override // W2.i.a
        public long a() {
            if (this.f11275d < 0) {
                this.f11275d = this.f11273b.d().lastModified();
            }
            return this.f11275d;
        }

        public U2.b b() {
            return this.f11273b;
        }

        @Override // W2.i.a
        public String getId() {
            return this.f11272a;
        }

        @Override // W2.i.a
        public long k() {
            if (this.f11274c < 0) {
                this.f11274c = this.f11273b.size();
            }
            return this.f11274c;
        }

        private C0207b(String str, File file) {
            b3.l.g(file);
            this.f11272a = (String) b3.l.g(str);
            this.f11273b = U2.b.b(file);
            this.f11274c = -1L;
            this.f11275d = -1L;
        }
    }

    private static class c {

        /* renamed from: a, reason: collision with root package name */
        public final String f11276a;

        /* renamed from: b, reason: collision with root package name */
        public final String f11277b;

        public static c b(File file) {
            String t10;
            String name = file.getName();
            int lastIndexOf = name.lastIndexOf(46);
            if (lastIndexOf <= 0 || (t10 = b.t(name.substring(lastIndexOf))) == null) {
                return null;
            }
            String substring = name.substring(0, lastIndexOf);
            if (t10.equals(".tmp")) {
                int lastIndexOf2 = substring.lastIndexOf(46);
                if (lastIndexOf2 <= 0) {
                    return null;
                }
                substring = substring.substring(0, lastIndexOf2);
            }
            return new c(t10, substring);
        }

        public File a(File file) {
            return File.createTempFile(this.f11277b + ".", ".tmp", file);
        }

        public String c(String str) {
            return str + File.separator + this.f11277b + this.f11276a;
        }

        public String toString() {
            return this.f11276a + "(" + this.f11277b + ")";
        }

        private c(String str, String str2) {
            this.f11276a = str;
            this.f11277b = str2;
        }
    }

    private static class d extends IOException {
        public d(long j10, long j11) {
            super("File was not written completely. Expected: " + j10 + ", found: " + j11);
        }
    }

    class e implements i.b {

        /* renamed from: a, reason: collision with root package name */
        private final String f11278a;

        /* renamed from: b, reason: collision with root package name */
        final File f11279b;

        public e(String str, File file) {
            this.f11278a = str;
            this.f11279b = file;
        }

        @Override // W2.i.b
        public void a(V2.j jVar, Object obj) {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(this.f11279b);
                try {
                    C1648c c1648c = new C1648c(fileOutputStream);
                    jVar.a(c1648c);
                    c1648c.flush();
                    long a10 = c1648c.a();
                    fileOutputStream.close();
                    if (this.f11279b.length() != a10) {
                        throw new d(a10, this.f11279b.length());
                    }
                } catch (Throwable th) {
                    fileOutputStream.close();
                    throw th;
                }
            } catch (FileNotFoundException e10) {
                b.this.f11268d.a(a.EnumC0200a.WRITE_UPDATE_FILE_NOT_FOUND, b.f11263f, "updateResource", e10);
                throw e10;
            }
        }

        @Override // W2.i.b
        public U2.a b(Object obj) {
            return c(obj, b.this.f11269e.now());
        }

        public U2.a c(Object obj, long j10) {
            File r10 = b.this.r(this.f11278a);
            try {
                a3.c.b(this.f11279b, r10);
                if (r10.exists()) {
                    r10.setLastModified(j10);
                }
                return U2.b.b(r10);
            } catch (c.d e10) {
                Throwable cause = e10.getCause();
                b.this.f11268d.a(cause != null ? !(cause instanceof c.C0233c) ? cause instanceof FileNotFoundException ? a.EnumC0200a.WRITE_RENAME_FILE_TEMPFILE_NOT_FOUND : a.EnumC0200a.WRITE_RENAME_FILE_OTHER : a.EnumC0200a.WRITE_RENAME_FILE_TEMPFILE_PARENT_NOT_FOUND : a.EnumC0200a.WRITE_RENAME_FILE_OTHER, b.f11263f, "commit", e10);
                throw e10;
            }
        }

        @Override // W2.i.b
        public boolean w() {
            return !this.f11279b.exists() || this.f11279b.delete();
        }
    }

    private class f implements a3.b {

        /* renamed from: a, reason: collision with root package name */
        private boolean f11281a;

        private boolean d(File file) {
            c v10 = b.this.v(file);
            if (v10 == null) {
                return false;
            }
            String str = v10.f11276a;
            if (str == ".tmp") {
                return e(file);
            }
            b3.l.i(str == ".cnt");
            return true;
        }

        private boolean e(File file) {
            return file.lastModified() > b.this.f11269e.now() - b.f11264g;
        }

        @Override // a3.b
        public void a(File file) {
            if (this.f11281a && d(file)) {
                return;
            }
            file.delete();
        }

        @Override // a3.b
        public void b(File file) {
            if (this.f11281a || !file.equals(b.this.f11267c)) {
                return;
            }
            this.f11281a = true;
        }

        @Override // a3.b
        public void c(File file) {
            if (!b.this.f11265a.equals(file) && !this.f11281a) {
                file.delete();
            }
            if (this.f11281a && file.equals(b.this.f11267c)) {
                this.f11281a = false;
            }
        }

        private f() {
        }
    }

    public b(File file, int i10, V2.a aVar) {
        b3.l.g(file);
        this.f11265a = file;
        this.f11266b = z(file, aVar);
        this.f11267c = new File(file, y(i10));
        this.f11268d = aVar;
        C();
        this.f11269e = C3319d.a();
    }

    private void A(File file, String str) {
        try {
            a3.c.a(file);
        } catch (c.a e10) {
            this.f11268d.a(a.EnumC0200a.WRITE_CREATE_DIR, f11263f, str, e10);
            throw e10;
        }
    }

    private boolean B(String str, boolean z10) {
        File r10 = r(str);
        boolean exists = r10.exists();
        if (z10 && exists) {
            r10.setLastModified(this.f11269e.now());
        }
        return exists;
    }

    private void C() {
        if (this.f11265a.exists()) {
            if (this.f11267c.exists()) {
                return;
            } else {
                AbstractC1348a.b(this.f11265a);
            }
        }
        try {
            a3.c.a(this.f11267c);
        } catch (c.a unused) {
            this.f11268d.a(a.EnumC0200a.WRITE_CREATE_DIR, f11263f, "version directory could not be created: " + this.f11267c, null);
        }
    }

    private long p(File file) {
        if (!file.exists()) {
            return 0L;
        }
        long length = file.length();
        if (file.delete()) {
            return length;
        }
        return -1L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String t(String str) {
        if (".cnt".equals(str)) {
            return ".cnt";
        }
        if (".tmp".equals(str)) {
            return ".tmp";
        }
        return null;
    }

    private String u(String str) {
        c cVar = new c(".cnt", str);
        return cVar.c(x(cVar.f11277b));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public c v(File file) {
        c b10 = c.b(file);
        if (b10 != null && w(b10.f11277b).equals(file.getParentFile())) {
            return b10;
        }
        return null;
    }

    private File w(String str) {
        return new File(x(str));
    }

    private String x(String str) {
        return this.f11267c + File.separator + String.valueOf(Math.abs(str.hashCode() % 100));
    }

    static String y(int i10) {
        return String.format(null, "%s.ols%d.%d", "v2", 100, Integer.valueOf(i10));
    }

    private static boolean z(File file, V2.a aVar) {
        String str;
        try {
            File externalStorageDirectory = Environment.getExternalStorageDirectory();
            if (externalStorageDirectory == null) {
                return false;
            }
            String file2 = externalStorageDirectory.toString();
            try {
                str = file.getCanonicalPath();
            } catch (IOException e10) {
                e = e10;
                str = null;
            }
            try {
                return str.contains(file2);
            } catch (IOException e11) {
                e = e11;
                aVar.a(a.EnumC0200a.OTHER, f11263f, "failed to read folder to check if external: " + str, e);
                return false;
            }
        } catch (Exception e12) {
            aVar.a(a.EnumC0200a.OTHER, f11263f, "failed to get the external storage directory!", e12);
            return false;
        }
    }

    @Override // W2.i
    public void a() {
        AbstractC1348a.a(this.f11265a);
    }

    @Override // W2.i
    public void b() {
        AbstractC1348a.c(this.f11265a, new f());
    }

    @Override // W2.i
    public i.b c(String str, Object obj) {
        c cVar = new c(".tmp", str);
        File w10 = w(cVar.f11277b);
        if (!w10.exists()) {
            A(w10, "insert");
        }
        try {
            return new e(str, cVar.a(w10));
        } catch (IOException e10) {
            this.f11268d.a(a.EnumC0200a.WRITE_CREATE_TEMPFILE, f11263f, "insert", e10);
            throw e10;
        }
    }

    @Override // W2.i
    public boolean d(String str, Object obj) {
        return B(str, true);
    }

    @Override // W2.i
    public boolean e(String str, Object obj) {
        return B(str, false);
    }

    @Override // W2.i
    public U2.a f(String str, Object obj) {
        File r10 = r(str);
        if (!r10.exists()) {
            return null;
        }
        r10.setLastModified(this.f11269e.now());
        return U2.b.c(r10);
    }

    @Override // W2.i
    public long h(i.a aVar) {
        return p(((C0207b) aVar).b().d());
    }

    @Override // W2.i
    public boolean q() {
        return this.f11266b;
    }

    File r(String str) {
        return new File(u(str));
    }

    @Override // W2.i
    public long remove(String str) {
        return p(r(str));
    }

    @Override // W2.i
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public List g() {
        a aVar = new a();
        AbstractC1348a.c(this.f11267c, aVar);
        return aVar.d();
    }
}
