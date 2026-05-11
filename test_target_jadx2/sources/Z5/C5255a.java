package z5;

import com.fasterxml.jackson.core.f;
import java.util.HashSet;

/* renamed from: z5.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C5255a {

    /* renamed from: a, reason: collision with root package name */
    protected final Object f45736a;

    /* renamed from: b, reason: collision with root package name */
    protected String f45737b;

    /* renamed from: c, reason: collision with root package name */
    protected String f45738c;

    /* renamed from: d, reason: collision with root package name */
    protected HashSet f45739d;

    private C5255a(Object obj) {
        this.f45736a = obj;
    }

    public static C5255a e(f fVar) {
        return new C5255a(fVar);
    }

    public C5255a a() {
        return new C5255a(this.f45736a);
    }

    public Object b() {
        return this.f45736a;
    }

    public boolean c(String str) {
        String str2 = this.f45737b;
        if (str2 == null) {
            this.f45737b = str;
            return false;
        }
        if (str.equals(str2)) {
            return true;
        }
        String str3 = this.f45738c;
        if (str3 == null) {
            this.f45738c = str;
            return false;
        }
        if (str.equals(str3)) {
            return true;
        }
        if (this.f45739d == null) {
            HashSet hashSet = new HashSet(16);
            this.f45739d = hashSet;
            hashSet.add(this.f45737b);
            this.f45739d.add(this.f45738c);
        }
        return !this.f45739d.add(str);
    }

    public void d() {
        this.f45737b = null;
        this.f45738c = null;
        this.f45739d = null;
    }
}
