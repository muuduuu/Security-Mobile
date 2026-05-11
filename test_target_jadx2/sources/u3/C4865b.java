package u3;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import u3.AbstractC4864a;

/* renamed from: u3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C4865b extends AbstractC4864a {

    /* renamed from: b, reason: collision with root package name */
    private final Object f43481b = new Object();

    /* renamed from: f, reason: collision with root package name */
    private final Runnable f43485f = new a();

    /* renamed from: d, reason: collision with root package name */
    private ArrayList f43483d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    private ArrayList f43484e = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final Handler f43482c = new Handler(Looper.getMainLooper());

    /* renamed from: u3.b$a */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (C4865b.this.f43481b) {
                ArrayList arrayList = C4865b.this.f43484e;
                C4865b c4865b = C4865b.this;
                c4865b.f43484e = c4865b.f43483d;
                C4865b.this.f43483d = arrayList;
            }
            int size = C4865b.this.f43484e.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((AbstractC4864a.InterfaceC0620a) C4865b.this.f43484e.get(i10)).a();
            }
            C4865b.this.f43484e.clear();
        }
    }

    @Override // u3.AbstractC4864a
    public void a(AbstractC4864a.InterfaceC0620a interfaceC0620a) {
        synchronized (this.f43481b) {
            this.f43483d.remove(interfaceC0620a);
        }
    }

    @Override // u3.AbstractC4864a
    public void d(AbstractC4864a.InterfaceC0620a interfaceC0620a) {
        if (!AbstractC4864a.c()) {
            interfaceC0620a.a();
            return;
        }
        synchronized (this.f43481b) {
            try {
                if (this.f43483d.contains(interfaceC0620a)) {
                    return;
                }
                this.f43483d.add(interfaceC0620a);
                boolean z10 = true;
                if (this.f43483d.size() != 1) {
                    z10 = false;
                }
                if (z10) {
                    this.f43482c.post(this.f43485f);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
