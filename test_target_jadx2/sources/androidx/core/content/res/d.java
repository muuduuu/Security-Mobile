package androidx.core.content.res;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Base64;
import android.util.Xml;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import s0.AbstractC4305d;

/* loaded from: classes.dex */
public abstract class d {

    static class a {
        static int a(TypedArray typedArray, int i10) {
            return typedArray.getType(i10);
        }
    }

    public interface b {
    }

    public static final class c implements b {

        /* renamed from: a, reason: collision with root package name */
        private final C0264d[] f15873a;

        public c(C0264d[] c0264dArr) {
            this.f15873a = c0264dArr;
        }

        public C0264d[] a() {
            return this.f15873a;
        }
    }

    /* renamed from: androidx.core.content.res.d$d, reason: collision with other inner class name */
    public static final class C0264d {

        /* renamed from: a, reason: collision with root package name */
        private final String f15874a;

        /* renamed from: b, reason: collision with root package name */
        private final int f15875b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f15876c;

        /* renamed from: d, reason: collision with root package name */
        private final String f15877d;

        /* renamed from: e, reason: collision with root package name */
        private final int f15878e;

        /* renamed from: f, reason: collision with root package name */
        private final int f15879f;

        public C0264d(String str, int i10, boolean z10, String str2, int i11, int i12) {
            this.f15874a = str;
            this.f15875b = i10;
            this.f15876c = z10;
            this.f15877d = str2;
            this.f15878e = i11;
            this.f15879f = i12;
        }

        public String a() {
            return this.f15874a;
        }

        public int b() {
            return this.f15879f;
        }

        public int c() {
            return this.f15878e;
        }

        public String d() {
            return this.f15877d;
        }

        public int e() {
            return this.f15875b;
        }

        public boolean f() {
            return this.f15876c;
        }
    }

    public static final class e implements b {

        /* renamed from: a, reason: collision with root package name */
        private final w0.e f15880a;

        /* renamed from: b, reason: collision with root package name */
        private final int f15881b;

        /* renamed from: c, reason: collision with root package name */
        private final int f15882c;

        /* renamed from: d, reason: collision with root package name */
        private final String f15883d;

        public e(w0.e eVar, int i10, int i11, String str) {
            this.f15880a = eVar;
            this.f15882c = i10;
            this.f15881b = i11;
            this.f15883d = str;
        }

        public int a() {
            return this.f15882c;
        }

        public w0.e b() {
            return this.f15880a;
        }

        public String c() {
            return this.f15883d;
        }

        public int d() {
            return this.f15881b;
        }
    }

    private static int a(TypedArray typedArray, int i10) {
        return a.a(typedArray, i10);
    }

    public static b b(XmlPullParser xmlPullParser, Resources resources) {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return d(xmlPullParser, resources);
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static List c(Resources resources, int i10) {
        if (i10 == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i10);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (a(obtainTypedArray, 0) == 1) {
                for (int i11 = 0; i11 < obtainTypedArray.length(); i11++) {
                    int resourceId = obtainTypedArray.getResourceId(i11, 0);
                    if (resourceId != 0) {
                        arrayList.add(h(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(h(resources.getStringArray(i10)));
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    private static b d(XmlPullParser xmlPullParser, Resources resources) {
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return e(xmlPullParser, resources);
        }
        g(xmlPullParser);
        return null;
    }

    private static b e(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), AbstractC4305d.f40741h);
        String string = obtainAttributes.getString(AbstractC4305d.f40742i);
        String string2 = obtainAttributes.getString(AbstractC4305d.f40746m);
        String string3 = obtainAttributes.getString(AbstractC4305d.f40747n);
        int resourceId = obtainAttributes.getResourceId(AbstractC4305d.f40743j, 0);
        int integer = obtainAttributes.getInteger(AbstractC4305d.f40744k, 1);
        int integer2 = obtainAttributes.getInteger(AbstractC4305d.f40745l, 500);
        String string4 = obtainAttributes.getString(AbstractC4305d.f40748o);
        obtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlPullParser.next() != 3) {
                g(xmlPullParser);
            }
            return new e(new w0.e(string, string2, string3, c(resources, resourceId)), integer, integer2, string4);
        }
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("font")) {
                    arrayList.add(f(xmlPullParser, resources));
                } else {
                    g(xmlPullParser);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new c((C0264d[]) arrayList.toArray(new C0264d[0]));
    }

    private static C0264d f(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), AbstractC4305d.f40749p);
        int i10 = obtainAttributes.getInt(obtainAttributes.hasValue(AbstractC4305d.f40758y) ? AbstractC4305d.f40758y : AbstractC4305d.f40751r, 400);
        boolean z10 = 1 == obtainAttributes.getInt(obtainAttributes.hasValue(AbstractC4305d.f40756w) ? AbstractC4305d.f40756w : AbstractC4305d.f40752s, 0);
        int i11 = obtainAttributes.hasValue(AbstractC4305d.f40759z) ? AbstractC4305d.f40759z : AbstractC4305d.f40753t;
        String string = obtainAttributes.getString(obtainAttributes.hasValue(AbstractC4305d.f40757x) ? AbstractC4305d.f40757x : AbstractC4305d.f40754u);
        int i12 = obtainAttributes.getInt(i11, 0);
        int i13 = obtainAttributes.hasValue(AbstractC4305d.f40755v) ? AbstractC4305d.f40755v : AbstractC4305d.f40750q;
        int resourceId = obtainAttributes.getResourceId(i13, 0);
        String string2 = obtainAttributes.getString(i13);
        obtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            g(xmlPullParser);
        }
        return new C0264d(string2, i10, z10, string, i12, resourceId);
    }

    private static void g(XmlPullParser xmlPullParser) {
        int i10 = 1;
        while (i10 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i10++;
            } else if (next == 3) {
                i10--;
            }
        }
    }

    private static List h(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }
}
