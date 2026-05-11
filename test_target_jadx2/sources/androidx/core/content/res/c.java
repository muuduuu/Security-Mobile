package androidx.core.content.res;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import s0.AbstractC4302a;
import s0.AbstractC4305d;
import u0.AbstractC4860a;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    private static final ThreadLocal f15872a = new ThreadLocal();

    public static ColorStateList a(Resources resources, XmlPullParser xmlPullParser, Resources.Theme theme) {
        int next;
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return b(resources, xmlPullParser, asAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static ColorStateList b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        String name = xmlPullParser.getName();
        if (name.equals("selector")) {
            return d(resources, xmlPullParser, attributeSet, theme);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
    }

    private static TypedValue c() {
        ThreadLocal threadLocal = f15872a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    private static ColorStateList d(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int depth;
        int color;
        Resources resources2 = resources;
        int i10 = 1;
        int depth2 = xmlPullParser.getDepth() + 1;
        int[][] iArr = new int[20][];
        int[] iArr2 = new int[20];
        int i11 = 0;
        while (true) {
            int next = xmlPullParser.next();
            if (next == i10 || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                TypedArray g10 = g(resources2, theme, attributeSet, AbstractC4305d.f40735b);
                int resourceId = g10.getResourceId(AbstractC4305d.f40736c, -1);
                if (resourceId == -1 || e(resources2, resourceId)) {
                    color = g10.getColor(AbstractC4305d.f40736c, -65281);
                } else {
                    try {
                        color = a(resources2, resources2.getXml(resourceId), theme).getDefaultColor();
                    } catch (Exception unused) {
                        color = g10.getColor(AbstractC4305d.f40736c, -65281);
                    }
                }
                float f10 = 1.0f;
                if (g10.hasValue(AbstractC4305d.f40737d)) {
                    f10 = g10.getFloat(AbstractC4305d.f40737d, 1.0f);
                } else if (g10.hasValue(AbstractC4305d.f40739f)) {
                    f10 = g10.getFloat(AbstractC4305d.f40739f, 1.0f);
                }
                float f11 = (Build.VERSION.SDK_INT < 31 || !g10.hasValue(AbstractC4305d.f40738e)) ? g10.getFloat(AbstractC4305d.f40740g, -1.0f) : g10.getFloat(AbstractC4305d.f40738e, -1.0f);
                g10.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr3 = new int[attributeCount];
                int i12 = 0;
                for (int i13 = 0; i13 < attributeCount; i13++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i13);
                    if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != AbstractC4302a.f40682a && attributeNameResource != AbstractC4302a.f40683b) {
                        int i14 = i12 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i13, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr3[i12] = attributeNameResource;
                        i12 = i14;
                    }
                }
                int[] trimStateSet = StateSet.trimStateSet(iArr3, i12);
                iArr2 = e.a(iArr2, i11, f(color, f10, f11));
                iArr = (int[][]) e.b(iArr, i11, trimStateSet);
                i11++;
            }
            i10 = 1;
            resources2 = resources;
        }
        int[] iArr4 = new int[i11];
        int[][] iArr5 = new int[i11][];
        System.arraycopy(iArr2, 0, iArr4, 0, i11);
        System.arraycopy(iArr, 0, iArr5, 0, i11);
        return new ColorStateList(iArr5, iArr4);
    }

    private static boolean e(Resources resources, int i10) {
        TypedValue c10 = c();
        resources.getValue(i10, c10, true);
        int i11 = c10.type;
        return i11 >= 28 && i11 <= 31;
    }

    private static int f(int i10, float f10, float f11) {
        boolean z10 = f11 >= 0.0f && f11 <= 100.0f;
        if (f10 == 1.0f && !z10) {
            return i10;
        }
        int b10 = AbstractC4860a.b((int) ((Color.alpha(i10) * f10) + 0.5f), 0, 255);
        if (z10) {
            a c10 = a.c(i10);
            i10 = a.m(c10.j(), c10.i(), f11);
        }
        return (i10 & 16777215) | (b10 << 24);
    }

    private static TypedArray g(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }
}
