package I7;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    private final j0.i f4346a = new j0.i();

    /* renamed from: b, reason: collision with root package name */
    private final j0.i f4347b = new j0.i();

    private static void a(g gVar, Animator animator) {
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            gVar.g(objectAnimator.getPropertyName(), objectAnimator.getValues());
            gVar.h(objectAnimator.getPropertyName(), h.b(objectAnimator));
        } else {
            throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
        }
    }

    public static g b(Context context, TypedArray typedArray, int i10) {
        int resourceId;
        if (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0) {
            return null;
        }
        return c(context, resourceId);
    }

    public static g c(Context context, int i10) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i10);
            if (loadAnimator instanceof AnimatorSet) {
                return d(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return d(arrayList);
        } catch (Exception e10) {
            Log.w("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(i10), e10);
            return null;
        }
    }

    private static g d(List list) {
        g gVar = new g();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            a(gVar, (Animator) list.get(i10));
        }
        return gVar;
    }

    public h e(String str) {
        if (f(str)) {
            return (h) this.f4346a.get(str);
        }
        throw new IllegalArgumentException();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            return this.f4346a.equals(((g) obj).f4346a);
        }
        return false;
    }

    public boolean f(String str) {
        return this.f4346a.get(str) != null;
    }

    public void g(String str, PropertyValuesHolder[] propertyValuesHolderArr) {
        this.f4347b.put(str, propertyValuesHolderArr);
    }

    public void h(String str, h hVar) {
        this.f4346a.put(str, hVar);
    }

    public int hashCode() {
        return this.f4346a.hashCode();
    }

    public String toString() {
        return '\n' + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f4346a + "}\n";
    }
}
