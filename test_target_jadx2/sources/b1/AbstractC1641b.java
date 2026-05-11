package b1;

import android.content.Context;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: b1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1641b {

    /* renamed from: a, reason: collision with root package name */
    private int f18491a;

    /* renamed from: b, reason: collision with root package name */
    private a f18492b;

    /* renamed from: c, reason: collision with root package name */
    private Context f18493c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f18494d = false;

    /* renamed from: e, reason: collision with root package name */
    private boolean f18495e = false;

    /* renamed from: f, reason: collision with root package name */
    private boolean f18496f = true;

    /* renamed from: g, reason: collision with root package name */
    private boolean f18497g = false;

    /* renamed from: h, reason: collision with root package name */
    private boolean f18498h = false;

    /* renamed from: b1.b$a */
    public interface a {
        void a(AbstractC1641b abstractC1641b, Object obj);
    }

    public AbstractC1641b(Context context) {
        this.f18493c = context.getApplicationContext();
    }

    public void b() {
        this.f18495e = true;
        l();
    }

    public boolean c() {
        return m();
    }

    public void d() {
        this.f18498h = false;
    }

    public String e(Object obj) {
        StringBuilder sb2 = new StringBuilder(64);
        if (obj == null) {
            sb2.append("null");
        } else {
            Class<?> cls = obj.getClass();
            sb2.append(cls.getSimpleName());
            sb2.append("{");
            sb2.append(Integer.toHexString(System.identityHashCode(cls)));
            sb2.append("}");
        }
        return sb2.toString();
    }

    public void g(Object obj) {
        a aVar = this.f18492b;
        if (aVar != null) {
            aVar.a(this, obj);
        }
    }

    public void h(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.f18491a);
        printWriter.print(" mListener=");
        printWriter.println(this.f18492b);
        if (this.f18494d || this.f18497g || this.f18498h) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.f18494d);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.f18497g);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.f18498h);
        }
        if (this.f18495e || this.f18496f) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.f18495e);
            printWriter.print(" mReset=");
            printWriter.println(this.f18496f);
        }
    }

    public void i() {
        o();
    }

    public boolean j() {
        return this.f18495e;
    }

    public boolean k() {
        return this.f18494d;
    }

    protected abstract boolean m();

    public void n() {
        if (this.f18494d) {
            i();
        } else {
            this.f18497g = true;
        }
    }

    protected abstract void q();

    public void s(int i10, a aVar) {
        if (this.f18492b != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        this.f18492b = aVar;
        this.f18491a = i10;
    }

    public void t() {
        p();
        this.f18496f = true;
        this.f18494d = false;
        this.f18495e = false;
        this.f18497g = false;
        this.f18498h = false;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        Class<?> cls = getClass();
        sb2.append(cls.getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(cls)));
        sb2.append(" id=");
        sb2.append(this.f18491a);
        sb2.append("}");
        return sb2.toString();
    }

    public void u() {
        if (this.f18498h) {
            n();
        }
    }

    public final void v() {
        this.f18494d = true;
        this.f18496f = false;
        this.f18495e = false;
        q();
    }

    public void w() {
        this.f18494d = false;
        r();
    }

    public void x(a aVar) {
        a aVar2 = this.f18492b;
        if (aVar2 == null) {
            throw new IllegalStateException("No listener register");
        }
        if (aVar2 != aVar) {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
        this.f18492b = null;
    }

    public void f() {
    }

    protected void l() {
    }

    protected void o() {
    }

    protected void p() {
    }

    protected void r() {
    }
}
