package ib;

import java.util.List;

/* renamed from: ib.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3362a {

    /* renamed from: a, reason: collision with root package name */
    private int f34158a;

    /* renamed from: b, reason: collision with root package name */
    private int f34159b;

    /* renamed from: c, reason: collision with root package name */
    private int f34160c;

    /* renamed from: d, reason: collision with root package name */
    private String f34161d;

    /* renamed from: e, reason: collision with root package name */
    private String f34162e;

    /* renamed from: f, reason: collision with root package name */
    private List f34163f;

    /* renamed from: ib.a$a, reason: collision with other inner class name */
    public static class C0506a {

        /* renamed from: a, reason: collision with root package name */
        private final int f34164a;

        /* renamed from: b, reason: collision with root package name */
        private final int f34165b;

        /* renamed from: c, reason: collision with root package name */
        private final int f34166c;

        /* renamed from: d, reason: collision with root package name */
        private final int f34167d;

        public C0506a(int i10, int i11, int i12, int i13) {
            this.f34164a = i10;
            this.f34165b = i11;
            this.f34166c = i12;
            this.f34167d = i13;
        }

        public int a() {
            return this.f34167d;
        }

        public int b() {
            return this.f34166c;
        }

        public int c() {
            return this.f34164a;
        }

        public int d() {
            return this.f34165b;
        }
    }

    public C3362a(int i10, String str, String str2, List list, int i11, int i12) {
        this.f34160c = i10;
        this.f34161d = str;
        this.f34162e = str2;
        this.f34163f = list;
        this.f34159b = i11;
        this.f34158a = i12;
    }

    public C0506a a() {
        if (this.f34163f.isEmpty()) {
            return new C0506a(0, 0, 0, 0);
        }
        int i10 = Integer.MIN_VALUE;
        int i11 = Integer.MAX_VALUE;
        int i12 = Integer.MAX_VALUE;
        int i13 = Integer.MIN_VALUE;
        for (int i14 = 0; i14 < this.f34163f.size(); i14 += 2) {
            int intValue = ((Integer) this.f34163f.get(i14)).intValue();
            int intValue2 = ((Integer) this.f34163f.get(i14 + 1)).intValue();
            i11 = Integer.min(i11, intValue);
            i12 = Integer.min(i12, intValue2);
            i10 = Integer.max(i10, intValue);
            i13 = Integer.max(i13, intValue2);
        }
        return new C0506a(i11, i12, i10 - i11, i13 - i12);
    }

    public List b() {
        return this.f34163f;
    }

    public String c() {
        return this.f34162e;
    }

    public int d() {
        return this.f34159b;
    }

    public int e() {
        return this.f34158a;
    }

    public int f() {
        return this.f34160c;
    }

    public String g() {
        return this.f34161d;
    }

    public void h(List list) {
        this.f34163f = list;
    }

    public void i(int i10) {
        this.f34159b = i10;
    }

    public void j(int i10) {
        this.f34158a = i10;
    }
}
