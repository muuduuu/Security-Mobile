package com.facebook.react.uimanager;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import c3.AbstractC1721a;
import com.facebook.react.AbstractC1899n;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.RetryableMountingLayerException;
import com.facebook.react.bridge.SoftAssertions;
import com.facebook.react.bridge.UiThreadUtil;
import d5.C2983e;
import d5.InterfaceC2984f;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import s5.C4313a;
import s5.C4314b;
import x4.C5109a;

/* renamed from: com.facebook.react.uimanager.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1936c0 {
    private static final String TAG = "c0";
    private final boolean DEBUG_MODE;
    private final RectF mBoundingBox;
    private final Y4.a mJSResponderHandler;
    private volatile boolean mLayoutAnimationEnabled;
    private final C2983e mLayoutAnimator;
    private HashMap<Integer, Set<Integer>> mPendingDeletionsForTag;
    private final SparseBooleanArray mRootTags;
    private final RootViewManager mRootViewManager;
    private final SparseArray<ViewManager> mTagsToViewManagers;
    private final SparseArray<View> mTagsToViews;
    private final i1 mViewManagers;

    /* renamed from: com.facebook.react.uimanager.c0$a */
    class a implements InterfaceC2984f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroupManager f22324a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewGroup f22325b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f22326c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Set f22327d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f22328e;

        a(ViewGroupManager viewGroupManager, ViewGroup viewGroup, View view, Set set, int i10) {
            this.f22324a = viewGroupManager;
            this.f22325b = viewGroup;
            this.f22326c = view;
            this.f22327d = set;
            this.f22328e = i10;
        }

        @Override // d5.InterfaceC2984f
        public void a() {
            UiThreadUtil.assertOnUiThread();
            this.f22324a.removeView(this.f22325b, this.f22326c);
            C1936c0.this.dropView(this.f22326c);
            this.f22327d.remove(Integer.valueOf(this.f22326c.getId()));
            if (this.f22327d.isEmpty()) {
                C1936c0.this.mPendingDeletionsForTag.remove(Integer.valueOf(this.f22328e));
            }
        }
    }

    public C1936c0(i1 i1Var) {
        this(i1Var, new RootViewManager());
    }

    private boolean b(int[] iArr, int i10) {
        if (iArr == null) {
            return false;
        }
        for (int i11 : iArr) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }

    private void c(View view, int[] iArr) {
        this.mBoundingBox.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        g(view, this.mBoundingBox);
        iArr[0] = Math.round(this.mBoundingBox.left);
        iArr[1] = Math.round(this.mBoundingBox.top);
        RectF rectF = this.mBoundingBox;
        iArr[2] = Math.round(rectF.right - rectF.left);
        RectF rectF2 = this.mBoundingBox;
        iArr[3] = Math.round(rectF2.bottom - rectF2.top);
    }

    private static String d(ViewGroup viewGroup, ViewGroupManager viewGroupManager, int[] iArr, a1[] a1VarArr, int[] iArr2) {
        StringBuilder sb2 = new StringBuilder();
        if (viewGroup != null) {
            sb2.append("View tag:" + viewGroup.getId() + " View Type:" + viewGroup.getClass().toString() + "\n");
            StringBuilder sb3 = new StringBuilder();
            sb3.append("  children(");
            sb3.append(viewGroupManager.getChildCount((ViewGroupManager) viewGroup));
            sb3.append("): [\n");
            sb2.append(sb3.toString());
            for (int i10 = 0; viewGroupManager.getChildAt((ViewGroupManager) viewGroup, i10) != null; i10 += 16) {
                int i11 = 0;
                while (true) {
                    int i12 = i10 + i11;
                    if (viewGroupManager.getChildAt((ViewGroupManager) viewGroup, i12) != null && i11 < 16) {
                        sb2.append(viewGroupManager.getChildAt((ViewGroupManager) viewGroup, i12).getId() + ",");
                        i11++;
                    }
                }
                sb2.append("\n");
            }
            sb2.append(" ],\n");
        }
        if (iArr != null) {
            sb2.append("  indicesToRemove(" + iArr.length + "): [\n");
            for (int i13 = 0; i13 < iArr.length; i13 += 16) {
                int i14 = 0;
                while (true) {
                    int i15 = i13 + i14;
                    if (i15 < iArr.length && i14 < 16) {
                        sb2.append(iArr[i15] + ",");
                        i14++;
                    }
                }
                sb2.append("\n");
            }
            sb2.append(" ],\n");
        }
        if (a1VarArr != null) {
            sb2.append("  viewsToAdd(" + a1VarArr.length + "): [\n");
            for (int i16 = 0; i16 < a1VarArr.length; i16 += 16) {
                int i17 = 0;
                while (true) {
                    int i18 = i16 + i17;
                    if (i18 < a1VarArr.length && i17 < 16) {
                        sb2.append("[" + a1VarArr[i18].f22319b + "," + a1VarArr[i18].f22318a + "],");
                        i17++;
                    }
                }
                sb2.append("\n");
            }
            sb2.append(" ],\n");
        }
        if (iArr2 != null) {
            sb2.append("  tagsToDelete(" + iArr2.length + "): [\n");
            for (int i19 = 0; i19 < iArr2.length; i19 += 16) {
                int i20 = 0;
                while (true) {
                    int i21 = i19 + i20;
                    if (i21 < iArr2.length && i20 < 16) {
                        sb2.append(iArr2[i21] + ",");
                        i20++;
                    }
                }
                sb2.append("\n");
            }
            sb2.append(" ]\n");
        }
        return sb2.toString();
    }

    private static String e(ViewGroup viewGroup, ViewGroupManager viewGroupManager, ReadableArray readableArray) {
        a1[] a1VarArr = new a1[readableArray.size()];
        for (int i10 = 0; i10 < readableArray.size(); i10++) {
            a1VarArr[i10] = new a1(readableArray.getInt(i10), i10);
        }
        return d(viewGroup, viewGroupManager, null, a1VarArr, null);
    }

    private Set f(int i10) {
        if (this.mPendingDeletionsForTag == null) {
            this.mPendingDeletionsForTag = new HashMap<>();
        }
        if (!this.mPendingDeletionsForTag.containsKey(Integer.valueOf(i10))) {
            this.mPendingDeletionsForTag.put(Integer.valueOf(i10), new HashSet());
        }
        return this.mPendingDeletionsForTag.get(Integer.valueOf(i10));
    }

    private void g(View view, RectF rectF) {
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            matrix.mapRect(rectF);
        }
        rectF.offset(view.getLeft(), view.getTop());
        Object parent = view.getParent();
        while (parent instanceof View) {
            View view2 = (View) parent;
            rectF.offset(-view2.getScrollX(), -view2.getScrollY());
            Matrix matrix2 = view2.getMatrix();
            if (!matrix2.isIdentity()) {
                matrix2.mapRect(rectF);
            }
            rectF.offset(view2.getLeft(), view2.getTop());
            parent = view2.getParent();
        }
    }

    private void h(View view, long j10) {
        UiThreadUtil.assertOnUiThread();
        view.setTag(AbstractC1899n.f21880C, Long.valueOf(j10));
    }

    private void i(View view, int i10, int i11, int i12, int i13) {
        if (this.mLayoutAnimationEnabled && this.mLayoutAnimator.shouldAnimateLayout(view)) {
            this.mLayoutAnimator.applyLayoutUpdate(view, i10, i11, i12, i13);
        } else {
            view.layout(i10, i11, i12 + i10, i13 + i11);
        }
    }

    public synchronized void addRootView(int i10, View view) {
        addRootViewGroup(i10, view);
    }

    protected final synchronized void addRootViewGroup(int i10, View view) {
        try {
            if (this.DEBUG_MODE) {
                AbstractC1721a.d(TAG, "addRootViewGroup[%d]: %s", Integer.valueOf(i10), view != null ? view.toString() : "<null>");
            }
            if (view.getId() != -1) {
                AbstractC1721a.m(TAG, "Trying to add a root view with an explicit id (" + view.getId() + ") already set. React Native uses the id field to track react tags and will overwrite this field. If that is fine, explicitly overwrite the id field to View.NO_ID before calling addRootView.");
            }
            this.mTagsToViews.put(i10, view);
            this.mTagsToViewManagers.put(i10, this.mRootViewManager);
            this.mRootTags.put(i10, true);
            view.setId(i10);
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void clearJSResponder() {
        this.mJSResponderHandler.b();
    }

    synchronized void clearLayoutAnimation() {
        this.mLayoutAnimator.reset();
    }

    synchronized void configureLayoutAnimation(ReadableMap readableMap, Callback callback) {
        this.mLayoutAnimator.initializeFromConfig(readableMap, callback);
    }

    public synchronized void createView(F0 f02, int i10, String str, C1973v0 c1973v0) {
        try {
            if (this.DEBUG_MODE) {
                AbstractC1721a.e(TAG, "createView[%d]: %s %s", Integer.valueOf(i10), str, c1973v0 != null ? c1973v0.toString() : "<null>");
            }
            UiThreadUtil.assertOnUiThread();
            C4314b.a(0L, "NativeViewHierarchyManager_createView").a("tag", i10).b("className", str).c();
            try {
                ViewManager c10 = this.mViewManagers.c(str);
                this.mTagsToViews.put(i10, c10.createView(i10, f02, c1973v0, null, this.mJSResponderHandler));
                this.mTagsToViewManagers.put(i10, c10);
            } finally {
                C4313a.i(0L);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Deprecated
    public synchronized void dispatchCommand(int i10, int i11, ReadableArray readableArray) {
        try {
            if (this.DEBUG_MODE) {
                AbstractC1721a.e(TAG, "dispatchCommand[%d]: %d %s", Integer.valueOf(i10), Integer.valueOf(i11), readableArray != null ? readableArray.toString() : "<null>");
            }
            UiThreadUtil.assertOnUiThread();
            View view = this.mTagsToViews.get(i10);
            if (view == null) {
                throw new RetryableMountingLayerException("Trying to send command to a non-existing view with tag [" + i10 + "] and command " + i11);
            }
            resolveViewManager(i10).receiveCommand((ViewManager) view, i11, readableArray);
        } catch (Throwable th) {
            throw th;
        }
    }

    protected synchronized void dropView(View view) {
        try {
            if (this.DEBUG_MODE) {
                AbstractC1721a.c(TAG, "dropView[%d]", Integer.valueOf(view != null ? view.getId() : -1));
            }
            UiThreadUtil.assertOnUiThread();
            if (view == null) {
                return;
            }
            if (this.mTagsToViewManagers.get(view.getId()) == null) {
                return;
            }
            if (!this.mRootTags.get(view.getId())) {
                resolveViewManager(view.getId()).onDropViewInstance(view);
            }
            ViewManager viewManager = this.mTagsToViewManagers.get(view.getId());
            if ((view instanceof ViewGroup) && (viewManager instanceof ViewGroupManager)) {
                ViewGroup viewGroup = (ViewGroup) view;
                ViewGroupManager viewGroupManager = (ViewGroupManager) viewManager;
                for (int childCount = viewGroupManager.getChildCount((ViewGroupManager) viewGroup) - 1; childCount >= 0; childCount--) {
                    View childAt = viewGroupManager.getChildAt((ViewGroupManager) viewGroup, childCount);
                    if (childAt == null) {
                        AbstractC1721a.m(TAG, "Unable to drop null child view");
                    } else if (this.mTagsToViews.get(childAt.getId()) != null) {
                        dropView(childAt);
                    }
                }
                viewGroupManager.removeAllViews(viewGroup);
            }
            this.mTagsToViews.remove(view.getId());
            this.mTagsToViewManagers.remove(view.getId());
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized int findTargetTagForTouch(int i10, float f10, float f11) {
        View view;
        try {
            if (this.DEBUG_MODE) {
                AbstractC1721a.e(TAG, "findTargetTagForTouch[%d]: %f %f", Integer.valueOf(i10), Float.valueOf(f10), Float.valueOf(f11));
            }
            UiThreadUtil.assertOnUiThread();
            view = this.mTagsToViews.get(i10);
            if (view == null) {
                throw new JSApplicationIllegalArgumentException("Could not find view with tag " + i10);
            }
        } catch (Throwable th) {
            throw th;
        }
        return G0.d(f10, f11, (ViewGroup) view);
    }

    public synchronized long getInstanceHandle(int i10) {
        Long l10;
        View view = this.mTagsToViews.get(i10);
        if (view == null) {
            throw new Q("Unable to find view for tag: " + i10);
        }
        l10 = (Long) view.getTag(AbstractC1899n.f21880C);
        if (l10 == null) {
            throw new Q("Unable to find instanceHandle for tag: " + i10);
        }
        return l10.longValue();
    }

    public synchronized int getRootViewNum() {
        return this.mRootTags.size();
    }

    public synchronized void manageChildren(int i10, int[] iArr, a1[] a1VarArr, int[] iArr2) {
        int i11;
        int[] iArr3 = iArr;
        synchronized (this) {
            try {
                if (this.DEBUG_MODE) {
                    AbstractC1721a.f(TAG, "createView[%d]: %s %s %s", Integer.valueOf(i10), iArr3 != null ? iArr.toString() : "<null>", a1VarArr != null ? a1VarArr.toString() : "<null>", iArr2 != null ? iArr2.toString() : "<null>");
                }
                UiThreadUtil.assertOnUiThread();
                Set f10 = f(i10);
                ViewGroup viewGroup = (ViewGroup) this.mTagsToViews.get(i10);
                ViewGroupManager viewGroupManager = (ViewGroupManager) resolveViewManager(i10);
                if (viewGroup == null) {
                    throw new Q("Trying to manageChildren view with tag " + i10 + " which doesn't exist\n detail: " + d(viewGroup, viewGroupManager, iArr3, a1VarArr, iArr2));
                }
                int childCount = viewGroupManager.getChildCount((ViewGroupManager) viewGroup);
                if (iArr3 != null) {
                    int length = iArr3.length - 1;
                    while (length >= 0) {
                        int i12 = iArr3[length];
                        if (i12 < 0) {
                            throw new Q("Trying to remove a negative view index:" + i12 + " view tag: " + i10 + "\n detail: " + d(viewGroup, viewGroupManager, iArr3, a1VarArr, iArr2));
                        }
                        if (viewGroupManager.getChildAt((ViewGroupManager) viewGroup, i12) == null) {
                            if (this.mRootTags.get(i10) && viewGroupManager.getChildCount((ViewGroupManager) viewGroup) == 0) {
                                return;
                            }
                            throw new Q("Trying to remove a view index above child count " + i12 + " view tag: " + i10 + "\n detail: " + d(viewGroup, viewGroupManager, iArr3, a1VarArr, iArr2));
                        }
                        if (i12 >= childCount) {
                            throw new Q("Trying to remove an out of order view index:" + i12 + " view tag: " + i10 + "\n detail: " + d(viewGroup, viewGroupManager, iArr3, a1VarArr, iArr2));
                        }
                        View childAt = viewGroupManager.getChildAt((ViewGroupManager) viewGroup, i12);
                        if (!this.mLayoutAnimationEnabled || !this.mLayoutAnimator.shouldAnimateLayout(childAt) || !b(iArr2, childAt.getId())) {
                            viewGroupManager.removeViewAt((ViewGroupManager) viewGroup, i12);
                        }
                        length--;
                        childCount = i12;
                    }
                }
                if (iArr2 != null) {
                    int i13 = 0;
                    while (i13 < iArr2.length) {
                        int i14 = iArr2[i13];
                        View view = this.mTagsToViews.get(i14);
                        if (view == null) {
                            throw new Q("Trying to destroy unknown view tag: " + i14 + "\n detail: " + d(viewGroup, viewGroupManager, iArr, a1VarArr, iArr2));
                        }
                        if (this.mLayoutAnimationEnabled && this.mLayoutAnimator.shouldAnimateLayout(view)) {
                            f10.add(Integer.valueOf(i14));
                            i11 = i13;
                            this.mLayoutAnimator.deleteView(view, new a(viewGroupManager, viewGroup, view, f10, i10));
                        } else {
                            i11 = i13;
                            dropView(view);
                        }
                        i13 = i11 + 1;
                        iArr3 = iArr;
                    }
                }
                int[] iArr4 = iArr3;
                if (a1VarArr != null) {
                    for (a1 a1Var : a1VarArr) {
                        View view2 = this.mTagsToViews.get(a1Var.f22318a);
                        if (view2 == null) {
                            throw new Q("Trying to add unknown view tag: " + a1Var.f22318a + "\n detail: " + d(viewGroup, viewGroupManager, iArr4, a1VarArr, iArr2));
                        }
                        int i15 = a1Var.f22319b;
                        if (!f10.isEmpty()) {
                            i15 = 0;
                            int i16 = 0;
                            while (i15 < viewGroup.getChildCount() && i16 != a1Var.f22319b) {
                                if (!f10.contains(Integer.valueOf(viewGroup.getChildAt(i15).getId()))) {
                                    i16++;
                                }
                                i15++;
                            }
                        }
                        viewGroupManager.addView((ViewGroupManager) viewGroup, view2, i15);
                    }
                }
                if (f10.isEmpty()) {
                    this.mPendingDeletionsForTag.remove(Integer.valueOf(i10));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized void measure(int i10, int[] iArr) {
        try {
            if (this.DEBUG_MODE) {
                AbstractC1721a.c(TAG, "measure[%d]", Integer.valueOf(i10));
            }
            UiThreadUtil.assertOnUiThread();
            View view = this.mTagsToViews.get(i10);
            if (view == null) {
                throw new C1940e0("No native view for " + i10 + " currently exists");
            }
            View view2 = (View) B0.a(view);
            if (view2 == null) {
                throw new C1940e0("Native view " + i10 + " is no longer on screen");
            }
            c(view2, iArr);
            int i11 = iArr[0];
            int i12 = iArr[1];
            c(view, iArr);
            iArr[0] = iArr[0] - i11;
            iArr[1] = iArr[1] - i12;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void measureInWindow(int i10, int[] iArr) {
        try {
            if (this.DEBUG_MODE) {
                AbstractC1721a.c(TAG, "measureInWindow[%d]", Integer.valueOf(i10));
            }
            UiThreadUtil.assertOnUiThread();
            View view = this.mTagsToViews.get(i10);
            if (view == null) {
                throw new C1940e0("No native view for " + i10 + " currently exists");
            }
            view.getLocationOnScreen(iArr);
            Rect rect = new Rect();
            view.getWindowVisibleDisplayFrame(rect);
            iArr[0] = iArr[0] - rect.left;
            iArr[1] = iArr[1] - rect.top;
            iArr[2] = view.getWidth();
            iArr[3] = view.getHeight();
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void removeRootView(int i10) {
        try {
            if (this.DEBUG_MODE) {
                AbstractC1721a.c(TAG, "removeRootView[%d]", Integer.valueOf(i10));
            }
            UiThreadUtil.assertOnUiThread();
            if (!this.mRootTags.get(i10)) {
                SoftAssertions.assertUnreachable("View with tag " + i10 + " is not registered as a root view");
            }
            dropView(this.mTagsToViews.get(i10));
            this.mRootTags.delete(i10);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized View resolveView(int i10) {
        View view;
        view = this.mTagsToViews.get(i10);
        if (view == null) {
            throw new Q("Trying to resolve view with tag " + i10 + " which doesn't exist");
        }
        return view;
    }

    public final synchronized ViewManager resolveViewManager(int i10) {
        ViewManager viewManager;
        viewManager = this.mTagsToViewManagers.get(i10);
        if (viewManager == null) {
            throw new Q("ViewManager for tag " + i10 + " could not be found.\n");
        }
        return viewManager;
    }

    public synchronized void sendAccessibilityEvent(int i10, int i11) {
        View view = this.mTagsToViews.get(i10);
        if (view == null) {
            throw new RetryableMountingLayerException("Could not find view with tag " + i10);
        }
        view.sendAccessibilityEvent(i11);
    }

    public synchronized void setChildren(int i10, ReadableArray readableArray) {
        try {
            if (this.DEBUG_MODE) {
                AbstractC1721a.d(TAG, "setChildren[%d]: %s", Integer.valueOf(i10), readableArray != null ? readableArray.toString() : "<null>");
            }
            UiThreadUtil.assertOnUiThread();
            ViewGroup viewGroup = (ViewGroup) this.mTagsToViews.get(i10);
            ViewGroupManager viewGroupManager = (ViewGroupManager) resolveViewManager(i10);
            for (int i11 = 0; i11 < readableArray.size(); i11++) {
                View view = this.mTagsToViews.get(readableArray.getInt(i11));
                if (view == null) {
                    throw new Q("Trying to add unknown view tag: " + readableArray.getInt(i11) + "\n detail: " + e(viewGroup, viewGroupManager, readableArray));
                }
                viewGroupManager.addView((ViewGroupManager) viewGroup, view, i11);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public synchronized void setJSResponder(int i10, int i11, boolean z10) {
        if (!z10) {
            this.mJSResponderHandler.d(i11, null);
            return;
        }
        View view = this.mTagsToViews.get(i10);
        if (i11 != i10 && (view instanceof ViewParent)) {
            this.mJSResponderHandler.d(i11, (ViewParent) view);
            return;
        }
        if (this.mRootTags.get(i10)) {
            SoftAssertions.assertUnreachable("Cannot block native responder on " + i10 + " that is a root view");
        }
        this.mJSResponderHandler.d(i11, view.getParent());
    }

    public void setLayoutAnimationEnabled(boolean z10) {
        this.mLayoutAnimationEnabled = z10;
    }

    public synchronized void updateInstanceHandle(int i10, long j10) {
        UiThreadUtil.assertOnUiThread();
        try {
            h(resolveView(i10), j10);
        } catch (Q e10) {
            AbstractC1721a.n(TAG, "Unable to update properties for view tag " + i10, e10);
        }
    }

    @Deprecated
    public void updateLayout(int i10, int i11, int i12, int i13, int i14) {
        updateLayout(i10, i10, i11, i12, i13, i14, com.facebook.yoga.h.INHERIT);
    }

    public synchronized void updateProperties(int i10, C1973v0 c1973v0) {
        try {
            if (this.DEBUG_MODE) {
                AbstractC1721a.d(TAG, "updateProperties[%d]: %s", Integer.valueOf(i10), c1973v0.toString());
            }
            UiThreadUtil.assertOnUiThread();
            try {
                ViewManager resolveViewManager = resolveViewManager(i10);
                View resolveView = resolveView(i10);
                if (c1973v0 != null) {
                    resolveViewManager.updateProperties(resolveView, c1973v0);
                }
            } catch (Q e10) {
                AbstractC1721a.n(TAG, "Unable to update properties for view tag " + i10, e10);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void updateViewExtraData(int i10, Object obj) {
        try {
            if (this.DEBUG_MODE) {
                AbstractC1721a.d(TAG, "updateViewExtraData[%d]: %s", Integer.valueOf(i10), obj.toString());
            }
            UiThreadUtil.assertOnUiThread();
            resolveViewManager(i10).updateExtraData(resolveView(i10), obj);
        } catch (Throwable th) {
            throw th;
        }
    }

    public C1936c0(i1 i1Var, RootViewManager rootViewManager) {
        C5109a c5109a = C5109a.f44774a;
        this.DEBUG_MODE = false;
        this.mJSResponderHandler = new Y4.a();
        this.mLayoutAnimator = new C2983e();
        this.mBoundingBox = new RectF();
        this.mViewManagers = i1Var;
        this.mTagsToViews = new SparseArray<>();
        this.mTagsToViewManagers = new SparseArray<>();
        this.mRootTags = new SparseBooleanArray();
        this.mRootViewManager = rootViewManager;
    }

    public synchronized void updateLayout(int i10, int i11, int i12, int i13, int i14, int i15, com.facebook.yoga.h hVar) {
        try {
            if (this.DEBUG_MODE) {
                AbstractC1721a.h(TAG, "updateLayout[%d]->[%d]: %d %d %d %d", Integer.valueOf(i11), Integer.valueOf(i10), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14), Integer.valueOf(i15));
            }
            UiThreadUtil.assertOnUiThread();
            C4314b.a(0L, "NativeViewHierarchyManager_updateLayout").a("parentTag", i10).a("tag", i11).c();
            try {
                View resolveView = resolveView(i11);
                if (G4.a.o()) {
                    resolveView.setLayoutDirection(U.a(hVar));
                }
                resolveView.measure(View.MeasureSpec.makeMeasureSpec(i14, 1073741824), View.MeasureSpec.makeMeasureSpec(i15, 1073741824));
                ViewParent parent = resolveView.getParent();
                if (parent instanceof A0) {
                    parent.requestLayout();
                }
                if (this.mRootTags.get(i10)) {
                    i(resolveView, i12, i13, i14, i15);
                } else {
                    NativeModule nativeModule = (ViewManager) this.mTagsToViewManagers.get(i10);
                    if (!(nativeModule instanceof P)) {
                        throw new Q("Trying to use view with tag " + i10 + " as a parent, but its Manager doesn't implement IViewManagerWithChildren");
                    }
                    P p10 = (P) nativeModule;
                    if (p10 != null && !p10.needsCustomLayoutForChildren()) {
                        i(resolveView, i12, i13, i14, i15);
                    }
                }
                C4313a.i(0L);
            } catch (Throwable th) {
                C4313a.i(0L);
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void dispatchCommand(int i10, String str, ReadableArray readableArray) {
        try {
            if (this.DEBUG_MODE) {
                AbstractC1721a.e(TAG, "dispatchCommand[%d]: %s %s", Integer.valueOf(i10), str, readableArray != null ? readableArray.toString() : "<null>");
            }
            UiThreadUtil.assertOnUiThread();
            View view = this.mTagsToViews.get(i10);
            if (view != null) {
                resolveViewManager(i10).receiveCommand((ViewManager) view, str, readableArray);
            } else {
                throw new RetryableMountingLayerException("Trying to send command to a non-existing view with tag [" + i10 + "] and command " + str);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
