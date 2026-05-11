package com.facebook.react.views.swiperefresh;

import android.view.View;
import androidx.swiperefreshlayout.widget.c;
import co.hyperverge.hypersnapsdk.utils.AppConstants;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.F0;
import com.facebook.react.uimanager.L0;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.c1;
import com.facebook.react.uimanager.events.EventDispatcher;
import h5.C3240e;
import h5.InterfaceC3242f;
import java.util.HashMap;
import java.util.Map;
import v4.AbstractC4929e;

@K4.a(name = SwipeRefreshLayoutManager.REACT_CLASS)
/* loaded from: classes2.dex */
public class SwipeRefreshLayoutManager extends ViewGroupManager<com.facebook.react.views.swiperefresh.a> implements InterfaceC3242f {
    public static final String REACT_CLASS = "AndroidSwipeRefreshLayout";
    private final c1 mDelegate = new C3240e(this);

    class a implements c.j {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ F0 f22738a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.facebook.react.views.swiperefresh.a f22739b;

        a(F0 f02, com.facebook.react.views.swiperefresh.a aVar) {
            this.f22738a = f02;
            this.f22739b = aVar;
        }

        @Override // androidx.swiperefreshlayout.widget.c.j
        public void a() {
            EventDispatcher c10 = L0.c(this.f22738a, this.f22739b.getId());
            if (c10 != null) {
                c10.c(new b(L0.f(this.f22739b), this.f22739b.getId()));
            }
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    protected c1 getDelegate() {
        return this.mDelegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = new HashMap<>();
        }
        exportedCustomDirectEventTypeConstants.putAll(AbstractC4929e.a().b("topRefresh", AbstractC4929e.d("registrationName", "onRefresh")).a());
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedViewConstants() {
        return AbstractC4929e.d("SIZE", AbstractC4929e.e("DEFAULT", 1, "LARGE", 0));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.O
    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        super.removeAllViews(view);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(F0 f02, com.facebook.react.views.swiperefresh.a aVar) {
        aVar.setOnRefreshListener(new a(f02, aVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public com.facebook.react.views.swiperefresh.a createViewInstance(F0 f02) {
        return new com.facebook.react.views.swiperefresh.a(f02);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(com.facebook.react.views.swiperefresh.a aVar, String str, ReadableArray readableArray) {
        str.hashCode();
        if (str.equals("setNativeRefreshing") && readableArray != null) {
            setRefreshing(aVar, readableArray.getBoolean(0));
        }
    }

    @Override // h5.InterfaceC3242f
    @Z4.a(customType = "ColorArray", name = "colors")
    public void setColors(com.facebook.react.views.swiperefresh.a aVar, ReadableArray readableArray) {
        if (readableArray == null) {
            aVar.setColorSchemeColors(new int[0]);
            return;
        }
        int[] iArr = new int[readableArray.size()];
        for (int i10 = 0; i10 < readableArray.size(); i10++) {
            if (readableArray.getType(i10) == ReadableType.Map) {
                iArr[i10] = ColorPropConverter.getColor(readableArray.getMap(i10), aVar.getContext()).intValue();
            } else {
                iArr[i10] = readableArray.getInt(i10);
            }
        }
        aVar.setColorSchemeColors(iArr);
    }

    @Override // h5.InterfaceC3242f
    @Z4.a(defaultBoolean = true, name = AppConstants.VIDEO_RECORDING_ENABLED)
    public void setEnabled(com.facebook.react.views.swiperefresh.a aVar, boolean z10) {
        aVar.setEnabled(z10);
    }

    @Override // h5.InterfaceC3242f
    public void setNativeRefreshing(com.facebook.react.views.swiperefresh.a aVar, boolean z10) {
        setRefreshing(aVar, z10);
    }

    @Override // h5.InterfaceC3242f
    @Z4.a(customType = "Color", name = "progressBackgroundColor")
    public void setProgressBackgroundColor(com.facebook.react.views.swiperefresh.a aVar, Integer num) {
        aVar.setProgressBackgroundColorSchemeColor(num == null ? 0 : num.intValue());
    }

    @Override // h5.InterfaceC3242f
    @Z4.a(defaultFloat = 0.0f, name = "progressViewOffset")
    public void setProgressViewOffset(com.facebook.react.views.swiperefresh.a aVar, float f10) {
        aVar.setProgressViewOffset(f10);
    }

    @Override // h5.InterfaceC3242f
    @Z4.a(name = "refreshing")
    public void setRefreshing(com.facebook.react.views.swiperefresh.a aVar, boolean z10) {
        aVar.setRefreshing(z10);
    }

    public void setSize(com.facebook.react.views.swiperefresh.a aVar, int i10) {
        aVar.setSize(i10);
    }

    @Override // h5.InterfaceC3242f
    public void setSize(com.facebook.react.views.swiperefresh.a aVar, String str) {
        if (str != null && !str.equals("default")) {
            if (str.equals("large")) {
                aVar.setSize(0);
                return;
            }
            throw new IllegalArgumentException("Size must be 'default' or 'large', received: " + str);
        }
        aVar.setSize(1);
    }

    @Z4.a(name = "size")
    public void setSize(com.facebook.react.views.swiperefresh.a aVar, Dynamic dynamic) {
        if (dynamic.isNull()) {
            aVar.setSize(1);
        } else if (dynamic.getType() == ReadableType.Number) {
            aVar.setSize(dynamic.asInt());
        } else {
            if (dynamic.getType() == ReadableType.String) {
                setSize(aVar, dynamic.asString());
                return;
            }
            throw new IllegalArgumentException("Size must be 'default' or 'large'");
        }
    }
}
