package com.webengage.sdk.android;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import org.conscrypt.BuildConfig;

/* loaded from: classes2.dex */
public class l0 {

    /* renamed from: e, reason: collision with root package name */
    private static volatile l0 f30694e;

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, d2> f30695a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, y0> f30696b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, i4> f30697c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private f0 f30698d = new g0();

    class a extends d2 {
        a(String str, int i10) {
            super(str, i10);
        }

        @Override // com.webengage.sdk.android.d2
        public Object a(Object obj, Object obj2) {
            return Boolean.valueOf(!((Boolean) l0.a().b("==").a(obj, obj2)).booleanValue());
        }
    }

    class b extends d2 {
        b(String str, int i10) {
            super(str, i10);
        }

        @Override // com.webengage.sdk.android.d2
        public Object a(Object obj, Object obj2) {
            if (obj == null && obj2 == null) {
                return null;
            }
            if (obj == null) {
                if (obj2 instanceof String) {
                    return obj2.toString();
                }
                return null;
            }
            if (obj2 == null) {
                if (obj instanceof String) {
                    return obj.toString();
                }
                return null;
            }
            if ((obj instanceof Number) && (obj2 instanceof Number)) {
                return Double.valueOf(((Number) obj).doubleValue() + ((Number) obj2).doubleValue());
            }
            return obj.toString() + obj2.toString();
        }
    }

    class c extends d2 {
        c(String str, int i10) {
            super(str, i10);
        }

        @Override // com.webengage.sdk.android.d2
        public Object a(Object obj, Object obj2) {
            if (obj == null || obj2 == null) {
                return null;
            }
            return Double.valueOf(((Number) obj).doubleValue() - ((Number) obj2).doubleValue());
        }
    }

    class d extends d2 {
        d(String str, int i10) {
            super(str, i10);
        }

        @Override // com.webengage.sdk.android.d2
        public Object a(Object obj, Object obj2) {
            if (obj == null || obj2 == null) {
                return null;
            }
            return Double.valueOf(((Number) obj).doubleValue() * ((Number) obj2).doubleValue());
        }
    }

    class e extends d2 {
        e(String str, int i10) {
            super(str, i10);
        }

        @Override // com.webengage.sdk.android.d2
        public Object a(Object obj, Object obj2) {
            if (obj == null || obj2 == null) {
                return null;
            }
            return Double.valueOf(((Number) obj).doubleValue() / ((Number) obj2).doubleValue());
        }
    }

    class f extends d2 {
        f(String str, int i10) {
            super(str, i10);
        }

        @Override // com.webengage.sdk.android.d2
        public Object a(Object obj, Object obj2) {
            if (obj == null || obj2 == null) {
                return null;
            }
            return Double.valueOf(Math.pow(((Number) obj).doubleValue(), ((Number) obj2).doubleValue()));
        }
    }

    class g extends y0 {
        g(String str) {
            super(str);
        }

        @Override // com.webengage.sdk.android.y0
        public Object a(List<Object> list) {
            return (list.size() == 0 || list.get(0) == null) ? Boolean.FALSE : Boolean.valueOf(!((Boolean) list.get(0)).booleanValue());
        }
    }

    class h extends d2 {
        h(String str, int i10) {
            super(str, i10);
        }

        @Override // com.webengage.sdk.android.d2
        public Object a(Object obj, Object obj2) {
            ArrayList arrayList = new ArrayList();
            if (obj instanceof Collection) {
                arrayList.addAll((Collection) obj);
            } else {
                arrayList.add(obj);
            }
            if (obj2 instanceof Collection) {
                arrayList.addAll((Collection) obj2);
            } else {
                arrayList.add(obj2);
            }
            return arrayList;
        }
    }

    class i extends d2 {
        i(String str, int i10) {
            super(str, i10);
        }

        @Override // com.webengage.sdk.android.d2
        public Object a(Object obj, Object obj2) {
            if (obj == null || obj2 == null) {
                return Boolean.FALSE;
            }
            return Boolean.valueOf(Double.compare(((Number) obj).doubleValue(), ((Number) obj2).doubleValue()) >= 0);
        }
    }

    class j extends d2 {
        j(String str, int i10) {
            super(str, i10);
        }

        @Override // com.webengage.sdk.android.d2
        public Object a(Object obj, Object obj2) {
            if (obj == null || obj2 == null) {
                return Boolean.FALSE;
            }
            return Boolean.valueOf(Double.compare(((Number) obj).doubleValue(), ((Number) obj2).doubleValue()) <= 0);
        }
    }

