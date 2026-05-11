package C5;

import java.util.ArrayList;
import java.util.Arrays;
import org.conscrypt.BuildConfig;

/* loaded from: classes2.dex */
public final class j {

    /* renamed from: l, reason: collision with root package name */
    static final char[] f915l = new char[0];

    /* renamed from: a, reason: collision with root package name */
    private final a f916a;

    /* renamed from: b, reason: collision with root package name */
    private char[] f917b;

    /* renamed from: c, reason: collision with root package name */
    private int f918c;

    /* renamed from: d, reason: collision with root package name */
    private int f919d;

    /* renamed from: e, reason: collision with root package name */
    private ArrayList f920e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f921f;

    /* renamed from: g, reason: collision with root package name */
    private int f922g;

    /* renamed from: h, reason: collision with root package name */
    private char[] f923h;

    /* renamed from: i, reason: collision with root package name */
    private int f924i;

    /* renamed from: j, reason: collision with root package name */
    private String f925j;

    /* renamed from: k, reason: collision with root package name */
    private char[] f926k;

    public j(a aVar) {
        this.f916a = aVar;
    }

    private char[] d(int i10) {
        a aVar = this.f916a;
        return aVar != null ? aVar.d(2, i10) : new char[Math.max(i10, 500)];
    }

    private char[] e(int i10) {
        return new char[i10];
    }

