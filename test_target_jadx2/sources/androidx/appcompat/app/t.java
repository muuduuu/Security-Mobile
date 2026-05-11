package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.C1402d;
import androidx.appcompat.widget.C1404f;
import androidx.appcompat.widget.C1405g;
import androidx.appcompat.widget.C1406h;
import androidx.appcompat.widget.C1410l;
import androidx.appcompat.widget.C1414p;
import androidx.appcompat.widget.C1416s;
import androidx.appcompat.widget.C1419v;
import androidx.appcompat.widget.C1420w;
import androidx.appcompat.widget.C1422y;
import androidx.appcompat.widget.D;
import androidx.appcompat.widget.H;
import androidx.appcompat.widget.e0;
import androidx.core.view.AbstractC1484a0;
import g.AbstractC3179j;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.conscrypt.BuildConfig;

/* loaded from: classes.dex */
public class t {

    /* renamed from: b, reason: collision with root package name */
    private static final Class[] f13274b = {Context.class, AttributeSet.class};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f13275c = {R.attr.onClick};

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f13276d = {R.attr.accessibilityHeading};

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f13277e = {R.attr.accessibilityPaneTitle};

    /* renamed from: f, reason: collision with root package name */
    private static final int[] f13278f = {R.attr.screenReaderFocusable};

    /* renamed from: g, reason: collision with root package name */
    private static final String[] f13279g = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: h, reason: collision with root package name */
    private static final j0.i f13280h = new j0.i();

    /* renamed from: a, reason: collision with root package name */
    private final Object[] f13281a = new Object[2];

    private static class a implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        private final View f13282a;

        /* renamed from: b, reason: collision with root package name */
        private final String f13283b;

        /* renamed from: c, reason: collision with root package name */
        private Method f13284c;

        /* renamed from: d, reason: collision with root package name */
        private Context f13285d;

        public a(View view, String str) {
            this.f13282a = view;
            this.f13283b = str;
        }