    class k extends d2 {
        k(String str, int i10) {
            super(str, i10);
        }

        @Override // com.webengage.sdk.android.d2
        public Object a(Object obj, Object obj2) {
            if (obj == null || obj2 == null) {
                return Boolean.FALSE;
            }
            return Boolean.valueOf(Double.compare(((Number) obj).doubleValue(), ((Number) obj2).doubleValue()) > 0);
        }
    }

    class l extends d2 {
        l(String str, int i10) {
            super(str, i10);
        }

        @Override // com.webengage.sdk.android.d2
        public Object a(Object obj, Object obj2) {
            if (obj == null || obj2 == null) {
                return Boolean.FALSE;
            }
            return Boolean.valueOf(Double.compare(((Number) obj).doubleValue(), ((Number) obj2).doubleValue()) < 0);
        }
    }

    class m extends d2 {
        m(String str, int i10) {
            super(str, i10);
        }

        @Override // com.webengage.sdk.android.d2
        public Object a(Object obj, Object obj2) {
            if (obj == null || obj2 == null) {
                return Boolean.FALSE;
            }
            if (obj.getClass().getSimpleName().equalsIgnoreCase(obj2.getClass().getSimpleName())) {
                return Boolean.valueOf(((Boolean) obj).booleanValue() && ((Boolean) obj2).booleanValue());
            }
            return Boolean.FALSE;
        }
    }

    class n extends d2 {
        n(String str, int i10) {
            super(str, i10);
        }

        @Override // com.webengage.sdk.android.d2
        public Object a(Object obj, Object obj2) {
            if (obj == null || obj2 == null) {
                return Boolean.FALSE;
            }
            if (obj.getClass().getSimpleName().equalsIgnoreCase(obj2.getClass().getSimpleName())) {
                return Boolean.valueOf(((Boolean) obj).booleanValue() || ((Boolean) obj2).booleanValue());
            }
            return Boolean.FALSE;
        }
    }

    class o extends d2 {
        o(String str, int i10) {
            super(str, i10);
        }

        @Override // com.webengage.sdk.android.d2
        public Object a(Object obj, Object obj2) {
            if (obj == null && obj2 == null) {
                return Boolean.TRUE;
            }
            if (obj == null || obj2 == null) {
                return Boolean.FALSE;
            }
            if ((obj instanceof Number) && (obj2 instanceof Number)) {
                return Boolean.valueOf(Double.compare(((Number) obj).doubleValue(), ((Number) obj2).doubleValue()) == 0);
            }
            return !obj.getClass().getSimpleName().equals(obj2.getClass().getSimpleName()) ? Boolean.FALSE : Boolean.valueOf(obj.toString().equals(obj2.toString()));
        }
    }

    private l0() {
        b();
    }

    public static l0 a() {
        if (f30694e == null) {
            synchronized (l0.class) {
                try {
                    if (f30694e == null) {
                        f30694e = new l0();
                    }
                } finally {
                }
            }
        }
        return f30694e;
    }

    public d2 b(String str) {
        d2 d2Var;
        synchronized (this.f30695a) {
            d2Var = this.f30695a.get(str);
        }
        return d2Var;
    }

    public boolean c(String str) {
        boolean containsKey;
        synchronized (this.f30696b) {
            containsKey = this.f30696b.containsKey(str);
        }
        return containsKey;
    }

    public boolean d(String str) {
        boolean containsKey;
        synchronized (this.f30695a) {
            containsKey = this.f30695a.containsKey(str);
        }
        return containsKey;
    }

    public boolean e(String str) {
        return a().d(str) || a().c(str) || a().f(str) || str.equals("[") || str.equals("]") || str.equals("(") || str.equals(")");
    }

    public boolean f(String str) {
        boolean containsKey;
        synchronized (this.f30697c) {
            containsKey = this.f30697c.containsKey(str);
        }
        return containsKey;
    }

    public String g(String str) {
        String str2 = BuildConfig.FLAVOR;
        int i10 = 0;
        for (int i11 = 0; i11 < str.length(); i11++) {
            char charAt = str.charAt(i11);
            if (charAt == '\\') {
                i10++;
            } else {
                i10 >>= 1;
                while (i10 != 0) {
                    str2 = str2 + "\\";
                    i10--;
                }
                str2 = str2 + charAt;
            }
        }
        for (int i12 = i10 >> 1; i12 != 0; i12--) {
            str2 = str2 + "\\";
        }
        return str2;
    }