    private void f() {
        this.f921f = false;
        this.f920e.clear();
        this.f922g = 0;
        this.f924i = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002a, code lost:
    
        if (r3 > 65536) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void i(int i10) {
        if (this.f920e == null) {
            this.f920e = new ArrayList();
        }
        char[] cArr = this.f923h;
        this.f921f = true;
        this.f920e.add(cArr);
        this.f922g += cArr.length;
        this.f924i = 0;
        int length = cArr.length;
        int i11 = length + (length >> 1);
        int i12 = i11 >= 500 ? 65536 : 500;
        i11 = i12;
        this.f923h = e(i11);
    }

    public static j k(char[] cArr) {
        return new j(null, cArr);
    }

    private char[] m() {
        int i10;
        String str = this.f925j;
        if (str != null) {
            return str.toCharArray();
        }
        int i11 = this.f918c;
        if (i11 >= 0) {
            int i12 = this.f919d;
            return i12 < 1 ? f915l : i11 == 0 ? Arrays.copyOf(this.f917b, i12) : Arrays.copyOfRange(this.f917b, i11, i12 + i11);
        }
        int o10 = o();
        if (o10 < 1) {
            return f915l;
        }
        char[] e10 = e(o10);
        ArrayList arrayList = this.f920e;
        if (arrayList != null) {
            int size = arrayList.size();
            i10 = 0;
            for (int i13 = 0; i13 < size; i13++) {
                char[] cArr = (char[]) this.f920e.get(i13);
                int length = cArr.length;
                System.arraycopy(cArr, 0, e10, i10, length);
                i10 += length;
            }
        } else {
            i10 = 0;
        }
        System.arraycopy(this.f923h, 0, e10, i10, this.f924i);
        return e10;
    }

    private void p(int i10) {
        int i11 = this.f919d;
        this.f919d = 0;
        char[] cArr = this.f917b;
        this.f917b = null;
        int i12 = this.f918c;
        this.f918c = -1;
        int i13 = i10 + i11;
        char[] cArr2 = this.f923h;
        if (cArr2 == null || i13 > cArr2.length) {
            this.f923h = d(i13);
        }
        if (i11 > 0) {
            System.arraycopy(cArr, i12, this.f923h, 0, i11);
        }
        this.f922g = 0;
        this.f924i = i11;
    }

    public void a(char c10) {
        if (this.f918c >= 0) {
            p(16);
        }
        this.f925j = null;
        this.f926k = null;
        char[] cArr = this.f923h;
        if (this.f924i >= cArr.length) {
            i(1);
            cArr = this.f923h;
        }
        int i10 = this.f924i;
        this.f924i = i10 + 1;
        cArr[i10] = c10;
    }

    public void b(String str, int i10, int i11) {
        if (this.f918c >= 0) {
            p(i11);
        }
        this.f925j = null;
        this.f926k = null;
        char[] cArr = this.f923h;
        int length = cArr.length;
        int i12 = this.f924i;
        int i13 = length - i12;
        if (i13 >= i11) {
            str.getChars(i10, i10 + i11, cArr, i12);
            this.f924i += i11;
            return;
        }
        if (i13 > 0) {
            int i14 = i10 + i13;
            str.getChars(i10, i14, cArr, i12);
            i11 -= i13;
            i10 = i14;
        }
        while (true) {
            i(i11);
            int min = Math.min(this.f923h.length, i11);
            int i15 = i10 + min;
            str.getChars(i10, i15, this.f923h, 0);
            this.f924i += min;
            i11 -= min;
            if (i11 <= 0) {
                return;
            } else {
                i10 = i15;
            }
        }
    }

    public void c(char[] cArr, int i10, int i11) {
        if (this.f918c >= 0) {
            p(i11);
        }
        this.f925j = null;
        this.f926k = null;
        char[] cArr2 = this.f923h;
        int length = cArr2.length;
        int i12 = this.f924i;
        int i13 = length - i12;
        if (i13 >= i11) {
            System.arraycopy(cArr, i10, cArr2, i12, i11);
            this.f924i += i11;
            return;
        }
        if (i13 > 0) {
            System.arraycopy(cArr, i10, cArr2, i12, i13);
            i10 += i13;
            i11 -= i13;
        }
        do {
            i(i11);
            int min = Math.min(this.f923h.length, i11);
            System.arraycopy(cArr, i10, this.f923h, 0, min);
            this.f924i += min;
            i10 += min;
            i11 -= min;
        } while (i11 > 0);
    }

    public char[] g() {
        char[] cArr = this.f926k;
        if (cArr != null) {
            return cArr;
        }
        char[] m10 = m();
        this.f926k = m10;
        return m10;
    }

    public String h() {
        if (this.f925j == null) {
            char[] cArr = this.f926k;
            if (cArr != null) {
                this.f925j = new String(cArr);
            } else {
                int i10 = this.f918c;
                String str = BuildConfig.FLAVOR;
                if (i10 >= 0) {
                    int i11 = this.f919d;
                    if (i11 < 1) {
                        this.f925j = BuildConfig.FLAVOR;
                        return BuildConfig.FLAVOR;
                    }
                    this.f925j = new String(this.f917b, i10, i11);
                } else {
                    int i12 = this.f922g;
                    int i13 = this.f924i;
                    if (i12 == 0) {
                        if (i13 != 0) {
                            str = new String(this.f923h, 0, i13);
                        }
                        this.f925j = str;
                    } else {
                        StringBuilder sb2 = new StringBuilder(i12 + i13);
                        ArrayList arrayList = this.f920e;
                        if (arrayList != null) {
                            int size = arrayList.size();
                            for (int i14 = 0; i14 < size; i14++) {
                                char[] cArr2 = (char[]) this.f920e.get(i14);
                                sb2.append(cArr2, 0, cArr2.length);
                            }
                        }
                        sb2.append(this.f923h, 0, this.f924i);
                        this.f925j = sb2.toString();
                    }
                }
            }
        }
        return this.f925j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
    
        if (r0 > 65536) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public char[] j() {
        if (this.f920e == null) {
            this.f920e = new ArrayList();
        }
        this.f921f = true;
        this.f920e.add(this.f923h);
        int length = this.f923h.length;
        this.f922g += length;
        this.f924i = 0;
        int i10 = length + (length >> 1);
        int i11 = i10 >= 500 ? 65536 : 500;
        i10 = i11;
        char[] e10 = e(i10);
        this.f923h = e10;
        return e10;
    }

    public void l() {
        char[] cArr;
        this.f918c = -1;
        this.f924i = 0;
        this.f919d = 0;
        this.f917b = null;
        this.f926k = null;
        if (this.f921f) {
            f();
        }
        a aVar = this.f916a;
        if (aVar == null || (cArr = this.f923h) == null) {
            return;
        }
        this.f923h = null;
        aVar.j(2, cArr);
    }

    public void n(int i10) {
        this.f924i = i10;
    }

    public int o() {
        if (this.f918c >= 0) {
            return this.f919d;
        }
        char[] cArr = this.f926k;
        if (cArr != null) {
            return cArr.length;
        }
        String str = this.f925j;
        return str != null ? str.length() : this.f922g + this.f924i;
    }

    public String toString() {
        return h();
    }

    protected j(a aVar, char[] cArr) {
        this.f916a = aVar;
        this.f923h = cArr;
        this.f924i = cArr.length;
        this.f918c = -1;
    }
}
