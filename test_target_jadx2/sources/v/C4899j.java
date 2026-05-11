package v;

import android.hardware.camera2.params.InputConfiguration;
import android.os.Build;
import java.util.Objects;

/* renamed from: v.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4899j {

    /* renamed from: a, reason: collision with root package name */
    private final c f43789a;

    /* renamed from: v.j$a */
    private static class a implements c {

        /* renamed from: a, reason: collision with root package name */
        private final InputConfiguration f43790a;

        a(Object obj) {
            this.f43790a = (InputConfiguration) obj;
        }

        @Override // v.C4899j.c
        public Object a() {
            return this.f43790a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof c) {
                return Objects.equals(this.f43790a, ((c) obj).a());
            }
            return false;
        }

        public int hashCode() {
            return this.f43790a.hashCode();
        }

        public String toString() {
            return this.f43790a.toString();
        }
    }

    /* renamed from: v.j$b */
    private static final class b extends a {
        b(Object obj) {
            super(obj);
        }
    }

    /* renamed from: v.j$c */
    private interface c {
        Object a();
    }

    private C4899j(c cVar) {
        this.f43789a = cVar;
    }

    public static C4899j b(Object obj) {
        if (obj == null) {
            return null;
        }
        return Build.VERSION.SDK_INT >= 31 ? new C4899j(new b(obj)) : new C4899j(new a(obj));
    }

    public Object a() {
        return this.f43789a.a();
    }

    public boolean equals(Object obj) {
        if (obj instanceof C4899j) {
            return this.f43789a.equals(((C4899j) obj).f43789a);
        }
        return false;
    }

    public int hashCode() {
        return this.f43789a.hashCode();
    }

    public String toString() {
        return this.f43789a.toString();
    }
}