    private void b() {
        a(new g("!"));
        a(new h(",", Integer.MIN_VALUE));
        a(new i(">=", 100));
        a(new j("<=", 100));
        a(new k(">", 100));
        a(new l("<", 100));
        a(new m("&&", 10));
        a(new n("||", 9));
        a(new o("==", 100));
        a(new a("!=", 100));
        a(new b("+", 101));
        a(new c("-", 101));
        a(new d("*", 102));
        a(new e("/", 102));
        a(new f("^", 103));
    }

    public y0 a(String str) {
        y0 y0Var;
        synchronized (this.f30696b) {
            y0Var = this.f30696b.get(str);
        }
        return y0Var;
    }

    protected Object a(List<String> list, boolean z10) {
        Object a10;
        if (list == null) {
            return null;
        }
        Stack stack = new Stack();
        for (String str : list) {
            if (!str.equalsIgnoreCase(" ") && !str.isEmpty()) {
                if (f(str)) {
                    a10 = this.f30697c.get(str).a();
                } else if (d(str)) {
                    Object pop = stack.pop();
                    a10 = this.f30695a.get(str).a(stack.pop(), pop);
                } else if (c(str)) {
                    Object pop2 = stack.pop();
                    if (pop2 instanceof List) {
                        a10 = this.f30696b.get(str).a((List) pop2);
                    } else {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(pop2);
                        a10 = this.f30696b.get(str).a(arrayList);
                    }
                } else {
                    f0 f0Var = this.f30698d;
                    if (z10) {
                        str = g(str);
                    }
                    a10 = f0Var.a(str);
                }
                stack.push(a10);
            }
        }
        return stack.pop();
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00a7  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x009a -> B:35:0x0079). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected List<String> a(String str, boolean z10) {
        String str2;
        if (str == null || str.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        j1 j1Var = new j1(str, z10);
        ArrayDeque arrayDeque = new ArrayDeque();
        String str3 = BuildConfig.FLAVOR;
        while (j1Var.hasNext()) {
            String next = j1Var.next();
            if (!next.isEmpty()) {
                if (d(next) || c(next)) {
                    while (!arrayDeque.isEmpty() && a(next, (String) arrayDeque.peek())) {
                        arrayList.add((String) arrayDeque.pop());
                    }
                } else if (!next.equalsIgnoreCase("(") && !next.equalsIgnoreCase("[")) {
                    if (next.equalsIgnoreCase(")") || next.equalsIgnoreCase("]")) {
                        if (str3.equalsIgnoreCase("(") || str3.equalsIgnoreCase("[")) {
                            str2 = "null";
                            arrayList.add(str2);
                        }
                        if (!arrayDeque.isEmpty() || ((String) arrayDeque.peek()).equalsIgnoreCase("(") || ((String) arrayDeque.peek()).equalsIgnoreCase("[")) {
                            if (!arrayDeque.isEmpty()) {
                                arrayDeque.pop();
                            }
                            if (!arrayDeque.isEmpty() && c((String) arrayDeque.peek())) {
                                arrayList.add((String) arrayDeque.pop());
                            }
                            str3 = next;
                        } else {
                            str2 = (String) arrayDeque.pop();
                            arrayList.add(str2);
                            if (arrayDeque.isEmpty()) {
                            }
                            if (!arrayDeque.isEmpty()) {
                            }
                            if (!arrayDeque.isEmpty()) {
                                arrayList.add((String) arrayDeque.pop());
                            }
                            str3 = next;
                        }
                    } else {
                        str3 = next.trim();
                        if (!str3.isEmpty()) {
                            arrayList.add(str3);
                        }
                    }
                }
                arrayDeque.push(next);
                str3 = next;
            }
        }
        while (!arrayDeque.isEmpty()) {
            arrayList.add((String) arrayDeque.pop());
        }
        return arrayList;
    }

    public void a(d2 d2Var) {
        synchronized (this.f30695a) {
            this.f30695a.put(d2Var.a(), d2Var);
        }
    }

    public void a(y0 y0Var) {
        synchronized (this.f30696b) {
            this.f30696b.put(y0Var.a(), y0Var);
        }
    }

    public boolean a(String str, String str2) {
        if (!d(str)) {
            return false;
        }
        if (!d(str2)) {
            return c(str2);
        }
        d2 d2Var = this.f30695a.get(str2);
        d2 d2Var2 = this.f30695a.get(str);
        return d2Var.b() == d2Var2.b() ? d2Var2.c() : d2Var2.b() < d2Var.b();
    }
}
