package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: androidx.fragment.app.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class LayoutInflaterFactory2C1583z implements LayoutInflater.Factory2 {

    /* renamed from: a, reason: collision with root package name */
    final G f17029a;

    /* renamed from: androidx.fragment.app.z$a */
    class a implements View.OnAttachStateChangeListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ M f17030a;

        a(M m10) {
            this.f17030a = m10;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            ComponentCallbacksC1573o k10 = this.f17030a.k();
            this.f17030a.m();
            Z.r((ViewGroup) k10.mView.getParent(), LayoutInflaterFactory2C1583z.this.f17029a).n();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    LayoutInflaterFactory2C1583z(G g10) {
        this.f17029a = g10;
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        M u10;
        if (FragmentContainerView.class.getName().equals(str)) {
            return new FragmentContainerView(context, attributeSet, this.f17029a);
        }
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, T0.c.f9132a);
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(T0.c.f9133b);
        }
        int resourceId = obtainStyledAttributes.getResourceId(T0.c.f9134c, -1);
        String string = obtainStyledAttributes.getString(T0.c.f9135d);
        obtainStyledAttributes.recycle();
        if (attributeValue == null || !AbstractC1581x.b(context.getClassLoader(), attributeValue)) {
            return null;
        }
        int id2 = view != null ? view.getId() : 0;
        if (id2 == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
        }
        ComponentCallbacksC1573o h02 = resourceId != -1 ? this.f17029a.h0(resourceId) : null;
        if (h02 == null && string != null) {
            h02 = this.f17029a.i0(string);
        }
        if (h02 == null && id2 != -1) {
            h02 = this.f17029a.h0(id2);
        }
        if (h02 == null) {
            h02 = this.f17029a.u0().a(context.getClassLoader(), attributeValue);
            h02.mFromLayout = true;
            h02.mFragmentId = resourceId != 0 ? resourceId : id2;
            h02.mContainerId = id2;
            h02.mTag = string;
            h02.mInLayout = true;
            G g10 = this.f17029a;
            h02.mFragmentManager = g10;
            h02.mHost = g10.w0();
            h02.onInflate(this.f17029a.w0().f(), attributeSet, h02.mSavedFragmentState);
            u10 = this.f17029a.h(h02);
            if (G.J0(2)) {
                Log.v("FragmentManager", "Fragment " + h02 + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
            }
        } else {
            if (h02.mInLayout) {
                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id2) + " with another fragment for " + attributeValue);
            }
            h02.mInLayout = true;
            G g11 = this.f17029a;
            h02.mFragmentManager = g11;
            h02.mHost = g11.w0();
            h02.onInflate(this.f17029a.w0().f(), attributeSet, h02.mSavedFragmentState);
            u10 = this.f17029a.u(h02);
            if (G.J0(2)) {
                Log.v("FragmentManager", "Retained Fragment " + h02 + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
            }
        }
        ViewGroup viewGroup = (ViewGroup) view;
        U0.c.g(h02, viewGroup);
        h02.mContainer = viewGroup;
        u10.m();
        u10.j();
        View view2 = h02.mView;
        if (view2 == null) {
            throw new IllegalStateException("Fragment " + attributeValue + " did not create a view.");
        }
        if (resourceId != 0) {
            view2.setId(resourceId);
        }
        if (h02.mView.getTag() == null) {
            h02.mView.setTag(string);
        }
        h02.mView.addOnAttachStateChangeListener(new a(u10));
        return h02.mView;
    }
}
