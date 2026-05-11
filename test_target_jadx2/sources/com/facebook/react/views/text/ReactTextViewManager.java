package com.facebook.react.views.text;

import android.content.Context;
import android.os.Build;
import android.text.Spannable;
import c3.AbstractC1721a;
import com.facebook.react.AbstractC1899n;
import com.facebook.react.common.mapbuffer.ReadableMapBuffer;
import com.facebook.react.uimanager.C1948i0;
import com.facebook.react.uimanager.C1973v0;
import com.facebook.react.uimanager.E0;
import com.facebook.react.uimanager.F0;
import com.facebook.react.uimanager.P;
import java.util.HashMap;
import java.util.Map;
import v4.AbstractC4929e;

@K4.a(name = ReactTextViewManager.REACT_CLASS)
/* loaded from: classes2.dex */
public class ReactTextViewManager extends ReactTextAnchorViewManager<m, h> implements P {
    public static final String REACT_CLASS = "RCTText";
    private static final String TAG = "ReactTextViewManager";
    private static final short TX_STATE_KEY_ATTRIBUTED_STRING = 0;
    private static final short TX_STATE_KEY_HASH = 2;
    private static final short TX_STATE_KEY_MOST_RECENT_EVENT_COUNT = 3;
    private static final short TX_STATE_KEY_PARAGRAPH_ATTRIBUTES = 1;
    protected n mReactTextViewManagerCallback;

    public ReactTextViewManager() {
        this(null);
    }

    private Object getReactTextUpdate(m mVar, C1973v0 c1973v0, com.facebook.react.common.mapbuffer.a aVar) {
        com.facebook.react.common.mapbuffer.a x12 = aVar.x1(0);
        com.facebook.react.common.mapbuffer.a x13 = aVar.x1(1);
        Spannable g10 = s.g(mVar.getContext(), x12, null);
        mVar.setSpanned(g10);
        try {
            mVar.setMinimumFontSize((float) x13.getDouble(6));
            return new i(g10, -1, false, s.i(x12, g10, mVar.getGravityHorizontal()), q.i(x13.getString(2)), q.d(c1973v0, Build.VERSION.SDK_INT >= 26 ? mVar.getJustificationMode() : 0));
        } catch (IllegalArgumentException e10) {
            AbstractC1721a.o(TAG, "Paragraph Attributes: %s", x13 != null ? x13.toString() : "<empty>");
            throw e10;
        }
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = new HashMap<>();
        }
        exportedCustomDirectEventTypeConstants.putAll(AbstractC4929e.e("topTextLayout", AbstractC4929e.d("registrationName", "onTextLayout"), "topInlineViewLayout", AbstractC4929e.d("registrationName", "onInlineViewLayout")));
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Class<h> getShadowNodeClass() {
        return h.class;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public long measure(Context context, com.facebook.react.common.mapbuffer.a aVar, com.facebook.react.common.mapbuffer.a aVar2, com.facebook.react.common.mapbuffer.a aVar3, float f10, com.facebook.yoga.p pVar, float f11, com.facebook.yoga.p pVar2, float[] fArr) {
        return s.l(context, aVar, aVar2, f10, pVar, f11, pVar2, null, fArr);
    }

    @Override // com.facebook.react.uimanager.P
    public boolean needsCustomLayoutForChildren() {
        return true;
    }

    @Z4.a(name = "overflow")
    public void setOverflow(m mVar, String str) {
        mVar.setOverflow(str);
    }

    public ReactTextViewManager(n nVar) {
        setupViewRecycling();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public h createShadowNodeInstance() {
        return new h(null);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public m createViewInstance(F0 f02) {
        return new m(f02);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(m mVar) {
        super.onAfterUpdateTransaction((ReactTextViewManager) mVar);
        mVar.z();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public m prepareToRecycleView(F0 f02, m mVar) {
        m mVar2 = (m) super.prepareToRecycleView(f02, (F0) mVar);
        if (mVar2 != null) {
            mVar2.v();
            setSelectionColor(mVar2, null);
        }
        return mVar;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void setPadding(m mVar, int i10, int i11, int i12, int i13) {
        mVar.setPadding(i10, i11, i12, i13);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateExtraData(m mVar, Object obj) {
        F4.c cVar = new F4.c("ReactTextViewManager.updateExtraData");
        try {
            i iVar = (i) obj;
            Spannable i10 = iVar.i();
            if (iVar.b()) {
                o5.o.g(i10, mVar);
            }
            mVar.setText(iVar);
            o5.f[] fVarArr = (o5.f[]) i10.getSpans(0, iVar.i().length(), o5.f.class);
            if (fVarArr.length > 0) {
                mVar.setTag(AbstractC1899n.f21887f, new C1948i0.d(fVarArr, i10));
                C1948i0.i0(mVar, mVar.isFocusable(), mVar.getImportantForAccessibility());
            }
            cVar.close();
        } catch (Throwable th) {
            try {
                cVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Object updateState(m mVar, C1973v0 c1973v0, E0 e02) {
        F4.c cVar = new F4.c("ReactTextViewManager.updateState");
        try {
            ReadableMapBuffer stateDataMapBuffer = e02.getStateDataMapBuffer();
            if (stateDataMapBuffer == null) {
                cVar.close();
                return null;
            }
            Object reactTextUpdate = getReactTextUpdate(mVar, c1973v0, stateDataMapBuffer);
            cVar.close();
            return reactTextUpdate;
        } catch (Throwable th) {
            try {
                cVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public h createShadowNodeInstance(n nVar) {
        return new h(nVar);
    }
}
