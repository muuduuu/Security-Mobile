package v3;

import android.graphics.drawable.Animatable;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class f implements InterfaceC4924d {

    /* renamed from: a, reason: collision with root package name */
    private final List f43917a = new ArrayList(2);

    private synchronized void d(String str, Throwable th) {
        Log.e("FdingControllerListener", str, th);
    }

    @Override // v3.InterfaceC4924d
    public void a(String str, Object obj) {
        int size = this.f43917a.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                InterfaceC4924d interfaceC4924d = (InterfaceC4924d) this.f43917a.get(i10);
                if (interfaceC4924d != null) {
                    interfaceC4924d.a(str, obj);
                }
            } catch (Exception e10) {
                d("InternalListener exception in onIntermediateImageSet", e10);
            }
        }
    }

    public synchronized void b(InterfaceC4924d interfaceC4924d) {
        this.f43917a.add(interfaceC4924d);
    }

    public synchronized void c() {
        this.f43917a.clear();
    }

    @Override // v3.InterfaceC4924d
    public synchronized void f(String str, Object obj, Animatable animatable) {
        int size = this.f43917a.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                InterfaceC4924d interfaceC4924d = (InterfaceC4924d) this.f43917a.get(i10);
                if (interfaceC4924d != null) {
                    interfaceC4924d.f(str, obj, animatable);
                }
            } catch (Exception e10) {
                d("InternalListener exception in onFinalImageSet", e10);
            }
        }
    }

    @Override // v3.InterfaceC4924d
    public synchronized void i(String str, Throwable th) {
        int size = this.f43917a.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                InterfaceC4924d interfaceC4924d = (InterfaceC4924d) this.f43917a.get(i10);
                if (interfaceC4924d != null) {
                    interfaceC4924d.i(str, th);
                }
            } catch (Exception e10) {
                d("InternalListener exception in onFailure", e10);
            }
        }
    }

    @Override // v3.InterfaceC4924d
    public synchronized void k(String str) {
        int size = this.f43917a.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                InterfaceC4924d interfaceC4924d = (InterfaceC4924d) this.f43917a.get(i10);
                if (interfaceC4924d != null) {
                    interfaceC4924d.k(str);
                }
            } catch (Exception e10) {
                d("InternalListener exception in onRelease", e10);
            }
        }
    }

    @Override // v3.InterfaceC4924d
    public synchronized void o(String str, Object obj) {
        int size = this.f43917a.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                InterfaceC4924d interfaceC4924d = (InterfaceC4924d) this.f43917a.get(i10);
                if (interfaceC4924d != null) {
                    interfaceC4924d.o(str, obj);
                }
            } catch (Exception e10) {
                d("InternalListener exception in onSubmit", e10);
            }
        }
    }

    @Override // v3.InterfaceC4924d
    public void p(String str, Throwable th) {
        int size = this.f43917a.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                InterfaceC4924d interfaceC4924d = (InterfaceC4924d) this.f43917a.get(i10);
                if (interfaceC4924d != null) {
                    interfaceC4924d.p(str, th);
                }
            } catch (Exception e10) {
                d("InternalListener exception in onIntermediateImageFailed", e10);
            }
        }
    }
}
