package x3;

import android.graphics.drawable.Animatable;
import v3.C4923c;

/* renamed from: x3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5107a extends C4923c {

    /* renamed from: b, reason: collision with root package name */
    private long f44771b = -1;

    /* renamed from: c, reason: collision with root package name */
    private long f44772c = -1;

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC5108b f44773d;

    public C5107a(InterfaceC5108b interfaceC5108b) {
        this.f44773d = interfaceC5108b;
    }

    @Override // v3.C4923c, v3.InterfaceC4924d
    public void f(String str, Object obj, Animatable animatable) {
        long currentTimeMillis = System.currentTimeMillis();
        this.f44772c = currentTimeMillis;
        InterfaceC5108b interfaceC5108b = this.f44773d;
        if (interfaceC5108b != null) {
            interfaceC5108b.a(currentTimeMillis - this.f44771b);
        }
    }

    @Override // v3.C4923c, v3.InterfaceC4924d
    public void o(String str, Object obj) {
        this.f44771b = System.currentTimeMillis();
    }
}
