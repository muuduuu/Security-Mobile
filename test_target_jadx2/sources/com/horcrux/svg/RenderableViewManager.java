package com.horcrux.svg;

import android.view.View;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.horcrux.svg.RenderableView;
import com.horcrux.svg.VirtualViewManager;
import com.horcrux.svg.events.SvgLoadEvent;
import h5.A0;
import h5.B0;
import h5.C0;
import h5.C3235b0;
import h5.C3239d0;
import h5.C3243f0;
import h5.C3247h0;
import h5.C3251j0;
import h5.C3255l0;
import h5.C3259n0;
import h5.C3263p0;
import h5.C3266r0;
import h5.C3270t0;
import h5.C3274v0;
import h5.C3278x0;
import h5.C3282z0;
import h5.D0;
import h5.E0;
import h5.F0;
import h5.G0;
import h5.H0;
import h5.I0;
import h5.InterfaceC3233a0;
import h5.InterfaceC3237c0;
import h5.InterfaceC3241e0;
import h5.InterfaceC3245g0;
import h5.InterfaceC3249i0;
import h5.InterfaceC3253k0;
import h5.InterfaceC3257m0;
import h5.InterfaceC3261o0;
import h5.InterfaceC3265q0;
import h5.InterfaceC3268s0;
import h5.InterfaceC3272u0;
import h5.InterfaceC3276w0;
import h5.InterfaceC3280y0;
import h5.J0;
import h5.K0;
import h5.L0;
import h5.M0;
import h5.P0;
import h5.Q0;
import h5.R0;
import h5.S0;
import h5.T0;
import h5.U0;
import h5.V0;
import h5.W0;
import h5.X0;
import h5.Y0;
import java.util.HashMap;
import java.util.Map;
import v4.AbstractC4929e;

/* loaded from: classes2.dex */
class RenderableViewManager<T extends RenderableView> extends VirtualViewManager<T> {

    static class CircleViewManager extends RenderableViewManager<C2899b> implements h5.W {
        public static final String REACT_CLASS = "RNSVGCircle";

        CircleViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGCircle);
            this.mDelegate = new h5.V(this);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.O
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @Override // h5.W
        @Z4.a(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((CircleViewManager) view, str);
        }

