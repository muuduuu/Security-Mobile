package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f15064a;

    /* renamed from: b, reason: collision with root package name */
    d f15065b;

    /* renamed from: c, reason: collision with root package name */
    int f15066c = -1;

    /* renamed from: d, reason: collision with root package name */
    int f15067d = -1;

    /* renamed from: e, reason: collision with root package name */
    private SparseArray f15068e = new SparseArray();

    /* renamed from: f, reason: collision with root package name */
    private SparseArray f15069f = new SparseArray();

    static class a {

        /* renamed from: a, reason: collision with root package name */
        int f15070a;

        /* renamed from: b, reason: collision with root package name */
        ArrayList f15071b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        int f15072c;

        /* renamed from: d, reason: collision with root package name */
        d f15073d;

        public a(Context context, XmlPullParser xmlPullParser) {
            this.f15072c = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), g.f15252E6);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == g.f15260F6) {
                    this.f15070a = obtainStyledAttributes.getResourceId(index, this.f15070a);
                } else if (index == g.f15268G6) {
                    this.f15072c = obtainStyledAttributes.getResourceId(index, this.f15072c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f15072c);
                    context.getResources().getResourceName(this.f15072c);
                    if ("layout".equals(resourceTypeName)) {
                        d dVar = new d();
                        this.f15073d = dVar;
                        dVar.f(context, this.f15072c);
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }

        void a(b bVar) {
            this.f15071b.add(bVar);
        }

        public int b(float f10, float f11) {
            for (int i10 = 0; i10 < this.f15071b.size(); i10++) {
                if (((b) this.f15071b.get(i10)).a(f10, f11)) {
                    return i10;
                }
            }
            return -1;
        }
    }

    static class b {

        /* renamed from: a, reason: collision with root package name */
        float f15074a;

        /* renamed from: b, reason: collision with root package name */
        float f15075b;

        /* renamed from: c, reason: collision with root package name */
        float f15076c;

        /* renamed from: d, reason: collision with root package name */
        float f15077d;

        /* renamed from: e, reason: collision with root package name */
        int f15078e;

        /* renamed from: f, reason: collision with root package name */
        d f15079f;

        public b(Context context, XmlPullParser xmlPullParser) {
            this.f15074a = Float.NaN;
            this.f15075b = Float.NaN;
            this.f15076c = Float.NaN;
            this.f15077d = Float.NaN;
            this.f15078e = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), g.f15447c7);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == g.f15456d7) {
                    this.f15078e = obtainStyledAttributes.getResourceId(index, this.f15078e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f15078e);
                    context.getResources().getResourceName(this.f15078e);
                    if ("layout".equals(resourceTypeName)) {
                        d dVar = new d();
                        this.f15079f = dVar;
                        dVar.f(context, this.f15078e);
                    }
                } else if (index == g.f15465e7) {
                    this.f15077d = obtainStyledAttributes.getDimension(index, this.f15077d);
                } else if (index == g.f15474f7) {
                    this.f15075b = obtainStyledAttributes.getDimension(index, this.f15075b);
                } else if (index == g.f15483g7) {
                    this.f15076c = obtainStyledAttributes.getDimension(index, this.f15076c);
                } else if (index == g.f15492h7) {
                    this.f15074a = obtainStyledAttributes.getDimension(index, this.f15074a);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            obtainStyledAttributes.recycle();
        }

        boolean a(float f10, float f11) {
            if (!Float.isNaN(this.f15074a) && f10 < this.f15074a) {
                return false;
            }
            if (!Float.isNaN(this.f15075b) && f11 < this.f15075b) {
                return false;
            }
            if (Float.isNaN(this.f15076c) || f10 <= this.f15076c) {
                return Float.isNaN(this.f15077d) || f11 <= this.f15077d;
            }
            return false;
        }
    }

    c(Context context, ConstraintLayout constraintLayout, int i10) {
        this.f15064a = constraintLayout;
        a(context, i10);
    }

    private void a(Context context, int i10) {
        XmlResourceParser xml = context.getResources().getXml(i10);
        try {
            int eventType = xml.getEventType();
            a aVar = null;
            while (true) {
                char c10 = 1;
                if (eventType == 1) {
                    return;
                }
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                c10 = 4;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                c10 = 2;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 1382829617:
                            if (name.equals("StateSet")) {
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 1657696882:
                            if (name.equals("layoutDescription")) {
                                c10 = 0;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                c10 = 3;
                                break;
                            }
                            c10 = 65535;
                            break;
                        default:
                            c10 = 65535;
                            break;
                    }
                    if (c10 == 2) {
                        aVar = new a(context, xml);
                        this.f15068e.put(aVar.f15070a, aVar);
                    } else if (c10 == 3) {
                        b bVar = new b(context, xml);
                        if (aVar != null) {
                            aVar.a(bVar);
                        }
                    } else if (c10 == 4) {
                        b(context, xml);
                    }
                }
                eventType = xml.next();
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        } catch (XmlPullParserException e11) {
            e11.printStackTrace();
        }
    }

    private void b(Context context, XmlPullParser xmlPullParser) {
        d dVar = new d();
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            String attributeName = xmlPullParser.getAttributeName(i10);
            String attributeValue = xmlPullParser.getAttributeValue(i10);
            if (attributeName != null && attributeValue != null && "id".equals(attributeName)) {
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1) {
                    if (attributeValue.length() > 1) {
                        identifier = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                dVar.o(context, xmlPullParser);
                this.f15069f.put(identifier, dVar);
                return;
            }
        }
    }

    public void c(e eVar) {
    }

    public void d(int i10, float f10, float f11) {
        int b10;
        int i11 = this.f15066c;
        if (i11 == i10) {
            a aVar = i10 == -1 ? (a) this.f15068e.valueAt(0) : (a) this.f15068e.get(i11);
            int i12 = this.f15067d;
            if ((i12 == -1 || !((b) aVar.f15071b.get(i12)).a(f10, f11)) && this.f15067d != (b10 = aVar.b(f10, f11))) {
                d dVar = b10 == -1 ? this.f15065b : ((b) aVar.f15071b.get(b10)).f15079f;
                if (b10 != -1) {
                    int i13 = ((b) aVar.f15071b.get(b10)).f15078e;
                }
                if (dVar == null) {
                    return;
                }
                this.f15067d = b10;
                dVar.c(this.f15064a);
                return;
            }
            return;
        }
        this.f15066c = i10;
        a aVar2 = (a) this.f15068e.get(i10);
        int b11 = aVar2.b(f10, f11);
        d dVar2 = b11 == -1 ? aVar2.f15073d : ((b) aVar2.f15071b.get(b11)).f15079f;
        if (b11 != -1) {
            int i14 = ((b) aVar2.f15071b.get(b11)).f15078e;
        }
        if (dVar2 != null) {
            this.f15067d = b11;
            dVar2.c(this.f15064a);
            return;
        }
        Log.v("ConstraintLayoutStates", "NO Constraint set found ! id=" + i10 + ", dim =" + f10 + ", " + f11);
    }
}
