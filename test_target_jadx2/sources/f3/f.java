package f3;

import java.lang.ref.SoftReference;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    SoftReference f32871a = null;

    /* renamed from: b, reason: collision with root package name */
    SoftReference f32872b = null;

    /* renamed from: c, reason: collision with root package name */
    SoftReference f32873c = null;

    public void a() {
        SoftReference softReference = this.f32871a;
        if (softReference != null) {
            softReference.clear();
            this.f32871a = null;
        }
        SoftReference softReference2 = this.f32872b;
        if (softReference2 != null) {
            softReference2.clear();
            this.f32872b = null;
        }
        SoftReference softReference3 = this.f32873c;
        if (softReference3 != null) {
            softReference3.clear();
            this.f32873c = null;
        }
    }

    public Object b() {
        SoftReference softReference = this.f32871a;
        if (softReference == null) {
            return null;
        }
        return softReference.get();
    }

    public void c(Object obj) {
        this.f32871a = new SoftReference(obj);
        this.f32872b = new SoftReference(obj);
        this.f32873c = new SoftReference(obj);
    }
}
