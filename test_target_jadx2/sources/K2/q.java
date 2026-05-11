package k2;

import android.util.Log;
import i2.EnumC3313a;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.conscrypt.BuildConfig;

/* loaded from: classes.dex */
public final class q extends Exception {

    /* renamed from: g, reason: collision with root package name */
    private static final StackTraceElement[] f36152g = new StackTraceElement[0];

    /* renamed from: a, reason: collision with root package name */
    private final List f36153a;

    /* renamed from: b, reason: collision with root package name */
    private i2.f f36154b;

    /* renamed from: c, reason: collision with root package name */
    private EnumC3313a f36155c;

    /* renamed from: d, reason: collision with root package name */
    private Class f36156d;

    /* renamed from: e, reason: collision with root package name */
    private String f36157e;

    /* renamed from: f, reason: collision with root package name */
    private Exception f36158f;

    public q(String str) {
        this(str, Collections.emptyList());
    }

    private void a(Throwable th, List list) {
        if (!(th instanceof q)) {
            list.add(th);
            return;
        }
        Iterator it = ((q) th).e().iterator();
        while (it.hasNext()) {
            a((Throwable) it.next(), list);
        }
    }

    private static void b(List list, Appendable appendable) {
        try {
            c(list, appendable);
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    private static void c(List list, Appendable appendable) {
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            appendable.append("Cause (").append(String.valueOf(i11)).append(" of ").append(String.valueOf(size)).append("): ");
            Throwable th = (Throwable) list.get(i10);
            if (th instanceof q) {
                ((q) th).h(appendable);
            } else {
                d(th, appendable);
            }
            i10 = i11;
        }
    }

    private static void d(Throwable th, Appendable appendable) {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append('\n');
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    private void h(Appendable appendable) {
        d(this, appendable);
        b(e(), new a(appendable));
    }

    public List e() {
        return this.f36153a;
    }

    public List f() {
        ArrayList arrayList = new ArrayList();
        a(this, arrayList);
        return arrayList;
    }

    public void g(String str) {
        List f10 = f();
        int size = f10.size();
        int i10 = 0;
        while (i10 < size) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Root cause (");
            int i11 = i10 + 1;
            sb2.append(i11);
            sb2.append(" of ");
            sb2.append(size);
            sb2.append(")");
            Log.i(str, sb2.toString(), (Throwable) f10.get(i10));
            i10 = i11;
        }
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        StringBuilder sb2 = new StringBuilder(71);
        sb2.append(this.f36157e);
        Class cls = this.f36156d;
        String str = BuildConfig.FLAVOR;
        sb2.append(cls != null ? ", " + this.f36156d : BuildConfig.FLAVOR);
        sb2.append(this.f36155c != null ? ", " + this.f36155c : BuildConfig.FLAVOR);
        if (this.f36154b != null) {
            str = ", " + this.f36154b;
        }
        sb2.append(str);
        List<Throwable> f10 = f();
        if (f10.isEmpty()) {
            return sb2.toString();
        }
        if (f10.size() == 1) {
            sb2.append("\nThere was 1 root cause:");
        } else {
            sb2.append("\nThere were ");
            sb2.append(f10.size());
            sb2.append(" root causes:");
        }
        for (Throwable th : f10) {
            sb2.append('\n');
            sb2.append(th.getClass().getName());
            sb2.append('(');
            sb2.append(th.getMessage());
            sb2.append(')');
        }
        sb2.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb2.toString();
    }

    void i(i2.f fVar, EnumC3313a enumC3313a) {
        j(fVar, enumC3313a, null);
    }

    void j(i2.f fVar, EnumC3313a enumC3313a, Class cls) {
        this.f36154b = fVar;
        this.f36155c = enumC3313a;
        this.f36156d = cls;
    }

    public void k(Exception exc) {
        this.f36158f = exc;
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        printStackTrace(System.err);
    }

    public q(String str, Throwable th) {
        this(str, Collections.singletonList(th));
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        h(printStream);
    }

    public q(String str, List list) {
        this.f36157e = str;
        setStackTrace(f36152g);
        this.f36153a = list;
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        h(printWriter);
    }

    private static final class a implements Appendable {

        /* renamed from: a, reason: collision with root package name */
        private final Appendable f36159a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f36160b = true;

        a(Appendable appendable) {
            this.f36159a = appendable;
        }

        private CharSequence a(CharSequence charSequence) {
            return charSequence == null ? BuildConfig.FLAVOR : charSequence;
        }

        @Override // java.lang.Appendable
        public Appendable append(char c10) {
            if (this.f36160b) {
                this.f36160b = false;
                this.f36159a.append("  ");
            }
            this.f36160b = c10 == '\n';
            this.f36159a.append(c10);
            return this;
        }

        @Override // java.lang.Appendable
        public Appendable append(CharSequence charSequence) {
            CharSequence a10 = a(charSequence);
            return append(a10, 0, a10.length());
        }

        @Override // java.lang.Appendable
        public Appendable append(CharSequence charSequence, int i10, int i11) {
            CharSequence a10 = a(charSequence);
            boolean z10 = false;
            if (this.f36160b) {
                this.f36160b = false;
                this.f36159a.append("  ");
            }
            if (a10.length() > 0 && a10.charAt(i11 - 1) == '\n') {
                z10 = true;
            }
            this.f36160b = z10;
            this.f36159a.append(a10, i10, i11);
            return this;
        }
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        return this;
    }
}
