package fd;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.AbstractC3574i;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: fd.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3165a {

    /* renamed from: f, reason: collision with root package name */
    public static final C0484a f32988f = new C0484a(null);

    /* renamed from: a, reason: collision with root package name */
    private final int[] f32989a;

    /* renamed from: b, reason: collision with root package name */
    private final int f32990b;

    /* renamed from: c, reason: collision with root package name */
    private final int f32991c;

    /* renamed from: d, reason: collision with root package name */
    private final int f32992d;

    /* renamed from: e, reason: collision with root package name */
    private final List f32993e;

    /* renamed from: fd.a$a, reason: collision with other inner class name */
    public static final class C0484a {
        public /* synthetic */ C0484a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0484a() {
        }
    }

    public AbstractC3165a(int... numbers) {
        List j10;
        Intrinsics.checkNotNullParameter(numbers, "numbers");
        this.f32989a = numbers;
        Integer F10 = AbstractC3574i.F(numbers, 0);
        this.f32990b = F10 != null ? F10.intValue() : -1;
        Integer F11 = AbstractC3574i.F(numbers, 1);
        this.f32991c = F11 != null ? F11.intValue() : -1;
        Integer F12 = AbstractC3574i.F(numbers, 2);
        this.f32992d = F12 != null ? F12.intValue() : -1;
        if (numbers.length <= 3) {
            j10 = CollectionsKt.j();
        } else {
            if (numbers.length > 1024) {
                throw new IllegalArgumentException("BinaryVersion with length more than 1024 are not supported. Provided length " + numbers.length + '.');
            }
            j10 = CollectionsKt.O0(AbstractC3574i.c(numbers).subList(3, numbers.length));
        }
        this.f32993e = j10;
    }

    public final int a() {
        return this.f32990b;
    }

    public final int b() {
        return this.f32991c;
    }

    public final boolean c(int i10, int i11, int i12) {
        int i13 = this.f32990b;
        if (i13 > i10) {
            return true;
        }
        if (i13 < i10) {
            return false;
        }
        int i14 = this.f32991c;
        if (i14 > i11) {
            return true;
        }
        return i14 >= i11 && this.f32992d >= i12;
    }

    public final boolean d(AbstractC3165a version) {
        Intrinsics.checkNotNullParameter(version, "version");
        return c(version.f32990b, version.f32991c, version.f32992d);
    }

    public final boolean e(int i10, int i11, int i12) {
        int i13 = this.f32990b;
        if (i13 < i10) {
            return true;
        }
        if (i13 > i10) {
            return false;
        }
        int i14 = this.f32991c;
        if (i14 < i11) {
            return true;
        }
        return i14 <= i11 && this.f32992d <= i12;
    }

    public boolean equals(Object obj) {
        if (obj != null && Intrinsics.b(getClass(), obj.getClass())) {
            AbstractC3165a abstractC3165a = (AbstractC3165a) obj;
            if (this.f32990b == abstractC3165a.f32990b && this.f32991c == abstractC3165a.f32991c && this.f32992d == abstractC3165a.f32992d && Intrinsics.b(this.f32993e, abstractC3165a.f32993e)) {
                return true;
            }
        }
        return false;
    }

    protected final boolean f(AbstractC3165a ourVersion) {
        Intrinsics.checkNotNullParameter(ourVersion, "ourVersion");
        int i10 = this.f32990b;
        if (i10 == 0) {
            if (ourVersion.f32990b != 0 || this.f32991c != ourVersion.f32991c) {
                return false;
            }
        } else if (i10 != ourVersion.f32990b || this.f32991c > ourVersion.f32991c) {
            return false;
        }
        return true;
    }

    public final int[] g() {
        return this.f32989a;
    }

    public int hashCode() {
        int i10 = this.f32990b;
        int i11 = i10 + (i10 * 31) + this.f32991c;
        int i12 = i11 + (i11 * 31) + this.f32992d;
        return i12 + (i12 * 31) + this.f32993e.hashCode();
    }

    public String toString() {
        int[] g10 = g();
        ArrayList arrayList = new ArrayList();
        for (int i10 : g10) {
            if (i10 == -1) {
                break;
            }
            arrayList.add(Integer.valueOf(i10));
        }
        return arrayList.isEmpty() ? "unknown" : CollectionsKt.l0(arrayList, ".", null, null, 0, null, null, 62, null);
    }
}
