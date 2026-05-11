package b1;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.SystemClock;
import android.text.format.DateUtils;
import androidx.core.os.l;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: b1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1640a extends AbstractC1641b {

    /* renamed from: i, reason: collision with root package name */
    private Executor f18483i;

    /* renamed from: j, reason: collision with root package name */
    private volatile RunnableC0321a f18484j;

    /* renamed from: k, reason: collision with root package name */
    private volatile RunnableC0321a f18485k;

    /* renamed from: l, reason: collision with root package name */
    private long f18486l;

    /* renamed from: m, reason: collision with root package name */
    private long f18487m;

    /* renamed from: n, reason: collision with root package name */
    private Handler f18488n;

    /* renamed from: b1.a$a, reason: collision with other inner class name */
    final class RunnableC0321a extends AbstractC1642c implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        boolean f18489f;

        RunnableC0321a() {
        }

        @Override // b1.AbstractC1642c
        protected Object b() {
            try {
                return AbstractC1640a.this.F();
            } catch (l e10) {
                if (f()) {
                    return null;
                }
                throw e10;
            }
        }

        @Override // b1.AbstractC1642c
        protected void g(Object obj) {
            AbstractC1640a.this.z(this, obj);
        }

        @Override // b1.AbstractC1642c
        protected void h(Object obj) {
            AbstractC1640a.this.A(this, obj);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f18489f = false;
            AbstractC1640a.this.B();
        }
    }

    public AbstractC1640a(Context context) {
        super(context);
        this.f18487m = -10000L;
    }

    void A(RunnableC0321a runnableC0321a, Object obj) {
        if (this.f18484j != runnableC0321a) {
            z(runnableC0321a, obj);
            return;
        }
        if (j()) {
            E(obj);
            return;
        }
        d();
        this.f18487m = SystemClock.uptimeMillis();
        this.f18484j = null;
        g(obj);
    }

    void B() {
        if (this.f18485k != null || this.f18484j == null) {
            return;
        }
        if (this.f18484j.f18489f) {
            this.f18484j.f18489f = false;
            this.f18488n.removeCallbacks(this.f18484j);
        }
        if (this.f18486l > 0 && SystemClock.uptimeMillis() < this.f18487m + this.f18486l) {
            this.f18484j.f18489f = true;
            this.f18488n.postAtTime(this.f18484j, this.f18487m + this.f18486l);
        } else {
            if (this.f18483i == null) {
                this.f18483i = C();
            }
            this.f18484j.c(this.f18483i);
        }
    }

    protected Executor C() {
        return AsyncTask.THREAD_POOL_EXECUTOR;
    }

    public abstract Object D();

    protected Object F() {
        return D();
    }

    @Override // b1.AbstractC1641b
    public void h(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2;
        super.h(str, fileDescriptor, printWriter, strArr);
        if (this.f18484j != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.f18484j);
            printWriter.print(" waiting=");
            printWriter.println(this.f18484j.f18489f);
        }
        if (this.f18485k != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.f18485k);
            printWriter.print(" waiting=");
            printWriter.println(this.f18485k.f18489f);
        }
        if (this.f18486l != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            printWriter.print(DateUtils.formatElapsedTime(timeUnit.toSeconds(this.f18486l)));
            printWriter.print(" mLastLoadCompleteTime=");
            if (this.f18487m == -10000) {
                str2 = "--";
            } else {
                str2 = "-" + DateUtils.formatElapsedTime(timeUnit.toSeconds(SystemClock.uptimeMillis() - this.f18487m));
            }
            printWriter.print(str2);
            printWriter.println();
        }
    }

    @Override // b1.AbstractC1641b
    protected boolean m() {
        if (this.f18484j == null) {
            return false;
        }
        if (!k()) {
            n();
        }
        if (this.f18485k != null) {
            if (this.f18484j.f18489f) {
                this.f18484j.f18489f = false;
                this.f18488n.removeCallbacks(this.f18484j);
            }
            this.f18484j = null;
            return false;
        }
        if (this.f18484j.f18489f) {
            this.f18484j.f18489f = false;
            this.f18488n.removeCallbacks(this.f18484j);
            this.f18484j = null;
            return false;
        }
        boolean a10 = this.f18484j.a(false);
        if (a10) {
            this.f18485k = this.f18484j;
            y();
        }
        this.f18484j = null;
        return a10;
    }

    @Override // b1.AbstractC1641b
    protected void o() {
        super.o();
        c();
        this.f18484j = new RunnableC0321a();
        B();
    }

    void z(RunnableC0321a runnableC0321a, Object obj) {
        E(obj);
        if (this.f18485k == runnableC0321a) {
            u();
            this.f18487m = SystemClock.uptimeMillis();
            this.f18485k = null;
            f();
            B();
        }
    }

    public void y() {
    }

    public void E(Object obj) {
    }
}