        @Override // h5.W
        @Z4.a(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i10) {
            super.setClipRule((CircleViewManager) view, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.W
        @Z4.a(customType = "Color", name = "color")
        public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
            super.setColor((CircleViewManager) view, num);
        }

        @Override // h5.W
        @Z4.a(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((CircleViewManager) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.W
        @Z4.a(name = "fill")
        public /* bridge */ /* synthetic */ void setFill(View view, Dynamic dynamic) {
            super.setFill((CircleViewManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.W
        @Z4.a(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f10) {
            super.setFillOpacity((CircleViewManager) view, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.W
        @Z4.a(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i10) {
            super.setFillRule((CircleViewManager) view, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.W
        @Z4.a(name = "filter")
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            super.setFilter((CircleViewManager) view, str);
        }

        @Override // h5.W
        @Z4.a(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((CircleViewManager) view, str);
        }

        @Override // h5.W
        @Z4.a(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((CircleViewManager) view, str);
        }

        @Override // h5.W
        @Z4.a(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((CircleViewManager) view, str);
        }

        @Override // h5.W
        @Z4.a(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((CircleViewManager) view, str);
        }

        @Override // h5.W
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((CircleViewManager) view, readableArray);
        }

        @Override // h5.W
        @Z4.a(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((CircleViewManager) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.InterfaceC1945h
        @Z4.a(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f10) {
            super.setOpacity((CircleViewManager) view, f10);
        }

        @Override // h5.W
        @Z4.a(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((CircleViewManager) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.W
        @Z4.a(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(View view, ReadableArray readableArray) {
            super.setPropList((CircleViewManager) view, readableArray);
        }

        @Override // h5.W
        @Z4.a(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z10) {
            super.setResponsible((CircleViewManager) view, z10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.W
        @Z4.a(name = "stroke")
        public /* bridge */ /* synthetic */ void setStroke(View view, Dynamic dynamic) {
            super.setStroke((CircleViewManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.W
        @Z4.a(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            super.setStrokeDasharray((CircleViewManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.W
        @Z4.a(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f10) {
            super.setStrokeDashoffset((CircleViewManager) view, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.W
        @Z4.a(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i10) {
            super.setStrokeLinecap((CircleViewManager) view, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.W
        @Z4.a(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i10) {
            super.setStrokeLinejoin((CircleViewManager) view, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.W
        @Z4.a(defaultFloat = 4.0f, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f10) {
            super.setStrokeMiterlimit((CircleViewManager) view, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.W
        @Z4.a(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f10) {
            super.setStrokeOpacity((CircleViewManager) view, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.W
        @Z4.a(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            super.setStrokeWidth((CircleViewManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.W
        @Z4.a(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i10) {
            super.setVectorEffect((CircleViewManager) view, i10);
        }

        @Override // h5.W
        @Z4.a(name = "cx")
        public void setCx(C2899b c2899b, Dynamic dynamic) {
            c2899b.r(dynamic);
        }

        @Override // h5.W
        @Z4.a(name = "cy")
        public void setCy(C2899b c2899b, Dynamic dynamic) {
            c2899b.s(dynamic);
        }

        @Override // h5.W
        @Z4.a(name = "r")
        public void setR(C2899b c2899b, Dynamic dynamic) {
            c2899b.t(dynamic);
        }
    }

    static class ClipPathViewManager extends GroupViewManagerAbstract<C2900c> implements h5.Y {
        public static final String REACT_CLASS = "RNSVGClipPath";

        ClipPathViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGClipPath);
            this.mDelegate = new h5.X(this);
        }

        @Override // com.horcrux.svg.RenderableViewManager.GroupViewManagerAbstract, com.horcrux.svg.RenderableViewManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.O
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @Override // h5.Y
        @Z4.a(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((ClipPathViewManager) view, str);
        }

        @Override // h5.Y
        @Z4.a(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i10) {
            super.setClipRule((ClipPathViewManager) view, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.Y
        @Z4.a(customType = "Color", name = "color")
        public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
            super.setColor((ClipPathViewManager) view, num);
        }

        @Override // h5.Y
        @Z4.a(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((ClipPathViewManager) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.Y
        @Z4.a(name = "fill")
        public /* bridge */ /* synthetic */ void setFill(View view, Dynamic dynamic) {
            super.setFill((ClipPathViewManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.Y
        @Z4.a(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f10) {
            super.setFillOpacity((ClipPathViewManager) view, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.Y
        @Z4.a(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i10) {
            super.setFillRule((ClipPathViewManager) view, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.Y
        @Z4.a(name = "filter")
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            super.setFilter((ClipPathViewManager) view, str);
        }

        @Override // h5.Y
        @Z4.a(name = "font")
        public /* bridge */ /* synthetic */ void setFont(View view, Dynamic dynamic) {
            super.setFont((ClipPathViewManager) view, dynamic);
        }

        @Override // h5.Y
        @Z4.a(name = "fontSize")
        public /* bridge */ /* synthetic */ void setFontSize(View view, Dynamic dynamic) {
            super.setFontSize((ClipPathViewManager) view, dynamic);
        }

        @Override // h5.Y
        @Z4.a(name = "fontWeight")
        public /* bridge */ /* synthetic */ void setFontWeight(View view, Dynamic dynamic) {
            super.setFontWeight((ClipPathViewManager) view, dynamic);
        }

        @Override // h5.Y
        @Z4.a(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((ClipPathViewManager) view, str);
        }

        @Override // h5.Y
        @Z4.a(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((ClipPathViewManager) view, str);
        }

        @Override // h5.Y
        @Z4.a(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((ClipPathViewManager) view, str);
        }

        @Override // h5.Y
        @Z4.a(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((ClipPathViewManager) view, str);
        }

        @Override // h5.Y
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((ClipPathViewManager) view, readableArray);
        }

        @Override // h5.Y
        @Z4.a(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((ClipPathViewManager) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.InterfaceC1945h
        @Z4.a(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f10) {
            super.setOpacity((ClipPathViewManager) view, f10);
        }

        @Override // h5.Y
        @Z4.a(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((ClipPathViewManager) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.Y
        @Z4.a(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(View view, ReadableArray readableArray) {
            super.setPropList((ClipPathViewManager) view, readableArray);
        }

        @Override // h5.Y
        @Z4.a(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z10) {
            super.setResponsible((ClipPathViewManager) view, z10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.Y
        @Z4.a(name = "stroke")
        public /* bridge */ /* synthetic */ void setStroke(View view, Dynamic dynamic) {
            super.setStroke((ClipPathViewManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.Y
        @Z4.a(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            super.setStrokeDasharray((ClipPathViewManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.Y
        @Z4.a(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f10) {
            super.setStrokeDashoffset((ClipPathViewManager) view, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.Y
        @Z4.a(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i10) {
            super.setStrokeLinecap((ClipPathViewManager) view, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.Y
        @Z4.a(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i10) {
            super.setStrokeLinejoin((ClipPathViewManager) view, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.Y
        @Z4.a(defaultFloat = 4.0f, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f10) {
            super.setStrokeMiterlimit((ClipPathViewManager) view, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.Y
        @Z4.a(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f10) {
            super.setStrokeOpacity((ClipPathViewManager) view, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.Y
        @Z4.a(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            super.setStrokeWidth((ClipPathViewManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.Y
        @Z4.a(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i10) {
            super.setVectorEffect((ClipPathViewManager) view, i10);
        }
    }

    static class DefsViewManager extends VirtualViewManager<C2903f> implements InterfaceC3233a0 {
        public static final String REACT_CLASS = "RNSVGDefs";

        DefsViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGDefs);
            this.mDelegate = new h5.Z(this);
        }

        @Override // com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.O
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @Override // h5.InterfaceC3233a0
        @Z4.a(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((DefsViewManager) view, str);
        }

        @Override // h5.InterfaceC3233a0
        @Z4.a(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i10) {
            super.setClipRule((DefsViewManager) view, i10);
        }

        @Override // h5.InterfaceC3233a0
        @Z4.a(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((DefsViewManager) view, str);
        }

        @Override // h5.InterfaceC3233a0
        @Z4.a(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((DefsViewManager) view, str);
        }

        @Override // h5.InterfaceC3233a0
        @Z4.a(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((DefsViewManager) view, str);
        }

        @Override // h5.InterfaceC3233a0
        @Z4.a(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((DefsViewManager) view, str);
        }

        @Override // h5.InterfaceC3233a0
        @Z4.a(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((DefsViewManager) view, str);
        }

        @Override // h5.InterfaceC3233a0
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((DefsViewManager) view, readableArray);
        }

        @Override // h5.InterfaceC3233a0
        @Z4.a(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((DefsViewManager) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.InterfaceC1945h
        @Z4.a(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f10) {
            super.setOpacity((DefsViewManager) view, f10);
        }

        @Override // h5.InterfaceC3233a0
        @Z4.a(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((DefsViewManager) view, str);
        }

        @Override // h5.InterfaceC3233a0
        @Z4.a(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z10) {
            super.setResponsible((DefsViewManager) view, z10);
        }
    }

    static class EllipseViewManager extends RenderableViewManager<C2905h> implements InterfaceC3237c0 {
        public static final String REACT_CLASS = "RNSVGEllipse";

        EllipseViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGEllipse);
            this.mDelegate = new C3235b0(this);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.O
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @Override // h5.InterfaceC3237c0
        @Z4.a(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((EllipseViewManager) view, str);
        }

        @Override // h5.InterfaceC3237c0
        @Z4.a(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i10) {
            super.setClipRule((EllipseViewManager) view, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.InterfaceC3237c0
        @Z4.a(customType = "Color", name = "color")
        public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
            super.setColor((EllipseViewManager) view, num);
        }

        @Override // h5.InterfaceC3237c0
        @Z4.a(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((EllipseViewManager) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.InterfaceC3237c0
        @Z4.a(name = "fill")
        public /* bridge */ /* synthetic */ void setFill(View view, Dynamic dynamic) {
            super.setFill((EllipseViewManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.InterfaceC3237c0
        @Z4.a(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f10) {
            super.setFillOpacity((EllipseViewManager) view, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.InterfaceC3237c0
        @Z4.a(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i10) {
            super.setFillRule((EllipseViewManager) view, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.InterfaceC3237c0
        @Z4.a(name = "filter")
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            super.setFilter((EllipseViewManager) view, str);
        }

        @Override // h5.InterfaceC3237c0
        @Z4.a(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((EllipseViewManager) view, str);
        }

        @Override // h5.InterfaceC3237c0
        @Z4.a(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((EllipseViewManager) view, str);
        }

        @Override // h5.InterfaceC3237c0
        @Z4.a(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((EllipseViewManager) view, str);
        }

        @Override // h5.InterfaceC3237c0
        @Z4.a(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((EllipseViewManager) view, str);
        }

        @Override // h5.InterfaceC3237c0
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((EllipseViewManager) view, readableArray);
        }

        @Override // h5.InterfaceC3237c0
        @Z4.a(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((EllipseViewManager) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.InterfaceC1945h
        @Z4.a(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f10) {
            super.setOpacity((EllipseViewManager) view, f10);
        }

        @Override // h5.InterfaceC3237c0
        @Z4.a(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((EllipseViewManager) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.InterfaceC3237c0
        @Z4.a(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(View view, ReadableArray readableArray) {
            super.setPropList((EllipseViewManager) view, readableArray);
        }

        @Override // h5.InterfaceC3237c0
        @Z4.a(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z10) {
            super.setResponsible((EllipseViewManager) view, z10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.InterfaceC3237c0
        @Z4.a(name = "stroke")
        public /* bridge */ /* synthetic */ void setStroke(View view, Dynamic dynamic) {
            super.setStroke((EllipseViewManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.InterfaceC3237c0
        @Z4.a(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            super.setStrokeDasharray((EllipseViewManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.InterfaceC3237c0
        @Z4.a(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f10) {
            super.setStrokeDashoffset((EllipseViewManager) view, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.InterfaceC3237c0
        @Z4.a(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i10) {
            super.setStrokeLinecap((EllipseViewManager) view, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.InterfaceC3237c0
        @Z4.a(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i10) {
            super.setStrokeLinejoin((EllipseViewManager) view, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.InterfaceC3237c0
        @Z4.a(defaultFloat = 4.0f, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f10) {
            super.setStrokeMiterlimit((EllipseViewManager) view, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.InterfaceC3237c0
        @Z4.a(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f10) {
            super.setStrokeOpacity((EllipseViewManager) view, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.InterfaceC3237c0
        @Z4.a(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            super.setStrokeWidth((EllipseViewManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.InterfaceC3237c0
        @Z4.a(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i10) {
            super.setVectorEffect((EllipseViewManager) view, i10);
        }

        @Override // h5.InterfaceC3237c0
        @Z4.a(name = "cx")
        public void setCx(C2905h c2905h, Dynamic dynamic) {
            c2905h.r(dynamic);
        }

        @Override // h5.InterfaceC3237c0
        @Z4.a(name = "cy")
        public void setCy(C2905h c2905h, Dynamic dynamic) {
            c2905h.s(dynamic);
        }

        @Override // h5.InterfaceC3237c0
        @Z4.a(name = "rx")
        public void setRx(C2905h c2905h, Dynamic dynamic) {
            c2905h.t(dynamic);
        }

        @Override // h5.InterfaceC3237c0
        @Z4.a(name = "ry")
        public void setRy(C2905h c2905h, Dynamic dynamic) {
            c2905h.u(dynamic);
        }
    }

    static class FeBlendManager extends FilterPrimitiveManager<C2907j> implements InterfaceC3241e0 {
        public static final String REACT_CLASS = "RNSVGFeBlend";

        FeBlendManager() {
            super(VirtualViewManager.SVGClass.RNSVGFeBlend);
            this.mDelegate = new C3239d0(this);
        }

        @Override // com.horcrux.svg.RenderableViewManager.FilterPrimitiveManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.O
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @Override // h5.InterfaceC3241e0
        @Z4.a(name = "height")
        public /* bridge */ /* synthetic */ void setHeight(View view, Dynamic dynamic) {
            super.setHeight((FeBlendManager) view, dynamic);
        }

        @Override // h5.InterfaceC3241e0
        @Z4.a(name = "result")
        public /* bridge */ /* synthetic */ void setResult(View view, String str) {
            super.setResult((FeBlendManager) view, str);
        }

        @Override // h5.InterfaceC3241e0
        @Z4.a(name = "width")
        public /* bridge */ /* synthetic */ void setWidth(View view, Dynamic dynamic) {
            super.setWidth((FeBlendManager) view, dynamic);
        }

        @Override // h5.InterfaceC3241e0
        @Z4.a(name = "x")
        public /* bridge */ /* synthetic */ void setX(View view, Dynamic dynamic) {
            super.setX((FeBlendManager) view, dynamic);
        }

        @Override // h5.InterfaceC3241e0
        @Z4.a(name = "y")
        public /* bridge */ /* synthetic */ void setY(View view, Dynamic dynamic) {
            super.setY((FeBlendManager) view, dynamic);
        }

        @Override // h5.InterfaceC3241e0
        @Z4.a(name = "in1")
        public void setIn1(C2907j c2907j, String str) {
            c2907j.B(str);
        }

        @Override // h5.InterfaceC3241e0
        @Z4.a(name = "in2")
        public void setIn2(C2907j c2907j, String str) {
            c2907j.C(str);
        }

        @Override // h5.InterfaceC3241e0
        @Z4.a(name = "mode")
        public void setMode(C2907j c2907j, String str) {
            c2907j.setMode(str);
        }
    }

    static class FeColorMatrixManager extends FilterPrimitiveManager<C2908k> implements InterfaceC3245g0 {
        public static final String REACT_CLASS = "RNSVGFeColorMatrix";

        FeColorMatrixManager() {
            super(VirtualViewManager.SVGClass.RNSVGFeColorMatrix);
            this.mDelegate = new C3243f0(this);
        }

        @Override // com.horcrux.svg.RenderableViewManager.FilterPrimitiveManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.O
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @Override // h5.InterfaceC3245g0
        @Z4.a(name = "height")
        public /* bridge */ /* synthetic */ void setHeight(View view, Dynamic dynamic) {
            super.setHeight((FeColorMatrixManager) view, dynamic);
        }

        @Override // h5.InterfaceC3245g0
        @Z4.a(name = "result")
        public /* bridge */ /* synthetic */ void setResult(View view, String str) {
            super.setResult((FeColorMatrixManager) view, str);
        }

        @Override // h5.InterfaceC3245g0
        @Z4.a(name = "width")
        public /* bridge */ /* synthetic */ void setWidth(View view, Dynamic dynamic) {
            super.setWidth((FeColorMatrixManager) view, dynamic);
        }

        @Override // h5.InterfaceC3245g0
        @Z4.a(name = "x")
        public /* bridge */ /* synthetic */ void setX(View view, Dynamic dynamic) {
            super.setX((FeColorMatrixManager) view, dynamic);
        }

        @Override // h5.InterfaceC3245g0
        @Z4.a(name = "y")
        public /* bridge */ /* synthetic */ void setY(View view, Dynamic dynamic) {
            super.setY((FeColorMatrixManager) view, dynamic);
        }

        @Override // h5.InterfaceC3245g0
        @Z4.a(name = "in1")
        public void setIn1(C2908k c2908k, String str) {
            c2908k.z(str);
        }

        @Override // h5.InterfaceC3245g0
        @Z4.a(name = "type")
        public void setType(C2908k c2908k, String str) {
            c2908k.A(str);
        }

        @Override // h5.InterfaceC3245g0
        @Z4.a(name = "values")
        public void setValues(C2908k c2908k, ReadableArray readableArray) {
            c2908k.B(readableArray);
        }
    }

    static class FeFloodManager extends FilterPrimitiveManager<C2909l> implements InterfaceC3249i0 {
        public static final String REACT_CLASS = "RNSVGFeFlood";

        FeFloodManager() {
            super(VirtualViewManager.SVGClass.RNSVGFeFlood);
            this.mDelegate = new C3247h0(this);
        }

        @Override // com.horcrux.svg.RenderableViewManager.FilterPrimitiveManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.O
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @Override // h5.InterfaceC3249i0
        @Z4.a(name = "height")
        public /* bridge */ /* synthetic */ void setHeight(View view, Dynamic dynamic) {
            super.setHeight((FeFloodManager) view, dynamic);
        }

        @Override // h5.InterfaceC3249i0
        @Z4.a(name = "result")
        public /* bridge */ /* synthetic */ void setResult(View view, String str) {
            super.setResult((FeFloodManager) view, str);
        }

        @Override // h5.InterfaceC3249i0
        @Z4.a(name = "width")
        public /* bridge */ /* synthetic */ void setWidth(View view, Dynamic dynamic) {
            super.setWidth((FeFloodManager) view, dynamic);
        }

        @Override // h5.InterfaceC3249i0
        @Z4.a(name = "x")
        public /* bridge */ /* synthetic */ void setX(View view, Dynamic dynamic) {
            super.setX((FeFloodManager) view, dynamic);
        }

        @Override // h5.InterfaceC3249i0
        @Z4.a(name = "y")
        public /* bridge */ /* synthetic */ void setY(View view, Dynamic dynamic) {
            super.setY((FeFloodManager) view, dynamic);
        }

        @Override // h5.InterfaceC3249i0
        @Z4.a(name = "floodColor")
        public void setFloodColor(C2909l c2909l, Dynamic dynamic) {
            c2909l.z(dynamic);
        }

        @Override // h5.InterfaceC3249i0
        @Z4.a(defaultFloat = 1.0f, name = "floodOpacity")
        public void setFloodOpacity(C2909l c2909l, float f10) {
            c2909l.B(f10);
        }

        public void setFloodColor(C2909l c2909l, ReadableMap readableMap) {
            c2909l.A(readableMap);
        }
    }

    static class FeGaussianBlurManager extends FilterPrimitiveManager<C2910m> implements InterfaceC3253k0 {
        public static final String REACT_CLASS = "RNSVGFeGaussianBlur";

        FeGaussianBlurManager() {
            super(VirtualViewManager.SVGClass.RNSVGFeGaussianBlur);
            this.mDelegate = new C3251j0(this);
        }

        @Override // com.horcrux.svg.RenderableViewManager.FilterPrimitiveManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.O
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @Override // h5.InterfaceC3253k0
        @Z4.a(name = "height")
        public /* bridge */ /* synthetic */ void setHeight(View view, Dynamic dynamic) {
            super.setHeight((FeGaussianBlurManager) view, dynamic);
        }

        @Override // h5.InterfaceC3253k0
        @Z4.a(name = "result")
        public /* bridge */ /* synthetic */ void setResult(View view, String str) {
            super.setResult((FeGaussianBlurManager) view, str);
        }

        @Override // h5.InterfaceC3253k0
        @Z4.a(name = "width")
        public /* bridge */ /* synthetic */ void setWidth(View view, Dynamic dynamic) {
            super.setWidth((FeGaussianBlurManager) view, dynamic);
        }

        @Override // h5.InterfaceC3253k0
        @Z4.a(name = "x")
        public /* bridge */ /* synthetic */ void setX(View view, Dynamic dynamic) {
            super.setX((FeGaussianBlurManager) view, dynamic);
        }

        @Override // h5.InterfaceC3253k0
        @Z4.a(name = "y")
        public /* bridge */ /* synthetic */ void setY(View view, Dynamic dynamic) {
            super.setY((FeGaussianBlurManager) view, dynamic);
        }

        @Override // h5.InterfaceC3253k0
        @Z4.a(name = "values")
        public void setEdgeMode(C2910m c2910m, String str) {
            c2910m.A(str);
        }

        @Override // h5.InterfaceC3253k0
        @Z4.a(name = "in1")
        public void setIn1(C2910m c2910m, String str) {
            c2910m.B(str);
        }

        @Override // h5.InterfaceC3253k0
        @Z4.a(name = "stdDeviationX")
        public void setStdDeviationX(C2910m c2910m, float f10) {
            c2910m.C(f10);
        }

        @Override // h5.InterfaceC3253k0
        @Z4.a(name = "stdDeviationY")
        public void setStdDeviationY(C2910m c2910m, float f10) {
            c2910m.D(f10);
        }
    }

    static class FeMergeManager extends FilterPrimitiveManager<C2911n> implements InterfaceC3257m0 {
        public static final String REACT_CLASS = "RNSVGFeMerge";

        FeMergeManager() {
            super(VirtualViewManager.SVGClass.RNSVGFeMerge);
            this.mDelegate = new C3255l0(this);
        }

        @Override // com.horcrux.svg.RenderableViewManager.FilterPrimitiveManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.O
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @Override // h5.InterfaceC3257m0
        @Z4.a(name = "height")
        public /* bridge */ /* synthetic */ void setHeight(View view, Dynamic dynamic) {
            super.setHeight((FeMergeManager) view, dynamic);
        }

        @Override // h5.InterfaceC3257m0
        @Z4.a(name = "result")
        public /* bridge */ /* synthetic */ void setResult(View view, String str) {
            super.setResult((FeMergeManager) view, str);
        }

        @Override // h5.InterfaceC3257m0
        @Z4.a(name = "width")
        public /* bridge */ /* synthetic */ void setWidth(View view, Dynamic dynamic) {
            super.setWidth((FeMergeManager) view, dynamic);
        }

        @Override // h5.InterfaceC3257m0
        @Z4.a(name = "x")
        public /* bridge */ /* synthetic */ void setX(View view, Dynamic dynamic) {
            super.setX((FeMergeManager) view, dynamic);
        }

        @Override // h5.InterfaceC3257m0
        @Z4.a(name = "y")
        public /* bridge */ /* synthetic */ void setY(View view, Dynamic dynamic) {
            super.setY((FeMergeManager) view, dynamic);
        }

        @Override // h5.InterfaceC3257m0
        @Z4.a(name = "nodes")
        public void setNodes(C2911n c2911n, ReadableArray readableArray) {
            c2911n.z(readableArray);
        }
    }

    static class FeOffsetManager extends FilterPrimitiveManager<C2912o> implements InterfaceC3261o0 {
        public static final String REACT_CLASS = "RNSVGFeOffset";

        FeOffsetManager() {
            super(VirtualViewManager.SVGClass.RNSVGFeOffset);
            this.mDelegate = new C3259n0(this);
        }

        @Override // com.horcrux.svg.RenderableViewManager.FilterPrimitiveManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.O
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @Override // h5.InterfaceC3261o0
        @Z4.a(name = "height")
        public /* bridge */ /* synthetic */ void setHeight(View view, Dynamic dynamic) {
            super.setHeight((FeOffsetManager) view, dynamic);
        }

        @Override // h5.InterfaceC3261o0
        @Z4.a(name = "result")
        public /* bridge */ /* synthetic */ void setResult(View view, String str) {
            super.setResult((FeOffsetManager) view, str);
        }

        @Override // h5.InterfaceC3261o0
        @Z4.a(name = "width")
        public /* bridge */ /* synthetic */ void setWidth(View view, Dynamic dynamic) {
            super.setWidth((FeOffsetManager) view, dynamic);
        }

        @Override // h5.InterfaceC3261o0
        @Z4.a(name = "x")
        public /* bridge */ /* synthetic */ void setX(View view, Dynamic dynamic) {
            super.setX((FeOffsetManager) view, dynamic);
        }

        @Override // h5.InterfaceC3261o0
        @Z4.a(name = "y")
        public /* bridge */ /* synthetic */ void setY(View view, Dynamic dynamic) {
            super.setY((FeOffsetManager) view, dynamic);
        }

        @Override // h5.InterfaceC3261o0
        @Z4.a(name = "dx")
        public void setDx(C2912o c2912o, Dynamic dynamic) {
            c2912o.z(dynamic);
        }

        @Override // h5.InterfaceC3261o0
        @Z4.a(name = "dy")
        public void setDy(C2912o c2912o, Dynamic dynamic) {
            c2912o.A(dynamic);
        }

        @Override // h5.InterfaceC3261o0
        @Z4.a(name = "in1")
        public void setIn1(C2912o c2912o, String str) {
            c2912o.B(str);
        }
    }

    static class FilterManager extends VirtualViewManager<C2918u> implements InterfaceC3265q0 {
        public static final String REACT_CLASS = "RNSVGFilter";

        FilterManager() {
            super(VirtualViewManager.SVGClass.RNSVGFilter);
            this.mDelegate = new C3263p0(this);
        }

        @Override // com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.O
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @Override // h5.InterfaceC3265q0
        @Z4.a(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((FilterManager) view, str);
        }

        @Override // h5.InterfaceC3265q0
        @Z4.a(name = "filterUnits")
        public void setFilterUnits(C2918u c2918u, String str) {
            c2918u.s(str);
        }

        @Override // h5.InterfaceC3265q0
        @Z4.a(name = "height")
        public void setHeight(C2918u c2918u, Dynamic dynamic) {
            c2918u.t(dynamic);
        }

        @Override // h5.InterfaceC3265q0
        @Z4.a(name = "primitiveUnits")
        public void setPrimitiveUnits(C2918u c2918u, String str) {
            c2918u.u(str);
        }

        @Override // h5.InterfaceC3265q0
        @Z4.a(name = "width")
        public void setWidth(C2918u c2918u, Dynamic dynamic) {
            c2918u.v(dynamic);
        }

        @Override // h5.InterfaceC3265q0
        @Z4.a(name = "x")
        public void setX(C2918u c2918u, Dynamic dynamic) {
            c2918u.w(dynamic);
        }

        @Override // h5.InterfaceC3265q0
        @Z4.a(name = "y")
        public void setY(C2918u c2918u, Dynamic dynamic) {
            c2918u.x(dynamic);
        }
    }

    static class FilterPrimitiveManager<T extends AbstractC2913p> extends VirtualViewManager<T> {
        protected FilterPrimitiveManager(VirtualViewManager.SVGClass sVGClass) {
            super(sVGClass);
        }

        @Override // com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.O
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @Z4.a(name = "height")
        public void setHeight(T t10, Dynamic dynamic) {
            t10.u(dynamic);
        }

        @Z4.a(name = "result")
        public void setResult(T t10, String str) {
            t10.v(str);
        }

        @Z4.a(name = "width")
        public void setWidth(T t10, Dynamic dynamic) {
            t10.w(dynamic);
        }

        @Z4.a(name = "x")
        public void setX(T t10, Dynamic dynamic) {
            t10.x(dynamic);
        }

        @Z4.a(name = "y")
        public void setY(T t10, Dynamic dynamic) {
            t10.y(dynamic);
        }
    }

    static class ForeignObjectManager extends GroupViewManagerAbstract<C2920w> implements InterfaceC3268s0 {
        public static final String REACT_CLASS = "RNSVGForeignObject";

        ForeignObjectManager() {
            super(VirtualViewManager.SVGClass.RNSVGForeignObject);
            this.mDelegate = new C3266r0(this);
        }

        @Override // com.horcrux.svg.RenderableViewManager.GroupViewManagerAbstract, com.horcrux.svg.RenderableViewManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.O
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @Override // h5.InterfaceC3268s0
        @Z4.a(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((ForeignObjectManager) view, str);
        }

        @Override // h5.InterfaceC3268s0
        @Z4.a(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i10) {
            super.setClipRule((ForeignObjectManager) view, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.InterfaceC3268s0
        @Z4.a(customType = "Color", name = "color")
        public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
            super.setColor((ForeignObjectManager) view, num);
        }

        @Override // h5.InterfaceC3268s0
        @Z4.a(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((ForeignObjectManager) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.InterfaceC3268s0
        @Z4.a(name = "fill")
        public /* bridge */ /* synthetic */ void setFill(View view, Dynamic dynamic) {
            super.setFill((ForeignObjectManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.InterfaceC3268s0
        @Z4.a(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f10) {
            super.setFillOpacity((ForeignObjectManager) view, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.InterfaceC3268s0
        @Z4.a(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i10) {
            super.setFillRule((ForeignObjectManager) view, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.InterfaceC3268s0
        @Z4.a(name = "filter")
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            super.setFilter((ForeignObjectManager) view, str);
        }

        @Override // h5.InterfaceC3268s0
        @Z4.a(name = "font")
        public /* bridge */ /* synthetic */ void setFont(View view, Dynamic dynamic) {
            super.setFont((ForeignObjectManager) view, dynamic);
        }

        @Override // h5.InterfaceC3268s0
        @Z4.a(name = "fontSize")
        public /* bridge */ /* synthetic */ void setFontSize(View view, Dynamic dynamic) {
            super.setFontSize((ForeignObjectManager) view, dynamic);
        }

        @Override // h5.InterfaceC3268s0
        @Z4.a(name = "fontWeight")
        public /* bridge */ /* synthetic */ void setFontWeight(View view, Dynamic dynamic) {
            super.setFontWeight((ForeignObjectManager) view, dynamic);
        }

        @Override // h5.InterfaceC3268s0
        @Z4.a(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((ForeignObjectManager) view, str);
        }

        @Override // h5.InterfaceC3268s0
        @Z4.a(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((ForeignObjectManager) view, str);
        }

        @Override // h5.InterfaceC3268s0
        @Z4.a(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((ForeignObjectManager) view, str);
        }

        @Override // h5.InterfaceC3268s0
        @Z4.a(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((ForeignObjectManager) view, str);
        }

        @Override // h5.InterfaceC3268s0
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((ForeignObjectManager) view, readableArray);
        }

        @Override // h5.InterfaceC3268s0
        @Z4.a(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((ForeignObjectManager) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.InterfaceC1945h
        @Z4.a(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f10) {
            super.setOpacity((ForeignObjectManager) view, f10);
        }

        @Override // h5.InterfaceC3268s0
        @Z4.a(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((ForeignObjectManager) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.InterfaceC3268s0
        @Z4.a(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(View view, ReadableArray readableArray) {
            super.setPropList((ForeignObjectManager) view, readableArray);
        }

        @Override // h5.InterfaceC3268s0
        @Z4.a(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z10) {
            super.setResponsible((ForeignObjectManager) view, z10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.InterfaceC3268s0
        @Z4.a(name = "stroke")
        public /* bridge */ /* synthetic */ void setStroke(View view, Dynamic dynamic) {
            super.setStroke((ForeignObjectManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.InterfaceC3268s0
        @Z4.a(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            super.setStrokeDasharray((ForeignObjectManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.InterfaceC3268s0
        @Z4.a(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f10) {
            super.setStrokeDashoffset((ForeignObjectManager) view, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.InterfaceC3268s0
        @Z4.a(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i10) {
            super.setStrokeLinecap((ForeignObjectManager) view, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.InterfaceC3268s0
        @Z4.a(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i10) {
            super.setStrokeLinejoin((ForeignObjectManager) view, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.InterfaceC3268s0
        @Z4.a(defaultFloat = 4.0f, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f10) {
            super.setStrokeMiterlimit((ForeignObjectManager) view, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.InterfaceC3268s0
        @Z4.a(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f10) {
            super.setStrokeOpacity((ForeignObjectManager) view, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.InterfaceC3268s0
        @Z4.a(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            super.setStrokeWidth((ForeignObjectManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.InterfaceC3268s0
        @Z4.a(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i10) {
            super.setVectorEffect((ForeignObjectManager) view, i10);
        }

        @Override // h5.InterfaceC3268s0
        @Z4.a(name = "height")
        public void setHeight(C2920w c2920w, Dynamic dynamic) {
            c2920w.C(dynamic);
        }

        @Override // h5.InterfaceC3268s0
        @Z4.a(name = "width")
        public void setWidth(C2920w c2920w, Dynamic dynamic) {
            c2920w.D(dynamic);
        }

        @Override // h5.InterfaceC3268s0
        @Z4.a(name = "x")
        public void setX(C2920w c2920w, Dynamic dynamic) {
            c2920w.E(dynamic);
        }

        @Override // h5.InterfaceC3268s0
        @Z4.a(name = "y")
        public void setY(C2920w c2920w, Dynamic dynamic) {
            c2920w.F(dynamic);
        }
    }

    static class GroupViewManager extends GroupViewManagerAbstract<C2923z> implements InterfaceC3272u0 {
        public static final String REACT_CLASS = "RNSVGGroup";

        GroupViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGGroup);
            this.mDelegate = new C3270t0(this);
        }

        @Override // com.horcrux.svg.RenderableViewManager.GroupViewManagerAbstract, com.horcrux.svg.RenderableViewManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.O
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @Override // h5.InterfaceC3272u0
        @Z4.a(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((GroupViewManager) view, str);
        }

        @Override // h5.InterfaceC3272u0
        @Z4.a(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i10) {
            super.setClipRule((GroupViewManager) view, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.InterfaceC3272u0
        @Z4.a(customType = "Color", name = "color")
        public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
            super.setColor((GroupViewManager) view, num);
        }

        @Override // h5.InterfaceC3272u0
        @Z4.a(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((GroupViewManager) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.InterfaceC3272u0
        @Z4.a(name = "fill")
        public /* bridge */ /* synthetic */ void setFill(View view, Dynamic dynamic) {
            super.setFill((GroupViewManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.InterfaceC3272u0
        @Z4.a(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f10) {
            super.setFillOpacity((GroupViewManager) view, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.InterfaceC3272u0
        @Z4.a(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i10) {
            super.setFillRule((GroupViewManager) view, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.InterfaceC3272u0
        @Z4.a(name = "filter")
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            super.setFilter((GroupViewManager) view, str);
        }

        @Override // h5.InterfaceC3272u0
        @Z4.a(name = "font")
        public /* bridge */ /* synthetic */ void setFont(View view, Dynamic dynamic) {
            super.setFont((GroupViewManager) view, dynamic);
        }

        @Override // h5.InterfaceC3272u0
        @Z4.a(name = "fontSize")
        public /* bridge */ /* synthetic */ void setFontSize(View view, Dynamic dynamic) {
            super.setFontSize((GroupViewManager) view, dynamic);
        }

        @Override // h5.InterfaceC3272u0
        @Z4.a(name = "fontWeight")
        public /* bridge */ /* synthetic */ void setFontWeight(View view, Dynamic dynamic) {
            super.setFontWeight((GroupViewManager) view, dynamic);
        }

        @Override // h5.InterfaceC3272u0
        @Z4.a(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((GroupViewManager) view, str);
        }

        @Override // h5.InterfaceC3272u0
        @Z4.a(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((GroupViewManager) view, str);
        }

        @Override // h5.InterfaceC3272u0
        @Z4.a(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((GroupViewManager) view, str);
        }

        @Override // h5.InterfaceC3272u0
        @Z4.a(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((GroupViewManager) view, str);
        }

        @Override // h5.InterfaceC3272u0
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((GroupViewManager) view, readableArray);
        }

        @Override // h5.InterfaceC3272u0
        @Z4.a(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((GroupViewManager) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.InterfaceC1945h
        @Z4.a(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f10) {
            super.setOpacity((GroupViewManager) view, f10);
        }

        @Override // h5.InterfaceC3272u0
        @Z4.a(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((GroupViewManager) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.InterfaceC3272u0
        @Z4.a(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(View view, ReadableArray readableArray) {
            super.setPropList((GroupViewManager) view, readableArray);
        }

        @Override // h5.InterfaceC3272u0
        @Z4.a(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z10) {
            super.setResponsible((GroupViewManager) view, z10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.InterfaceC3272u0
        @Z4.a(name = "stroke")
        public /* bridge */ /* synthetic */ void setStroke(View view, Dynamic dynamic) {
            super.setStroke((GroupViewManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.InterfaceC3272u0
        @Z4.a(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            super.setStrokeDasharray((GroupViewManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.InterfaceC3272u0
        @Z4.a(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f10) {
            super.setStrokeDashoffset((GroupViewManager) view, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.InterfaceC3272u0
        @Z4.a(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i10) {
            super.setStrokeLinecap((GroupViewManager) view, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.InterfaceC3272u0
        @Z4.a(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i10) {
            super.setStrokeLinejoin((GroupViewManager) view, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.InterfaceC3272u0
        @Z4.a(defaultFloat = 4.0f, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f10) {
            super.setStrokeMiterlimit((GroupViewManager) view, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.InterfaceC3272u0
        @Z4.a(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f10) {
            super.setStrokeOpacity((GroupViewManager) view, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.InterfaceC3272u0
        @Z4.a(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            super.setStrokeWidth((GroupViewManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.InterfaceC3272u0
        @Z4.a(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i10) {
            super.setVectorEffect((GroupViewManager) view, i10);
        }
    }

    static class GroupViewManagerAbstract<U extends C2923z> extends RenderableViewManager<U> {
        GroupViewManagerAbstract(VirtualViewManager.SVGClass sVGClass) {
            super(sVGClass);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.O
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @Z4.a(name = "font")
        public void setFont(U u10, Dynamic dynamic) {
            u10.z(dynamic);
        }

        @Z4.a(name = "fontSize")
        public void setFontSize(U u10, Dynamic dynamic) {
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            int i10 = a.f28945a[dynamic.getType().ordinal()];
            if (i10 == 1) {
                javaOnlyMap.putDouble("fontSize", dynamic.asDouble());
            } else if (i10 != 2) {
                return;
            } else {
                javaOnlyMap.putString("fontSize", dynamic.asString());
            }
            u10.A(javaOnlyMap);
        }

        @Z4.a(name = "fontWeight")
        public void setFontWeight(U u10, Dynamic dynamic) {
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            int i10 = a.f28945a[dynamic.getType().ordinal()];
            if (i10 == 1) {
                javaOnlyMap.putDouble("fontWeight", dynamic.asDouble());
            } else if (i10 != 2) {
                return;
            } else {
                javaOnlyMap.putString("fontWeight", dynamic.asString());
            }
            u10.A(javaOnlyMap);
        }
    }

    static class ImageViewManager extends RenderableViewManager<A> implements InterfaceC3276w0 {
        public static final String REACT_CLASS = "RNSVGImage";

        ImageViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGImage);
            this.mDelegate = new C3274v0(this);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
        public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
            HashMap hashMap = new HashMap();
            hashMap.put(SvgLoadEvent.EVENT_NAME, AbstractC4929e.d("registrationName", "onLoad"));
            return hashMap;
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.O
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @Override // h5.InterfaceC3276w0
        @Z4.a(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((ImageViewManager) view, str);
        }

        @Override // h5.InterfaceC3276w0
        @Z4.a(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i10) {
            super.setClipRule((ImageViewManager) view, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.InterfaceC3276w0
        @Z4.a(customType = "Color", name = "color")
        public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
            super.setColor((ImageViewManager) view, num);
        }

        @Override // h5.InterfaceC3276w0
        @Z4.a(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((ImageViewManager) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.InterfaceC3276w0
        @Z4.a(name = "fill")
        public /* bridge */ /* synthetic */ void setFill(View view, Dynamic dynamic) {
            super.setFill((ImageViewManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.InterfaceC3276w0
        @Z4.a(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f10) {
            super.setFillOpacity((ImageViewManager) view, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.InterfaceC3276w0
        @Z4.a(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i10) {
            super.setFillRule((ImageViewManager) view, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.InterfaceC3276w0
        @Z4.a(name = "filter")
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            super.setFilter((ImageViewManager) view, str);
        }

        @Override // h5.InterfaceC3276w0
        @Z4.a(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((ImageViewManager) view, str);
        }

        @Override // h5.InterfaceC3276w0
        @Z4.a(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((ImageViewManager) view, str);
        }

        @Override // h5.InterfaceC3276w0
        @Z4.a(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((ImageViewManager) view, str);
        }

        @Override // h5.InterfaceC3276w0
        @Z4.a(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((ImageViewManager) view, str);
        }

        @Override // h5.InterfaceC3276w0
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((ImageViewManager) view, readableArray);
        }

        @Override // h5.InterfaceC3276w0
        @Z4.a(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((ImageViewManager) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.InterfaceC1945h
        @Z4.a(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f10) {
            super.setOpacity((ImageViewManager) view, f10);
        }

        @Override // h5.InterfaceC3276w0
        @Z4.a(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((ImageViewManager) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.InterfaceC3276w0
        @Z4.a(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(View view, ReadableArray readableArray) {
            super.setPropList((ImageViewManager) view, readableArray);
        }

        @Override // h5.InterfaceC3276w0
        @Z4.a(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z10) {
            super.setResponsible((ImageViewManager) view, z10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.InterfaceC3276w0
        @Z4.a(name = "stroke")
        public /* bridge */ /* synthetic */ void setStroke(View view, Dynamic dynamic) {
            super.setStroke((ImageViewManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.InterfaceC3276w0
        @Z4.a(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            super.setStrokeDasharray((ImageViewManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.InterfaceC3276w0
        @Z4.a(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f10) {
            super.setStrokeDashoffset((ImageViewManager) view, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.InterfaceC3276w0
        @Z4.a(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i10) {
            super.setStrokeLinecap((ImageViewManager) view, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.InterfaceC3276w0
        @Z4.a(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i10) {
            super.setStrokeLinejoin((ImageViewManager) view, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.InterfaceC3276w0
        @Z4.a(defaultFloat = 4.0f, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f10) {
            super.setStrokeMiterlimit((ImageViewManager) view, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.InterfaceC3276w0
        @Z4.a(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f10) {
            super.setStrokeOpacity((ImageViewManager) view, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.InterfaceC3276w0
        @Z4.a(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            super.setStrokeWidth((ImageViewManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.InterfaceC3276w0
        @Z4.a(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i10) {
            super.setVectorEffect((ImageViewManager) view, i10);
        }

        @Override // h5.InterfaceC3276w0
        @Z4.a(name = "align")
        public void setAlign(A a10, String str) {
            a10.setAlign(str);
        }

        @Override // h5.InterfaceC3276w0
        @Z4.a(name = "height")
        public void setHeight(A a10, Dynamic dynamic) {
            a10.w(dynamic);
        }

        @Override // h5.InterfaceC3276w0
        @Z4.a(name = "meetOrSlice")
        public void setMeetOrSlice(A a10, int i10) {
            a10.setMeetOrSlice(i10);
        }

        @Override // h5.InterfaceC3276w0
        @Z4.a(customType = "ImageSource", name = "src")
        public void setSrc(A a10, ReadableMap readableMap) {
            a10.x(readableMap);
        }

        @Override // h5.InterfaceC3276w0
        @Z4.a(name = "width")
        public void setWidth(A a10, Dynamic dynamic) {
            a10.y(dynamic);
        }

        @Override // h5.InterfaceC3276w0
        @Z4.a(name = "x")
        public void setX(A a10, Dynamic dynamic) {
            a10.z(dynamic);
        }

        @Override // h5.InterfaceC3276w0
        @Z4.a(name = "y")
        public void setY(A a10, Dynamic dynamic) {
            a10.A(dynamic);
        }
    }

    static class LineViewManager extends RenderableViewManager<B> implements InterfaceC3280y0 {
        public static final String REACT_CLASS = "RNSVGLine";

        LineViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGLine);
            this.mDelegate = new C3278x0(this);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.O
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @Override // h5.InterfaceC3280y0
        @Z4.a(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((LineViewManager) view, str);
        }

        @Override // h5.InterfaceC3280y0
        @Z4.a(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i10) {
            super.setClipRule((LineViewManager) view, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.InterfaceC3280y0
        @Z4.a(customType = "Color", name = "color")
        public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
            super.setColor((LineViewManager) view, num);
        }

        @Override // h5.InterfaceC3280y0
        @Z4.a(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((LineViewManager) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.InterfaceC3280y0
        @Z4.a(name = "fill")
        public /* bridge */ /* synthetic */ void setFill(View view, Dynamic dynamic) {
            super.setFill((LineViewManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.InterfaceC3280y0
        @Z4.a(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f10) {
            super.setFillOpacity((LineViewManager) view, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.InterfaceC3280y0
        @Z4.a(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i10) {
            super.setFillRule((LineViewManager) view, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.InterfaceC3280y0
        @Z4.a(name = "filter")
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            super.setFilter((LineViewManager) view, str);
        }

        @Override // h5.InterfaceC3280y0
        @Z4.a(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((LineViewManager) view, str);
        }

        @Override // h5.InterfaceC3280y0
        @Z4.a(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((LineViewManager) view, str);
        }

        @Override // h5.InterfaceC3280y0
        @Z4.a(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((LineViewManager) view, str);
        }

        @Override // h5.InterfaceC3280y0
        @Z4.a(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((LineViewManager) view, str);
        }

        @Override // h5.InterfaceC3280y0
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((LineViewManager) view, readableArray);
        }

        @Override // h5.InterfaceC3280y0
        @Z4.a(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((LineViewManager) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.InterfaceC1945h
        @Z4.a(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f10) {
            super.setOpacity((LineViewManager) view, f10);
        }

        @Override // h5.InterfaceC3280y0
        @Z4.a(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((LineViewManager) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.InterfaceC3280y0
        @Z4.a(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(View view, ReadableArray readableArray) {
            super.setPropList((LineViewManager) view, readableArray);
        }

        @Override // h5.InterfaceC3280y0
        @Z4.a(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z10) {
            super.setResponsible((LineViewManager) view, z10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.InterfaceC3280y0
        @Z4.a(name = "stroke")
        public /* bridge */ /* synthetic */ void setStroke(View view, Dynamic dynamic) {
            super.setStroke((LineViewManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.InterfaceC3280y0
        @Z4.a(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            super.setStrokeDasharray((LineViewManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.InterfaceC3280y0
        @Z4.a(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f10) {
            super.setStrokeDashoffset((LineViewManager) view, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.InterfaceC3280y0
        @Z4.a(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i10) {
            super.setStrokeLinecap((LineViewManager) view, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.InterfaceC3280y0
        @Z4.a(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i10) {
            super.setStrokeLinejoin((LineViewManager) view, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.InterfaceC3280y0
        @Z4.a(defaultFloat = 4.0f, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f10) {
            super.setStrokeMiterlimit((LineViewManager) view, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.InterfaceC3280y0
        @Z4.a(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f10) {
            super.setStrokeOpacity((LineViewManager) view, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.InterfaceC3280y0
        @Z4.a(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            super.setStrokeWidth((LineViewManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.InterfaceC3280y0
        @Z4.a(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i10) {
            super.setVectorEffect((LineViewManager) view, i10);
        }

        @Override // h5.InterfaceC3280y0
        @Z4.a(name = "x1")
        public void setX1(B b10, Dynamic dynamic) {
            b10.r(dynamic);
        }

        @Override // h5.InterfaceC3280y0
        @Z4.a(name = "x2")
        public void setX2(B b10, Dynamic dynamic) {
            b10.s(dynamic);
        }

        @Override // h5.InterfaceC3280y0
        @Z4.a(name = "y1")
        public void setY1(B b10, Dynamic dynamic) {
            b10.t(dynamic);
        }

        @Override // h5.InterfaceC3280y0
        @Z4.a(name = "y2")
        public void setY2(B b10, Dynamic dynamic) {
            b10.u(dynamic);
        }
    }

    static class LinearGradientManager extends VirtualViewManager<C> implements A0 {
        public static final String REACT_CLASS = "RNSVGLinearGradient";

        LinearGradientManager() {
            super(VirtualViewManager.SVGClass.RNSVGLinearGradient);
            this.mDelegate = new C3282z0(this);
        }

        @Override // com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.O
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @Override // h5.A0
        @Z4.a(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((LinearGradientManager) view, str);
        }

        @Override // h5.A0
        @Z4.a(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i10) {
            super.setClipRule((LinearGradientManager) view, i10);
        }

        @Override // h5.A0
        @Z4.a(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((LinearGradientManager) view, str);
        }

        @Override // h5.A0
        @Z4.a(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((LinearGradientManager) view, str);
        }

        @Override // h5.A0
        @Z4.a(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((LinearGradientManager) view, str);
        }

        @Override // h5.A0
        @Z4.a(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((LinearGradientManager) view, str);
        }

        @Override // h5.A0
        @Z4.a(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((LinearGradientManager) view, str);
        }

        @Override // h5.A0
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((LinearGradientManager) view, readableArray);
        }

        @Override // h5.A0
        @Z4.a(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((LinearGradientManager) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.InterfaceC1945h
        @Z4.a(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f10) {
            super.setOpacity((LinearGradientManager) view, f10);
        }

        @Override // h5.A0
        @Z4.a(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((LinearGradientManager) view, str);
        }

        @Override // h5.A0
        @Z4.a(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z10) {
            super.setResponsible((LinearGradientManager) view, z10);
        }

        @Override // h5.A0
        @Z4.a(name = "gradient")
        public void setGradient(C c10, ReadableArray readableArray) {
            c10.r(readableArray);
        }

        @Override // h5.A0
        @Z4.a(name = "gradientTransform")
        public void setGradientTransform(C c10, ReadableArray readableArray) {
            c10.s(readableArray);
        }

        @Override // h5.A0
        @Z4.a(name = "gradientUnits")
        public void setGradientUnits(C c10, int i10) {
            c10.t(i10);
        }

        @Override // h5.A0
        @Z4.a(name = "x1")
        public void setX1(C c10, Dynamic dynamic) {
            c10.u(dynamic);
        }

        @Override // h5.A0
        @Z4.a(name = "x2")
        public void setX2(C c10, Dynamic dynamic) {
            c10.v(dynamic);
        }

        @Override // h5.A0
        @Z4.a(name = "y1")
        public void setY1(C c10, Dynamic dynamic) {
            c10.w(dynamic);
        }

        @Override // h5.A0
        @Z4.a(name = "y2")
        public void setY2(C c10, Dynamic dynamic) {
            c10.x(dynamic);
        }
    }

    static class MarkerManager extends GroupViewManagerAbstract<D> implements C0 {
        public static final String REACT_CLASS = "RNSVGMarker";

        MarkerManager() {
            super(VirtualViewManager.SVGClass.RNSVGMarker);
            this.mDelegate = new B0(this);
        }

        @Override // com.horcrux.svg.RenderableViewManager.GroupViewManagerAbstract, com.horcrux.svg.RenderableViewManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.O
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @Override // h5.C0
        @Z4.a(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((MarkerManager) view, str);
        }

        @Override // h5.C0
        @Z4.a(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i10) {
            super.setClipRule((MarkerManager) view, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.C0
        @Z4.a(customType = "Color", name = "color")
        public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
            super.setColor((MarkerManager) view, num);
        }

        @Override // h5.C0
        @Z4.a(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((MarkerManager) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.C0
        @Z4.a(name = "fill")
        public /* bridge */ /* synthetic */ void setFill(View view, Dynamic dynamic) {
            super.setFill((MarkerManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.C0
        @Z4.a(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f10) {
            super.setFillOpacity((MarkerManager) view, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.C0
        @Z4.a(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i10) {
            super.setFillRule((MarkerManager) view, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.C0
        @Z4.a(name = "filter")
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            super.setFilter((MarkerManager) view, str);
        }

        @Override // h5.C0
        @Z4.a(name = "font")
        public /* bridge */ /* synthetic */ void setFont(View view, Dynamic dynamic) {
            super.setFont((MarkerManager) view, dynamic);
        }

        @Override // h5.C0
        @Z4.a(name = "fontSize")
        public /* bridge */ /* synthetic */ void setFontSize(View view, Dynamic dynamic) {
            super.setFontSize((MarkerManager) view, dynamic);
        }

        @Override // h5.C0
        @Z4.a(name = "fontWeight")
        public /* bridge */ /* synthetic */ void setFontWeight(View view, Dynamic dynamic) {
            super.setFontWeight((MarkerManager) view, dynamic);
        }

        @Override // h5.C0
        @Z4.a(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((MarkerManager) view, str);
        }

        @Override // h5.C0
        @Z4.a(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((MarkerManager) view, str);
        }

        @Override // h5.C0
        @Z4.a(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((MarkerManager) view, str);
        }

        @Override // h5.C0
        @Z4.a(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((MarkerManager) view, str);
        }

        @Override // h5.C0
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((MarkerManager) view, readableArray);
        }

        @Override // h5.C0
        @Z4.a(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((MarkerManager) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.InterfaceC1945h
        @Z4.a(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f10) {
            super.setOpacity((MarkerManager) view, f10);
        }

        @Override // h5.C0
        @Z4.a(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((MarkerManager) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.C0
        @Z4.a(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(View view, ReadableArray readableArray) {
            super.setPropList((MarkerManager) view, readableArray);
        }

        @Override // h5.C0
        @Z4.a(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z10) {
            super.setResponsible((MarkerManager) view, z10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.C0
        @Z4.a(name = "stroke")
        public /* bridge */ /* synthetic */ void setStroke(View view, Dynamic dynamic) {
            super.setStroke((MarkerManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.C0
        @Z4.a(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            super.setStrokeDasharray((MarkerManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.C0
        @Z4.a(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f10) {
            super.setStrokeDashoffset((MarkerManager) view, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.C0
        @Z4.a(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i10) {
            super.setStrokeLinecap((MarkerManager) view, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.C0
        @Z4.a(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i10) {
            super.setStrokeLinejoin((MarkerManager) view, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.C0
        @Z4.a(defaultFloat = 4.0f, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f10) {
            super.setStrokeMiterlimit((MarkerManager) view, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.C0
        @Z4.a(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f10) {
            super.setStrokeOpacity((MarkerManager) view, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.C0
        @Z4.a(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            super.setStrokeWidth((MarkerManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.C0
        @Z4.a(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i10) {
            super.setVectorEffect((MarkerManager) view, i10);
        }

        @Override // h5.C0
        @Z4.a(name = "align")
        public void setAlign(D d10, String str) {
            d10.setAlign(str);
        }

        @Override // h5.C0
        @Z4.a(name = "markerHeight")
        public void setMarkerHeight(D d10, Dynamic dynamic) {
            d10.D(dynamic);
        }

        @Override // h5.C0
        @Z4.a(name = "markerUnits")
        public void setMarkerUnits(D d10, String str) {
            d10.E(str);
        }

        @Override // h5.C0
        @Z4.a(name = "markerWidth")
        public void setMarkerWidth(D d10, Dynamic dynamic) {
            d10.F(dynamic);
        }

        @Override // h5.C0
        @Z4.a(name = "meetOrSlice")
        public void setMeetOrSlice(D d10, int i10) {
            d10.setMeetOrSlice(i10);
        }

        @Override // h5.C0
        @Z4.a(name = "minX")
        public void setMinX(D d10, float f10) {
            d10.setMinX(f10);
        }

        @Override // h5.C0
        @Z4.a(name = "minY")
        public void setMinY(D d10, float f10) {
            d10.setMinY(f10);
        }

        @Override // h5.C0
        @Z4.a(name = "orient")
        public void setOrient(D d10, String str) {
            d10.G(str);
        }

        @Override // h5.C0
        @Z4.a(name = "refX")
        public void setRefX(D d10, Dynamic dynamic) {
            d10.H(dynamic);
        }

        @Override // h5.C0
        @Z4.a(name = "refY")
        public void setRefY(D d10, Dynamic dynamic) {
            d10.I(dynamic);
        }

        @Override // h5.C0
        @Z4.a(name = "vbHeight")
        public void setVbHeight(D d10, float f10) {
            d10.setVbHeight(f10);
        }

        @Override // h5.C0
        @Z4.a(name = "vbWidth")
        public void setVbWidth(D d10, float f10) {
            d10.setVbWidth(f10);
        }
    }

    static class MaskManager extends GroupViewManagerAbstract<E> implements E0 {
        public static final String REACT_CLASS = "RNSVGMask";

        MaskManager() {
            super(VirtualViewManager.SVGClass.RNSVGMask);
            this.mDelegate = new D0(this);
        }

        @Override // com.horcrux.svg.RenderableViewManager.GroupViewManagerAbstract, com.horcrux.svg.RenderableViewManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.O
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @Override // h5.E0
        @Z4.a(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((MaskManager) view, str);
        }

        @Override // h5.E0
        @Z4.a(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i10) {
            super.setClipRule((MaskManager) view, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.E0
        @Z4.a(customType = "Color", name = "color")
        public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
            super.setColor((MaskManager) view, num);
        }

        @Override // h5.E0
        @Z4.a(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((MaskManager) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.E0
        @Z4.a(name = "fill")
        public /* bridge */ /* synthetic */ void setFill(View view, Dynamic dynamic) {
            super.setFill((MaskManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.E0
        @Z4.a(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f10) {
            super.setFillOpacity((MaskManager) view, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.E0
        @Z4.a(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i10) {
            super.setFillRule((MaskManager) view, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.E0
        @Z4.a(name = "filter")
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            super.setFilter((MaskManager) view, str);
        }

        @Override // h5.E0
        @Z4.a(name = "font")
        public /* bridge */ /* synthetic */ void setFont(View view, Dynamic dynamic) {
            super.setFont((MaskManager) view, dynamic);
        }

        @Override // h5.E0
        @Z4.a(name = "fontSize")
        public /* bridge */ /* synthetic */ void setFontSize(View view, Dynamic dynamic) {
            super.setFontSize((MaskManager) view, dynamic);
        }

        @Override // h5.E0
        @Z4.a(name = "fontWeight")
        public /* bridge */ /* synthetic */ void setFontWeight(View view, Dynamic dynamic) {
            super.setFontWeight((MaskManager) view, dynamic);
        }

        @Override // h5.E0
        @Z4.a(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((MaskManager) view, str);
        }

        @Override // h5.E0
        @Z4.a(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((MaskManager) view, str);
        }

        @Override // h5.E0
        @Z4.a(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((MaskManager) view, str);
        }

        @Override // h5.E0
        @Z4.a(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((MaskManager) view, str);
        }

        @Override // h5.E0
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((MaskManager) view, readableArray);
        }

        @Override // h5.E0
        @Z4.a(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((MaskManager) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.InterfaceC1945h
        @Z4.a(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f10) {
            super.setOpacity((MaskManager) view, f10);
        }

        @Override // h5.E0
        @Z4.a(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((MaskManager) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.E0
        @Z4.a(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(View view, ReadableArray readableArray) {
            super.setPropList((MaskManager) view, readableArray);
        }

        @Override // h5.E0
        @Z4.a(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z10) {
            super.setResponsible((MaskManager) view, z10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.E0
        @Z4.a(name = "stroke")
        public /* bridge */ /* synthetic */ void setStroke(View view, Dynamic dynamic) {
            super.setStroke((MaskManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.E0
        @Z4.a(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            super.setStrokeDasharray((MaskManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.E0
        @Z4.a(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f10) {
            super.setStrokeDashoffset((MaskManager) view, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.E0
        @Z4.a(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i10) {
            super.setStrokeLinecap((MaskManager) view, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.E0
        @Z4.a(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i10) {
            super.setStrokeLinejoin((MaskManager) view, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.E0
        @Z4.a(defaultFloat = 4.0f, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f10) {
            super.setStrokeMiterlimit((MaskManager) view, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.E0
        @Z4.a(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f10) {
            super.setStrokeOpacity((MaskManager) view, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.E0
        @Z4.a(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            super.setStrokeWidth((MaskManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.E0
        @Z4.a(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i10) {
            super.setVectorEffect((MaskManager) view, i10);
        }

        @Override // h5.E0
        @Z4.a(name = "height")
        public void setHeight(E e10, Dynamic dynamic) {
            e10.E(dynamic);
        }

        @Override // h5.E0
        @Z4.a(name = "maskContentUnits")
        public void setMaskContentUnits(E e10, int i10) {
            e10.F(i10);
        }

        @Override // h5.E0
        @Z4.a(name = "maskType")
        public void setMaskType(E e10, int i10) {
            e10.G(i10);
        }

        @Override // h5.E0
        @Z4.a(name = "maskUnits")
        public void setMaskUnits(E e10, int i10) {
            e10.H(i10);
        }

        @Override // h5.E0
        @Z4.a(name = "width")
        public void setWidth(E e10, Dynamic dynamic) {
            e10.I(dynamic);
        }

        @Override // h5.E0
        @Z4.a(name = "x")
        public void setX(E e10, Dynamic dynamic) {
            e10.J(dynamic);
        }

        @Override // h5.E0
        @Z4.a(name = "y")
        public void setY(E e10, Dynamic dynamic) {
            e10.K(dynamic);
        }
    }

    static class PathViewManager extends RenderableViewManager<H> implements G0 {
        public static final String REACT_CLASS = "RNSVGPath";

        PathViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGPath);
            this.mDelegate = new F0(this);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.O
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @Override // h5.G0
        @Z4.a(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((PathViewManager) view, str);
        }

        @Override // h5.G0
        @Z4.a(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i10) {
            super.setClipRule((PathViewManager) view, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.G0
        @Z4.a(customType = "Color", name = "color")
        public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
            super.setColor((PathViewManager) view, num);
        }

        @Override // h5.G0
        @Z4.a(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((PathViewManager) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.G0
        @Z4.a(name = "fill")
        public /* bridge */ /* synthetic */ void setFill(View view, Dynamic dynamic) {
            super.setFill((PathViewManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.G0
        @Z4.a(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f10) {
            super.setFillOpacity((PathViewManager) view, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.G0
        @Z4.a(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i10) {
            super.setFillRule((PathViewManager) view, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.G0
        @Z4.a(name = "filter")
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            super.setFilter((PathViewManager) view, str);
        }

        @Override // h5.G0
        @Z4.a(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((PathViewManager) view, str);
        }

        @Override // h5.G0
        @Z4.a(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((PathViewManager) view, str);
        }

        @Override // h5.G0
        @Z4.a(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((PathViewManager) view, str);
        }

        @Override // h5.G0
        @Z4.a(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((PathViewManager) view, str);
        }

        @Override // h5.G0
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((PathViewManager) view, readableArray);
        }

        @Override // h5.G0
        @Z4.a(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((PathViewManager) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.InterfaceC1945h
        @Z4.a(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f10) {
            super.setOpacity((PathViewManager) view, f10);
        }

        @Override // h5.G0
        @Z4.a(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((PathViewManager) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.G0
        @Z4.a(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(View view, ReadableArray readableArray) {
            super.setPropList((PathViewManager) view, readableArray);
        }

        @Override // h5.G0
        @Z4.a(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z10) {
            super.setResponsible((PathViewManager) view, z10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.G0
        @Z4.a(name = "stroke")
        public /* bridge */ /* synthetic */ void setStroke(View view, Dynamic dynamic) {
            super.setStroke((PathViewManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.G0
        @Z4.a(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            super.setStrokeDasharray((PathViewManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.G0
        @Z4.a(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f10) {
            super.setStrokeDashoffset((PathViewManager) view, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.G0
        @Z4.a(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i10) {
            super.setStrokeLinecap((PathViewManager) view, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.G0
        @Z4.a(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i10) {
            super.setStrokeLinejoin((PathViewManager) view, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.G0
        @Z4.a(defaultFloat = 4.0f, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f10) {
            super.setStrokeMiterlimit((PathViewManager) view, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.G0
        @Z4.a(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f10) {
            super.setStrokeOpacity((PathViewManager) view, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.G0
        @Z4.a(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            super.setStrokeWidth((PathViewManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.G0
        @Z4.a(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i10) {
            super.setVectorEffect((PathViewManager) view, i10);
        }

        @Override // h5.G0
        @Z4.a(name = "d")
        public void setD(H h10, String str) {
            h10.r(str);
        }
    }

    static class PatternManager extends GroupViewManagerAbstract<I> implements I0 {
        public static final String REACT_CLASS = "RNSVGPattern";

        PatternManager() {
            super(VirtualViewManager.SVGClass.RNSVGPattern);
            this.mDelegate = new H0(this);
        }

        @Override // com.horcrux.svg.RenderableViewManager.GroupViewManagerAbstract, com.horcrux.svg.RenderableViewManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.O
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @Override // h5.I0
        @Z4.a(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((PatternManager) view, str);
        }

        @Override // h5.I0
        @Z4.a(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i10) {
            super.setClipRule((PatternManager) view, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.I0
        @Z4.a(customType = "Color", name = "color")
        public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
            super.setColor((PatternManager) view, num);
        }

        @Override // h5.I0
        @Z4.a(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((PatternManager) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.I0
        @Z4.a(name = "fill")
        public /* bridge */ /* synthetic */ void setFill(View view, Dynamic dynamic) {
            super.setFill((PatternManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.I0
        @Z4.a(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f10) {
            super.setFillOpacity((PatternManager) view, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.I0
        @Z4.a(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i10) {
            super.setFillRule((PatternManager) view, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.I0
        @Z4.a(name = "filter")
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            super.setFilter((PatternManager) view, str);
        }

        @Override // h5.I0
        @Z4.a(name = "font")
        public /* bridge */ /* synthetic */ void setFont(View view, Dynamic dynamic) {
            super.setFont((PatternManager) view, dynamic);
        }

        @Override // h5.I0
        @Z4.a(name = "fontSize")
        public /* bridge */ /* synthetic */ void setFontSize(View view, Dynamic dynamic) {
            super.setFontSize((PatternManager) view, dynamic);
        }

        @Override // h5.I0
        @Z4.a(name = "fontWeight")
        public /* bridge */ /* synthetic */ void setFontWeight(View view, Dynamic dynamic) {
            super.setFontWeight((PatternManager) view, dynamic);
        }

        @Override // h5.I0
        @Z4.a(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((PatternManager) view, str);
        }

        @Override // h5.I0
        @Z4.a(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((PatternManager) view, str);
        }

        @Override // h5.I0
        @Z4.a(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((PatternManager) view, str);
        }

        @Override // h5.I0
        @Z4.a(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((PatternManager) view, str);
        }

        @Override // h5.I0
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((PatternManager) view, readableArray);
        }

        @Override // h5.I0
        @Z4.a(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((PatternManager) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.InterfaceC1945h
        @Z4.a(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f10) {
            super.setOpacity((PatternManager) view, f10);
        }

        @Override // h5.I0
        @Z4.a(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((PatternManager) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.I0
        @Z4.a(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(View view, ReadableArray readableArray) {
            super.setPropList((PatternManager) view, readableArray);
        }

        @Override // h5.I0
        @Z4.a(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z10) {
            super.setResponsible((PatternManager) view, z10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.I0
        @Z4.a(name = "stroke")
        public /* bridge */ /* synthetic */ void setStroke(View view, Dynamic dynamic) {
            super.setStroke((PatternManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.I0
        @Z4.a(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            super.setStrokeDasharray((PatternManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.I0
        @Z4.a(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f10) {
            super.setStrokeDashoffset((PatternManager) view, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.I0
        @Z4.a(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i10) {
            super.setStrokeLinecap((PatternManager) view, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.I0
        @Z4.a(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i10) {
            super.setStrokeLinejoin((PatternManager) view, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.I0
        @Z4.a(defaultFloat = 4.0f, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f10) {
            super.setStrokeMiterlimit((PatternManager) view, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.I0
        @Z4.a(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f10) {
            super.setStrokeOpacity((PatternManager) view, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.I0
        @Z4.a(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            super.setStrokeWidth((PatternManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.I0
        @Z4.a(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i10) {
            super.setVectorEffect((PatternManager) view, i10);
        }

        @Override // h5.I0
        @Z4.a(name = "align")
        public void setAlign(I i10, String str) {
            i10.setAlign(str);
        }

        @Override // h5.I0
        @Z4.a(name = "height")
        public void setHeight(I i10, Dynamic dynamic) {
            i10.C(dynamic);
        }

        @Override // h5.I0
        @Z4.a(name = "meetOrSlice")
        public void setMeetOrSlice(I i10, int i11) {
            i10.setMeetOrSlice(i11);
        }

        @Override // h5.I0
        @Z4.a(name = "minX")
        public void setMinX(I i10, float f10) {
            i10.setMinX(f10);
        }

        @Override // h5.I0
        @Z4.a(name = "minY")
        public void setMinY(I i10, float f10) {
            i10.setMinY(f10);
        }

        @Override // h5.I0
        @Z4.a(name = "patternContentUnits")
        public void setPatternContentUnits(I i10, int i11) {
            i10.D(i11);
        }

        @Override // h5.I0
        @Z4.a(name = "patternTransform")
        public void setPatternTransform(I i10, ReadableArray readableArray) {
            i10.E(readableArray);
        }

        @Override // h5.I0
        @Z4.a(name = "patternUnits")
        public void setPatternUnits(I i10, int i11) {
            i10.F(i11);
        }

        @Override // h5.I0
        @Z4.a(name = "vbHeight")
        public void setVbHeight(I i10, float f10) {
            i10.setVbHeight(f10);
        }

        @Override // h5.I0
        @Z4.a(name = "vbWidth")
        public void setVbWidth(I i10, float f10) {
            i10.setVbWidth(f10);
        }

        @Override // h5.I0
        @Z4.a(name = "width")
        public void setWidth(I i10, Dynamic dynamic) {
            i10.G(dynamic);
        }

        @Override // h5.I0
        @Z4.a(name = "x")
        public void setX(I i10, Dynamic dynamic) {
            i10.H(dynamic);
        }

        @Override // h5.I0
        @Z4.a(name = "y")
        public void setY(I i10, Dynamic dynamic) {
            i10.I(dynamic);
        }
    }

    static class RadialGradientManager extends VirtualViewManager<N> implements K0 {
        public static final String REACT_CLASS = "RNSVGRadialGradient";

        RadialGradientManager() {
            super(VirtualViewManager.SVGClass.RNSVGRadialGradient);
            this.mDelegate = new J0(this);
        }

        @Override // com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.O
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @Override // h5.K0
        @Z4.a(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((RadialGradientManager) view, str);
        }

        @Override // h5.K0
        @Z4.a(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i10) {
            super.setClipRule((RadialGradientManager) view, i10);
        }

        @Override // h5.K0
        @Z4.a(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((RadialGradientManager) view, str);
        }

        @Override // h5.K0
        @Z4.a(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((RadialGradientManager) view, str);
        }

        @Override // h5.K0
        @Z4.a(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((RadialGradientManager) view, str);
        }

        @Override // h5.K0
        @Z4.a(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((RadialGradientManager) view, str);
        }

        @Override // h5.K0
        @Z4.a(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((RadialGradientManager) view, str);
        }

        @Override // h5.K0
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((RadialGradientManager) view, readableArray);
        }

        @Override // h5.K0
        @Z4.a(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((RadialGradientManager) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.InterfaceC1945h
        @Z4.a(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f10) {
            super.setOpacity((RadialGradientManager) view, f10);
        }

        @Override // h5.K0
        @Z4.a(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((RadialGradientManager) view, str);
        }

        @Override // h5.K0
        @Z4.a(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z10) {
            super.setResponsible((RadialGradientManager) view, z10);
        }

        @Override // h5.K0
        @Z4.a(name = "cx")
        public void setCx(N n10, Dynamic dynamic) {
            n10.r(dynamic);
        }

        @Override // h5.K0
        @Z4.a(name = "cy")
        public void setCy(N n10, Dynamic dynamic) {
            n10.s(dynamic);
        }

        @Override // h5.K0
        @Z4.a(name = "fx")
        public void setFx(N n10, Dynamic dynamic) {
            n10.t(dynamic);
        }

        @Override // h5.K0
        @Z4.a(name = "fy")
        public void setFy(N n10, Dynamic dynamic) {
            n10.u(dynamic);
        }

        @Override // h5.K0
        @Z4.a(name = "gradient")
        public void setGradient(N n10, ReadableArray readableArray) {
            n10.v(readableArray);
        }

        @Override // h5.K0
        @Z4.a(name = "gradientTransform")
        public void setGradientTransform(N n10, ReadableArray readableArray) {
            n10.w(readableArray);
        }

        @Override // h5.K0
        @Z4.a(name = "gradientUnits")
        public void setGradientUnits(N n10, int i10) {
            n10.x(i10);
        }

        @Override // h5.K0
        @Z4.a(name = "rx")
        public void setRx(N n10, Dynamic dynamic) {
            n10.y(dynamic);
        }

        @Override // h5.K0
        @Z4.a(name = "ry")
        public void setRy(N n10, Dynamic dynamic) {
            n10.z(dynamic);
        }
    }

    static class RectViewManager extends RenderableViewManager<O> implements M0 {
        public static final String REACT_CLASS = "RNSVGRect";

        RectViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGRect);
            this.mDelegate = new L0(this);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.O
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @Override // h5.M0
        @Z4.a(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((RectViewManager) view, str);
        }

        @Override // h5.M0
        @Z4.a(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i10) {
            super.setClipRule((RectViewManager) view, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.M0
        @Z4.a(customType = "Color", name = "color")
        public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
            super.setColor((RectViewManager) view, num);
        }

        @Override // h5.M0
        @Z4.a(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((RectViewManager) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.M0
        @Z4.a(name = "fill")
        public /* bridge */ /* synthetic */ void setFill(View view, Dynamic dynamic) {
            super.setFill((RectViewManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.M0
        @Z4.a(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f10) {
            super.setFillOpacity((RectViewManager) view, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.M0
        @Z4.a(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i10) {
            super.setFillRule((RectViewManager) view, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.M0
        @Z4.a(name = "filter")
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            super.setFilter((RectViewManager) view, str);
        }

        @Override // h5.M0
        @Z4.a(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((RectViewManager) view, str);
        }

        @Override // h5.M0
        @Z4.a(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((RectViewManager) view, str);
        }

        @Override // h5.M0
        @Z4.a(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((RectViewManager) view, str);
        }

        @Override // h5.M0
        @Z4.a(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((RectViewManager) view, str);
        }

        @Override // h5.M0
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((RectViewManager) view, readableArray);
        }

        @Override // h5.M0
        @Z4.a(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((RectViewManager) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.InterfaceC1945h
        @Z4.a(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f10) {
            super.setOpacity((RectViewManager) view, f10);
        }

        @Override // h5.M0
        @Z4.a(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((RectViewManager) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.M0
        @Z4.a(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(View view, ReadableArray readableArray) {
            super.setPropList((RectViewManager) view, readableArray);
        }

        @Override // h5.M0
        @Z4.a(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z10) {
            super.setResponsible((RectViewManager) view, z10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.M0
        @Z4.a(name = "stroke")
        public /* bridge */ /* synthetic */ void setStroke(View view, Dynamic dynamic) {
            super.setStroke((RectViewManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.M0
        @Z4.a(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            super.setStrokeDasharray((RectViewManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.M0
        @Z4.a(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f10) {
            super.setStrokeDashoffset((RectViewManager) view, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.M0
        @Z4.a(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i10) {
            super.setStrokeLinecap((RectViewManager) view, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.M0
        @Z4.a(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i10) {
            super.setStrokeLinejoin((RectViewManager) view, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.M0
        @Z4.a(defaultFloat = 4.0f, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f10) {
            super.setStrokeMiterlimit((RectViewManager) view, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.M0
        @Z4.a(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f10) {
            super.setStrokeOpacity((RectViewManager) view, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.M0
        @Z4.a(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            super.setStrokeWidth((RectViewManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.M0
        @Z4.a(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i10) {
            super.setVectorEffect((RectViewManager) view, i10);
        }

        @Override // h5.M0
        @Z4.a(name = "height")
        public void setHeight(O o10, Dynamic dynamic) {
            o10.r(dynamic);
        }

        @Override // h5.M0
        @Z4.a(name = "rx")
        public void setRx(O o10, Dynamic dynamic) {
            o10.s(dynamic);
        }

        @Override // h5.M0
        @Z4.a(name = "ry")
        public void setRy(O o10, Dynamic dynamic) {
            o10.t(dynamic);
        }

        @Override // h5.M0
        @Z4.a(name = "width")
        public void setWidth(O o10, Dynamic dynamic) {
            o10.u(dynamic);
        }

        @Override // h5.M0
        @Z4.a(name = "x")
        public void setX(O o10, Dynamic dynamic) {
            o10.v(dynamic);
        }

        @Override // h5.M0
        @Z4.a(name = "y")
        public void setY(O o10, Dynamic dynamic) {
            o10.w(dynamic);
        }
    }

    static class SymbolManager extends GroupViewManagerAbstract<Q> implements Q0 {
        public static final String REACT_CLASS = "RNSVGSymbol";

        SymbolManager() {
            super(VirtualViewManager.SVGClass.RNSVGSymbol);
            this.mDelegate = new P0(this);
        }

        @Override // com.horcrux.svg.RenderableViewManager.GroupViewManagerAbstract, com.horcrux.svg.RenderableViewManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.O
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @Override // h5.Q0
        @Z4.a(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((SymbolManager) view, str);
        }

        @Override // h5.Q0
        @Z4.a(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i10) {
            super.setClipRule((SymbolManager) view, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.Q0
        @Z4.a(customType = "Color", name = "color")
        public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
            super.setColor((SymbolManager) view, num);
        }

        @Override // h5.Q0
        @Z4.a(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((SymbolManager) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.Q0
        @Z4.a(name = "fill")
        public /* bridge */ /* synthetic */ void setFill(View view, Dynamic dynamic) {
            super.setFill((SymbolManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.Q0
        @Z4.a(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f10) {
            super.setFillOpacity((SymbolManager) view, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.Q0
        @Z4.a(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i10) {
            super.setFillRule((SymbolManager) view, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.Q0
        @Z4.a(name = "filter")
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            super.setFilter((SymbolManager) view, str);
        }

        @Override // h5.Q0
        @Z4.a(name = "font")
        public /* bridge */ /* synthetic */ void setFont(View view, Dynamic dynamic) {
            super.setFont((SymbolManager) view, dynamic);
        }

        @Override // h5.Q0
        @Z4.a(name = "fontSize")
        public /* bridge */ /* synthetic */ void setFontSize(View view, Dynamic dynamic) {
            super.setFontSize((SymbolManager) view, dynamic);
        }

        @Override // h5.Q0
        @Z4.a(name = "fontWeight")
        public /* bridge */ /* synthetic */ void setFontWeight(View view, Dynamic dynamic) {
            super.setFontWeight((SymbolManager) view, dynamic);
        }

        @Override // h5.Q0
        @Z4.a(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((SymbolManager) view, str);
        }

        @Override // h5.Q0
        @Z4.a(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((SymbolManager) view, str);
        }

        @Override // h5.Q0
        @Z4.a(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((SymbolManager) view, str);
        }

        @Override // h5.Q0
        @Z4.a(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((SymbolManager) view, str);
        }

        @Override // h5.Q0
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((SymbolManager) view, readableArray);
        }

        @Override // h5.Q0
        @Z4.a(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((SymbolManager) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.InterfaceC1945h
        @Z4.a(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f10) {
            super.setOpacity((SymbolManager) view, f10);
        }

        @Override // h5.Q0
        @Z4.a(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((SymbolManager) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.Q0
        @Z4.a(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(View view, ReadableArray readableArray) {
            super.setPropList((SymbolManager) view, readableArray);
        }

        @Override // h5.Q0
        @Z4.a(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z10) {
            super.setResponsible((SymbolManager) view, z10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.Q0
        @Z4.a(name = "stroke")
        public /* bridge */ /* synthetic */ void setStroke(View view, Dynamic dynamic) {
            super.setStroke((SymbolManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.Q0
        @Z4.a(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            super.setStrokeDasharray((SymbolManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.Q0
        @Z4.a(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f10) {
            super.setStrokeDashoffset((SymbolManager) view, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.Q0
        @Z4.a(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i10) {
            super.setStrokeLinecap((SymbolManager) view, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.Q0
        @Z4.a(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i10) {
            super.setStrokeLinejoin((SymbolManager) view, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.Q0
        @Z4.a(defaultFloat = 4.0f, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f10) {
            super.setStrokeMiterlimit((SymbolManager) view, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.Q0
        @Z4.a(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f10) {
            super.setStrokeOpacity((SymbolManager) view, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.Q0
        @Z4.a(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            super.setStrokeWidth((SymbolManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.Q0
        @Z4.a(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i10) {
            super.setVectorEffect((SymbolManager) view, i10);
        }

        @Override // h5.Q0
        @Z4.a(name = "align")
        public void setAlign(Q q10, String str) {
            q10.setAlign(str);
        }

        @Override // h5.Q0
        @Z4.a(name = "meetOrSlice")
        public void setMeetOrSlice(Q q10, int i10) {
            q10.setMeetOrSlice(i10);
        }

        @Override // h5.Q0
        @Z4.a(name = "minX")
        public void setMinX(Q q10, float f10) {
            q10.setMinX(f10);
        }

        @Override // h5.Q0
        @Z4.a(name = "minY")
        public void setMinY(Q q10, float f10) {
            q10.setMinY(f10);
        }

        @Override // h5.Q0
        @Z4.a(name = "vbHeight")
        public void setVbHeight(Q q10, float f10) {
            q10.setVbHeight(f10);
        }

        @Override // h5.Q0
        @Z4.a(name = "vbWidth")
        public void setVbWidth(Q q10, float f10) {
            q10.setVbWidth(f10);
        }
    }

    static class TSpanViewManager extends TextViewManagerAbstract<Z> implements S0 {
        public static final String REACT_CLASS = "RNSVGTSpan";

        TSpanViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGTSpan);
            this.mDelegate = new R0(this);
        }

        @Override // com.horcrux.svg.RenderableViewManager.TextViewManagerAbstract, com.horcrux.svg.RenderableViewManager.GroupViewManagerAbstract, com.horcrux.svg.RenderableViewManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.O
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @Override // h5.S0
        public /* bridge */ /* synthetic */ void setAlignmentBaseline(View view, String str) {
            super.setAlignmentBaseline((TSpanViewManager) view, str);
        }

        @Override // h5.S0
        @Z4.a(name = "baselineShift")
        public /* bridge */ /* synthetic */ void setBaselineShift(View view, Dynamic dynamic) {
            super.setBaselineShift((TSpanViewManager) view, dynamic);
        }

        @Override // h5.S0
        @Z4.a(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((TSpanViewManager) view, str);
        }

        @Override // h5.S0
        @Z4.a(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i10) {
            super.setClipRule((TSpanViewManager) view, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.S0
        @Z4.a(customType = "Color", name = "color")
        public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
            super.setColor((TSpanViewManager) view, num);
        }

        @Override // h5.S0
        @Z4.a(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((TSpanViewManager) view, str);
        }

        @Override // h5.S0
        @Z4.a(name = "dx")
        public /* bridge */ /* synthetic */ void setDx(View view, Dynamic dynamic) {
            super.setDx((TSpanViewManager) view, dynamic);
        }

        @Override // h5.S0
        @Z4.a(name = "dy")
        public /* bridge */ /* synthetic */ void setDy(View view, Dynamic dynamic) {
            super.setDy((TSpanViewManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.S0
        @Z4.a(name = "fill")
        public /* bridge */ /* synthetic */ void setFill(View view, Dynamic dynamic) {
            super.setFill((TSpanViewManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.S0
        @Z4.a(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f10) {
            super.setFillOpacity((TSpanViewManager) view, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.S0
        @Z4.a(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i10) {
            super.setFillRule((TSpanViewManager) view, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.S0
        @Z4.a(name = "filter")
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            super.setFilter((TSpanViewManager) view, str);
        }

        @Override // h5.S0
        @Z4.a(name = "font")
        public /* bridge */ /* synthetic */ void setFont(View view, Dynamic dynamic) {
            super.setFont((TSpanViewManager) view, dynamic);
        }

        @Override // h5.S0
        @Z4.a(name = "fontSize")
        public /* bridge */ /* synthetic */ void setFontSize(View view, Dynamic dynamic) {
            super.setFontSize((TSpanViewManager) view, dynamic);
        }

        @Override // h5.S0
        @Z4.a(name = "fontWeight")
        public /* bridge */ /* synthetic */ void setFontWeight(View view, Dynamic dynamic) {
            super.setFontWeight((TSpanViewManager) view, dynamic);
        }

        @Override // h5.S0
        @Z4.a(name = "inlineSize")
        public /* bridge */ /* synthetic */ void setInlineSize(View view, Dynamic dynamic) {
            super.setInlineSize((TSpanViewManager) view, dynamic);
        }

        @Override // h5.S0
        @Z4.a(name = "lengthAdjust")
        public /* bridge */ /* synthetic */ void setLengthAdjust(View view, String str) {
            super.setLengthAdjust((TSpanViewManager) view, str);
        }

        @Override // h5.S0
        @Z4.a(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((TSpanViewManager) view, str);
        }

        @Override // h5.S0
        @Z4.a(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((TSpanViewManager) view, str);
        }

        @Override // h5.S0
        @Z4.a(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((TSpanViewManager) view, str);
        }

        @Override // h5.S0
        @Z4.a(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((TSpanViewManager) view, str);
        }

        @Override // h5.S0
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((TSpanViewManager) view, readableArray);
        }

        @Override // h5.S0
        @Z4.a(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((TSpanViewManager) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.InterfaceC1945h
        @Z4.a(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f10) {
            super.setOpacity((TSpanViewManager) view, f10);
        }

        @Override // h5.S0
        @Z4.a(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((TSpanViewManager) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.S0
        @Z4.a(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(View view, ReadableArray readableArray) {
            super.setPropList((TSpanViewManager) view, readableArray);
        }

        @Override // h5.S0
        @Z4.a(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z10) {
            super.setResponsible((TSpanViewManager) view, z10);
        }

        @Override // h5.S0
        @Z4.a(name = "rotate")
        public /* bridge */ /* synthetic */ void setRotate(View view, Dynamic dynamic) {
            super.setRotate((TSpanViewManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.S0
        @Z4.a(name = "stroke")
        public /* bridge */ /* synthetic */ void setStroke(View view, Dynamic dynamic) {
            super.setStroke((TSpanViewManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.S0
        @Z4.a(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            super.setStrokeDasharray((TSpanViewManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.S0
        @Z4.a(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f10) {
            super.setStrokeDashoffset((TSpanViewManager) view, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.S0
        @Z4.a(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i10) {
            super.setStrokeLinecap((TSpanViewManager) view, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.S0
        @Z4.a(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i10) {
            super.setStrokeLinejoin((TSpanViewManager) view, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.S0
        @Z4.a(defaultFloat = 4.0f, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f10) {
            super.setStrokeMiterlimit((TSpanViewManager) view, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.S0
        @Z4.a(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f10) {
            super.setStrokeOpacity((TSpanViewManager) view, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.S0
        @Z4.a(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            super.setStrokeWidth((TSpanViewManager) view, dynamic);
        }

        @Override // h5.S0
        @Z4.a(name = "textLength")
        public /* bridge */ /* synthetic */ void setTextLength(View view, Dynamic dynamic) {
            super.setTextLength((TSpanViewManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.S0
        @Z4.a(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i10) {
            super.setVectorEffect((TSpanViewManager) view, i10);
        }

        @Override // h5.S0
        @Z4.a(name = "verticalAlign")
        public /* bridge */ /* synthetic */ void setVerticalAlign(View view, Dynamic dynamic) {
            super.setVerticalAlign((TSpanViewManager) view, dynamic);
        }

        @Override // h5.S0
        @Z4.a(name = "x")
        public /* bridge */ /* synthetic */ void setX(View view, Dynamic dynamic) {
            super.setX((TSpanViewManager) view, dynamic);
        }

        @Override // h5.S0
        @Z4.a(name = "y")
        public /* bridge */ /* synthetic */ void setY(View view, Dynamic dynamic) {
            super.setY((TSpanViewManager) view, dynamic);
        }

        @Override // h5.S0
        @Z4.a(name = "content")
        public void setContent(Z z10, String str) {
            z10.a0(str);
        }

        TSpanViewManager(VirtualViewManager.SVGClass sVGClass) {
            super(sVGClass);
            this.mDelegate = new R0(this);
        }
    }

    static class TextPathViewManager extends TextViewManagerAbstract<a0> implements W0 {
        public static final String REACT_CLASS = "RNSVGTextPath";

        TextPathViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGTextPath);
            this.mDelegate = new V0(this);
        }

        @Override // com.horcrux.svg.RenderableViewManager.TextViewManagerAbstract, com.horcrux.svg.RenderableViewManager.GroupViewManagerAbstract, com.horcrux.svg.RenderableViewManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.O
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @Override // h5.W0
        public /* bridge */ /* synthetic */ void setAlignmentBaseline(View view, String str) {
            super.setAlignmentBaseline((TextPathViewManager) view, str);
        }

        @Override // h5.W0
        @Z4.a(name = "baselineShift")
        public /* bridge */ /* synthetic */ void setBaselineShift(View view, Dynamic dynamic) {
            super.setBaselineShift((TextPathViewManager) view, dynamic);
        }

        @Override // h5.W0
        @Z4.a(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((TextPathViewManager) view, str);
        }

        @Override // h5.W0
        @Z4.a(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i10) {
            super.setClipRule((TextPathViewManager) view, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.W0
        @Z4.a(customType = "Color", name = "color")
        public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
            super.setColor((TextPathViewManager) view, num);
        }

        @Override // h5.W0
        @Z4.a(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((TextPathViewManager) view, str);
        }

        @Override // h5.W0
        @Z4.a(name = "dx")
        public /* bridge */ /* synthetic */ void setDx(View view, Dynamic dynamic) {
            super.setDx((TextPathViewManager) view, dynamic);
        }

        @Override // h5.W0
        @Z4.a(name = "dy")
        public /* bridge */ /* synthetic */ void setDy(View view, Dynamic dynamic) {
            super.setDy((TextPathViewManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.W0
        @Z4.a(name = "fill")
        public /* bridge */ /* synthetic */ void setFill(View view, Dynamic dynamic) {
            super.setFill((TextPathViewManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.W0
        @Z4.a(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f10) {
            super.setFillOpacity((TextPathViewManager) view, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.W0
        @Z4.a(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i10) {
            super.setFillRule((TextPathViewManager) view, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.W0
        @Z4.a(name = "filter")
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            super.setFilter((TextPathViewManager) view, str);
        }

        @Override // h5.W0
        @Z4.a(name = "font")
        public /* bridge */ /* synthetic */ void setFont(View view, Dynamic dynamic) {
            super.setFont((TextPathViewManager) view, dynamic);
        }

        @Override // h5.W0
        @Z4.a(name = "fontSize")
        public /* bridge */ /* synthetic */ void setFontSize(View view, Dynamic dynamic) {
            super.setFontSize((TextPathViewManager) view, dynamic);
        }

        @Override // h5.W0
        @Z4.a(name = "fontWeight")
        public /* bridge */ /* synthetic */ void setFontWeight(View view, Dynamic dynamic) {
            super.setFontWeight((TextPathViewManager) view, dynamic);
        }

        @Override // h5.W0
        @Z4.a(name = "inlineSize")
        public /* bridge */ /* synthetic */ void setInlineSize(View view, Dynamic dynamic) {
            super.setInlineSize((TextPathViewManager) view, dynamic);
        }

        @Override // h5.W0
        @Z4.a(name = "lengthAdjust")
        public /* bridge */ /* synthetic */ void setLengthAdjust(View view, String str) {
            super.setLengthAdjust((TextPathViewManager) view, str);
        }

        @Override // h5.W0
        @Z4.a(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((TextPathViewManager) view, str);
        }

        @Override // h5.W0
        @Z4.a(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((TextPathViewManager) view, str);
        }

        @Override // h5.W0
        @Z4.a(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((TextPathViewManager) view, str);
        }

        @Override // h5.W0
        @Z4.a(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((TextPathViewManager) view, str);
        }

        @Override // h5.W0
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((TextPathViewManager) view, readableArray);
        }

        @Override // h5.W0
        @Z4.a(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((TextPathViewManager) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.InterfaceC1945h
        @Z4.a(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f10) {
            super.setOpacity((TextPathViewManager) view, f10);
        }

        @Override // h5.W0
        @Z4.a(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((TextPathViewManager) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.W0
        @Z4.a(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(View view, ReadableArray readableArray) {
            super.setPropList((TextPathViewManager) view, readableArray);
        }

        @Override // h5.W0
        @Z4.a(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z10) {
            super.setResponsible((TextPathViewManager) view, z10);
        }

        @Override // h5.W0
        @Z4.a(name = "rotate")
        public /* bridge */ /* synthetic */ void setRotate(View view, Dynamic dynamic) {
            super.setRotate((TextPathViewManager) view, dynamic);
        }

        @Z4.a(name = "midLine")
        public void setSharp(a0 a0Var, String str) {
            a0Var.Y(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.W0
        @Z4.a(name = "stroke")
        public /* bridge */ /* synthetic */ void setStroke(View view, Dynamic dynamic) {
            super.setStroke((TextPathViewManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.W0
        @Z4.a(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            super.setStrokeDasharray((TextPathViewManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.W0
        @Z4.a(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f10) {
            super.setStrokeDashoffset((TextPathViewManager) view, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.W0
        @Z4.a(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i10) {
            super.setStrokeLinecap((TextPathViewManager) view, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.W0
        @Z4.a(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i10) {
            super.setStrokeLinejoin((TextPathViewManager) view, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.W0
        @Z4.a(defaultFloat = 4.0f, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f10) {
            super.setStrokeMiterlimit((TextPathViewManager) view, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.W0
        @Z4.a(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f10) {
            super.setStrokeOpacity((TextPathViewManager) view, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.W0
        @Z4.a(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            super.setStrokeWidth((TextPathViewManager) view, dynamic);
        }

        @Override // h5.W0
        @Z4.a(name = "textLength")
        public /* bridge */ /* synthetic */ void setTextLength(View view, Dynamic dynamic) {
            super.setTextLength((TextPathViewManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.W0
        @Z4.a(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i10) {
            super.setVectorEffect((TextPathViewManager) view, i10);
        }

        @Override // h5.W0
        @Z4.a(name = "verticalAlign")
        public /* bridge */ /* synthetic */ void setVerticalAlign(View view, Dynamic dynamic) {
            super.setVerticalAlign((TextPathViewManager) view, dynamic);
        }

        @Override // h5.W0
        @Z4.a(name = "x")
        public /* bridge */ /* synthetic */ void setX(View view, Dynamic dynamic) {
            super.setX((TextPathViewManager) view, dynamic);
        }

        @Override // h5.W0
        @Z4.a(name = "y")
        public /* bridge */ /* synthetic */ void setY(View view, Dynamic dynamic) {
            super.setY((TextPathViewManager) view, dynamic);
        }

        @Override // h5.W0
        @Z4.a(name = "href")
        public void setHref(a0 a0Var, String str) {
            a0Var.X(str);
        }

        @Override // h5.W0
        public void setMidLine(a0 a0Var, String str) {
            a0Var.Y(str);
        }

        @Override // h5.W0
        @Z4.a(name = "side")
        public void setSide(a0 a0Var, String str) {
            a0Var.Z(str);
        }

        @Override // h5.W0
        @Z4.a(name = "spacing")
        public void setSpacing(a0 a0Var, String str) {
            a0Var.a0(str);
        }

        @Override // h5.W0
        @Z4.a(name = "startOffset")
        public void setStartOffset(a0 a0Var, Dynamic dynamic) {
            a0Var.b0(dynamic);
        }

        TextPathViewManager(VirtualViewManager.SVGClass sVGClass) {
            super(sVGClass);
            this.mDelegate = new V0(this);
        }

        @Override // com.horcrux.svg.RenderableViewManager.TextViewManagerAbstract
        @Z4.a(name = "method")
        public void setMethod(a0 a0Var, String str) {
            a0Var.N(str);
        }
    }

    static class TextViewManagerAbstract<K extends m0> extends GroupViewManagerAbstract<K> {
        TextViewManagerAbstract(VirtualViewManager.SVGClass sVGClass) {
            super(sVGClass);
        }

        @Override // com.horcrux.svg.RenderableViewManager.GroupViewManagerAbstract, com.horcrux.svg.RenderableViewManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.O
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        public void setAlignmentBaseline(K k10, String str) {
            k10.N(str);
        }

        @Z4.a(name = "baselineShift")
        public void setBaselineShift(K k10, Dynamic dynamic) {
            k10.I(dynamic);
        }

        @Z4.a(name = "dx")
        public void setDx(K k10, Dynamic dynamic) {
            k10.J(dynamic);
        }

        @Z4.a(name = "dy")
        public void setDy(K k10, Dynamic dynamic) {
            k10.K(dynamic);
        }

        @Z4.a(name = "inlineSize")
        public void setInlineSize(K k10, Dynamic dynamic) {
            k10.L(dynamic);
        }

        @Z4.a(name = "lengthAdjust")
        public void setLengthAdjust(K k10, String str) {
            k10.M(str);
        }

        @Z4.a(name = "alignmentBaseline")
        public void setMethod(K k10, String str) {
            k10.N(str);
        }

        @Z4.a(name = "rotate")
        public void setRotate(K k10, Dynamic dynamic) {
            k10.Q(dynamic);
        }

        @Z4.a(name = "textLength")
        public void setTextLength(K k10, Dynamic dynamic) {
            k10.R(dynamic);
        }

        @Z4.a(name = "verticalAlign")
        public void setVerticalAlign(K k10, Dynamic dynamic) {
            k10.S(dynamic);
        }

        @Z4.a(name = "x")
        public void setX(K k10, Dynamic dynamic) {
            k10.O(dynamic);
        }

        @Z4.a(name = "y")
        public void setY(K k10, Dynamic dynamic) {
            k10.P(dynamic);
        }

        @Override // com.horcrux.svg.RenderableViewManager.GroupViewManagerAbstract
        @Z4.a(name = "font")
        public void setFont(K k10, Dynamic dynamic) {
            k10.z(dynamic);
        }
    }

    static class UseViewManager extends RenderableViewManager<n0> implements Y0 {
        public static final String REACT_CLASS = "RNSVGUse";

        UseViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGUse);
            this.mDelegate = new X0(this);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.O
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @Override // h5.Y0
        @Z4.a(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((UseViewManager) view, str);
        }

        @Override // h5.Y0
        @Z4.a(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i10) {
            super.setClipRule((UseViewManager) view, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.Y0
        @Z4.a(customType = "Color", name = "color")
        public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
            super.setColor((UseViewManager) view, num);
        }

        @Override // h5.Y0
        @Z4.a(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((UseViewManager) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.Y0
        @Z4.a(name = "fill")
        public /* bridge */ /* synthetic */ void setFill(View view, Dynamic dynamic) {
            super.setFill((UseViewManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.Y0
        @Z4.a(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f10) {
            super.setFillOpacity((UseViewManager) view, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.Y0
        @Z4.a(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i10) {
            super.setFillRule((UseViewManager) view, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.Y0
        @Z4.a(name = "filter")
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            super.setFilter((UseViewManager) view, str);
        }

        @Override // h5.Y0
        @Z4.a(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((UseViewManager) view, str);
        }

        @Override // h5.Y0
        @Z4.a(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((UseViewManager) view, str);
        }

        @Override // h5.Y0
        @Z4.a(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((UseViewManager) view, str);
        }

        @Override // h5.Y0
        @Z4.a(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((UseViewManager) view, str);
        }

        @Override // h5.Y0
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((UseViewManager) view, readableArray);
        }

        @Override // h5.Y0
        @Z4.a(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((UseViewManager) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.InterfaceC1945h
        @Z4.a(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f10) {
            super.setOpacity((UseViewManager) view, f10);
        }

        @Override // h5.Y0
        @Z4.a(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((UseViewManager) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.Y0
        @Z4.a(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(View view, ReadableArray readableArray) {
            super.setPropList((UseViewManager) view, readableArray);
        }

        @Override // h5.Y0
        @Z4.a(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z10) {
            super.setResponsible((UseViewManager) view, z10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.Y0
        @Z4.a(name = "stroke")
        public /* bridge */ /* synthetic */ void setStroke(View view, Dynamic dynamic) {
            super.setStroke((UseViewManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.Y0
        @Z4.a(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            super.setStrokeDasharray((UseViewManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.Y0
        @Z4.a(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f10) {
            super.setStrokeDashoffset((UseViewManager) view, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.Y0
        @Z4.a(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i10) {
            super.setStrokeLinecap((UseViewManager) view, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.Y0
        @Z4.a(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i10) {
            super.setStrokeLinejoin((UseViewManager) view, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.Y0
        @Z4.a(defaultFloat = 4.0f, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f10) {
            super.setStrokeMiterlimit((UseViewManager) view, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.Y0
        @Z4.a(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f10) {
            super.setStrokeOpacity((UseViewManager) view, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.Y0
        @Z4.a(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            super.setStrokeWidth((UseViewManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.Y0
        @Z4.a(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i10) {
            super.setVectorEffect((UseViewManager) view, i10);
        }

        @Override // h5.Y0
        @Z4.a(name = "height")
        public void setHeight(n0 n0Var, Dynamic dynamic) {
            n0Var.r(dynamic);
        }

        @Override // h5.Y0
        @Z4.a(name = "href")
        public void setHref(n0 n0Var, String str) {
            n0Var.s(str);
        }

        @Override // h5.Y0
        @Z4.a(name = "width")
        public void setWidth(n0 n0Var, Dynamic dynamic) {
            n0Var.t(dynamic);
        }

        @Override // h5.Y0
        @Z4.a(name = "x")
        public void setX(n0 n0Var, Dynamic dynamic) {
            n0Var.u(dynamic);
        }

        @Override // h5.Y0
        @Z4.a(name = "y")
        public void setY(n0 n0Var, Dynamic dynamic) {
            n0Var.v(dynamic);
        }
    }

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f28945a;

        static {
            int[] iArr = new int[ReadableType.values().length];
            f28945a = iArr;
            try {
                iArr[ReadableType.Number.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28945a[ReadableType.String.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    RenderableViewManager(VirtualViewManager.SVGClass sVGClass) {
        super(sVGClass);
    }

    @Override // com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.O
    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        super.removeAllViews(view);
    }

    @Z4.a(customType = "Color", name = "color")
    public void setColor(T t10, Integer num) {
        t10.setCurrentColor(num);
    }

    @Z4.a(name = "fill")
    public void setFill(T t10, Dynamic dynamic) {
        t10.setFill(dynamic);
    }

    @Z4.a(defaultFloat = 1.0f, name = "fillOpacity")
    public void setFillOpacity(T t10, float f10) {
        t10.setFillOpacity(f10);
    }

    @Z4.a(defaultInt = 1, name = "fillRule")
    public void setFillRule(T t10, int i10) {
        t10.setFillRule(i10);
    }

    @Z4.a(name = "filter")
    public void setFilter(T t10, String str) {
        t10.setFilter(str);
    }

    @Z4.a(name = "propList")
    public void setPropList(T t10, ReadableArray readableArray) {
        t10.setPropList(readableArray);
    }

    @Z4.a(name = "stroke")
    public void setStroke(T t10, Dynamic dynamic) {
        t10.setStroke(dynamic);
    }

    @Z4.a(name = "strokeDasharray")
    public void setStrokeDasharray(T t10, Dynamic dynamic) {
        t10.setStrokeDasharray(dynamic);
    }

    @Z4.a(name = "strokeDashoffset")
    public void setStrokeDashoffset(T t10, float f10) {
        t10.setStrokeDashoffset(f10);
    }

    @Z4.a(defaultInt = 1, name = "strokeLinecap")
    public void setStrokeLinecap(T t10, int i10) {
        t10.setStrokeLinecap(i10);
    }

    @Z4.a(defaultInt = 1, name = "strokeLinejoin")
    public void setStrokeLinejoin(T t10, int i10) {
        t10.setStrokeLinejoin(i10);
    }

    @Z4.a(defaultFloat = 4.0f, name = "strokeMiterlimit")
    public void setStrokeMiterlimit(T t10, float f10) {
        t10.setStrokeMiterlimit(f10);
    }

    @Z4.a(defaultFloat = 1.0f, name = "strokeOpacity")
    public void setStrokeOpacity(T t10, float f10) {
        t10.setStrokeOpacity(f10);
    }

    @Z4.a(name = "strokeWidth")
    public void setStrokeWidth(T t10, Dynamic dynamic) {
        t10.setStrokeWidth(dynamic);
    }

    @Z4.a(name = "vectorEffect")
    public void setVectorEffect(T t10, int i10) {
        t10.setVectorEffect(i10);
    }

    static class TextViewManager extends TextViewManagerAbstract<m0> implements U0 {
        public static final String REACT_CLASS = "RNSVGText";

        TextViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGText);
            this.mDelegate = new T0(this);
        }

        @Override // com.horcrux.svg.RenderableViewManager.TextViewManagerAbstract, com.horcrux.svg.RenderableViewManager.GroupViewManagerAbstract, com.horcrux.svg.RenderableViewManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.O
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @Override // h5.U0
        public /* bridge */ /* synthetic */ void setAlignmentBaseline(View view, String str) {
            super.setAlignmentBaseline((TextViewManager) view, str);
        }

        @Override // h5.U0
        @Z4.a(name = "baselineShift")
        public /* bridge */ /* synthetic */ void setBaselineShift(View view, Dynamic dynamic) {
            super.setBaselineShift((TextViewManager) view, dynamic);
        }

        @Override // h5.U0
        @Z4.a(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((TextViewManager) view, str);
        }

        @Override // h5.U0
        @Z4.a(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i10) {
            super.setClipRule((TextViewManager) view, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.U0
        @Z4.a(customType = "Color", name = "color")
        public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
            super.setColor((TextViewManager) view, num);
        }

        @Override // h5.U0
        @Z4.a(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((TextViewManager) view, str);
        }

        @Override // h5.U0
        @Z4.a(name = "dx")
        public /* bridge */ /* synthetic */ void setDx(View view, Dynamic dynamic) {
            super.setDx((TextViewManager) view, dynamic);
        }

        @Override // h5.U0
        @Z4.a(name = "dy")
        public /* bridge */ /* synthetic */ void setDy(View view, Dynamic dynamic) {
            super.setDy((TextViewManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.U0
        @Z4.a(name = "fill")
        public /* bridge */ /* synthetic */ void setFill(View view, Dynamic dynamic) {
            super.setFill((TextViewManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.U0
        @Z4.a(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f10) {
            super.setFillOpacity((TextViewManager) view, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.U0
        @Z4.a(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i10) {
            super.setFillRule((TextViewManager) view, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.U0
        @Z4.a(name = "filter")
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            super.setFilter((TextViewManager) view, str);
        }

        @Override // h5.U0
        @Z4.a(name = "font")
        public /* bridge */ /* synthetic */ void setFont(View view, Dynamic dynamic) {
            super.setFont((TextViewManager) view, dynamic);
        }

        @Override // h5.U0
        @Z4.a(name = "fontSize")
        public /* bridge */ /* synthetic */ void setFontSize(View view, Dynamic dynamic) {
            super.setFontSize((TextViewManager) view, dynamic);
        }

        @Override // h5.U0
        @Z4.a(name = "fontWeight")
        public /* bridge */ /* synthetic */ void setFontWeight(View view, Dynamic dynamic) {
            super.setFontWeight((TextViewManager) view, dynamic);
        }

        @Override // h5.U0
        @Z4.a(name = "inlineSize")
        public /* bridge */ /* synthetic */ void setInlineSize(View view, Dynamic dynamic) {
            super.setInlineSize((TextViewManager) view, dynamic);
        }

        @Override // h5.U0
        @Z4.a(name = "lengthAdjust")
        public /* bridge */ /* synthetic */ void setLengthAdjust(View view, String str) {
            super.setLengthAdjust((TextViewManager) view, str);
        }

        @Override // h5.U0
        @Z4.a(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((TextViewManager) view, str);
        }

        @Override // h5.U0
        @Z4.a(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((TextViewManager) view, str);
        }

        @Override // h5.U0
        @Z4.a(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((TextViewManager) view, str);
        }

        @Override // h5.U0
        @Z4.a(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((TextViewManager) view, str);
        }

        @Override // h5.U0
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((TextViewManager) view, readableArray);
        }

        @Override // h5.U0
        @Z4.a(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((TextViewManager) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.InterfaceC1945h
        @Z4.a(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f10) {
            super.setOpacity((TextViewManager) view, f10);
        }

        @Override // h5.U0
        @Z4.a(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((TextViewManager) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.U0
        @Z4.a(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(View view, ReadableArray readableArray) {
            super.setPropList((TextViewManager) view, readableArray);
        }

        @Override // h5.U0
        @Z4.a(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z10) {
            super.setResponsible((TextViewManager) view, z10);
        }

        @Override // h5.U0
        @Z4.a(name = "rotate")
        public /* bridge */ /* synthetic */ void setRotate(View view, Dynamic dynamic) {
            super.setRotate((TextViewManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.U0
        @Z4.a(name = "stroke")
        public /* bridge */ /* synthetic */ void setStroke(View view, Dynamic dynamic) {
            super.setStroke((TextViewManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.U0
        @Z4.a(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            super.setStrokeDasharray((TextViewManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.U0
        @Z4.a(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f10) {
            super.setStrokeDashoffset((TextViewManager) view, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.U0
        @Z4.a(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i10) {
            super.setStrokeLinecap((TextViewManager) view, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.U0
        @Z4.a(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i10) {
            super.setStrokeLinejoin((TextViewManager) view, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.U0
        @Z4.a(defaultFloat = 4.0f, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f10) {
            super.setStrokeMiterlimit((TextViewManager) view, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.U0
        @Z4.a(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f10) {
            super.setStrokeOpacity((TextViewManager) view, f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.U0
        @Z4.a(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            super.setStrokeWidth((TextViewManager) view, dynamic);
        }

        @Override // h5.U0
        @Z4.a(name = "textLength")
        public /* bridge */ /* synthetic */ void setTextLength(View view, Dynamic dynamic) {
            super.setTextLength((TextViewManager) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h5.U0
        @Z4.a(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i10) {
            super.setVectorEffect((TextViewManager) view, i10);
        }

        @Override // h5.U0
        @Z4.a(name = "verticalAlign")
        public /* bridge */ /* synthetic */ void setVerticalAlign(View view, Dynamic dynamic) {
            super.setVerticalAlign((TextViewManager) view, dynamic);
        }

        @Override // h5.U0
        @Z4.a(name = "x")
        public /* bridge */ /* synthetic */ void setX(View view, Dynamic dynamic) {
            super.setX((TextViewManager) view, dynamic);
        }

        @Override // h5.U0
        @Z4.a(name = "y")
        public /* bridge */ /* synthetic */ void setY(View view, Dynamic dynamic) {
            super.setY((TextViewManager) view, dynamic);
        }

        TextViewManager(VirtualViewManager.SVGClass sVGClass) {
            super(sVGClass);
            this.mDelegate = new T0(this);
        }
    }

    public void setFill(T t10, ReadableMap readableMap) {
        t10.setFill(readableMap);
    }

    public void setStroke(T t10, ReadableMap readableMap) {
        t10.setStroke(readableMap);
    }
}