        private void a(Context context) {
            String str;
            Method method;
            while (context != null) {
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(this.f13283b, View.class)) != null) {
                        this.f13284c = method;
                        this.f13285d = context;
                        return;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
            int id2 = this.f13282a.getId();
            if (id2 == -1) {
                str = BuildConfig.FLAVOR;
            } else {
                str = " with id '" + this.f13282a.getContext().getResources().getResourceEntryName(id2) + "'";
            }
            throw new IllegalStateException("Could not find method " + this.f13283b + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + this.f13282a.getClass() + str);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f13284c == null) {
                a(this.f13282a.getContext());
            }
            try {
                this.f13284c.invoke(this.f13285d, view);
            } catch (IllegalAccessException e10) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e10);
            } catch (InvocationTargetException e11) {
                throw new IllegalStateException("Could not execute method for android:onClick", e11);
            }
        }
    }

    private void a(Context context, View view, AttributeSet attributeSet) {
        if (Build.VERSION.SDK_INT > 28) {
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f13276d);
        if (obtainStyledAttributes.hasValue(0)) {
            AbstractC1484a0.r0(view, obtainStyledAttributes.getBoolean(0, false));
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f13277e);
        if (obtainStyledAttributes2.hasValue(0)) {
            AbstractC1484a0.t0(view, obtainStyledAttributes2.getString(0));
        }
        obtainStyledAttributes2.recycle();
        TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, f13278f);
        if (obtainStyledAttributes3.hasValue(0)) {
            AbstractC1484a0.I0(view, obtainStyledAttributes3.getBoolean(0, false));
        }
        obtainStyledAttributes3.recycle();
    }

    private void b(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if ((context instanceof ContextWrapper) && view.hasOnClickListeners()) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f13275c);
            String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                view.setOnClickListener(new a(view, string));
            }
            obtainStyledAttributes.recycle();
        }
    }

    private View s(Context context, String str, String str2) {
        String str3;
        j0.i iVar = f13280h;
        Constructor constructor = (Constructor) iVar.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            constructor = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f13274b);
            iVar.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f13281a);
    }

    private View t(Context context, String str, AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue(null, "class");
        }
        try {
            Object[] objArr = this.f13281a;
            objArr[0] = context;
            objArr[1] = attributeSet;
            if (-1 != str.indexOf(46)) {
                return s(context, str, null);
            }
            int i10 = 0;
            while (true) {
                String[] strArr = f13279g;
                if (i10 >= strArr.length) {
                    return null;
                }
                View s10 = s(context, str, strArr[i10]);
                if (s10 != null) {
                    return s10;
                }
                i10++;
            }
        } catch (Exception unused) {
            return null;
        } finally {
            Object[] objArr2 = this.f13281a;
            objArr2[0] = null;
            objArr2[1] = null;
        }
    }

    private static Context u(Context context, AttributeSet attributeSet, boolean z10, boolean z11) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC3179j.f33279H3, 0, 0);
        int resourceId = z10 ? obtainStyledAttributes.getResourceId(AbstractC3179j.f33284I3, 0) : 0;
        if (z11 && resourceId == 0 && (resourceId = obtainStyledAttributes.getResourceId(AbstractC3179j.f33289J3, 0)) != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        obtainStyledAttributes.recycle();
        return resourceId != 0 ? ((context instanceof androidx.appcompat.view.d) && ((androidx.appcompat.view.d) context).c() == resourceId) ? context : new androidx.appcompat.view.d(context, resourceId) : context;
    }

    private void v(View view, String str) {
        if (view != null) {
            return;
        }
        throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
    }

    protected C1402d c(Context context, AttributeSet attributeSet) {
        return new C1402d(context, attributeSet);
    }

    protected C1404f d(Context context, AttributeSet attributeSet) {
        return new C1404f(context, attributeSet);
    }

    protected C1405g e(Context context, AttributeSet attributeSet) {
        return new C1405g(context, attributeSet);
    }

    protected C1406h f(Context context, AttributeSet attributeSet) {
        return new C1406h(context, attributeSet);
    }

    protected C1410l g(Context context, AttributeSet attributeSet) {
        return new C1410l(context, attributeSet);
    }

    protected C1414p h(Context context, AttributeSet attributeSet) {
        return new C1414p(context, attributeSet);
    }

    protected androidx.appcompat.widget.r i(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.r(context, attributeSet);
    }

    protected C1416s j(Context context, AttributeSet attributeSet) {
        return new C1416s(context, attributeSet);
    }

    protected C1419v k(Context context, AttributeSet attributeSet) {
        return new C1419v(context, attributeSet);
    }

    protected C1420w l(Context context, AttributeSet attributeSet) {
        return new C1420w(context, attributeSet);
    }

    protected C1422y m(Context context, AttributeSet attributeSet) {
        return new C1422y(context, attributeSet);
    }

    protected androidx.appcompat.widget.A n(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.A(context, attributeSet);
    }

    protected D o(Context context, AttributeSet attributeSet) {
        return new D(context, attributeSet);
    }

    protected H p(Context context, AttributeSet attributeSet) {
        return new H(context, attributeSet);
    }

    protected View q(Context context, String str, AttributeSet attributeSet) {
        return null;
    }

    public final View r(View view, String str, Context context, AttributeSet attributeSet, boolean z10, boolean z11, boolean z12, boolean z13) {
        Context context2;
        View l10;
        context2 = (!z10 || view == null) ? context : view.getContext();
        if (z11 || z12) {
            context2 = u(context2, attributeSet, z11, z12);
        }
        if (z13) {
            context2 = e0.b(context2);
        }
        str.hashCode();
        switch (str) {
            case "RatingBar":
                l10 = l(context2, attributeSet);
                v(l10, str);
                break;
            case "CheckedTextView":
                l10 = f(context2, attributeSet);
                v(l10, str);
                break;
            case "MultiAutoCompleteTextView":
                l10 = j(context2, attributeSet);
                v(l10, str);
                break;
            case "TextView":
                l10 = o(context2, attributeSet);
                v(l10, str);
                break;
            case "ImageButton":
                l10 = h(context2, attributeSet);
                v(l10, str);
                break;
            case "SeekBar":
                l10 = m(context2, attributeSet);
                v(l10, str);
                break;
            case "Spinner":
                l10 = n(context2, attributeSet);
                v(l10, str);
                break;
            case "RadioButton":
                l10 = k(context2, attributeSet);
                v(l10, str);
                break;
            case "ToggleButton":
                l10 = p(context2, attributeSet);
                v(l10, str);
                break;
            case "ImageView":
                l10 = i(context2, attributeSet);
                v(l10, str);
                break;
            case "AutoCompleteTextView":
                l10 = c(context2, attributeSet);
                v(l10, str);
                break;
            case "CheckBox":
                l10 = e(context2, attributeSet);
                v(l10, str);
                break;
            case "EditText":
                l10 = g(context2, attributeSet);
                v(l10, str);
                break;
            case "Button":
                l10 = d(context2, attributeSet);
                v(l10, str);
                break;
            default:
                l10 = q(context2, str, attributeSet);
                break;
        }
        if (l10 == null && context != context2) {
            l10 = t(context2, str, attributeSet);
        }
        if (l10 != null) {
            b(l10, attributeSet);
            a(context2, l10, attributeSet);
        }
        return l10;
    }
}
