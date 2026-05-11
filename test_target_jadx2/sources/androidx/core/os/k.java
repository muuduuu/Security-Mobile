package androidx.core.os;

import android.os.LocaleList;
import java.util.Locale;

/* loaded from: classes.dex */
final class k implements j {

    /* renamed from: a, reason: collision with root package name */
    private final LocaleList f15976a;

    k(Object obj) {
        this.f15976a = (LocaleList) obj;
    }

    @Override // androidx.core.os.j
    public String a() {
        return this.f15976a.toLanguageTags();
    }

    @Override // androidx.core.os.j
    public Object b() {
        return this.f15976a;
    }

    public boolean equals(Object obj) {
        return this.f15976a.equals(((j) obj).b());
    }

    @Override // androidx.core.os.j
    public Locale get(int i10) {
        return this.f15976a.get(i10);
    }

    public int hashCode() {
        return this.f15976a.hashCode();
    }

    @Override // androidx.core.os.j
    public boolean isEmpty() {
        return this.f15976a.isEmpty();
    }

    @Override // androidx.core.os.j
    public int size() {
        return this.f15976a.size();
    }

    public String toString() {
        return this.f15976a.toString();
    }
}
